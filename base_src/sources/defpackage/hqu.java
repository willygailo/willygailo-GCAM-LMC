package defpackage;

import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class hqu extends hqd {
    private static final ouj d = ouj.h("com/google/android/apps/camera/session/PhotoCaptureSession");
    public ojc c;
    private final efh e;
    private final lco f;
    private final lco g;
    private final ojc h;
    private final gqy i;
    private final ljf j;
    private final hlv k;
    private ojc l;

    public hqu(hpr hprVar, efh efhVar, lco lcoVar, gqy gqyVar, ljf ljfVar, hhl hhlVar, String str, bww bwwVar, hsg hsgVar, ojc ojcVar, lco lcoVar2, ojc ojcVar2, ojc ojcVar3, hsr hsrVar, hlv hlvVar) {
        super(hprVar.a(hsrVar, str, bwwVar, hsgVar, hhlVar, ojcVar2));
        this.c = oih.a;
        this.e = efhVar;
        this.l = ojcVar;
        this.f = lcoVar2;
        this.g = lcoVar;
        this.h = ojcVar3;
        this.i = gqyVar;
        ddi ddiVar = ddl.a;
        this.j = ljfVar;
        this.k = hlvVar;
        this.b.v(new Runnable() { // from class: hqr
            @Override // java.lang.Runnable
            public final void run() {
                hqu hquVar = this.a;
                if (hquVar.c.g()) {
                    ((fpl) hquVar.c.c()).c();
                    hquVar.c = oih.a;
                }
            }
        });
    }

    public final InputStream K(ojc ojcVar, InputStream inputStream) {
        return ojcVar.g() ? this.e.b(inputStream, (efe) ojcVar.c(), m()) : inputStream;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [dkp] */
    /* JADX WARN: Type inference failed for: r0v9, types: [ljf] */
    public final byte[] N(byte[] bArr) {
        Exception e;
        byte[] bArrD;
        ojc ojcVarA = ((dkq) ((ojj) this.h).a).a(h());
        if (ojcVarA.g()) {
            G("Writing depth data into the jpeg image");
            dkp dkpVar = (dkp) ojcVarA.c();
            try {
                try {
                    this.j.e("ddepth");
                    bArrD = DynamicDepthUtils.d(bArr, dkpVar.a, dkpVar.b);
                    try {
                        ((iik) k()).e = true;
                    } catch (Exception e2) {
                        e = e2;
                        ((oug) ((oug) ((oug) d.b()).h(e)).G(2617)).o("Error writing depth data into jpeg.");
                    }
                } catch (Throwable th) {
                    dkpVar.a();
                    this.j.f();
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                bArrD = null;
            }
            dkpVar.a();
            dkpVar = this.j;
            dkpVar.f();
            if (bArrD != null) {
                return bArrD;
            }
            ((oug) ((oug) hqd.a.b()).G(2594)).y("[%s] %s", h(), "Couldn't write depth data, using original stream");
        }
        return bArr;
    }

    @Override // defpackage.hqd, defpackage.hsa
    public final void P(lig ligVar) {
        pcw pcwVarB;
        this.j.e("PhotoCaptureSession#startEmpty");
        super.P(ligVar);
        J().h(1, 2);
        this.j.g("insertEmptyPlaceholder");
        I(t().b(ligVar, h()));
        if (this.l.g()) {
            this.j.g("MicrovideoController#collectCaptureStartStats");
            pcwVarB = ((fpk) this.l.c()).b();
            this.l = oih.a;
        } else {
            pcwVarB = null;
        }
        this.j.g("CaptureSessionNotifier#onCaptureStarted");
        hqb hqbVarO = o();
        fjy fjyVarA = fjz.a();
        fjyVarA.a = i();
        fjyVarA.b = pcwVarB;
        fjyVarA.c = (Float) this.g.fA();
        hqbVarO.c(fjyVarA.a());
        this.j.f();
        p().d(new bvf(18), pgr.INSTANCE);
    }

    @Override // defpackage.hqd, defpackage.hsa
    public final pht r(final byte[] bArr, final ikc ikcVar) {
        G("saveAndFinish");
        if (J().c()) {
            H("Ignoring saveAndFinish. CaptureSession has been deleted or canceled.");
            return p();
        }
        J().f(2, 3);
        ikcVar.d = e().b();
        ikcVar.e = ((Boolean) this.f.fA()).booleanValue();
        ikcVar.f = (gqx) this.i.fA();
        J().g(3);
        final ojc ojcVarO = this.b.o(ikcVar, this.k);
        final ojc ojcVarA = efe.a(l());
        int i = h().a;
        plk.af(z(), new hqt(this), pgr.INSTANCE);
        E().execute(new Runnable() { // from class: hqs
            @Override // java.lang.Runnable
            public final void run() {
                hqu hquVar = this.a;
                ikc ikcVar2 = ikcVar;
                ojc ojcVar = ojcVarO;
                byte[] bArr2 = bArr;
                ojc ojcVar2 = ojcVarA;
                if (hquVar.c.g()) {
                    long jD = hquVar.d();
                    if (hquVar.i() == hsr.LONG_SHOT || hquVar.i() == hsr.AUTO_LONG_SHOT) {
                        hquVar.z().e(((fpl) hquVar.c.c()).a(ikcVar2, hquVar.f(), ojcVar, jD, hquVar.k()));
                    } else {
                        hquVar.z().e(((fpl) hquVar.c.c()).b(ikcVar2, hquVar.K(ojcVar2, new ByteArrayInputStream(hquVar.N(bArr2))), hquVar.f(), ojcVar, jD, hquVar.s(), hquVar.k()));
                    }
                    hquVar.c = oih.a;
                    return;
                }
                try {
                    long jQ = mip.Q(hquVar.K(ojcVar2, new ByteArrayInputStream(hquVar.N(bArr2))), (ExifInterface) ojcVar.f(), hquVar.f().a);
                    hquVar.f().c();
                    hquVar.k().e(jQ);
                    hquVar.z().o(ikcVar2);
                } catch (Throwable th) {
                    String strValueOf = String.valueOf(th);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 15);
                    sb.append("finish failed: ");
                    sb.append(strValueOf);
                    hquVar.H(sb.toString());
                    hquVar.b.x();
                    hquVar.z().a(th);
                }
            }
        });
        return p();
    }
}
