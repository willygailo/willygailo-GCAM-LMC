package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class htw implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;

    public htw(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final htv get() {
        return new htv((SharedPreferences) this.a.get(), (huf) this.b.get(), (lda) this.c.get(), (lda) this.d.get());
    }
}
