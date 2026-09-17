package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class mdy implements mec {
    private final /* synthetic */ int c;
    public static final mdy b = new mdy(1);
    public static final mdy a = new mdy(0);

    public mdy(int i) {
        this.c = i;
    }

    @Override // defpackage.mec
    public final boolean a() {
        switch (this.c) {
            case 0:
                return false;
            case 1:
                return true;
            default:
                return false;
        }
    }
}
