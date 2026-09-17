package defpackage;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class prt extends pru {
    public prt(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.pru
    public final byte a(long j) {
        return Memory.peekByte(j);
    }

    @Override // defpackage.pru
    public final double b(Object obj, long j) {
        return Double.longBitsToDouble(l(obj, j));
    }

    @Override // defpackage.pru
    public final float c(Object obj, long j) {
        return Float.intBitsToFloat(k(obj, j));
    }

    @Override // defpackage.pru
    public final void d(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray(j, bArr, (int) j2, (int) j3);
    }

    @Override // defpackage.pru
    public final void e(Object obj, long j, boolean z) {
        if (prv.d) {
            prv.o(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            prv.p(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.pru
    public final void f(Object obj, long j, byte b) {
        if (prv.d) {
            prv.o(obj, j, b);
        } else {
            prv.p(obj, j, b);
        }
    }

    @Override // defpackage.pru
    public final void g(Object obj, long j, double d) {
        p(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.pru
    public final void h(Object obj, long j, float f) {
        o(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.pru
    public final boolean i(Object obj, long j) {
        return prv.d ? prv.x(obj, j) : prv.y(obj, j);
    }
}
