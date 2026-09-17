package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eax implements ojz {
    private final ojc a;
    private final jrl b;
    private final int c;
    private final int d;
    private final int e;

    public eax(ead eadVar, ojc ojcVar, jrl jrlVar) {
        this.a = ojcVar;
        this.b = jrlVar;
        int i = eadVar.c;
        this.e = i;
        this.c = i - eadVar.e;
        this.d = i - eadVar.f;
    }

    @Override // defpackage.ojz
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Integer a() {
        if (this.b.equals(jrl.MOTION_BLUR)) {
            return Integer.valueOf(this.c);
        }
        if (this.a.g() && ((gff) this.a.c()).a() != 1) {
            return ((gff) this.a.c()).a() == 2 ? Integer.valueOf(this.d) : Integer.valueOf(this.c);
        }
        return Integer.valueOf(this.e);
    }
}
