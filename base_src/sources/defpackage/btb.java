package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class btb implements brx {
    private final lda a;
    private final lda b = new lce(15);

    public btb(lda ldaVar) {
        this.a = ldaVar;
    }

    @Override // defpackage.brx
    public final lco a() {
        return this.a;
    }

    @Override // defpackage.brx
    public final lda b() {
        return this.b;
    }

    @Override // defpackage.brx
    public final boolean c() {
        try {
            return kda.a != null;
        } catch (NoSuchFieldError e) {
            return false;
        }
    }
}
