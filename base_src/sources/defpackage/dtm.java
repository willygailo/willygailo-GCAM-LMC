package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dtm {
    public int a = 1;
    public dti b = dtn.a;
    public drc c;
    public int d;
    private final dqw e;

    public dtm(dqw dqwVar) {
        obr.aF(true);
        obr.aF(true);
        this.c = new drc() { // from class: drd
            @Override // defpackage.drc
            public final drf a(long j) {
                return new dre(j);
            }
        };
        this.d = 1;
        this.e = dqwVar;
    }

    public static final void c(int i) {
        obr.aF(i > 0);
    }

    public final dqx a() {
        int i;
        int i2 = this.a;
        if (i2 != -1) {
            this.d = i2;
            i = i2;
        } else {
            int i3 = this.d;
            if (i3 <= 0) {
                throw new IllegalStateException("Must specify max dimensions when building variable dimensional views!");
            }
            i = i3;
        }
        return new dtj(this.e, i2, i, this.b, this.c);
    }

    public final void b(final dtk dtkVar) {
        this.b = new dti() { // from class: dtl
            @Override // defpackage.dti
            public final int a(long j, float[] fArr) {
                fArr[0] = dtkVar.a(j);
                return 1;
            }
        };
    }
}
