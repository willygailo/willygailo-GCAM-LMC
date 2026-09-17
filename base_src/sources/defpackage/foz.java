package defpackage;

import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class foz implements fpl {
    private static final ouj a = ouj.h("com/google/android/apps/camera/microvideo/NoOpMicrovideoSession");
    private final hsp b;

    public foz(hsp hspVar) {
        this.b = hspVar;
    }

    @Override // defpackage.fpl
    public final pht a(ikc ikcVar, hsc hscVar, ojc ojcVar, long j, iij iijVar) {
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 31);
        sb.append("No in-flight session found for ");
        sb.append(strValueOf);
        return plk.U(new RuntimeException(sb.toString()));
    }

    @Override // defpackage.fpl
    public final pht b(ikc ikcVar, InputStream inputStream, hsc hscVar, ojc ojcVar, long j, String str, iij iijVar) {
        try {
            iijVar.e(mip.Q(inputStream, (ExifInterface) ojcVar.f(), hscVar.a));
            hscVar.c();
            return plk.V(ikcVar);
        } catch (IOException e) {
            ((oug) ((oug) ((oug) a.b()).h(e)).G((char) 1832)).o("Error while saving jpeg in finishMicrovideo");
            hscVar.b();
            return plk.U(e);
        }
    }

    @Override // defpackage.fpl
    public final void c() {
    }
}
