package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class lnm extends mip {
    private boolean a = true;

    public final void w() {
        synchronized (this) {
            while (this.a) {
                wait();
            }
        }
    }

    protected final void x() {
        synchronized (this) {
            this.a = false;
            notifyAll();
        }
    }
}
