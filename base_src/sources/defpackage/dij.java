package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.apps.camera.debug.shottracker.db.ShotDatabase;
import j$.time.Clock;
import j$.time.Duration;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class dij implements dia {
    static final Duration a = Duration.ofMinutes(2);
    static final Duration b = Duration.ofHours(6);
    static final Duration c = Duration.ofHours(36);
    public final lis d;
    public final Clock e;
    public final boolean f;
    public ShotDatabase g;
    public dil h;
    public diu i;
    private final phw j;
    private final Executor k;
    private long l = a.getSeconds();

    public dij(phw phwVar, Executor executor, Clock clock, final boolean z, final lis lisVar, final qkg qkgVar) {
        this.d = lisVar.a("ShotTracker");
        this.j = phwVar;
        this.k = executor;
        this.e = clock;
        this.f = z;
        executor.execute(new Runnable() { // from class: dii
            @Override // java.lang.Runnable
            public final void run() {
                dij dijVar = this.a;
                lis lisVar2 = lisVar;
                boolean z2 = z;
                qkg qkgVar2 = qkgVar;
                lisVar2.f(mip.bp("Setup DB (with crashOnSqlErrors=%b)", Boolean.valueOf(z2)));
                dijVar.g = (ShotDatabase) qkgVar2.get();
                dil dilVarR = dijVar.g.r();
                dilVarR.getClass();
                dijVar.h = dilVarR;
                diu diuVarS = dijVar.g.s();
                diuVarS.getClass();
                dijVar.i = diuVarS;
            }
        });
    }

    public static diz k(long j, Instant instant, String str) {
        diz dizVar = new diz();
        dizVar.b = j;
        dizVar.a = 0;
        dizVar.c = instant.toEpochMilli();
        dizVar.d = str;
        return dizVar;
    }

    public static String l(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            diz dizVar = (diz) it.next();
            sb.append(dizVar.b);
            sb.append(' ');
            sb.append(Instant.ofEpochMilli(dizVar.c));
            sb.append(": ");
            sb.append(dizVar.d);
            sb.append('\n');
        }
        return sb.toString();
    }

    @Override // defpackage.dia
    public final pht a() {
        return this.j.submit(new Callable() { // from class: die
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dil dilVar = this.a.h;
                ais aisVarA = ais.a("SELECT shot_id FROM shots WHERE NOT failed AND  persisted_millis = 0 AND canceled_millis = 0 AND deleted_millis = 0", 0);
                dir dirVar = (dir) dilVar;
                dirVar.a.g();
                Cursor cursorI = fy.i(dirVar.a, aisVarA, false);
                try {
                    ArrayList arrayList = new ArrayList(cursorI.getCount());
                    while (cursorI.moveToNext()) {
                        arrayList.add(cursorI.isNull(0) ? null : Long.valueOf(cursorI.getLong(0)));
                    }
                    return arrayList;
                } finally {
                    cursorI.close();
                    aisVarA.j();
                }
            }
        });
    }

    @Override // defpackage.dia
    public final void b(long j, Instant instant) {
        this.k.execute(new dif(this, j, instant, 1));
    }

    @Override // defpackage.dia
    public final void c(long j, Instant instant) {
        this.k.execute(new dif(this, j, instant, 0));
    }

    @Override // defpackage.dia
    public final void d(final long j, final Instant instant, final String str) {
        this.k.execute(new Runnable() { // from class: dig
            @Override // java.lang.Runnable
            public final void run() {
                this.a.m(j, instant, str);
            }
        });
    }

    @Override // defpackage.dia
    public final void e(long j, Instant instant) {
        this.k.execute(new dif(this, j, instant, 2));
    }

    @Override // defpackage.dia
    public final void f(long j, Instant instant) {
        this.k.execute(new dif(this, j, instant, 3));
    }

    @Override // defpackage.dia
    public final void g(long j, Instant instant) {
        this.k.execute(new dif(this, j, instant, 4));
    }

    @Override // defpackage.dia
    public final void h(long j, Instant instant) {
        this.k.execute(new dif(this, j, instant, 5));
    }

    @Override // defpackage.dia
    public final void i(final hsq hsqVar, final Instant instant, final hsr hsrVar) {
        hsqVar.getClass();
        this.k.execute(new Runnable() { // from class: dih
            @Override // java.lang.Runnable
            public final void run() {
                dij dijVar = this.a;
                hsq hsqVar2 = hsqVar;
                Instant instant2 = instant;
                hsr hsrVar2 = hsrVar;
                dit ditVar = new dit();
                ditVar.a = hsqVar2.b;
                ditVar.b = hsqVar2.c;
                hsp hspVar = hsqVar2.a;
                hspVar.getClass();
                ditVar.i = hspVar.toString();
                ditVar.j = hsqVar2.e;
                long epochMilli = instant2.toEpochMilli();
                ditVar.c = epochMilli;
                ditVar.g = epochMilli;
                ditVar.h = hsrVar2.name();
                try {
                    dil dilVar = dijVar.h;
                    ((dir) dilVar).a.g();
                    ((dir) dilVar).a.h();
                    try {
                        ((dir) dilVar).b.a(ditVar);
                        ((dir) dilVar).a.j();
                        ((dir) dilVar).a.i();
                        long j = hsqVar2.b;
                        String strValueOf = String.valueOf(hsqVar2);
                        String strValueOf2 = String.valueOf(hsrVar2);
                        String strValueOf3 = String.valueOf(instant2);
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 13 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length());
                        sb.append(strValueOf);
                        sb.append(" ");
                        sb.append(strValueOf2);
                        sb.append(" started at ");
                        sb.append(strValueOf3);
                        dijVar.m(j, instant2, sb.toString());
                    } catch (Throwable th) {
                        ((dir) dilVar).a.i();
                        throw th;
                    }
                } catch (SQLiteException e) {
                    dijVar.d.e(mip.bp("SQLite error in startedImpl for id=%d '%s' time=%s type=%s", Long.valueOf(hsqVar2.b), hsqVar2, instant2, hsrVar2), e);
                    if (dijVar.f) {
                        throw e;
                    }
                }
            }
        });
    }

    @Override // defpackage.dia
    public final void j(final Collection collection, final Instant instant) {
        this.k.execute(new Runnable() { // from class: did
            @Override // java.lang.Runnable
            public final void run() {
                dij dijVar = this.a;
                Collection collection2 = collection;
                Instant instant2 = instant;
                try {
                    long epochMilli = instant2.toEpochMilli();
                    diz dizVar = new diz();
                    dizVar.c = epochMilli;
                    dizVar.d = "active during uncaught exception";
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        dizVar.b = ((Long) it.next()).longValue();
                        dizVar.a = 0;
                        dijVar.i.b(dizVar);
                    }
                } catch (SQLiteException e) {
                    dijVar.d.e(mip.bp("SQLite error in logToAllImpl for ids=%s time=%s msg='%s'", collection2, instant2, "active during uncaught exception"), e);
                    if (dijVar.f) {
                        throw e;
                    }
                }
            }
        });
    }

    public final void m(long j, Instant instant, String str) {
        try {
            int iA = this.h.a(j, instant.toEpochMilli());
            if (iA == 1) {
                this.i.b(k(j, instant, str));
            } else {
                this.d.d(mip.bp("logImpl updated %d rows for id=%d with time=%s (expected 1)", Integer.valueOf(iA), Long.valueOf(j), instant));
            }
        } catch (SQLiteException e) {
            this.d.e(mip.bp("SQLite error in logImpl for id=%d time=%s msg='%s'", Long.valueOf(j), instant, str), e);
            if (this.f) {
                throw e;
            }
        }
    }

    public final void n() {
        this.j.schedule(new Runnable() { // from class: dic
            @Override // java.lang.Runnable
            public final void run() {
                dij dijVar = this.a;
                dijVar.d.b("deleting old data from per-shot log");
                Instant instantMinus = dijVar.e.instant().minus(dij.c);
                dil dilVar = dijVar.h;
                long epochMilli = instantMinus.toEpochMilli();
                dir dirVar = (dir) dilVar;
                dirVar.a.g();
                ake akeVarE = dirVar.c.e();
                akeVarE.e(1, epochMilli);
                dirVar.a.h();
                try {
                    int iA = akeVarE.a();
                    ((dir) dilVar).a.j();
                    dirVar.a.i();
                    dirVar.c.f(akeVarE);
                    if (iA > 0) {
                        lis lisVar = dijVar.d;
                        StringBuilder sb = new StringBuilder(24);
                        sb.append("deleted ");
                        sb.append(iA);
                        sb.append(" rows");
                        lisVar.b(sb.toString());
                    }
                    dijVar.n();
                } catch (Throwable th) {
                    dirVar.a.i();
                    dirVar.c.f(akeVarE);
                    throw th;
                }
            }
        }, this.l, TimeUnit.SECONDS);
        this.l = b.getSeconds();
    }
}
