package defpackage;

import android.content.Context;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;

/* JADX INFO: loaded from: classes2.dex */
public final class nds implements ndi {
    public final Context a;
    public final ClearcutMetricSnapshotTransmitter b;
    private final ojz c;
    private final boolean d;
    private final ndo e;

    public nds(Context context, ojc ojcVar, ndo ndoVar, ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter) {
        this.a = context;
        this.c = obr.au(new ndq(context, 0));
        this.d = c(ojcVar);
        this.e = ndoVar;
        this.b = clearcutMetricSnapshotTransmitter;
    }

    public static boolean c(ojc ojcVar) {
        return ((Boolean) ojcVar.e(false)).booleanValue();
    }

    @Override // defpackage.ndi
    public final void a(final qyk qykVar) {
        int i;
        if (this.d) {
            qxy qxyVar = qykVar.g;
            if (qxyVar == null) {
                qxyVar = qxy.j;
            }
            if ((qxyVar.a & 1) != 0) {
                return;
            }
        }
        if ((qykVar.a & 2048) != 0 && ((Boolean) this.c.a()).booleanValue()) {
            poy poyVar = (poy) qykVar.G(5);
            poyVar.o(qykVar);
            qyc qycVar = qykVar.k;
            if (qycVar == null) {
                qycVar = qyc.o;
            }
            ppm<qyb> ppmVar = qycVar.j;
            if (!ppmVar.isEmpty()) {
                poy poyVarM = qyg.c.m();
                qyb qybVar = null;
                for (qyb qybVar2 : ppmVar) {
                    if (qybVar != null && (i = qybVar.d + 1) != qybVar2.c) {
                        poyVarM.an(0);
                        poyVarM.am(i);
                    }
                    poyVarM.an(qybVar2.b);
                    poyVarM.am(qybVar2.c);
                    qybVar = qybVar2;
                }
                if (qybVar != null && (qybVar.a & 4) != 0) {
                    int i2 = qybVar.d;
                    poyVarM.an(0);
                    poyVarM.am(i2 + 1);
                }
                poy poyVar2 = (poy) qycVar.G(5);
                poyVar2.o(qycVar);
                if (poyVar2.c) {
                    poyVar2.m();
                    poyVar2.c = false;
                }
                ((qyc) poyVar2.b).j = qyc.A();
                if (poyVar2.c) {
                    poyVar2.m();
                    poyVar2.c = false;
                }
                qyc qycVar2 = (qyc) poyVar2.b;
                qyg qygVar = (qyg) poyVarM.j();
                qygVar.getClass();
                qycVar2.i = qygVar;
                qycVar2.a |= 128;
                qycVar = (qyc) poyVar2.j();
            }
            if (poyVar.c) {
                poyVar.m();
                poyVar.c = false;
            }
            qyk qykVar2 = (qyk) poyVar.b;
            qycVar.getClass();
            qykVar2.k = qycVar;
            qykVar2.a |= 2048;
            qykVar = (qyk) poyVar.j();
        }
        plk.af(pgb.i(this.e.a(), new pgk() { // from class: ndr
            @Override // defpackage.pgk
            public final pht a(Object obj) {
                nds ndsVar = this.a;
                qyk qykVar3 = qykVar;
                ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter = ndsVar.b;
                Context context = ndsVar.a;
                ppa ppaVar = (ppa) ndf.c.m();
                ppaVar.o((ndf) obj);
                if (ppaVar.c) {
                    ppaVar.m();
                    ppaVar.c = false;
                }
                ndf ndfVar = (ndf) ppaVar.b;
                qykVar3.getClass();
                ndfVar.b = qykVar3;
                ndfVar.a |= 1;
                return clearcutMetricSnapshotTransmitter.a(context, (ndf) ppaVar.j());
            }
        }, pgr.INSTANCE), new cdd(4), pgr.INSTANCE);
    }

    @Override // defpackage.ndi
    public final nle b() {
        return new nle(9);
    }
}
