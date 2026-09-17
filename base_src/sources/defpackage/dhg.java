package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class dhg implements dha {
    public static final ouj a = ouj.h("com/google/android/apps/camera/debug/jankmonitor/limited/JankMonitorFacadeLimited");
    private boolean f = false;
    private final ScheduledExecutorService g = mip.bQ("JankReports");
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public jrl d = jrl.UNINITIALIZED;
    protected final mfe e = new mfe(new dhd(this));

    @Override // defpackage.dha
    public final synchronized List a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.c);
        this.c.clear();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            arrayList.add(((dhf) it.next()).a());
        }
        this.b.clear();
        return arrayList;
    }

    @Override // defpackage.dha
    public final void b(long j, long j2) {
        this.e.a(j, j2);
        synchronized (this) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((dhf) it.next()).c++;
            }
        }
    }

    @Override // defpackage.dha
    public final void c() {
    }

    @Override // defpackage.dha
    public final synchronized void d(jrl jrlVar) {
        this.d = jrlVar;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            this.c.add(((dhf) it.next()).a());
        }
        this.b.clear();
        this.b.add(new dhf(jrlVar, 2));
        if (!this.f) {
            this.f = true;
            dhf dhfVar = new dhf(this.d, 3);
            this.b.add(dhfVar);
            this.g.schedule(new dhc(this, dhfVar, 1), 5L, TimeUnit.SECONDS);
        }
    }

    @Override // defpackage.dha
    public final synchronized void e() {
        dhf dhfVar = new dhf(this.d, 4);
        this.b.add(dhfVar);
        this.g.schedule(new dhc(this, dhfVar, 0), 5L, TimeUnit.SECONDS);
    }

    @Override // defpackage.dha
    public final synchronized void f() {
    }
}
