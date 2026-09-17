package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class oys extends oyv {
    final char[] a;

    public oys(oyr oyrVar) {
        super(oyrVar, null);
        this.a = new char[512];
        obr.aF(oyrVar.b.length == 16);
        for (int i = 0; i < 256; i++) {
            this.a[i] = oyrVar.a(i >>> 4);
            this.a[i | 256] = oyrVar.a(i & 15);
        }
    }

    @Override // defpackage.oyv, defpackage.oyw
    public final int a(byte[] bArr, CharSequence charSequence) throws oyt {
        bArr.getClass();
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid input length ");
            sb.append(length);
            throw new oyt(sb.toString());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            bArr[i2] = (byte) ((this.b.b(charSequence.charAt(i)) << 4) | this.b.b(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // defpackage.oyv, defpackage.oyw
    public final void b(Appendable appendable, byte[] bArr, int i) throws IOException {
        appendable.getClass();
        obr.aP(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            appendable.append(this.a[i3]);
            appendable.append(this.a[i3 | 256]);
        }
    }
}
