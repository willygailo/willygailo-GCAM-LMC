package defpackage;

import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lsu {
    public final lui b;
    protected final pht c;

    public lsu(lui luiVar, pht phtVar) {
        this.b = luiVar;
        this.c = phtVar;
    }

    public abstract lzx a();

    public final Surface c() {
        obr.aQ(this.c.isDone());
        return (Surface) plk.ae(this.c);
    }
}
