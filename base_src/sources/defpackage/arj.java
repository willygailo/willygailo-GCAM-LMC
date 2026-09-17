package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public abstract class arj implements Runnable {
    public final anl d = new anl();

    public static arj b(String str, aof aofVar, boolean z) {
        return new ari(aofVar, str, z);
    }

    static final void c(aof aofVar, String str) {
        WorkDatabase workDatabase = aofVar.d;
        aqu aquVarS = workDatabase.s();
        arg argVarZ = workDatabase.z();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int iH = aquVarS.h(str2);
            if (iH != 3 && iH != 4) {
                aquVarS.k(6, str2);
            }
            linkedList.addAll(argVarZ.d(str2));
        }
        ann annVar = aofVar.f;
        synchronized (annVar.f) {
            kus kusVarL = kus.l();
            String.format("Processor cancelling %s", str);
            kusVarL.h(new Throwable[0]);
            annVar.e.add(str);
            aoj aojVar = (aoj) annVar.c.remove(str);
            ann.e(str, aojVar == null ? (aoj) annVar.d.remove(str) : aojVar);
            if (aojVar != null) {
                annVar.d();
            }
        }
        Iterator it = aofVar.e.iterator();
        while (it.hasNext()) {
            ((ano) it.next()).b(str);
        }
    }

    static final void d(aof aofVar) {
        anp.b(aofVar.c, aofVar.d, aofVar.e);
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
            this.d.a(ana.a);
        } catch (Throwable th) {
            this.d.a(new amx(th));
        }
    }
}
