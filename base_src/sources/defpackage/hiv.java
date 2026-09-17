package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.SystemClock;
import com.google.android.apps.camera.bottombar.R;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.android.libraries.camera.jni.jpeg.JpegUtilNative;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.TimeZone;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class hiv extends hja {
    private static final ouj a = ouj.h("com/google/android/apps/camera/processing/imagebackend/TaskCompressImageToJpeg");
    private final hjf b;

    public hiv(hin hinVar, Executor executor, hil hilVar, hsa hsaVar, hjf hjfVar) {
        super(hinVar, executor, hilVar, 4, hsaVar);
        this.b = hjfVar;
    }

    public static final int a(mad madVar, ByteBuffer byteBuffer, Rect rect) {
        return JpegUtilNative.a(madVar, byteBuffer, rect, lic.CLOCKWISE_0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ByteBuffer byteBufferWrap;
        ExifInterface exifInterfaceA;
        final hix hixVar;
        int iLimit;
        hjg hjgVarC;
        iij iijVarK;
        hsa hsaVar;
        hil hilVar;
        mad madVar;
        Executor executor;
        hin hinVar = this.f;
        iij iijVarK2 = this.g.k();
        iijVarK2.getClass();
        ((iik) iijVarK2).a = SystemClock.elapsedRealtime();
        switch (hinVar.a.a()) {
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                Rect rectI = i(hinVar.a, hinVar.e);
                try {
                    hinVar.a.c();
                    hinVar.a.b();
                    lig ligVar = new lig(rectI.width(), rectI.height());
                    hixVar = new hix(hinVar.b, ligVar.a, ligVar.b);
                    j(this.e, hixVar, 3);
                    int i = ((hixVar.c * 3) * hixVar.b) / 2;
                    int i2 = i / 2;
                    hjgVarC = this.b.c(Integer.valueOf(i2));
                    ByteBuffer byteBuffer = (ByteBuffer) hjgVarC.a();
                    if (byteBuffer != null) {
                        int iA = a(hinVar.a, byteBuffer, hinVar.e);
                        if (iA > i2) {
                            hjgVarC.close();
                            this.b.c(Integer.valueOf(i));
                            ByteBuffer byteBuffer2 = (ByteBuffer) hjgVarC.a();
                            if (byteBuffer2 == null) {
                                this.g.C(jmq.a, new dmd("Failed to allocate jpeg buffer for encoding."));
                                hjgVarC.close();
                                hilVar = this.c;
                                madVar = hinVar.a;
                                executor = this.d;
                            } else {
                                iLimit = a(hinVar.a, byteBuffer2, hinVar.e);
                                byteBufferWrap = byteBuffer2;
                            }
                        } else {
                            byteBufferWrap = byteBuffer;
                            iLimit = iA;
                        }
                        if (iLimit < 0) {
                            hjgVarC.close();
                            throw new RuntimeException("Error compressing jpeg.");
                        }
                        this.c.b(hinVar.a, this.d);
                        exifInterfaceA = lmi.b().a;
                        exifInterfaceA.x(ExifInterface.s, this.f.k, TimeZone.getDefault());
                        break;
                    } else {
                        this.g.C(jmq.a, new dmd("Failed to allocate jpeg buffer for encoding."));
                        hjgVarC.close();
                        hilVar = this.c;
                        madVar = hinVar.a;
                        executor = this.d;
                    }
                    hilVar.b(madVar, executor);
                    return;
                } catch (Throwable th) {
                    this.c.b(hinVar.a, this.d);
                    throw th;
                }
            case 256:
                try {
                    ByteBuffer buffer = ((mac) hinVar.a.g().get(0)).getBuffer();
                    try {
                        int iLimit2 = buffer.limit();
                        byte[] bArr = new byte[iLimit2];
                        byteBufferWrap = ByteBuffer.wrap(bArr);
                        byteBufferWrap.put(buffer);
                        exifInterfaceA = lmi.a(bArr);
                        lmb lmbVarC = lmb.c(exifInterfaceA);
                        Integer numB = exifInterfaceA.b(ExifInterface.ai);
                        numB.getClass();
                        int iIntValue = numB.intValue();
                        Integer numB2 = exifInterfaceA.b(ExifInterface.aj);
                        numB2.getClass();
                        int iIntValue2 = numB2.intValue();
                        Integer numValueOf = Integer.valueOf(iIntValue);
                        Integer numValueOf2 = Integer.valueOf(iIntValue2);
                        lic licVarA = lmb.a(lmbVarC);
                        lic licVarB = lic.b(hinVar.b.e + licVarA.e);
                        int iIntValue3 = numValueOf.intValue();
                        int iIntValue4 = numValueOf2.intValue();
                        Rect rect = hinVar.e;
                        Rect rectH = h(iIntValue3, iIntValue4, (licVarB == lic.CLOCKWISE_0 || licVarB == lic.CLOCKWISE_180) ? new Rect(rect) : new Rect(rect.top, rect.left, rect.bottom, rect.right));
                        hixVar = new hix(licVarA, iIntValue3, iIntValue4);
                        mad madVar2 = hinVar.a;
                        if (!rectH.equals(new Rect(0, 0, madVar2.c(), madVar2.b()))) {
                            hixVar = new hix(licVarA, rectH.width(), rectH.height());
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(BitmapFactory.decodeByteArray(bArr, 0, iLimit2), rectH.left, rectH.top, rectH.width(), rectH.height());
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 95, byteArrayOutputStream);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteArray.length);
                            byteBufferAllocate.put(ByteBuffer.wrap(byteArray));
                            byteBufferWrap = byteBufferAllocate;
                        }
                        this.c.b(hinVar.a, this.d);
                        j(this.e, hixVar, 3);
                        byteBufferWrap.getClass();
                        iLimit = byteBufferWrap.limit();
                        hjgVarC = null;
                    } catch (OutOfMemoryError e) {
                        this.g.C(jmq.a, new dmd("Failed to allocate jpeg buffer for encoding."));
                        this.c.b(hinVar.a, this.d);
                        return;
                    }
                } catch (Throwable th2) {
                    this.c.b(hinVar.a, this.d);
                    throw th2;
                }
                break;
            default:
                this.c.b(hinVar.a, this.d);
                throw new IllegalArgumentException("Unsupported input image format for TaskCompressImageToJpeg");
        }
        byte[] bArr2 = new byte[iLimit];
        byteBufferWrap.getClass();
        byteBufferWrap.get(bArr2);
        if (hjgVarC != null) {
            hjgVarC.close();
        }
        ((hia) this.c).k.d(new hiy(this.e, hixVar, 3), new fcy());
        ojc ojcVarH = ojc.h(exifInterfaceA);
        pht phtVar = hinVar.c;
        lmi lmiVar = ojcVarH.g() ? new lmi((ExifInterface) ojcVarH.c()) : lmi.b();
        lmiVar.f(hixVar.c, hixVar.b, hixVar.a, ojc.h((lzr) mip.bY(phtVar)));
        ExifInterface exifInterface = lmiVar.a;
        iij iijVarK3 = this.g.k();
        iijVarK3.getClass();
        ((iik) iijVarK3).g = exifInterface;
        hsa hsaVar2 = this.g;
        new lig(hixVar.c, hixVar.b);
        ikc ikcVar = new ikc(mbs.JPEG);
        ikcVar.a(exifInterface);
        ikcVar.b(hixVar.a);
        mip.bZ(hsaVar2.r(bArr2, ikcVar), new lht() { // from class: hiu
            @Override // defpackage.lht
            public final void a(Object obj) {
                hiv hivVar = this.a;
                hiy hiyVar = new hiy(hivVar.e, hixVar, 3);
                ((hia) hivVar.c).k.b(hiyVar, (hsp) obj);
            }
        });
        pht phtVar2 = hinVar.c;
        try {
            if (!phtVar2.isDone()) {
                ((oug) ((oug) a.c()).G((char) 2493)).o("CaptureResults unavailable to photoCaptureDoneEvent event.");
                iij iijVarK4 = this.g.k();
                iijVarK4.getClass();
                iijVarK4.f(SystemClock.elapsedRealtime());
                return;
            }
            iij iijVarK5 = this.g.k();
            iijVarK5.getClass();
            iijVarK5.d((lzr) phtVar2.get(), false);
            hsaVar = this.g;
            iijVarK = hsaVar.k();
        } catch (InterruptedException e2) {
            ((oug) ((oug) a.b()).G(2494)).o("CaptureResults not added to photoCaptureDoneEvent event due to Interrupted Exception.");
            hsaVar = this.g;
        } catch (ExecutionException e3) {
            ((oug) ((oug) a.c()).G(2495)).o("CaptureResults not added to photoCaptureDoneEvent event due to Execution Exception.");
            hsaVar = this.g;
        } finally {
            iijVarK = this.g.k();
            iijVarK.getClass();
            iijVarK.f(SystemClock.elapsedRealtime());
        }
    }
}
