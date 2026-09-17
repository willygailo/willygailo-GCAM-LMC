package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nuh extends obr {
    public final String a;

    public nuh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nuh) && qno.c(this.a, ((nuh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UploadAttachmentComplete(blobstoreId=" + this.a + ')';
    }
}
