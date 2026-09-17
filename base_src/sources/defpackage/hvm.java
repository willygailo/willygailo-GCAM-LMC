package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hvm {
    private static final ouj a = ouj.h("com/google/android/apps/camera/settings/util/SettingsUtil");
    private static final EnumMap b = new EnumMap(lwd.class);

    public static lig a(String str, List list, lwd lwdVar) {
        hvl hvlVar;
        if ("1836x3264".equals(str)) {
            return hvk.a;
        }
        ArrayList arrayList = new ArrayList(list);
        EnumMap enumMap = b;
        if (enumMap.get(lwdVar) != null) {
            hvlVar = (hvl) enumMap.get(lwdVar);
        } else {
            hvl hvlVar2 = new hvl();
            Collections.sort(arrayList, new yc(7));
            hvlVar2.a = (lig) arrayList.remove(0);
            lig ligVar = hvlVar2.a;
            float f = ligVar.a / ligVar.b;
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                lig ligVar2 = (lig) arrayList.get(i);
                if (Math.abs((ligVar2.a / ligVar2.b) - f) < 0.01d) {
                    arrayList2.add(ligVar2);
                }
            }
            if (arrayList2.size() >= 2) {
                arrayList = arrayList2;
            }
            if (arrayList.isEmpty()) {
                ((oug) ((oug) a.c()).G((char) 2663)).o("Only one supported resolution.");
                lig ligVar3 = hvlVar2.a;
                hvlVar2.b = ligVar3;
                hvlVar2.c = ligVar3;
            } else if (arrayList.size() == 1) {
                ((oug) ((oug) a.c()).G((char) 2662)).o("Only two supported resolutions.");
                hvlVar2.b = (lig) arrayList.get(0);
                hvlVar2.c = (lig) arrayList.get(0);
            } else if (arrayList.size() == 2) {
                ((oug) ((oug) a.c()).G((char) 2661)).o("Exactly three supported resolutions.");
                hvlVar2.b = (lig) arrayList.get(0);
                hvlVar2.c = (lig) arrayList.get(1);
            } else {
                lig ligVar4 = hvlVar2.a;
                float f2 = ligVar4.a * ligVar4.b;
                int iB = b(arrayList, (int) (0.5f * f2));
                int iB2 = b(arrayList, (int) (f2 * 0.25f));
                if (((lig) arrayList.get(iB)).equals(arrayList.get(iB2))) {
                    if (iB2 < arrayList.size() - 1) {
                        iB2++;
                    } else {
                        iB--;
                    }
                }
                hvlVar2.b = (lig) arrayList.get(iB);
                hvlVar2.c = (lig) arrayList.get(iB2);
            }
            b.put(lwdVar, hvlVar2);
            hvlVar = hvlVar2;
        }
        hvlVar.getClass();
        if ("large".equals(str)) {
            return hvlVar.a;
        }
        if ("medium".equals(str)) {
            return hvlVar.b;
        }
        if ("small".equals(str)) {
            return hvlVar.c;
        }
        if (str != null && str.split("x").length == 2) {
            lig ligVarBr = mip.br(str);
            if (list.contains(ligVarBr)) {
                return ligVarBr;
            }
        }
        return hvlVar.a;
    }

    private static int b(List list, int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        while (i2 < list.size()) {
            lig ligVar = (lig) list.get(i2);
            int iAbs = Math.abs((ligVar.a * ligVar.b) - i);
            int i5 = iAbs < i4 ? iAbs : i4;
            if (iAbs < i4) {
                i3 = i2;
            }
            i2++;
            i4 = i5;
        }
        return i3;
    }
}
