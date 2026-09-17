package j$.sun.nio.cs;

import java.nio.charset.spi.CharsetProvider;

/* JADX INFO: loaded from: classes2.dex */
public abstract class StandardCharsets extends CharsetProvider {
    static String[] aliases_SJIS = {"sjis", "shift_jis", "shift-jis", "ms_kanji", "x-sjis", "csShiftJIS"};
    static String[] aliases_MS932 = {"MS932", "windows-932", "csWindows31J"};

    static String[] aliases_ISO_8859_1() {
        return new String[]{"iso-ir-100", "ISO_8859-1", "latin1", "l1", "IBM819", "cp819", "csISOLatin1", "819", "IBM-819", "ISO8859_1", "ISO_8859-1:1987", "ISO_8859_1", "8859_1", "ISO8859-1"};
    }

    static String[] aliases_US_ASCII() {
        return new String[]{"iso-ir-6", "ANSI_X3.4-1986", "ISO_646.irv:1991", "ASCII", "ISO646-US", "us", "IBM367", "cp367", "csASCII", "default", "646", "iso_646.irv:1983", "ANSI_X3.4-1968", "ascii7"};
    }

    static String[] aliases_UTF_16() {
        return new String[]{"UTF_16", "utf16", "unicode", "UnicodeBig"};
    }

    static String[] aliases_UTF_16BE() {
        return new String[]{"UTF_16BE", "ISO-10646-UCS-2", "X-UTF-16BE", "UnicodeBigUnmarked"};
    }

    static String[] aliases_UTF_16LE() {
        return new String[]{"UTF_16LE", "X-UTF-16LE", "UnicodeLittleUnmarked"};
    }

    static String[] aliases_UTF_8() {
        return new String[]{"UTF8", "unicode-1-1-utf-8"};
    }
}
