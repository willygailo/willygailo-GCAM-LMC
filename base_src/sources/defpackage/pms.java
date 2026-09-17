package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class pms {
    public final Uri a;
    public final Bitmap b;
    public final Long c;
    public final pmh d;
    public final Integer e;
    public final Integer f;
    public final PointF g;
    private final byte[] h;

    public pms() {
    }

    public pms(Uri uri, Bitmap bitmap, Long l, pmh pmhVar, Integer num, Integer num2, PointF pointF) {
        this.a = uri;
        this.b = bitmap;
        this.h = null;
        this.c = l;
        this.d = pmhVar;
        this.e = num;
        this.f = num2;
        this.g = pointF;
    }

    public static pmr b() {
        return new pmr();
    }

    public final Bundle a(kcr kcrVar) {
        Bundle bundle = new Bundle();
        Uri uri = this.a;
        if (uri != null) {
            bundle.putParcelable("uri", uri);
        }
        Bitmap bitmapCreateBitmap = this.b;
        if (bitmapCreateBitmap != null) {
            int i = (kcrVar.a & 4) != 0 ? kcrVar.d : 33554432;
            if (bitmapCreateBitmap.getByteCount() > i) {
                Log.w("LensMetadata", String.format("Input bitmap is %d bytes, which is larger than our maximum of %d bytes. Downsampling...", Integer.valueOf(bitmapCreateBitmap.getByteCount()), Integer.valueOf(i)));
                float fSqrt = (float) Math.sqrt(i / bitmapCreateBitmap.getByteCount());
                Matrix matrix = new Matrix();
                matrix.setScale(fSqrt, fSqrt);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
            }
            bundle.putParcelable("bitmap", bitmapCreateBitmap);
        }
        Integer num = this.e;
        bundle.putInt("lens_transition_type", num != null ? num.intValue() : 0);
        PointF pointF = this.g;
        if (pointF != null) {
            bundle.putParcelable("lens_tap_location", pointF);
        }
        return bundle;
    }

    public final pmr c() {
        return new pmr(this);
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        Long l = this.c;
        if (l != null) {
            bundle.putLong("activity_launch_timestamp_nanos", l.longValue());
        }
        pmh pmhVar = this.d;
        if (pmhVar != null) {
            bundle.putByteArray("lens_initial_parameters", pmhVar.g());
        }
        Integer num = this.f;
        if (num != null) {
            bundle.putInt("lens_intent_type", num.intValue());
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        Long l;
        pmh pmhVar;
        Integer num;
        Integer num2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pms)) {
            return false;
        }
        pms pmsVar = (pms) obj;
        Uri uri = this.a;
        if (uri != null ? uri.equals(pmsVar.a) : pmsVar.a == null) {
            Bitmap bitmap = this.b;
            if (bitmap != null ? bitmap.equals(pmsVar.b) : pmsVar.b == null) {
                if (pmsVar instanceof pms) {
                    byte[] bArr = pmsVar.h;
                }
                if (Arrays.equals((byte[]) null, (byte[]) null) && ((l = this.c) != null ? l.equals(pmsVar.c) : pmsVar.c == null) && ((pmhVar = this.d) != null ? pmhVar.equals(pmsVar.d) : pmsVar.d == null) && ((num = this.e) != null ? num.equals(pmsVar.e) : pmsVar.e == null) && ((num2 = this.f) != null ? num2.equals(pmsVar.f) : pmsVar.f == null)) {
                    PointF pointF = this.g;
                    PointF pointF2 = pmsVar.g;
                    if (pointF != null ? pointF.equals(pointF2) : pointF2 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iB;
        Uri uri = this.a;
        int iHashCode = ((uri == null ? 0 : uri.hashCode()) ^ 1000003) * 1000003;
        Bitmap bitmap = this.b;
        int iHashCode2 = (((iHashCode ^ (bitmap == null ? 0 : bitmap.hashCode())) * 272515929) ^ Arrays.hashCode((byte[]) null)) * 1000003;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 ^ (l == null ? 0 : l.hashCode())) * 1525764945;
        pmh pmhVar = this.d;
        if (pmhVar == null) {
            iB = 0;
        } else {
            iB = pmhVar.aD;
            if (iB == 0) {
                iB = pqu.a.b(pmhVar).b(pmhVar);
                pmhVar.aD = iB;
            }
        }
        int i = (iHashCode3 ^ iB) * 1000003;
        Integer num = this.e;
        int iHashCode4 = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.f;
        int iHashCode5 = (iHashCode4 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        PointF pointF = this.g;
        return (iHashCode5 ^ (pointF != null ? pointF.hashCode() : 0)) * 1525764945;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf((Object) null);
        String strValueOf4 = String.valueOf((Object) null);
        String strValueOf5 = String.valueOf((Object) null);
        String string = Arrays.toString((byte[]) null);
        String strValueOf6 = String.valueOf(this.c);
        String strValueOf7 = String.valueOf((Object) null);
        String strValueOf8 = String.valueOf((Object) null);
        String strValueOf9 = String.valueOf((Object) null);
        String strValueOf10 = String.valueOf(this.d);
        String strValueOf11 = String.valueOf(this.e);
        String strValueOf12 = String.valueOf(this.f);
        String strValueOf13 = String.valueOf(this.g);
        String strValueOf14 = String.valueOf((Object) null);
        String strValueOf15 = String.valueOf((Object) null);
        String strValueOf16 = String.valueOf((Object) null);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        int length3 = String.valueOf(strValueOf3).length();
        int length4 = String.valueOf((Object) null).length();
        int length5 = String.valueOf(strValueOf4).length();
        int length6 = String.valueOf(strValueOf5).length();
        int length7 = String.valueOf((Object) null).length();
        int length8 = String.valueOf(string).length();
        int length9 = String.valueOf(strValueOf6).length();
        int length10 = String.valueOf(strValueOf7).length();
        int length11 = String.valueOf(strValueOf8).length();
        int length12 = String.valueOf(strValueOf9).length();
        int length13 = String.valueOf(strValueOf10).length();
        int length14 = String.valueOf(strValueOf11).length();
        int length15 = String.valueOf(strValueOf12).length();
        int length16 = String.valueOf(strValueOf13).length();
        int length17 = String.valueOf(strValueOf14).length();
        int length18 = String.valueOf((Object) null).length();
        StringBuilder sb = new StringBuilder(length + 379 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + length14 + length15 + length16 + length17 + length18 + String.valueOf(strValueOf15).length() + String.valueOf(strValueOf16).length());
        sb.append("LensMetadata{bitmapUri=");
        sb.append(strValueOf);
        sb.append(", bitmap=");
        sb.append(strValueOf2);
        sb.append(", imageLocationOnScreen=");
        sb.append(strValueOf3);
        sb.append(", account=null, cropBoundingBox=");
        sb.append(strValueOf4);
        sb.append(", imageLocation=");
        sb.append(strValueOf5);
        sb.append(", imagePlaceId=null, imagePayload=");
        sb.append(string);
        sb.append(", lensActivityLaunchTimestampNanos=");
        sb.append(strValueOf6);
        sb.append(", startStreamingRequestTimestampNanos=");
        sb.append(strValueOf7);
        sb.append(", hideLensCloseButton=");
        sb.append(strValueOf8);
        sb.append(", disableArtLookalike=");
        sb.append(strValueOf9);
        sb.append(", lensInitParams=");
        sb.append(strValueOf10);
        sb.append(", transitionType=");
        sb.append(strValueOf11);
        sb.append(", intentType=");
        sb.append(strValueOf12);
        sb.append(", tapLocation=");
        sb.append(strValueOf13);
        sb.append(", lensTheme=");
        sb.append(strValueOf14);
        sb.append(", fifeUrl=null, disableIntentOptimizations=");
        sb.append(strValueOf15);
        sb.append(", promoAddShortcut=");
        sb.append(strValueOf16);
        sb.append("}");
        return sb.toString();
    }
}
