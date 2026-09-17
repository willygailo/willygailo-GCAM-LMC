package defpackage;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: loaded from: classes.dex */
final class csb {
    private final BottomBarController a;
    private final jlb b;
    private final kas c;
    private final gtg d;
    private final dmh e;

    public csb(BottomBarController bottomBarController, jlb jlbVar, kas kasVar, gtg gtgVar, dmh dmhVar) {
        this.a = bottomBarController;
        this.b = jlbVar;
        this.c = kasVar;
        this.d = gtgVar;
        this.e = dmhVar;
    }

    public final void a() {
        this.a.resumeRecording();
        this.b.w();
    }

    public final void b() {
        this.d.l();
        kbi kbiVar = (kbi) this.c;
        kbiVar.C.setSoundEffectsEnabled(false);
        kbiVar.B.setSoundEffectsEnabled(false);
        this.e.f();
    }

    public final void c() {
        this.a.pauseRecording();
        this.b.s();
    }

    public final void d() {
        this.d.j();
        kbi kbiVar = (kbi) this.c;
        kbiVar.C.setSoundEffectsEnabled(true);
        kbiVar.B.setSoundEffectsEnabled(true);
        this.e.i();
    }
}
