package defpackage;

import java.io.Serializable;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes2.dex */
final class oof implements Serializable {
    private static final long serialVersionUID = 0;
    final EnumMap a;

    public oof(EnumMap enumMap) {
        this.a = enumMap;
    }

    Object readResolve() {
        return new oog(this.a);
    }
}
