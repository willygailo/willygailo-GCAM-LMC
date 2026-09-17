package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class osk extends oso implements Map.Entry {
    private static final long serialVersionUID = 0;

    public osk(Map.Entry entry, Object obj) {
        super(entry, obj);
    }

    final Map.Entry a() {
        return (Map.Entry) this.g;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        synchronized (this.h) {
            zEquals = a().equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        Object key;
        synchronized (this.h) {
            key = a().getKey();
        }
        return key;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object value;
        synchronized (this.h) {
            value = a().getValue();
        }
        return value;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int iHashCode;
        synchronized (this.h) {
            iHashCode = a().hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object value;
        synchronized (this.h) {
            value = a().setValue(obj);
        }
        return value;
    }
}
