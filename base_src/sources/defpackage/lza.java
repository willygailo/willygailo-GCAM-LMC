package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class lza extends OrientationEventListener {
    final /* synthetic */ lzb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lza(lzb lzbVar, Context context) {
        super(context);
        this.a = lzbVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        ivh ivhVar;
        lzb lzbVar = this.a;
        if (i < 0) {
            return;
        }
        synchronized (lzbVar.c) {
            Iterator it = lzbVar.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                cub cubVar = (cub) it.next();
                synchronized (cubVar.a.v) {
                    cug cugVar = cubVar.a;
                    if (cugVar.n != null && cugVar.r.equals(cuv.LOCKED) && cubVar.a.j.get()) {
                        cug cugVar2 = cubVar.a;
                        int i2 = cugVar2.u;
                        if (i2 == -1) {
                            cugVar2.u = i;
                        } else {
                            int iAbs = Math.abs(i - i2);
                            if (iAbs <= 60 || iAbs >= 300) {
                                ivf ivfVar = cubVar.a.x;
                                synchronized (ivfVar.d) {
                                    ivhVar = ivfVar.c;
                                }
                                if (iAbs <= 20 || iAbs >= 340) {
                                    if (!ivhVar.equals(ivh.ACTIVE)) {
                                        cubVar.a.x.a(ivh.ACTIVE);
                                        cubVar.a.b();
                                    }
                                } else if (!ivhVar.equals(ivh.WARNING)) {
                                    cubVar.a.x.a(ivh.WARNING);
                                    cug cugVar3 = cubVar.a;
                                    cugVar3.k(cugVar3.p);
                                }
                            } else {
                                cubVar.a.f();
                                cql cqlVar = cubVar.a.w;
                                if (cqlVar != null) {
                                    cqlVar.a(cuv.STANDARD, false);
                                }
                                cug cugVar4 = cubVar.a;
                                cugVar4.k(cugVar4.q);
                            }
                        }
                    }
                }
            }
            obr.aF(i < 360);
            int iAbs2 = Math.abs(i - lzbVar.g.e);
            final lic licVarB = Math.min(iAbs2, 360 - iAbs2) >= 50 ? lic.b((((i + 45) / 90) * 90) % 360) : lzbVar.g;
            if (licVarB == lzbVar.g) {
                return;
            }
            lzbVar.g = licVarB;
            for (final lyy lyyVar : lzbVar.a) {
                lzbVar.e.execute(new Runnable() { // from class: lyz
                    @Override // java.lang.Runnable
                    public final void run() {
                        lyyVar.h(licVarB);
                    }
                });
            }
        }
    }
}
