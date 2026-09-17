package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class ekp extends Thread {
    final /* synthetic */ ekr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekp(ekr ekrVar) {
        super("EncoderDrainerWriteThread");
        this.a = ekrVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        mss mssVar;
        ekr ekrVar = this.a;
        while (ekrVar.j) {
            synchronized (ekrVar.e) {
                while (ekrVar.d.size() > 100) {
                    ((oug) ((oug) ekr.a.b()).G(1237)).o("Dropping frames in drainer!");
                    ekrVar.d.poll();
                    ekrVar.k++;
                }
                mssVar = (mss) ekrVar.d.poll();
            }
            if (mssVar != null) {
                ekrVar.c.c(ekrVar.f, mssVar.a, mssVar.b);
            }
            synchronized (ekrVar.e) {
                if (ekrVar.d.isEmpty() && ekrVar.h) {
                    return;
                }
                while (ekrVar.d.isEmpty() && !ekrVar.h) {
                    try {
                        ekrVar.e.wait();
                    } catch (InterruptedException e) {
                        ((oug) ((oug) ((oug) ekr.a.b()).h(e)).G(1236)).o("Interrupted during wait");
                    }
                }
                throw th;
            }
        }
    }
}
