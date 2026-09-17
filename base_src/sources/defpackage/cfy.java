package defpackage;

import com.google.android.GoogleCameraEngR18F1.R;
import j$.util.Collection;
import j$.util.function.Function;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class cfy implements lie, cia, chy, cmu, bmq {
    public static final ouj a = ouj.h("com/google/android/apps/camera/camcorder/Video2ActiveCamcorderCaptureSession");
    public cfx A;
    public final ggo B;
    public cng C;
    public final nvb D;
    private final Executor E;
    private final gvb F;
    private final jje G;
    private final ckg H;
    private final cgk I;
    private final jtd J;
    private long K;
    private final cve L;
    public final lwd b;
    public final lar c;
    public final cvc d;
    public final cgx e;
    public final cju h;
    public final bne i;
    public final cuz j;
    public final ilu k;
    public final cpc l;
    public final ojc m;
    public final cof n;
    public final ddf o;
    public final cmy p;
    public final ScheduledExecutorService q;
    public final ijw r;
    public final qkg s;
    public final pyn t;
    public final cif u;
    public final ckd v;
    public final int w;
    public ScheduledFuture y;
    public cgl z;
    public final Object f = new Object();
    public final List g = new ArrayList();
    public boolean x = false;

    public cfy(Executor executor, lar larVar, gvb gvbVar, jje jjeVar, cvc cvcVar, cgx cgxVar, ckg ckgVar, cve cveVar, cgk cgkVar, nvb nvbVar, cka ckaVar, cvo cvoVar, bne bneVar, ggo ggoVar, cuz cuzVar, ilu iluVar, cpc cpcVar, ojc ojcVar, cof cofVar, ddf ddfVar, cmy cmyVar, ScheduledExecutorService scheduledExecutorService, ijw ijwVar, qkg qkgVar, pyn pynVar, jtd jtdVar, cif cifVar, ckd ckdVar, byte[] bArr, byte[] bArr2) {
        this.i = bneVar;
        this.B = ggoVar;
        this.j = cuzVar;
        this.b = cvoVar.d();
        this.E = executor;
        this.c = larVar;
        this.F = gvbVar;
        this.G = jjeVar;
        this.d = cvcVar;
        this.e = cgxVar;
        this.H = ckgVar;
        this.L = cveVar;
        this.I = cgkVar;
        this.h = ckaVar.a();
        this.D = nvbVar;
        this.l = cpcVar;
        this.k = iluVar;
        this.m = ojcVar;
        this.n = cofVar;
        this.o = ddfVar;
        this.p = cmyVar;
        this.q = scheduledExecutorService;
        this.r = ijwVar;
        this.s = qkgVar;
        this.t = pynVar;
        this.J = jtdVar;
        this.u = cifVar;
        this.v = ckdVar;
        this.w = ckdVar.A;
    }

    @Override // defpackage.bmq
    public final bpt a(bnh bnhVar) {
        return this.l.a(bnhVar);
    }

    public final void b() {
        this.F.b(cfy.class);
        ckg ckgVar = this.H;
        synchronized (ckgVar.d) {
            ckgVar.c();
            if (ckgVar.e) {
                ckgVar.e = false;
                ckgVar.b.fB(ckgVar.b(ckgVar.a.c()));
            }
        }
        this.G.h();
        this.G.f();
        this.L.a.b(R.raw.video_stop);
        this.J.b();
        this.u.f();
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f) {
            if (this.A == cfx.CLOSED) {
                ((oug) ((oug) a.b()).G(351)).o("Capture session has been closed.");
                return;
            }
            this.H.close();
            if (this.A == cfx.STARTING_RECORDING) {
                this.c.execute(new cfp(this, 1));
            }
            if (this.A == cfx.RECORDING) {
                try {
                    n(true).get();
                } catch (InterruptedException | ExecutionException e) {
                    ((oug) ((oug) a.b()).G(350)).r("failed to close current recording: %s", e);
                }
            }
            if (this.A == cfx.STARTING_RECORDING || this.A == cfx.STOPPING_RECORDING) {
                this.c.execute(new cfp(this, 2));
            }
            this.g.clear();
            this.k.a();
            this.p.d();
            l(cfx.CLOSED);
            this.D.l(cms.RECORDING_SESSION);
            this.D.l(cms.CAPTURE_SESSION);
        }
    }

    public final void d() {
        n(false);
        this.e.k(false);
    }

    public final void e() {
        this.l.e();
        this.K = System.currentTimeMillis();
    }

    @Override // defpackage.chy
    public final void f() {
    }

    @Override // defpackage.lgb
    public final void fE(final lga lgaVar) {
        if (!lgaVar.l) {
            this.e.fE(lgaVar);
        } else {
            ddi ddiVar = dcu.a;
            o(new Runnable() { // from class: cfq
                @Override // java.lang.Runnable
                public final void run() {
                    cfy cfyVar = this.a;
                    cfyVar.e.fE(lgaVar);
                }
            });
        }
    }

    @Override // defpackage.chy
    public final void g() {
    }

    @Override // defpackage.chy
    public final void gb() {
    }

    @Override // defpackage.chy
    public final void h() {
    }

    @Override // defpackage.chy
    public final void i(clf clfVar) {
        for (ckw ckwVar : clfVar.a) {
            final cvc cvcVar = this.d;
            final lwd lwdVar = this.b;
            int iC = cvcVar.e.c(ijv.RECORD_STARTING, ijv.RECORD_STARTED);
            int iC2 = cvcVar.e.c(ijv.RECORD_STOPPING, ijv.RECORD_STOPPED);
            poy poyVarM = pem.B.m();
            float seconds = TimeUnit.MILLISECONDS.toSeconds(ckwVar.d);
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pem pemVar = (pem) poyVarM.b;
            pemVar.a |= 1;
            pemVar.b = seconds;
            int i = ckwVar.b().c().a;
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pem pemVar2 = (pem) poyVarM.b;
            pemVar2.a |= 8;
            pemVar2.e = i;
            int i2 = ckwVar.b().c().b;
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pem pemVar3 = (pem) poyVarM.b;
            pemVar3.a |= 4;
            pemVar3.d = i2;
            long jA = ckwVar.a();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pem pemVar4 = (pem) poyVarM.b;
            pemVar4.a |= 2;
            pemVar4.c = jA;
            float f = ckwVar.b.c == ldz.FPS_AUTO ? -1 : ckwVar.b.c.i;
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pem pemVar5 = (pem) poyVarM.b;
            int i3 = pemVar5.a | 16;
            pemVar5.a = i3;
            pemVar5.f = f;
            leh lehVar = ckwVar.b;
            int i4 = lehVar.e;
            int i5 = i3 | 128;
            pemVar5.a = i5;
            pemVar5.i = i4;
            int i6 = lehVar.f;
            pemVar5.a = i5 | 256;
            pemVar5.j = i6;
            boolean zC = cvcVar.b.c();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pem pemVar6 = (pem) poyVarM.b;
            int i7 = pemVar6.a | 32;
            pemVar6.a = i7;
            pemVar6.g = zC;
            int i8 = ckwVar.f;
            int i9 = i7 | 64;
            pemVar6.a = i9;
            pemVar6.h = i8;
            int i10 = ckwVar.g;
            int i11 = i9 | 2048;
            pemVar6.a = i11;
            pemVar6.m = i10;
            long j = ckwVar.k;
            pemVar6.a = i11 | 512;
            pemVar6.k = j;
            Map map = ckwVar.l;
            poy poyVarM2 = pel.k.m();
            for (lga lgaVar : map.keySet()) {
                Integer num = (Integer) map.get(lgaVar);
                if (num != null) {
                    cqj cqjVar = cqj.OFF;
                    lga lgaVar2 = lga.VIDEO_BUFFER_DELAY;
                    jrl jrlVar = jrl.UNINITIALIZED;
                    switch (lgaVar) {
                        case VIDEO_BUFFER_DELAY:
                            int iIntValue = num.intValue();
                            if (poyVarM2.c) {
                                poyVarM2.m();
                                poyVarM2.c = false;
                            }
                            pel pelVar = (pel) poyVarM2.b;
                            pelVar.a |= 1;
                            pelVar.b = iIntValue;
                            break;
                        case AUDIO_BUFFER_DELAY:
                            int iIntValue2 = num.intValue();
                            if (poyVarM2.c) {
                                poyVarM2.m();
                                poyVarM2.c = false;
                            }
                            pel pelVar2 = (pel) poyVarM2.b;
                            pelVar2.a |= 2;
                            pelVar2.c = iIntValue2;
                            break;
                        case VIDEO_TRACK_FAIL_TO_START:
                            int iIntValue3 = num.intValue();
                            if (poyVarM2.c) {
                                poyVarM2.m();
                                poyVarM2.c = false;
                            }
                            pel pelVar3 = (pel) poyVarM2.b;
                            pelVar3.a |= 4;
                            pelVar3.d = iIntValue3;
                            break;
                        case AUDIO_TRACK_FAIL_TO_START:
                            int iIntValue4 = num.intValue();
                            if (poyVarM2.c) {
                                poyVarM2.m();
                                poyVarM2.c = false;
                            }
                            pel pelVar4 = (pel) poyVarM2.b;
                            pelVar4.a |= 8;
                            pelVar4.e = iIntValue4;
                            break;
                        case AUDIO_RECORD_ERROR:
                            int iIntValue5 = num.intValue();
                            if (poyVarM2.c) {
                                poyVarM2.m();
                                poyVarM2.c = false;
                            }
                            pel pelVar5 = (pel) poyVarM2.b;
                            pelVar5.a |= 16;
                            pelVar5.f = iIntValue5;
                            break;
                        case MUXER_STOP_ERROR:
                            int iIntValue6 = num.intValue();
                            if (poyVarM2.c) {
                                poyVarM2.m();
                                poyVarM2.c = false;
                            }
                            pel pelVar6 = (pel) poyVarM2.b;
                            pelVar6.a |= 32;
                            pelVar6.g = iIntValue6;
                            break;
                        case MEDIA_CODEC_ERROR_AUDIO:
                        case MEDIA_CODEC_ERROR_VIDEO:
                            int iIntValue7 = num.intValue();
                            if (poyVarM2.c) {
                                poyVarM2.m();
                                poyVarM2.c = false;
                            }
                            pel pelVar7 = (pel) poyVarM2.b;
                            pelVar7.a |= 64;
                            pelVar7.h = iIntValue7;
                            break;
                        case FILE_LOST:
                            int iIntValue8 = num.intValue();
                            if (poyVarM2.c) {
                                poyVarM2.m();
                                poyVarM2.c = false;
                            }
                            pel pelVar8 = (pel) poyVarM2.b;
                            pelVar8.a |= 128;
                            pelVar8.i = iIntValue8;
                            break;
                        case OTHER:
                            int iIntValue9 = num.intValue();
                            if (poyVarM2.c) {
                                poyVarM2.m();
                                poyVarM2.c = false;
                            }
                            pel pelVar9 = (pel) poyVarM2.b;
                            pelVar9.a |= 256;
                            pelVar9.j = iIntValue9;
                            break;
                    }
                }
            }
            pel pelVar10 = (pel) poyVarM2.j();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pem pemVar7 = (pem) poyVarM.b;
            pelVar10.getClass();
            pemVar7.l = pelVar10;
            int i12 = pemVar7.a | 1024;
            pemVar7.a = i12;
            int i13 = ckwVar.h;
            int i14 = i12 | 4096;
            pemVar7.a = i14;
            pemVar7.n = i13;
            int i15 = ckwVar.i;
            int i16 = i14 | 8192;
            pemVar7.a = i16;
            pemVar7.o = i15;
            int i17 = ckwVar.j;
            pemVar7.a = i16 | 16384;
            pemVar7.p = i17;
            int iA = ckwVar.y.a(1);
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pem pemVar8 = (pem) poyVarM.b;
            pemVar8.a |= 32768;
            pemVar8.q = iA;
            int iA2 = ckwVar.y.a(2);
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pem pemVar9 = (pem) poyVarM.b;
            int i18 = pemVar9.a | 65536;
            pemVar9.a = i18;
            pemVar9.r = iA2;
            int i19 = 131072 | i18;
            pemVar9.a = i19;
            pemVar9.s = iC;
            pemVar9.a = 262144 | i19;
            pemVar9.t = iC2;
            Iterable iterable = (Iterable) Collection.EL.stream(ckwVar.n).map(new Function() { // from class: cvb
                @Override // j$.util.function.Function
                public final /* synthetic */ Function andThen(Function function) {
                    return Function.CC.$default$andThen(this, function);
                }

                @Override // j$.util.function.Function
                public final Object apply(Object obj) {
                    cvc cvcVar2 = cvcVar;
                    lwd lwdVar2 = lwdVar;
                    cqj cqjVar2 = (cqj) obj;
                    if (!cvcVar2.b.c()) {
                        return peo.NO_STABILIZATION;
                    }
                    if (lwdVar2 == lwd.FRONT) {
                        return peo.STEADY_FACE;
                    }
                    cqj cqjVar3 = cqj.OFF;
                    lga lgaVar3 = lga.VIDEO_BUFFER_DELAY;
                    jrl jrlVar2 = jrl.UNINITIALIZED;
                    switch (cqjVar2.ordinal()) {
                        case 1:
                            return peo.STANDARD;
                        case 2:
                            return peo.CINEMATIC;
                        case 3:
                            return peo.LOCKED;
                        case 4:
                            return peo.ACTIVE;
                        default:
                            String strValueOf = String.valueOf(cqjVar2);
                            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 32);
                            sb.append("Not a valid stabilization mode: ");
                            sb.append(strValueOf);
                            throw new IllegalArgumentException(sb.toString());
                    }
                }

                @Override // j$.util.function.Function
                public final /* synthetic */ Function compose(Function function) {
                    return Function.CC.$default$compose(this, function);
                }
            }).collect(Collectors.toList());
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pem pemVar10 = (pem) poyVarM.b;
            ppk ppkVar = pemVar10.u;
            if (!ppkVar.c()) {
                pemVar10.u = ppd.x(ppkVar);
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                pemVar10.u.g(((peo) it.next()).g);
            }
            int i20 = ckwVar.o;
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pem pemVar11 = (pem) poyVarM.b;
            int i21 = pemVar11.a | 524288;
            pemVar11.a = i21;
            pemVar11.v = i20;
            float f2 = ckwVar.q;
            int i22 = i21 | 1048576;
            pemVar11.a = i22;
            pemVar11.w = f2;
            long j2 = ckwVar.r;
            int i23 = 2097152 | i22;
            pemVar11.a = i23;
            pemVar11.x = j2;
            long j3 = ckwVar.s;
            int i24 = i23 | 4194304;
            pemVar11.a = i24;
            pemVar11.y = j3;
            boolean z = ckwVar.v;
            pemVar11.a = i24 | 8388608;
            pemVar11.z = z;
            if (ckwVar.w.g()) {
                cim cimVar = (cim) ckwVar.w.c();
                poy poyVarM3 = pdz.g.m();
                boolean z2 = cimVar.a;
                if (poyVarM3.c) {
                    poyVarM3.m();
                    poyVarM3.c = false;
                }
                pdz pdzVar = (pdz) poyVarM3.b;
                int i25 = pdzVar.a | 1;
                pdzVar.a = i25;
                pdzVar.b = z2;
                boolean z3 = cimVar.b;
                int i26 = i25 | 2;
                pdzVar.a = i26;
                pdzVar.c = z3;
                long j4 = cimVar.c;
                int i27 = i26 | 4;
                pdzVar.a = i27;
                pdzVar.d = j4;
                int i28 = cimVar.d;
                int i29 = i27 | 8;
                pdzVar.a = i29;
                pdzVar.e = i28;
                int i30 = cimVar.e;
                pdzVar.a = i29 | 16;
                pdzVar.f = i30;
                pdz pdzVar2 = (pdz) poyVarM3.j();
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                pem pemVar12 = (pem) poyVarM.b;
                pdzVar2.getClass();
                pemVar12.A = pdzVar2;
                pemVar12.a |= 16777216;
            }
            cvcVar.a.ao(cvc.c(cvcVar.c.a(), false), lwdVar, ckwVar.c, ((Integer) cvcVar.b.a.c(htu.c)).intValue() != jbp.OFF.e, (pem) poyVarM.j(), cvcVar.d.c().j, ckwVar.a.b() == hss.MARS_STORE, ckwVar.x);
        }
        Iterator it2 = clfVar.b.iterator();
        while (it2.hasNext()) {
            this.d.b((ckv) it2.next(), this.b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x02da A[Catch: all -> 0x0323, TryCatch #1 {, blocks: (B:80:0x023b, B:81:0x0241, B:101:0x027d, B:104:0x0286, B:116:0x02da, B:118:0x02ee, B:119:0x02fe, B:107:0x029d, B:109:0x02af, B:114:0x02c8, B:117:0x02e6, B:128:0x0322, B:82:0x0242, B:84:0x0246, B:86:0x0248, B:88:0x024c, B:89:0x0253, B:91:0x0255, B:92:0x0259, B:97:0x025e, B:98:0x0279), top: B:148:0x023b, outer: #3, inners: #0 }] */
    @Override // defpackage.chy
    public final void j(boolean z) {
        cmz cmzVarA;
        pht phtVarU;
        lar.a();
        synchronized (this.f) {
            if (this.A == cfx.RECORDING) {
                n(z);
            } else if (this.A == cfx.NO_RECORDING) {
                synchronized (this.f) {
                    if (m()) {
                        ((oug) ((oug) a.c()).G(365)).o("Not starting recording since the device is thermally throttled");
                    } else {
                        ilv ilvVar = this.k.b;
                        if (ilvVar == ilv.a) {
                            ((oug) ((oug) a.c()).G((char) 367)).o("Can't get current device storage.");
                        } else if (!ilvVar.c()) {
                            ((oug) ((oug) a.c()).G(364)).o("Not starting recording since the device storage is low.");
                            k(false);
                        }
                        if (this.x) {
                            this.x = false;
                        } else {
                            l(cfx.STARTING_RECORDING);
                            this.r.a();
                            this.r.i(ijv.RECORD_STARTING);
                            this.G.g();
                            this.F.a(cfy.class);
                            ckg ckgVar = this.H;
                            synchronized (ckgVar.d) {
                                ckgVar.c();
                                if (!ckgVar.e) {
                                    ckgVar.e = true;
                                }
                            }
                            this.L.a.b(R.raw.video_start);
                            cgx cgxVar = this.e;
                            jas jasVar = cgxVar.d;
                            boolean z2 = cgxVar.w.d.a() > 1;
                            boolean z3 = !cgxVar.w.i.g();
                            jaq jaqVarA = jar.a();
                            jaqVarA.e(z2);
                            jaqVarA.c(cgxVar.o);
                            jaqVarA.b(cgxVar.p);
                            jaqVarA.d(z3);
                            jaqVarA.f(cgxVar.n.g());
                            jasVar.d(jaqVarA.a());
                            cgxVar.d.f();
                            cgxVar.s.d(true);
                            cgxVar.v.c();
                            cgxVar.a.e(true);
                            if (cgxVar.k.g()) {
                                ((ctm) cgxVar.k.c()).f(false);
                                ((ctm) cgxVar.k.c()).d(true);
                                if (cqj.DEFAULT.equals(cgxVar.l.a()) && cgxVar.n(cgxVar.u)) {
                                    cgxVar.e.F();
                                }
                            }
                            this.G.e();
                            this.J.a();
                            this.u.e();
                            ScheduledFuture scheduledFuture = this.y;
                            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                                this.y.cancel(true);
                                e();
                            }
                            long j = 500;
                            if (System.currentTimeMillis() - this.K >= 500) {
                                j = 300;
                            }
                            final cgl cglVarA = this.I.a(this, this.v);
                            this.z = cglVarA;
                            synchronized (cglVarA.f) {
                                int i = cglVarA.K;
                                if (i != 1) {
                                    String strC = aau.c(i);
                                    StringBuilder sb = new StringBuilder(strC.length() + 37);
                                    sb.append("Trying to start recording with state=");
                                    sb.append(strC);
                                    phtVarU = plk.U(new IllegalStateException(sb.toString()));
                                } else {
                                    ljf ljfVar = cglVarA.B;
                                    ckd ckdVar = cglVarA.l;
                                    cqj cqjVarC = cglVarA.c();
                                    float fFloatValue = ((Float) cglVarA.m.b.fA()).floatValue();
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(ckdVar.e.name());
                                    sb2.append("/");
                                    sb2.append(ckdVar.d.name());
                                    if (ckdVar.d.f()) {
                                        sb2.append(ckdVar.d == ldz.FPS_120_HFR_4X ? " SlowMo4x" : " SlowMo8x");
                                    }
                                    sb2.append(" FACING=");
                                    sb2.append(ckdVar.y.name());
                                    if (cqjVarC != null) {
                                        sb2.append(" STAB=");
                                        sb2.append(cqjVarC.name());
                                    }
                                    sb2.append(" ZOOM=");
                                    sb2.append(fFloatValue);
                                    String strValueOf = String.valueOf(sb2.toString());
                                    cglVarA.I = ljfVar.a(strValueOf.length() != 0 ? "Recording Started: ".concat(strValueOf) : new String("Recording Started: "));
                                    synchronized (cglVarA.f) {
                                        cgs cgsVar = cglVarA.i;
                                        ckd ckdVar2 = cglVarA.l;
                                        synchronized (cgsVar.d) {
                                            cmzVarA = cgsVar.c;
                                            if (cmzVarA == null) {
                                                try {
                                                    pht phtVar = cgsVar.b;
                                                    cmzVarA = phtVar != null ? (cmz) phtVar.get() : cgsVar.a(ckdVar2);
                                                } catch (InterruptedException e) {
                                                    e = e;
                                                    ((oug) ((oug) ((oug) cgs.a.b()).h(e)).G(385)).o("Error creating video recorder: ");
                                                    cmzVarA = null;
                                                } catch (ExecutionException e2) {
                                                    e = e2;
                                                    ((oug) ((oug) ((oug) cgs.a.b()).h(e)).G(385)).o("Error creating video recorder: ");
                                                    cmzVarA = null;
                                                }
                                            }
                                        }
                                        if (cmzVarA == null || cmzVarA.c.get()) {
                                            cmzVarA = cglVarA.i.a(cglVarA.l);
                                        } else if (cmzVarA.a.a() == ((Integer) ((lce) cglVarA.m.m).d).intValue() && ((hth) cglVarA.m.q.fA()).equals(cmzVarA.d)) {
                                            if (((Boolean) cglVarA.y.c(htu.ab)).booleanValue() != (cmzVarA.e == hss.MARS_STORE) || !((cik) cglVarA.m.r.fA()).equals(cmzVarA.f)) {
                                                cmzVarA.close();
                                                cmzVarA = cglVarA.i.a(cglVarA.l);
                                            }
                                        } else {
                                            cmzVarA.close();
                                            cmzVarA = cglVarA.i.a(cglVarA.l);
                                        }
                                        cmzVarA.getClass();
                                        cglVarA.G = cmzVarA;
                                        cglVarA.M.k(cms.RECORDING_SESSION).c(cmzVarA);
                                    }
                                    cglVarA.l(2);
                                    final pih pihVarF = pih.f();
                                    cglVarA.r.schedule(new Runnable() { // from class: cgf
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            cgl cglVar = cglVarA;
                                            pih pihVar = pihVarF;
                                            synchronized (cglVar.f) {
                                                int i2 = cglVar.K;
                                                if (i2 != 2) {
                                                    String strC2 = aau.c(i2);
                                                    StringBuilder sb3 = new StringBuilder(strC2.length() + 44);
                                                    sb3.append("Trying to delayedStart recording with state=");
                                                    sb3.append(strC2);
                                                    pihVar.a(new IllegalStateException(sb3.toString()));
                                                }
                                                cmz cmzVar = cglVar.G;
                                                cmzVar.getClass();
                                                lfj lfjVar = cmzVar.a;
                                                cglVar.t.i(ijx.VIDEO_RECORDER_STARTING);
                                                pht phtVarAc = plk.ac(lfjVar.j(cglVar), 3000L, TimeUnit.MILLISECONDS, cglVar.r);
                                                plk.af(phtVarAc, new cgh(cglVar, lfjVar), cglVar.v);
                                                plk.af(phtVarAc, new cgi(cglVar, lfjVar, pihVar), cglVar.c);
                                            }
                                        }
                                    }, j, TimeUnit.MILLISECONDS);
                                    phtVarU = pihVarF;
                                }
                            }
                            plk.af(phtVarU, new cfu(this, 0), pgr.INSTANCE);
                        }
                    }
                }
            } else {
                ((oug) ((oug) a.c()).G(358)).r("Shutter button click ignored with state = %s", this.A);
            }
        }
    }

    public final void k(final boolean z) {
        this.c.execute(new Runnable() { // from class: cfr
            @Override // java.lang.Runnable
            public final void run() {
                cfy cfyVar = this.a;
                boolean z2 = z;
                cfyVar.h.h.fB(true);
                cfyVar.n(false);
                cfyVar.e.d(z2);
            }
        });
    }

    public final void l(cfx cfxVar) {
        synchronized (this.f) {
            this.A = cfxVar;
            cng cngVar = this.C;
            if (cngVar != null) {
                cngVar.i = cfxVar.equals(cfx.RECORDING);
            }
        }
    }

    public final boolean m() {
        cmy cmyVar = this.p;
        return cmyVar.a().a(cmyVar.l);
    }

    public final pht n(boolean z) {
        synchronized (this.f) {
            if (this.A != cfx.RECORDING) {
                ((oug) ((oug) a.c()).G(348)).r("Trying to stop recording but state is: %s", this.A);
                return plk.V(new clf(new ArrayList(), new ArrayList(), null));
            }
            l(cfx.STOPPING_RECORDING);
            this.r.i(ijv.RECORD_STOPPING);
            ArrayList arrayList = new ArrayList(this.g);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((chy) it.next()).gb();
            }
            cgl cglVar = this.z;
            cglVar.getClass();
            pht phtVarD = cglVar.d(z);
            this.z = null;
            plk.af(phtVarD, new cfv(this, arrayList), this.E);
            plk.af(phtVarD, new cfu(this, 2), this.c);
            return phtVarD;
        }
    }

    public final void o(Runnable runnable) {
        plk.af(n(false), new cft(runnable), this.c);
    }
}
