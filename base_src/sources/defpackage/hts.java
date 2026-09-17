package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hts {
    public static final /* synthetic */ int c = 0;
    private static final Map d = new HashMap();
    public final String a;
    final htr b;

    public hts(String str, htr htrVar) {
        this.a = str;
        this.b = htrVar;
        d();
    }

    public hts(String str, final Object obj) {
        this(str, new htr() { // from class: htq
            @Override // defpackage.htr
            public final Object a(ddf ddfVar) {
                Object obj2 = obj;
                int i = hts.c;
                return obj2;
            }
        });
    }

    public static hts a(String str) {
        return (hts) d.get(str);
    }

    private final synchronized void d() {
        Map map = d;
        if (map.containsKey(this.a)) {
            String str = this.a;
            throw new IllegalArgumentException(str.length() != 0 ? "Duplicate setting key for: ".concat(str) : new String("Duplicate setting key for: "));
        }
        map.put(this.a, this);
    }

    public abstract Object b(String str);

    public String c(Object obj) {
        return obj.toString();
    }
}
