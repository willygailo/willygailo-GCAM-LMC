package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kyv implements knh {
    private final /* synthetic */ int d;
    public static final /* synthetic */ kyv c = new kyv(2);
    public static final /* synthetic */ kyv b = new kyv(1);
    public static final /* synthetic */ kyv a = new kyv(0);

    private /* synthetic */ kyv(int i) {
        this.d = i;
    }

    @Override // defpackage.knh
    public final Object a(kiv kivVar) {
        switch (this.d) {
            case 0:
                return Integer.valueOf(((kys) kivVar).a);
            case 1:
                return ((kxe) kivVar).a;
            default:
                return ((kyy) kivVar).a;
        }
    }
}
