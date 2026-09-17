package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oyw {
    public static final oyw e;

    static {
        oyr oyrVar = new oyr("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray());
        new oyv(oyrVar, '=');
        obr.aF(oyrVar.b.length == 64);
        oyr oyrVar2 = new oyr("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray());
        new oyv(oyrVar2, '=');
        obr.aF(oyrVar2.b.length == 64);
        new oyv("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new oyv("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        e = new oys(new oyr("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public abstract int a(byte[] bArr, CharSequence charSequence);

    public abstract void b(Appendable appendable, byte[] bArr, int i);

    public abstract int c(int i);

    public abstract int d(int i);

    public CharSequence e(CharSequence charSequence) {
        throw null;
    }

    public final String f(byte[] bArr) {
        int length = bArr.length;
        obr.aP(0, length, length);
        StringBuilder sb = new StringBuilder(d(length));
        try {
            b(sb, bArr, length);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final byte[] g(CharSequence charSequence) {
        try {
            CharSequence charSequenceE = e(charSequence);
            int iC = c(charSequenceE.length());
            byte[] bArr = new byte[iC];
            int iA = a(bArr, charSequenceE);
            if (iA == iC) {
                return bArr;
            }
            byte[] bArr2 = new byte[iA];
            System.arraycopy(bArr, 0, bArr2, 0, iA);
            return bArr2;
        } catch (oyt e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
