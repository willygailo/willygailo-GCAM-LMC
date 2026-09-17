package defpackage;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class oyv extends oyw {
    public final oyr b;
    public final Character c;
    public transient oyw d;

    public oyv(String str, String str2, Character ch) {
        this(new oyr(str, str2.toCharArray()), ch);
    }

    public oyv(oyr oyrVar, Character ch) {
        this.b = oyrVar;
        boolean z = true;
        if (ch != null && oyrVar.c(ch.charValue())) {
            z = false;
        }
        obr.aK(z, "Padding character %s was already in alphabet", ch);
        this.c = ch;
    }

    @Override // defpackage.oyw
    public int a(byte[] bArr, CharSequence charSequence) throws oyt {
        oyr oyrVar;
        bArr.getClass();
        CharSequence charSequenceE = e(charSequence);
        oyr oyrVar2 = this.b;
        if (!oyrVar2.g[charSequenceE.length() % oyrVar2.e]) {
            int length = charSequenceE.length();
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid input length ");
            sb.append(length);
            throw new oyt(sb.toString());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceE.length()) {
            long jB = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                oyrVar = this.b;
                if (i3 >= oyrVar.e) {
                    break;
                }
                jB <<= oyrVar.d;
                if (i + i3 < charSequenceE.length()) {
                    jB |= (long) this.b.b(charSequenceE.charAt(i4 + i));
                    i4++;
                }
                i3++;
            }
            int i5 = oyrVar.f;
            int i6 = (i5 * 8) - (i4 * oyrVar.d);
            int i7 = (i5 - 1) * 8;
            while (i7 >= i6) {
                bArr[i2] = (byte) ((jB >>> i7) & 255);
                i7 -= 8;
                i2++;
            }
            i += this.b.e;
        }
        return i2;
    }

    @Override // defpackage.oyw
    public void b(Appendable appendable, byte[] bArr, int i) throws IOException {
        appendable.getClass();
        obr.aP(0, i, bArr.length);
        int i2 = 0;
        while (i2 < i) {
            int iMin = Math.min(this.b.f, i - i2);
            obr.aP(i2, i2 + iMin, bArr.length);
            obr.aF(iMin <= this.b.f);
            long j = 0;
            for (int i3 = 0; i3 < iMin; i3++) {
                j = (j | ((long) (bArr[i2 + i3] & 255))) << 8;
            }
            int i4 = ((iMin + 1) * 8) - this.b.d;
            int i5 = 0;
            while (i5 < iMin * 8) {
                oyr oyrVar = this.b;
                appendable.append(oyrVar.a(oyrVar.c & ((int) (j >>> (i4 - i5)))));
                i5 += this.b.d;
            }
            if (this.c != null) {
                while (i5 < this.b.f * 8) {
                    appendable.append(this.c.charValue());
                    i5 += this.b.d;
                }
            }
            i2 += this.b.f;
        }
    }

    @Override // defpackage.oyw
    public final int c(int i) {
        return (int) (((((long) this.b.d) * ((long) i)) + 7) / 8);
    }

    @Override // defpackage.oyw
    public final int d(int i) {
        oyr oyrVar = this.b;
        return oyrVar.e * oxh.R(i, oyrVar.f, RoundingMode.CEILING);
    }

    @Override // defpackage.oyw
    public final CharSequence e(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.c;
        if (ch == null) {
            return charSequence;
        }
        char cCharValue = ch.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == cCharValue) {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oyv) {
            oyv oyvVar = (oyv) obj;
            if (this.b.equals(oyvVar.b) && obr.bc(this.c, oyvVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ Arrays.hashCode(new Object[]{this.c});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.b.a);
        if (8 % this.b.d != 0) {
            if (this.c == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.c);
                sb.append("')");
            }
        }
        return sb.toString();
    }
}
