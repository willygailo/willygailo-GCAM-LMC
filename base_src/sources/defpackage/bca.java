package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class bca {
    final bky a;
    final Executor b;

    public bca(bky bkyVar, Executor executor) {
        this.a = bkyVar;
        this.b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bca) {
            return this.a.equals(((bca) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
