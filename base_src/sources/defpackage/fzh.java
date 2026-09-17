package defpackage;

import android.content.res.Resources;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;

/* JADX INFO: loaded from: classes.dex */
public final class fzh extends buf implements chy {
    public final cfe b;
    public final BottomBarController c;
    public final cgx d;
    private final btt f;
    private final Resources g;
    private final cpm h;
    private final qkg i;
    private final ojc k;
    private final ddf m;
    private final boolean n;
    private final lce o;
    public final Object e = new Object();
    private final BottomBarListener j = new fzf(this);
    private final ctx l = new fzg(this);

    public fzh(btt bttVar, cfe cfeVar, Resources resources, BottomBarController bottomBarController, qkg qkgVar, cpm cpmVar, qkg qkgVar2, ojc ojcVar, ddf ddfVar, lce lceVar, boolean z) {
        this.f = bttVar;
        this.b = cfeVar;
        this.g = resources;
        this.c = bottomBarController;
        this.d = (cgx) qkgVar.get();
        this.h = cpmVar;
        this.i = qkgVar2;
        this.k = ojcVar;
        this.m = ddfVar;
        this.o = lceVar;
        this.n = z;
    }

    @Override // defpackage.buf
    public final String c() {
        return this.g.getString(R.string.video_accessibility_peek);
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.e) {
            this.b.n();
        }
    }

    @Override // defpackage.chy
    public final void f() {
    }

    @Override // defpackage.chy
    public final void g() {
    }

    @Override // defpackage.chy
    public final void gb() {
        this.d.j(true);
    }

    @Override // defpackage.buf
    public final void gc(int i) {
        synchronized (this.e) {
            this.b.f(i);
        }
    }

    @Override // defpackage.buf
    public final void gd(boolean z) {
        synchronized (this.e) {
            this.b.k(z);
        }
    }

    @Override // defpackage.buf
    public final void ge() {
        synchronized (this.e) {
            this.d.c(this.f.g(), jrl.SLOW_MOTION);
            this.b.c();
        }
    }

    @Override // defpackage.buf
    public final void gf() {
        synchronized (this.e) {
            this.d.e();
        }
        if (this.n) {
            this.o.fB(ldz.FPS_240_HFR_8X);
        }
        this.b.n();
    }

    @Override // defpackage.chy
    public final void h() {
    }

    @Override // defpackage.chy
    public final void i(clf clfVar) {
    }

    @Override // defpackage.chy
    public final void j(boolean z) {
        this.b.h(z);
    }

    @Override // defpackage.buf
    public final void k() {
        synchronized (this.e) {
            this.b.m(true);
        }
    }

    @Override // defpackage.buf
    public final void m() {
        synchronized (this.e) {
            this.c.addListener(this.j);
            this.d.h();
            this.b.b(this);
            if (this.k.g()) {
                ((ctw) this.k.c()).a(this.l);
            }
        }
    }

    @Override // defpackage.buf
    public final void o() {
        synchronized (this.e) {
            this.d.i();
            this.b.l(this);
            this.c.removeListener(this.j);
            if (this.k.g()) {
                ((ctw) this.k.c()).e(this.l);
            }
        }
    }

    @Override // defpackage.buf
    public final boolean q() {
        boolean zO;
        synchronized (this.e) {
            zO = this.b.o();
        }
        return zO;
    }

    @Override // defpackage.buf
    public final boolean s() {
        return true;
    }

    public final void u(int i) {
        synchronized (this.e) {
            ldz ldzVar = ldz.FPS_120_HFR_4X;
            boolean zK = this.m.k(dcu.J);
            if (i == 0) {
                ldzVar = zK ? ldz.FPS_240_HFR_8X : ldz.FPS_120_HFR_4X;
            } else if (i == 1) {
                if (!zK) {
                    ldzVar = ldz.FPS_240_HFR_8X;
                }
            }
            cpl cplVarA = this.h.a(jrl.SLOW_MOTION);
            cplVarA.fA();
            if (ldzVar != cplVarA.fA()) {
                cplVarA.fB(ldzVar);
                ((jnw) this.i).get().e.n(jrl.SLOW_MOTION, new Runnable() { // from class: fze
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b.p(4);
                    }
                });
            }
        }
    }
}
