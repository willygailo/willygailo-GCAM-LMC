package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nup extends obr {
    public final String a;

    public nup(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nup) && qno.c(this.a, ((nup) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UploadTransferHandle(uploadTransferHandle=" + this.a + ')';
    }
}
