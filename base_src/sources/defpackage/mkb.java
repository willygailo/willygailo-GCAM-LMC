package defpackage;

import java.io.FileOutputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class mkb implements mlk {
    public final Executor e;
    public final mkd f;
    private final FileOutputStream g;
    public boolean a = false;
    public boolean b = false;
    public final pih c = pih.f();
    public final Set d = new HashSet();
    private int h = 0;

    public mkb(FileOutputStream fileOutputStream, mkd mkdVar, Executor executor) {
        this.f = mkdVar;
        final Executor executorM = plk.M(executor);
        this.e = new Executor() { // from class: mjw
            @Override // java.util.concurrent.Executor
            public final void execute(final Runnable runnable) {
                final mkb mkbVar = this.a;
                executorM.execute(new Runnable() { // from class: mjv
                    @Override // java.lang.Runnable
                    public final void run() {
                        mkb mkbVar2 = mkbVar;
                        try {
                            runnable.run();
                        } catch (Throwable th) {
                            mkbVar2.c.a(new ExecutionException(th));
                        }
                    }
                });
            }
        };
        this.g = fileOutputStream;
    }

    @Override // defpackage.mlk
    public final synchronized mln a() {
        final mka mkaVar;
        int i = this.h;
        this.h = i + 1;
        mkaVar = new mka(this, i);
        this.e.execute(new Runnable() { // from class: mjt
            @Override // java.lang.Runnable
            public final void run() {
                mkb mkbVar = this.a;
                mkbVar.d.add(mkaVar);
            }
        });
        return mkaVar;
    }

    @Override // defpackage.mlk
    public final pht b() {
        return mlo.a(this.c);
    }

    @Override // defpackage.mlk
    public final void c() {
        this.e.execute(new mjs(this, 1));
    }

    @Override // defpackage.mlk
    public final synchronized void d() {
        this.e.execute(new mjs(this, 0));
    }

    public final void e() {
        if (this.a && this.d.isEmpty() && !this.b) {
            this.f.close();
            this.b = true;
            this.g.close();
            this.c.o(null);
        }
    }
}
