package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class dhf {
    public final jrl a;
    public int c;
    public final int d;
    public final Map b = new HashMap();
    private final Map e = new HashMap();

    public dhf(jrl jrlVar, int i) {
        this.a = jrlVar;
        this.d = i;
    }

    final pcd a() {
        if (this.d == 2) {
            oxh.g(new ouk() { // from class: dhe
                @Override // defpackage.ouk
                public final Object a() {
                    dhf dhfVar = this.a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(String.format("REPORT %d %d %d", Integer.valueOf(dhfVar.d - 1), Integer.valueOf(dhfVar.a.t), Integer.valueOf(dhfVar.c)));
                    Iterator it = dhfVar.b.keySet().iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Integer) it.next()).intValue();
                        Map map = dhfVar.b;
                        Integer numValueOf = Integer.valueOf(iIntValue);
                        fcr fcrVar = (fcr) map.get(numValueOf);
                        sb.append(String.format(" [%d %d]", numValueOf, Integer.valueOf(fcrVar.d + fcrVar.b + fcrVar.c + fcrVar.a)));
                    }
                    return sb;
                }
            });
        }
        poy poyVarM = pcd.i.m();
        int i = this.a.t;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pcd pcdVar = (pcd) poyVarM.b;
        int i2 = pcdVar.a | 1;
        pcdVar.a = i2;
        pcdVar.b = i;
        pcdVar.c = this.d - 1;
        int i3 = i2 | 2;
        pcdVar.a = i3;
        pcdVar.d = 1;
        int i4 = i3 | 4;
        pcdVar.a = i4;
        int i5 = this.c;
        int i6 = i4 | 8;
        pcdVar.a = i6;
        pcdVar.e = i5;
        pcdVar.a = i6 | 16;
        pcdVar.h = 1;
        Iterator it = this.b.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            fcr fcrVar = (fcr) this.b.get(Integer.valueOf(iIntValue));
            poy poyVarM2 = pcb.g.m();
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            pcb pcbVar = (pcb) poyVarM2.b;
            int i7 = pcbVar.a | 1;
            pcbVar.a = i7;
            pcbVar.b = iIntValue;
            int i8 = fcrVar.d;
            int i9 = i7 | 2;
            pcbVar.a = i9;
            pcbVar.c = i8;
            int i10 = fcrVar.b;
            int i11 = i9 | 4;
            pcbVar.a = i11;
            pcbVar.d = i10;
            int i12 = fcrVar.c;
            int i13 = i11 | 8;
            pcbVar.a = i13;
            pcbVar.e = i12;
            int i14 = fcrVar.a;
            pcbVar.a = i13 | 16;
            pcbVar.f = i14;
            pcb pcbVar2 = (pcb) poyVarM2.j();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pcd pcdVar2 = (pcd) poyVarM.b;
            pcbVar2.getClass();
            ppm ppmVar = pcdVar2.f;
            if (!ppmVar.c()) {
                pcdVar2.f = ppd.B(ppmVar);
            }
            pcdVar2.f.add(pcbVar2);
        }
        Iterator it2 = this.e.keySet().iterator();
        while (it2.hasNext()) {
            int iIntValue2 = ((Integer) it2.next()).intValue();
            poy poyVarM3 = pcc.d.m();
            if (poyVarM3.c) {
                poyVarM3.m();
                poyVarM3.c = false;
            }
            pcc pccVar = (pcc) poyVarM3.b;
            pccVar.a |= 1;
            pccVar.b = iIntValue2;
            int iIntValue3 = ((Integer) this.e.get(Integer.valueOf(iIntValue2))).intValue();
            if (poyVarM3.c) {
                poyVarM3.m();
                poyVarM3.c = false;
            }
            pcc pccVar2 = (pcc) poyVarM3.b;
            pccVar2.a |= 2;
            pccVar2.c = iIntValue3;
            pcc pccVar3 = (pcc) poyVarM3.j();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pcd pcdVar3 = (pcd) poyVarM.b;
            pccVar3.getClass();
            ppm ppmVar2 = pcdVar3.g;
            if (!ppmVar2.c()) {
                pcdVar3.g = ppd.B(ppmVar2);
            }
            pcdVar3.g.add(pccVar3);
        }
        return (pcd) poyVarM.j();
    }
}
