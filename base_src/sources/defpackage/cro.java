package defpackage;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: loaded from: classes.dex */
public class cro extends csa {
    public final BottomBarController e;
    public final ddf f;
    public final jlb g;
    public final jfn h;
    public final csb i;
    public final ojc j;
    public final gtg k;
    public csa l;
    public final jjp m;

    public cro(BottomBarController bottomBarController, ddf ddfVar, jlb jlbVar, jfn jfnVar, jjp jjpVar, csb csbVar, ojc ojcVar, gtg gtgVar) {
        this.e = bottomBarController;
        this.f = ddfVar;
        this.g = jlbVar;
        this.h = jfnVar;
        this.m = jjpVar;
        this.i = csbVar;
        this.j = ojcVar;
        this.k = gtgVar;
    }

    @Override // defpackage.crx
    public final boolean fK() {
        return this.l.fK();
    }

    @Override // defpackage.crx
    public final int j() {
        return this.l.j();
    }

    public final void k() {
        this.i.d();
        this.e.stopHfrRecording();
        this.g.ad();
        if (!this.f.k(dcu.J)) {
            this.m.a();
            return;
        }
        if (this.j.g()) {
            ((ctw) this.j.c()).g(true);
        }
        this.h.v(true);
        this.h.l(true);
    }
}
