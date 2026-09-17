package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qvv implements qll {
    private final ThreadLocal a;

    public qvv(ThreadLocal threadLocal) {
        this.a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qvv) && qno.c(this.a, ((qvv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.a + ')';
    }
}
