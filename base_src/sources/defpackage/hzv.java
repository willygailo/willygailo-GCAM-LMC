package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hzv implements Runnable {
    public final /* synthetic */ hzz a;
    private final /* synthetic */ int b;

    public /* synthetic */ hzv(hzz hzzVar, int i) {
        this.b = i;
        this.a = hzzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.a.b.a();
                break;
            default:
                this.a.b.a();
                break;
        }
    }
}
