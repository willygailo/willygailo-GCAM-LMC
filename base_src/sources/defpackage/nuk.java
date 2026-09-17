package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nuk extends obr {
    public final long a;

    public nuk(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nuk) && this.a == ((nuk) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "UploadProgress(bytesUploaded=" + this.a + ')';
    }
}
