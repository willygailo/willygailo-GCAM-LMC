package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class bvu {
    public final Executor a;
    public ljf b = new ljd();
    public lis c = new liw();
    public lbl d;
    private final pih e;
    private pht f;

    private bvu(Executor executor) {
        this.a = executor;
        pih pihVarF = pih.f();
        this.e = pihVarF;
        this.f = pihVarF;
    }

    public static bvu a(Executor executor) {
        return new bvu(executor);
    }

    public final pht b() {
        boolean z = false;
        if (!this.e.isDone() && !this.e.isCancelled()) {
            z = true;
        }
        obr.aQ(z);
        if (this.d != null || this.c != null) {
            plk.af(this.f, new bvt(this), pgr.INSTANCE);
        }
        this.e.o(true);
        return this.f;
    }

    public final void c(final qkg qkgVar, final String str) {
        this.c.b(str.length() != 0 ? "Futures.transform: ".concat(str) : new String("Futures.transform: "));
        pht phtVarI = pgb.i(this.f, new pgk() { // from class: bvq
            @Override // defpackage.pgk
            public final pht a(Object obj) {
                bvu bvuVar = this.a;
                String str2 = str;
                qkg qkgVar2 = qkgVar;
                if (!((Boolean) obj).booleanValue()) {
                    return plk.V(false);
                }
                bvuVar.b.e(str2);
                bvuVar.b.e("get");
                bvv bvvVar = (bvv) qkgVar2.get();
                bvuVar.b.g("start");
                pht phtVarFz = bvvVar.fz();
                bvuVar.b.f();
                bvuVar.b.f();
                return phtVarFz;
            }
        }, this.a);
        this.f = phtVarI;
        lis lisVar = this.c;
        if (lisVar != null) {
            dgg.c(lisVar, phtVarI, str.concat(" complete."), str.concat(" failed!"));
        }
    }

    public final void d(qkg qkgVar, String str) {
        plk.af(this.f, new bvs(this, str, qkgVar), this.a);
    }
}
