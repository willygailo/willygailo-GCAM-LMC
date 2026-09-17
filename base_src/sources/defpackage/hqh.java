package defpackage;

import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class hqh extends hqd {
    public hqh(hpr hprVar, String str, bww bwwVar, hsg hsgVar) {
        super(hprVar.a(hsr.CYCLOPS_PANO, str, bwwVar, hsgVar, null, oih.a));
    }

    @Override // defpackage.hqd, defpackage.hsa
    public final synchronized void P(lig ligVar) {
        super.P(ligVar);
        J().h(1, 2);
        I(t().b(ligVar, h()));
        this.b.G(h());
        hqb hqbVarO = o();
        fjy fjyVarA = fjz.a();
        fjyVarA.a = i();
        hqbVarO.c(fjyVarA.a());
    }

    @Override // defpackage.hqd, defpackage.hsa
    public final synchronized pht r(final byte[] bArr, ikc ikcVar) {
        G("saveAndFinish");
        if (J().c()) {
            H("Ignoring saveAndFinish. CaptureSession has been deleted or canceled.");
            return p();
        }
        J().f(2, 3);
        ikcVar.d = e().b();
        J().g(3);
        ExifInterface exifInterface = (ExifInterface) ikcVar.c.f();
        if (exifInterface != null) {
            ((iik) k()).g = exifInterface;
        }
        final hsc hscVarF = f();
        E().execute(new Runnable() { // from class: hqg
            @Override // java.lang.Runnable
            public final void run() {
                hqh hqhVar = this.a;
                byte[] bArr2 = bArr;
                hsc hscVar = hscVarF;
                try {
                    mip.N(bArr2, hscVar.a);
                } catch (IOException e) {
                    String strValueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 15);
                    sb.append("finish failed: ");
                    sb.append(strValueOf);
                    hqhVar.H(sb.toString());
                }
                hscVar.c();
                hqhVar.v().g();
            }
        });
        return p();
    }
}
