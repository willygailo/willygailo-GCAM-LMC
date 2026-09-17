package defpackage;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
final class aow implements Runnable {
    private final aox a;

    public aow(aox aoxVar) {
        this.a = aoxVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0083 A[Catch: all -> 0x0093, TryCatch #2 {, blocks: (B:4:0x0012, B:6:0x0017, B:8:0x003b, B:9:0x003f, B:10:0x0046, B:11:0x0047, B:12:0x004f, B:16:0x005a, B:18:0x0062, B:19:0x0064, B:23:0x006f, B:25:0x007c, B:33:0x008e, B:29:0x0082, B:30:0x0083, B:32:0x008b, B:37:0x0092, B:20:0x0065, B:21:0x006c, B:13:0x0050, B:14:0x0057), top: B:45:0x0012, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008b A[Catch: all -> 0x0093, TryCatch #2 {, blocks: (B:4:0x0012, B:6:0x0017, B:8:0x003b, B:9:0x003f, B:10:0x0046, B:11:0x0047, B:12:0x004f, B:16:0x005a, B:18:0x0062, B:19:0x0064, B:23:0x006f, B:25:0x007c, B:33:0x008e, B:29:0x0082, B:30:0x0083, B:32:0x008b, B:37:0x0092, B:20:0x0065, B:21:0x006c, B:13:0x0050, B:14:0x0057), top: B:45:0x0012, inners: #0, #1 }] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        aox aoxVar = this.a;
        kus.l().h(new Throwable[0]);
        aoxVar.b();
        synchronized (aoxVar.g) {
            if (aoxVar.h != null) {
                kus kusVarL = kus.l();
                String.format("Removing command %s", aoxVar.h);
                kusVarL.h(new Throwable[0]);
                if (!((Intent) aoxVar.g.remove(0)).equals(aoxVar.h)) {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
                aoxVar.h = null;
            }
            arq arqVar = aoxVar.j.a;
            aoo aooVar = aoxVar.f;
            synchronized (aooVar.d) {
                z = !aooVar.c.isEmpty();
            }
            if (!z && aoxVar.g.isEmpty()) {
                synchronized (arqVar.b) {
                    z2 = !arqVar.a.isEmpty();
                }
                if (!z2) {
                    kus.l().h(new Throwable[0]);
                    aov aovVar = aoxVar.i;
                    if (aovVar != null) {
                        aovVar.a();
                    }
                } else if (!aoxVar.g.isEmpty()) {
                    aoxVar.e();
                }
            } else if (!aoxVar.g.isEmpty()) {
                aoxVar.e();
            }
        }
    }
}
