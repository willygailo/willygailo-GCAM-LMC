package defpackage;

import android.util.ArrayMap;
import android.util.ArraySet;

/* JADX INFO: loaded from: classes2.dex */
final class maj implements mai {
    public final ArrayMap a = new ArrayMap();

    /* JADX WARN: Code duplicated, block: B:36:0x0114  */
    public maj(max maxVar, boolean z) {
        opm opmVarP;
        opc opcVarD = ope.D();
        opcVarD.i(maxVar.e);
        opcVarD.i(maxVar.f);
        ope opeVarF = opcVarD.f();
        int i = 1;
        if (opeVarF.size() == 1) {
            return;
        }
        ArraySet arraySet = new ArraySet(opeVarF.size());
        ArraySet arraySet2 = new ArraySet(opeVarF.size());
        oti otiVarListIterator = opeVarF.listIterator();
        while (otiVarListIterator.hasNext()) {
            mam mamVar = (mam) otiVarListIterator.next();
            String str = mamVar.e.i().d;
            String strValueOf = String.valueOf(mamVar.e.i().a);
            String str2 = mamVar.e.i().b;
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 1 + str2.length());
            sb.append(strValueOf);
            sb.append("|");
            sb.append(str2);
            String string = sb.toString();
            if (!arraySet.add(str) || !arraySet2.add(string)) {
                break;
            }
        }
        if (arraySet.size() == opeVarF.size() && arraySet2.size() == opeVarF.size()) {
            return;
        }
        if (!z) {
            ArraySet arraySet3 = new ArraySet(opeVarF.size());
            oti otiVarListIterator2 = opeVarF.listIterator();
            while (otiVarListIterator2.hasNext()) {
                mam mamVar2 = (mam) otiVarListIterator2.next();
                String str3 = mamVar2.c;
                String str4 = mamVar2.e.i().d;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + str4.length());
                sb2.append(str3);
                sb2.append("|");
                sb2.append(str4);
                if (!arraySet3.add(sb2.toString())) {
                    break;
                }
            }
            if (arraySet3.size() == opeVarF.size()) {
                return;
            }
        }
        cdg cdgVar = cdg.t;
        if (obr.z(cdgVar, opeVarF) && (opeVarF instanceof opm)) {
            opmVarP = (opm) opeVarF;
            if (opmVarP.gI()) {
                Object[] objArrX = ohh.x(opeVarF);
                opmVarP = opm.P(cdgVar, objArrX.length, objArrX);
            }
        } else {
            Object[] objArrX2 = ohh.x(opeVarF);
            opmVarP = opm.P(cdgVar, objArrX2.length, objArrX2);
        }
        oti otiVarListIterator3 = opmVarP.listIterator();
        mam mamVar3 = null;
        while (otiVarListIterator3.hasNext()) {
            mam mamVar4 = (mam) otiVarListIterator3.next();
            if (mamVar3 != null && (mamVar3.b != mamVar4.b || ((ohh.b(mamVar3.c, mamVar4.c) && ohh.b(mamVar3.e.i().d, mamVar4.e.i().d)) || (z && !ohh.b(mamVar3.c, mamVar4.c))))) {
                i++;
            }
            this.a.put(mamVar4, Integer.valueOf(i));
            mamVar3 = mamVar4;
        }
    }
}
