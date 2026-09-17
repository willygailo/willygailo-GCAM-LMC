package defpackage;

import android.content.Context;
import j$.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class hwx {
    private final Supplier a;

    public hwx(final Context context) {
        Supplier supplier = new Supplier() { // from class: hww
            @Override // j$.util.function.Supplier
            public final Object get() {
                return Long.valueOf(hwv.b(context));
            }
        };
        this.a = supplier;
        ((Long) supplier.get()).longValue();
    }

    public final long a() {
        return ((Long) this.a.get()).longValue();
    }

    public final boolean b(long j) {
        return a() >= j;
    }

    public final String toString() {
        long jA = a();
        StringBuilder sb = new StringBuilder(37);
        sb.append("sideline-version=");
        sb.append(jA);
        return sb.toString();
    }
}
