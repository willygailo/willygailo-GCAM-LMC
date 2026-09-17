package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class iqj {
    public final qkg A;
    public final jxo B;
    public final iud C;
    public FrameLayout D;
    public ViewGroup E;
    public jgu F;
    public ObjectAnimator G;
    public ctx H;
    public cmq I;
    public ScheduledFuture J;
    public TextView K;
    public iqn L;
    public isa M;
    public View N;
    public View O;
    public ViewGroup P;
    public ViewGroup Q;
    public ViewGroup R;
    public int S;
    public final jjp T;
    private final lzi U;
    private jgu V;
    public final BottomBarController c;
    public final cvo e;
    public final jns f;
    public final Context g;
    public final jak h;
    public final iro i;
    public final jas j;
    public final ddf k;
    public final lap l;
    public final lar m;
    public final elw n;
    public final jwz o;
    public final ojc p;
    public final ojc q;
    public final gtg r;
    public final ScheduledExecutorService s;
    public final jlb t;
    public final jli u;
    public final irz v;
    public final epj w;
    public final epi x;
    public final btt y;
    public final lda z;
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicLong b = new AtomicLong(0);
    public final BottomBarListener d = new iqe(this);

    public iqj(iuf iufVar, BottomBarController bottomBarController, cvo cvoVar, jns jnsVar, Context context, lzi lziVar, jak jakVar, iro iroVar, final jas jasVar, ddf ddfVar, lap lapVar, lda ldaVar, lar larVar, elw elwVar, jwz jwzVar, ScheduledExecutorService scheduledExecutorService, jlb jlbVar, irz irzVar, epj epjVar, kas kasVar, jjp jjpVar, btt bttVar, ojc ojcVar, ojc ojcVar2, qkg qkgVar, jxo jxoVar, gtg gtgVar, iud iudVar) {
        this.c = bottomBarController;
        this.e = cvoVar;
        this.f = jnsVar;
        this.g = context;
        this.U = lziVar;
        this.i = iroVar;
        this.j = jasVar;
        this.k = ddfVar;
        this.m = larVar;
        this.n = elwVar;
        this.o = jwzVar;
        this.s = scheduledExecutorService;
        this.t = jlbVar;
        this.v = irzVar;
        this.l = lapVar;
        this.w = epjVar;
        this.T = jjpVar;
        this.y = bttVar;
        this.p = ojcVar;
        this.q = ojcVar2;
        this.A = qkgVar;
        this.z = ldaVar;
        this.h = jakVar;
        this.B = jxoVar;
        this.r = gtgVar;
        this.C = iudVar;
        this.u = new iqf(this, iufVar);
        this.x = new iqg(this, kasVar);
        if (ddfVar.k(dcu.J)) {
            this.H = new ctx() { // from class: iqc
                @Override // defpackage.ctx
                public final void a(int i) {
                    iqj iqjVar = this.a;
                    jas jasVar2 = jasVar;
                    if (iqjVar.M != null) {
                        iqjVar.M.b(iqm.values()[i]);
                        if (iqjVar.a.get()) {
                            jasVar2.e();
                        }
                    }
                }
            };
        }
    }

    final void a() {
        this.t.H(false);
        if (this.k.k(dcu.J)) {
            return;
        }
        this.v.c();
    }

    final void b() {
        irr irrVar;
        this.t.H(true);
        if (this.k.k(dcu.J) || (irrVar = this.v.o) == null) {
            return;
        }
        irrVar.setEnabled(true);
    }

    public final void c(final boolean z) {
        ScheduledFuture scheduledFuture = this.J;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.J = null;
        }
        this.m.c(new Runnable() { // from class: iqa
            @Override // java.lang.Runnable
            public final void run() {
                iqj iqjVar = this.a;
                boolean z2 = z;
                jgu jguVar = iqjVar.F;
                if (jguVar != null) {
                    iqjVar.n.g(jguVar);
                }
                View view = iqjVar.N;
                if (view != null) {
                    view.setVisibility(8);
                    iqjVar.N.setAlpha(0.0f);
                }
                FrameLayout frameLayout = iqjVar.D;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                    iqjVar.D.setAlpha(0.0f);
                }
                View view2 = iqjVar.O;
                if (view2 != null) {
                    view2.setVisibility(8);
                    iqjVar.O.setAlpha(0.0f);
                }
                if (!iqjVar.k.k(dcu.J)) {
                    irj irjVar = iqjVar.i.f;
                    irjVar.setBackground(irjVar.b.getDrawable(R.drawable.bg_frame_based_timer, null));
                    irr irrVar = iqjVar.v.o;
                    if (irrVar != null) {
                        irrVar.setBackground(irrVar.a.getResources().getDrawable(R.drawable.bg_speed_up_seekbar, null));
                    }
                }
                ObjectAnimator objectAnimator = iqjVar.G;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                if (z2) {
                    iqjVar.o.e();
                    if (iqjVar.R.indexOfChild(iqjVar.N) != -1) {
                        iqjVar.R.removeView(iqjVar.N);
                    }
                    if (iqjVar.P.indexOfChild(iqjVar.D) != -1) {
                        iqjVar.P.removeView(iqjVar.D);
                    }
                    if (iqjVar.Q.indexOfChild(iqjVar.O) != -1) {
                        iqjVar.Q.removeView(iqjVar.O);
                    }
                }
            }
        });
    }

    final void d() {
        this.c.setSnapshotButtonClickEnabled(true);
    }

    final void e() {
        c(false);
        if (h()) {
            ddf ddfVar = this.k;
            ddg ddgVar = deg.a;
            ddfVar.b();
            this.J = this.s.schedule(new ipy(this, 1), 60000L, TimeUnit.MILLISECONDS);
        }
    }

    final void f(boolean z) {
        if (this.k.k(deg.g)) {
            if (this.V == null) {
                jgv jgvVar = new jgv();
                jgvVar.i = 2;
                jgvVar.a = true;
                jgvVar.f = this.g;
                jgvVar.e = this.g.getResources().getString(R.string.notification_static_recording_af_locked);
                jgvVar.h = this.k.k(ddl.ay);
                this.V = jgvVar.a();
            }
            if (z && h() && (this.e.i() || this.U.d())) {
                this.n.d(this.V);
            } else {
                this.n.g(this.V);
            }
        }
    }

    final void g() {
        this.a.set(true);
        this.C.d(true);
        e();
        if (!this.k.k(dcu.J)) {
            this.v.a.set(false);
            this.T.b();
        } else if (this.q.g()) {
            ((ctw) this.q.c()).c();
            ((ctw) this.q.c()).h(false);
            ((ctw) this.q.c()).f(false);
        }
    }

    final boolean h() {
        return this.a.get();
    }
}
