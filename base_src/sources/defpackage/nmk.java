package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class nmk {
    public static final nmk a = new nmk();
    public final String b;

    public nmk() {
        obr.aG(true, "Android Logging mandates tags be less than 23 characters.");
        this.b = "VisionKit";
    }

    public final String a(String str, Object... objArr) {
        return objArr.length > 0 ? String.format(str, objArr) : str;
    }

    public final String b(Object obj, String str, Object... objArr) {
        String str2;
        String strA = a(str, objArr);
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            String name = obj.getClass().getName();
            if (obj instanceof Class) {
                name = ((Class) obj).getName();
            }
            String[] strArrSplit = name.split("\\.");
            int length = strArrSplit.length;
            str2 = length == 0 ? "" : strArrSplit[length - 1];
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(strA).length());
        sb.append("[");
        sb.append(str2);
        sb.append("] ");
        sb.append(strA);
        return sb.toString();
    }

    public final void c(Object obj, String str, Object... objArr) {
        if (e(6)) {
            Log.e(this.b, b(obj, str, objArr));
        }
    }

    public final void d(Object obj, String str, Object... objArr) {
        if (e(5)) {
            Log.w(this.b, b(obj, str, objArr));
        }
    }

    public final boolean e(int i) {
        return Log.isLoggable(this.b, i);
    }
}
