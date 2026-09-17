package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class oow extends oti {
    final oti a;
    final /* synthetic */ ooz b;

    public oow(ooz oozVar) {
        this.b = oozVar;
        this.a = oozVar.a.entrySet().listIterator();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.a.next()).getValue();
    }
}
