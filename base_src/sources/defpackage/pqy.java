package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class pqy extends pnx {
    final pqz a;
    pnz b = b();
    final /* synthetic */ pra c;

    public pqy(pra praVar) {
        this.c = praVar;
        this.a = new pqz(praVar);
    }

    private final pnz b() {
        if (this.a.hasNext()) {
            return this.a.next().iterator();
        }
        return null;
    }

    @Override // defpackage.pnz
    public final byte a() {
        pnz pnzVar = this.b;
        if (pnzVar == null) {
            throw new NoSuchElementException();
        }
        byte bA = pnzVar.a();
        if (!this.b.hasNext()) {
            this.b = b();
        }
        return bA;
    }

    @Override // j$.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }
}
