package defpackage;

import android.content.Context;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class cly implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;
    private final qkg g;
    private final qkg h;
    private final qkg i;
    private final qkg j;
    private final qkg k;
    private final qkg l;
    private final qkg m;
    private final /* synthetic */ int n;

    public cly(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, qkg qkgVar12, qkg qkgVar13, int i) {
        this.n = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
        this.g = qkgVar7;
        this.h = qkgVar8;
        this.i = qkgVar9;
        this.j = qkgVar10;
        this.k = qkgVar11;
        this.l = qkgVar12;
        this.m = qkgVar13;
    }

    public cly(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, qkg qkgVar12, qkg qkgVar13, int i, byte[] bArr) {
        this.n = i;
        this.h = qkgVar;
        this.f = qkgVar2;
        this.e = qkgVar3;
        this.k = qkgVar4;
        this.m = qkgVar5;
        this.c = qkgVar6;
        this.i = qkgVar7;
        this.a = qkgVar8;
        this.b = qkgVar9;
        this.d = qkgVar10;
        this.j = qkgVar11;
        this.g = qkgVar12;
        this.l = qkgVar13;
    }

    public cly(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, qkg qkgVar12, qkg qkgVar13, int i, char[] cArr) {
        this.n = i;
        this.m = qkgVar;
        this.k = qkgVar2;
        this.g = qkgVar3;
        this.i = qkgVar4;
        this.a = qkgVar5;
        this.e = qkgVar6;
        this.j = qkgVar7;
        this.f = qkgVar8;
        this.d = qkgVar9;
        this.c = qkgVar10;
        this.l = qkgVar11;
        this.h = qkgVar12;
        this.b = qkgVar13;
    }

    public cly(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, qkg qkgVar12, qkg qkgVar13, int i, short[] sArr) {
        this.n = i;
        this.d = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.j = qkgVar4;
        this.f = qkgVar5;
        this.e = qkgVar6;
        this.l = qkgVar7;
        this.h = qkgVar8;
        this.a = qkgVar9;
        this.k = qkgVar10;
        this.i = qkgVar11;
        this.g = qkgVar12;
        this.m = qkgVar13;
    }

    public static cly a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, qkg qkgVar12, qkg qkgVar13) {
        return new cly(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, qkgVar9, qkgVar10, qkgVar11, qkgVar12, qkgVar13, 2, (char[]) null);
    }

    public static cly b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, qkg qkgVar12, qkg qkgVar13) {
        return new cly(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, qkgVar9, qkgVar10, qkgVar11, qkgVar12, qkgVar13, 3, (short[]) null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.n) {
            case 0:
                return new clx((lqv) this.a.get(), ((chb) this.b).get(), this.c, ((cva) this.d).get(), ((hlj) this.e).a(), (cif) this.f.get(), ((cmg) this.g).get(), (nvb) this.h.get(), (ddf) this.i.get(), (cxz) this.j.get(), ((cgz) this.k).get(), ((coy) this.l).get(), (jry) this.m.get(), null, null, null, null);
            case 1:
                return new bqh(((emp) this.h).a(), ((eth) this.f).get(), (fjs) this.e.get(), (CameraActivityTiming) this.k.get(), (khx) this.m.get(), (iiz) this.c.get(), (lar) this.i.get(), (ljf) this.a.get(), (lda) this.b.get(), (dha) this.d.get(), (gvb) this.j.get(), ((htw) this.g).get(), (hpj) this.l.get(), null, null, null);
            case 2:
                fhv fhvVar = ((etj) this.m).get();
                Context context = ((emd) this.k).get();
                hvo hvoVar = ((hvp) this.g).get();
                lda ldaVar = (lda) this.i.get();
                lda ldaVar2 = (lda) this.a.get();
                lda ldaVar3 = (lda) this.e.get();
                lda ldaVar4 = (lda) this.j.get();
                lda ldaVar5 = (lda) this.f.get();
                lda ldaVar6 = (lda) this.d.get();
                ddf ddfVar = (ddf) this.c.get();
                fjs fjsVar = (fjs) this.l.get();
                lar larVar = (lar) this.h.get();
                epj epjVar = new epj(hvoVar, context, new onu(), ldaVar, ldaVar2, ldaVar3, ldaVar4, ldaVar5, ldaVar6, ddfVar, fjsVar, (Executor) this.b.get());
                enl.f(larVar, fhvVar, epjVar);
                return epjVar;
            default:
                return new hal((ebe) this.d.get(), (lnc) this.b.get(), (hcs) this.c.get(), (gzu) this.j.get(), (hcg) this.f.get(), (hen) this.e.get(), ((hbc) this.l).get(), (eao) this.h.get(), (ljf) this.a.get(), (gyg) this.k.get(), (hex) this.i.get(), ((het) this.g).get(), (Executor) this.m.get());
        }
    }
}
