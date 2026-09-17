package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gcs implements Runnable {
    public final /* synthetic */ gdj a;
    private final /* synthetic */ int b;

    public /* synthetic */ gcs(gdj gdjVar, int i) {
        this.b = i;
        this.a = gdjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = true;
        switch (this.b) {
            case 0:
                gdj gdjVar = this.a;
                synchronized (gdjVar) {
                    gdjVar.c = false;
                    gdjVar.r();
                    break;
                }
                return;
            case 1:
                this.a.q();
                return;
            case 2:
                gdj gdjVar2 = this.a;
                synchronized (gdjVar2) {
                    gdjVar2.g++;
                    break;
                }
                return;
            default:
                gdj gdjVar3 = this.a;
                synchronized (gdjVar3) {
                    int i = gdjVar3.g - 1;
                    gdjVar3.g = i;
                    if (i < 0) {
                        z = false;
                    }
                    obr.aQ(z);
                    gdjVar3.r();
                    break;
                }
                return;
        }
    }
}
