package defpackage;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.SystemClock;
import android.os.UserManager;
import com.google.android.GoogleCameraEngR18F1.R;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class hwm {
    public final huf a;
    public final hug b;
    public final long c;
    private final UserManager d;
    private final ddf e;
    private final lzh f;
    private final hwp g;
    private final qkg h;

    public hwm(UserManager userManager, ddf ddfVar, lzh lzhVar, huf hufVar, hug hugVar, hwp hwpVar, qkg qkgVar, PackageInfo packageInfo) {
        this.d = userManager;
        this.e = ddfVar;
        this.f = lzhVar;
        this.a = hufVar;
        this.b = hugVar;
        this.g = hwpVar;
        this.h = qkgVar;
        this.c = packageInfo.getLongVersionCode();
    }

    public final void a() {
        int i = this.g.b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
            case 3:
                final hwh hwhVar = (hwh) this.h.get();
                if (hwhVar.d == null) {
                    ((oug) ((oug) hwh.a.c()).G((char) 2678)).o("Not eligible for HAL update.");
                    return;
                }
                if (((Integer) hwhVar.n.c(htu.U)).intValue() > pyz.b()) {
                    ((oug) ((oug) hwh.a.c()).G(2677)).q("Attempted HAL update for more than %d times. Skipping update.", pyz.b());
                    return;
                }
                final String str = hwhVar.d;
                str.getClass();
                hwhVar.k.a(2);
                plk.af(plk.Z(new Callable() { // from class: hwe
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ljf ljfVar;
                        long j;
                        int i3;
                        hwh hwhVar2 = hwhVar;
                        String str2 = str;
                        hwhVar2.r.e("SidelineInstaller#shouldStartUpdate");
                        long jB = hwv.b(hwhVar2.b);
                        boolean z = false;
                        if (jB == -1) {
                            hwhVar2.r.f();
                        } else {
                            hwhVar2.m.b = jB;
                            SystemClock.uptimeMillis();
                            try {
                                try {
                                    InputStream inputStreamOpen = hwhVar2.b.getAssets().open(str2);
                                    try {
                                        ZipInputStream zipInputStream = new ZipInputStream(hwh.d(inputStreamOpen));
                                        while (true) {
                                            try {
                                                ZipEntry nextEntry = zipInputStream.getNextEntry();
                                                if (nextEntry == null) {
                                                    ((oug) ((oug) hwr.a.c()).G(2715)).o("Apex manifest file not found.");
                                                    j = -1;
                                                    break;
                                                }
                                                String name = nextEntry.getName();
                                                if (name.contains("..")) {
                                                    for (File file = new File(name); file != null; file = file.getParentFile()) {
                                                        if (file.getName().equals("..")) {
                                                            String strValueOf = String.valueOf(name);
                                                            throw new ZipException(strValueOf.length() != 0 ? "Illegal name: ".concat(strValueOf) : new String("Illegal name: "));
                                                        }
                                                    }
                                                }
                                                if ("apex_manifest.pb".equals(name)) {
                                                    j = ((hvs) ppd.q(hvs.b, zipInputStream, pos.b())).a;
                                                    break;
                                                }
                                            } catch (IOException e) {
                                                ((oug) ((oug) ((oug) hwr.a.b()).h(e)).G((char) 2716)).o("Failed to parse version code from apex file.");
                                                j = -1;
                                            }
                                        }
                                        hwhVar2.t = j;
                                        if (j != -1) {
                                            hwhVar2.m.c = j;
                                            SystemClock.uptimeMillis();
                                            if (hwhVar2.t > jB) {
                                                String str3 = Build.VERSION.INCREMENTAL;
                                                try {
                                                    i3 = Integer.parseInt(str3);
                                                } catch (NumberFormatException e2) {
                                                    ((oug) ((oug) ((oug) hwr.a.b()).h(e2)).G((char) 2714)).r("VERSION.INCREMENTAL is not an integer (%s). Return -1.", str3);
                                                    i3 = -1;
                                                }
                                                if (i3 == -1 || !Build.ID.startsWith("SD1")) {
                                                    ((oug) ((oug) hwh.a.c()).G(2696)).r("Sideline is not compatible with OS build: %s. Skipping", Build.ID);
                                                    hwhVar2.m.b(-2, 5);
                                                    if (inputStreamOpen != null) {
                                                        inputStreamOpen.close();
                                                    }
                                                } else {
                                                    int integer = hwhVar2.b.getResources().getInteger(R.integer.apex_minimum_os_version_incremental);
                                                    if (i3 < integer) {
                                                        ((oug) ((oug) hwh.a.c()).G(2699)).s("Current OS version (%d) is smaller than minimum OS version required (%d). Skipping.", i3, integer);
                                                        hwhVar2.m.b(-3, 6);
                                                        if (inputStreamOpen != null) {
                                                            inputStreamOpen.close();
                                                        }
                                                    } else {
                                                        if (inputStreamOpen != null) {
                                                            inputStreamOpen.close();
                                                        }
                                                        hwhVar2.r.f();
                                                        z = true;
                                                    }
                                                }
                                            } else if (inputStreamOpen != null) {
                                                inputStreamOpen.close();
                                            }
                                        } else if (inputStreamOpen != null) {
                                            inputStreamOpen.close();
                                        }
                                        ljfVar = hwhVar2.r;
                                    } catch (Throwable th) {
                                        if (inputStreamOpen != null) {
                                            try {
                                                inputStreamOpen.close();
                                            } catch (Throwable th2) {
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (IOException e3) {
                                    ((oug) ((oug) hwh.a.c()).G(2697)).r("Apex asset file not found: %s", str2);
                                    ljfVar = hwhVar2.r;
                                }
                                ljfVar.f();
                            } catch (Throwable th3) {
                                hwhVar2.r.f();
                                throw th3;
                            }
                        }
                        return Boolean.valueOf(z);
                    }
                }, hwhVar.e), new hwf(hwhVar, 1), hwhVar.h);
                return;
            default:
                return;
        }
    }

    public final boolean b() {
        return this.f.h && this.d.isSystemUser() && this.e.k(ddl.bt) && !pyz.a.a().b();
    }
}
