package defpackage;

import android.content.res.Resources;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;

/* JADX INFO: loaded from: classes.dex */
public final class fzx extends buf implements chy {
    public static final ouj b = ouj.h("com/google/android/apps/camera/modules/video/VideoModule");
    public final cpm c;
    public final lar d;
    public final qkg e;
    public final cqq f;
    public final cph g;
    public final cpi h;
    public final cvo i;
    public final ddf j;
    public final cpp k;
    public final cfe l;
    public final cgx n;
    private final btt o;
    private final String p;
    private final cif q;
    private final cpe r;
    private lap s;
    private final BottomBarController u;
    private final huq v;
    private final hur w;
    private final huo x;
    public final Object m = new Object();
    private final BottomBarListener t = new fzw(this);

    public fzx(btt bttVar, lar larVar, Resources resources, cgx cgxVar, huq huqVar, hur hurVar, huo huoVar, BottomBarController bottomBarController, cpm cpmVar, cph cphVar, cpi cpiVar, cpe cpeVar, cpp cppVar, cfe cfeVar, cif cifVar, cqq cqqVar, qkg qkgVar, cvo cvoVar, ddf ddfVar) {
        this.j = ddfVar;
        this.g = cphVar;
        this.h = cpiVar;
        this.r = cpeVar;
        this.i = cvoVar;
        this.o = bttVar;
        this.d = larVar;
        this.c = cpmVar;
        this.p = resources.getString(R.string.video_accessibility_peek);
        this.v = huqVar;
        this.l = cfeVar;
        this.e = qkgVar;
        this.u = bottomBarController;
        this.n = cgxVar;
        this.w = hurVar;
        this.k = cppVar;
        this.x = huoVar;
        this.q = cifVar;
        this.f = cqqVar;
    }

    private final lij v(cpl cplVar) {
        return new fzt(this, cplVar);
    }

    @Override // defpackage.buf
    public final String c() {
        return this.p;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.m) {
            this.l.n();
        }
    }

    @Override // defpackage.chy
    public final void f() {
        cqq cqqVar = this.f;
        if (cqqVar.b.g()) {
            ((cuj) cqqVar.b.c()).p(null);
        }
    }

    @Override // defpackage.chy
    public final void g() {
    }

    @Override // defpackage.chy
    public final void gb() {
        this.n.j(true);
    }

    @Override // defpackage.buf
    public final void gc(int i) {
        synchronized (this.m) {
            this.l.f(i);
        }
    }

    @Override // defpackage.buf
    public final void gd(boolean z) {
        synchronized (this.m) {
            this.l.k(z);
        }
    }

    @Override // defpackage.buf
    public final void ge() {
        synchronized (this.m) {
            this.n.c(this.o.g(), jrl.VIDEO);
            this.l.c();
        }
    }

    @Override // defpackage.buf
    public final void gf() {
        synchronized (this.m) {
            this.n.e();
            this.l.n();
        }
    }

    @Override // defpackage.chy
    public final void h() {
        cui cuiVar;
        cqj cqjVar;
        cqq cqqVar = this.f;
        if (cqqVar.b.g()) {
            cuj cujVar = (cuj) cqqVar.b.c();
            if (cqqVar.d.d().equals(lwd.FRONT)) {
                cuiVar = cui.DISABLED_HIDDEN;
            } else if (cqqVar.c.c()) {
                cuiVar = cui.ENABLED_VISIBLE;
            } else {
                cqqVar.c(true);
                cuiVar = cui.DISABLED_VISIBLE;
            }
            cujVar.h(cuiVar);
            if (cuiVar.d) {
                cujVar.p(new cql(cqqVar));
            }
            cqqVar.e.f();
            cqqVar.g.set(false);
            if (cqqVar.f.a(dcu.i).g()) {
                int iIntValue = ((Integer) cqqVar.f.a(dcu.i).c()).intValue();
                if (iIntValue == 2) {
                    cqjVar = cqj.CINEMATIC;
                } else if (iIntValue == 3) {
                    cqjVar = cqj.LOCKED;
                } else {
                    cqjVar = iIntValue == 4 ? cqj.ACTIVE : cqj.DEFAULT;
                }
                cqqVar.d(cqjVar, true);
            }
        }
    }

    @Override // defpackage.chy
    public final void i(clf clfVar) {
    }

    @Override // defpackage.chy
    public final void j(boolean z) {
        this.l.h(z);
    }

    @Override // defpackage.buf
    public final void k() {
        synchronized (this.m) {
            this.l.m(true);
        }
    }

    @Override // defpackage.buf
    public final void m() {
        synchronized (this.m) {
            lap lapVar = new lap();
            this.s = lapVar;
            lapVar.c(this.v.a.a(v(this.g), this.d));
            this.s.c(this.v.b.a(v(this.h), this.d));
            this.s.c(this.v.c.a(v(this.r), this.d));
            this.s.c(this.w.a(new fzu(this, 1), this.d));
            this.s.c(this.x.a(new fzu(this, 0), this.d));
            this.s.c(this.i.a(new fzv(this), this.d));
            this.s.c(this.f.b(new cqp() { // from class: fzq
                @Override // defpackage.cqp
                public final void a(cqj cqjVar, cqj cqjVar2, boolean z) {
                    fzx fzxVar = this.a;
                    if (cqq.f(cqjVar, cqjVar2)) {
                        fzxVar.d.execute(new fzr(fzxVar, 2));
                    }
                }
            }));
            this.u.addListener(this.t);
            this.n.h();
            this.q.c();
            this.l.b(this);
        }
    }

    @Override // defpackage.buf
    public final void o() {
        synchronized (this.m) {
            this.u.removeListener(this.t);
            this.n.i();
            this.s.close();
            this.l.l(this);
            this.q.d();
        }
    }

    @Override // defpackage.buf
    public final boolean q() {
        boolean zO;
        synchronized (this.m) {
            zO = this.l.o();
        }
        return zO;
    }

    @Override // defpackage.buf
    public final boolean s() {
        return true;
    }

    public final void u() {
        leb lebVar;
        if (((htl) this.w.fA()).equals(htl.RES_2160P)) {
            lebVar = ((htk) this.x.fA()).equals(htk.SIXTEEN_BY_NINE) ? leb.RES_2160P : leb.RES_2160P_3X4;
        } else {
            lebVar = ((htk) this.x.fA()).equals(htk.SIXTEEN_BY_NINE) ? leb.RES_1080P : leb.RES_1080P_3X4;
        }
        ddf ddfVar = this.j;
        ddi ddiVar = ddl.a;
        ddfVar.e();
        this.k.a.fB(lebVar);
        cpl cplVarA = this.c.a(jrl.VIDEO);
        if (cplVarA instanceof cpi) {
            this.g.fB((ldz) cplVarA.fA());
        }
        ((jnw) this.e).get().e.n(jrl.VIDEO, new fzr(this, 1));
    }
}
