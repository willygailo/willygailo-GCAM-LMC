package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jba implements Runnable {
    public final /* synthetic */ jbb a;
    private final /* synthetic */ int b;

    public /* synthetic */ jba(jbb jbbVar, int i) {
        this.b = i;
        this.a = jbbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.a.a.setVisibility(0);
                break;
            default:
                this.a.a.setVisibility(8);
                break;
        }
    }
}
