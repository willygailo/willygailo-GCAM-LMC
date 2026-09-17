package defpackage;

import android.net.Uri;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class nmi {
    private static final Pattern a = Pattern.compile("/{2,}");

    public static Uri a(String str) {
        String strReplace = str.replace(" ", "");
        if (!ojy.a(strReplace)) {
            String strValueOf = String.valueOf(strReplace);
            strReplace = strValueOf.length() != 0 ? "http://".concat(strValueOf) : new String("http://");
        }
        Uri uri = Uri.parse(strReplace);
        String authority = uri.getAuthority();
        return (authority == null || authority.isEmpty()) ? Uri.EMPTY : new Uri.Builder().scheme(uri.getScheme().toLowerCase()).encodedAuthority(authority).encodedPath(a.matcher(uri.getEncodedPath()).replaceAll("/")).encodedQuery(uri.getEncodedQuery()).encodedFragment(uri.getEncodedFragment()).build();
    }
}
