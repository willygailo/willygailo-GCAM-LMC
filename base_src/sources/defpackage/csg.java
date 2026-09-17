package defpackage;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: loaded from: classes.dex */
public class csg extends csa {
    public final BottomBarController e;
    public final jlb f;
    public final jak g;
    public final jfn h;
    public final csb i;
    public final ojc j;
    public final gtg k;
    public csa l;

    public csg(BottomBarController bottomBarController, jlb jlbVar, jak jakVar, jfn jfnVar, csb csbVar, ojc ojcVar, gtg gtgVar) {
        this.e = bottomBarController;
        this.f = jlbVar;
        this.g = jakVar;
        this.h = jfnVar;
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
        this.e.stopRecording();
        this.h.v(true);
        this.h.l(true);
        this.f.ag();
        this.g.d(true);
        if (this.j.g()) {
            ((cuj) this.j.c()).n();
        }
        jxn.d();
    }
}
