package defpackage;

import android.media.AudioManager;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class ioq {
    public static final ouj a = ouj.h("com/google/android/apps/camera/timelapse/TimelapseFrameServer");
    public final kas A;
    public final boolean B;
    public final dib C;
    public final ScheduledExecutorService D;
    public ScheduledFuture G;
    public hsq H;
    public ldo I;
    public lvs J;
    public lvs K;
    public lvp L;
    public jth M;
    public lwd P;
    public lap Q;
    public gsn R;
    public lnx T;
    public cle U;
    public lnx V;
    public iql X;
    public iqo Y;
    public int Z;
    public lmu aa;
    public lnc ab;
    public final lqv ac;
    public ldv ad;
    public lqd ae;
    public lqd af;
    public ipa ag;
    public final mip ai;
    public final mip aj;
    private lmv ak;
    public final lzh b;
    public final AudioManager c;
    public final ddf d;
    public final ckh f;
    public final ldt g;
    public final cvo h;
    public final lvq i;
    public final lzi j;
    public final Executor k;
    public final ink l;
    public final fix m;
    public final lar n;
    public final gvb p;
    public final lco q;
    public final lco r;
    public final bod s;
    public final bta t;
    public final inx u;
    public final iod v;
    public final ljf w;
    public final cpj x;
    public final cpp y;
    public final cvh z;
    public final Object o = new Object();
    public final mip ah = new iok(this);
    public final ArrayList E = new ArrayList();
    public final List F = new CopyOnWriteArrayList();
    public ojc S = oih.a;
    public final lce e = new lce(false);
    public ldz N = ldz.FPS_30;
    public leb O = leb.RES_1080P;
    public iqn W = iqn.MANUAL_FPS_30_1X;

    public ioq(lzh lzhVar, AudioManager audioManager, ddf ddfVar, ckh ckhVar, ldt ldtVar, mip mipVar, cvo cvoVar, lvq lvqVar, lzi lziVar, Executor executor, ink inkVar, fix fixVar, lar larVar, gvb gvbVar, mip mipVar2, lqv lqvVar, lco lcoVar, lco lcoVar2, bod bodVar, bta btaVar, inx inxVar, iod iodVar, ljf ljfVar, cpj cpjVar, cvh cvhVar, cpp cppVar, kas kasVar, boolean z, dib dibVar, ScheduledExecutorService scheduledExecutorService, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = lzhVar;
        this.c = audioManager;
        this.d = ddfVar;
        this.g = ldtVar;
        this.f = ckhVar;
        this.ai = mipVar;
        this.h = cvoVar;
        this.i = lvqVar;
        this.q = lcoVar;
        this.j = lziVar;
        this.l = inkVar;
        this.B = z;
        this.m = fixVar;
        this.n = larVar;
        this.p = gvbVar;
        this.aj = mipVar2;
        this.ac = lqvVar;
        this.s = bodVar;
        this.t = btaVar;
        this.u = inxVar;
        this.k = executor;
        this.v = iodVar;
        this.w = ljfVar;
        this.x = cpjVar;
        this.z = cvhVar;
        this.y = cppVar;
        this.r = lcoVar2;
        this.A = kasVar;
        this.C = dibVar;
        this.D = scheduledExecutorService;
    }

    final lig a(leb lebVar) {
        lig ligVarC = lebVar.equals(leb.RES_720P) ? leb.RES_720P.c() : leb.RES_1080P.c();
        lvp lvpVar = this.L;
        lvpVar.getClass();
        List listY = lvpVar.y();
        obr.aK(listY.contains(ligVarC), "Unable to find suitable viewfinder size from %s", listY);
        return ligVarC;
    }

    public final void b() {
        hsq hsqVarA = hsq.a(hsp.a(), System.currentTimeMillis(), dhy.a(hsr.TIMELAPSE, System.currentTimeMillis()), hsr.TIMELAPSE);
        this.H = hsqVarA;
        this.F.add(hsqVarA);
        this.C.i(this.H);
    }

    final void c() {
        lnc lncVar = this.ab;
        if (lncVar == null) {
            return;
        }
        lqd lqdVar = this.af;
        lqdVar.getClass();
        synchronized (this.o) {
            this.ak = lncVar.r(lqdVar, 1);
            lap lapVar = this.Q;
            lapVar.getClass();
            lmv lmvVar = this.ak;
            lmvVar.getClass();
            lapVar.c(lmvVar);
        }
        lmu lmuVar = new lmu() { // from class: iof
            @Override // defpackage.lmu
            public final void a(lrr lrrVar) {
                ioq ioqVar = this.a;
                lmr lmrVarA = lrrVar.a();
                if (lmrVarA != null) {
                    lmrVarA.j(new ioo(ioqVar, lmrVarA));
                }
            }
        };
        synchronized (this.o) {
            lmv lmvVar2 = this.ak;
            obr.ao(lmvVar2);
            lmvVar2.k(lmuVar);
        }
    }

    final void d() {
        this.e.fB(false);
        lap lapVar = this.Q;
        if (lapVar != null) {
            lapVar.close();
            this.Q = null;
        }
    }

    public final void e() {
        synchronized (this.o) {
            lmv lmvVar = this.ak;
            if (lmvVar != null) {
                lmvVar.close();
                this.ak = null;
            }
        }
    }

    public final void f() {
        lnc lncVar = this.ab;
        if (lncVar != null) {
            lncVar.f();
        }
    }

    public final void g() {
        inx inxVar = this.u;
        if (inxVar.n.G()) {
            inxVar.f.d();
        }
        inxVar.b.set(false);
        inxVar.c.set(false);
        inxVar.d.set(false);
        inxVar.a.a();
        this.A.y(oih.a, false);
        if (this.S.g()) {
            ((Surface) this.S.c()).release();
        }
        d();
        cle cleVar = this.U;
        if (cleVar != null) {
            cleVar.close();
            this.U = null;
        }
        if (this.d.k(deg.d)) {
            return;
        }
        this.l.e();
    }
}
