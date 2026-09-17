package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class nlh {
    public String a;
    private final pnh b;
    private List c;

    public nlh(pnh pnhVar) {
        this.b = pnhVar;
        if ((pnhVar.a & 16) != 0) {
            pni pniVar = pnhVar.d;
            if (!(pniVar == null ? pni.e : pniVar).d.isEmpty()) {
                pni pniVar2 = pnhVar.d;
                String str = (pniVar2 == null ? pni.e : pniVar2).d;
            }
        }
        String string = "";
        if (pnhVar != null) {
            final HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList(pnhVar.c.size());
            int i = 0;
            for (pnf pnfVar : pnhVar.c) {
                if ((pnfVar.a & 8192) != 0 && !map.containsKey(Integer.valueOf(pnfVar.e))) {
                    map.put(Integer.valueOf(pnfVar.e), Integer.valueOf(i));
                    i++;
                }
                arrayList.add(pnfVar);
            }
            Collections.sort(arrayList, new Comparator() { // from class: nlg
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    HashMap map2 = map;
                    pnf pnfVar2 = (pnf) obj;
                    pnf pnfVar3 = (pnf) obj2;
                    Integer num = (Integer) map2.get(Integer.valueOf((pnfVar2.a & 8192) != 0 ? pnfVar2.e : 0));
                    Integer num2 = (Integer) map2.get(Integer.valueOf((pnfVar3.a & 8192) != 0 ? pnfVar3.e : 0));
                    int iCompareTo = (num == null || num2 == null) ? 0 : num.compareTo(num2);
                    if (iCompareTo != 0) {
                        return iCompareTo;
                    }
                    int i2 = pnfVar2.f;
                    int i3 = pnfVar3.f;
                    if (i2 == i3) {
                        return 0;
                    }
                    return i2 < i3 ? -1 : 1;
                }
            });
            this.c = arrayList;
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < this.c.size(); i2++) {
                String str2 = ((pnf) this.c.get(i2)).d;
                sb.append(str2 == null ? "" : str2);
                if (i2 < this.c.size() - 1) {
                    sb.append(" | ");
                }
            }
            string = sb.toString();
        }
        this.a = string;
    }

    public final List a(int i, int i2) {
        obr.aF(i <= i2);
        obr.aF(i < this.a.length());
        List list = this.c;
        TreeMap treeMap = new TreeMap();
        int length = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            pnf pnfVar = (pnf) list.get(i3);
            for (int i4 = 0; i4 < pnfVar.b.size(); i4++) {
                treeMap.put(Integer.valueOf(length), (pnj) pnfVar.b.get(i4));
                length += ((pnj) pnfVar.b.get(i4)).d.length();
                if (i4 < pnfVar.b.size() - 1) {
                    length++;
                }
            }
            if (i3 < list.size() - 1) {
                length += 3;
            }
        }
        Integer num = (Integer) treeMap.floorKey(Integer.valueOf(i));
        if (num == null) {
            return oom.l();
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : treeMap.tailMap(num).entrySet()) {
            if (i2 <= ((Integer) entry.getKey()).intValue()) {
                if (!arrayList.isEmpty()) {
                    break;
                }
                arrayList.add((pnj) entry.getValue());
                break;
            }
            if (((Integer) entry.getKey()).intValue() + ((pnj) entry.getValue()).d.length() >= i) {
                arrayList.add((pnj) entry.getValue());
            }
        }
        return oom.j(arrayList);
    }
}
