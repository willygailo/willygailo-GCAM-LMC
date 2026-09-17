package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class bnn extends mip {
    public final Set a;
    public final bns b;
    private final Executor c;
    private boolean d = false;

    public bnn(lap lapVar, dyx dyxVar, ghx ghxVar, Executor executor, lis lisVar) {
        String strValueOf = String.valueOf(ghxVar.k().name());
        bns bnsVar = new bns(ghxVar, dyxVar, lisVar.a("gyro-scn-ch"), strValueOf.length() != 0 ? "scene-ch-".concat(strValueOf) : new String("scene-ch-"));
        this.b = bnsVar;
        this.a = new HashSet();
        this.c = executor;
        lapVar.c(bnsVar);
    }

    public final synchronized void a(Runnable runnable) {
        this.a.add(runnable);
    }

    @Override // defpackage.mip
    public final synchronized void b(final lzv lzvVar) {
        if (this.d) {
            this.c.execute(new Runnable() { // from class: bnm
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    HashSet hashSet;
                    bnn bnnVar = this.a;
                    bnnVar.b.a(lzvVar);
                    if (bnnVar.b.c()) {
                        synchronized (bnnVar) {
                            hashSet = new HashSet(bnnVar.a);
                        }
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ((Runnable) it.next()).run();
                        }
                    }
                }
            });
        }
    }

    public final synchronized void c(Runnable runnable) {
        this.a.remove(runnable);
    }

    public final synchronized void d() {
        this.d = true;
        this.b.b();
    }

    public final synchronized void e() {
        this.d = false;
        this.b.close();
    }
}
