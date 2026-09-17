package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qsz {
    public static final qsy a = new qsy();
    public final Object b;

    private /* synthetic */ qsz(Object obj) {
        this.b = obj;
    }

    public static final /* synthetic */ qsz a(Object obj) {
        return new qsz(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qsz) && qno.c(this.b, ((qsz) obj).b);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.b;
        if (obj instanceof qsx) {
            return obj.toString();
        }
        return "Value(" + obj + ')';
    }
}
