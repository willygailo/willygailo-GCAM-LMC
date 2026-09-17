package defpackage;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oni extends one implements oqw {
    protected oni() {
    }

    @Override // defpackage.one
    protected /* bridge */ /* synthetic */ Collection b() {
        throw null;
    }

    @Override // defpackage.oqw
    public int c(Object obj, int i) {
        return i().c(obj, Integer.MAX_VALUE);
    }

    @Override // java.util.Collection, defpackage.oqw
    public final boolean equals(Object obj) {
        return obj == this || i().equals(obj);
    }

    @Override // defpackage.oqw
    public void f(Object obj, int i) {
        throw null;
    }

    @Override // defpackage.oqw
    public final int gD(Object obj) {
        return i().gD(obj);
    }

    @Override // defpackage.oqw
    public boolean h(Object obj, int i) {
        return i().h(obj, i);
    }

    @Override // java.util.Collection, defpackage.oqw
    public final int hashCode() {
        return i().hashCode();
    }

    protected abstract oqw i();

    public Set j() {
        throw null;
    }

    public Set k() {
        throw null;
    }
}
