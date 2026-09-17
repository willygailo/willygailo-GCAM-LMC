package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qsx extends qsy {
    public final Throwable a;

    public qsx(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qsx) && qno.c(this.a, ((qsx) obj).a);
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.qsy
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
