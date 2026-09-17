package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.libraries.performance.primes.metrics.crash.NativeCrashHandlerImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class mvl implements pys {
    private final qkg a;
    private final /* synthetic */ int b;

    public mvl(qkg qkgVar, int i) {
        this.b = i;
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                return pzx.a.a().a(((emp) this.a).a());
            case 1:
                return pzo.a.a().c(((emp) this.a).a());
            case 2:
                return Boolean.valueOf(qad.a.a().c(((emp) this.a).a()));
            case 3:
                return Boolean.valueOf(qaa.a.a().a(((emp) this.a).a()));
            case 4:
                return Boolean.valueOf(qap.a.a().c(((emp) this.a).a()));
            case 5:
                return Long.valueOf(qap.a.a().a(((emp) this.a).a()));
            case 6:
                return qad.a.a().a(((emp) this.a).a());
            case 7:
                return qad.a.a().b(((emp) this.a).a());
            case 8:
                return qag.a.a().a(((emp) this.a).a());
            case 9:
                return qam.a.a().a(((emp) this.a).a());
            case 10:
                return Boolean.valueOf(qad.a.a().d(((emp) this.a).a()));
            case 11:
                return qap.a.a().b(((emp) this.a).a());
            case 12:
                return qas.a.a().a(((emp) this.a).a());
            case 13:
                return qav.a.a().a(((emp) this.a).a());
            case 14:
                return qay.a.a().a(((emp) this.a).a());
            case 15:
                return new mwf((oxk) this.a.get(), null, null);
            case 16:
                return new mwg((mwf) this.a.get());
            case 17:
                return new mxi(pyr.a(this.a));
            case 18:
                Context contextA = ((emp) this.a).a();
                PackageManager packageManager = contextA.getPackageManager();
                String packageName = contextA.getPackageName();
                try {
                    return packageManager.getPackageInfo(packageName, 0).versionName;
                } catch (PackageManager.NameNotFoundException e) {
                    ((oug) ((oug) ((oug) mxr.a.c()).h(e)).G((char) 3614)).r("Failed to get PackageInfo for: %s", packageName);
                    return null;
                }
            case 19:
                return new mxt((oke) this.a.get());
            default:
                return new NativeCrashHandlerImpl((ojc) ((pyt) this.a).a);
        }
    }
}
