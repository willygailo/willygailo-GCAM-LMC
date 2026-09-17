package defpackage;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public class lky implements lkc, lie {
    private lkx d;
    private lzp e;
    private boolean h;
    public final Object a = new Object();
    public final Set c = new HashSet();
    private final Queue g = new LinkedList();
    public final CountDownLatch b = new CountDownLatch(1);
    private int i = 1;
    private boolean f = false;

    private final void f(boolean z) {
        lkx lkxVar;
        synchronized (this.a) {
            this.h = z | this.h;
            if (!this.f && this.g.size() != 0) {
                this.f = true;
                do {
                    synchronized (this.a) {
                        if (this.g.size() <= 0) {
                            if (this.h) {
                                this.c.clear();
                            }
                            this.f = false;
                            return;
                        } else {
                            lkxVar = (lkx) this.g.remove();
                            this.d = lkxVar;
                            oom oomVarJ = oom.j(this.c);
                            int size = oomVarJ.size();
                            for (int i = 0; i < size; i++) {
                                lkxVar.a((lkc) oomVarJ.get(i));
                            }
                        }
                    }
                } while (lkxVar != null);
            }
        }
    }

    @Override // defpackage.lkc
    public final void a() {
        boolean z;
        lzp lzpVar;
        synchronized (this.a) {
            int i = this.i;
            if (i == 1 || i == 2) {
                this.i = 5;
                this.g.add(new lku(1));
                z = true;
            } else {
                z = false;
            }
            lzpVar = this.e;
            if (lzpVar != null) {
                this.e = null;
            } else {
                lzpVar = null;
            }
        }
        if (z) {
            f(true);
        }
        if (lzpVar != null) {
            lzpVar.close();
        }
        this.b.countDown();
    }

    @Override // defpackage.lkc
    public final void b() {
        boolean z;
        synchronized (this.a) {
            int i = this.i;
            z = false;
            if (i == 1 || i == 2) {
                this.i = 3;
                this.g.add(new lku(0));
                z = true;
            }
        }
        if (z) {
            f(true);
        }
        a();
    }

    @Override // defpackage.lkc
    public final void c(lju ljuVar) {
        boolean z;
        synchronized (this.a) {
            int i = this.i;
            if (i == 1 || i == 2) {
                this.i = 4;
                this.g.add(new lkv(ljuVar));
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            f(true);
        }
        a();
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // defpackage.lkc
    public void d(lzp lzpVar) {
        boolean z;
        boolean z2;
        synchronized (this.a) {
            z = true;
            if (this.i == 1) {
                this.i = 2;
                this.e = new lkt(lzpVar, this);
                this.g.add(new lkw(this.e));
                z2 = false;
            } else {
                z2 = true;
                z = false;
            }
        }
        if (z) {
            f(false);
        }
        if (z2) {
            if (lzpVar != null) {
                lzpVar.close();
            }
            a();
        }
    }

    public final void e(lkc lkcVar) {
        lkx lkxVar;
        synchronized (this.a) {
            int i = this.i;
            if (i != 3 && i != 4 && i != 5) {
                this.c.add(lkcVar);
            }
            lkxVar = this.d;
        }
        if (lkxVar != null) {
            lkxVar.a(lkcVar);
        }
    }
}
