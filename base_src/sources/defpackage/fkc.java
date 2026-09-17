package defpackage;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public final class fkc {
    public static final Charset a = Charset.forName("UTF-8");
    private static fkc d;
    public final MessageDigest b;
    public final Object c = new Object();

    public fkc(MessageDigest messageDigest) {
        this.b = messageDigest;
    }

    public static fkc a() {
        if (d == null) {
            try {
                d = new fkc(MessageDigest.getInstance("SHA-1"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException("Cannot initialize file name hasher", e);
            }
        }
        return d;
    }
}
