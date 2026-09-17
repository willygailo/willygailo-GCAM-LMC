package defpackage;

import android.view.WindowManager;

/* JADX INFO: loaded from: classes2.dex */
public final class jmu implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public jmu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jmt get() {
        WindowManager windowManager = ((emh) this.a).get();
        ddf ddfVar = (ddf) this.b.get();
        ((ftf) this.c).get();
        return new jmt(windowManager, ddfVar);
    }
}
