package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class fjq {
    final /* synthetic */ fjr a;
    private final Future b;
    private long c;
    private String e;
    private long d = 0;
    private final List f = new ArrayList();

    public fjq(fjr fjrVar) {
        this.a = fjrVar;
        this.c = 0L;
        this.b = fjrVar.d.schedule(new Runnable() { // from class: fjp
            @Override // java.lang.Runnable
            public final void run() {
                fjq fjqVar = this.a;
                fjqVar.c(false);
                fjqVar.a();
            }
        }, 60L, TimeUnit.SECONDS);
        this.c = SystemClock.elapsedRealtime();
    }

    public final synchronized void a() {
        long jElapsedRealtime;
        this.b.cancel(true);
        synchronized (this) {
            jElapsedRealtime = SystemClock.elapsedRealtime() - this.c;
        }
        if (jElapsedRealtime > fjr.a) {
            this.a.c.y(jElapsedRealtime, this.f);
        }
    }

    public final synchronized void b() {
        c(true);
    }

    public final synchronized void c(boolean z) {
        List list = this.f;
        poy poyVarM = pdu.e.m();
        String str = this.e;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pdu pduVar = (pdu) poyVarM.b;
        str.getClass();
        pduVar.a |= 2;
        pduVar.c = str;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.d;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pdu pduVar2 = (pdu) poyVarM.b;
        int i = pduVar2.a | 1;
        pduVar2.a = i;
        pduVar2.b = jElapsedRealtime;
        pduVar2.a = i | 4;
        pduVar2.d = z;
        list.add((pdu) poyVarM.j());
        if (z) {
            lis lisVar = this.a.b;
            String strValueOf = String.valueOf(this.e);
            lisVar.b(strValueOf.length() != 0 ? "Task is complete:".concat(strValueOf) : new String("Task is complete:"));
        } else {
            lis lisVar2 = this.a.b;
            String strValueOf2 = String.valueOf(this.e);
            lisVar2.h(strValueOf2.length() != 0 ? "Task seems stuck:".concat(strValueOf2) : new String("Task seems stuck:"));
        }
    }

    public final synchronized void d(String str) {
        lis lisVar = this.a.b;
        String strValueOf = String.valueOf(str);
        lisVar.b(strValueOf.length() != 0 ? "Task started:".concat(strValueOf) : new String("Task started:"));
        this.d = SystemClock.elapsedRealtime();
        this.e = str;
    }
}
