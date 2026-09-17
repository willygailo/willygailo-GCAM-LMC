package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class nje {
    private static final Pattern a = Pattern.compile("(\\w+).*");

    public static oom a(Uri uri) {
        ooh oohVarE = oom.e();
        String encodedFragment = uri.getEncodedFragment();
        oom oomVarL = (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) ? oom.l() : oom.i(ojq.d("+").a().e(encodedFragment.substring(10)));
        int size = oomVarL.size();
        for (int i = 0; i < size; i++) {
            String str = (String) oomVarL.get(i);
            Matcher matcher = a.matcher(str);
            if (!matcher.matches()) {
                String strValueOf = String.valueOf(str);
                throw new IllegalArgumentException(strValueOf.length() != 0 ? "Invalid fragment spec: ".concat(strValueOf) : new String("Invalid fragment spec: "));
            }
            oohVarE.g(matcher.group(1));
        }
        return oohVarE.f();
    }

    public static String b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        String strValueOf = String.valueOf(oxk.e("+").a(list));
        return strValueOf.length() != 0 ? "transform=".concat(strValueOf) : new String("transform=");
    }
}
