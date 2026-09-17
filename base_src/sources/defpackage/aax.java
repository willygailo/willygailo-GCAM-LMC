package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aax {
    public boolean a;
    public aaw b;
    public boolean c;

    public final void a(aaw aawVar) {
        synchronized (this) {
            while (this.c) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
            if (this.b == aawVar) {
                return;
            }
            this.b = aawVar;
            if (this.a && aawVar != null) {
                aawVar.a();
            }
        }
    }
}
