package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public final class ofh {
    private final Object a = new Object();
    private Queue b;
    private boolean c;

    public ofh() {
    }

    public ofh(byte[] bArr) {
    }

    public final void a(ofg ofgVar) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(ofgVar);
        }
    }

    public final void b(off offVar) {
        ofg ofgVar;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        ofgVar = (ofg) this.b.poll();
                        if (ofgVar == null) {
                            this.c = false;
                            return;
                        }
                    }
                    ofgVar.a(offVar);
                }
            }
        }
    }

    public final void c(kvl kvlVar) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(kvlVar);
        }
    }

    public final void d(kvk kvkVar) {
        kvl kvlVar;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        kvlVar = (kvl) this.b.poll();
                        if (kvlVar == null) {
                            this.c = false;
                            return;
                        }
                    }
                    kvlVar.a(kvkVar);
                }
            }
        }
    }
}
