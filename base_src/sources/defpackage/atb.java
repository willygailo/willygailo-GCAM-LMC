package defpackage;

import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes.dex */
public final class atb {
    private static boolean[] b = new boolean[256];
    private static boolean[] a = new boolean[256];

    static {
        boolean z;
        char c = 0;
        while (true) {
            boolean[] zArr = b;
            int length = zArr.length;
            if (c >= 256) {
                return;
            }
            boolean[] zArr2 = a;
            boolean z2 = true;
            if ((c < 'a' || c > 'z') && ((c < 'A' || c > 'Z') && c != ':' && c != '_' && (c < 192 || c > 214))) {
                z = c >= 216 && c <= 246;
            } else {
                z = true;
            }
            zArr2[c] = z;
            if ((c < 'a' || c > 'z') && ((c < 'A' || c > 'Z') && ((c < '0' || c > '9') && c != ':' && c != '_' && c != '-' && c != '.' && c != 183 && ((c < 192 || c > 214) && (c < 216 || c > 246))))) {
                z2 = false;
            }
            zArr[c] = z2;
            c = (char) (c + 1);
        }
    }

    public static String a(String str) {
        if ("x-default".equals(str)) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i = 1;
        for (int i2 = 0; i2 < str.length(); i2++) {
            switch (str.charAt(i2)) {
                case ' ':
                    break;
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                    stringBuffer.append('-');
                    i++;
                    break;
                default:
                    if (i != 2) {
                        stringBuffer.append(Character.toLowerCase(str.charAt(i2)));
                    } else {
                        stringBuffer.append(Character.toUpperCase(str.charAt(i2)));
                    }
                    break;
            }
        }
        return stringBuffer.toString();
    }

    static String b(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        for (int i = 0; i < stringBuffer.length(); i++) {
            if (d(stringBuffer.charAt(i))) {
                stringBuffer.setCharAt(i, ' ');
            }
        }
        return stringBuffer.toString();
    }

    static boolean c(String str) {
        if (str != null) {
            int i = 0;
            boolean z = true;
            int i2 = 0;
            while (i < str.length()) {
                if (str.charAt(i) == '-') {
                    i2++;
                    z = z && (i == 8 || i == 13 || i == 18 || i == 23);
                }
                i++;
            }
            if (z && i2 == 4 && i == 36) {
                return true;
            }
        }
        return false;
    }

    static boolean d(char c) {
        if (c > 31) {
            if (c != 127) {
                return false;
            }
            c = 127;
        }
        return (c == '\t' || c == '\n' || c == '\r') ? false : true;
    }

    public static boolean e(String str) {
        if (str.length() > 0 && !j(str.charAt(0))) {
            return false;
        }
        int i = 1;
        while (i < str.length()) {
            if (!i(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean f(String str) {
        int i;
        if (str.length() <= 0) {
            i = 1;
        } else {
            if (!j(str.charAt(0)) || str.charAt(0) == ':') {
                return false;
            }
            i = 1;
        }
        while (i < str.length()) {
            if (!i(str.charAt(i)) || str.charAt(i) == ':') {
                return false;
            }
            i++;
        }
        return true;
    }

    public static String[] g(String str) {
        int iIndexOf = str.indexOf(61);
        String strSubstring = str.substring(str.charAt(1) == '?' ? 2 : 1, iIndexOf);
        int i = iIndexOf + 1;
        char cCharAt = str.charAt(i);
        int i2 = i + 1;
        int length = str.length() - 2;
        StringBuffer stringBuffer = new StringBuffer(length - iIndexOf);
        while (i2 < length) {
            stringBuffer.append(str.charAt(i2));
            i2++;
            if (str.charAt(i2) == cCharAt) {
                i2++;
            }
        }
        return new String[]{strSubstring, stringBuffer.toString()};
    }

    public static String h(String str, boolean z) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '<' && cCharAt != '>' && cCharAt != '&' && cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r') {
                if (z && cCharAt == '\"') {
                    z = true;
                }
            }
            StringBuffer stringBuffer = new StringBuffer((str.length() * 4) / 3);
            for (int i2 = 0; i2 < str.length(); i2++) {
                char cCharAt2 = str.charAt(i2);
                if (cCharAt2 != '\t' && cCharAt2 != '\n' && cCharAt2 != '\r') {
                    switch (cCharAt2) {
                        case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                            stringBuffer.append(true != z ? "\"" : "&quot;");
                            break;
                        case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                            stringBuffer.append("&amp;");
                            break;
                        case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                            stringBuffer.append("&lt;");
                            break;
                        case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                            stringBuffer.append("&gt;");
                            break;
                        default:
                            stringBuffer.append(cCharAt2);
                            break;
                    }
                } else {
                    stringBuffer.append("&#x");
                    stringBuffer.append(Integer.toHexString(cCharAt2).toUpperCase());
                    stringBuffer.append(';');
                }
            }
            return stringBuffer.toString();
        }
        return str;
    }

    private static boolean i(char c) {
        return c > 255 || b[c];
    }

    private static boolean j(char c) {
        return c > 255 || a[c];
    }
}
