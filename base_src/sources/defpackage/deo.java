package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class deo implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public deo(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final den get() {
        return new den((lzk) this.a.get(), (SharedPreferences) this.b.get(), ((dek) this.c).get(), dug.a(), null, null);
    }
}
