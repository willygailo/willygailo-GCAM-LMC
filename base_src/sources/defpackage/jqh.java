package defpackage;

import android.graphics.PointF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class jqh extends mip {
    final /* synthetic */ jqi a;

    public jqh(jqi jqiVar) {
        this.a = jqiVar;
    }

    @Override // defpackage.mip
    public final boolean p(jtw jtwVar) {
        if (!this.a.h.F()) {
            return false;
        }
        gtg gtgVar = this.a.h;
        PointF pointFA = jtwVar.a();
        if (!gtgVar.e.k(ddv.d) ? !mip.eo(pointFA, gtgVar.aU) : !(mip.eo(pointFA, gtgVar.aT) || mip.eo(pointFA, gtgVar.aV.e()))) {
            return false;
        }
        this.a.h.g();
        return true;
    }
}
