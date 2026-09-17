package defpackage;

import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public final class gjw implements lie {
    private int d;
    private final lce e;
    private final Object b = new Object();
    private volatile boolean f = false;
    private final Queue c = new LinkedList();
    public final gsc a = new gsc();

    public gjw(int i) {
        this.d = i;
        this.e = new lce(Integer.valueOf(this.d));
    }

    private final void c(gjt gjtVar, gsa gsaVar, pih pihVar) {
        plk.af(gjtVar.a(), new gju(this, pihVar, gsaVar), pgr.INSTANCE);
    }

    public final pht a(gjt gjtVar) {
        if (this.f) {
            return gjtVar.b();
        }
        pih pihVarF = pih.f();
        gsc gscVar = this.a;
        synchronized (gscVar.a) {
            gscVar.fB(Integer.valueOf(((Integer) gscVar.d).intValue() + 1));
        }
        gsb gsbVar = new gsb(gscVar);
        synchronized (this.b) {
            if (this.d <= 0) {
                this.c.add(new gjv(gjtVar, gsbVar, pihVarF));
                return pihVarF;
            }
            obr.aQ(this.c.isEmpty());
            int i = this.d - 1;
            this.d = i;
            this.e.fB(Integer.valueOf(i));
            c(gjtVar, gsbVar, pihVarF);
            return pihVarF;
        }
    }

    public final void b() {
        synchronized (this.b) {
            gjv gjvVar = (gjv) this.c.poll();
            if (gjvVar == null) {
                int i = this.d + 1;
                this.d = i;
                this.e.fB(Integer.valueOf(i));
            } else {
                c(gjvVar.a, gjvVar.b, gjvVar.c);
            }
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.f = true;
    }
}
