package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class oyi extends oyj implements Serializable {
    private static final long serialVersionUID = 0;
    public final byte[] a;

    public oyi(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.oyj
    public final int a() {
        int length = this.a.length;
        obr.aS(length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", length);
        byte[] bArr = this.a;
        return ((bArr[3] & 255) << 24) | ((bArr[1] & 255) << 8) | (bArr[0] & 255) | ((bArr[2] & 255) << 16);
    }

    @Override // defpackage.oyj
    public final int b() {
        return this.a.length * 8;
    }

    @Override // defpackage.oyj
    public final boolean c(oyj oyjVar) {
        if (this.a.length != oyjVar.d().length) {
            return false;
        }
        int i = 0;
        boolean z = true;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                return z;
            }
            z &= bArr[i] == oyjVar.d()[i];
            i++;
        }
    }

    @Override // defpackage.oyj
    public final byte[] d() {
        return this.a;
    }
}
