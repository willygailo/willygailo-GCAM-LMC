#!/usr/bin/env python3
"""
GCAM LMC 8.5 Automated Build & Re-packaging Pipeline
Author / Maintainer: Willy Gailo (@willygailo)
"""

import os
import sys
import shutil
import zipfile
import subprocess

BASE_DIR = os.path.dirname(os.path.abspath(__file__))
APKTOOL_DIR = os.path.join(BASE_DIR, "base_apktool")
BASE_RAW_DIR = os.path.join(BASE_DIR, "base_raw")
BUILD_DEX_DIR = os.path.join(APKTOOL_DIR, "build", "apk")

TARGET_APK = os.path.join(BASE_DIR, "base.apk")
UNALIGNED_APK = os.path.join(BASE_DIR, "base_unaligned.tmp.apk")
ALIGNED_APK = os.path.join(BASE_DIR, "base_aligned.tmp.apk")
SIGNED_APK = os.path.join(BASE_DIR, "base_signed.tmp.apk")
KEYSTORE = os.path.join(BASE_DIR, "release.keystore")
KEYSTORE_PASS = "password"
KEY_ALIAS = "gcam"

def run_cmd(cmd, desc):
    print(f"[*] {desc}...")
    res = subprocess.run(cmd, shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True)
    if res.returncode != 0:
        print(f"[!] Error during: {desc}")
        print(res.stderr)
        sys.exit(1)
    return res.stdout

def compile_smali():
    print("[*] Compiling smali trees to DEX...")
    os.makedirs(BUILD_DEX_DIR, exist_ok=True)
    
    smali_mappings = [
        ("smali", "classes.dex"),
        ("smali_classes2", "classes2.dex"),
        ("smali_classes3", "classes3.dex"),
    ]
    
    for smali_dir, dex_name in smali_mappings:
        src_path = os.path.join(APKTOOL_DIR, smali_dir)
        out_dex = os.path.join(BUILD_DEX_DIR, dex_name)
        if os.path.exists(src_path):
            run_cmd(f'smali a "{src_path}" -o "{out_dex}"', f"Compiling {smali_dir} -> {dex_name}")

def package_apk():
    print("[*] Injecting DEX and patched resources into unaligned APK...")
    replacements = {
        'classes.dex': os.path.join(BUILD_DEX_DIR, 'classes.dex'),
        'classes2.dex': os.path.join(BUILD_DEX_DIR, 'classes2.dex'),
        'classes3.dex': os.path.join(BUILD_DEX_DIR, 'classes3.dex'),
        'res/xml/camera_preferences.xml': os.path.join(BASE_RAW_DIR, 'res', 'xml', 'camera_preferences.xml.patched'),
        'resources.arsc': os.path.join(BASE_RAW_DIR, 'resources.arsc.patched')
    }
    
    with zipfile.ZipFile(TARGET_APK, 'r') as zin, zipfile.ZipFile(UNALIGNED_APK, 'w') as zout:
        for item in zin.infolist():
            # Drop old signatures
            if item.filename.startswith('META-INF/') and (item.filename.endswith('.SF') or item.filename.endswith('.RSA') or item.filename.endswith('.MF')):
                continue
            
            if item.filename in replacements:
                rep_path = replacements[item.filename]
                with open(rep_path, 'rb') as f:
                    data = f.read()
                compress_type = zipfile.ZIP_STORED if item.filename == 'resources.arsc' else zipfile.ZIP_DEFLATED
                zout.writestr(item.filename, data, compress_type=compress_type)
            else:
                data = zin.read(item.filename)
                zout.writestr(item, data)

def align_and_sign():
    run_cmd(f'zipalign -p -f -v 4 "{UNALIGNED_APK}" "{ALIGNED_APK}"', "Aligning APK to 4-byte boundaries")
    run_cmd(
        f'apksigner sign --ks "{KEYSTORE}" --ks-key-alias {KEY_ALIAS} --ks-pass pass:{KEYSTORE_PASS} '
        f'--v1-signing-enabled true --v2-signing-enabled true --v3-signing-enabled true '
        f'--out "{SIGNED_APK}" "{ALIGNED_APK}"',
        "Signing APK with release.keystore"
    )
    verify_output = run_cmd(f'apksigner verify --verbose "{SIGNED_APK}"', "Verifying signature")
    print(verify_output)
    
    # Replace production base.apk
    shutil.copy2(SIGNED_APK, TARGET_APK)
    
    release_gcam = os.path.join(BASE_DIR, "GCam_8.5.apk")
    release_lmc = os.path.join(BASE_DIR, "LMC8.5.apk")
    shutil.copy2(SIGNED_APK, release_gcam)
    shutil.copy2(SIGNED_APK, release_lmc)
    
    print(f"[+] Successfully built and signed {TARGET_APK}")
    print(f"[+] Release APK ready: {release_gcam}")
    print(f"[+] Release APK ready: {release_lmc}")

def cleanup():
    for f in [UNALIGNED_APK, ALIGNED_APK, SIGNED_APK]:
        if os.path.exists(f):
            os.remove(f)

if __name__ == "__main__":
    try:
        compile_smali()
        package_apk()
        align_and_sign()
    finally:
        cleanup()
