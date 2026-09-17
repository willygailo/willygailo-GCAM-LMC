package defpackage;

import android.app.Activity;
import android.os.Handler;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: loaded from: classes2.dex */
public final class iyy implements pys {
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
    private final qkg n;
    private final qkg o;
    private final qkg p;
    private final qkg q;
    private final qkg r;
    private final qkg s;
    private final qkg t;
    private final qkg u;
    private final qkg v;
    private final qkg w;
    private final /* synthetic */ int x;

    public iyy(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, qkg qkgVar12, qkg qkgVar13, qkg qkgVar14, qkg qkgVar15, qkg qkgVar16, qkg qkgVar17, qkg qkgVar18, qkg qkgVar19, qkg qkgVar20, qkg qkgVar21, qkg qkgVar22, qkg qkgVar23, int i) {
        this.x = i;
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
        this.n = qkgVar14;
        this.o = qkgVar15;
        this.p = qkgVar16;
        this.q = qkgVar17;
        this.r = qkgVar18;
        this.s = qkgVar19;
        this.t = qkgVar20;
        this.u = qkgVar21;
        this.v = qkgVar22;
        this.w = qkgVar23;
    }

    public iyy(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, qkg qkgVar12, qkg qkgVar13, qkg qkgVar14, qkg qkgVar15, qkg qkgVar16, qkg qkgVar17, qkg qkgVar18, qkg qkgVar19, qkg qkgVar20, qkg qkgVar21, qkg qkgVar22, qkg qkgVar23, int i, byte[] bArr) {
        this.x = i;
        this.d = qkgVar;
        this.q = qkgVar2;
        this.c = qkgVar3;
        this.n = qkgVar4;
        this.h = qkgVar5;
        this.p = qkgVar6;
        this.b = qkgVar7;
        this.r = qkgVar8;
        this.u = qkgVar9;
        this.o = qkgVar10;
        this.k = qkgVar11;
        this.l = qkgVar12;
        this.a = qkgVar13;
        this.e = qkgVar14;
        this.m = qkgVar15;
        this.g = qkgVar16;
        this.v = qkgVar17;
        this.t = qkgVar18;
        this.f = qkgVar19;
        this.s = qkgVar20;
        this.w = qkgVar21;
        this.j = qkgVar22;
        this.i = qkgVar23;
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.x) {
            case 0:
                return new iyx((lda) this.a.get(), this.b, ((emg) this.c).get(), (BottomBarController) this.d.get(), (jlb) this.e.get(), ((iwi) this.f).get(), (jfn) this.g.get(), (jak) this.h.get(), (eah) this.i.get(), (gtg) this.j.get(), (jjp) this.k.get(), (gfy) this.l.get(), (hoz) this.m.get(), efb.b(), (bta) this.n.get(), this.o, (cvo) this.p.get(), (jhh) this.q.get(), (ddf) this.r.get(), (fly) this.s.get(), (eta) this.t.get(), (izx) this.u.get(), (cro) this.v.get(), (csg) this.w.get());
            default:
                Activity activity = ((eme) this.d).get();
                qkg qkgVar = this.q;
                Object obj = this.c.get();
                Object obj2 = this.n.get();
                return new ibz(activity, qkgVar, (ida) obj, (icf) obj2, (hpu) this.h.get(), (ibe) this.p.get(), (ixj) this.b.get(), (bue) this.r.get(), (hrx) this.u.get(), (lda) this.o.get(), ((jod) this.k).get(), ((etj) this.l).get(), ((etg) this.a).get(), (iet) this.e.get(), (idt) this.m.get(), ((Boolean) this.g.get()).booleanValue(), (hnx) this.v.get(), (dfx) this.t.get(), (dga) this.f.get(), (lar) this.s.get(), (huf) this.w.get(), (hug) this.j.get(), (Handler) this.i.get());
        }
    }
}
