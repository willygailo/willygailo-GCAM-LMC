package defpackage;

import android.os.SystemClock;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class hzi implements hxi {
    public static final ouj a = ouj.h("com/google/android/apps/camera/smarts/SmartsFrameProvider");
    public static final hzh b = new hzg();
    public final hxj c;
    public final Executor d;
    public int f;
    public final Object e = new Object();
    private lwd h = lwd.BACK;
    public hzh g = b;

    public hzi(hxj hxjVar, Executor executor) {
        this.c = hxjVar;
        this.d = executor;
    }

    @Override // defpackage.hxi
    public final void e(lvp lvpVar) {
        this.h = lvpVar.k();
        this.g.j();
    }

    @Override // defpackage.hxi
    public final void f(lzv lzvVar) {
        this.g.l();
    }

    @Override // defpackage.hxi
    public final void g(lrr lrrVar, final lnx lnxVar) {
        if (this.h.equals(lwd.BACK)) {
            mip.bj(lrrVar, new lnn() { // from class: hzd
                @Override // defpackage.lnn
                public final void a(lmr lmrVar) {
                    final hzi hziVar = this.a;
                    final mad madVarD = lmrVar.d(lnxVar);
                    if (madVarD != null) {
                        hziVar.d.execute(new Runnable() { // from class: hzf
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i;
                                int i2;
                                hzi hziVar2 = hziVar;
                                mad madVar = madVarD;
                                synchronized (hziVar2.e) {
                                    i = hziVar2.f;
                                }
                                if (i >= 3) {
                                    madVar.close();
                                    return;
                                }
                                synchronized (hziVar2.e) {
                                    i2 = 1;
                                    hziVar2.f++;
                                }
                                lwk lwkVar = new lwk(new hwy(madVar, new hze(hziVar2, i2)));
                                mad madVarK = lwkVar.k();
                                if (madVarK != null) {
                                    hzh hzhVar = hziVar2.g;
                                    SystemClock.elapsedRealtime();
                                    hzhVar.k(madVarK);
                                } else {
                                    ((oug) ((oug) hzi.a.b()).G((char) 2733)).o("Unable to fork ref counted image");
                                }
                                lwkVar.l();
                            }
                        });
                    }
                    lmrVar.close();
                }
            });
        }
    }
}
