package defpackage;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: loaded from: classes2.dex */
public class ipx extends iph {
    public final BottomBarController f;
    public final jak g;
    public final ddf h;
    public final jfn i;
    public final gtg j;
    public final jlb k;
    public final iqj l;
    public final epj m;
    public final jjp n;

    public ipx(BottomBarController bottomBarController, jak jakVar, ddf ddfVar, jfn jfnVar, jjp jjpVar, gtg gtgVar, jlb jlbVar, iqj iqjVar, epj epjVar) {
        this.f = bottomBarController;
        this.g = jakVar;
        this.h = ddfVar;
        this.i = jfnVar;
        this.n = jjpVar;
        this.j = gtgVar;
        this.k = jlbVar;
        this.l = iqjVar;
        this.m = epjVar;
    }

    @Override // defpackage.iph, defpackage.ihs, defpackage.iht
    public void f() {
        throw null;
    }

    public final void i() {
        this.j.j();
        this.f.stopTimelapseRecording();
        this.k.ah();
        iqj iqjVar = this.l;
        iqjVar.c(false);
        iqjVar.a.set(false);
        iqjVar.C.d(false);
        if (!iqjVar.k.k(dcu.J)) {
            iqjVar.v.a.set(true);
            iqjVar.T.a();
        } else if (iqjVar.q.g()) {
            ((ctw) iqjVar.q.c()).i();
            ((ctw) iqjVar.q.c()).h(true);
            ((ctw) iqjVar.q.c()).f(true);
        }
        iqj iqjVar2 = this.l;
        if (iqjVar2.k.k(dcu.J)) {
            iqjVar2.j.a(false);
            iqjVar2.I.f();
        } else {
            iro iroVar = iqjVar2.i;
            iroVar.f.animate().cancel();
            iroVar.f.setAlpha(0.0f);
            iroVar.f.setVisibility(8);
            iroVar.j.cancel();
            iroVar.a();
        }
        this.g.d(true);
        jxn.d();
        if (!this.h.k(dcu.J)) {
            this.n.a();
        } else {
            this.i.v(true);
            this.i.l(true);
        }
    }
}
