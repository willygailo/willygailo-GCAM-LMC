package defpackage;

import java.util.Comparator;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class lyv {
    public final lyj a;
    public final TreeMap b;

    public lyv(lyj lyjVar) {
        this.a = lyjVar;
        lyd[] lydVarArr = ((lyk) lyjVar).b;
        Comparator[] comparatorArr = new Comparator[lydVarArr.length];
        for (int i = 0; i < lydVarArr.length; i++) {
            Class cls = lydVarArr[i].b;
            if (cls == String.class) {
                comparatorArr[i] = cdg.q;
            } else if (cls == Integer.class) {
                comparatorArr[i] = cdg.r;
            } else if (cls == Boolean.class) {
                comparatorArr[i] = cdg.s;
            }
        }
        this.b = new TreeMap(new lyf(comparatorArr));
    }

    public final String a() {
        return ((lyk) this.a).a;
    }

    public final lyd[] b() {
        return ((lyk) this.a).b;
    }
}
