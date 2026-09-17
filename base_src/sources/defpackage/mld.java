package defpackage;

import j$.nio.charset.StandardCharsets;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class mld {
    public final String a;
    public final mlh b;
    final int c;
    final /* synthetic */ mlj d;

    public mld(mlj mljVar, mlh mlhVar) {
        this.d = mljVar;
        int i = mljVar.a.getInt(mlhVar.a);
        obr.aQ(i > 0);
        boolean z = i == 1 || i >= 8;
        obr.aR(z, "Box size too small");
        byte[] bArr = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i2] = mljVar.a.get(mlhVar.a + 4 + i2);
        }
        String str = new String(bArr, StandardCharsets.US_ASCII);
        this.a = str;
        obr.aQ(str.length() == 4);
        if (i == 1) {
            long j = mljVar.a.getLong(mlhVar.a + 8);
            obr.aG(j < 2147483647L, "We don't support >2GB boxes (since we're using ByteBuffers).");
            i = (int) j;
            this.c = 16;
        } else {
            this.c = 8;
        }
        obr.aR(i <= mlhVar.b, String.format(Locale.US, "Signalled box length %d does not fit length of %d", Integer.valueOf(this.c + i), Integer.valueOf(mlhVar.b)));
        int i3 = mlhVar.a;
        int i4 = this.c;
        this.b = new mlh(i3 + i4, i - i4);
    }
}
