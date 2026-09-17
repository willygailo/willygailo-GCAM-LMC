package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class jtl {
    public final AtomicInteger a = new AtomicInteger(0);

    public jtl() {
    }

    public jtl(byte[] bArr) {
    }

    public final int a() {
        return this.a.get();
    }

    public final jtk b() {
        return new jtk(this);
    }

    public final boolean c() {
        return this.a.get() == 3;
    }

    public final boolean d() {
        return this.a.get() == 2;
    }

    public final boolean e() {
        return this.a.get() == 1;
    }

    public final void f(int... iArr) {
        boolean z = false;
        for (int i = 0; i < 2; i++) {
            int i2 = iArr[i];
            int i3 = this.a.get();
            int i4 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            z |= true ^ (i3 != i4);
        }
        int i5 = this.a.get();
        StringBuilder sb = new StringBuilder(34);
        sb.append("Invalid session state: ");
        sb.append(i5);
        obr.aR(z, sb.toString());
    }

    public final void g(int i) {
        this.a.set(i - 1);
    }

    public final void h(int i, int i2) {
        if (this.a.getAndSet(i2 - 1) != i - 1) {
            throw new IllegalStateException();
        }
    }
}
