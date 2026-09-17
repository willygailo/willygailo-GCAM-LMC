package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class bwz implements las {
    public static final ouj a = ouj.h("com/google/android/apps/camera/async/mainthread/EagerMainThreadExecutor");
    public final BlockingQueue b;
    public final ThreadLocal c = new bwy();
    public final ArrayList d = new ArrayList();
    private final las e;

    public bwz(las lasVar, int i) {
        this.b = new ArrayBlockingQueue(i);
        this.e = lasVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (!this.b.offer(runnable)) {
            this.e.execute(runnable);
        } else {
            if (((Boolean) this.c.get()).booleanValue()) {
                return;
            }
            this.e.execute(new Runnable() { // from class: bwx
                @Override // java.lang.Runnable
                public final void run() {
                    bwz bwzVar = this.a;
                    obr.ap(lar.d());
                    obr.ap(bwzVar.d.isEmpty());
                    try {
                        bwzVar.c.set(Boolean.TRUE);
                        int i = 0;
                        while (true) {
                            i++;
                            if (i <= 16) {
                                if (bwzVar.b.drainTo(bwzVar.d) == 0) {
                                    break;
                                }
                                Iterator it = bwzVar.d.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                bwzVar.d.clear();
                            } else {
                                ((oug) ((oug) bwz.a.c()).G(146)).o("MainThreadExecutor detected possible infinite loop.");
                                break;
                            }
                        }
                    } finally {
                        bwzVar.c.set(Boolean.FALSE);
                    }
                }
            });
        }
    }
}
