package defpackage;

import android.os.Parcelable;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hsp implements Comparable, Parcelable {
    private static final AtomicInteger b = new AtomicInteger(0);
    public final int a;

    public hsp() {
    }

    public hsp(int i) {
        this.a = i;
    }

    public static hsp a() {
        return new hso(b.getAndIncrement());
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        int i = this.a;
        int i2 = ((hsp) obj).a;
        if (i == i2) {
            return 0;
        }
        return i >= i2 ? 1 : -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof hsp) && this.a == ((hsp) obj).a;
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "ShotId-%d", Integer.valueOf(this.a));
    }
}
