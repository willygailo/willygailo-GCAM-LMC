package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mvf implements kuu {
    private final /* synthetic */ int d;
    public static final /* synthetic */ mvf c = new mvf(2);
    public static final /* synthetic */ mvf b = new mvf(1);
    public static final /* synthetic */ mvf a = new mvf(0);

    private /* synthetic */ mvf(int i) {
        this.d = i;
    }

    @Override // defpackage.kuu
    public final Object a(kvk kvkVar) {
        switch (this.d) {
            case 0:
                return ((kqi) kvkVar.c()).a();
            case 1:
                return ((kqi) kvkVar.c()).b();
            default:
                return ((kqi) kvkVar.c()).b();
        }
    }
}
