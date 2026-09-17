package defpackage;

import android.graphics.Rect;
import com.google.android.libraries.camera.exif.ExifInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class hin {
    public final mad a;
    public final lic b;
    public final pht c;
    public final iij d;
    public final Rect e;
    public final hsr f;
    public final lwd g;
    public final htf i;
    public final long j;
    public final long k;
    public final ExifInterface h = null;
    public final bug l = null;

    public hin(mad madVar, hsr hsrVar, lwd lwdVar, lic licVar, pht phtVar, Rect rect, long j, long j2, iij iijVar, htf htfVar) {
        this.a = madVar;
        this.f = hsrVar;
        this.g = lwdVar;
        this.b = licVar;
        this.c = phtVar;
        this.e = rect;
        this.j = j;
        this.k = j2;
        this.d = iijVar;
        this.i = htfVar;
    }

    public static him a(mad madVar) {
        return new him(madVar);
    }

    public static him b(gjs gjsVar) {
        him himVar = new him(gjsVar);
        himVar.d = gjsVar.k();
        return himVar;
    }

    public static hin c(mad madVar, hin hinVar) {
        him himVar = new him(madVar);
        himVar.a = hinVar.g;
        himVar.b = hinVar.f;
        himVar.c = hinVar.b;
        himVar.d = hinVar.c;
        himVar.h = hinVar.i;
        himVar.f = hinVar.e;
        ExifInterface exifInterface = hinVar.h;
        himVar.e = hinVar.d;
        himVar.b(hinVar.k);
        himVar.g = Long.valueOf(hinVar.j);
        return himVar.a();
    }
}
