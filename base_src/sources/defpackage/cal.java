package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class cal implements bvv {
    private final Executor a;
    private final AtomicBoolean b = new AtomicBoolean(false);
    public volatile pih h = pih.f();

    protected cal(Executor executor) {
        this.a = executor;
    }

    protected abstract void a();

    @Override // defpackage.bvv
    public final /* synthetic */ String c() {
        return aas.g(this);
    }

    @Override // defpackage.bvv
    public final pht fz() {
        if (!this.b.compareAndSet(false, true)) {
            return this.h;
        }
        this.a.execute(new Runnable() { // from class: cak
            @Override // java.lang.Runnable
            public final void run() {
                cal calVar = this.a;
                try {
                    calVar.a();
                    calVar.h.o(true);
                } catch (Exception e) {
                    calVar.h.a(e);
                }
            }
        });
        return this.h;
    }
}
