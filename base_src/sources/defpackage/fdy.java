package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.apps.camera.legacy.lightcycle.storage.LocalSessionStorage;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class fdy implements hhn {
    private static final ouj c = ouj.h("com/google/android/apps/camera/legacy/lightcycle/panorama/processing/LightCycleStitchTask");
    public final LocalSessionStorage a;
    private final String d;
    private final File e;
    private final String f;
    private final fjs j;
    private final dxp k;
    private final int l;
    private final dwu m;
    private final Semaphore g = new Semaphore(0);
    private volatile boolean h = false;
    public final AtomicBoolean b = new AtomicBoolean();
    private final List i = new ArrayList();

    public fdy(LocalSessionStorage localSessionStorage, fjs fjsVar, dxp dxpVar, dwu dwuVar) {
        this.a = localSessionStorage;
        this.j = fjsVar;
        this.d = localSessionStorage.e;
        this.e = localSessionStorage.b.d.a();
        this.f = localSessionStorage.b.s();
        this.l = localSessionStorage.j;
        this.k = dxpVar;
        this.m = dwuVar;
    }

    @Override // defpackage.hhn
    public final /* bridge */ /* synthetic */ hhm a() {
        return this.a.b;
    }

    @Override // defpackage.hhn
    public final String b() {
        String strValueOf = String.valueOf(this.a.b.h());
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 21);
        sb.append("LightCycleStitchTask-");
        sb.append(strValueOf);
        return sb.toString();
    }

    @Override // defpackage.hhn
    public final void c(lht lhtVar) {
        lhtVar.getClass();
        this.i.add(lhtVar);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x010d  */
    /* JADX WARN: Code duplicated, block: B:45:0x010f  */
    /* JADX WARN: Code duplicated, block: B:52:0x013b A[Catch: all -> 0x0147, LOOP:0: B:50:0x0135->B:52:0x013b, LOOP_END, TryCatch #0 {, blocks: (B:49:0x0118, B:50:0x0135, B:52:0x013b, B:53:0x0145), top: B:72:0x0118 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.hhn
    public final void d(Context context) {
        boolean z;
        boolean z2;
        ojc ojcVarI;
        boolean z3;
        Iterator it;
        this.b.set(false);
        try {
            h();
            int iB = fcz.b();
            File file = this.e;
            long length = file.length();
            this.a.b.b(lif.b);
            fcz.c.put(Integer.valueOf(iB), new fdx(this, length, file));
            long jUptimeMillis = SystemClock.uptimeMillis();
            fcz.x(iB);
            Map mapB = fev.b(this.a.h);
            float fA = fev.a(mapB);
            int i = this.l;
            int i2 = 2;
            if (i != 2) {
                z = false;
            } else if (fA == 360.0f) {
                i = 2;
                z = true;
            } else {
                i = 2;
                z = false;
            }
            if (i != 1 || fA < 70.0f) {
                z2 = z;
            } else {
                z2 = true;
            }
            long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
            int i3 = this.l;
            int i4 = 12;
            if (i3 != 2) {
                if (i3 == 3) {
                    i2 = 3;
                } else if (i3 == 5) {
                    i2 = 5;
                } else if (i3 == 4) {
                    i2 = 4;
                } else {
                    i4 = 6;
                    i2 = 1;
                }
            }
            fjs fjsVar = this.j;
            this.f.concat(".jpg");
            fjsVar.aq(i4, i2, jUptimeMillis2 * 0.001f, fA);
            boolean z4 = this.l == 1 || z;
            hsp hspVarH = this.a.b.h();
            ojc ojcVarB = this.m.b(hspVarH);
            oih oihVar = oih.a;
            if (ojcVarB.g()) {
                long j = ((dws) ojcVarB.c()).a.a;
                ojc ojcVarA = this.k.a(j);
                if (ojcVarA.g()) {
                    ojcVarI = ojc.i(((dxh) ojcVarA.c()).c());
                } else {
                    ((oug) ((oug) c.b()).G(1662)).q("special type not found for mediastore id = %d", j);
                }
                long jD = this.a.b.d();
                String path = this.e.getPath();
                String str = this.d;
                if (this.l == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                fev.c(path, mapB, str, z2, z4, ojcVarI, jD, z3);
                synchronized (this.b) {
                    this.b.set(true);
                    this.a.b.B();
                    this.a.b.F();
                    it = oom.j(this.i).iterator();
                    while (it.hasNext()) {
                        ((lht) it.next()).a(this);
                    }
                }
            }
            ((oug) ((oug) c.b()).G((char) 1661)).r("no processing media found for shot %s", hspVarH);
            ojcVarI = oihVar;
            long jD2 = this.a.b.d();
            String path2 = this.e.getPath();
            String str2 = this.d;
            if (this.l == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            fev.c(path2, mapB, str2, z2, z4, ojcVarI, jD2, z3);
            synchronized (this.b) {
                this.b.set(true);
                this.a.b.B();
                this.a.b.F();
                it = oom.j(this.i).iterator();
                while (it.hasNext()) {
                    ((lht) it.next()).a(this);
                }
            }
        } catch (Throwable th) {
            synchronized (this.b) {
                this.b.set(true);
                this.a.b.B();
                this.a.b.F();
                Iterator it2 = oom.j(this.i).iterator();
                while (it2.hasNext()) {
                    ((lht) it2.next()).a(this);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.hhn
    public final void e(lht lhtVar) {
        lhtVar.getClass();
        this.i.remove(lhtVar);
    }

    @Override // defpackage.hhn
    public final synchronized void f() {
        this.h = false;
        this.g.release();
    }

    @Override // defpackage.hhn
    public final synchronized void g() {
        this.g.drainPermits();
        this.h = true;
    }

    public final void h() {
        if (this.h) {
            try {
                this.g.acquire();
            } catch (InterruptedException e) {
                ((oug) ((oug) ((oug) c.c()).h(e)).G((char) 1663)).o("Failed to acquire waitLock.");
            }
        }
    }
}
