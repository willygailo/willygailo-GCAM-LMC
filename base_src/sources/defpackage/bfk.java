package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class bfk implements bfg {
    private final List a;
    private final fc b;

    public bfk(List list, fc fcVar) {
        this.a = list;
        this.b = fcVar;
    }

    @Override // defpackage.bfg
    public final bff a(Object obj, int i, int i2, azt aztVar) {
        bff bffVarA;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        azp azpVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            bfg bfgVar = (bfg) this.a.get(i3);
            if (bfgVar.b(obj) && (bffVarA = bfgVar.a(obj, i, i2, aztVar)) != null) {
                azpVar = bffVarA.a;
                arrayList.add(bffVarA.c);
            }
        }
        if (arrayList.isEmpty() || azpVar == null) {
            return null;
        }
        return new bff(azpVar, new bfj(arrayList, this.b));
    }

    @Override // defpackage.bfg
    public final boolean b(Object obj) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((bfg) it.next()).b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String string = Arrays.toString(this.a.toArray());
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 31);
        sb.append("MultiModelLoader{modelLoaders=");
        sb.append(string);
        sb.append('}');
        return sb.toString();
    }
}
