package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
abstract class pru {
    final Unsafe a;

    public pru(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract byte a(long j);

    public abstract double b(Object obj, long j);

    public abstract float c(Object obj, long j);

    public abstract void d(long j, byte[] bArr, long j2, long j3);

    public abstract void e(Object obj, long j, boolean z);

    public abstract void f(Object obj, long j, byte b);

    public abstract void g(Object obj, long j, double d);

    public abstract void h(Object obj, long j, float f);

    public abstract boolean i(Object obj, long j);

    public final int j(Class cls) {
        return this.a.arrayBaseOffset(cls);
    }

    public final int k(Object obj, long j) {
        return this.a.getInt(obj, j);
    }

    public final long l(Object obj, long j) {
        return this.a.getLong(obj, j);
    }

    public final long m(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public final Object n(Object obj, long j) {
        return this.a.getObject(obj, j);
    }

    public final void o(Object obj, long j, int i) {
        this.a.putInt(obj, j, i);
    }

    public final void p(Object obj, long j, long j2) {
        this.a.putLong(obj, j, j2);
    }

    public final void q(Object obj, long j, Object obj2) {
        this.a.putObject(obj, j, obj2);
    }

    public final void r(Class cls) {
        this.a.arrayIndexScale(cls);
    }
}
