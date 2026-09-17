package defpackage;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class onl extends one implements Set {
    protected onl() {
    }

    @Override // defpackage.one
    protected /* bridge */ /* synthetic */ Collection b() {
        throw null;
    }

    protected abstract Set c();

    protected final boolean d(Collection collection) {
        collection.getClass();
        return obr.E(this, collection);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return obj == this || c().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return c().hashCode();
    }
}
