package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hze implements Runnable {
    public final /* synthetic */ hzi a;
    private final /* synthetic */ int b;

    public /* synthetic */ hze(hzi hziVar, int i) {
        this.b = i;
        this.a = hziVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                hzi hziVar = this.a;
                synchronized (hziVar.e) {
                    hziVar.f--;
                    break;
                }
                return;
            default:
                hzi hziVar2 = this.a;
                hziVar2.d.execute(new hze(hziVar2, 0));
                return;
        }
    }
}
