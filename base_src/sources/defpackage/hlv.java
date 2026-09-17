package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class hlv {
    public boolean b;
    public boolean a = false;
    public int c = Integer.MIN_VALUE;
    public float d = Float.MIN_VALUE;
    public long e = 0;
    public float f = Float.MIN_VALUE;
    public long g = 0;
    public final ConcurrentLinkedQueue h = new ConcurrentLinkedQueue();

    public final void a(hlu hluVar) {
        this.h.add(hluVar);
    }

    public final void b(hlu hluVar) {
        this.h.remove(hluVar);
    }

    public final void c(boolean z) {
        this.a = z;
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((hlu) it.next()).b(z);
        }
    }

    public final boolean d() {
        return System.currentTimeMillis() <= this.e + 5000;
    }
}
