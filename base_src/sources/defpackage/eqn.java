package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eqn implements Runnable {
    public final /* synthetic */ mad a;
    private final /* synthetic */ int b;

    public /* synthetic */ eqn(mad madVar, int i) {
        this.b = i;
        this.a = madVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.a.close();
                break;
            case 1:
                this.a.close();
                break;
            case 2:
                mad madVar = this.a;
                if (madVar != null) {
                    madVar.close();
                }
                break;
            default:
                this.a.close();
                break;
        }
    }
}
