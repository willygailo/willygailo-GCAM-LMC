package defpackage;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
final class oyp extends oyh implements Serializable {
    private final MessageDigest a;
    private final int b;
    private final boolean c;
    private final String d;

    public oyp() {
        MessageDigest messageDigestB = b("SHA-256");
        this.a = messageDigestB;
        this.b = messageDigestB.getDigestLength();
        this.d = "Hashing.sha256()";
        this.c = c(messageDigestB);
    }

    public oyp(String str, int i) {
        this.d = "Hashing.sha256()";
        MessageDigest messageDigestB = b(str);
        this.a = messageDigestB;
        int digestLength = messageDigestB.getDigestLength();
        boolean z = false;
        if (i >= 4 && i <= digestLength) {
            z = true;
        }
        obr.aL(z, "bytes (%s) must be >= 4 and < %s", i, digestLength);
        this.b = i;
        this.c = c(messageDigestB);
    }

    private static MessageDigest b(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private static boolean c(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException e) {
            return false;
        }
    }

    @Override // defpackage.oyk
    public final oxh a() {
        if (this.c) {
            try {
                return new oyn((MessageDigest) this.a.clone(), this.b);
            } catch (CloneNotSupportedException e) {
            }
        }
        return new oyn(b(this.a.getAlgorithm()), this.b);
    }

    public final String toString() {
        return this.d;
    }

    Object writeReplace() {
        return new oyo(this.a.getAlgorithm(), this.b);
    }
}
