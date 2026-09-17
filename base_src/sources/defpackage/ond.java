package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ond implements Iterable {
    private final ojc a;

    protected ond() {
        this.a = oih.a;
    }

    public ond(Iterable iterable) {
        this.a = ojc.i(iterable);
    }

    public static ond c(Iterable iterable) {
        return iterable instanceof ond ? (ond) iterable : new onb(iterable, iterable);
    }

    public final ojc a(ojf ojfVar) {
        Iterator it = e().iterator();
        it.getClass();
        ojfVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (ojfVar.a(next)) {
                return ojc.i(next);
            }
        }
        return oih.a;
    }

    public final ond b(ojf ojfVar) {
        Iterable iterableE = e();
        ojfVar.getClass();
        return c(new opq(iterableE, ojfVar));
    }

    public final ond d(oiu oiuVar) {
        Iterable iterableE = e();
        oiuVar.getClass();
        return c(new opr(iterableE, oiuVar));
    }

    public final Iterable e() {
        return (Iterable) this.a.e(this);
    }

    public final String toString() {
        Iterator it = e().iterator();
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }
}
