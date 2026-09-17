package defpackage;

import com.google.android.libraries.camera.exif.ExifInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class hri extends hqd {
    private final gqy c;
    private final lco d;
    private final ljf e;

    public hri(hpr hprVar, ljf ljfVar, lco lcoVar, gqy gqyVar, hhl hhlVar, String str, bww bwwVar, hsg hsgVar) {
        super(hprVar.a(hsr.NORMAL, str, bwwVar, hsgVar, hhlVar, oih.a));
        this.e = ljfVar;
        this.c = gqyVar;
        this.d = lcoVar;
    }

    @Override // defpackage.hqd, defpackage.hsa
    public final void P(lig ligVar) {
        super.P(ligVar);
        J().h(1, 2);
        this.e.g("RewindCaptureSession#insertEmptyPlaceholder");
        I(t().b(ligVar, h()));
        this.e.f();
        hqb hqbVarO = o();
        fjy fjyVarA = fjz.a();
        fjyVarA.a = i();
        fjyVarA.c = (Float) this.d.fA();
        hqbVarO.c(fjyVarA.a());
    }

    @Override // defpackage.hqd, defpackage.hsa
    public final pht r(final byte[] bArr, final ikc ikcVar) {
        bArr.getClass();
        G("saveAndFinish");
        if (J().c()) {
            H("Ignoring saveAndFinish. CaptureSession has been deleted or canceled.");
            return plk.V(h());
        }
        J().f(2, 3);
        ikcVar.d = e().b();
        ikcVar.e = false;
        ikcVar.f = (gqx) this.c.fA();
        J().g(3);
        final ojc ojcVarX = x(ikcVar);
        plk.af(z(), new hrh(this), pgr.INSTANCE);
        E().execute(new Runnable() { // from class: hrg
            @Override // java.lang.Runnable
            public final void run() {
                hri hriVar = this.a;
                byte[] bArr2 = bArr;
                ojc ojcVar = ojcVarX;
                ikc ikcVar2 = ikcVar;
                try {
                    hsc hscVarF = hriVar.f();
                    hscVarF.a.h("REWIND");
                    hriVar.k().e(mip.P(bArr2, (ExifInterface) ojcVar.f(), hscVarF.a));
                    hscVarF.c();
                    hriVar.z().o(ikcVar2);
                } catch (Throwable th) {
                    hriVar.f().b();
                    hriVar.z().a(th);
                }
            }
        });
        return p();
    }
}
