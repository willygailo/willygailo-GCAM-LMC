package defpackage;

import com.google.android.apps.camera.dynamicdepth.DynamicDepthResult;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class hpm {
    public final lic a;
    public final int b;
    public final int c;
    private final UUID d;
    private final int e;
    private final long f;
    private final hgk g;
    private final hsr h;
    private final ddf i;
    private final byte[] j;
    private final ExifInterface k;

    public hpm(int i, long j, UUID uuid, lic licVar, int i2, int i3, byte[] bArr, ExifInterface exifInterface, hgk hgkVar, hsr hsrVar, ddf ddfVar) {
        this.e = i;
        this.f = j;
        this.d = uuid;
        this.a = licVar;
        this.b = i2;
        this.c = i3;
        this.j = bArr;
        this.k = exifInterface;
        this.g = hgkVar;
        this.h = hsrVar;
        this.i = ddfVar;
    }

    public final ikc a(hsc hscVar, ojc ojcVar, ojc ojcVar2) {
        lig.h(this.b, this.c);
        ikc ikcVar = new ikc(mbs.JPEG);
        ikcVar.b(this.a);
        try {
            FileOutputStream fileOutputStreamE = hscVar.a.e();
            try {
                b(ojcVar, ojcVar2, hscVar.b, hscVar.a().c(), fileOutputStreamE);
                fileOutputStreamE.close();
                hscVar.c();
                return ikcVar;
            } catch (Throwable th) {
                try {
                    fileOutputStreamE.close();
                } catch (Throwable th2) {
                }
                throw th;
            }
        } catch (IOException e) {
            hscVar.b();
            throw new IllegalStateException(e);
        }
    }

    public final void b(ojc ojcVar, ojc ojcVar2, boolean z, String str, OutputStream outputStream) {
        ast astVarB;
        hsr hsrVar;
        Object obj;
        Object obj2;
        ExifInterface exifInterface = this.k;
        exifInterface.getClass();
        OutputStream outputStreamM = exifInterface.m(outputStream);
        try {
            byte[] bArr = this.j;
            ast astVarA = null;
            if (this.g.c.g()) {
                byte[] bArrD = DynamicDepthUtils.d(this.j, (DynamicDepthResult) this.g.c.c(), null);
                ((DynamicDepthResult) this.g.c.c()).close();
                if (bArrD != null) {
                    bArr = bArrD;
                }
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            if (this.g.c.g()) {
                ojd ojdVarE = mde.e(byteArrayInputStream);
                ast astVar = (ojdVarE == null || (obj2 = ojdVarE.a) == null) ? null : (ast) obj2;
                if (ojdVarE != null && (obj = ojdVarE.b) != null) {
                    astVarA = (ast) obj;
                }
                if (this.g.b.g()) {
                    astVarA = mde.b(astVarA, (ast) this.g.b.f());
                }
                byteArrayInputStream.reset();
                astVarB = astVarA;
                astVarA = astVar;
            } else if (this.g.a.g()) {
                astVarA = (ast) this.g.a.c();
                astVarB = (ast) this.g.b.f();
            } else {
                astVarB = (ast) this.g.b.f();
            }
            ddf ddfVar = this.i;
            if (ddfVar != null && ddfVar.k(ddx.F) && (hsrVar = this.h) != null && hsrVar == hsr.PORTRAIT) {
                if (astVarA == null) {
                    astVarA = mde.a();
                }
                mde.k(astVarA, str);
            } else if (astVarA == null) {
                ast astVarA2 = mde.a();
                hls.l(this.d, z, str, !z, astVarA2);
                astVarA = astVarA2;
            } else {
                hls.l(this.d, z, str, !z, astVarA);
            }
            ExifInterface exifInterface2 = this.k;
            if (exifInterface2 != null) {
                astVarB = mde.b(astVarB, (ast) mde.c(exifInterface2.bA).f());
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            mde.o(byteArrayInputStream, byteArrayOutputStream, astVarA, astVarB);
            outputStreamM.write(byteArrayOutputStream.toByteArray());
            if (ojcVar.g()) {
                if (ojcVar2.g()) {
                    efi.a((byte[]) ojcVar.c(), (String) ojcVar2.c());
                }
                outputStreamM.write((byte[]) ojcVar.c());
            }
            outputStreamM.close();
        } catch (Throwable th) {
            try {
                outputStreamM.close();
            } catch (Throwable th2) {
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hpm) {
            hpm hpmVar = (hpm) obj;
            if (this.f == hpmVar.f && this.b == hpmVar.b && this.c == hpmVar.c && this.e == hpmVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return String.format("%d_%dx%d_%d", Long.valueOf(this.f), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.e)).hashCode();
    }

    public final String toString() {
        long j = this.f;
        StringBuilder sb = new StringBuilder(38);
        sb.append("BurstMemoryImage[");
        sb.append(j);
        sb.append("]");
        return sb.toString();
    }
}
