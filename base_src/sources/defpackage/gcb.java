package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class gcb implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public gcb(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    public static gcb b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new gcb(qkgVar, qkgVar2, qkgVar3);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gas get() {
        return new gas((gay) this.a.get(), (Handler) this.b.get(), (hcg) this.c.get());
    }
}
