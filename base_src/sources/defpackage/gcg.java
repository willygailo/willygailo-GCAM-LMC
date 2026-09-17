package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class gcg implements gbb {
    private final gff a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final AtomicReference f = new AtomicReference(gba.TOPSHOT_MODE);

    public gcg(gff gffVar, int i, int i2, int i3, int i4) {
        this.a = gffVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // defpackage.gbb
    public final int a() {
        int i;
        if (this.a.a() == 2) {
            i = this.d;
        } else {
            i = this.a.a() != 1 ? this.c : 0;
        }
        if (this.f.get() == gba.LONGSHOT_MODE) {
            i += this.e;
        }
        return Math.max(this.b - i, 1);
    }

    @Override // defpackage.gbb
    public final int b() {
        return this.b + 1;
    }

    @Override // defpackage.gbb
    public final void c(gba gbaVar) {
        this.f.set(gbaVar);
    }
}
