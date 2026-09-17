package defpackage;

import android.util.Pair;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public final class brd {
    public static final ouj a = ouj.h("com/google/android/apps/camera/activity/util/CaptureDataSerializer");

    public static String a(Object obj) {
        if (obj == null) {
            return "<null>";
        }
        if (obj.getClass().isArray()) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                sb.append(a(Array.get(obj, i)));
                if (i != length - 1) {
                    sb.append(", ");
                }
            }
            sb.append(']');
            return sb.toString();
        }
        if (!(obj instanceof Pair)) {
            return obj.toString();
        }
        Pair pair = (Pair) obj;
        String strA = a(pair.first);
        String strA2 = a(pair.second);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strA).length() + 9 + String.valueOf(strA2).length());
        sb2.append("Pair: ");
        sb2.append(strA);
        sb2.append(" / ");
        sb2.append(strA2);
        return sb2.toString();
    }
}
