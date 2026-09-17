package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bpu {
    private volatile int a;
    private volatile int b;
    private volatile int c;
    private volatile int d;

    public bpu() {
        a();
    }

    public final synchronized void a() {
        this.d = 1;
        this.c = 0;
        this.a = 0;
        this.b = 0;
    }

    public final synchronized boolean b(hkd hkdVar) {
        boolean z;
        this.a++;
        z = false;
        if (hkdVar.b()) {
            this.c++;
        } else {
            this.c = 0;
        }
        if (this.a - this.b >= 30) {
            if (this.c > 30) {
                if (this.d != 3) {
                    this.d = 3;
                    z = true;
                }
            } else if (this.d != 2) {
                this.d = 2;
            }
            if (z) {
                this.b = this.a;
                this.d = 1;
            }
        }
        return z;
    }
}
