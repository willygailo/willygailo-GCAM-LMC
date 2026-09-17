package defpackage;

import android.graphics.PorterDuff;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class xe {
    private final LinkedHashMap a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    public xe() {
        this(6);
    }

    public xe(int i) {
        this.c = i;
        this.a = new LinkedHashMap(0, 0.75f, true);
    }

    public static int c(int i, PorterDuff.Mode mode) {
        return ((i + 31) * 31) + mode.hashCode();
    }

    public final Object a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            Object obj2 = this.a.get(obj);
            if (obj2 != null) {
                this.f++;
                return obj2;
            }
            this.g++;
            return null;
        }
    }

    public final Object b(Object obj, Object obj2) {
        Object objPut;
        if (obj == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.d++;
            this.b++;
            objPut = this.a.put(obj, obj2);
            if (objPut != null) {
                this.b--;
            }
        }
        int i = this.c;
        while (true) {
            synchronized (this) {
                if (this.b < 0 || (this.a.isEmpty() && this.b != 0)) {
                    break;
                }
                if (this.b > i && !this.a.isEmpty()) {
                    Map.Entry entry = (Map.Entry) this.a.entrySet().iterator().next();
                    Object key = entry.getKey();
                    entry.getValue();
                    this.a.remove(key);
                    this.b--;
                    this.e++;
                }
                return objPut;
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f;
        i2 = this.g + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.c), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}
