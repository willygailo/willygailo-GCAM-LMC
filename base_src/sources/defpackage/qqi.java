package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qqi extends qlc {
    public static final qli b = new qli();
    public final String a;

    public qqi(String str) {
        super(b);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qqi) && qno.c(this.a, ((qqi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CoroutineName(" + this.a + ')';
    }
}
