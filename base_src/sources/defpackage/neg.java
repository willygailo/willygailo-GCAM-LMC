package defpackage;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class neg {
    private static final wy a = new wy();

    public static synchronized Uri a(String str) {
        Uri uri;
        wy wyVar = a;
        uri = (Uri) wyVar.get(str);
        if (uri == null) {
            String strValueOf = String.valueOf(Uri.encode(str));
            uri = Uri.parse(strValueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(strValueOf) : new String("content://com.google.android.gms.phenotype/"));
            wyVar.put(str, uri);
        }
        return uri;
    }

    public static String b(Context context, String str) {
        if (str.contains("#")) {
            String strValueOf = String.valueOf(str);
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "The passed in package cannot already have a subpackage: ".concat(strValueOf) : new String("The passed in package cannot already have a subpackage: "));
        }
        String packageName = context.getPackageName();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(packageName).length());
        sb.append(str);
        sb.append("#");
        sb.append(packageName);
        return sb.toString();
    }
}
