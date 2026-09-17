package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.camcorder.ui.stabilization.StabilizationUi;
import com.google.android.apps.camera.ui.popupmenu.PopupMenuButton;
import j$.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class cug implements cuj {
    private jgu A;
    private jgu B;
    private lie C;
    private final lap D;
    public final cuu a;
    public final cum b;
    public final elw c;
    public final huj d;
    public final lar e;
    public final Context f;
    public final qkg g;
    public final gvb h;
    public final ddf i;
    public final hug k;
    public final gtg l;
    public final kas m;
    public StabilizationUi n;
    public jgu p;
    public jgu q;
    public lie t;
    public cql w;
    public final ivf x;
    private View z;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public cui o = cui.DISABLED_HIDDEN;
    public cuv r = cuv.STANDARD;
    public final lyy s = new cua(this);
    public final cub y = new cub(this);
    public int u = -1;
    public final Object v = new Object();

    public cug(cuu cuuVar, cum cumVar, elw elwVar, huj hujVar, lar larVar, Context context, qkg qkgVar, gvb gvbVar, ivf ivfVar, ddf ddfVar, bqg bqgVar, hug hugVar, gtg gtgVar, kas kasVar) {
        this.a = cuuVar;
        this.b = cumVar;
        this.c = elwVar;
        this.d = hujVar;
        this.e = larVar;
        this.f = context;
        this.g = qkgVar;
        this.h = gvbVar;
        this.x = ivfVar;
        this.i = ddfVar;
        this.D = bqgVar.i();
        this.k = hugVar;
        this.l = gtgVar;
        this.m = kasVar;
    }

    public static boolean o(lic licVar) {
        return licVar.equals(lic.CLOCKWISE_90) || licVar.equals(lic.CLOCKWISE_270);
    }

    private final void q() {
        d();
        this.n.setVisibility(8);
        f();
        ((cuk) this.b).g.d();
    }

    private final void r() {
        obr.aR(this.o.e, "Stabilization button is not visible");
        this.n.setVisibility(0);
    }

    @Override // defpackage.cuj
    public final cuu a() {
        return this.a;
    }

    @Override // defpackage.cuj
    public final void b() {
        synchronized (this.v) {
            jgu jguVar = this.B;
            if (jguVar != null) {
                this.c.g(jguVar);
                this.B = null;
            }
        }
    }

    public final void c() {
        synchronized (this.v) {
            if (this.C == null) {
                this.C = this.c.e(elx.NOTIFICATION_CHIP);
            }
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        q();
        this.o = cui.DISABLED_HIDDEN;
    }

    public final void d() {
        lie lieVar = this.t;
        if (lieVar != null) {
            lieVar.close();
            this.t = null;
        }
    }

    @Override // defpackage.cuj
    public final void e(ViewStub viewStub) {
        if (this.n == null) {
            this.n = (StabilizationUi) viewStub.inflate();
        }
        StabilizationUi stabilizationUi = this.n;
        stabilizationUi.b.c(this.i.k(ddl.ay));
        jgv jgvVar = new jgv();
        jgvVar.e = this.f.getResources().getString(R.string.locked_mode_before_recording);
        jgvVar.f = this.f;
        jgvVar.i = 11;
        jgvVar.a = true;
        jgvVar.h = this.i.k(ddl.ay);
        this.A = jgvVar.a();
        jgv jgvVar2 = new jgv();
        jgvVar2.e = this.f.getResources().getString(R.string.locked_mode_will_exit_warning);
        jgvVar2.f = this.f;
        jgvVar2.i = 11;
        jgvVar2.a = true;
        jgvVar2.h = this.i.k(ddl.ay);
        this.p = jgvVar2.a();
        jgv jgvVar3 = new jgv();
        jgvVar3.e = this.f.getResources().getString(R.string.locked_mode_exit_message);
        jgvVar3.f = this.f;
        jgvVar3.i = 11;
        jgvVar3.b = 3000;
        jgvVar3.h = this.i.k(ddl.ay);
        this.q = jgvVar3.a();
        cuu cuuVar = this.a;
        final cub cubVar = new cub(this);
        cus cusVar = (cus) cuuVar;
        cusVar.b.b.setOnClickListener(new View.OnClickListener() { // from class: cuo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cub cubVar2 = cubVar;
                synchronized (cubVar2.a.v) {
                    cubVar2.a.b.a();
                    cubVar2.a.k.e(htu.t, true);
                }
            }
        });
        cusVar.g.c(new jhq() { // from class: cup
            @Override // defpackage.jhq
            public final void a(jhp jhpVar) {
                cub cubVar2 = cubVar;
                cuv cuvVar = (cuv) jhpVar.a;
                synchronized (cubVar2.a.v) {
                    cubVar2.a.a.b();
                    cubVar2.a.i(cuvVar);
                    cql cqlVar = cubVar2.a.w;
                    if (cqlVar != null) {
                        cqlVar.a(cuvVar, true);
                    }
                    if (cuvVar.equals(cuv.LOCKED)) {
                        cug cugVar = cubVar2.a;
                        cugVar.h.k(cugVar.y);
                        cug cugVar2 = cubVar2.a;
                        cugVar2.h.g(cugVar2.s);
                    } else {
                        cug cugVar3 = cubVar2.a;
                        cugVar3.h.l(cugVar3.y);
                        cug cugVar4 = cubVar2.a;
                        cugVar4.h.h(cugVar4.s);
                        cubVar2.a.u = -1;
                    }
                    if (!((Boolean) ((lce) cubVar2.a.k.b(htu.t)).d).booleanValue() && !cuvVar.equals(cuv.STANDARD)) {
                        cubVar2.a.b.a();
                        cubVar2.a.k.e(htu.t, true);
                    }
                }
            }
        }, true);
        this.D.c(this.a.a(new cuc(this)));
        FrameLayout frameLayout = this.n.c;
        this.z = frameLayout;
        frameLayout.setAccessibilityDelegate(new cud(this));
        this.z.setOnClickListener(new View.OnClickListener() { // from class: cty
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                View viewF;
                final cug cugVar = this.a;
                cui cuiVar = cugVar.o;
                if (cuiVar.e) {
                    final int i = 1;
                    final int i2 = 0;
                    if (cuiVar.d) {
                        if (cugVar.j.get()) {
                            return;
                        }
                        jty.e(view);
                        if (cugVar.a.c()) {
                            cugVar.a.b();
                        } else {
                            cus cusVar2 = (cus) cugVar.a;
                            cusVar2.b.d();
                            Collection.EL.stream(cusVar2.d).forEach(cez.f);
                        }
                        cugVar.k.e(htu.w, 0);
                        cugVar.k.e(htu.y, true);
                        return;
                    }
                    jty.e(view);
                    if (cugVar.t == null) {
                        if (cugVar.l.E()) {
                            gtg gtgVar = cugVar.l;
                            obr.aQ(gtgVar.bf.g());
                            viewF = ((gts) gtgVar.bf.c()).b;
                        } else {
                            viewF = ((jnw) cugVar.g).get().h.f();
                        }
                        jlz jlzVar = new jlz(cugVar.f.getResources().getString(R.string.enable_stabilization_tooltip));
                        jrz jrzVar = jrz.PORTRAIT;
                        switch (cugVar.n.d.ordinal()) {
                            case 1:
                                jlzVar.h(viewF, 20);
                                break;
                            case 2:
                                jlzVar.l(viewF, 20);
                                break;
                            default:
                                jlzVar.u(viewF);
                                break;
                        }
                        jlzVar.i();
                        jlzVar.h = cugVar.i.k(ddl.ay);
                        jlzVar.n();
                        jlzVar.g(new Runnable() { // from class: ctz
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i) {
                                    case 0:
                                        cugVar.d();
                                        break;
                                    default:
                                        cugVar.d.b("washington_tooltip");
                                        break;
                                }
                            }
                        }, cugVar.e);
                        jlzVar.f(new Runnable() { // from class: ctz
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i2) {
                                    case 0:
                                        cugVar.d();
                                        break;
                                    default:
                                        cugVar.d.b("washington_tooltip");
                                        break;
                                }
                            }
                        }, cugVar.e);
                        jlzVar.d = 5000;
                        jlzVar.m = 10;
                        jlzVar.i = cugVar.c;
                        jlzVar.e = false;
                        jlzVar.f = false;
                        jlzVar.o();
                        jlzVar.r();
                        cugVar.t = jlzVar.a();
                    }
                }
            }
        });
    }

    public final void f() {
        synchronized (this.v) {
            this.u = -1;
        }
        this.h.l(this.y);
        this.h.h(this.s);
        cus cusVar = (cus) this.a;
        cusVar.g.e(cuv.STANDARD);
        cusVar.b();
        i(cuv.STANDARD);
    }

    public final void g() {
        synchronized (this.v) {
            lie lieVar = this.C;
            if (lieVar != null) {
                lieVar.close();
                this.C = null;
            }
        }
    }

    @Override // defpackage.cuj
    public final synchronized void h(cui cuiVar) {
        this.o = cuiVar;
        this.n.b.setAlpha(true != cuiVar.d ? 0.3f : 1.0f);
        if (!cuiVar.e) {
            q();
            return;
        }
        r();
        if (cuiVar.d) {
            int iIntValue = ((Integer) ((lce) this.k.b(htu.w)).d).intValue() + 1;
            this.k.e(htu.w, Integer.valueOf(iIntValue));
            if ((!((Boolean) ((lce) this.k.b(htu.y)).d).booleanValue() && iIntValue == 2) || iIntValue == 10) {
                if (this.t == null) {
                    FrameLayout frameLayout = this.n.c;
                    frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new cuf(this, frameLayout));
                }
                this.k.e(htu.y, true);
                this.k.e(htu.w, 0);
            }
        }
    }

    public final void i(cuv cuvVar) {
        this.r = cuvVar;
        StabilizationUi stabilizationUi = this.n;
        PopupMenuButton popupMenuButton = stabilizationUi.b;
        Integer num = (Integer) stabilizationUi.a.get(cuvVar);
        num.getClass();
        popupMenuButton.setImageResource(num.intValue());
    }

    @Override // defpackage.cuj
    public final void j(jrz jrzVar) {
        this.n.a(jrzVar);
        cus cusVar = (cus) this.a;
        cusVar.c.a(jrzVar);
        cusVar.b.a(jrzVar);
    }

    public final void k(jgu jguVar) {
        synchronized (this.v) {
            b();
            this.B = jguVar;
            elw elwVar = this.c;
            jguVar.getClass();
            elwVar.d(jguVar);
        }
    }

    @Override // defpackage.cuj
    public final void l() {
        synchronized (this.v) {
            if (this.r.equals(cuv.LOCKED) && !this.j.get()) {
                k(this.A);
            }
        }
    }

    @Override // defpackage.cuj
    public final void m() {
        this.j.set(true);
        cui cuiVar = this.o;
        if (!cuiVar.d) {
            if (cuiVar.e) {
                q();
            }
        } else {
            this.a.b();
            this.n.b(true, this.i.k(dcu.S));
            if (this.r.equals(cuv.LOCKED)) {
                this.x.a(ivh.ACTIVE);
                b();
            }
            d();
        }
    }

    @Override // defpackage.cuj
    public final void n() {
        this.j.set(false);
        cui cuiVar = this.o;
        if (!cuiVar.d) {
            if (cuiVar.e) {
                r();
                return;
            }
            return;
        }
        this.n.b(false, this.i.k(dcu.S));
        if (this.r.equals(cuv.LOCKED)) {
            this.x.a(ivh.IDLE);
            l();
            synchronized (this.v) {
                this.u = -1;
            }
        }
    }

    @Override // defpackage.cuj
    public final void p(cql cqlVar) {
        this.w = cqlVar;
    }
}
