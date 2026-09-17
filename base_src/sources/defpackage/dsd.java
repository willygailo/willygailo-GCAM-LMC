package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.filmstrip.transition.FilmstripTransitionLayout;
import com.google.googlex.gcam.Gcam;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class dsd implements pys {
    private final qkg a;
    private final /* synthetic */ int b;

    public dsd(qkg qkgVar, int i) {
        this.b = i;
        this.a = qkgVar;
    }

    public static dsd a(qkg qkgVar) {
        return new dsd(qkgVar, 8);
    }

    public static dsd b(qkg qkgVar) {
        return new dsd(qkgVar, 10);
    }

    public static dsd c(qkg qkgVar) {
        return new dsd(qkgVar, 12);
    }

    public static dsd d(qkg qkgVar) {
        return new dsd(qkgVar, 13);
    }

    public static dsd e(qkg qkgVar) {
        return new dsd(qkgVar, 17);
    }

    public static dsd f(qkg qkgVar) {
        return new dsd(qkgVar, 20);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                dte dteVarH = enl.H((dqw) this.a.get());
                dteVarH.a = 1;
                dteVarH.c(5L, TimeUnit.MINUTES);
                dteVarH.b();
                return dteVarH.a();
            case 1:
                dte dteVarH2 = enl.H((dqw) this.a.get());
                dteVarH2.a = 1;
                dteVarH2.c(5L, TimeUnit.MINUTES);
                dteVarH2.b();
                return dteVarH2.a();
            case 2:
                dqw dqwVar = (dqw) this.a.get();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (!Pattern.matches("feature\\.[a-z0-9\\-]+\\.[a-z0-9\\-]+\\.[a-z0-9\\-]+(:\\d+)?", "feature.acmi.camera.motion-sharpness")) {
                    throw new IllegalArgumentException("Feature with bad type name 'feature.acmi.camera.motion-sharpness'!");
                }
                arrayList.add(dqwVar);
                return enl.J("feature.acmi.camera.motion-sharpness", arrayList, arrayList2);
            case 3:
                dte dteVarH3 = enl.H((dqw) this.a.get());
                dteVarH3.c(5L, TimeUnit.MINUTES);
                dteVarH3.b = 30;
                dteVarH3.a = 3;
                dteVarH3.c = 5;
                dteVarH3.b();
                return dteVarH3.a();
            case 4:
                dte dteVarH4 = enl.H((dqw) this.a.get());
                dteVarH4.c(5L, TimeUnit.MINUTES);
                dteVarH4.b = 30;
                dteVarH4.a = 1;
                dteVarH4.c = 5;
                dteVarH4.b();
                return dteVarH4.a();
            case 5:
                dqw dqwVar2 = (dqw) this.a.get();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (!Pattern.matches("feature\\.[a-z0-9\\-]+\\.[a-z0-9\\-]+\\.[a-z0-9\\-]+(:\\d+)?", "feature.acmi.imu.frame-straightness")) {
                    throw new IllegalArgumentException("Feature with bad type name 'feature.acmi.imu.frame-straightness'!");
                }
                arrayList3.add(dqwVar2);
                return enl.J("feature.acmi.imu.frame-straightness", arrayList3, arrayList4);
            case 6:
                dte dteVarH5 = enl.H((dqw) this.a.get());
                dteVarH5.c(5L, TimeUnit.MINUTES);
                dteVarH5.b = 50;
                dteVarH5.a = 3;
                dteVarH5.c = 5;
                dteVarH5.b();
                return dteVarH5.a();
            case 7:
                return (FilmstripTransitionLayout) ((jnx) this.a).get().c(R.id.filmstrip_transition_layout);
            case 8:
                return new dvp(null);
            case 9:
                return new dvy(((gvt) this.a).get(), null);
            case 10:
                return new dwi((dwh) this.a.get(), TimeUnit.NANOSECONDS.convert(500L, TimeUnit.MICROSECONDS));
            case 11:
                return new jtx((ddf) this.a.get(), null, null);
            case 12:
                final enr enrVar = (enr) this.a.get();
                enrVar.getClass();
                return new dys() { // from class: dyn
                    @Override // defpackage.dys
                    public final void a(long j, float f, float f2) {
                        enrVar.c(j, f, f2);
                    }
                };
            case 13:
                final enr enrVar2 = (enr) this.a.get();
                enrVar2.getClass();
                return ope.H(new gnl() { // from class: dyo
                    @Override // defpackage.gnl, java.lang.Runnable
                    public final void run() {
                        enrVar2.close();
                    }
                });
            case 14:
                return new dzd((ddf) this.a.get());
            case 15:
                return new dze((ead) this.a.get());
            case 16:
                return new dzy((ddf) this.a.get());
            case 17:
                lap lapVar = (lap) this.a.get();
                HandlerThread handlerThread = new HandlerThread("lastPslFrame");
                handlerThread.start();
                Handler handlerBV = mip.bV(handlerThread.getLooper());
                final Looper looper = handlerBV.getLooper();
                looper.getClass();
                lapVar.c(new lie() { // from class: eap
                    @Override // defpackage.lie, java.lang.AutoCloseable
                    public final void close() {
                        looper.quitSafely();
                    }
                });
                return handlerBV;
            case 18:
                eca ecaVar = (eca) enl.a(this.a);
                qmd.ae(ecaVar);
                return ecaVar;
            case 19:
                Gcam gcam = (Gcam) enl.a(this.a);
                qmd.ae(gcam);
                return gcam;
            default:
                return lnb.a((ecd) this.a.get());
        }
    }
}
