package defpackage;

import android.content.ContentProviderOperation;
import android.hardware.camera2.params.OutputConfiguration;
import android.location.Location;
import android.media.MediaCodec;
import java.io.FileDescriptor;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class imd implements oiu {
    private final /* synthetic */ int u;
    public static final /* synthetic */ imd t = new imd(20);
    public static final /* synthetic */ imd s = new imd(19);
    public static final /* synthetic */ imd r = new imd(18);
    public static final /* synthetic */ imd q = new imd(17);
    public static final /* synthetic */ imd p = new imd(16);
    public static final /* synthetic */ imd o = new imd(15);
    public static final /* synthetic */ imd n = new imd(14);
    public static final /* synthetic */ imd m = new imd(13);
    public static final /* synthetic */ imd l = new imd(12);
    public static final /* synthetic */ imd k = new imd(11);
    public static final /* synthetic */ imd j = new imd(10);
    public static final /* synthetic */ imd i = new imd(8);
    public static final /* synthetic */ imd h = new imd(7);
    public static final /* synthetic */ imd g = new imd(6);
    public static final /* synthetic */ imd f = new imd(5);
    public static final /* synthetic */ imd e = new imd(4);
    public static final /* synthetic */ imd d = new imd(3);
    public static final /* synthetic */ imd c = new imd(2);
    public static final /* synthetic */ imd b = new imd(1);
    public static final /* synthetic */ imd a = new imd(0);

    public /* synthetic */ imd(int i2) {
        this.u = i2;
    }

    @Override // defpackage.oiu
    public final Object a(Object obj) {
        switch (this.u) {
            case 0:
                List list = (List) obj;
                return Boolean.valueOf(((Boolean) list.get(0)).booleanValue() && Boolean.valueOf(((Serializable) list.get(1)).equals(Integer.valueOf(hls.c(2)))).booleanValue());
            case 1:
                return gtv.COCKTAIL_PARTY_ON.equals((gtv) obj) ? cik.ON : cik.OFF;
            case 2:
                ((oug) ((oug) ((oug) ivp.a.c()).h((Throwable) obj)).G(3171)).o("Failed to update indicator bitmap cache");
                return true;
            case 3:
                return Integer.valueOf(((jfg) obj).b);
            case 4:
                return ((jfg) obj).a;
            case 5:
                return ((qyp) obj).d();
            case 6:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    if (((Boolean) it.next()).booleanValue()) {
                        return true;
                    }
                }
                return false;
            case 7:
                Iterator it2 = ((List) obj).iterator();
                while (it2.hasNext()) {
                    if (!((Boolean) it2.next()).booleanValue()) {
                        return false;
                    }
                }
                return true;
            case 8:
                List<Comparable> list2 = (List) obj;
                Comparable comparable = (Comparable) list2.get(0);
                for (Comparable comparable2 : list2) {
                    if (comparable.compareTo(comparable2) > 0) {
                        comparable = comparable2;
                    }
                }
                return comparable;
            case 9:
                return lup.f((lxu) obj, null);
            case 10:
                lzx lzxVar = (lzx) obj;
                lzxVar.getClass();
                return (OutputConfiguration) lzxVar.j().a;
            case 11:
                ContentProviderOperation contentProviderOperation = (ContentProviderOperation) obj;
                String authority = contentProviderOperation.getUri().getAuthority();
                contentProviderOperation.getUri();
                authority.getClass();
                return authority;
            case 12:
                return ((MediaCodec) obj).createInputSurface();
            case 13:
                Location location = (Location) obj;
                if (location == null) {
                    return null;
                }
                return Float.valueOf((float) location.getLatitude());
            case 14:
                Location location2 = (Location) obj;
                if (location2 == null) {
                    return null;
                }
                return Float.valueOf((float) location2.getLongitude());
            case 15:
                return new msq((FileDescriptor) obj);
            case 16:
                return poc.v((String) obj);
            case 17:
                return piv.a((String) obj);
            case 18:
                return ngt.a((neu) obj);
            case 19:
                nur nurVar = (nur) obj;
                nuq nuqVar = new nuq();
                float f2 = nurVar.a;
                float f3 = nurVar.b;
                float f4 = nurVar.c;
                float f5 = nurVar.d;
                double radians = Math.toRadians(nurVar.e);
                float fSin = (float) Math.sin(radians);
                float fCos = (float) Math.cos(radians);
                float f6 = (f4 * fCos) + f2;
                float f7 = (f4 * fSin) + f3;
                float f8 = fSin * f5;
                float f9 = f5 * fCos;
                nuqVar.c(f2, f3, f6, f7, f6 - f8, f7 + f9, f2 - f8, f3 + f9);
                return nuqVar;
            default:
                pnc pncVar = (pnc) obj;
                return new nur(pncVar.b, pncVar.c, pncVar.d, pncVar.e, pncVar.f);
        }
    }
}
