package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class luf implements Runnable {
    final /* synthetic */ lug a;
    private final /* synthetic */ int b;

    public luf(lug lugVar, int i) {
        this.b = i;
        this.a = lugVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                lug lugVar = this.a;
                boolean z = false;
                while (true) {
                    lun lunVar = (lun) lugVar.j.poll();
                    if (lunVar == null) {
                        if (z) {
                            lugVar.a();
                            return;
                        }
                        return;
                    } else {
                        synchronized (lugVar) {
                            if (lugVar.k) {
                                lunVar.k(null);
                            } else {
                                lugVar.i.add(lunVar);
                                z = true;
                            }
                        }
                    }
                }
                break;
            default:
                this.a.a();
                return;
        }
    }
}
