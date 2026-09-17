package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class oon {
    Object[] a;
    int b;

    public oon() {
        this(4);
    }

    public oon(int i) {
        this.a = new Object[i + i];
        this.b = 0;
    }

    private final void a(int i) {
        int i2 = i + i;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (i2 > length) {
            this.a = Arrays.copyOf(objArr, ooc.a(length, i2));
        }
    }

    public oor b() {
        return c();
    }

    public oor c() {
        return orw.a(this.b, this.a);
    }

    public void e(Object obj, Object obj2) {
        a(this.b + 1);
        ohh.S(obj, obj2);
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.b = i + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(Iterable iterable) {
        if (iterable instanceof Collection) {
            a(this.b + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            e(entry.getKey(), entry.getValue());
        }
    }
}
