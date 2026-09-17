package defpackage;

import com.mdmitriev.auxlenses.AuxButtonsLayout;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hvg {
    private static final ouj a = ouj.h("com/google/android/apps/camera/settings/resolution/ResolutionSetting");
    private final hub b;
    private final ddf c;
    private final String d;
    private final String e;
    private final lwf f;

    public hvg(hub hubVar, lwf lwfVar, ddf ddfVar) {
        this.b = hubVar;
        this.f = lwfVar;
        this.c = ddfVar;
        String strI = ddfVar.i(ddl.P);
        strI.getClass();
        this.d = strI;
        String strI2 = ddfVar.i(ddl.Q);
        strI2.getClass();
        this.e = strI2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    public final lig a(lvs lvsVar, lwd lwdVar) {
        String str;
        lig ligVarBs;
        boolean z;
        String strSwitchToPicturesize = lwdVar == lwd.FRONT ? "pref_camera_picturesize_front_key" : AuxButtonsLayout.switchToPicturesize();
        if (lwdVar == lwd.BACK) {
            str = this.d;
        } else {
            str = lwdVar == lwd.FRONT ? this.e : "";
        }
        boolean zN = this.b.n(strSwitchToPicturesize);
        if (zN) {
            ligVarBs = mip.br(this.b.e(strSwitchToPicturesize));
            if (ligVarBs != null) {
                String[] strArrSplit = str.split(",");
                if (strArrSplit.length != 0 && mip.eV(ligVarBs, new HashSet(obr.aj(strArrSplit)))) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
        } else {
            ligVarBs = null;
            z = false;
        }
        List listX = fvq.A(lvsVar, this.f, this.c).x(256);
        boolean z2 = ligVarBs != null && ligVarBs.a > 0 && ligVarBs.b > 0 && listX.contains(ligVarBs);
        if (!zN || z || !z2) {
            ligVarBs = mip.bs(mip.eU(listX, str));
            this.b.k(strSwitchToPicturesize, mip.bt(ligVarBs));
            ((oug) ((oug) a.c()).G((char) 2654)).r("Picture size setting is not set. Selecting fallback: %s", ligVarBs);
        }
        ligVarBs.getClass();
        return ligVarBs;
    }

    public final void b(lwd lwdVar) {
        String strSwitchToPicturesize;
        String str;
        lwd lwdVar2 = lwd.FRONT;
        switch (lwdVar) {
            case FRONT:
                strSwitchToPicturesize = "pref_camera_picturesize_front_key";
                break;
            case BACK:
                strSwitchToPicturesize = AuxButtonsLayout.switchToPicturesize();
                break;
            default:
                ((oug) ((oug) a.c()).G((char) 2655)).r("Unsupported facing value: %s", lwdVar);
                return;
        }
        if (this.b.n(strSwitchToPicturesize)) {
            return;
        }
        lvs lvsVarE = this.f.e(lwdVar);
        if (lvsVarE == null) {
            ((oug) ((oug) a.c()).G((char) 2657)).r("Failed to retrieve a camera id for facing: %s", lwdVar);
            return;
        }
        ghx ghxVarA = fvq.A(lvsVarE, this.f, this.c);
        if (lwdVar == lwd.BACK) {
            str = this.d;
        } else {
            str = lwdVar == lwd.FRONT ? this.e : "";
        }
        this.b.k(strSwitchToPicturesize, mip.bt(mip.bs(mip.eU(ghxVarA.x(256), str))));
    }
}
