package defpackage;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class art implements Runnable {
    private final aof a;
    private final String b;
    private final boolean c;

    static {
        kus.g("StopWorkRunnable");
    }

    public art(aof aofVar, String str, boolean z) {
        this.a = aofVar;
        this.b = str;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zContainsKey;
        boolean zE;
        aof aofVar = this.a;
        WorkDatabase workDatabase = aofVar.d;
        ann annVar = aofVar.f;
        aqu aquVarS = workDatabase.s();
        workDatabase.h();
        try {
            String str = this.b;
            synchronized (annVar.f) {
                zContainsKey = annVar.c.containsKey(str);
            }
            if (this.c) {
                ann annVar2 = this.a.f;
                String str2 = this.b;
                synchronized (annVar2.f) {
                    kus kusVarL = kus.l();
                    String.format("Processor stopping foreground work %s", str2);
                    kusVarL.h(new Throwable[0]);
                    zE = ann.e(str2, (aoj) annVar2.c.remove(str2));
                }
            } else {
                if (!zContainsKey && aquVarS.h(this.b) == 2) {
                    aquVarS.k(1, this.b);
                }
                ann annVar3 = this.a.f;
                String str3 = this.b;
                synchronized (annVar3.f) {
                    kus kusVarL2 = kus.l();
                    String.format("Processor stopping background work %s", str3);
                    kusVarL2.h(new Throwable[0]);
                    zE = ann.e(str3, (aoj) annVar3.d.remove(str3));
                }
            }
            kus kusVarL3 = kus.l();
            String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.b, Boolean.valueOf(zE));
            kusVarL3.h(new Throwable[0]);
            workDatabase.j();
            workDatabase.i();
        } catch (Throwable th) {
            workDatabase.i();
            throw th;
        }
    }
}
