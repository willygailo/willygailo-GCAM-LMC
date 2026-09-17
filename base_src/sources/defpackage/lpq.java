package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lpq implements lie {
    public lrt a;
    public final lqz b;
    public final lol c;

    public lpq(lol lolVar, lvp lvpVar, lqz lqzVar, lis lisVar) {
        this.b = lqzVar;
        List listP = lvpVar.p();
        obr.aF(listP.size() > 0);
        int iIntValue = ((Integer) listP.get(0)).intValue();
        if (listP.contains(4)) {
            iIntValue = 4;
        } else if (listP.contains(1)) {
            iIntValue = 1;
        }
        List listO = lvpVar.o();
        obr.aF(listO.size() > 0);
        int iIntValue2 = true == listO.contains(1) ? 1 : ((Integer) listO.get(0)).intValue();
        List listQ = lvpVar.q();
        obr.aF(listQ.size() > 0);
        this.a = new lrs(1, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(true != listQ.contains(1) ? ((Integer) listO.get(0)).intValue() : 1), 0, lru.a, lru.a, lru.a, false, false, false).d();
        lisVar.a("fscrtl3A");
        this.c = lolVar;
    }

    final synchronized lrs a() {
        return lrs.c(this.a);
    }

    final void b(lnv lnvVar) {
        boolean zD = lnvVar.d();
        boolean zB = lnvVar.b();
        boolean zC = lnvVar.c();
        boolean z = false;
        try {
            lqx lqxVarA = this.b.a();
            try {
                lqxVarA.c(lnvVar, true);
                lqxVarA.close();
                synchronized (this) {
                    lrs lrsVarB = lrs.b(this.a);
                    boolean z2 = zD || this.a.a.booleanValue();
                    lrsVarB.f = Boolean.valueOf(z2);
                    boolean z3 = zB || this.a.b.booleanValue();
                    lrsVarB.g = Boolean.valueOf(z3);
                    if (zC || this.a.c.booleanValue()) {
                        z = true;
                    }
                    lrsVarB.h = Boolean.valueOf(z);
                    c(lrsVarB.d());
                }
            } catch (Throwable th) {
                try {
                    lqxVarA.close();
                } catch (Throwable th2) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            synchronized (this) {
                lrs lrsVarB2 = lrs.b(this.a);
                boolean z4 = zD || this.a.a.booleanValue();
                lrsVarB2.f = Boolean.valueOf(z4);
                boolean z5 = zB || this.a.b.booleanValue();
                lrsVarB2.g = Boolean.valueOf(z5);
                if (zC || this.a.c.booleanValue()) {
                    z = true;
                }
                lrsVarB2.h = Boolean.valueOf(z);
                c(lrsVarB2.d());
                throw th3;
            }
        }
    }

    final synchronized void c(lrt lrtVar) {
        this.a = lrtVar;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
    }

    public final synchronized boolean d(lrt lrtVar, lmq lmqVar) {
        if (lrtVar.b.booleanValue()) {
            return lrtVar.a().equals(lmqVar.a()) && Arrays.equals(lrtVar.e, ((lrt) lmqVar).e);
        }
        return false;
    }

    public final synchronized boolean e(lrt lrtVar, lmq lmqVar) {
        if (lrtVar.a.booleanValue()) {
            return lrtVar.b().equals(lmqVar.b()) && Arrays.equals(lrtVar.d, ((lrt) lmqVar).d);
        }
        return false;
    }

    public final synchronized boolean f(lrt lrtVar, lmq lmqVar) {
        if (lrtVar.c.booleanValue()) {
            return lrtVar.c().equals(lmqVar.c()) && Arrays.equals(lrtVar.f, ((lrt) lmqVar).f);
        }
        return false;
    }
}
