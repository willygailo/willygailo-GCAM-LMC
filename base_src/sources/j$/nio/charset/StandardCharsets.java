package j$.nio.charset;

import j$.sun.nio.cs.ISO_8859_1;
import j$.sun.nio.cs.US_ASCII;
import j$.sun.nio.cs.UTF_16;
import j$.sun.nio.cs.UTF_16BE;
import j$.sun.nio.cs.UTF_16LE;
import j$.sun.nio.cs.UTF_8;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class StandardCharsets {
    public static final Charset US_ASCII = US_ASCII.INSTANCE;
    public static final Charset ISO_8859_1 = ISO_8859_1.INSTANCE;
    public static final Charset UTF_8 = UTF_8.INSTANCE;
    public static final Charset UTF_16BE = new UTF_16BE();
    public static final Charset UTF_16LE = new UTF_16LE();
    public static final Charset UTF_16 = new UTF_16();
}
