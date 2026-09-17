package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class nkq {
    public final String a;
    public final nkr b;
    public final ofu c;
    public final ogb e;
    private final pht g;
    private final ofu i = new ofu(new nkn(this), pgr.INSTANCE);
    public final Object d = new Object();
    public List f = new ArrayList();
    private final pha h = pha.a();

    public nkq(nkr nkrVar, pht phtVar, boolean z) {
        this.b = nkrVar;
        this.g = phtVar;
        this.a = ((nkg) nkrVar).a;
        int i = 1;
        this.c = new ofu(new njz((nkg) nkrVar, i), pgr.INSTANCE);
        if (z) {
            this.e = ogb.d();
        } else {
            this.e = ogb.c();
        }
        c(new nkj(this, i));
    }

    public final pht a() {
        pht phtVarA;
        this.e.a();
        if (this.i.d.isDone()) {
            phtVarA = ((nkg) this.b).a();
        } else {
            ogb ogbVar = this.e;
            String strValueOf = String.valueOf(this.a);
            ogf ogfVarB = ogbVar.b(strValueOf.length() != 0 ? "Get ".concat(strValueOf) : new String("Get "));
            try {
                pht phtVarI = pgb.i(this.i.c(), ogl.b(new nkj(this, 0)), pgr.INSTANCE);
                ogfVarB.a(phtVarI);
                ogfVarB.close();
                phtVarA = phtVarI;
            } catch (Throwable th) {
                try {
                    ogfVarB.close();
                } catch (Throwable th2) {
                }
                throw th;
            }
        }
        plk.W(this.g);
        return plk.W(phtVarA);
    }

    public final pht b(final oiu oiuVar, final Executor executor) {
        final pgk pgkVarB = ogl.b(new pgk() { // from class: nkl
            @Override // defpackage.pgk
            public final pht a(Object obj) {
                return plk.V(oiuVar.a(obj));
            }
        });
        ogb ogbVar = this.e;
        String strValueOf = String.valueOf(this.a);
        ogf ogfVarB = ogbVar.b(strValueOf.length() != 0 ? "Update ".concat(strValueOf) : new String("Update "));
        try {
            final pht phtVarC = this.i.c();
            this.h.b(new pgj() { // from class: nki
                @Override // defpackage.pgj
                public final pht a() {
                    return phtVarC;
                }
            }, pgr.INSTANCE);
            pht phtVarB = this.h.b(ogl.a(new pgj() { // from class: nkh
                @Override // defpackage.pgj
                public final pht a() {
                    final nkq nkqVar = this.a;
                    pht phtVar = phtVarC;
                    final pgk pgkVar = pgkVarB;
                    final Executor executor2 = executor;
                    return pgb.i(phtVar, ogl.b(new pgk() { // from class: nkk
                        @Override // defpackage.pgk
                        public final pht a(Object obj) {
                            nkq nkqVar2 = nkqVar;
                            return nkqVar2.b.d(pgkVar, executor2);
                        }
                    }), pgr.INSTANCE);
                }
            }), pgr.INSTANCE);
            phtVarB.getClass();
            if (!phtVarC.isDone()) {
                if (phtVarB.isDone()) {
                    plk.ag(phtVarB, phtVarC);
                } else {
                    phk phkVar = new phk(phtVarB, phtVarC);
                    phtVarB.d(phkVar, pgr.INSTANCE);
                    phtVarC.d(phkVar, pgr.INSTANCE);
                }
            }
            plk.W(this.g);
            ogfVarB.a(phtVarB);
            ogfVarB.close();
            return phtVarB;
        } catch (Throwable th) {
            try {
                ogfVarB.close();
            } catch (Throwable th2) {
            }
            throw th;
        }
    }

    public final void c(pgk pgkVar) {
        synchronized (this.d) {
            this.f.add(pgkVar);
        }
    }
}
