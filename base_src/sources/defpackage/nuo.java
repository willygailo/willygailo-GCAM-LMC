package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nuo extends obr {
    public final String a;

    public nuo(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nuo) && qno.c(this.a, ((nuo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UploadResourceComplete(f250ResourceId=" + this.a + ')';
    }
}
