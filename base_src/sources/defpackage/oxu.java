package defpackage;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class oxu extends oxs {
    private static final Map c;
    private final ovm d;

    static {
        EnumMap enumMap = new EnumMap(ovm.class);
        for (ovm ovmVar : ovm.values()) {
            oxu[] oxuVarArr = new oxu[10];
            for (int i = 0; i < 10; i++) {
                oxuVarArr[i] = new oxu(i, ovmVar, ovn.a);
            }
            enumMap.put(ovmVar, oxuVarArr);
        }
        c = Collections.unmodifiableMap(enumMap);
    }

    private oxu(int i, ovm ovmVar, ovn ovnVar) {
        super(ovnVar, i);
        oxh.x(ovmVar, "format char");
        this.d = ovmVar;
        if (ovnVar.c()) {
            String str = ovmVar.o;
            return;
        }
        int i2 = ovmVar.l;
        i2 = ovnVar.d() ? i2 & 65503 : i2;
        StringBuilder sb = new StringBuilder("%");
        ovnVar.f(sb);
        sb.append((char) i2);
        sb.toString();
    }

    public static oxu b(int i, ovm ovmVar, ovn ovnVar) {
        return (i >= 10 || !ovnVar.c()) ? new oxu(i, ovmVar, ovnVar) : ((oxu[]) c.get(ovmVar))[i];
    }

    @Override // defpackage.oxs
    public final void a(oxt oxtVar, Object obj) {
        oxtVar.a(obj, this.d, this.b);
    }
}
