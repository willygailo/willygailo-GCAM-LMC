package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import com.Helper;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes2.dex */
public final class hdn implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;
    private final qkg g;
    private final qkg h;
    private final qkg i;
    private final qkg j;
    private final qkg k;
    private final qkg l;
    private final qkg m;
    private final qkg n;

    public hdn(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, qkg qkgVar12, qkg qkgVar13, qkg qkgVar14) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
        this.g = qkgVar7;
        this.h = qkgVar8;
        this.i = qkgVar9;
        this.j = qkgVar10;
        this.k = qkgVar11;
        this.l = qkgVar12;
        this.m = qkgVar13;
        this.n = qkgVar14;
    }

    public static hdn a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, qkg qkgVar12, qkg qkgVar13, qkg qkgVar14) {
        return new hdn(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, qkgVar9, qkgVar10, qkgVar11, qkgVar12, qkgVar13, qkgVar14);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        jrl jrlVar = ((giv) this.a).get();
        qkg qkgVar = this.b;
        qkg qkgVar2 = this.c;
        qkg qkgVar3 = this.d;
        qkg qkgVar4 = this.e;
        qkg qkgVar5 = this.f;
        qkg qkgVar6 = this.g;
        qkg qkgVar7 = this.h;
        qkg qkgVar8 = this.i;
        qkg qkgVar9 = this.j;
        lco lcoVar = ((imz) this.k).get();
        ghx ghxVar = ((gjo) this.l).get();
        ddf ddfVar = (ddf) this.m.get();
        hvj hvjVar = (hvj) this.n.get();
        EnumMap enumMap = new EnumMap(hdr.class);
        if (Helper.sC2API == 0) {
            if (jrlVar.ordinal() != 12) {
                enumMap.put(hdr.VIEWFINDER, (lnz) qkgVar9.get());
                enumMap.put(hdr.RAW_HDRPLUS, (lnz) qkgVar.get());
                enumMap.put(hdr.YUV_LARGE, (lnz) qkgVar5.get());
            } else {
                enumMap.put(hdr.RAW_HDRPLUS, (lnz) qkgVar.get());
                enumMap.put(hdr.YUV_LARGE, (lnz) qkgVar5.get());
                enumMap.put(hdr.YUV_ANALYSIS, (lnz) qkgVar8.get());
            }
            return enumMap;
        }
        enumMap.put(hdr.VIEWFINDER, (lnz) qkgVar9.get());
        switch (jrlVar.ordinal()) {
            case 6:
                if (ghxVar.L() && ddfVar.k(ddl.aR) && ddfVar.k(ddx.w) && ghxVar.k() == lwd.BACK) {
                    enumMap.put(hdr.RAW_WIDE, (lnz) qkgVar2.get());
                    if (!((Boolean) ((lce) lcoVar).d).booleanValue()) {
                        if (((ojc) qkgVar4.get()).g()) {
                            enumMap.put(hdr.RAW_TELE, (lnz) ((ojc) qkgVar4.get()).c());
                        } else {
                            enumMap.put(hdr.RAW_TELE, (lnz) ((ojc) qkgVar3.get()).c());
                        }
                    }
                } else {
                    enumMap.put(hdr.RAW_HDRPLUS, (lnz) qkgVar.get());
                }
                if (ghxVar.k() == lwd.BACK && ddfVar.k(ddx.sh)) {
                    enumMap.put(hdr.PD, (lnz) qkgVar6.get());
                }
                if ((ddfVar.k(dde.f) && ghxVar.k() == lwd.BACK) || ddfVar.k(ddm.am)) {
                    enumMap.put(hdr.YUV_ANALYSIS, (lnz) qkgVar8.get());
                } else {
                    ddi ddiVar = ddl.a;
                    ddfVar.d();
                }
                break;
            case 7:
                enumMap.put(hdr.YUV_LARGE, (lnz) qkgVar5.get());
                break;
            case 12:
                fvq.n(enumMap, qkgVar, qkgVar2, qkgVar3, qkgVar4, ghxVar, ddfVar);
                enumMap.put(hdr.YUV_ANALYSIS, (lnz) qkgVar8.get());
                if (ddfVar.k(ddq.e)) {
                    enumMap.put(hdr.YUV_LARGE, (lnz) qkgVar5.get());
                    enumMap.remove(hdr.VIEWFINDER);
                }
                break;
            default:
                if (ddfVar.k(ddl.aS)) {
                    enumMap.put(hdr.YUV_LARGE, (lnz) qkgVar5.get());
                }
                fvq.n(enumMap, qkgVar, qkgVar2, qkgVar3, qkgVar4, ghxVar, ddfVar);
                if (ddfVar.k(ddr.i) && ddfVar.k(ddr.h)) {
                    enumMap.put(hdr.YUV_ANALYSIS, (lnz) qkgVar8.get());
                } else if (ghxVar.k() == lwd.BACK) {
                    if (!ddfVar.j(dec.b)) {
                        ddg ddgVar = dea.a;
                        ddfVar.c();
                    }
                    enumMap.put(hdr.YUV_ANALYSIS, (lnz) qkgVar8.get());
                } else {
                    ddi ddiVar2 = dee.a;
                    ddfVar.d();
                }
                if (ghxVar.k() == lwd.BACK) {
                    if (hvjVar.b()) {
                        enumMap.put(hdr.PD, (lnz) qkgVar6.get());
                    }
                } else if (hvjVar.a()) {
                    for (int i : (int[]) ghxVar.m(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES, new int[0])) {
                        if (i == 8) {
                            enumMap.put(hdr.DEPTH, (lnz) qkgVar7.get());
                        }
                    }
                }
                break;
        }
        return enumMap;
    }
}
