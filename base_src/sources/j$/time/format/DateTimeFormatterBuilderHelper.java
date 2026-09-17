package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
abstract class DateTimeFormatterBuilderHelper {
    private static String rewriteIcuDateTimePattern(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int i = 0;
        char c = ' ';
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ') {
                if (cCharAt != 'B' && cCharAt != 'b') {
                    sb.append(cCharAt);
                }
            } else if (i == 0 || (c != 'B' && c != 'b')) {
                sb.append(cCharAt);
            }
            i++;
            c = cCharAt;
        }
        int length = sb.length() - 1;
        if (length >= 0 && sb.charAt(length) == ' ') {
            sb.deleteCharAt(length);
        }
        return sb.toString();
    }

    static String transformAndroidJavaTextDateTimePattern(String str) {
        if (str == null) {
            return null;
        }
        return ((str.indexOf(66) != -1) || (str.indexOf(98) != -1)) ? rewriteIcuDateTimePattern(str) : str;
    }
}
