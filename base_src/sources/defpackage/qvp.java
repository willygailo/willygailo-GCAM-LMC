package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qvp {
    public static final boolean a(Object obj) {
        return obj == quw.a;
    }

    public static final qux b(Object obj) {
        if (obj == quw.a) {
            throw new IllegalStateException("Does not contain segment".toString());
        }
        if (obj != null) {
            return (qux) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
