package defpackage;

import android.view.WindowManager;

/* JADX INFO: loaded from: classes2.dex */
public final class jmw implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;

    public jmw(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jmv get() {
        WindowManager windowManager = ((emh) this.a).get();
        ddf ddfVar = (ddf) this.b.get();
        lvq lvqVar = ((lhr) this.c).get();
        ((ftf) this.d).get();
        return new jmv(windowManager, ddfVar, lvqVar);
    }
}
