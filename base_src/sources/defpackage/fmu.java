package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fmu implements ojf {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ fmu(long j, int i) {
        this.b = i;
        this.a = j;
    }

    @Override // defpackage.ojf
    public final boolean a(Object obj) {
        switch (this.b) {
            case 0:
                long j = this.a;
                lmw lmwVarB = ((lrr) obj).b();
                return lmwVarB != null && lmwVarB.b > j;
            case 1:
                long j2 = this.a;
                lmw lmwVarB2 = ((lrr) obj).b();
                return lmwVarB2 != null && lmwVarB2.b > j2;
            case 2:
                long j3 = this.a;
                lmw lmwVarB3 = ((lrr) obj).b();
                return lmwVarB3 != null && lmwVarB3.b == j3;
            default:
                long j4 = this.a;
                lmw lmwVarB4 = ((lrr) obj).b();
                return lmwVarB4 != null && lmwVarB4.b == j4;
        }
    }
}
