package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class muh implements Executor {
    public final phw a;
    private final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    private volatile boolean c = false;
    private final AtomicBoolean d = new AtomicBoolean();

    public muh(phw phwVar, mwe mweVar) {
        this.a = phwVar;
        mus musVar = new mus(mweVar);
        mweVar.a(musVar);
        musVar.execute(new Runnable() { // from class: muf
            @Override // java.lang.Runnable
            public final void run() {
                muh muhVar = this.a;
                muhVar.a.e(new mug(muhVar, 0), 3000L, TimeUnit.MILLISECONDS);
            }
        });
    }

    private final void b() {
        while (true) {
            Runnable runnable = (Runnable) this.b.poll();
            if (runnable == null) {
                return;
            } else {
                this.a.execute(runnable);
            }
        }
    }

    public final void a() {
        this.c = true;
        b();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.c) {
            this.a.execute(runnable);
            return;
        }
        this.b.add(runnable);
        if (this.c) {
            b();
        } else {
            if (this.d.getAndSet(true)) {
                return;
            }
            this.a.e(new mug(this, 1), 7000L, TimeUnit.MILLISECONDS);
        }
    }
}
