package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import j$.util.Optional;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class fnj {
    public final jlb a;
    public final kas b;
    public final jas c;
    public final jfn d;
    public final ScheduledExecutorService e;
    public final BottomBarController g;
    public final gtg h;
    public final jje i;
    public final gvb j;
    public final lar k;
    public final fno l;
    public final boolean r;
    public final iud t;
    public final dah u;
    public final jrh v;
    private final ifn w;
    private final fpi x;
    private final ddf y;
    private final fjs z;
    public lap m = new lap();
    public volatile ScheduledFuture n = null;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;
    public final AtomicReference s = new AtomicReference();
    public final Handler f = mip.bV(Looper.getMainLooper());

    public fnj(ddf ddfVar, gtg gtgVar, BottomBarController bottomBarController, jlb jlbVar, final jrh jrhVar, kas kasVar, jas jasVar, final AtomicBoolean atomicBoolean, jfn jfnVar, ScheduledExecutorService scheduledExecutorService, ifn ifnVar, jje jjeVar, final gvb gvbVar, final fpi fpiVar, fno fnoVar, lar larVar, dah dahVar, fjs fjsVar, iud iudVar) {
        boolean z = false;
        this.h = gtgVar;
        this.g = bottomBarController;
        this.a = jlbVar;
        this.c = jasVar;
        this.d = jfnVar;
        this.e = scheduledExecutorService;
        this.w = ifnVar;
        this.i = jjeVar;
        this.j = gvbVar;
        this.x = fpiVar;
        this.b = kasVar;
        this.l = fnoVar;
        this.v = jrhVar;
        this.k = larVar;
        this.z = fjsVar;
        this.u = dahVar;
        this.t = iudVar;
        this.y = ddfVar;
        final boolean zK = ddfVar.k(ddr.m);
        boolean zK2 = ddfVar.k(ddr.o);
        this.r = zK2;
        if (zK || zK2) {
            z = true;
        }
        jlbVar.B(z);
        jlbVar.C(new jka() { // from class: fng
            @Override // defpackage.jka
            public final void a(MotionEvent motionEvent, MotionEvent motionEvent2, Rect rect, boolean z2) {
                fnj fnjVar = this.a;
                gvb gvbVar2 = gvbVar;
                jrh jrhVar2 = jrhVar;
                boolean z3 = zK;
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                fpi fpiVar2 = fpiVar;
                if (fnjVar.s.get() == null) {
                    fnjVar.s.set(new PointF(motionEvent2.getRawX(), motionEvent2.getRawY()));
                }
                PointF pointF = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
                lic licVarF = gvbVar2.f();
                PointF pointF2 = (PointF) fnjVar.s.get();
                float f = pointF2.x;
                float f2 = pointF2.y;
                float f3 = pointF.x;
                float f4 = pointF.y;
                if (licVarF == lic.CLOCKWISE_0 || licVarF == lic.CLOCKWISE_180) {
                    f = pointF2.y;
                    f2 = pointF2.x;
                    f3 = pointF.y;
                    f4 = pointF.x;
                }
                double dAbs = Math.abs(Math.toDegrees(Math.atan2(f4 - f2, f3 - f)));
                if (dAbs >= 90.0d) {
                    dAbs = 180.0d - dAbs;
                }
                fnjVar.s.set(pointF);
                if (dAbs < 75.0d) {
                    if (!z3 || atomicBoolean2.get()) {
                        return;
                    }
                    fpiVar2.a(motionEvent, motionEvent2, rect, z2);
                    return;
                }
                if (fnjVar.r) {
                    jrhVar2.i = z2;
                    if (jrhVar2.e == null) {
                        jrhVar2.e = motionEvent;
                        jrhVar2.f = jrhVar2.e.getX();
                        jrhVar2.g = jrhVar2.e.getY();
                        return;
                    }
                    float x = motionEvent.getX() - jrhVar2.f;
                    float y = motionEvent.getY() - jrhVar2.g;
                    jrz jrzVar = jrz.PORTRAIT;
                    switch (jrhVar2.a.g.ordinal()) {
                        case 1:
                            jrhVar2.b.setTranslationX(-jrh.c(y, 0.0f, Math.abs(jrhVar2.j)));
                            jrhVar2.a.b();
                            break;
                        case 2:
                            jrhVar2.b.setTranslationX(jrh.c(y, jrhVar2.j, 0.0f));
                            jrhVar2.a.b();
                            break;
                        default:
                            jrhVar2.b.setTranslationX(jrh.c(x, jrhVar2.j, 0.0f));
                            jrhVar2.a.b();
                            break;
                    }
                    jrhVar2.b(false);
                }
            }
        });
    }

    public final void a() {
        this.m.close();
        this.m = new lap();
        if (this.p) {
            if (this.r) {
                this.v.a();
                jrh jrhVar = this.v;
                jrhVar.c.setImageDrawable(jrhVar.d.getDrawable(R.drawable.ic_lock_24dp, null));
                jrhVar.h = false;
            }
            if (!this.o) {
                this.q = true;
                return;
            }
            if (this.n != null) {
                this.n.cancel(false);
                this.n = null;
            }
            fpi fpiVar = this.x;
            fpiVar.b();
            if (fpiVar.c.isPresent()) {
                fpiVar.a.fB((Float) fpiVar.c.get());
            }
            fpiVar.d = 0.0f;
            fpiVar.e = 0.0f;
            fpiVar.c = Optional.empty();
            fpiVar.b.c();
            fpiVar.f = 0.0f;
            this.c.a(true);
            this.t.d(false);
            if (this.r && this.v.h) {
                this.z.aj(3, System.currentTimeMillis());
                this.a.af();
            } else {
                this.a.ae();
            }
            this.b.i(false);
            lie lieVar = (lie) this.l.a.poll();
            lieVar.getClass();
            lieVar.close();
            this.g.stopLongShot();
            this.h.j();
            if (!this.t.f() && !this.y.k(ddl.br)) {
                this.t.g(true);
            }
            this.d.v(true);
            this.u.b(true);
            this.i.f();
            this.w.b(R.raw.video_stop);
            this.j.b(fnj.class);
            this.o = false;
            this.q = false;
            this.p = false;
        }
    }
}
