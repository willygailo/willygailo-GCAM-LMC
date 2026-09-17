package defpackage;

import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public final class bfd {
    private static final Queue a = bmf.h(0);
    private int b;
    private int c;
    private Object d;

    private bfd() {
    }

    public static bfd b(Object obj) {
        bfd bfdVar;
        Queue queue = a;
        synchronized (queue) {
            bfdVar = (bfd) queue.poll();
        }
        if (bfdVar == null) {
            bfdVar = new bfd();
        }
        bfdVar.d = obj;
        bfdVar.c = 0;
        bfdVar.b = 0;
        return bfdVar;
    }

    public final void a() {
        Queue queue = a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bfd) {
            bfd bfdVar = (bfd) obj;
            int i = bfdVar.c;
            int i2 = bfdVar.b;
            if (this.d.equals(bfdVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
