package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class opq extends ond {
    final /* synthetic */ Iterable a;
    final /* synthetic */ ojf b;

    public opq(Iterable iterable, ojf ojfVar) {
        this.a = iterable;
        this.b = ojfVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ohh.j(this.a.iterator(), this.b);
    }
}
