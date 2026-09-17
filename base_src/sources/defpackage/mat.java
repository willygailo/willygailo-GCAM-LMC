package defpackage;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class mat implements Comparable {
    public static final AtomicInteger a = new AtomicInteger(0);
    private final int b;

    public mat() {
    }

    public mat(int i) {
        this.b = i;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        int i = this.b;
        int i2 = ((mat) obj).b;
        if (i == i2) {
            return 0;
        }
        return i >= i2 ? 1 : -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof mat) && this.b == ((mat) obj).b;
    }

    public final int hashCode() {
        return this.b ^ 1000003;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "MediaGroup-%d", Integer.valueOf(this.b));
    }
}
