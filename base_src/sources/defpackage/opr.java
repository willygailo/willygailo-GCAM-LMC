package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class opr extends ond {
    final /* synthetic */ Iterable a;
    final /* synthetic */ oiu b;

    public opr(Iterable iterable, oiu oiuVar) {
        this.a = iterable;
        this.b = oiuVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ohh.n(this.a.iterator(), this.b);
    }
}
