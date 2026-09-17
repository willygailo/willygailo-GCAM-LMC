package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class onh extends onj implements Map.Entry {
    protected onh() {
    }

    @Override // defpackage.onj
    protected /* bridge */ /* synthetic */ Object a() {
        throw null;
    }

    protected abstract Map.Entry b();

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        return b().equals(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return b().getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return b().getValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return b().hashCode();
    }

    public Object setValue(Object obj) {
        return b().setValue(obj);
    }
}
