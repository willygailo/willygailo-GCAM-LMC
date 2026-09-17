package defpackage;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: loaded from: classes.dex */
public final class csc implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;

    public csc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final csb get() {
        return new csb((BottomBarController) this.a.get(), (jlb) this.b.get(), ((iwi) this.c).get(), (gtg) this.d.get(), (dmh) this.e.get());
    }
}
