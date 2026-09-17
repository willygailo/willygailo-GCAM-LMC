package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class eqa implements lmu, esk {
    public static final ouj a = ouj.h("com/google/android/apps/camera/lasagna/MotionBlurBufferListener");
    public final esl b;
    public final hcg c;
    public final pkr d;
    public final esd e;
    public final List f = new ArrayList();
    public final HashMap g = new HashMap();
    public boolean h = false;
    public int i = -1;
    public hew j;
    epz k;
    private pih l;

    public eqa(hcg hcgVar, pkr pkrVar, ojc ojcVar, esd esdVar, lap lapVar) {
        this.c = hcgVar;
        this.d = pkrVar;
        obr.aF(ojcVar.g());
        esl eslVar = (esl) ojcVar.c();
        this.b = eslVar;
        this.e = esdVar;
        eslVar.j(this);
        lapVar.c(new lie() { // from class: epx
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                eqa eqaVar = this.a;
                eqaVar.b.f(eqaVar);
            }
        });
    }

    @Override // defpackage.lmu
    public final void a(lrr lrrVar) {
        mip.bj(lrrVar, new lnn() { // from class: epy
            @Override // defpackage.lnn
            public final void a(lmr lmrVar) {
                eqa eqaVar = this.a;
                try {
                    synchronized (eqaVar) {
                        if (eqaVar.h) {
                            ovd ovdVar = ovl.a;
                            lmrVar.b();
                            lmr lmrVarA = lmrVar.a();
                            if (lmrVarA != null) {
                                hew hewVar = eqaVar.j;
                                if (hewVar == null) {
                                    lmrVar.b();
                                    eqaVar.f.add(lmrVarA);
                                } else {
                                    hewVar.a(lmrVarA);
                                }
                            }
                        } else {
                            lzv lzvVarC = lmrVar.c();
                            if (lzvVarC != null) {
                                eqaVar.b.e(eqaVar.c.a(lmrVar).g(), eqaVar.d.k(lzvVarC));
                            }
                        }
                    }
                    lmrVar.close();
                } catch (Throwable th) {
                    lmrVar.close();
                    throw th;
                }
            }
        });
    }

    @Override // defpackage.esk
    public final synchronized pht b(int i) {
        pih pihVarF;
        ovd ovdVar = ovl.a;
        this.g.put(Integer.valueOf(i), new ArrayList());
        this.h = true;
        this.i = i;
        this.j = null;
        pihVarF = pih.f();
        this.l = pihVarF;
        return pihVarF;
    }

    @Override // defpackage.esk
    public final synchronized void c(int i) {
        ovd ovdVar = ovl.a;
        List<plj> list = (List) this.g.remove(Integer.valueOf(i));
        if (list != null) {
            for (plj pljVar : list) {
                pljVar.b.c();
                pljVar.d.run();
            }
        }
        if (this.i == i) {
            this.h = false;
            for (lmr lmrVar : this.f) {
                lmrVar.b();
                lmrVar.close();
            }
            this.i = -1;
            this.f.clear();
            this.j = null;
            this.k = null;
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final synchronized void close() {
        ovd ovdVar = ovl.a;
        epz epzVar = this.k;
        if (epzVar != null && epzVar.a != null) {
            epzVar.a();
        }
        if (this.h) {
            c(this.i);
        }
    }

    @Override // defpackage.esk
    public final synchronized void d(float f, float f2, long j) {
        ovd ovdVar = ovl.a;
        pih pihVar = this.l;
        pihVar.getClass();
        this.k = new epz(this, pihVar);
        this.j = new hew(j, f, f2, this.k);
        this.f.size();
        for (lmr lmrVar : this.f) {
            hew hewVar = this.j;
            hewVar.getClass();
            hewVar.a(lmrVar);
        }
        this.f.clear();
    }
}
