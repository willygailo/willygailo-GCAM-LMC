package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class fuo {
    public volatile boolean a;

    public fuo() {
        this.a = false;
    }

    public fuo(byte[] bArr) {
    }

    public static fuo d() {
        return new fuo(null);
    }

    public final synchronized long a() {
        return !this.a ? SystemClock.elapsedRealtimeNanos() : 4611686018427387903L;
    }

    public final synchronized void b() {
        this.a = true;
    }

    public final void c() {
        if (this.a) {
            throw new IllegalStateException("Already released");
        }
    }
}
