package defpackage;

import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public final class ekr {
    public static final ouj a = ouj.h("com/google/android/apps/camera/imax/cyclops/video/EncoderDrainer");
    public final eko b;
    public final eks c;
    public final Queue d = new LinkedList();
    public final Object e = new Object();
    private Thread m = null;
    private Thread n = null;
    public int f = -1;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public int k = 0;
    public int l = 0;

    public ekr(eko ekoVar, eks eksVar) {
        this.b = ekoVar;
        this.c = eksVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0081 A[Catch: all -> 0x00c2, TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000b, B:10:0x0015, B:14:0x0029, B:16:0x0034, B:17:0x0041, B:20:0x0048, B:21:0x0055, B:22:0x005c, B:25:0x0063, B:29:0x0077, B:31:0x0081, B:32:0x008e, B:35:0x0095, B:36:0x00a2, B:28:0x006a, B:41:0x00b2, B:13:0x001c, B:42:0x00b3, B:23:0x005d, B:24:0x0062), top: B:52:0x0001, inners: #0, #1, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final synchronized void a() {
        if (this.n != null && this.m != null) {
            this.b.b();
            this.g = true;
            try {
                this.m.join(1000L);
            } catch (InterruptedException e) {
                ((oug) ((oug) ((oug) a.b()).h(e)).G((char) 1232)).o("Failed to stop drainer");
            }
            this.i = false;
            if (!this.m.isAlive()) {
                this.m = null;
                this.h = true;
                synchronized (this.e) {
                    this.e.notifyAll();
                    this.n.join(1000L);
                    this.j = false;
                    if (this.n.isAlive()) {
                        ((oug) ((oug) a.b()).G((char) 1233)).o("Stopping writer timed out, forcing stop");
                        this.n.join();
                    }
                    this.n = null;
                    this.c.b();
                    this.b.c();
                    return;
                }
            }
            ((oug) ((oug) a.b()).G((char) 1230)).o("Stopping drainer timed out, forcing stop");
            try {
                this.m.join();
            } catch (InterruptedException e2) {
                ((oug) ((oug) ((oug) a.b()).h(e2)).G((char) 1231)).o("Failed to stop drainer");
            }
            this.m = null;
            this.h = true;
            synchronized (this.e) {
                this.e.notifyAll();
            }
            try {
                this.n.join(1000L);
            } catch (InterruptedException e3) {
                ((oug) ((oug) ((oug) a.b()).h(e3)).G((char) 1235)).o("Failed to stop writer thread");
            }
            this.j = false;
            if (this.n.isAlive()) {
                ((oug) ((oug) a.b()).G((char) 1233)).o("Stopping writer timed out, forcing stop");
                try {
                    this.n.join();
                } catch (InterruptedException e4) {
                    ((oug) ((oug) ((oug) a.b()).h(e4)).G((char) 1234)).o("Failed to stop drainer");
                }
            }
            this.n = null;
            this.c.b();
            this.b.c();
            return;
            throw th;
        }
        ((oug) ((oug) a.b()).G((char) 1229)).o("stop called more than once!");
    }

    public final synchronized boolean b() {
        if (this.n == null && this.m == null) {
            this.f = -1;
            this.g = false;
            this.h = false;
            this.i = true;
            this.j = true;
            this.k = 0;
            this.l = 0;
            if (!this.b.d()) {
                ((oug) ((oug) a.b()).G((char) 1239)).o("Failed to start the encoder.");
                return false;
            }
            ekp ekpVar = new ekp(this);
            this.n = ekpVar;
            ekpVar.start();
            ekq ekqVar = new ekq(this);
            this.m = ekqVar;
            ekqVar.start();
            return true;
        }
        ((oug) ((oug) a.b()).G((char) 1238)).o("start called more than once!");
        return true;
    }
}
