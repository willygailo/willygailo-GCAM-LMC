package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class w implements Serializable {
    private static final long serialVersionUID = 1;
    public boolean a = false;
    public final List b = new ArrayList();

    public final void a(v vVar) {
        String str = vVar.a;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (str.equals(((v) it.next()).a)) {
                String strValueOf = String.valueOf(str);
                throw new IllegalArgumentException(strValueOf.length() != 0 ? "Duplicate keyword: ".concat(strValueOf) : new String("Duplicate keyword: "));
            }
        }
        this.b.add(vVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (v vVar : this.b) {
            if (sb.length() != 0) {
                sb.append(";  ");
            }
            sb.append(vVar);
        }
        return sb.toString();
    }
}
