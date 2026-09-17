package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
final class nhl {
    public final int a;
    private final LinkedHashMap b;

    public nhl(int i) {
        this.a = i;
        this.b = new nhk(this, ((i * 4) / 3) + 1);
    }

    public final synchronized Object a(Object obj) {
        return this.b.get(obj);
    }

    public final synchronized void b(Object obj, Object obj2) {
        this.b.put(obj, obj2);
    }
}
