package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fhc implements fhu {
    private final /* synthetic */ int h;
    public static final /* synthetic */ fhc g = new fhc(6);
    public static final /* synthetic */ fhc f = new fhc(5);
    public static final /* synthetic */ fhc e = new fhc(4);
    public static final /* synthetic */ fhc d = new fhc(3);
    public static final /* synthetic */ fhc c = new fhc(2);
    public static final /* synthetic */ fhc b = new fhc(1);
    public static final /* synthetic */ fhc a = new fhc(0);

    private /* synthetic */ fhc(int i) {
        this.h = i;
    }

    @Override // defpackage.fhu
    public final void a(fik fikVar) {
        switch (this.h) {
            case 0:
                int i = fhv.k;
                if (fikVar instanceof fgs) {
                    ((fgs) fikVar).a();
                }
                break;
            case 1:
                int i2 = fhv.k;
                if (fikVar instanceof fgk) {
                    ((fgk) fikVar).a();
                }
                break;
            case 2:
                if (fikVar instanceof fhj) {
                    ((fhj) fikVar).a();
                }
                break;
            case 3:
                if (fikVar instanceof fhl) {
                    ((fhl) fikVar).c();
                }
                break;
            case 4:
                if (fikVar instanceof fhm) {
                    ((fhm) fikVar).a();
                }
                break;
            case 5:
                int i3 = fhv.k;
                if (fikVar instanceof fig) {
                    ((fig) fikVar).fV();
                }
                break;
            default:
                int i4 = fhv.k;
                if (fikVar instanceof fii) {
                    ((fii) fikVar).fW();
                }
                break;
        }
    }
}
