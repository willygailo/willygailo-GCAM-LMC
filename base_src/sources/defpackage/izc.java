package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.apps.camera.bottombar.BottomBarController;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class izc implements pys {
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
    private final /* synthetic */ int l;

    public izc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, int i) {
        this.l = i;
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
    }

    public izc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, int i, byte[] bArr) {
        this.l = i;
        this.g = qkgVar;
        this.i = qkgVar2;
        this.h = qkgVar3;
        this.b = qkgVar4;
        this.f = qkgVar5;
        this.j = qkgVar6;
        this.k = qkgVar7;
        this.e = qkgVar8;
        this.d = qkgVar9;
        this.a = qkgVar10;
        this.c = qkgVar11;
    }

    public izc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, int i, char[] cArr) {
        this.l = i;
        this.b = qkgVar;
        this.g = qkgVar2;
        this.d = qkgVar3;
        this.k = qkgVar4;
        this.h = qkgVar5;
        this.j = qkgVar6;
        this.a = qkgVar7;
        this.e = qkgVar8;
        this.i = qkgVar9;
        this.c = qkgVar10;
        this.f = qkgVar11;
    }

    public izc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, int i, float[] fArr) {
        this.l = i;
        this.a = qkgVar;
        this.d = qkgVar2;
        this.b = qkgVar3;
        this.j = qkgVar4;
        this.g = qkgVar5;
        this.h = qkgVar6;
        this.i = qkgVar7;
        this.k = qkgVar8;
        this.f = qkgVar9;
        this.e = qkgVar10;
        this.c = qkgVar11;
    }

    public izc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, int i, int[] iArr) {
        this.l = i;
        this.j = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
        this.e = qkgVar4;
        this.g = qkgVar5;
        this.f = qkgVar6;
        this.d = qkgVar7;
        this.k = qkgVar8;
        this.h = qkgVar9;
        this.i = qkgVar10;
        this.a = qkgVar11;
    }

    public izc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, int i, short[] sArr) {
        this.l = i;
        this.b = qkgVar;
        this.j = qkgVar2;
        this.f = qkgVar3;
        this.e = qkgVar4;
        this.i = qkgVar5;
        this.h = qkgVar6;
        this.a = qkgVar7;
        this.g = qkgVar8;
        this.k = qkgVar9;
        this.c = qkgVar10;
        this.d = qkgVar11;
    }

    public izc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, int i, boolean[] zArr) {
        this.l = i;
        this.k = qkgVar;
        this.b = qkgVar2;
        this.d = qkgVar3;
        this.c = qkgVar4;
        this.j = qkgVar5;
        this.f = qkgVar6;
        this.h = qkgVar7;
        this.i = qkgVar8;
        this.a = qkgVar9;
        this.e = qkgVar10;
        this.g = qkgVar11;
    }

    public izc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, int i, byte[][] bArr) {
        this.l = i;
        this.f = qkgVar;
        this.j = qkgVar2;
        this.g = qkgVar3;
        this.e = qkgVar4;
        this.a = qkgVar5;
        this.d = qkgVar6;
        this.b = qkgVar7;
        this.i = qkgVar8;
        this.c = qkgVar9;
        this.k = qkgVar10;
        this.h = qkgVar11;
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.l) {
            case 0:
                return new izb((lda) this.a.get(), (BottomBarController) this.b.get(), (jlb) this.c.get(), (jak) this.d.get(), (jfn) this.e.get(), (gtg) this.f.get(), (imy) this.g.get(), (lda) this.h.get(), ((iwi) this.i).get(), (iud) this.j.get(), (ddf) this.k.get(), null);
            case 1:
                Context context = ((emd) this.g).get();
                Object obj = this.i.get();
                ibm ibmVar = (ibm) this.h.get();
                bue bueVar = (bue) this.b.get();
                Object obj2 = this.f.get();
                return new ibl(context, (ida) obj, ibmVar, bueVar, (icf) obj2, (Handler) this.j.get(), ((jto) this.k).get(), ((dto) this.e).get(), ((ici) this.d).get(), (ick) this.a.get(), (iet) this.c.get());
            case 2:
                btt bttVar = (btt) this.b.get();
                bqg bqgVar = ((etg) this.g).get();
                cvo cvoVar = (cvo) this.d.get();
                dmh dmhVar = (dmh) this.k.get();
                ddf ddfVar = (ddf) this.h.get();
                qkg qkgVar = this.j;
                return new jac(bttVar, bqgVar, cvoVar, dmhVar, ddfVar, ((jnr) qkgVar.get()).a, ((gxn) this.e).get(), (huf) this.i.get(), (lar) this.c.get(), (lda) this.f.get());
            case 3:
                return new jqy(this.b, ((emd) this.j).get(), (jxb) this.f.get(), (jwz) this.e.get(), ((iwi) this.i).get(), (epj) this.h.get(), (jfn) this.a.get(), (BottomBarController) this.g.get(), (ddf) this.k.get(), (huf) this.c.get(), (iud) this.d.get());
            case 4:
                Object obj3 = this.j.get();
                Integer num = 1;
                return new lrc((loy) obj3, (ltv) this.c.get(), (lom) this.b.get(), (lqt) this.e.get(), (lsn) this.g.get(), (lqz) this.f.get(), (lpr) this.d.get(), (lpz) this.k.get(), (lap) this.h.get(), num.intValue(), (ljf) this.i.get(), ((liq) this.a).get());
            case 5:
                return new lsn(((lpn) this.k).get(), (lkd) this.b.get(), (lso) this.d.get(), (ltv) this.c.get(), (Handler) this.j.get(), (ltc) this.f.get(), (lap) this.h.get(), (ljf) this.i.get(), ((liq) this.a).get(), ((lry) this.e).get(), ((lsh) this.g).get());
            case 6:
                return new mzd(((mxn) this.a).get(), ((emp) this.d).a(), (mwe) this.b.get(), pyr.a(this.j), (myv) this.g.get(), this.h, this.i, (Executor) this.k.get(), (mxt) this.f.get(), this.e, ((gqf) this.c).b().booleanValue());
            default:
                mxm mxmVar = ((mxn) this.f).get();
                return new mzv(mxmVar, ((emp) this.g).a(), (mzu) this.e.get(), (phw) this.a.get(), pyr.a(this.d), ((naa) this.b).get(), (muz) this.i.get(), this.c, (Executor) this.k.get(), (ojc) ((pyt) this.h).a);
        }
    }
}
