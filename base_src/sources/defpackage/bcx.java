package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class bcx {
    final Object a;
    public List b;
    bcx c;
    bcx d;

    bcx() {
        this(null);
    }

    public bcx(Object obj) {
        this.d = this;
        this.c = this;
        this.a = obj;
    }

    public final int a() {
        List list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final Object b() {
        int iA = a();
        if (iA > 0) {
            return this.b.remove(iA - 1);
        }
        return null;
    }
}
