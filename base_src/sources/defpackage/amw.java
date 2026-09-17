package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class amw extends ge {
    public final amq a;

    public amw() {
        this(amq.a);
    }

    public amw(amq amqVar) {
        this.a = amqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((amw) obj).a);
    }

    public final int hashCode() {
        return (amw.class.getName().hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}
