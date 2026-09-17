package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
abstract class kht extends kmz {
    private static final WeakReference a = new WeakReference(null);
    private WeakReference b;

    public kht(byte[] bArr) {
        super(bArr);
        this.b = a;
    }

    protected abstract byte[] b();

    @Override // defpackage.kmz
    public final byte[] w() {
        byte[] bArrB;
        synchronized (this) {
            bArrB = (byte[]) this.b.get();
            if (bArrB == null) {
                bArrB = b();
                this.b = new WeakReference(bArrB);
            }
        }
        return bArrB;
    }
}
