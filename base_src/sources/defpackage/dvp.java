package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class dvp {
    private static final ouj b = ouj.h("com/google/android/apps/camera/framestore/MetadataFrameStore");
    public final juj a;
    private final Map c;

    public dvp() {
        new ljd();
        this(null);
    }

    public dvp(byte[] bArr) {
        this.a = mip.ed(68);
        this.c = new HashMap();
    }

    public final hjz a(long j) {
        return (hjz) this.a.a(enl.D(j));
    }

    public final hjz b() {
        lie lieVar;
        juj jujVar = this.a;
        synchronized (jujVar.a) {
            if (jujVar.b.isEmpty()) {
                lieVar = null;
            } else {
                List listD = jujVar.c.b((Long) jujVar.b.l().b());
                lieVar = (lie) listD.get(listD.size() - 1);
            }
        }
        return (hjz) lieVar;
    }

    public final List c() {
        return this.a.d();
    }

    public final synchronized void d(final hjz hjzVar) {
        for (final Map.Entry entry : this.c.entrySet()) {
            try {
                ((Executor) entry.getValue()).execute(new Runnable() { // from class: dvo
                    @Override // java.lang.Runnable
                    public final void run() {
                        Map.Entry entry2 = entry;
                        ((dvq) entry2.getKey()).k(hjzVar);
                    }
                });
            } catch (RejectedExecutionException e) {
                ((oug) ((oug) ((oug) b.b()).h(e)).G((char) 941)).r("RejectedExecutionException on %s", entry.getKey());
            }
        }
    }

    public final synchronized void e(dvq dvqVar) {
        if (this.c.containsKey(dvqVar)) {
            this.c.remove(dvqVar);
        }
    }

    public final synchronized void f(dvq dvqVar, Executor executor) {
        this.c.put(dvqVar, executor);
    }
}
