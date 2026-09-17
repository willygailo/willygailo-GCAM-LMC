package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.location.Location;
import android.media.AudioManager;
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.google.android.GoogleCameraEngR18F1.R;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Timer;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class ipf {
    public static final ouj a = ouj.h("com/google/android/apps/camera/timelapse/TimelapseRecordingController");
    public final inx A;
    public final ioq B;
    public final ipx C;
    public final ipr D;
    public final iqj E;
    public final ljf F;
    public final fjs G;
    public final lij H;
    public final cvc I;
    public final Sensor J;
    public final dib K;
    public lwd L;
    public pht M;
    public double O;
    public double P;
    public long Q;
    public long R;
    public final emb S;
    private final isa T;
    private final cpj U;
    private final cpp V;
    private final jng W;
    private final kas X;
    private final jtd Y;
    private ScheduledFuture Z;
    private final ipd aa;
    private final ipc ab;
    private final ipa ac;
    public long d;
    public final cof f;
    public final cvo g;
    public final ifn h;
    public final ivj i;
    public final Context k;
    public final ojc l;
    public final Executor m;
    public final ink n;
    public final ddf o;
    public final iod p;
    public final lar q;
    public final ojc s;
    public final gvb t;
    public final lda u;
    public final ScheduledExecutorService v;
    public final jje w;
    public final SensorEventListener x;
    public final SensorManager y;
    public final cpy z;
    public final Object b = new Object();
    public final double[] c = new double[3];
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final Object r = new Object();
    public iqn N = iqn.MANUAL_FPS_30_1X;
    public final lce j = new lce(inr.STATE_UNINITIALIZED);

    public ipf(khx khxVar, final cvo cvoVar, ifn ifnVar, ivj ivjVar, Context context, ojc ojcVar, Executor executor, ink inkVar, final ddf ddfVar, emb embVar, lap lapVar, lar larVar, elw elwVar, gvb gvbVar, ojc ojcVar2, lda ldaVar, final qkg qkgVar, jje jjeVar, ScheduledExecutorService scheduledExecutorService, inx inxVar, iod iodVar, ioq ioqVar, ipx ipxVar, ipr iprVar, iqj iqjVar, ljf ljfVar, fjs fjsVar, final cpj cpjVar, hur hurVar, final cpp cppVar, lij lijVar, jng jngVar, cpy cpyVar, cof cofVar, cvc cvcVar, kas kasVar, jtd jtdVar, dib dibVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.J = khxVar.l().getDefaultSensor(4);
        this.g = cvoVar;
        this.h = ifnVar;
        this.i = ivjVar;
        this.k = context;
        this.l = ojcVar;
        this.o = ddfVar;
        this.H = lijVar;
        this.p = iodVar;
        this.n = inkVar;
        this.S = embVar;
        this.m = executor;
        this.q = larVar;
        this.t = gvbVar;
        this.s = ojcVar2;
        this.u = ldaVar;
        this.w = jjeVar;
        this.y = khxVar.l();
        this.A = inxVar;
        this.B = ioqVar;
        this.C = ipxVar;
        this.D = iprVar;
        this.E = iqjVar;
        this.F = ljfVar;
        this.G = fjsVar;
        this.U = cpjVar;
        this.V = cppVar;
        this.W = jngVar;
        this.z = cpyVar;
        this.f = cofVar;
        this.I = cvcVar;
        this.X = kasVar;
        this.v = scheduledExecutorService;
        this.Y = jtdVar;
        this.K = dibVar;
        lapVar.c(ioqVar.e.a(new lij() { // from class: iow
            @Override // defpackage.lij
            public final void fB(Object obj) {
                ipf ipfVar = this.a;
                if (((Boolean) obj).booleanValue() && bqe.w(ipfVar.S)) {
                    ipfVar.g();
                    if (ipfVar.S.a() != null) {
                        Intent intentA = ipfVar.S.a();
                        intentA.getClass();
                        bqe.f(intentA);
                    }
                }
            }
        }, larVar));
        lapVar.c(hurVar.a(new lij() { // from class: iox
            @Override // defpackage.lij
            public final void fB(Object obj) {
                ipf ipfVar = this.a;
                cpp cppVar2 = cppVar;
                cvo cvoVar2 = cvoVar;
                ddf ddfVar2 = ddfVar;
                cpj cpjVar2 = cpjVar;
                qkg qkgVar2 = qkgVar;
                if (ipfVar.j.d != inr.STATE_IDLE) {
                    return;
                }
                cppVar2.a.fB(mip.eH(cvoVar2, ddfVar2, cpjVar2, cppVar2));
                ((jnw) qkgVar2).get().e.n(jrl.TIME_LAPSE, new iot(ipfVar, 4));
            }
        }, larVar));
        this.x = new ioy(this, iqjVar);
        ipa ipaVar = new ipa(this, larVar, ipxVar, gvbVar, elwVar, context, ddfVar);
        this.ac = ipaVar;
        ipb ipbVar = new ipb(this, iqjVar);
        this.T = ipbVar;
        ipc ipcVar = new ipc(this);
        this.ab = ipcVar;
        ipd ipdVar = new ipd(this, ddfVar);
        this.aa = ipdVar;
        ioqVar.ag = ipaVar;
        iqjVar.M = ipbVar;
        iprVar.m = ipcVar;
        inxVar.v = ipdVar;
    }

    public final iqn a() {
        iqn iqnVar = this.N;
        iqnVar.getClass();
        return iqnVar;
    }

    public final void b(lwd lwdVar, iqn iqnVar) {
        ldz ldzVarD = iqn.d(iqnVar);
        this.L = lwdVar;
        iqj iqjVar = this.E;
        iqjVar.m.c(new ipy(iqjVar, 4));
        ioq ioqVar = this.B;
        ioqVar.e.fB(false);
        ioqVar.N = ldzVarD;
        ioqVar.P = lwdVar;
        ioqVar.W = iqnVar;
        ioqVar.O = mip.eH(ioqVar.h, ioqVar.d, ioqVar.x, ioqVar.y);
        if (!ioqVar.d.k(deg.d)) {
            ink inkVar = ioqVar.l;
            if (inkVar.C.c()) {
                leb lebVarEH = mip.eH(inkVar.u, inkVar.w, inkVar.C, inkVar.D);
                inkVar.F = ((iqt) inkVar.y).get();
                inkVar.F.e(inkVar.u.j(), lebVarEH.c().a, lebVarEH.c().b, new inh(inkVar));
                Sensor sensor = inkVar.E;
                if (sensor != null) {
                    inkVar.A.registerListener(inkVar.B, sensor, true != inkVar.v.e() ? 3 : 0);
                }
            }
            inkVar.p.set(0L);
            inkVar.s.set(0L);
        }
        ioqVar.I = new iol(ioqVar);
        this.N = iqnVar;
        if (this.o.k(deg.d)) {
            iod iodVar = this.p;
            synchronized (iodVar.s) {
                iodVar.y = iqnVar;
                iodVar.d.b(((Double) iodVar.t.fA()).doubleValue());
            }
        } else {
            ink inkVar2 = this.n;
            inkVar2.K = iqnVar;
            inkVar2.f.b(((Double) inkVar2.z.fA()).doubleValue());
        }
        this.X.j();
    }

    final void c() {
        if (inr.a((inr) this.j.d)) {
            ((oug) ((oug) a.c()).G((char) 3082)).o("onCriticalStateHandled()");
            i(false);
        }
    }

    final void d() {
        lnz lnzVarA;
        lnf lnfVarA;
        this.F.e("Cheetah-OpenCameraAndStartPreview");
        final ioq ioqVar = this.B;
        ioqVar.d();
        ioqVar.Q = new lap();
        lvs lvsVarB = ioqVar.f.b();
        lvsVarB.getClass();
        ioqVar.J = lvsVarB;
        lvs lvsVarC = ioqVar.f.c();
        lvsVarC.getClass();
        ioqVar.K = lvsVarC;
        ioqVar.L = (lvp) ioqVar.h.e().c();
        ioqVar.M = new jth(ioqVar.ac.a, ioqVar.L, ioqVar.d);
        ioqVar.Z = ((Integer) ioqVar.L.n(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        if (ioqVar.d.k(ddl.T)) {
            ioqVar.R = new gsn(ioqVar.q, ioqVar.r, ioqVar.L, lhs.h(ioqVar.O.c()), ioqVar.d, ioqVar.i);
        } else {
            ioqVar.R = new gsn(ioqVar.q, ioqVar.r, ioqVar.L, ioqVar.d, ioqVar.i);
        }
        lig ligVarA = ioqVar.a(ioqVar.O);
        gsn gsnVar = ioqVar.R;
        ioqVar.w.e("Cheetah-FrameServerStart");
        lnz lnzVarBb = mip.bb(ioqVar.K, ligVarA);
        HashSet hashSet = new HashSet();
        hashSet.add(mip.be(CaptureRequest.CONTROL_CAPTURE_INTENT, 3));
        hashSet.add(mip.be(CaptureRequest.CONTROL_MODE, 2));
        if (ioqVar.x.d()) {
            hashSet.add(mip.eJ(1));
            hashSet.add(mip.be(CaptureRequest.STATISTICS_OIS_DATA_MODE, 1));
        } else {
            hashSet.add(mip.eJ(0));
        }
        if (ioqVar.d.k(deg.d)) {
            hashSet.add(mip.eK(ioqVar.x.c() ? 1 : 0));
            ojc ojcVarI = kdd.f != null ? ojc.i(mip.be(kdd.f, true)) : oih.a;
            if (ojcVarI.g()) {
                hashSet.add((lnq) ojcVarI.c());
            }
        } else {
            hashSet.add(mip.eK(0));
            ojc ojcVarI2 = kcz.k != null ? ojc.i(mip.be(kcz.k, 1)) : oih.a;
            if (ojcVarI2.g()) {
                hashSet.add((lnq) ojcVarI2.c());
            }
        }
        hashSet.addAll(mip.eL(((gsm) gsnVar.fA()).a, ((gsm) gsnVar.fA()).c));
        hashSet.addAll(fvq.v(jrl.TIME_LAPSE, ioqVar.L));
        if (ioqVar.d.k(deg.d)) {
            lny lnyVarA = lnz.a();
            lnyVarA.g(ioqVar.O.c());
            lnyVarA.b(ioqVar.K);
            lnyVarA.f(34);
            lnyVarA.c(20);
            lnyVarA.h(loa.IMAGE_READER);
            lnyVarA.i(65536L);
            lnyVarA.d(true);
            lnzVarA = lnyVarA.a();
            lne lneVarEI = mip.eI(ioqVar.L, ioqVar.N, hashSet);
            lneVarEI.f(ioqVar.J);
            lneVarEI.d(lnzVarA);
            lneVarEI.d(lnzVarBb);
            lneVarEI.k(ioqVar.ah);
            lnfVarA = lneVarEI.a();
        } else {
            lny lnyVarA2 = lnz.a();
            lnyVarA2.g(ioqVar.O.c());
            lnyVarA2.b(ioqVar.K);
            lnyVarA2.f(35);
            lnyVarA2.c(15);
            lnyVarA2.h(loa.IMAGE_READER);
            lnyVarA2.d(true);
            lnzVarA = lnyVarA2.a();
            Rect rectH = ioqVar.L.h();
            lny lnyVarA3 = lnz.a();
            lnyVarA3.g(new lig(rectH.width(), rectH.height()));
            lnyVarA3.b(ioqVar.K);
            lnyVarA3.f(35);
            lnyVarA3.c(1);
            lnyVarA3.h(loa.IMAGE_READER);
            lnz lnzVarA2 = lnyVarA3.a();
            lne lneVarEI2 = mip.eI(ioqVar.L, ioqVar.N, hashSet);
            lneVarEI2.f(ioqVar.J);
            lneVarEI2.d(lnzVarA);
            lneVarEI2.d(lnzVarBb);
            lneVarEI2.d(lnzVarA2);
            lneVarEI2.k(ioqVar.ah);
            lnfVarA = lneVarEI2.a();
        }
        lnc lncVarA = ioqVar.ac.a(lnfVarA);
        lap lapVar = ioqVar.Q;
        lapVar.getClass();
        lapVar.c(lncVarA);
        ioqVar.ab = lncVarA;
        lncVarA.i(hashSet);
        lnx lnxVarA = lncVarA.b().a(lnzVarBb);
        ioqVar.T = lnxVarA;
        lnx lnxVarA2 = lncVarA.b().a(lnzVarA);
        synchronized (ioqVar.o) {
            ioqVar.V = lnxVarA2;
        }
        ioqVar.ae = lncVarA.s(lnxVarA);
        ioqVar.af = lncVarA.s(lnxVarA2);
        lap lapVar2 = ioqVar.Q;
        lapVar2.getClass();
        lapVar2.c(lncVarA);
        ioqVar.w.f();
        lnc lncVar = ioqVar.ab;
        if (lncVar != null) {
            lqd lqdVar = ioqVar.ae;
            lqdVar.getClass();
            final lmv lmvVarR = lncVar.r(lqdVar, 1);
            lap lapVar3 = ioqVar.Q;
            lapVar3.getClass();
            lapVar3.c(lmvVarR);
            ioqVar.aa = new lmu() { // from class: iog
                @Override // defpackage.lmu
                public final void a(lrr lrrVar) {
                    ioq ioqVar2 = ioqVar;
                    lmv lmvVar = lmvVarR;
                    lmr lmrVarA = lrrVar.a();
                    if (lmrVarA != null) {
                        lmrVarA.j(new ion(ioqVar2, lmrVarA, lmvVar));
                    }
                }
            };
            obr.ao(lmvVarR);
            lmu lmuVar = ioqVar.aa;
            lmuVar.getClass();
            lmvVarR.k(lmuVar);
        }
        if (!ioqVar.d.k(deg.d)) {
            ioqVar.c();
        }
        final lnc lncVar2 = ioqVar.ab;
        if (lncVar2 != null) {
            if (ioqVar.d.k(ddl.T) && ioqVar.b.g) {
                lap lapVar4 = ioqVar.Q;
                lapVar4.getClass();
                lapVar4.c(ioqVar.r.a(new lij() { // from class: ioe
                    @Override // defpackage.lij
                    public final void fB(Object obj) {
                        ioq ioqVar2 = ioqVar;
                        lnc lncVar3 = lncVar2;
                        lncVar3.h(CaptureRequest.CONTROL_ZOOM_RATIO, (Float) obj);
                        lncVar3.h(CaptureRequest.SCALER_CROP_REGION, ((gsm) ioqVar2.R.fA()).b);
                    }
                }, ioqVar.n));
            } else {
                lap lapVar5 = ioqVar.Q;
                lapVar5.getClass();
                lapVar5.c(ioqVar.R.a(new cme(lncVar2, 12), pgr.INSTANCE));
            }
        }
        ioqVar.h.g(ioqVar.P);
        kas kasVar = ioqVar.A;
        int i = ioqVar.W.f;
        kasVar.y(ojc.i(ldz.b(i, i)), ioqVar.O.e());
        if (ioqVar.j.d() && ioqVar.h.j()) {
            ioqVar.A.p(false);
        }
        ioqVar.A.m();
        final inx inxVar = ioqVar.u;
        lvp lvpVar = ioqVar.L;
        lnc lncVar3 = ioqVar.ab;
        lncVar3.getClass();
        lap lapVar6 = ioqVar.Q;
        gsn gsnVar2 = ioqVar.R;
        inxVar.b.set(false);
        inxVar.c.set(false);
        inxVar.d.set(false);
        inxVar.n = lvpVar;
        inxVar.o = lncVar3;
        inxVar.q = gsnVar2;
        inxVar.p = lapVar6;
        inxVar.b(true, true);
        lmp lmpVarA = lncVar3.a();
        ((lok) lmpVarA).f = (Integer) inxVar.l.a.fA();
        lncVar3.m(lmpVarA.a());
        lapVar6.c(inxVar.l.a.a(new cme(lncVar3, 10), pgr.INSTANCE));
        lapVar6.c(inxVar.a.b.a(new cme(lncVar3, 11), pgr.INSTANCE));
        lapVar6.c(inxVar.a.a.a(new lij() { // from class: ins
            @Override // defpackage.lij
            public final void fB(Object obj) {
                inx inxVar2 = inxVar;
                ScheduledFuture scheduledFuture = inxVar2.s;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                ScheduledFuture scheduledFuture2 = inxVar2.r;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(true);
                }
                inxVar2.j.c(inxVar2.m);
            }
        }, pgr.INSTANCE));
        if (inxVar.i.g()) {
            lapVar6.c(((hcl) inxVar.i.c()).b().a(new cme(lncVar3, 9), pgr.INSTANCE));
        }
        leb lebVarEH = mip.eH(this.g, this.o, this.U, this.V);
        plk.af(this.W.f(jnl.a(this.L, this.B.a(lebVarEH), lhs.h(lebVarEH.c())), oih.a), new ipe(this, 1), pgr.INSTANCE);
    }

    public final void e(boolean z) {
        this.B.d();
        this.C.g();
        if (!this.o.k(deg.d)) {
            this.n.e();
        }
        b(this.g.d(), this.N);
        d();
        this.B.f();
        kas kasVar = this.X;
        if (((kbi) kasVar).L) {
            kasVar.h();
        }
        if (z && this.o.k(ddl.X)) {
            this.X.p(false);
        }
    }

    public final void f() {
        if (this.o.k(deg.g)) {
            ScheduledFuture scheduledFuture = this.Z;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                this.Z = null;
            }
            this.Z = this.v.schedule(new iot(this, 10), true != ((inr) this.j.d).equals(inr.STATE_RECORDING) ? 2L : 15L, TimeUnit.SECONDS);
        }
    }

    final void g() {
        if (!((inr) this.j.d).equals(inr.STATE_IDLE)) {
            ((oug) ((oug) a.c()).G((char) 3097)).o("Recording state is not IDLE. Ignore start recording");
            return;
        }
        if (this.e.get()) {
            ((oug) ((oug) a.b()).G((char) 3096)).o("Device status is not allowed to start recording");
            return;
        }
        this.j.fB(inr.STATE_PRE_RECORDING);
        this.C.d();
        this.q.c(new iot(this, 1));
        this.h.b(R.raw.video_start);
        this.w.e();
        this.Y.a();
        final ioq ioqVar = this.B;
        if (!ioqVar.S.g()) {
            mip mipVar = ioqVar.aj;
            ioqVar.S = ojc.i(MediaCodec.createPersistentInputSurface());
        }
        cle cleVar = ioqVar.U;
        if (cleVar != null) {
            cleVar.close();
            ioqVar.U = null;
        }
        ioqVar.U = ioqVar.z.b(mbs.MPEG4);
        final lic licVarC = ioqVar.p.c();
        lep lepVarA = lep.a(ioqVar.O);
        lepVarA.getClass();
        mip mipVar2 = ioqVar.ai;
        les lesVarBE = mip.bE(ioqVar.K, lepVarA);
        final lew lewVar = new lew(ioqVar.O);
        lewVar.d = lesVarBE;
        lewVar.c = ioqVar.x.b();
        final cle cleVar2 = ioqVar.U;
        cleVar2.getClass();
        plk.aa(new pgj() { // from class: ioi
            @Override // defpackage.pgj
            public final pht a() {
                ojc ojcVarA;
                ioq ioqVar2 = ioqVar;
                lew lewVar2 = lewVar;
                cle cleVar3 = cleVar2;
                lic licVar = licVarC;
                leb lebVar = ioqVar2.O;
                ldz ldzVar = ioqVar2.N;
                FileDescriptor fileDescriptorF = cleVar3.f();
                int iC = brg.c(ioqVar2.Z, licVar.e, ioqVar2.P.equals(lwd.FRONT), ioqVar2.d);
                Object cnsVar = ioqVar2.d.k(deg.f) ? new cns(ioqVar2.d) : new lex();
                ldt ldtVar = ioqVar2.g;
                ldtVar.a = lebVar;
                ldtVar.b = ldzVar;
                ldtVar.c = ioqVar2.K;
                ldtVar.r = ioqVar2.c;
                ldtVar.o = fileDescriptorF;
                ldtVar.d = iC;
                ldtVar.k = ojc.i(true);
                int i = 2;
                ldtVar.v = true != ioqVar2.d.k(dcu.ae) ? 2 : 1;
                ldtVar.j = ojc.i(cnsVar);
                ldtVar.l = ojc.i(lewVar2);
                ldtVar.n = ojc.i(new iop(ioqVar2));
                if (ioqVar2.d.k(deg.d)) {
                    ioqVar2.g.a(ley.SURFACE);
                    ldt ldtVar2 = ioqVar2.g;
                    ldtVar2.e = false;
                    ldtVar2.i = ojc.i(ioqVar2.v.r);
                    if (ioqVar2.S.g()) {
                        ioqVar2.g.s = (Surface) ioqVar2.S.c();
                    }
                } else {
                    ioqVar2.g.a(ley.YUV_SEMI_PLANAR);
                    ioqVar2.g.e = true;
                }
                if (ioqVar2.m.d().g()) {
                    ioqVar2.g.f = (Location) ioqVar2.m.d().c();
                }
                ldt ldtVar3 = ioqVar2.g;
                obr.aG(ldtVar3.o != null, "Neither recordFileDescriptor nor recordFile are specified");
                obr.aG(ldtVar3.a != null, "camcorderVideoResolution is required");
                ldtVar3.c.getClass();
                ldtVar3.b.getClass();
                ldtVar3.r.getClass();
                ojc ojcVar = ldtVar3.u;
                leg legVar = new leg(new nvb((byte[]) null, (byte[]) null), null, null);
                leu leuVar = new leu(0);
                leu leuVar2 = new leu(1);
                if (ldtVar3.l.g()) {
                    leq leqVar = new leq((lew) ldtVar3.l.c());
                    lvs lvsVar = ldtVar3.c;
                    lew lewVar3 = leqVar.a;
                    ojcVarA = leqVar.a(lewVar3.b, lvsVar, lewVar3.c, lewVar3.a, false);
                } else if (ldtVar3.b.f()) {
                    ojcVarA = leuVar2.a(ldtVar3.a, ldtVar3.c, false, oih.a, false);
                } else {
                    if (!ldtVar3.b.g()) {
                        throw new IllegalArgumentException("Unknown camcorder capture rate");
                    }
                    ojcVarA = leuVar.a(ldtVar3.a, ldtVar3.c, false, oih.a, false);
                }
                obr.aT(ojcVarA.g(), "Fail to camcorder profile for resolution %s", ldtVar3.a);
                leh lehVarC = legVar.c((les) ojcVarA.c(), ldtVar3.b, ldtVar3.a);
                if (ldtVar3.q == null) {
                    ldtVar3.q = mip.bM("CamcorderCllbck");
                }
                phv phvVarJ = plk.J(mip.bM("Camcorder"));
                HandlerThread handlerThread = new HandlerThread("Camcorder");
                handlerThread.start();
                Handler handlerBV = mip.bV(handlerThread.getLooper());
                boolean zBooleanValue = ldtVar3.k.g() ? ((Boolean) ldtVar3.k.c()).booleanValue() : false;
                if (ldtVar3.p == null) {
                    if (ldtVar3.b.g() || zBooleanValue) {
                        ljd ljdVar = new ljd();
                        AudioManager audioManager = ldtVar3.r;
                        lgz lgzVar = new lgz(phvVarJ, handlerBV, ljdVar);
                        if (ldtVar3.j.g()) {
                            lgzVar.l = (lfc) ldtVar3.j.c();
                        }
                        ojc ojcVar2 = ldtVar3.t;
                        ldtVar3.p = lgzVar;
                    } else {
                        ldtVar3.p = new lhj(new lha(new MediaRecorder()), phvVarJ, new lds());
                    }
                }
                lfk lfkVar = ldtVar3.p;
                lfkVar.r(lehVarC);
                lfkVar.o(ldtVar3.d);
                lfkVar.n(ldtVar3.e);
                FileDescriptor fileDescriptor = ldtVar3.o;
                if (fileDescriptor != null) {
                    ldtVar3.p.q(fileDescriptor);
                }
                Location location = ldtVar3.f;
                if (location != null) {
                    ldtVar3.p.h(location);
                }
                Surface surface = ldtVar3.s;
                if (surface != null) {
                    ldtVar3.p.g(surface);
                }
                ojc ojcVar3 = ldtVar3.h;
                ojc ojcVar4 = ldtVar3.g;
                if (ldtVar3.i.g()) {
                    ldtVar3.p.m((MediaCodec.Callback) ldtVar3.i.c());
                }
                if (ldtVar3.m.g()) {
                    ldtVar3.p.e((ley) ldtVar3.m.c());
                }
                ldtVar3.p.f(ldtVar3.v);
                try {
                    lfj lfjVarA = ldtVar3.p.a();
                    lfjVarA.getClass();
                    ioqVar2.ad = new ldv(lfjVarA, ldtVar3.q, ldtVar3.n);
                    ioqVar2.b();
                    ioqVar2.G = ioqVar2.D.scheduleAtFixedRate(new ioj(ioqVar2, i), dhy.a.getSeconds(), dhy.a.getSeconds(), TimeUnit.SECONDS);
                    iqo iqoVarA = iqp.a();
                    iqoVarA.l(ioqVar2.N);
                    iqoVarA.b(ioqVar2.O);
                    iqoVarA.b = cleVar3;
                    iqoVarA.a = oih.a;
                    iqoVarA.g(licVar);
                    iqoVarA.f(ioqVar2.ad.a.d());
                    iqoVarA.k(ioqVar2.W);
                    iqoVarA.e(ioqVar2.B);
                    iqoVarA.m();
                    iqoVarA.j(ioqVar2.H);
                    synchronized (ioqVar2.o) {
                        if (!ioqVar2.E.isEmpty()) {
                            ((oug) ((oug) ioq.a.c()).G(3066)).o("prepareCamcorder(): Pending video file exists.");
                            ioqVar2.E.clear();
                        }
                        ioqVar2.E.add(iqoVarA);
                    }
                    ioqVar2.X = new iql(ioqVar2.W, adg.d(cleVar3) == hss.MARS_STORE);
                    ioqVar2.ad.c.add(ioqVar2.I);
                    return plk.V(ioqVar2.ad);
                } catch (IOException e) {
                    throw new IllegalArgumentException("Fail to create video recorder", e);
                }
            }
        }, ioqVar.k).d(new ioj(ioqVar, 0), ioqVar.n);
        final ipr iprVar = this.D;
        iprVar.h.b(new ilt() { // from class: ipm
            @Override // defpackage.ilt
            public final void a(ilv ilvVar) {
                iprVar.a(ilvVar, false);
            }
        });
        ipr iprVar2 = this.D;
        iprVar2.c.s().registerReceiver(iprVar2.b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    public final void h(boolean z) {
        if (this.o.k(deg.g)) {
            ScheduledFuture scheduledFuture = this.Z;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                this.Z = null;
            }
            this.O = 0.0d;
            this.P = 0.0d;
            synchronized (this.b) {
                this.d = 0L;
                Arrays.fill(this.c, 0, 3, 0.0d);
            }
            if (z) {
                this.A.e(false);
            }
        }
    }

    final void i(boolean z) {
        pht phtVarV;
        pht phtVarH;
        if (!inr.a((inr) this.j.d)) {
            Object obj = this.j.d;
            return;
        }
        this.j.fB(inr.STATE_PROCESSING);
        final ioq ioqVar = this.B;
        final int i = 1;
        ioqVar.G.cancel(true);
        final int i2 = 0;
        if (z) {
            if (ioqVar.d.k(deg.d)) {
                ioqVar.e();
            }
            pih pihVarF = pih.f();
            pihVarF.a(new IllegalStateException("Codec error"));
            phtVarH = pihVarF;
        } else if (ioqVar.d.k(deg.d)) {
            iod iodVar = ioqVar.v;
            iodVar.c.set(false);
            iodVar.b.set(true);
            iodVar.f();
            synchronized (iodVar.s) {
                if (iodVar.m.get() > 1) {
                    phtVarV = plk.V(iodVar.A);
                } else {
                    iodVar.x = pih.f();
                    phtVarV = iodVar.x;
                }
            }
            phtVarH = pgb.h(phtVarV, new oiu() { // from class: ioh
                @Override // defpackage.oiu
                public final Object a(Object obj2) {
                    switch (i) {
                        case 0:
                            ioq ioqVar2 = ioqVar;
                            ((oug) ((oug) ioq.a.c()).G((char) 3069)).o("stopRecording() stop camcorder");
                            ioqVar2.ad.b();
                            ioqVar2.u.d();
                            break;
                        default:
                            ioq ioqVar3 = ioqVar;
                            lvj lvjVar = (lvj) obj2;
                            ((oug) ((oug) ioq.a.c()).G((char) 3068)).o("stopRecording() stop camcorder");
                            ioqVar3.ad.b();
                            lvjVar.getClass();
                            lvjVar.close();
                            ioqVar3.u.d();
                            break;
                    }
                    return null;
                }
            }, pgr.INSTANCE);
        } else {
            ink inkVar = ioqVar.l;
            Timer timer = inkVar.L;
            if (timer != null) {
                timer.cancel();
            }
            inkVar.b.set(true);
            inkVar.J = pih.f();
            phtVarH = pgb.h(inkVar.J, new oiu() { // from class: ioh
                @Override // defpackage.oiu
                public final Object a(Object obj2) {
                    switch (i2) {
                        case 0:
                            ioq ioqVar2 = ioqVar;
                            ((oug) ((oug) ioq.a.c()).G((char) 3069)).o("stopRecording() stop camcorder");
                            ioqVar2.ad.b();
                            ioqVar2.u.d();
                            break;
                        default:
                            ioq ioqVar3 = ioqVar;
                            lvj lvjVar = (lvj) obj2;
                            ((oug) ((oug) ioq.a.c()).G((char) 3068)).o("stopRecording() stop camcorder");
                            ioqVar3.ad.b();
                            lvjVar.getClass();
                            lvjVar.close();
                            ioqVar3.u.d();
                            break;
                    }
                    return null;
                }
            }, pgr.INSTANCE);
        }
        this.M = phtVarH;
        this.D.h.a();
        ipr iprVar = this.D;
        iprVar.c.s().unregisterReceiver(iprVar.b);
        this.w.f();
        this.Y.b();
        h(true);
        this.q.c(new iot(this, i2));
        this.h.b(R.raw.video_stop);
    }
}
