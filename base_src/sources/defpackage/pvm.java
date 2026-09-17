package defpackage;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public final class pvm implements pvd {
    private final byte[] a;
    private int b;
    private int c;

    public pvm(String str) {
        try {
            this.a = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public pvm(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.pvd
    public final synchronized int a(byte[] bArr, int i, int i2) {
        obr.aG(65536 - i >= i2, "Buffer length too small.");
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.b;
        int length = this.a.length;
        if (i3 == length) {
            return 0;
        }
        int iMin = Math.min(i2, length - i3);
        for (int i4 = 0; i4 < iMin; i4++) {
            byte[] bArr2 = this.a;
            int i5 = this.b;
            bArr[i + i4] = bArr2[i5];
            this.b = i5 + 1;
        }
        return iMin;
    }

    @Override // defpackage.pvd
    public final synchronized long b() {
        return this.c;
    }

    @Override // defpackage.pvd
    public final synchronized long c() {
        return this.b;
    }

    @Override // defpackage.pvd, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
    }

    @Override // defpackage.pvd
    public final synchronized long d() {
        return this.a.length;
    }

    @Override // defpackage.pvd
    public final synchronized void e() {
        this.c = this.b;
    }

    @Override // defpackage.pvd
    public final synchronized void f() {
        this.b = this.c;
    }

    @Override // defpackage.pvd
    public final synchronized boolean g() {
        return this.b < this.a.length;
    }

    @Override // defpackage.pvd
    public final synchronized void h(long j) {
        this.b = (int) (((long) this.b) + Math.min(j, this.a.length - this.b));
    }
}
