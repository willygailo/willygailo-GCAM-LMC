package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bmv {
    public long a = 0;
    public boolean b;
    private final lco c;

    public bmv(huq huqVar, bui buiVar, byte[] bArr) {
        lda ldaVar = huqVar.c;
        this.c = ldaVar;
        this.b = ((Boolean) ((lce) ldaVar).d).booleanValue();
        buiVar.b.c(ldaVar.a(new lij() { // from class: bmu
            @Override // defpackage.lij
            public final void fB(Object obj) {
                bmv bmvVar = this.a;
                Boolean bool = (Boolean) obj;
                if (!bool.booleanValue() && bmvVar.b) {
                    bmvVar.a = System.currentTimeMillis();
                }
                bmvVar.b = bool.booleanValue();
            }
        }, pgr.INSTANCE));
    }

    public final boolean a() {
        return ((Boolean) ((lce) this.c).d).booleanValue() || System.currentTimeMillis() - this.a < 3000;
    }
}
