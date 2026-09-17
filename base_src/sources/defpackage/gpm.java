package defpackage;

import com.google.android.apps.camera.stats.ViewfinderJankSession;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class gpm implements pys {
    private final qkg a;
    private final /* synthetic */ int b;

    public gpm(qkg qkgVar, int i) {
        this.b = i;
        this.a = qkgVar;
    }

    public static gpm a(qkg qkgVar) {
        return new gpm(qkgVar, 0);
    }

    public static gpm b(qkg qkgVar) {
        return new gpm(qkgVar, 1);
    }

    public static gpm c(qkg qkgVar) {
        return new gpm(qkgVar, 2);
    }

    public static gpm d(qkg qkgVar) {
        return new gpm(qkgVar, 6);
    }

    public static gpm e(qkg qkgVar) {
        return new gpm(qkgVar, 7);
    }

    public static gpm f(qkg qkgVar) {
        return new gpm(qkgVar, 8);
    }

    public static gpm g(qkg qkgVar) {
        return new gpm(qkgVar, 9);
    }

    public static gpm h(qkg qkgVar) {
        return new gpm(qkgVar, 10);
    }

    public static gpm i(qkg qkgVar) {
        return new gpm(qkgVar, 11);
    }

    public static gpm j(qkg qkgVar) {
        return new gpm(qkgVar, 12);
    }

    public static gpm k(qkg qkgVar) {
        return new gpm(qkgVar, 14);
    }

    public static gpm l(qkg qkgVar) {
        return new gpm(qkgVar, 15);
    }

    public static gpm m(qkg qkgVar) {
        return new gpm(qkgVar, 16);
    }

    public static gpm n(qkg qkgVar) {
        return new gpm(qkgVar, 17);
    }

    public static gpm o(qkg qkgVar) {
        return new gpm(qkgVar, 18);
    }

    public static gpm p(qkg qkgVar) {
        return new gpm(qkgVar, 19);
    }

    public static gpm q(qkg qkgVar) {
        return new gpm(qkgVar, 20);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        long j = 0;
        switch (this.b) {
            case 0:
                ojc ojcVar = (ojc) this.a.get();
                Object objH = ojcVar.g() ? ope.H((eav) ojcVar.c()) : orx.a;
                qmd.ae(objH);
                return objH;
            case 1:
                return new gns((lij) this.a.get());
            case 2:
                Object objH2 = !((Map) this.a.get()).isEmpty() ? ope.H(gpo.a) : orx.a;
                qmd.ae(objH2);
                return objH2;
            case 3:
                return ojc.i((hdz) this.a.get());
            case 4:
                ojc ojcVar2 = (ojc) this.a.get();
                Object objH3 = ojcVar2.g() ? ope.H((eav) ojcVar2.c()) : orx.a;
                qmd.ae(objH3);
                return objH3;
            case 5:
                return (lco) ((ojj) ((evv) this.a).a()).a;
            case 6:
                ojc ojcVar3 = (ojc) this.a.get();
                obr.aF(ojcVar3.g());
                return (lnx) ojcVar3.c();
            case 7:
                return gqe.a((Map) this.a.get());
            case 8:
                return gqe.b((Map) this.a.get());
            case 9:
                Map map = (Map) this.a.get();
                EnumMap enumMap = new EnumMap(hdr.class);
                oti otiVarListIterator = gqe.a.listIterator();
                while (otiVarListIterator.hasNext()) {
                    hdr hdrVar = (hdr) otiVarListIterator.next();
                    lnx lnxVar = (lnx) map.get(hdrVar);
                    if (lnxVar != null) {
                        enumMap.put(hdrVar, lnxVar);
                    }
                }
                return enumMap;
            case 10:
                return gqe.c((Map) this.a.get());
            case 11:
                return gqe.d((Map) this.a.get());
            case 12:
                return gqe.e((Map) this.a.get());
            case 13:
                return ojc.i(((haa) this.a).get());
            case 14:
                return new grt(((pyw) this.a).get());
            case 15:
                return new grv((ViewfinderJankSession) this.a.get());
            case 16:
                return new grw((ViewfinderJankSession) this.a.get());
            case 17:
                ddf ddfVar = (ddf) this.a.get();
                if (ddfVar.k(ddl.Y)) {
                    ddfVar.k(dds.y);
                }
                ddfVar.k(dds.Q);
                ddfVar.d();
                return 0L;
            case 18:
                ddf ddfVar2 = (ddf) this.a.get();
                if (ddfVar2.k(ddl.Y)) {
                    ddi ddiVar = ddr.a;
                    ddfVar2.d();
                    j = 259;
                }
                return Long.valueOf(j);
            case 19:
                return new lnt(1, new ArrayList((Set) this.a.get()));
            default:
                ojc ojcVarA = ((cjc) this.a).a();
                Object objH4 = ojcVarA.g() ? ope.H((gjm) ojcVarA.c()) : orx.a;
                qmd.ae(objH4);
                return objH4;
        }
    }
}
