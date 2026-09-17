package defpackage;

import com.google.googlex.gcam.PostviewParams;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class hbb implements hea {
    private static final ouj c = ouj.h("com/google/android/apps/camera/pixelcamerakit/commands/PckZslHdrPlusProcessor");
    public final ebe a;
    public final eaw b;
    private final lvp d;
    private final gsf e;
    private final dzr f;
    private final dzv g;
    private final ecj h;
    private final ljf i;
    private final hcg j;
    private final iio k;
    private final eax l;
    private final eam m;
    private final eex n;
    private final hes o;
    private final ojc p;
    private final ddf q;

    public hbb(ebe ebeVar, lvp lvpVar, gsf gsfVar, dzr dzrVar, dzv dzvVar, eaw eawVar, ecj ecjVar, ljf ljfVar, hcg hcgVar, iio iioVar, eax eaxVar, eam eamVar, eex eexVar, hes hesVar, ojc ojcVar, ddf ddfVar) {
        this.a = ebeVar;
        this.d = lvpVar;
        this.e = gsfVar;
        this.f = dzrVar;
        this.g = dzvVar;
        this.h = ecjVar;
        this.b = eawVar;
        this.i = ljfVar;
        this.j = hcgVar;
        this.k = iioVar;
        this.l = eaxVar;
        this.m = eamVar;
        this.n = eexVar;
        this.o = hesVar;
        this.p = ojcVar;
        this.q = ddfVar;
    }

    private static final void i(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((lmr) it.next()).close();
        }
    }

    @Override // defpackage.hea
    public final void a(List list, gox goxVar, gog gogVar, int i, lzv lzvVar, dzu dzuVar) {
        h(list, goxVar, gogVar, i, lzvVar, dzuVar, null);
    }

    public final int b(lmr lmrVar, edd eddVar, boolean z, int i, int i2, int i3) throws llv {
        String str;
        mad madVar;
        mad madVar2;
        int i4;
        this.i.e("processFrame");
        try {
            try {
                this.i.e("awaitComplete");
                mip.bh(lmrVar);
                this.i.f();
                lmw lmwVarB = lmrVar.b();
                lmwVarB.getClass();
                if (z) {
                    this.i.e("hdrPlusPayloadProcessorManager.addPayloadFrame");
                    this.b.e(eddVar, lmrVar);
                    this.i.f();
                }
                lzv lzvVarC = lmrVar.c();
                if (lzvVarC == null) {
                    ((oug) ((oug) c.b()).G(2286)).A("Failure for frame %d @%d of %d, skipping.", Integer.valueOf(i + 1), Long.valueOf(lmwVarB.c), Integer.valueOf(i2));
                    this.i.f();
                    return i;
                }
                this.i.e("pckHdrZsl#addPayloadFrame");
                hcf hcfVarA = this.j.a(lmrVar);
                if (z) {
                    mad madVarE = hcfVarA.e();
                    mad madVarD = hcfVarA.d();
                    str = hcfVarA.a().c().a;
                    madVar = madVarE;
                    madVar2 = madVarD;
                } else {
                    mad madVarF = hcfVarA.f();
                    lnx lnxVarB = hcfVarA.b();
                    if (lnxVarB == null) {
                        ((oug) ((oug) c.b()).G((char) 2285)).o("Can't find the source camera for the secondary image.");
                        throw new llv("Can't find the source camera for the secondary image.");
                    }
                    str = lnxVarB.c().a;
                    madVar = madVarF;
                    madVar2 = null;
                }
                lzv lzvVarB = (!hcfVarA.h() || z) ? lzvVarC : hdw.b(lzvVarC, str);
                lmrVar.close();
                this.a.p(eddVar, i, lzvVarB, i3, madVar, madVar2);
                if (madVar != null) {
                    i4 = i + 1;
                    eddVar.a();
                } else {
                    ((oug) ((oug) c.c()).G(2283)).A("Ignoring missing raw frame %d of %d for shot %d .", Integer.valueOf(i + 1), Integer.valueOf(i2), Integer.valueOf(eddVar.a()));
                    if (madVar2 != null) {
                        madVar2.close();
                    }
                    i4 = i;
                }
                this.i.f();
                this.i.f();
                return i4;
            } catch (InterruptedException e) {
                lmw lmwVarB2 = lmrVar.b();
                ((oug) ((oug) ((oug) c.b()).h(e)).G(2287)).A("Completion failure for frame %d @%d of %d, skipping.", Integer.valueOf(i + 1), Long.valueOf(lmwVarB2 != null ? lmwVarB2.c : -1L), Integer.valueOf(i2));
                this.i.f();
                this.i.f();
                return i;
            }
        } catch (Throwable th) {
            this.i.f();
            throw th;
        }
    }

    protected final int c(List list, edd eddVar, boolean z, int i) throws llv {
        this.i.e("findFramesToOmitDueToTemporalBinning");
        Set setA = this.o.a(list);
        this.i.g("pckZslHdrPlusProcessor#processPayload");
        Iterator it = list.iterator();
        int iB = 0;
        while (it.hasNext()) {
            lmr lmrVar = (lmr) it.next();
            lmw lmwVarB = lmrVar.b();
            if (lmwVarB == null) {
                ((oug) ((oug) c.c()).G(2289)).p("Skipping invalid frame at %d", iB);
                lmrVar.close();
            } else if (setA.contains(lmwVarB)) {
                lmrVar.close();
            } else {
                iB = b(lmrVar, eddVar, z, iB, i, 1);
            }
        }
        this.i.f();
        return iB;
    }

    public final edd d(List list, gog gogVar, int i, lzv lzvVar, dzu dzuVar, boolean z, boolean z2) {
        String str;
        int i2;
        try {
            try {
                int iA = this.a.a(lzvVar);
                PostviewParams postviewParamsB = dzy.b(this.d, this.e);
                this.i.e("detectFalconRequest");
                int iA2 = this.n.a(lzvVar);
                boolean z3 = iA2 == 3;
                boolean z4 = iA2 == 1 || z3;
                this.i.f();
                if (z) {
                    this.f.c(gogVar, this.h.a(lzvVar, iA), dzuVar, brg.d(gogVar.a.a, this.d, this.q), true, z3);
                } else if (!z4) {
                    switch (iA2) {
                        case 1:
                            str = "NOT_REQUESTED";
                            break;
                        case 2:
                            str = "REQUESTED_DISABLED";
                            break;
                        default:
                            str = "REQUESTED_ENABLED";
                            break;
                    }
                    StringBuilder sb = new StringBuilder(str.length() + 40);
                    sb.append("Not processing secondary payload, mode: ");
                    sb.append(str);
                    throw new dlv(sb.toString());
                }
                int i3 = -1;
                int i4 = true != z2 ? -1 : 0;
                if (this.p.g() && list != null) {
                    hca hcaVar = (hca) this.p.c();
                    ojc ojcVarN = gogVar.b.n();
                    if (((Integer) hcaVar.a.fA()).intValue() == esn.ACTION.ordinal() && ojcVarN.g()) {
                        long jC = ((ijp) ojcVarN.c()).c();
                        long j = Long.MAX_VALUE;
                        for (int i5 = 0; i5 < list.size(); i5++) {
                            lmw lmwVarB = ((lmr) list.get(i5)).b();
                            if (lmwVarB != null) {
                                long jAbs = Math.abs(jC - lmwVarB.b);
                                if (jAbs < j) {
                                    i3 = i5;
                                    j = jAbs;
                                }
                            }
                        }
                    }
                    i2 = i3 < 0 ? i : i3;
                }
                this.m.e(gogVar);
                this.i.e("pckHdrZsl#startZslShot");
                edd eddVarG = this.a.g(iA, gogVar, postviewParamsB, ((dzt) dzuVar).g, lzvVar, i4, i2, !z);
                this.i.f();
                return eddVarG;
            } catch (Throwable th) {
                this.i.f();
                throw th;
            }
        } catch (IllegalStateException | InterruptedException | ExecutionException | llv e) {
            ((oug) ((oug) ((oug) c.b()).h(e)).G(2292)).o("Unable to start ZSL shot ");
            this.i.f();
            return null;
        }
    }

    public final void e(edd eddVar, lzv lzvVar, boolean z) {
        this.a.s(eddVar);
        if (z) {
            this.b.f(eddVar, null, lzvVar);
        }
    }

    public final void f(int i, gog gogVar, lzv lzvVar, edd eddVar, boolean z) throws dma {
        this.i.e("pckHdrZsl#endPayload");
        if (this.a.y(eddVar)) {
            if (z) {
                this.b.h(eddVar);
                iij iijVarK = gogVar.b.k();
                iijVarK.d(lzvVar, true);
                this.k.c(iijVarK);
                int iIntValue = gogVar.b.i() == hsr.NORMAL ? 1 : this.l.a().intValue();
                poy poyVarM = pet.d.m();
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                pet petVar = (pet) poyVarM.b;
                int i2 = 1 | petVar.a;
                petVar.a = i2;
                petVar.b = iIntValue;
                petVar.a = i2 | 2;
                petVar.c = i;
                ((iik) iijVarK).r = (pet) poyVarM.j();
            }
            if (this.a.z(eddVar)) {
                this.i.f();
                return;
            }
        }
        int iA = eddVar.a();
        StringBuilder sb = new StringBuilder(56);
        sb.append("Error ending the HDR+ payload, aborting shot ");
        sb.append(iA);
        String string = sb.toString();
        ((oug) ((oug) c.b()).G((char) 2295)).r("%s", string);
        if (z) {
            this.b.d(eddVar.c.b.h());
        }
        this.a.o(eddVar);
        throw new dma(string);
    }

    public final void g(List list, gox goxVar, gog gogVar) {
        lzv lzvVar;
        if (list.isEmpty()) {
            throw new dls("No frames to process found.");
        }
        dzu dzuVarA = this.g.a();
        int i = 0;
        lzv lzvVarA = null;
        while (true) {
            if (i >= ((orr) list).c) {
                lzvVar = lzvVarA;
                break;
            }
            lzvVarA = hdw.a(this.j.a((lmr) list.get(i)), true);
            if (lzvVarA != null) {
                lzvVar = lzvVarA;
                break;
            }
            i++;
        }
        if (lzvVar != null) {
            h(list, goxVar, gogVar, -1, lzvVar, dzuVarA, null);
        } else {
            i(list);
            throw new dlz(null);
        }
    }

    public final void h(List list, gox goxVar, gog gogVar, int i, lzv lzvVar, dzu dzuVar, edd eddVar) {
        goxVar.close();
        list.size();
        boolean z = i < 0;
        try {
            try {
                this.i.e("pckHdrZsl#processFrames");
                if (eddVar == null) {
                    eddVar = d(list, gogVar, i, lzvVar, dzuVar, z, false);
                }
                try {
                    if (eddVar == null) {
                        ((oug) ((oug) c.c()).G(2300)).o("Failed to initiate HDR plus shot capture.");
                        this.i.f();
                        throw new dlw("Invalid shot received from HdrPlusSession.");
                    }
                    this.i.g("pckHdrZsl#processPayload");
                    e(eddVar, lzvVar, z);
                    c(list, eddVar, z, list.size());
                    this.i.f();
                    f(list.size(), gogVar, lzvVar, eddVar, z);
                    i(list);
                    this.i.f();
                } catch (llv e) {
                    e = e;
                    ((oug) ((oug) ((oug) c.b()).h(e)).G(2299)).o("Error processing HDR+ payload.");
                    if (eddVar != null) {
                        this.a.o(eddVar);
                    }
                    throw new dma(e, null);
                }
            } catch (llv e2) {
                e = e2;
            }
        } catch (Throwable th) {
            i(list);
            this.i.f();
            throw th;
        }
    }
}
