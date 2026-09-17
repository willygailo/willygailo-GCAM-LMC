package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class lii {
    private final lih a;
    private final ArrayList b;
    private int c;
    private int d;

    public lii(lih lihVar, int i) {
        this.a = lihVar;
        this.b = new ArrayList(i);
        this.c = i;
        for (int i2 = 0; i2 < i; i2++) {
            this.b.add(lihVar.a());
        }
        this.d = i;
    }

    public final Object a() {
        int i = this.c;
        if (i <= 0) {
            return this.a.a();
        }
        int i2 = i - 1;
        Object obj = this.b.get(i2);
        this.b.remove(i2);
        this.c--;
        return obj;
    }

    public final void b(Object obj) {
        int i = this.c;
        int i2 = this.d;
        if (i == i2) {
            this.b.ensureCapacity(i2 + i2);
            int i3 = this.d;
            this.d = i3 + i3;
        }
        this.b.add(obj);
        this.c++;
    }
}
