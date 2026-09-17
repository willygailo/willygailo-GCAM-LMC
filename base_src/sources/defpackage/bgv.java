package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
final class bgv implements bgu {
    private final InputStream a;

    public bgv(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.bgu
    public final int a() {
        return (d() << 8) | d();
    }

    @Override // defpackage.bgu
    public final int b(byte[] bArr, int i) throws bgt {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = this.a.read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new bgt();
        }
        return i2;
    }

    @Override // defpackage.bgu
    public final long c(long j) throws IOException {
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            long jSkip = this.a.skip(j2);
            if (jSkip > 0) {
                j2 -= jSkip;
            } else {
                if (this.a.read() == -1) {
                    break;
                }
                j2--;
            }
        }
        return j - j2;
    }

    @Override // defpackage.bgu
    public final short d() throws IOException {
        int i = this.a.read();
        if (i != -1) {
            return (short) i;
        }
        throw new bgt();
    }
}
