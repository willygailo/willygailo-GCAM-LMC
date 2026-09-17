package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ofc implements Runnable {
    final /* synthetic */ off a;
    final /* synthetic */ ofd b;

    public ofc(ofd ofdVar, off offVar) {
        this.b = ofdVar;
        this.a = offVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.b.a) {
            jta jtaVar = this.b.b;
            off offVar = this.a;
            synchronized (offVar.a) {
                ohh.a(offVar.c, "Task is not yet complete");
                Exception exc = offVar.e;
                if (exc != null) {
                    throw new ofe(exc);
                }
                obj = offVar.d;
            }
            jtb jtbVar = jtaVar.a;
            jtbVar.d = (odr) obj;
            if (((odr) obj).c != 11) {
                switch (((odr) obj).b) {
                    case 2:
                        if (((odr) obj).b()) {
                            jtbVar.c.i(((odr) obj).a);
                        }
                        break;
                    case 3:
                        jtbVar.g();
                        jtbVar.c.x();
                        break;
                }
            } else {
                jtbVar.c.r();
            }
        }
    }
}
