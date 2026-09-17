package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class off {
    public final Object a;
    public final ofh b;
    public boolean c;
    public Object d;
    public Exception e;

    public off() {
    }

    public off(byte[] bArr) {
        this.a = new Object();
        this.b = new ofh();
    }

    public final void a() {
        synchronized (this.a) {
            if (this.c) {
                this.b.b(this);
            }
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.c && this.e == null) {
                z = true;
            }
        }
        return z;
    }
}
