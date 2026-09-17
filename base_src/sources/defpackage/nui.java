package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nui extends obr {
    public final Throwable a;
    public final int b;

    public nui(int i, Throwable th) {
        this.b = i;
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nui)) {
            return false;
        }
        nui nuiVar = (nui) obj;
        return this.b == nuiVar.b && qno.c(this.a, nuiVar.a);
    }

    public final int hashCode() {
        return (this.b * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "UploadError(f250LogReason=" + ((Object) plk.am(this.b)) + ", error=" + this.a + ')';
    }
}
