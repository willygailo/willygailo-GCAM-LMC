package defpackage;

import android.content.ContentValues;
import android.graphics.Rect;
import com.google.googlex.gcam.DebugParams;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bxe implements oiu {
    private final /* synthetic */ int u;
    public static final /* synthetic */ bxe t = new bxe(20);
    public static final /* synthetic */ bxe s = new bxe(19);
    public static final /* synthetic */ bxe r = new bxe(17);
    public static final /* synthetic */ bxe q = new bxe(16);
    public static final /* synthetic */ bxe p = new bxe(15);
    public static final /* synthetic */ bxe o = new bxe(14);
    public static final /* synthetic */ bxe n = new bxe(13);
    public static final /* synthetic */ bxe m = new bxe(12);
    public static final /* synthetic */ bxe l = new bxe(11);
    public static final /* synthetic */ bxe k = new bxe(10);
    public static final /* synthetic */ bxe j = new bxe(9);
    public static final /* synthetic */ bxe i = new bxe(8);
    public static final /* synthetic */ bxe h = new bxe(7);
    public static final /* synthetic */ bxe g = new bxe(6);
    public static final /* synthetic */ bxe f = new bxe(5);
    public static final /* synthetic */ bxe e = new bxe(4);
    public static final /* synthetic */ bxe d = new bxe(3);
    public static final /* synthetic */ bxe c = new bxe(2);
    public static final /* synthetic */ bxe b = new bxe(1);
    public static final /* synthetic */ bxe a = new bxe(0);

    public /* synthetic */ bxe(int i2) {
        this.u = i2;
    }

    @Override // defpackage.oiu
    public final Object a(Object obj) {
        switch (this.u) {
            case 0:
                return (bxg) obj;
            case 1:
                return ojc.h(obj);
            case 2:
                return bxg.d;
            case 3:
                return bxg.f;
            case 4:
                return bxg.d;
            case 5:
                lxc lxcVar = (lxc) obj;
                obr.ao(lxcVar);
                poy poyVarM = nuu.e.m();
                long j2 = lxcVar.e;
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                nuu nuuVar = (nuu) poyVarM.b;
                nuuVar.a |= 1;
                nuuVar.d = j2;
                poy poyVarM2 = nuv.e.m();
                float f2 = lxcVar.f;
                if (poyVarM2.c) {
                    poyVarM2.m();
                    poyVarM2.c = false;
                }
                nuv nuvVar = (nuv) poyVarM2.b;
                int i2 = 1 | nuvVar.a;
                nuvVar.a = i2;
                nuvVar.b = f2;
                float f3 = lxcVar.g;
                int i3 = 2 | i2;
                nuvVar.a = i3;
                nuvVar.c = f3;
                float f4 = lxcVar.h;
                nuvVar.a = i3 | 4;
                nuvVar.d = f4;
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                nuu nuuVar2 = (nuu) poyVarM.b;
                nuv nuvVar2 = (nuv) poyVarM2.j();
                nuvVar2.getClass();
                nuuVar2.c = nuvVar2;
                nuuVar2.b = 4;
                return (nuu) poyVarM.j();
            case 6:
                ccm ccmVar = (ccm) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("time", Long.valueOf(ccmVar.b.a()));
                return Long.valueOf(ccmVar.a.insertWithOnConflict("session", null, contentValues, 5));
            case 7:
                opc opcVarD = ope.D();
                oti otiVarListIterator = ((ope) obj).listIterator();
                while (otiVarListIterator.hasNext()) {
                    cej cejVar = (cej) otiVarListIterator.next();
                    if (cejVar.b) {
                        opcVarD.d(cejVar.a);
                    }
                }
                return opcVarD.f();
            case 8:
                return Boolean.valueOf(((hth) obj).equals(hth.EXT_WIRED));
            case 9:
                return Boolean.valueOf(((hth) obj).equals(hth.EXT_BLUETOOTH));
            case 10:
                Rect rect = (Rect) obj;
                return new gsm(rect, rect, -1.0f);
            case 11:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 12:
                return Boolean.valueOf(((hth) obj).equals(hth.EXT_BLUETOOTH));
            case 13:
                return ((nwc) obj).a;
            case 14:
                return Boolean.valueOf(hsr.LONG_SHOT.equals(((hsa) obj).i()));
            case 15:
                int i4 = dfv.i;
                return mip.eu(((bik) obj).c());
            case 16:
                ((oug) ((oug) ((oug) dtz.a.c()).h((CancellationException) obj)).G(925)).o("Photos launch was cancelled");
                return Boolean.FALSE;
            case 17:
                return ((DebugParams) obj).a().a();
            case 18:
                List list = (List) obj;
                Boolean bool = (Boolean) list.get(0);
                if (((Boolean) list.get(1)).booleanValue()) {
                    bool.booleanValue();
                    return 1;
                }
                ((oug) ((oug) eeg.a.c().g(ovl.a, "FalconModule")).G((char) 1096)).o("Turning off due to thermals.");
                return 2;
            case 19:
                return (eez) obj;
            default:
                return Boolean.valueOf(((Float) obj).floatValue() >= 1.2f);
        }
    }
}
