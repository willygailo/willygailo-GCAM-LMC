package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class dvn implements pys {
    private final qkg a;
    private final qkg b;

    public dvn(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public static dvn b(qkg qkgVar, qkg qkgVar2) {
        return new dvn(qkgVar, qkgVar2);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Handler get() {
        lap lapVar = (lap) this.a.get();
        return mip.bW(lapVar, "MicrovideoQSharedStartup");
    }
}
