package j$.net;

import j$.lang.DesugarInteger$$ExternalSyntheticBackport1;
import j$.util.Objects;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

/* JADX INFO: loaded from: classes2.dex */
public class URLDecoder {
    static String dfltEncName = URLEncoder.dfltEncName;

    public static String decode(String str, String str2) throws UnsupportedEncodingException {
        if (str2.isEmpty()) {
            throw new UnsupportedEncodingException("URLDecoder: empty string enc parameter");
        }
        try {
            return decode(str, Charset.forName(str2));
        } catch (IllegalCharsetNameException | UnsupportedCharsetException unused) {
            throw new UnsupportedEncodingException(str2);
        }
    }

    public static String decode(String str, Charset charset) {
        Objects.requireNonNull(charset, "Charset");
        int length = str.length();
        StringBuilder sb = new StringBuilder(length > 500 ? length / 2 : length);
        byte[] bArr = null;
        int i = 0;
        boolean z = false;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '%') {
                if (bArr == null) {
                    try {
                        bArr = new byte[(length - i) / 3];
                    } catch (NumberFormatException e) {
                        String strValueOf = String.valueOf(e.getMessage());
                        throw new IllegalArgumentException(strValueOf.length() != 0 ? "URLDecoder: Illegal hex characters in escape (%) pattern - ".concat(strValueOf) : new String("URLDecoder: Illegal hex characters in escape (%) pattern - "));
                    }
                }
                int i2 = 0;
                while (true) {
                    int i3 = i + 2;
                    if (i3 >= length || cCharAt != '%') {
                        break;
                    }
                    int i4 = i + 1;
                    if (isValidHexChar(str.charAt(i4)) && isValidHexChar(str.charAt(i3))) {
                        int i5 = i + 3;
                        int iM = DesugarInteger$$ExternalSyntheticBackport1.m(str, i4, i5, 16);
                        if (iM < 0) {
                            String strValueOf2 = String.valueOf(str.substring(i, i5));
                            throw new IllegalArgumentException(strValueOf2.length() != 0 ? "URLDecoder: Illegal hex characters in escape (%) pattern - negative value : ".concat(strValueOf2) : new String("URLDecoder: Illegal hex characters in escape (%) pattern - negative value : "));
                        }
                        int i6 = i2 + 1;
                        bArr[i2] = (byte) iM;
                        if (i5 < length) {
                            cCharAt = str.charAt(i5);
                        }
                        i2 = i6;
                        i = i5;
                    }
                    String strValueOf3 = String.valueOf(str.substring(i, i + 3));
                    throw new IllegalArgumentException(strValueOf3.length() != 0 ? "URLDecoder: Illegal hex characters in escape (%) pattern : ".concat(strValueOf3) : new String("URLDecoder: Illegal hex characters in escape (%) pattern : "));
                }
                if (i < length && cCharAt == '%') {
                    throw new IllegalArgumentException("URLDecoder: Incomplete trailing escape (%) pattern");
                }
                sb.append(new String(bArr, 0, i2, charset));
            } else if (cCharAt != '+') {
                sb.append(cCharAt);
                i++;
            } else {
                sb.append(' ');
                i++;
            }
            z = true;
        }
        return z ? sb.toString() : str;
    }

    private static boolean isValidHexChar(char c) {
        return ('0' <= c && c <= '9') || ('a' <= c && c <= 'f') || ('A' <= c && c <= 'F');
    }
}
