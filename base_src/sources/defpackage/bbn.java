package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bbn {
    public final bjg a;
    public final fc b;
    private final Class c;
    private final List d;
    private final String e;

    public bbn(Class cls, Class cls2, Class cls3, List list, bjg bjgVar, fc fcVar) {
        this.c = cls;
        this.d = list;
        this.a = bjgVar;
        this.b = fcVar;
        String simpleName = cls.getSimpleName();
        String simpleName2 = cls2.getSimpleName();
        String simpleName3 = cls3.getSimpleName();
        int length = String.valueOf(simpleName).length();
        StringBuilder sb = new StringBuilder(length + 23 + String.valueOf(simpleName2).length() + String.valueOf(simpleName3).length());
        sb.append("Failed DecodePath{");
        sb.append(simpleName);
        sb.append("->");
        sb.append(simpleName2);
        sb.append("->");
        sb.append(simpleName3);
        sb.append("}");
        this.e = sb.toString();
    }

    public final bcl a(bae baeVar, int i, int i2, azt aztVar, List list) throws bcg {
        int size = this.d.size();
        bcl bclVarA = null;
        for (int i3 = 0; i3 < size; i3++) {
            azv azvVar = (azv) this.d.get(i3);
            try {
                if (azvVar.b(baeVar.a(), aztVar)) {
                    bclVarA = azvVar.a(baeVar.a(), i, i2, aztVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                list.add(e);
            }
            if (bclVarA != null) {
                break;
            }
        }
        if (bclVarA != null) {
            return bclVarA;
        }
        throw new bcg(this.e, new ArrayList(list));
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        String strValueOf3 = String.valueOf(this.a);
        int length = String.valueOf(strValueOf).length();
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length());
        sb.append("DecodePath{ dataClass=");
        sb.append(strValueOf);
        sb.append(", decoders=");
        sb.append(strValueOf2);
        sb.append(", transcoder=");
        sb.append(strValueOf3);
        sb.append('}');
        return sb.toString();
    }
}
