package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class biq {
    public final bcv a;
    public final bct b;

    public biq(bcv bcvVar, bct bctVar) {
        this.a = bcvVar;
        this.b = bctVar;
    }

    public final void a(Bitmap bitmap) {
        this.a.d(bitmap);
    }

    public final void b(byte[] bArr) {
        bct bctVar = this.b;
        if (bctVar == null) {
            return;
        }
        bctVar.c(bArr);
    }

    public final byte[] c(int i) {
        bct bctVar = this.b;
        return bctVar == null ? new byte[i] : (byte[]) bctVar.a(i, byte[].class);
    }
}
