package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.location.Location;
import android.text.TextUtils;
import com.google.googlex.gcam.BurstSpec;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eto implements oiu {
    private final /* synthetic */ int u;
    public static final /* synthetic */ eto t = new eto(20);
    public static final /* synthetic */ eto s = new eto(19);
    public static final /* synthetic */ eto r = new eto(17);
    public static final /* synthetic */ eto q = new eto(16);
    public static final /* synthetic */ eto p = new eto(15);
    public static final /* synthetic */ eto o = new eto(14);
    public static final /* synthetic */ eto n = new eto(13);
    public static final /* synthetic */ eto m = new eto(12);
    public static final /* synthetic */ eto l = new eto(11);
    public static final /* synthetic */ eto k = new eto(10);
    public static final /* synthetic */ eto j = new eto(9);
    public static final /* synthetic */ eto i = new eto(8);
    public static final /* synthetic */ eto h = new eto(7);
    public static final /* synthetic */ eto g = new eto(6);
    public static final /* synthetic */ eto f = new eto(5);
    public static final /* synthetic */ eto e = new eto(4);
    public static final /* synthetic */ eto d = new eto(3);
    public static final /* synthetic */ eto c = new eto(2);
    public static final /* synthetic */ eto b = new eto(1);
    public static final /* synthetic */ eto a = new eto(0);

    public /* synthetic */ eto(int i2) {
        this.u = i2;
    }

    @Override // defpackage.oiu
    public final Object a(Object obj) {
        switch (this.u) {
            case 0:
                return true;
            case 1:
                return Integer.valueOf(((Integer) obj).intValue() == esn.LANDSCAPE.ordinal() ? 9 : 3);
            case 2:
                return bxg.c;
            case 3:
                return Boolean.valueOf(hsr.LONG_SHOT.equals(((hsa) obj).i()));
            case 4:
                return (Location) ((ojc) obj).f();
            case 5:
                return ojc.i((psv) obj);
            case 6:
                return ((jwy) obj).a();
            case 7:
                return Byte.valueOf(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
            case 8:
                return ((jnj) obj).a;
            case 9:
                return fcy.h((lnq) obj);
            case 10:
                return (Boolean) obj;
            case 11:
                return (Boolean) obj;
            case 12:
                return hte.a(((Integer) obj).intValue());
            case 13:
                gsm gsmVar = (gsm) obj;
                return fcy.k(mip.be(CaptureRequest.SCALER_CROP_REGION, gsmVar.a), mip.be(CaptureRequest.LENS_FOCAL_LENGTH, Float.valueOf(gsmVar.c)));
            case 14:
                return (Boolean) obj;
            case 15:
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            case 16:
                return ((BurstSpec) obj).b();
            case 17:
                return ((BurstSpec) obj).b();
            case 18:
                ((oug) ((oug) hvy.a.c()).G(2667)).q("waitForCamerasAllAvailable timed out after %dms", 60000L);
                return false;
            case 19:
                ((oug) ((oug) hwh.a.b()).G(2675)).p("HAL install did not complete within %d seconds! Terminating.", 70);
                return true;
            default:
                return cik.ON.equals((cik) obj) ? gtv.COCKTAIL_PARTY_ON : gtv.COCKTAIL_PARTY_OFF;
        }
    }
}
