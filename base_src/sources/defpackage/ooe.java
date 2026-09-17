package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ooe extends oli implements Serializable {
    private static final long serialVersionUID = 0;
    final Object a;
    final Object b;

    public ooe(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.oli, java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // defpackage.oli, java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // defpackage.oli, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
