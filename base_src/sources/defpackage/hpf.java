package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hpf implements Runnable {
    public final /* synthetic */ hpj a;
    private final /* synthetic */ int b;

    public /* synthetic */ hpf(hpj hpjVar, int i) {
        this.b = i;
        this.a = hpjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                hpj hpjVar = this.a;
                hpjVar.a.registerListener(hpjVar.d, hpjVar.c, 3);
                break;
            default:
                hpj hpjVar2 = this.a;
                hpjVar2.a.unregisterListener(hpjVar2.d, hpjVar2.c);
                break;
        }
    }
}
