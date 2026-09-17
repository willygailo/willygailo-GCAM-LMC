package defpackage;

import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.googlex.gcam.DebugParams;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class hqo extends hqd {
    public final efh c;
    public ojc d;
    private final ljf e;
    private final lco f;

    public hqo(hpr hprVar, ljf ljfVar, efh efhVar, lco lcoVar, hhl hhlVar, String str, bww bwwVar, hsg hsgVar, ojc ojcVar) {
        super(hprVar.a(hsr.LONG_EXPOSURE, str, bwwVar, hsgVar, hhlVar, ojcVar));
        this.d = oih.a;
        this.c = efhVar;
        this.f = lcoVar;
        this.e = ljfVar;
    }

    @Override // defpackage.hqd, defpackage.hsa
    public final void P(lig ligVar) {
        this.e.e("LongExposureCaptureSession#startEmpty");
        super.P(ligVar);
        J().h(1, 2);
        this.e.g("LongExposureCaptureSession#insertEmptyPlaceholder");
        I(t().b(ligVar, h()));
        this.e.f();
        hqb hqbVarO = o();
        fjy fjyVarA = fjz.a();
        fjyVarA.a = i();
        fjyVarA.c = (Float) this.f.fA();
        hqbVarO.c(fjyVarA.a());
    }

    @Override // defpackage.hqd, defpackage.hsa
    public final pht r(final byte[] bArr, final ikc ikcVar) {
        bArr.getClass();
        G("saveAndFinish");
        if (J().c()) {
            H("Ignoring saveAndFinish. CaptureSession has been deleted or canceled.");
            return p();
        }
        J().f(2, 3);
        ikcVar.d = e().b();
        ikcVar.e = false;
        ikcVar.f = gqx.ON;
        J().g(3);
        final ojc ojcVarX = x(ikcVar);
        E().execute(new Runnable() { // from class: hqm
            @Override // java.lang.Runnable
            public final void run() {
                hqo hqoVar = this.a;
                byte[] bArr2 = bArr;
                ojc ojcVar = ojcVarX;
                ikc ikcVar2 = ikcVar;
                ojc ojcVarA = hqoVar.c.a(hqoVar.l());
                int i = hqoVar.h().a;
                try {
                    if (hqoVar.d.g()) {
                        plk.af(hqoVar.z(), new hqn(hqoVar), pgr.INSTANCE);
                        hqoVar.z().e(((fpl) hqoVar.d.c()).b(ikcVar2, new ByteArrayInputStream(bArr2), hqoVar.f(), ojcVar, hqoVar.d(), hqoVar.s(), hqoVar.k()));
                        return;
                    }
                    hsc hscVarF = hqoVar.f();
                    if (ojcVar.g()) {
                        FileOutputStream fileOutputStreamE = hscVarF.a.e();
                        try {
                            OutputStream outputStreamM = ((ExifInterface) ojcVar.c()).m(fileOutputStreamE);
                            try {
                                ast astVarN = mde.n(bArr2);
                                if (astVarN == null) {
                                    astVarN = mde.a();
                                }
                                mde.k(astVarN, dxh.NIGHT.c());
                                mde.i(astVarN, mcy.a);
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                mde.p(bArr2, byteArrayOutputStream, astVarN, (ast) mde.c(((ExifInterface) ojcVar.c()).bA).f());
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                outputStreamM.write(byteArray);
                                if (ojcVarA.g()) {
                                    if (hqoVar.m().g()) {
                                        efi.a((byte[]) ojcVarA.c(), ((DebugParams) hqoVar.m().c()).a().a());
                                    }
                                    outputStreamM.write((byte[]) ojcVarA.c());
                                }
                                hqoVar.k().e(byteArray.length);
                                outputStreamM.close();
                                fileOutputStreamE.close();
                            } catch (Throwable th) {
                                try {
                                    outputStreamM.close();
                                } catch (Throwable th2) {
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                fileOutputStreamE.close();
                            } catch (Throwable th4) {
                            }
                            throw th3;
                        }
                    } else {
                        hqoVar.k().e(mip.N(bArr2, hscVarF.a));
                    }
                    hscVarF.c();
                    hqoVar.v().g();
                    hqoVar.z().o(ikcVar2);
                } catch (IOException e) {
                    hqoVar.z().a(e);
                }
            }
        });
        return p();
    }
}
