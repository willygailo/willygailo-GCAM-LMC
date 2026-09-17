package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ann implements ank, apx {
    public static final String a = kus.g("Processor");
    public final Context b;
    private final amj g;
    private final WorkDatabase h;
    private final List i;
    private final aso k;
    public final Map d = new HashMap();
    public final Map c = new HashMap();
    public final Set e = new HashSet();
    private final List j = new ArrayList();
    public final Object f = new Object();

    public ann(Context context, amj amjVar, aso asoVar, WorkDatabase workDatabase, List list) {
        this.b = context;
        this.g = amjVar;
        this.k = asoVar;
        this.h = workDatabase;
        this.i = list;
    }

    public static boolean e(String str, aoj aojVar) {
        boolean zIsDone;
        if (aojVar == null) {
            kus kusVarL = kus.l();
            String.format("WorkerWrapper could not be found for %s", str);
            kusVarL.h(new Throwable[0]);
            return false;
        }
        aojVar.f = true;
        aojVar.c();
        pht phtVar = aojVar.e;
        if (phtVar != null) {
            zIsDone = phtVar.isDone();
            aojVar.e.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = aojVar.d;
        if (listenableWorker == null || zIsDone) {
            String.format("WorkSpec %s is already done. Not interrupting.", aojVar.c);
            kus.l().h(new Throwable[0]);
        } else {
            listenableWorker.h();
        }
        kus kusVarL2 = kus.l();
        String.format("WorkerWrapper interrupted for %s", str);
        kusVarL2.h(new Throwable[0]);
        return true;
    }

    @Override // defpackage.ank
    public final void a(String str, boolean z) {
        synchronized (this.f) {
            this.d.remove(str);
            kus kusVarL = kus.l();
            String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z));
            kusVarL.h(new Throwable[0]);
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                ((ank) it.next()).a(str, z);
            }
        }
    }

    public final void b(ank ankVar) {
        synchronized (this.f) {
            this.j.add(ankVar);
        }
    }

    public final void c(ank ankVar) {
        synchronized (this.f) {
            this.j.remove(ankVar);
        }
    }

    public final void d() {
        synchronized (this.f) {
            if (this.c.isEmpty()) {
                try {
                    this.b.startService(aqa.b(this.b));
                } catch (Throwable th) {
                    kus.l();
                    kus.i(a, "Unable to stop foreground service", th);
                }
            }
        }
    }

    public final boolean f(String str) {
        boolean z;
        synchronized (this.f) {
            z = true;
            if (!this.d.containsKey(str) && !this.c.containsKey(str)) {
                z = false;
            }
        }
        return z;
    }

    public final boolean g(String str) {
        synchronized (this.f) {
            if (f(str)) {
                kus kusVarL = kus.l();
                String.format("Work %s is already enqueued for processing", str);
                kusVarL.h(new Throwable[0]);
                return false;
            }
            aoi aoiVar = new aoi(this.b, this.g, this.k, this, this.h, str);
            aoiVar.f = this.i;
            aoj aojVar = new aoj(aoiVar);
            asl aslVar = aojVar.h;
            aslVar.d(new anm(this, str, aslVar), this.k.c);
            this.d.put(str, aojVar);
            this.k.a.execute(aojVar);
            kus kusVarL2 = kus.l();
            String.format("%s: processing %s", getClass().getSimpleName(), str);
            kusVarL2.h(new Throwable[0]);
            return true;
        }
    }
}
