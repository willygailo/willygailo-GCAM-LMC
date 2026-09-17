package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class orf extends oqy {
    final Object a;
    int b;
    final /* synthetic */ org c;

    public orf(org orgVar, int i) {
        this.c = orgVar;
        this.a = orgVar.a[i];
        this.b = i;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // defpackage.oqv
    public final int a() {
        int i = this.b;
        if (i != -1) {
            org orgVar = this.c;
            if (i >= orgVar.c || !obr.bc(this.a, orgVar.a[i])) {
                this.b = this.c.c(this.a);
            }
        } else {
            this.b = this.c.c(this.a);
        }
        int i2 = this.b;
        if (i2 == -1) {
            return 0;
        }
        return this.c.b[i2];
    }

    @Override // defpackage.oqv
    public final Object b() {
        return this.a;
    }
}
