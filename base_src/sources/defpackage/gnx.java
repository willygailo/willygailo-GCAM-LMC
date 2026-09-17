package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gnx implements Runnable {
    public final /* synthetic */ gny a;
    private final /* synthetic */ int b;

    public /* synthetic */ gnx(gny gnyVar, int i) {
        this.b = i;
        this.a = gnyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                gny gnyVar = this.a;
                gnyVar.c();
                if (gnyVar.d.c.get()) {
                    synchronized (gnyVar) {
                        boolean z = true;
                        int i = gnyVar.b + 1;
                        gnyVar.b = i;
                        if (i > gnyVar.a) {
                            z = false;
                        }
                        obr.aQ(z);
                        int i2 = gnyVar.b;
                        int i3 = gnyVar.a;
                        float f = i2 / i3;
                        long j = gnyVar.c;
                        if (j > 0) {
                            gnyVar.d.a.b.F(f, j);
                        } else {
                            gnyVar.d.a.b.E(f, i3 - i2);
                        }
                        break;
                    }
                    return;
                }
                return;
            default:
                this.a.c();
                return;
        }
    }
}
