package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class oqo extends oqn {
    final /* synthetic */ oqp a;

    public oqo(oqp oqpVar) {
        this.a = oqpVar;
    }

    @Override // defpackage.oqn
    public final Map a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.a();
    }
}
