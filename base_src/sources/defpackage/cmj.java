package defpackage;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: loaded from: classes.dex */
public final class cmj {
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;

    public cmj(lzv lzvVar) {
        this.a = (byte[]) a(kdc.n, lzvVar);
        this.b = (byte[]) a(kdc.o, lzvVar);
        this.c = (byte[]) a(kdc.p, lzvVar);
    }

    private static Object a(CaptureResult.Key key, lzv lzvVar) {
        if (key != null) {
            return lzvVar.d(key);
        }
        return null;
    }
}
