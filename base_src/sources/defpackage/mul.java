package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mul {
    public final String a;

    public mul(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mul) {
            return this.a.equals(((mul) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
