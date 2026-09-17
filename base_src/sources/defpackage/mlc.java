package defpackage;

import j$.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
public final class mlc {
    static {
        ovk.h("Mp4BoxSlices");
    }

    public static byte[] a(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.US_ASCII);
        if (bytes.length == 4) {
            return bytes;
        }
        StringBuilder sb = new StringBuilder(str.length() + 27);
        sb.append("Type \"");
        sb.append(str);
        sb.append("\" is not 4 characters");
        throw new IllegalArgumentException(sb.toString());
    }
}
