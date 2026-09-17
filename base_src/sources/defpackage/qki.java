package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class qki implements Serializable, qkj {
    private final Object a;

    public qki(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.qkj
    public final Object a() {
        return this.a;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
