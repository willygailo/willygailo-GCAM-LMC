package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class amu extends ge {
    public final amq a = amq.a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((amu) obj).a);
    }

    public final int hashCode() {
        return (amu.class.getName().hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }
}
