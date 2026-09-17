package defpackage;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class fmf {
    private static final ouj d = ouj.h("com/google/android/apps/camera/memory/MemoryManager");
    public final Executor b;
    private final long e;
    public final EnumMap c = new EnumMap(flz.class);
    public final Object a = new Object();

    public fmf(mos mosVar, Executor executor, byte[] bArr) {
        this.e = mosVar.a;
        this.b = executor;
    }

    private final long b() {
        long j;
        synchronized (this.a) {
            Iterator it = this.c.keySet().iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                jLongValue += ((Long) ((lce) ((fme) this.c.get((flz) it.next())).c.b()).d).longValue();
            }
            j = this.e - jLongValue;
        }
        return j;
    }

    public final void a() {
        boolean z;
        synchronized (this.a) {
            b();
            for (flz flzVar : this.c.keySet()) {
                lce lceVar = ((fme) this.c.get(flzVar)).a;
                synchronized (this.a) {
                    long jB = b();
                    long jLongValue = ((Long) ((lct) ((fme) this.c.get(flzVar)).c.a()).a).longValue();
                    z = false;
                    if (jLongValue < 0) {
                        ((oug) ((oug) d.c()).G(1764)).x("Feature (%s) reports negative shot memory: %d. Disabling.", flzVar.name(), jLongValue);
                    } else {
                        z = jLongValue <= jB;
                        flzVar.name();
                    }
                }
                lceVar.fB(Boolean.valueOf(z));
            }
        }
    }
}
