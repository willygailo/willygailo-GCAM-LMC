package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class okl extends onl {
    final Set a;
    final /* synthetic */ okm b;

    public okl(okm okmVar) {
        this.b = okmVar;
        this.a = okmVar.b.keySet();
    }

    @Override // defpackage.one, defpackage.onj
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ Object b() {
        return this.a;
    }

    @Override // defpackage.onl, defpackage.one
    protected final /* synthetic */ Collection b() {
        return this.a;
    }

    @Override // defpackage.onl
    /* JADX INFO: renamed from: c */
    protected final Set a() {
        return this.a;
    }

    @Override // defpackage.one, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return obr.ad(this.b.entrySet().iterator());
    }

    @Override // defpackage.one, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return u();
    }

    @Override // defpackage.one, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return obr.O(this, objArr);
    }

    @Override // defpackage.onj
    public final String toString() {
        StringBuilder sbO = ohh.O(size());
        sbO.append('[');
        boolean z = true;
        for (Object obj : this) {
            if (!z) {
                sbO.append(", ");
            }
            if (obj == this) {
                sbO.append("(this Collection)");
                z = false;
            } else {
                sbO.append(obj);
                z = false;
            }
        }
        sbO.append(']');
        return sbO.toString();
    }
}
