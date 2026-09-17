package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class dbm implements dcq {
    final /* synthetic */ dbo a;
    private final /* synthetic */ int b;

    public dbm(dbo dboVar, int i) {
        this.b = i;
        this.a = dboVar;
    }

    @Override // defpackage.dcq
    public final boolean a() {
        switch (this.b) {
            case 0:
                if (this.a.c.g() && this.a.d.g()) {
                    return Math.abs(Math.toDegrees((double) ((dbn) this.a.c.c()).a)) >= 45.0d || Math.abs(Math.toDegrees((double) ((dbn) this.a.c.c()).b)) >= 45.0d || ((dbn) this.a.c.c()).c;
                }
                return false;
            default:
                if (this.a.c.g() && this.a.d.g()) {
                    float f = ((dbn) this.a.c.c()).a;
                    float f2 = ((dbn) this.a.c.c()).b;
                    boolean z = ((dbn) this.a.c.c()).c;
                    if (dbo.a.contains(Double.valueOf(Math.toDegrees(f))) && Math.abs(Math.toDegrees(f2)) <= 10.0d && !z) {
                        return true;
                    }
                }
                return false;
        }
    }
}
