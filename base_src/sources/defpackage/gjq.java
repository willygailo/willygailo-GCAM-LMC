package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class gjq {
    private final String a;

    public gjq(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof gjq) && this.a.equals(((gjq) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        ojb ojbVarAZ = obr.aZ(this);
        ojbVarAZ.b("name", this.a);
        return ojbVarAZ.toString();
    }
}
