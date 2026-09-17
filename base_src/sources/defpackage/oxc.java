package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
final class oxc extends ows {
    public static final AtomicReference a = new AtomicReference();
    private static final AtomicLong b = new AtomicLong();
    private static final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    private volatile ovr d;

    public oxc(String str) {
        ovr ovrVarA;
        super(str);
        boolean z = false;
        boolean z2 = Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT);
        boolean z3 = "goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE);
        if ("eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE)) {
            z = true;
        }
        if (z2 || z3) {
            this.d = new owt().a(a());
            return;
        }
        if (z) {
            oxe oxeVar = new oxe();
            ovrVarA = new oxe(oxeVar.a, oxeVar.b, Level.OFF, oxeVar.d).a(a());
        } else {
            ovrVarA = null;
        }
        this.d = ovrVarA;
    }

    public static void e() {
        while (true) {
            oxc oxcVar = (oxc) oxa.a.poll();
            if (oxcVar == null) {
                f();
                return;
            }
            oxcVar.d = ((owu) a.get()).a(oxcVar.a());
        }
    }

    private static void f() {
        while (true) {
            oxb oxbVar = (oxb) c.poll();
            if (oxbVar == null) {
                return;
            }
            b.getAndDecrement();
            ovr ovrVar = oxbVar.a;
            ovq ovqVar = oxbVar.b;
            if (ovqVar.D() || ovrVar.d(ovqVar.m())) {
                ovrVar.c(ovqVar);
            }
        }
    }

    @Override // defpackage.ows, defpackage.ovr
    public final void b(RuntimeException runtimeException, ovq ovqVar) {
        if (this.d != null) {
            this.d.b(runtimeException, ovqVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }

    @Override // defpackage.ovr
    public final void c(ovq ovqVar) {
        if (this.d != null) {
            this.d.c(ovqVar);
            return;
        }
        if (b.incrementAndGet() > 20) {
            c.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        c.offer(new oxb(this, ovqVar));
        if (this.d != null) {
            f();
        }
    }

    @Override // defpackage.ovr
    public final boolean d(Level level) {
        if (this.d != null) {
            return this.d.d(level);
        }
        return true;
    }
}
