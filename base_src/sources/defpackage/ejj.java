package defpackage;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: loaded from: classes.dex */
public class ejj extends ejg {
    public final jlb d;
    public final BottomBarController e;
    public final gtg f;
    public final ehw g;
    public final jjp h;

    public ejj(jlb jlbVar, BottomBarController bottomBarController, gtg gtgVar, ehw ehwVar, jjp jjpVar) {
        this.d = jlbVar;
        this.e = bottomBarController;
        this.f = gtgVar;
        this.g = ehwVar;
        this.h = jjpVar;
    }

    @Override // defpackage.ejg, defpackage.ihs, defpackage.iht
    public void f() {
        this.d.ai(jrl.IMAX);
        this.d.H(true);
    }

    @Override // defpackage.ejg, defpackage.ihs, defpackage.iht
    public void g() {
        this.d.H(false);
    }
}
