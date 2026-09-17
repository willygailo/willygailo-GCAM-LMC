package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class pfv extends pfk {
    static final Unsafe a;
    static final long b;
    static final long c;
    static final long d;
    static final long e;
    static final long f;

    static {
        Unsafe unsafe;
        try {
            unsafe = Unsafe.getUnsafe();
        } catch (SecurityException e2) {
            try {
                unsafe = (Unsafe) AccessController.doPrivileged(new pfu());
            } catch (PrivilegedActionException e3) {
                throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
            }
        }
        try {
            c = unsafe.objectFieldOffset(pfx.class.getDeclaredField("waiters"));
            b = unsafe.objectFieldOffset(pfx.class.getDeclaredField("listeners"));
            d = unsafe.objectFieldOffset(pfx.class.getDeclaredField("value"));
            e = unsafe.objectFieldOffset(pfw.class.getDeclaredField("thread"));
            f = unsafe.objectFieldOffset(pfw.class.getDeclaredField("next"));
            a = unsafe;
        } catch (Exception e4) {
            okd.d(e4);
            throw new RuntimeException(e4);
        }
    }

    @Override // defpackage.pfk
    public final void a(pfw pfwVar, pfw pfwVar2) {
        a.putObject(pfwVar, f, pfwVar2);
    }

    @Override // defpackage.pfk
    public final void b(pfw pfwVar, Thread thread) {
        a.putObject(pfwVar, e, thread);
    }

    @Override // defpackage.pfk
    public final boolean c(pfx pfxVar, pfo pfoVar, pfo pfoVar2) {
        return a.compareAndSwapObject(pfxVar, b, pfoVar, pfoVar2);
    }

    @Override // defpackage.pfk
    public final boolean d(pfx pfxVar, Object obj, Object obj2) {
        return a.compareAndSwapObject(pfxVar, d, obj, obj2);
    }

    @Override // defpackage.pfk
    public final boolean e(pfx pfxVar, pfw pfwVar, pfw pfwVar2) {
        return a.compareAndSwapObject(pfxVar, c, pfwVar, pfwVar2);
    }
}
