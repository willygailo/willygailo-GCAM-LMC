package defpackage;

import android.app.Activity;
import android.app.KeyguardManager;
import android.graphics.Bitmap;
import android.graphics.PointF;
import com.google.lens.sdk.LensApi;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class jcw {
    public static final ouj a = ouj.h("com/google/android/apps/camera/ui/lens/LensUtil");
    public final Activity b;
    public final lar c;
    public volatile pih d;
    public volatile pih e;
    public final hnx f;
    public pms g;
    private final ddf h;
    private final ojz i;
    private boolean j;

    public jcw(Activity activity, lar larVar, Executor executor, ddf ddfVar, hnx hnxVar, ojz ojzVar) {
        this.b = activity;
        this.c = larVar;
        this.h = ddfVar;
        this.f = hnxVar;
        final ojz ojzVarAu = obr.au(ojzVar);
        this.i = ojzVarAu;
        this.j = false;
        ojzVarAu.getClass();
        executor.execute(new Runnable() { // from class: jcl
            @Override // java.lang.Runnable
            public final void run() {
                ojzVarAu.a();
            }
        });
    }

    public final pht a() {
        if (!this.h.k(ddl.ai)) {
            return plk.V(false);
        }
        f();
        return this.d;
    }

    public final pht b() {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        pms pmsVar = this.g;
        final Bitmap bitmap = pmsVar == null ? null : pmsVar.b;
        if (bitmap == null) {
            return c(new jcr(this, 0));
        }
        PointF pointF = pmsVar.g;
        pmh pmhVar = pmsVar.d;
        Integer num = pmsVar.f;
        e();
        final pmr pmrVarB = pms.b();
        pmrVarB.e = 1;
        if (pointF != null) {
            pmrVarB.g = pointF;
        }
        if (pmhVar != null) {
            pmrVarB.d = pmhVar;
        }
        if (num != null) {
            pmrVarB.f = num;
        }
        d().onResume();
        return vj.b(new xt() { // from class: jci
            @Override // defpackage.xt
            public final Object a(final xr xrVar) {
                final jcw jcwVar = this.a;
                final Bitmap bitmap2 = bitmap;
                final pmr pmrVar = pmrVarB;
                final long j = jCurrentTimeMillis;
                jcwVar.d().checkPostCaptureAvailability(new LensApi.LensAvailabilityCallback() { // from class: jcp
                    @Override // com.google.lens.sdk.LensApi.LensAvailabilityCallback
                    public final void onAvailabilityStatusFetched(int i) {
                        final jcw jcwVar2 = jcwVar;
                        final Bitmap bitmap3 = bitmap2;
                        final pmr pmrVar2 = pmrVar;
                        xr xrVar2 = xrVar;
                        if (i == 0) {
                            plk.af(jcwVar2.c(new Runnable() { // from class: jcs
                                @Override // java.lang.Runnable
                                public final void run() {
                                    jcw jcwVar3 = jcwVar2;
                                    final Bitmap bitmap4 = bitmap3;
                                    pmr pmrVar3 = pmrVar2;
                                    final LensApi lensApiD = jcwVar3.d();
                                    Activity activity = jcwVar3.b;
                                    final pms pmsVarA = pmrVar3.a();
                                    if (lensApiD.c.isKeyguardLocked()) {
                                        lensApiD.c(activity, null, new Runnable() { // from class: pmo
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                lensApiD.b(bitmap4, pmsVarA);
                                            }
                                        });
                                    } else {
                                        lensApiD.b(bitmap4, pmsVarA);
                                    }
                                    System.currentTimeMillis();
                                    jcwVar3.d().onPause();
                                }
                            }), new jcu(xrVar2), pgr.INSTANCE);
                        } else {
                            jcwVar2.d().onPause();
                        }
                    }
                });
                return "LensApi#checkPostCaptureAvailability for launchLensWithBitmap";
            }
        });
    }

    public final pht c(final Runnable runnable) {
        final pih pihVarF = pih.f();
        this.c.execute(new Runnable() { // from class: jcj
            @Override // java.lang.Runnable
            public final void run() {
                jcw jcwVar = this.a;
                Runnable runnable2 = runnable;
                pih pihVar = pihVarF;
                if (((KeyguardManager) jcwVar.b.getSystemService("keyguard")).isKeyguardLocked()) {
                    jcwVar.f.b(jcwVar.b, new jcv(runnable2, pihVar));
                } else {
                    runnable2.run();
                    pihVar.o(true);
                }
            }
        });
        return pihVarF;
    }

    public final LensApi d() {
        return (LensApi) this.i.a();
    }

    public final void e() {
        this.g = null;
    }

    public final void f() {
        synchronized (this) {
            if (this.j) {
                return;
            }
            this.d = pih.f();
            this.e = pih.f();
            int i = 1;
            this.j = true;
            this.c.c(new jcr(this, i));
        }
    }
}
