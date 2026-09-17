package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class okk extends onl {
    final /* synthetic */ okm a;

    public okk(okm okmVar) {
        this.a = okmVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.onl, defpackage.one
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final Set b() {
        return this.a.a.keySet();
    }

    @Override // defpackage.one, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.one, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return obr.ac(this.a.entrySet().iterator());
    }

    @Override // defpackage.one, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        this.a.f(obj);
        return true;
    }

    @Override // defpackage.one, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        return d(collection);
    }

    @Override // defpackage.one, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        return t(collection);
    }
}
