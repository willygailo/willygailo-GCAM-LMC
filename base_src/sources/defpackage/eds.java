package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.HardwareBuffer;
import android.location.Location;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.JpgEncodeOptions;
import com.google.googlex.gcam.LockedHardwareBuffer;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.imageio.JpgHelper;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes.dex */
final class eds implements Runnable {
    final /* synthetic */ edu a;
    private final pih b;
    private int c;
    private final boolean d;
    private final ShotMetadata e;
    private final int f;
    private final ojc g;
    private final msq h;

    public eds(edu eduVar, msq msqVar, pih pihVar, int i, boolean z, ShotMetadata shotMetadata, int i2, ojc ojcVar, byte[] bArr) {
        this.a = eduVar;
        this.h = msqVar;
        this.b = pihVar;
        this.c = i;
        this.d = z;
        this.e = shotMetadata;
        this.f = i2;
        this.g = ojcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterleavedReadViewU8 interleavedReadViewU8A;
        lig ligVar;
        int iImageRotationToDegrees;
        if (this.h.b.g()) {
            interleavedReadViewU8A = ((InterleavedImageU8) this.h.b.c()).c();
        } else if (!this.h.a.g()) {
            return;
        } else {
            interleavedReadViewU8A = LockedHardwareBuffer.c((HardwareBuffer) this.h.a.c(), 3L).a();
        }
        lig ligVar2 = new lig(interleavedReadViewU8A.d(), interleavedReadViewU8A.c());
        if (this.d) {
            iImageRotationToDegrees = GcamModuleJNI.ImageRotationToDegrees(this.e.b());
            plk.E(this.e);
            lig ligVarI = ligVar2.i(lic.b(iImageRotationToDegrees));
            this.c = 0;
            ligVar = ligVarI;
        } else {
            ligVar = ligVar2;
            iImageRotationToDegrees = 0;
        }
        ojc ojcVarA = JpgHelper.a(interleavedReadViewU8A, new JpgEncodeOptions(), iImageRotationToDegrees);
        if (!ojcVarA.g()) {
            ((oug) ((oug) edu.a.b()).G((char) 1074)).o("Error encoding burst image");
            this.b.a(new RuntimeException("Image couldn't be encoded."));
            return;
        }
        ExifInterface exifInterfaceA = dzy.a(ligVar.a, ligVar.b, this.e, this.g);
        edu eduVar = this.a;
        hoh hohVar = eduVar.e;
        lwd lwdVarK = eduVar.i.k();
        int i = this.c;
        if (hohVar.e(lwdVarK)) {
            Bitmap bitmapDecodeByteArray = null;
            if (exifInterfaceA.bB.f()) {
                byte[] bArr = exifInterfaceA.bB.b;
                if (bArr != null) {
                    bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                }
            } else {
                exifInterfaceA.bB.g();
            }
            if (bitmapDecodeByteArray != null) {
                Bitmap bitmapB = hohVar.b(bitmapDecodeByteArray, i, lwdVarK, false);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (bitmapB.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream)) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    exifInterfaceA.bB.e();
                    exifInterfaceA.bB.b = byteArray;
                }
            }
        }
        lmi lmiVar = new lmi(exifInterfaceA);
        lmiVar.h(this.a.i.k(), exifInterfaceA.a(ExifInterface.Z), exifInterfaceA.a(ExifInterface.G));
        ojc ojcVarD = this.a.c.d();
        if (ojcVarD.g()) {
            lmiVar.d((Location) ojcVarD.c());
        }
        this.a.b.a(exifInterfaceA);
        this.b.o(gjx.a((this.e.d() / 1000) + ((long) this.f), (byte[]) ojcVarA.c(), ligVar, this.c, exifInterfaceA, null));
    }
}
