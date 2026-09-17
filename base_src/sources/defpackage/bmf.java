package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public final class bmf {
    public static final char[] a = "0123456789abcdef".toCharArray();
    public static final char[] b = new char[64];
    private static volatile Handler c;

    private bmf() {
    }

    public static int a(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException e) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        String strValueOf = String.valueOf(bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        String strValueOf2 = String.valueOf(bitmap.getConfig());
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 66 + String.valueOf(strValueOf2).length());
        sb.append("Cannot obtain size for recycled Bitmap: ");
        sb.append(strValueOf);
        sb.append("[");
        sb.append(width);
        sb.append("x");
        sb.append(height);
        sb.append("] ");
        sb.append(strValueOf2);
        throw new IllegalStateException(sb.toString());
    }

    public static int b(int i, int i2, Bitmap.Config config) {
        int i3;
        int i4 = i * i2;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        switch (bme.a[config.ordinal()]) {
            case 1:
                i3 = 1;
                break;
            case 2:
            case 3:
                i3 = 2;
                break;
            case 4:
                i3 = 8;
                break;
            default:
                i3 = 4;
                break;
        }
        return i4 * i3;
    }

    public static int c(float f) {
        return d(Float.floatToIntBits(f), 17);
    }

    public static int d(int i, int i2) {
        return (i2 * 31) + i;
    }

    public static int e(Object obj, int i) {
        return d(obj == null ? 0 : obj.hashCode(), i);
    }

    public static Handler f() {
        if (c == null) {
            synchronized (bmf.class) {
                if (c == null) {
                    c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return c;
    }

    public static List g(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Queue h(int i) {
        return new ArrayDeque(i);
    }

    public static void i() {
        if (!n()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static void j(Runnable runnable) {
        f().post(runnable);
    }

    public static boolean k(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj instanceof bfb ? ((bfb) obj).a() : obj.equals(obj2);
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean m() {
        return !n();
    }

    public static boolean n() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean o(int i, int i2) {
        return p(i) && p(i2);
    }

    private static boolean p(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }
}
