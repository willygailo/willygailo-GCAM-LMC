package defpackage;

import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
final class ex implements ez {
    private final IBinder a;

    public ex(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
