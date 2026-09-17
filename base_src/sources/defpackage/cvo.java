package defpackage;

import android.content.Intent;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class cvo implements cwj, lco {
    private static final ouj d = ouj.h("com/google/android/apps/camera/camerafacing/CameraFacingController");
    public lwd a;
    public final lda b;
    public final List c = new ArrayList();
    private final lar e;
    private final lco f;
    private boolean g;
    private boolean h;
    private final Intent i;
    private final cxz j;
    private final cwl k;
    private final dlt l;
    private final List m;
    private final lwf n;
    private ghx o;
    private ghx p;
    private final cwc q;
    private final jtx r;

    public cvo(lwf lwfVar, lar larVar, cwc cwcVar, cwl cwlVar, cxz cxzVar, jtx jtxVar, dlt dltVar, Intent intent, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = lwd.BACK;
        ArrayList arrayList = new ArrayList();
        this.m = arrayList;
        this.n = lwfVar;
        this.e = larVar;
        this.g = false;
        this.h = false;
        this.i = intent;
        this.q = cwcVar;
        this.k = cwlVar;
        this.j = cxzVar;
        this.r = jtxVar;
        this.l = dltVar;
        arrayList.add(new cvn(lwd.BACK, o() != null));
        arrayList.add(new cvn(lwd.FRONT, p() != null));
        this.a = o() != null ? lwd.BACK : lwd.FRONT;
        lce lceVar = new lce(this.a);
        this.b = lceVar;
        this.f = new bxd(lcv.j(lci.c(lceVar), new oiu() { // from class: cvk
            @Override // defpackage.oiu
            public final Object a(Object obj) {
                ghx ghxVarK = this.a.k((lwd) obj);
                if (ghxVarK == null) {
                    return null;
                }
                return new cwi(ghxVarK);
            }
        }));
        if (m()) {
            cxzVar.e(lwd.FRONT, lwd.BACK);
        } else if (!n(lwd.FRONT)) {
            cxzVar.e(lwd.BACK);
        } else if (!n(lwd.BACK)) {
            cxzVar.e(lwd.FRONT);
        }
        lwd lwdVar = bqe.m(intent) ? lwd.FRONT : lwd.BACK;
        l(lwdVar);
        if (m() || lwdVar == lceVar.d) {
            return;
        }
        if (jtxVar.s()) {
            l((lwd) lceVar.d);
            cxzVar.f(lwdVar);
            cwcVar.a(lwdVar, 2, 2);
        } else {
            String strName = lwdVar.name();
            StringBuilder sb = new StringBuilder(String.valueOf(strName).length() + 18);
            sb.append("No ");
            sb.append(strName);
            sb.append(" camera present");
            dltVar.e(new dlr(sb.toString(), lju.CAMERAS_NOT_ENUMERATED, lwdVar));
        }
    }

    private final void l(lwd lwdVar) {
        cvn cvnVar = (cvn) Collection.EL.stream(this.m).filter(new cvm(lwdVar, 4)).findFirst().orElse(null);
        if (cvnVar != null) {
            cvnVar.d = true;
        }
    }

    private final boolean m() {
        return Collection.EL.stream(this.m).filter(bql.d).count() == 2;
    }

    private final boolean n(lwd lwdVar) {
        return Collection.EL.stream(this.m).anyMatch(new cvm(lwdVar, 3));
    }

    private final synchronized ghx o() {
        if (!this.g) {
            this.o = q(this.n, lwd.BACK);
            this.g = true;
        }
        return this.o;
    }

    private final synchronized ghx p() {
        if (!this.h) {
            this.p = q(this.n, lwd.FRONT);
            this.h = true;
        }
        return this.p;
    }

    private static ghx q(lwf lwfVar, lwd lwdVar) {
        lvs lvsVarE = lwfVar.e(lwdVar);
        if (lvsVarE == null) {
            return null;
        }
        return lwfVar.f(lvsVarE);
    }

    @Override // defpackage.lco
    public final lie a(lij lijVar, Executor executor) {
        return this.f.a(lijVar, executor);
    }

    @Override // defpackage.lco
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final cwi fA() {
        return (cwi) this.f.fA();
    }

    @Override // defpackage.cwj
    public final lwd d() {
        return (lwd) ((lce) this.b).d;
    }

    public final ojc e() {
        return ojc.h(k(d()));
    }

    public final void f(lwd lwdVar) {
        cvn cvnVar = (cvn) Collection.EL.stream(this.m).filter(new cvm(lwdVar, 1)).findFirst().orElse(null);
        if (cvnVar != null) {
            cvnVar.c = false;
        }
    }

    public final void g(lwd lwdVar) {
        if (m()) {
            this.b.fB(lwdVar);
        }
    }

    public final void h(final Runnable runnable) {
        cvn cvnVar;
        lwd lwdVarD = d();
        lwd lwdVar = lwdVarD == lwd.BACK ? lwd.FRONT : lwd.BACK;
        if (n(lwdVar)) {
            g(i() ? lwd.FRONT : lwd.BACK);
            d();
            mip.ca(plk.R((Iterable) Collection.EL.stream(this.c).map(new Function() { // from class: cvl
                @Override // j$.util.function.Function
                public final /* synthetic */ Function andThen(Function function) {
                    return Function.CC.$default$andThen(this, function);
                }

                @Override // j$.util.function.Function
                public final Object apply(Object obj) {
                    return ((cwh) obj).a((lwd) ((lce) this.a.b).d);
                }

                @Override // j$.util.function.Function
                public final /* synthetic */ Function compose(Function function) {
                    return Function.CC.$default$compose(this, function);
                }
            }).collect(Collectors.toList())), new lht() { // from class: cvj
                @Override // defpackage.lht
                public final void a(Object obj) {
                    runnable.run();
                }
            }, this.e);
        } else if (!this.r.s()) {
            dlt dltVar = this.l;
            String strName = lwdVar.name();
            StringBuilder sb = new StringBuilder(String.valueOf(strName).length() + 18);
            sb.append("No ");
            sb.append(strName);
            sb.append(" camera present");
            dltVar.e(new dlr(sb.toString(), lju.CAMERAS_NOT_ENUMERATED, lwdVar));
        }
        if (n(lwdVarD) && !n(lwdVar) && this.r.s()) {
            Optional optionalFindFirst = Collection.EL.stream(this.m).filter(new cvm(lwdVar, 0)).findFirst();
            int i = (optionalFindFirst.isPresent() && ((cvn) optionalFindFirst.get()).b) ? 3 : 2;
            if (i == 2 && ((cvnVar = (cvn) Collection.EL.stream(this.m).filter(new cvm(lwdVar, 2)).findFirst().orElse(null)) == null || !cvnVar.d)) {
                this.j.f(lwdVar);
            }
            this.q.a(lwdVar, 3, i);
        } else if (!n(lwdVarD) && !n(lwdVar) && this.r.s()) {
            this.k.c();
        }
        l(lwdVar);
    }

    public final boolean i() {
        return d() == lwd.BACK;
    }

    public final boolean j() {
        return d() == lwd.FRONT;
    }

    public final ghx k(lwd lwdVar) {
        if (lwdVar == lwd.BACK && o() != null) {
            return o();
        }
        if (lwdVar == lwd.FRONT && p() != null) {
            return p();
        }
        ((oug) ((oug) d.c()).G((char) 649)).r("No OneCameraCharacteristics found for: %s", d());
        return null;
    }

    public final String toString() {
        return true != i() ? "Front Camera" : "Back Camera";
    }
}
