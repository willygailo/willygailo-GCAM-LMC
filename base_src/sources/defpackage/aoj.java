package defpackage;

import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class aoj implements Runnable {
    static final String a = kus.g("WorkerWrapper");
    public static final /* synthetic */ int j = 0;
    final Context b;
    aqt c;
    public volatile boolean f;
    final aso g;
    private final String k;
    private final List l;
    private final amj m;
    private final apx n;
    private final WorkDatabase o;
    private final aqu p;
    private List q;
    private String r;
    private final arg s;
    private final arg t;
    ge i = ge.d();
    final asl h = asl.h();
    pht e = null;
    ListenableWorker d = null;

    public aoj(aoi aoiVar) {
        this.b = aoiVar.a;
        this.g = aoiVar.g;
        this.n = aoiVar.b;
        this.k = aoiVar.e;
        this.l = aoiVar.f;
        this.m = aoiVar.c;
        WorkDatabase workDatabase = aoiVar.d;
        this.o = workDatabase;
        this.p = workDatabase.s();
        this.t = workDatabase.z();
        this.s = workDatabase.w();
    }

    private final void d() {
        this.o.h();
        try {
            this.p.k(1, this.k);
            this.p.g(this.k, System.currentTimeMillis());
            this.p.j(this.k, -1L);
            this.o.j();
        } finally {
            this.o.i();
            f(true);
        }
    }

    private final void e() {
        this.o.h();
        try {
            this.p.g(this.k, System.currentTimeMillis());
            this.p.k(1, this.k);
            aqu aquVar = this.p;
            String str = this.k;
            ((are) aquVar).a.g();
            ake akeVarE = ((are) aquVar).d.e();
            if (str == null) {
                akeVarE.f(1);
            } else {
                akeVarE.g(1, str);
            }
            ((are) aquVar).a.h();
            try {
                akeVarE.a();
                ((are) aquVar).a.j();
                ((are) aquVar).a.i();
                ((are) aquVar).d.f(akeVarE);
                this.p.j(this.k, -1L);
                this.o.j();
                this.o.i();
                f(false);
            } catch (Throwable th) {
                ((are) aquVar).a.i();
                ((are) aquVar).d.f(akeVarE);
                throw th;
            }
        } catch (Throwable th2) {
            this.o.i();
            f(false);
            throw th2;
        }
    }

    private final void f(boolean z) {
        ListenableWorker listenableWorker;
        this.o.h();
        try {
            aqu aquVarS = this.o.s();
            ais aisVarA = ais.a("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
            ((are) aquVarS).a.g();
            Cursor cursorI = fy.i(((are) aquVarS).a, aisVarA, false);
            try {
                boolean z2 = cursorI.moveToFirst() && cursorI.getInt(0) != 0;
                cursorI.close();
                aisVarA.j();
                if (!z2) {
                    arn.a(this.b, RescheduleReceiver.class, false);
                }
                if (z) {
                    this.p.k(1, this.k);
                    this.p.j(this.k, -1L);
                }
                if (this.c != null && (listenableWorker = this.d) != null && listenableWorker.i()) {
                    apx apxVar = this.n;
                    String str = this.k;
                    synchronized (((ann) apxVar).f) {
                        ((ann) apxVar).c.remove(str);
                        ((ann) apxVar).d();
                    }
                }
                this.o.j();
                this.o.i();
                this.h.e(Boolean.valueOf(z));
            } catch (Throwable th) {
                cursorI.close();
                aisVarA.j();
                throw th;
            }
        } catch (Throwable th2) {
            this.o.i();
            throw th2;
        }
    }

    private final void g() {
        int iH = this.p.h(this.k);
        if (iH == 2) {
            kus kusVarL = kus.l();
            String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.k);
            kusVarL.h(new Throwable[0]);
            f(true);
            return;
        }
        kus kusVarL2 = kus.l();
        String.format("Status for %s is %s; not doing any work", this.k, gg.e(iH));
        kusVarL2.h(new Throwable[0]);
        f(false);
    }

    final void a() {
        if (!c()) {
            this.o.h();
            try {
                int iH = this.p.h(this.k);
                aqq aqqVarV = this.o.v();
                String str = this.k;
                aqqVarV.a.g();
                ake akeVarE = aqqVarV.b.e();
                if (str == null) {
                    akeVarE.f(1);
                } else {
                    akeVarE.g(1, str);
                }
                aqqVarV.a.h();
                try {
                    akeVarE.a();
                    aqqVarV.a.j();
                    aqqVarV.a.i();
                    aqqVarV.b.f(akeVarE);
                    if (iH == 0) {
                        f(false);
                    } else if (iH == 2) {
                        ge geVar = this.i;
                        if (geVar instanceof amw) {
                            kus.l();
                            String.format("Worker result SUCCESS for %s", this.r);
                            kus.j(new Throwable[0]);
                            if (this.c.d()) {
                                e();
                            } else {
                                this.o.h();
                                try {
                                    this.p.k(3, this.k);
                                    this.p.f(this.k, ((amw) this.i).a);
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    for (String str2 : this.t.d(this.k)) {
                                        if (this.p.h(str2) == 5) {
                                            arg argVar = this.t;
                                            ais aisVarA = ais.a("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
                                            if (str2 == null) {
                                                aisVarA.f(1);
                                            } else {
                                                aisVarA.g(1, str2);
                                            }
                                            argVar.a.g();
                                            Cursor cursorI = fy.i(argVar.a, aisVarA, false);
                                            try {
                                                boolean z = cursorI.moveToFirst() && cursorI.getInt(0) != 0;
                                                cursorI.close();
                                                aisVarA.j();
                                                if (z) {
                                                    kus.l();
                                                    String.format("Setting status to enqueued for %s", str2);
                                                    kus.j(new Throwable[0]);
                                                    this.p.k(1, str2);
                                                    this.p.g(str2, jCurrentTimeMillis);
                                                }
                                            } catch (Throwable th) {
                                                cursorI.close();
                                                aisVarA.j();
                                                throw th;
                                            }
                                        }
                                    }
                                    this.o.j();
                                    this.o.i();
                                    f(false);
                                } catch (Throwable th2) {
                                    this.o.i();
                                    f(false);
                                    throw th2;
                                }
                            }
                        } else if (geVar instanceof amv) {
                            kus.l();
                            String.format("Worker result RETRY for %s", this.r);
                            kus.j(new Throwable[0]);
                            d();
                        } else {
                            kus.l();
                            String.format("Worker result FAILURE for %s", this.r);
                            kus.j(new Throwable[0]);
                            if (this.c.d()) {
                                e();
                            } else {
                                b();
                            }
                        }
                    } else if (!gg.f(iH)) {
                        d();
                    }
                    this.o.j();
                    this.o.i();
                } catch (Throwable th3) {
                    aqqVarV.a.i();
                    aqqVarV.b.f(akeVarE);
                    throw th3;
                }
            } catch (Throwable th4) {
                this.o.i();
                throw th4;
            }
        }
        List list = this.l;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((ano) it.next()).b(this.k);
            }
            anp.b(this.m, this.o, this.l);
        }
    }

    final void b() {
        this.o.h();
        try {
            String str = this.k;
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (!linkedList.isEmpty()) {
                String str2 = (String) linkedList.remove();
                if (this.p.h(str2) != 6) {
                    this.p.k(4, str2);
                }
                linkedList.addAll(this.t.d(str2));
            }
            this.p.f(this.k, ((amu) this.i).a);
            this.o.j();
        } finally {
            this.o.i();
            f(false);
        }
    }

    public final boolean c() {
        if (!this.f) {
            return false;
        }
        kus kusVarL = kus.l();
        String.format("Work interrupted for %s", this.r);
        kusVarL.h(new Throwable[0]);
        int iH = this.p.h(this.k);
        if (iH == 0) {
            f(false);
        } else {
            f(!gg.f(iH));
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WorkDatabase workDatabase;
        amq amqVarA;
        List<String> listA = this.s.a(this.k);
        this.q = listA;
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.k);
        sb.append(", tags={ ");
        boolean z = false;
        boolean z2 = true;
        for (String str : listA) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append(str);
            z2 = false;
        }
        sb.append(" } ]");
        this.r = sb.toString();
        if (c()) {
            return;
        }
        this.o.h();
        try {
            aqt aqtVarA = this.p.a(this.k);
            this.c = aqtVarA;
            if (aqtVarA == null) {
                kus.l();
                kus.i(a, String.format("Didn't find WorkSpec for id %s", this.k), new Throwable[0]);
                f(false);
                this.o.j();
                workDatabase = this.o;
            } else {
                if (aqtVarA.p == 1) {
                    if (aqtVarA.d() || this.c.c()) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        aqt aqtVar = this.c;
                        if (aqtVar.l != 0 && jCurrentTimeMillis < aqtVar.a()) {
                            kus kusVarL = kus.l();
                            String.format("Delaying execution for %s because it is being executed before schedule.", this.c.b);
                            kusVarL.h(new Throwable[0]);
                            f(true);
                            this.o.j();
                            workDatabase = this.o;
                        }
                    }
                    this.o.j();
                    this.o.i();
                    if (this.c.d()) {
                        amqVarA = this.c.d;
                    } else {
                        amt amtVarB = amt.b(this.c.c);
                        if (amtVarB == null) {
                            kus.l();
                            kus.i(a, String.format("Could not create Input Merger %s", this.c.c), new Throwable[0]);
                            b();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.c.d);
                        aqu aquVar = this.p;
                        String str2 = this.k;
                        ais aisVarA = ais.a("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
                        if (str2 == null) {
                            aisVarA.f(1);
                        } else {
                            aisVarA.g(1, str2);
                        }
                        are areVar = (are) aquVar;
                        areVar.a.g();
                        Cursor cursorI = fy.i(areVar.a, aisVarA, false);
                        try {
                            ArrayList arrayList2 = new ArrayList(cursorI.getCount());
                            while (cursorI.moveToNext()) {
                                arrayList2.add(amq.a(cursorI.getBlob(0)));
                            }
                            cursorI.close();
                            aisVarA.j();
                            arrayList.addAll(arrayList2);
                            amqVarA = amtVarB.a(arrayList);
                        } catch (Throwable th) {
                            cursorI.close();
                            aisVarA.j();
                            throw th;
                        }
                    }
                    UUID uuidFromString = UUID.fromString(this.k);
                    List list = this.q;
                    int i = this.c.j;
                    amj amjVar = this.m;
                    Executor executor = amjVar.a;
                    aso asoVar = this.g;
                    ani aniVar = amjVar.c;
                    int i2 = arx.a;
                    new arw(this.o);
                    WorkerParameters workerParameters = new WorkerParameters(uuidFromString, amqVarA, list, i, executor, asoVar, aniVar);
                    if (this.d == null) {
                        this.d = this.m.c.b(this.b, this.c.b, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.d;
                    if (listenableWorker == null) {
                        kus.l();
                        kus.i(a, String.format("Could not create Worker %s", this.c.b), new Throwable[0]);
                        b();
                        return;
                    }
                    if (listenableWorker.f) {
                        kus.l();
                        kus.i(a, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.c.b), new Throwable[0]);
                        b();
                        return;
                    }
                    listenableWorker.f = true;
                    this.o.h();
                    try {
                        if (this.p.h(this.k) == 1) {
                            this.p.k(2, this.k);
                            aqu aquVar2 = this.p;
                            String str3 = this.k;
                            ((are) aquVar2).a.g();
                            ake akeVarE = ((are) aquVar2).c.e();
                            if (str3 == null) {
                                akeVarE.f(1);
                            } else {
                                akeVarE.g(1, str3);
                            }
                            ((are) aquVar2).a.h();
                            try {
                                akeVarE.a();
                                ((are) aquVar2).a.j();
                                ((are) aquVar2).a.i();
                                ((are) aquVar2).c.f(akeVarE);
                                z = true;
                            } catch (Throwable th2) {
                                ((are) aquVar2).a.i();
                                ((are) aquVar2).c.f(akeVarE);
                                throw th2;
                            }
                        }
                        this.o.j();
                        this.o.i();
                        if (!z) {
                            g();
                            return;
                        }
                        if (c()) {
                            return;
                        }
                        asl aslVarH = asl.h();
                        arv arvVar = new arv(this.c);
                        this.g.c.execute(arvVar);
                        asl aslVar = arvVar.b;
                        aslVar.d(new aog(this, aslVar, aslVarH), this.g.c);
                        aslVarH.d(new aoh(this, aslVarH, this.r), this.g.a);
                        return;
                    } catch (Throwable th3) {
                        this.o.i();
                        throw th3;
                    }
                }
                g();
                this.o.j();
                kus kusVarL2 = kus.l();
                String.format("%s is not in ENQUEUED state. Nothing more to do.", this.c.b);
                kusVarL2.h(new Throwable[0]);
                workDatabase = this.o;
            }
            workDatabase.i();
        } catch (Throwable th4) {
            this.o.i();
            throw th4;
        }
    }
}
