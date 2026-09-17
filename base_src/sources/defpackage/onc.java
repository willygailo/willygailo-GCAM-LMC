package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class onc extends ond {
    final /* synthetic */ Iterable a;

    public onc(Iterable iterable) {
        this.a = iterable;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new opz(ohh.n(this.a.iterator(), new brr(9)));
    }
}
