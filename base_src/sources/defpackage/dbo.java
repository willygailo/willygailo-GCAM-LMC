package defpackage;

import android.util.Range;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class dbo {
    public static final Range a = Range.create(Double.valueOf(-20.0d), Double.valueOf(30.0d));
    public final dcr b;
    public ojc c;
    public ojc d;
    private final dcq e;
    private final dcq f;
    private final dbe g;
    private final boolean h;
    private ojc i;
    private boolean j;
    private final jti k;

    public dbo(dbe dbeVar, ddf ddfVar) {
        dbm dbmVar = new dbm(this, 1);
        this.e = dbmVar;
        dbm dbmVar2 = new dbm(this, 0);
        this.f = dbmVar2;
        this.b = new dcr(dbmVar, dbmVar2, TimeUnit.SECONDS.toMillis(1L));
        this.c = oih.a;
        this.i = oih.a;
        this.d = oih.a;
        this.j = false;
        this.g = dbeVar;
        this.h = ddfVar.k(dcv.d);
        this.k = new jti(0.015f, null);
        ddfVar.d();
    }

    /* JADX WARN: Code duplicated, block: B:5:0x0005  */
    final synchronized void a(float f, float f2, long j) {
        if (this.h) {
            ojc ojcVarA = this.g.a();
            if (ojcVarA.g()) {
                hjz hjzVarB = ((dbd) ojcVarA.c()).a.b();
                if (hjzVarB != null) {
                    this.j = this.k.a(hjzVarB.p, hjzVarB.n);
                    if (this.i.g()) {
                        this.d = ojc.i(Float.valueOf(((dbd) ojcVarA.c()).b.a((hjz) this.i.c(), hjzVarB)));
                    }
                    this.i = ojc.i(hjzVarB);
                    this.c = ojc.i(new dbn(f, f2, this.j));
                    boolean zC = this.b.c();
                    this.b.b(j);
                    if (this.b.c() != zC) {
                        this.b.c();
                    }
                }
            }
        }
    }

    public final synchronized void b() {
        this.c = oih.a;
        this.b.a();
    }
}
