package defpackage;

import android.os.Build;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.FrameRequestVector;
import com.google.googlex.gcam.PostviewParams;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class gzp implements goy {
    private final lzi A;
    private final hex B;
    public final lco a;
    private final lis b;
    private final ljf c;
    private final gsf d;
    private final grp e;
    private final lnc f;
    private final ojz g;
    private final ebe h;
    private final int i;
    private final gzl j;
    private final gzu k;
    private final ecd l;
    private final dzv m;
    private final dzr n;
    private final ecj o;
    private final gvr p;
    private final ojz q;
    private final eam r;
    private final gxl s;
    private final eaw t;
    private final lvp u;
    private final boolean v;
    private final qkg w;
    private final ojc x;
    private final ddf y;
    private final lzh z;

    public gzp(ljf ljfVar, lir lirVar, gsf gsfVar, grp grpVar, lnc lncVar, hcs hcsVar, ebe ebeVar, gzl gzlVar, ecd ecdVar, dzv dzvVar, dzr dzrVar, ecj ecjVar, lco lcoVar, ojz ojzVar, eam eamVar, gzu gzuVar, eaw eawVar, lvp lvpVar, ddf ddfVar, lzh lzhVar, lzi lziVar, qkg qkgVar, ojc ojcVar, hex hexVar, gvr gvrVar, gxl gxlVar) {
        this.c = ljfVar;
        this.d = gsfVar;
        this.e = grpVar;
        this.f = lncVar;
        this.g = hcsVar;
        this.h = ebeVar;
        this.j = gzlVar;
        this.k = gzuVar;
        this.l = ecdVar;
        this.m = dzvVar;
        this.n = dzrVar;
        this.o = ecjVar;
        this.a = lcoVar;
        this.p = gvrVar;
        this.q = ojzVar;
        this.r = eamVar;
        this.u = lvpVar;
        this.s = gxlVar;
        this.t = eawVar;
        this.w = qkgVar;
        this.x = ojcVar;
        this.y = ddfVar;
        this.z = lzhVar;
        this.A = lziVar;
        this.B = hexVar;
        Object objA = hcsVar.a();
        lis lisVarA = lirVar.a("PckHdrPImgCapCmd");
        this.b = lisVarA;
        lisVarA.g("Creating PckHdrPlusImageCaptureCommand.");
        int i = ebeVar.b().b;
        this.i = i;
        this.v = ddfVar.k(ddm.D);
        obr.aQ(((lqd) objA).e >= i);
    }

    private final void d(String str) throws llv {
        this.b.d(str);
        throw new llv(str);
    }

    @Override // defpackage.goy
    public final lco a() {
        return this.a;
    }

    @Override // defpackage.goy
    public final lco b() {
        if (kcy.a == null) {
            return lcv.g(fcy.l());
        }
        return lcv.g(fcy.i(kcy.a, Integer.valueOf(this.k.a())));
    }

    /* JADX WARN: Code duplicated, block: B:164:0x0514 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:248:0x0547 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x0558 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v23, types: [gvr] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [lng] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [lnv] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Type inference failed for: r3v70 */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.goy
    public final void c(gox goxVar, gog gogVar) throws Throwable {
        ?? r3;
        Throwable th;
        gxk gxkVar;
        ?? r4;
        Throwable th2;
        ?? r5;
        Throwable th3;
        Throwable th4;
        edd eddVarE;
        boolean zC;
        lzv lzvVar;
        lzv lzvVar2;
        ojc ojcVarI;
        int i;
        boolean z;
        goe goeVarA;
        lng lngVar;
        if (!((Boolean) this.a.fA()).booleanValue()) {
            this.b.d("WARNING: HdrPlusImageCaptureCommand was executed, but the command is not available. This may result in deadlocks or other unintended behavior.");
        }
        this.c.e("settingsCollector");
        dzu dzuVarA = this.m.a();
        this.c.g("selectFrameStream");
        lqd lqdVarB = this.B.b((lqd) this.g.a());
        this.b.f("Executing HdrPlus capture command.");
        this.c.g("HdrPlusCapture");
        this.c.e("SessionAnd3AConvergence");
        oih oihVar = oih.a;
        boolean z2 = true;
        try {
            try {
                final lng lngVarC = this.f.c();
                try {
                    final gxk gxkVarA = this.s.a(lngVarC);
                    try {
                        ?? r2 = this.p;
                        ?? A = gxkVarA.a();
                        final ggx ggxVarA = r2.a(lngVarC, A);
                        try {
                            try {
                                lap lapVar = new lap();
                                try {
                                    if (this.y.k(ddm.A)) {
                                        try {
                                            if (!this.y.k(ddm.D)) {
                                                this.c.g("stopRepeating");
                                                ((lqb) lngVarC).a.g();
                                            }
                                        } catch (Throwable th5) {
                                            th4 = th5;
                                            lapVar = lapVar;
                                            try {
                                                lapVar.close();
                                                throw th4;
                                            } catch (Throwable th6) {
                                                throw th4;
                                            }
                                        }
                                    }
                                    lpc lpcVarI = lngVarC.i();
                                    this.c.g("Metering");
                                    try {
                                        this.c.e("SmartMetering");
                                        final grh grhVarC = this.e.c(ggxVarA.a());
                                        lapVar.c(grhVarC);
                                        lzv lzvVar3 = grhVarC.a;
                                        if (lzvVar3 == null) {
                                            this.b.h("SmartMetering failed, using last known good metadata instead.");
                                            lzvVar = this.l.a;
                                        } else {
                                            lzvVar = lzvVar3;
                                        }
                                        this.c.f();
                                        if (lzvVar == null) {
                                            d("Viewfinder metering metadata is not available, aborting shot.");
                                        }
                                        ojc ojcVarA = this.e.a();
                                        if (!ojcVarA.g()) {
                                            d("Viewfinder raw frame is not available, aborting shot.");
                                        }
                                        lapVar.c((mad) ojcVarA.c());
                                        this.c.g("Shot");
                                        this.c.e("getGcamPhysicalCameraId");
                                        lzvVar.getClass();
                                        lis lisVar = this.b;
                                        long jB = lzvVar.b();
                                        StringBuilder sb = new StringBuilder(44);
                                        sb.append("Using metering frame at ");
                                        sb.append(jB);
                                        lisVar.b(sb.toString());
                                        int iA = this.h.a(lzvVar);
                                        this.c.g("createPortraitShotParams");
                                        eck eckVarA = this.o.a(lzvVar, iA);
                                        int iD = brg.d(gogVar.a.a, this.u, this.y);
                                        this.c.g("shotConfigFactory#populate");
                                        lzv lzvVar4 = lzvVar;
                                        this.n.c(gogVar, eckVarA, dzuVarA, iD, false, false);
                                        this.c.g("createPostViewParams");
                                        PostviewParams postviewParamsB = dzy.b(this.u, this.d);
                                        this.c.g("startShotCapture");
                                        this.b.b("startShotCapture");
                                        try {
                                            eddVarE = this.h.e(iA, gogVar, postviewParamsB, ((dzt) dzuVarA).g, lzvVar4);
                                            try {
                                                this.c.f();
                                                if (eddVarE == null) {
                                                    d("startShotCapture returned null. Shot failed.");
                                                }
                                                this.c.e("CreateBurstTaker");
                                                gzk gzkVarA = this.j.a(lngVarC, gogVar);
                                                this.c.f();
                                                gogVar.b.u(new gzo(gzkVarA, gogVar));
                                                this.r.e(gogVar);
                                                this.c.e("BuildPsafBurstSpec");
                                                boolean zBooleanValue = ((Boolean) this.q.a()).booleanValue();
                                                lis lisVar2 = this.b;
                                                StringBuilder sb2 = new StringBuilder(33);
                                                sb2.append("PSAF active from settings = ");
                                                sb2.append(zBooleanValue);
                                                lisVar2.b(sb2.toString());
                                                if (zBooleanValue) {
                                                    lzvVar2 = lzvVar4;
                                                    ojcVarI = ojc.i(this.h.i(eddVarE, (mad) ojcVarA.c(), lzvVar2));
                                                } else {
                                                    lzvVar2 = lzvVar4;
                                                    ojcVarI = oih.a;
                                                }
                                                this.c.g("BuildPayloadBurstSpec");
                                                BurstSpec burstSpecJ = this.h.j(eddVarE, (mad) ojcVarA.c(), lzvVar2, false, this.r.m() ? true : null);
                                                this.c.f();
                                                int iIntValue = ((Integer) lqdVarB.a().fA()).intValue();
                                                if (ojcVarI.g()) {
                                                    ojc ojcVarB = ojcVarI.b(eto.r);
                                                    int iA2 = ojcVarB.g() ? (int) ((FrameRequestVector) ojcVarB.c()).a() : 0;
                                                    lis lisVar3 = this.b;
                                                    StringBuilder sb3 = new StringBuilder(32);
                                                    sb3.append("PSAF af burst size = ");
                                                    sb3.append(iA2);
                                                    lisVar3.b(sb3.toString());
                                                    if (iIntValue - iA2 <= 0) {
                                                        this.b.b("not enough capacity to take a burst with PSAF, removing PSAF.");
                                                        ojcVarI = oih.a;
                                                        i = 0;
                                                    } else {
                                                        i = iA2;
                                                    }
                                                } else {
                                                    i = 0;
                                                }
                                                this.c.e("notifyExtendedCaptureSignal");
                                                int iA3 = (int) burstSpecJ.b().a();
                                                int iMin = Math.min(iA3, iIntValue - i);
                                                try {
                                                    this.r.f(fvq.s(this.u, burstSpecJ, oih.a, iMin, 0, false, false, lzvVar2) > TimeUnit.SECONDS.toMillis(6L), this.u.k(), gogVar.b.i() == hsr.LONG_EXPOSURE, true);
                                                    this.c.g("setTotalCaptureTime");
                                                    lzh lzhVar = this.z;
                                                    lzi lziVar = this.A;
                                                    if (lziVar.e() || lziVar.f) {
                                                        z = true;
                                                    } else {
                                                        if (lzhVar.i) {
                                                            oon oonVar = new oon();
                                                            oonVar.e("RQ3A", 7168887);
                                                            oonVar.e("RD2A", 7168879);
                                                            oor oorVarC = oonVar.c();
                                                            oti otiVarListIterator = oorVarC.keySet().listIterator();
                                                            while (true) {
                                                                if (otiVarListIterator.hasNext()) {
                                                                    String str = (String) otiVarListIterator.next();
                                                                    if (Build.ID.startsWith(str)) {
                                                                        if (0 < ((Integer) oorVarC.getOrDefault(str, 0)).intValue()) {
                                                                        }
                                                                    }
                                                                }
                                                                z = true;
                                                            }
                                                        }
                                                        z = false;
                                                    }
                                                    if (this.r.n()) {
                                                        long jS = fvq.s(this.u, burstSpecJ, ojcVarI, iMin, i, this.v, z, lzvVar2);
                                                        goeVarA = gogVar.c.b();
                                                        goeVarA.f(jS);
                                                        ((hdz) this.w.get()).j(jS);
                                                        if (this.x.g()) {
                                                            ((epc) this.x.c()).k(jS);
                                                        }
                                                        lis lisVar4 = this.b;
                                                        StringBuilder sb4 = new StringBuilder(63);
                                                        sb4.append("tripodSignal detected, total capture time: ");
                                                        sb4.append(jS);
                                                        lisVar4.b(sb4.toString());
                                                    } else {
                                                        long jS2 = fvq.s(this.u, burstSpecJ, ojcVarI, iMin, i, false, z, lzvVar2);
                                                        if (!eddVarE.o.equals(ecb.PORTRAIT)) {
                                                            ((hdz) this.w.get()).j(jS2);
                                                        }
                                                        goeVarA = gogVar.c.a();
                                                        goeVarA.f(jS2);
                                                    }
                                                    ((mad) ojcVarA.c()).close();
                                                    try {
                                                        if (burstSpecJ.b().d()) {
                                                            this.b.d("payloadBurstSpec is empty. Payload failed.");
                                                            if (eddVarE != null) {
                                                                try {
                                                                    this.h.o(eddVarE);
                                                                    this.t.d(eddVarE.c.b.h());
                                                                } catch (Throwable th7) {
                                                                    th4 = th7;
                                                                    lapVar = lapVar;
                                                                    lapVar.close();
                                                                    throw th4;
                                                                }
                                                            }
                                                            try {
                                                                lapVar.close();
                                                                if (ggxVarA != null) {
                                                                    try {
                                                                        ggxVarA.close();
                                                                    } catch (Throwable th8) {
                                                                        th = th8;
                                                                        lngVar = lngVarC;
                                                                        gxkVar = gxkVarA;
                                                                        th2 = th;
                                                                        r4 = lngVar;
                                                                        if (gxkVar != null) {
                                                                            try {
                                                                                gxkVar.close();
                                                                            } catch (Throwable th9) {
                                                                            }
                                                                        }
                                                                        try {
                                                                            throw th2;
                                                                        } catch (Throwable th10) {
                                                                            th = th10;
                                                                            r3 = r4;
                                                                            try {
                                                                                r3.close();
                                                                            } catch (Throwable th11) {
                                                                            }
                                                                            try {
                                                                                throw th;
                                                                            } catch (InterruptedException e) {
                                                                                e = e;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (gxkVarA != null) {
                                                                    try {
                                                                        gxkVarA.close();
                                                                    } catch (Throwable th12) {
                                                                        th = th12;
                                                                        lngVar = lngVarC;
                                                                        th = th;
                                                                        r3 = lngVar;
                                                                        r3.close();
                                                                        throw th;
                                                                    }
                                                                }
                                                                lngVarC.close();
                                                                goxVar.close();
                                                                this.s.b();
                                                                this.c.f();
                                                                this.c.f();
                                                                return;
                                                            } catch (Throwable th13) {
                                                                th = th13;
                                                                A = lngVarC;
                                                                gxkVar = gxkVarA;
                                                                th3 = th;
                                                                r5 = A;
                                                                if (ggxVarA != 0) {
                                                                    try {
                                                                        ggxVarA.close();
                                                                    } catch (Throwable th14) {
                                                                    }
                                                                }
                                                                try {
                                                                    throw th3;
                                                                } catch (Throwable th15) {
                                                                    th2 = th15;
                                                                    r4 = r5;
                                                                    if (gxkVar != null) {
                                                                        gxkVar.close();
                                                                    }
                                                                    throw th2;
                                                                }
                                                            }
                                                        }
                                                        this.c.g("clearFrameStreams");
                                                        lpcVarI.c();
                                                        this.c.g("clearMeteringLock");
                                                        try {
                                                            lie lieVar = new lie() { // from class: gzn
                                                                @Override // defpackage.lie, java.lang.AutoCloseable
                                                                public final void close() {
                                                                    ggx ggxVar = ggxVarA;
                                                                    gxk gxkVar2 = gxkVarA;
                                                                    lng lngVar2 = lngVarC;
                                                                    lie lieVar2 = grhVarC;
                                                                    ggxVar.close();
                                                                    gxkVar2.close();
                                                                    lngVar2.close();
                                                                    lieVar2.close();
                                                                }
                                                            };
                                                            this.c.g("takePayloadBurst");
                                                            lapVar = lapVar;
                                                            gxkVar = gxkVarA;
                                                            ojc ojcVar = ojcVarI;
                                                            lngVar = lngVarC;
                                                            try {
                                                                zC = gzkVarA.c(eddVarE, burstSpecJ, ojcVar, lzvVar2, goeVarA, lpc.a(lpcVarI), lqdVarB, lieVar, gogVar.b.k(), iMin, iA3, i);
                                                                try {
                                                                    this.c.f();
                                                                    if (!zC) {
                                                                        throw new llv("HDR+ shot didn't succeed");
                                                                    }
                                                                    lapVar.close();
                                                                    if (ggxVarA != null) {
                                                                        try {
                                                                            ggxVarA.close();
                                                                        } catch (Throwable th16) {
                                                                            th = th16;
                                                                            th2 = th;
                                                                            r4 = lngVar;
                                                                            if (gxkVar != null) {
                                                                                gxkVar.close();
                                                                            }
                                                                            throw th2;
                                                                        }
                                                                    }
                                                                    if (gxkVar != null) {
                                                                        try {
                                                                            gxkVar.close();
                                                                        } catch (Throwable th17) {
                                                                            th = th17;
                                                                            th = th;
                                                                            r3 = lngVar;
                                                                            r3.close();
                                                                            throw th;
                                                                        }
                                                                    }
                                                                    lngVar.close();
                                                                    goxVar.close();
                                                                    this.s.b();
                                                                    this.c.f();
                                                                    this.c.f();
                                                                    return;
                                                                } catch (Throwable th18) {
                                                                    th = th18;
                                                                    if (eddVarE != null) {
                                                                        try {
                                                                            this.h.o(eddVarE);
                                                                            this.t.d(eddVarE.c.b.h());
                                                                        } catch (Throwable th19) {
                                                                            th = th19;
                                                                            th4 = th;
                                                                            lapVar.close();
                                                                            throw th4;
                                                                        }
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th20) {
                                                                th = th20;
                                                                zC = false;
                                                                if (eddVarE != null) {
                                                                    this.h.o(eddVarE);
                                                                    this.t.d(eddVarE.c.b.h());
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (Throwable th21) {
                                                            th = th21;
                                                            lapVar = lapVar;
                                                        }
                                                    } catch (InterruptedException e2) {
                                                        e = e2;
                                                    } catch (Throwable th22) {
                                                        th = th22;
                                                        z2 = false;
                                                        if (z2 && oihVar.g()) {
                                                            gogVar.b.w((Throwable) oihVar.c());
                                                        }
                                                        goxVar.close();
                                                        this.s.b();
                                                        this.c.f();
                                                        this.c.f();
                                                        throw th;
                                                    }
                                                } catch (Throwable th23) {
                                                    th = th23;
                                                    lapVar = lapVar;
                                                }
                                            } catch (Throwable th24) {
                                                th = th24;
                                                lapVar = lapVar;
                                            }
                                        } catch (IllegalStateException e3) {
                                            try {
                                                this.b.e("Error starting shot.", e3);
                                                throw new llv(e3);
                                            } catch (Throwable th25) {
                                                th = th25;
                                                eddVarE = null;
                                                zC = false;
                                                if (eddVarE != null && !zC) {
                                                    this.h.o(eddVarE);
                                                    this.t.d(eddVarE.c.b.h());
                                                }
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th26) {
                                        th = th26;
                                    }
                                } catch (Throwable th27) {
                                    th = th27;
                                    lapVar = lapVar;
                                }
                            } catch (Throwable th28) {
                                th = th28;
                            }
                        } catch (Throwable th29) {
                            gxkVar = gxkVarA;
                            r5 = lngVarC;
                            th3 = th29;
                            if (ggxVarA != 0) {
                                ggxVarA.close();
                            }
                            throw th3;
                        }
                    } catch (Throwable th30) {
                        gxkVar = gxkVarA;
                        r4 = lngVarC;
                        th2 = th30;
                    }
                } catch (Throwable th31) {
                    r3 = lngVarC;
                    th = th31;
                }
            } catch (Throwable th32) {
                th = th32;
            }
        } catch (InterruptedException e4) {
            e = e4;
        } catch (Throwable th33) {
            th = th33;
            z2 = true;
        }
        ojc.i(e);
        throw e;
    }
}
