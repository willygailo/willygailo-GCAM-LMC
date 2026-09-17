package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class deu {
    private static final ouj a = ouj.h("com/google/android/apps/camera/contentprovider/TrustedPartners");
    private final Set b;
    private final PackageManager c;

    public deu(Context context, Set set) {
        this.c = context.getPackageManager();
        this.b = set;
    }

    public final boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            ((oug) ((oug) a.c()).G((char) 701)).o("null or empty package name; do not trust");
            return false;
        }
        try {
            PackageInfo packageInfo = this.c.getPackageInfo(str, 64);
            if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
                ((oug) ((oug) a.c()).G(698)).t("%d signatures found for package (%s); do not trust", packageInfo.signatures.length, str);
                return false;
            }
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                messageDigest.update(packageInfo.signatures[0].toByteArray());
                return this.b.contains(mdj.a(messageDigest.digest()));
            } catch (NoSuchAlgorithmException e) {
                ((oug) ((oug) a.b()).G((char) 699)).r("unable to compute hash using %s; do not trust", "SHA1");
                return false;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            ((oug) ((oug) a.c()).G((char) 700)).r("package not found (%s); do not trust", str);
            return false;
        }
    }
}
