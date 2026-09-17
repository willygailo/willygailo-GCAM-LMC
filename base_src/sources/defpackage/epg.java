package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class epg implements Runnable {
    public final /* synthetic */ epj a;
    public final /* synthetic */ epi b;
    private final /* synthetic */ int c;

    public /* synthetic */ epg(epj epjVar, epi epiVar, int i) {
        this.c = i;
        this.a = epjVar;
        this.b = epiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                epj epjVar = this.a;
                epi epiVar = this.b;
                synchronized (epjVar.e) {
                    epjVar.b.remove(epiVar);
                    break;
                }
                return;
            default:
                epj epjVar2 = this.a;
                epi epiVar2 = this.b;
                synchronized (epjVar2.e) {
                    epjVar2.b.add(epiVar2);
                    break;
                }
                return;
        }
    }
}
