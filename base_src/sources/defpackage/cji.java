package defpackage;

import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public final class cji implements cjg {
    private final Range a;
    private final ojc b;
    private final boolean c;

    public cji(Range range, ojc ojcVar, boolean z) {
        this.a = range;
        this.b = ojcVar;
        this.c = z;
    }

    @Override // defpackage.cjg
    public final Range a() {
        return (this.c && this.b.g()) ? (Range) this.b.c() : this.a;
    }

    @Override // defpackage.cjg
    public final Range b() {
        return (this.c && this.b.g()) ? (Range) this.b.c() : this.a;
    }
}
