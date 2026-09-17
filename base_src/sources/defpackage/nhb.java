package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class nhb implements Iterable {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ String b;
    final /* synthetic */ nhc c;
    final /* synthetic */ nhd d;

    public nhb(nhd nhdVar, CharSequence charSequence, String str, nhc nhcVar) {
        this.d = nhdVar;
        this.a = charSequence;
        this.b = str;
        this.c = nhcVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new nha(this.d, this.a, this.b, this.c);
    }
}
