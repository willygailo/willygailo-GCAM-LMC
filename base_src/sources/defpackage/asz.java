package defpackage;

import java.io.PushbackReader;
import java.io.Reader;

/* JADX INFO: loaded from: classes.dex */
public final class asz extends PushbackReader {
    private int a;
    private int b;
    private int c;

    public asz(Reader reader) {
        super(reader, 8);
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00e0  */
    @Override // java.io.PushbackReader, java.io.FilterReader, java.io.Reader
    public final int read(char[] cArr, int i, int i2) {
        char[] cArr2 = new char[8];
        int i3 = i;
        boolean z = true;
        int i4 = 0;
        int i5 = 0;
        while (z && i4 < i2) {
            z = super.read(cArr2, i5, 1) == 1;
            if (z) {
                char c = cArr2[i5];
                int i6 = this.a;
                switch (i6) {
                    case 0:
                        if (c == '&') {
                            this.a = 1;
                            c = '&';
                            i6 = 1;
                        }
                        break;
                    case 1:
                        if (c != '#') {
                            this.a = 5;
                            i6 = 5;
                        } else {
                            this.a = 2;
                            i6 = 2;
                        }
                        break;
                    case 2:
                        if (c == 'x') {
                            this.b = 0;
                            this.c = 0;
                            this.a = 3;
                            i6 = 3;
                        } else if (c >= '0' && c <= '9') {
                            this.b = Character.digit(c, 10);
                            this.c = 1;
                            this.a = 4;
                            i6 = 4;
                        } else {
                            this.a = 5;
                            i6 = 5;
                        }
                        break;
                    case 3:
                        if ((c >= '0' && c <= '9') || ((c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F'))) {
                            this.b = (this.b * 16) + Character.digit(c, 16);
                            int i7 = this.c + 1;
                            this.c = i7;
                            if (i7 > 4) {
                                this.a = 5;
                                i6 = 5;
                            } else {
                                this.a = 3;
                                i6 = 3;
                            }
                        } else if (c != ';') {
                            this.a = 5;
                            i6 = 5;
                        } else if (!atb.d((char) this.b)) {
                            c = ';';
                            this.a = 5;
                            i6 = 5;
                        } else {
                            this.a = 0;
                            c = (char) this.b;
                            i6 = 0;
                        }
                        break;
                    case 4:
                        if (c >= '0' && c <= '9') {
                            this.b = (this.b * 10) + Character.digit(c, 10);
                            int i8 = this.c + 1;
                            this.c = i8;
                            if (i8 > 5) {
                                this.a = 5;
                                i6 = 5;
                            } else {
                                this.a = 4;
                                i6 = 4;
                            }
                        } else if (c != ';') {
                            this.a = 5;
                            i6 = 5;
                        } else if (!atb.d((char) this.b)) {
                            c = ';';
                            this.a = 5;
                            i6 = 5;
                        } else {
                            this.a = 0;
                            c = (char) this.b;
                            i6 = 0;
                        }
                        break;
                    default:
                        this.a = 0;
                        i6 = 0;
                        break;
                }
                if (i6 == 0) {
                    if (true == atb.d(c)) {
                        c = ' ';
                    }
                    cArr[i3] = c;
                    i4++;
                    i3++;
                    i5 = 0;
                } else if (i6 == 5) {
                    unread(cArr2, 0, i5 + 1);
                    i5 = 0;
                } else {
                    i5++;
                }
            } else if (i5 > 0) {
                unread(cArr2, 0, i5);
                this.a = 5;
                z = true;
                i5 = 0;
            }
        }
        if (i4 > 0 || z) {
            return i4;
        }
        return -1;
    }
}
