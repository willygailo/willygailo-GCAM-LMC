package defpackage;

import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class hhy implements Runnable {
    private final hia a;
    private final hhz b;
    private final hja c;
    private final ljf d;

    public hhy(hia hiaVar, hhz hhzVar, hja hjaVar, ljf ljfVar) {
        this.a = hiaVar;
        this.b = hhzVar;
        this.c = hjaVar;
        this.d = ljfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.e("TaskDoneWrapper#run");
        try {
            this.c.run();
            this.a.a(this.c);
            hik hikVar = this.b.a;
            synchronized (this.a.f) {
                if (hikVar.b.a(-1) == 0) {
                    hikVar.b.d();
                    Set<mad> set = this.b.b;
                    hia hiaVar = this.a;
                    synchronized (hiaVar.e) {
                        for (mad madVar : set) {
                            if (((hhx) hiaVar.e.get(madVar)) != null && !hiaVar.g.contains(madVar)) {
                                hiaVar.g.add(madVar);
                            }
                        }
                    }
                    Runnable runnable = hikVar.c;
                    if (runnable != null) {
                        this.d.e("TaskDoneWrapper#done#run");
                        Executor executor = this.c.d;
                        if (executor == null) {
                            runnable.run();
                        } else {
                            executor.execute(runnable);
                        }
                        this.d.f();
                    }
                }
            }
            this.d.f();
        } catch (Throwable th) {
            this.a.a(this.c);
            throw th;
        }
    }
}
