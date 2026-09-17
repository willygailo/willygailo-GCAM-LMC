package defpackage;

import android.graphics.Bitmap;
import android.location.Location;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.googlex.gcam.DebugParams;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class hqf implements hsa {
    private static final ouj b = ouj.h("com/google/android/apps/camera/session/ImageIntentSession");
    public final hsp a = hsp.a();
    private final iij c;
    private final String d;
    private final long e;
    private final bww f;
    private lzv g;
    private final pih h;

    public hqf(String str, long j, bww bwwVar, iij iijVar, pih pihVar) {
        this.d = str;
        this.e = j;
        this.f = bwwVar;
        this.c = iijVar;
        obr.aR(!pihVar.isDone(), "SettableFuture for image data is already set before the session started");
        this.h = pihVar;
    }

    @Override // defpackage.hsa
    public final void A() {
    }

    @Override // defpackage.hsa
    public final void B() {
    }

    @Override // defpackage.hsa
    public final void C(jmo jmoVar, Throwable th) {
    }

    @Override // defpackage.hsa
    public final /* synthetic */ void D(boolean z) {
    }

    @Override // defpackage.hsa
    public final void L(lzv lzvVar) {
        this.g = lzvVar;
    }

    @Override // defpackage.hsa
    public final void M(DebugParams debugParams) {
    }

    @Override // defpackage.hsa
    public final synchronized void O(jmo jmoVar) {
    }

    @Override // defpackage.hsa
    public final synchronized void P(lig ligVar) {
    }

    @Override // defpackage.hsa
    public final /* synthetic */ void Q(long j) {
    }

    @Override // defpackage.hsa
    public final /* synthetic */ void R() {
        hls.i(this);
    }

    @Override // defpackage.hsa
    public final void S(Integer num) {
    }

    @Override // defpackage.hsa
    public final void U(Bitmap bitmap, int i) {
    }

    @Override // defpackage.hsa
    public final void V(Bitmap bitmap) {
    }

    @Override // defpackage.hsa
    public final void W(Bitmap bitmap) {
    }

    @Override // defpackage.hsa
    public final void Y(int i) {
    }

    @Override // defpackage.hhm
    public final synchronized lif a() {
        return lif.b;
    }

    @Override // defpackage.hhm
    public final synchronized void b(lif lifVar) {
    }

    @Override // defpackage.hhm
    public final void c(hho hhoVar) {
    }

    @Override // defpackage.hsa
    public final long d() {
        return this.e;
    }

    @Override // defpackage.hsa
    public final hsc f() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.hsa
    public final hsg g() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.hsa
    public final hsp h() {
        return this.a;
    }

    @Override // defpackage.hsa
    public final hsr i() {
        return hsr.IMAGE_INTENT;
    }

    @Override // defpackage.hsa
    public final hss j() {
        return hss.MEDIA_STORE;
    }

    @Override // defpackage.hsa
    public final iij k() {
        return this.c;
    }

    @Override // defpackage.hsa
    public final lzv l() {
        return this.g;
    }

    @Override // defpackage.hsa
    public final ojc m() {
        return oih.a;
    }

    @Override // defpackage.hsa
    public final ojc n() {
        return oih.a;
    }

    @Override // defpackage.hsa
    public final pht p() {
        return pgb.h(this.h, new oiu() { // from class: hqe
            @Override // defpackage.oiu
            public final Object a(Object obj) {
                return this.a.a;
            }
        }, pgr.INSTANCE);
    }

    @Override // defpackage.hsa
    public final pht q() {
        throw new IllegalStateException("Image Intent session doesn't have a MediaStoreRecord.");
    }

    @Override // defpackage.hsa
    public final pht r(byte[] bArr, ikc ikcVar) {
        try {
            ExifInterface exifInterface = (ExifInterface) ikcVar.c.f();
            if (exifInterface != null) {
                ojc ojcVarB = this.f.b();
                if (ojcVarB.g()) {
                    lmi lmiVar = new lmi(exifInterface);
                    lmiVar.d((Location) ojcVarB.c());
                    exifInterface = lmiVar.a;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (bArr == null) {
                    throw new IllegalArgumentException("Argument is null");
                }
                ozj ozjVar = new ozj(byteArrayOutputStream);
                try {
                    OutputStream outputStreamM = exifInterface.m(ozjVar);
                    try {
                        outputStreamM.write(bArr, 0, bArr.length);
                        outputStreamM.close();
                        ozjVar.flush();
                        ozjVar.close();
                        bArr = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            outputStreamM.close();
                        } catch (Throwable th2) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        ozjVar.close();
                    } catch (Throwable th4) {
                    }
                    throw th3;
                }
            }
            this.h.o(bArr);
        } catch (IOException e) {
            ((oug) ((oug) ((oug) b.b()).h(e)).G((char) 2597)).o("Could not read image bytes.");
            this.h.a(e);
        }
        return plk.V(this.a);
    }

    @Override // defpackage.hsa
    public final String s() {
        return this.d;
    }

    @Override // defpackage.hsa
    public final void u(hsn hsnVar) {
    }

    @Override // defpackage.hsa
    public final void w(Throwable th) {
    }

    @Override // defpackage.hsa
    public final void y() {
    }
}
