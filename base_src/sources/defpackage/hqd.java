package defpackage;

import android.graphics.Bitmap;
import com.google.googlex.gcam.DebugParams;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class hqd implements hsa {
    public static final ouj a = ouj.h("com/google/android/apps/camera/session/DelegatingCaptureSession");
    public final hps b;

    protected hqd(hps hpsVar) {
        this.b = hpsVar;
    }

    @Override // defpackage.hsa
    public final void A() {
        this.b.A();
    }

    @Override // defpackage.hsa
    public void B() {
        hls.j();
    }

    @Override // defpackage.hsa
    public final void C(jmo jmoVar, Throwable th) {
        this.b.C(jmoVar, th);
    }

    @Override // defpackage.hsa
    public final /* synthetic */ void D(boolean z) {
    }

    final Executor E() {
        return this.b.e;
    }

    public final void F() {
        this.b.z();
    }

    public final void G(String str) {
        this.b.T(str);
    }

    final void H(String str) {
        ((oug) ((oug) a.c()).G(2596)).y("[%s] %s", h(), str);
    }

    final void I(hrb hrbVar) {
        this.b.d = hrbVar;
    }

    final jtl J() {
        return this.b.w;
    }

    @Override // defpackage.hsa
    public final void L(lzv lzvVar) {
        this.b.L(lzvVar);
    }

    @Override // defpackage.hsa
    public final void M(DebugParams debugParams) {
        this.b.M(debugParams);
    }

    @Override // defpackage.hsa
    public final void O(jmo jmoVar) {
        this.b.O(jmoVar);
    }

    @Override // defpackage.hsa
    public void P(lig ligVar) {
        final hps hpsVar = this.b;
        hpsVar.a.i(hpsVar.f);
        hpsVar.T("startEmpty");
        if (hpsVar.b.equals(hsr.LONG_SHOT) || hpsVar.b.equals(hsr.AUTO_LONG_SHOT)) {
            hpsVar.r = hpsVar.q.a("mp4");
        } else {
            hpsVar.r = hpsVar.q.a("jpg");
        }
        hpsVar.q.e(new hpp(hpsVar));
        hpsVar.l.e(plk.Z(new Callable() { // from class: hpo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                hsj hsjVarA;
                hps hpsVar2 = hpsVar;
                synchronized (hpsVar2.l) {
                    hpsVar2.r.a.i();
                    hsi hsiVarA = hsj.a();
                    hsiVarA.c(hpsVar2.b);
                    hsiVarA.d(hpsVar2.r.a.b());
                    hsjVarA = hsiVarA.a();
                    String strValueOf = String.valueOf(hpsVar2.r.a);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 8);
                    sb.append("Touched ");
                    sb.append(strValueOf);
                    hpsVar2.T(sb.toString());
                }
                return hsjVarA;
            }
        }, hpsVar.e));
        if (hpsVar.b == hsr.CYCLOPS_PANO || hpsVar.b == hsr.PHOTOSPHERE || hpsVar.b == hsr.PANORAMA) {
            return;
        }
        hpsVar.z();
    }

    @Override // defpackage.hsa
    public final void Q(long j) {
        this.b.Q(j);
    }

    @Override // defpackage.hsa
    public final /* synthetic */ void R() {
        hls.i(this);
    }

    @Override // defpackage.hsa
    public final void S(Integer num) {
        this.b.S(null);
    }

    @Override // defpackage.hsa
    public final void U(Bitmap bitmap, int i) {
        this.b.U(bitmap, i);
    }

    @Override // defpackage.hsa
    public final void V(Bitmap bitmap) {
        this.b.V(bitmap);
    }

    @Override // defpackage.hsa
    public final void W(Bitmap bitmap) {
        this.b.W(bitmap);
    }

    @Override // defpackage.hsa
    public final void Y(int i) {
        this.b.Y(i);
    }

    @Override // defpackage.hhm
    public final lif a() {
        return this.b.c;
    }

    @Override // defpackage.hhm
    public final void b(lif lifVar) {
        this.b.b(lifVar);
    }

    @Override // defpackage.hhm
    public final void c(hho hhoVar) {
        this.b.c(hhoVar);
    }

    @Override // defpackage.hsa
    public final long d() {
        return this.b.d();
    }

    final bww e() {
        return this.b.i;
    }

    @Override // defpackage.hsa
    public final hsc f() {
        return this.b.f();
    }

    @Override // defpackage.hsa
    public final hsg g() {
        return this.b.q;
    }

    @Override // defpackage.hsa
    public final hsp h() {
        return this.b.h();
    }

    @Override // defpackage.hsa
    public final hsr i() {
        return this.b.b;
    }

    @Override // defpackage.hsa
    public final hss j() {
        return this.b.j();
    }

    @Override // defpackage.hsa
    public final iij k() {
        return this.b.k;
    }

    @Override // defpackage.hsa
    public final lzv l() {
        return this.b.o;
    }

    @Override // defpackage.hsa
    public final ojc m() {
        return this.b.t;
    }

    @Override // defpackage.hsa
    public final ojc n() {
        return this.b.p;
    }

    public final hqb o() {
        return this.b.g;
    }

    @Override // defpackage.hsa
    public final pht p() {
        return this.b.s;
    }

    @Override // defpackage.hsa
    public final pht q() {
        return this.b.q();
    }

    @Override // defpackage.hsa
    public pht r(byte[] bArr, ikc ikcVar) {
        return hls.k();
    }

    @Override // defpackage.hsa
    public final String s() {
        return this.b.s();
    }

    final hrc t() {
        return this.b.h;
    }

    @Override // defpackage.hsa
    public final void u(hsn hsnVar) {
        this.b.u(hsnVar);
    }

    final hsg v() {
        return this.b.q;
    }

    @Override // defpackage.hsa
    public final void w(Throwable th) {
        this.b.w(th);
    }

    final ojc x(ikc ikcVar) {
        return this.b.o(ikcVar, null);
    }

    @Override // defpackage.hsa
    public final void y() {
        this.b.y();
    }

    final pih z() {
        return this.b.m;
    }
}
