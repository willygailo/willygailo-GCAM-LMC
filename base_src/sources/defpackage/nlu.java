package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
final class nlu {
    private static final oxk a = new oxk("/");

    public static String a(String str, String str2) {
        return (str2 == null || str2.isEmpty()) ? "" : String.format(str, str2);
    }

    public static String b(Uri uri) {
        String strA = a("/%s", a.a(uri.getPathSegments()));
        String strA2 = a("?%s", uri.getQuery());
        String strA3 = a("#%s", uri.getFragment());
        StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + String.valueOf(strA2).length() + String.valueOf(strA3).length());
        sb.append(strA);
        sb.append(strA2);
        sb.append(strA3);
        return sb.toString();
    }

    public static boolean c(String str) {
        return str.length() > 25;
    }
}
