package defpackage;

import android.location.Location;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class hqz extends hqd {
    public static final ouj c = ouj.h("com/google/android/apps/camera/session/PhotosphereCaptureSession");
    public final hsm d;
    public final ReentrantLock e;

    public hqz(hpr hprVar, hhl hhlVar, hsm hsmVar, String str, bww bwwVar, hsg hsgVar) {
        super(hprVar.a(hsr.PHOTOSPHERE, str, bwwVar, hsgVar, hhlVar, oih.a));
        this.e = new ReentrantLock();
        this.d = hsmVar;
    }

    @Override // defpackage.hqd, defpackage.hsa
    public final void B() {
        G("finish");
        if (!J().e()) {
            throw new IllegalStateException("Cannot call finish without calling startSession first.");
        }
        J().h(2, 3);
        E().execute(new hqx(this, 1));
    }

    public final void K() {
        G("updatePreview");
        if (J().e()) {
            E().execute(new hqx(this, 0));
        } else {
            H("Ignoring updatePreview. CaptureSession is not started.");
        }
    }

    @Override // defpackage.hqd, defpackage.hsa
    public final void P(lig ligVar) {
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
    public final pht r(final byte[] bArr, final ikc ikcVar) {
        bArr.getClass();
        mbs mbsVar = ikcVar.a;
        ExifInterface exifInterface = (ExifInterface) ikcVar.c.f();
        G("saveAndFinish");
        if (J().c()) {
            H("Ignoring saveAndFinish. CaptureSession has been deleted or canceled.");
            return p();
        }
        J().f(2, 3);
        ikcVar.d = e().b();
        J().g(3);
        if (e().b().g() && mbsVar == mbs.JPEG && exifInterface != null) {
            lmi lmiVar = new lmi(exifInterface);
            lmiVar.d((Location) e().b().c());
            exifInterface = lmiVar.a;
        }
        if (exifInterface != null) {
            this.b.j.a(exifInterface);
            ((iik) k()).g = exifInterface;
        }
        final ojc ojcVarH = ojc.h(exifInterface);
        E().execute(new Runnable() { // from class: hqy
            @Override // java.lang.Runnable
            public final void run() {
                hqz hqzVar = this.a;
                byte[] bArr2 = bArr;
                ojc ojcVar = ojcVarH;
                ikc ikcVar2 = ikcVar;
                try {
                    hsc hscVarF = hqzVar.f();
                    hqzVar.k().e(mip.P(bArr2, (ExifInterface) ojcVar.f(), hscVarF.a));
                    hscVarF.c();
                    hqzVar.z().o(ikcVar2);
                } catch (IOException e) {
                    ((oug) ((oug) ((oug) hqz.c.b()).h(e)).G((char) 2618)).o("CameraFileUtil.writeFile() throws : ");
                    hqzVar.z().a(e);
                }
                hqzVar.v().g();
            }
        });
        return p();
    }
}
