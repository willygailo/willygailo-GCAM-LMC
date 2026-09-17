package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nnf extends ohh {
    public final String a;

    public nnf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nnf) && qno.c(this.a, ((nnf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OverriddenObfuscatedGaiaId(obfuscatedGaiaId=" + this.a + ')';
    }
}
