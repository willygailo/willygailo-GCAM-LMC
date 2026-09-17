package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class owl extends owm {
    private final Map a;

    public owl(ovv ovvVar, ovv ovvVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d(linkedHashMap, ovvVar);
        d(linkedHashMap, ovvVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((ovd) entry.getKey()).b) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.a = Collections.unmodifiableMap(linkedHashMap);
    }

    private static void d(Map map, ovv ovvVar) {
        for (int i = 0; i < ovvVar.b(); i++) {
            ovd ovdVarC = ovvVar.c(i);
            Object obj = map.get(ovdVarC);
            if (ovdVarC.b) {
                List arrayList = (List) obj;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(ovdVarC, arrayList);
                }
                arrayList.add(ovdVarC.d(ovvVar.e(i)));
            } else {
                map.put(ovdVarC, ovdVarC.d(ovvVar.e(i)));
            }
        }
    }

    @Override // defpackage.owm
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.owm
    public final Set b() {
        return this.a.keySet();
    }

    @Override // defpackage.owm
    public final void c(owc owcVar, Object obj) {
        for (Map.Entry entry : this.a.entrySet()) {
            ovd ovdVar = (ovd) entry.getKey();
            Object value = entry.getValue();
            if (ovdVar.b) {
                owcVar.b(ovdVar, ((List) value).iterator(), obj);
            } else {
                owcVar.a(ovdVar, value, obj);
            }
        }
    }
}
