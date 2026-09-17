package defpackage;

import android.database.Cursor;
import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class cxc implements lle, fik, fhk, fhl {
    public static final ouj a = ouj.h("com/google/android/apps/camera/camerafatalerror/CameraFatalErrorTrackerImpl");
    public final CameraFatalErrorTrackerDatabase b;
    public final fjs c;
    public final cwt d;
    public final ojz e;
    private final Executor f;
    private final lar g;
    private final AtomicBoolean h = new AtomicBoolean(false);
    private final Map i = new HashMap();

    public cxc(CameraFatalErrorTrackerDatabase cameraFatalErrorTrackerDatabase, Executor executor, fjs fjsVar, lar larVar, final ddf ddfVar, cwt cwtVar) {
        this.b = cameraFatalErrorTrackerDatabase;
        this.f = executor;
        this.c = fjsVar;
        this.g = larVar;
        this.e = new ojz() { // from class: cww
            @Override // defpackage.ojz
            public final Object a() {
                return (Integer) ddfVar.a(ddl.G).c();
            }
        };
        this.d = cwtVar;
    }

    public static long a(long j, long j2) {
        return TimeUnit.MILLISECONDS.toDays(j - j2);
    }

    @Override // defpackage.fhk
    public final void b() {
        this.h.set(false);
    }

    @Override // defpackage.fhl
    public final void c() {
        this.h.set(true);
    }

    final void d(final String str, final boolean z) {
        this.g.c(new Runnable() { // from class: cxb
            @Override // java.lang.Runnable
            public final void run() {
                boolean z2 = z;
                String str2 = str;
                if (z2) {
                    ((oug) ((oug) cxc.a.b()).G((char) 651)).r("showing \"%s\" warning", str2);
                } else {
                    ((oug) ((oug) cxc.a.b()).G((char) 652)).r("Not showing \"%s\" warning since the app is in the background", str2);
                }
            }
        });
    }

    @Override // defpackage.lle
    public final void e(final lju ljuVar) {
        if (!lju.d(ljuVar)) {
            d("Fatal error", this.h.get());
        } else {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            this.f.execute(new Runnable() { // from class: cwy
                @Override // java.lang.Runnable
                public final void run() {
                    cxe cxeVar;
                    cxc cxcVar = this.a;
                    lju ljuVar2 = ljuVar;
                    long j = jCurrentTimeMillis;
                    cxcVar.d.a();
                    cxf cxfVarR = cxcVar.b.r();
                    int i = ljuVar2.u;
                    cxk cxkVar = (cxk) cxfVarR;
                    cxkVar.a.h();
                    try {
                        cxe cxeVar2 = new cxe(i);
                        ((cxk) cxfVarR).a.g();
                        ((cxk) cxfVarR).a.h();
                        try {
                            ((cxk) cxfVarR).b.c(cxeVar2);
                            ((cxk) cxfVarR).a.j();
                            ((cxk) cxfVarR).a.i();
                            ais aisVarA = ais.a("SELECT * FROM EnumerationErrorCounts WHERE errorCode = ?", 1);
                            aisVarA.e(1, i);
                            ((cxk) cxfVarR).a.g();
                            Cursor cursorI = fy.i(((cxk) cxfVarR).a, aisVarA, false);
                            try {
                                int iL = fy.l(cursorI, "errorCode");
                                int iL2 = fy.l(cursorI, "failuresBeforeReboot");
                                int iL3 = fy.l(cursorI, "failuresAfterReboot");
                                int iL4 = fy.l(cursorI, "rebootCount");
                                int iL5 = fy.l(cursorI, "lastFailureTimestamp");
                                if (cursorI.moveToFirst()) {
                                    cxeVar = new cxe(cursorI.getInt(iL));
                                    cxeVar.b = cursorI.getInt(iL2);
                                    cxeVar.c = cursorI.getInt(iL3);
                                    cxeVar.d = cursorI.getInt(iL4);
                                    cxeVar.e = cursorI.getLong(iL5);
                                } else {
                                    cxeVar = null;
                                }
                                cursorI.close();
                                aisVarA.j();
                                ((cxk) cxfVarR).a.j();
                                cxkVar.a.i();
                                if (cxc.a(j, cxeVar.e) >= ((Integer) cxcVar.e.a()).intValue()) {
                                    cxcVar.b.r().a();
                                    cxeVar = new cxe(ljuVar2.u);
                                }
                                if (cxeVar.d == 0) {
                                    cxeVar.b++;
                                } else {
                                    cxeVar.c++;
                                }
                                cxeVar.e = j;
                                cxf cxfVarR2 = cxcVar.b.r();
                                cxk cxkVar2 = (cxk) cxfVarR2;
                                cxkVar2.a.g();
                                cxkVar2.a.h();
                                try {
                                    ((cxk) cxfVarR2).c.a(cxeVar);
                                    ((cxk) cxfVarR2).a.j();
                                    cxkVar2.a.i();
                                    int i2 = cxeVar.a;
                                    int i3 = cxeVar.b;
                                    int i4 = cxeVar.c;
                                    long j2 = cxeVar.e;
                                    cxcVar.c.b(i2, i3, i4, cxeVar.d);
                                    cxcVar.d("Suspected camera device error", true);
                                } catch (Throwable th) {
                                    cxkVar2.a.i();
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                cursorI.close();
                                aisVarA.j();
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            ((cxk) cxfVarR).a.i();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        cxkVar.a.i();
                        throw th4;
                    }
                }
            });
        }
    }

    @Override // defpackage.lle
    public final synchronized void f(final lvs lvsVar, lju ljuVar, final boolean z) {
        if (!lju.e(ljuVar)) {
            d("Fatal error", this.h.get());
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        long jLongValue = ((Long) j$.util.Map.EL.getOrDefault(this.i, lvsVar, 0L)).longValue();
        final long j = jLongValue != 0 ? jCurrentTimeMillis - jLongValue : 0L;
        this.i.put(lvsVar, 0L);
        this.f.execute(new Runnable() { // from class: cxa
            @Override // java.lang.Runnable
            public final void run() {
                cxl cxlVar;
                cxc cxcVar = this.a;
                lvs lvsVar2 = lvsVar;
                long j2 = jCurrentTimeMillis;
                boolean z2 = z;
                long j3 = j;
                cxcVar.d.a();
                cxm cxmVarS = cxcVar.b.s();
                String str = lvsVar2.a;
                cxr cxrVar = (cxr) cxmVarS;
                cxrVar.a.h();
                try {
                    cxl cxlVar2 = new cxl(str);
                    ((cxr) cxmVarS).a.g();
                    ((cxr) cxmVarS).a.h();
                    try {
                        ((cxr) cxmVarS).b.a(cxlVar2);
                        ((cxr) cxmVarS).a.j();
                        ((cxr) cxmVarS).a.i();
                        ais aisVarA = ais.a("SELECT * FROM FatalErrorCounts WHERE cameraId = ?", 1);
                        if (str == null) {
                            aisVarA.f(1);
                        } else {
                            aisVarA.g(1, str);
                        }
                        ((cxr) cxmVarS).a.g();
                        Cursor cursorI = fy.i(((cxr) cxmVarS).a, aisVarA, false);
                        try {
                            int iL = fy.l(cursorI, "cameraId");
                            int iL2 = fy.l(cursorI, "failuresBeforeRebootDuringOpen");
                            int iL3 = fy.l(cursorI, "failuresAfterRebootDuringOpen");
                            int iL4 = fy.l(cursorI, "failuresBeforeRebootDuringSession");
                            int iL5 = fy.l(cursorI, "failuresAfterRebootDuringSession");
                            int iL6 = fy.l(cursorI, "lastFatalErrorTimestamp");
                            int iL7 = fy.l(cursorI, "rebootCount");
                            if (cursorI.moveToFirst()) {
                                cxlVar = new cxl(cursorI.isNull(iL) ? null : cursorI.getString(iL));
                                cxlVar.b = cursorI.getInt(iL2);
                                cxlVar.c = cursorI.getInt(iL3);
                                cxlVar.d = cursorI.getInt(iL4);
                                cxlVar.e = cursorI.getInt(iL5);
                                cxlVar.f = cursorI.getLong(iL6);
                                cxlVar.g = cursorI.getInt(iL7);
                            } else {
                                cxlVar = null;
                            }
                            cursorI.close();
                            aisVarA.j();
                            ((cxr) cxmVarS).a.j();
                            cxrVar.a.i();
                            if (cxc.a(j2, cxlVar.f) >= ((Integer) cxcVar.e.a()).intValue()) {
                                cxlVar = new cxl(lvsVar2.a);
                            }
                            if (z2 == 0 && cxlVar.g == 0) {
                                cxlVar.b++;
                            } else if (z2 == 0 && cxlVar.g > 0) {
                                cxlVar.c++;
                            } else if (z2 != 0 && cxlVar.g == 0) {
                                cxlVar.d++;
                            } else if (z2 && cxlVar.g > 0) {
                                cxlVar.e++;
                            }
                            cxlVar.f = j2;
                            cxcVar.b.s().a(cxlVar);
                            String str2 = cxlVar.a;
                            int i = cxlVar.b;
                            int i2 = cxlVar.c;
                            int i3 = cxlVar.d;
                            int i4 = cxlVar.e;
                            long j4 = cxlVar.f;
                            cxcVar.c.c(str2, i, i2, i3, i4, cxlVar.g, j3);
                            cxcVar.d("Suspected camera device error", true);
                        } catch (Throwable th) {
                            cursorI.close();
                            aisVarA.j();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        ((cxr) cxmVarS).a.i();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    cxrVar.a.i();
                    throw th3;
                }
            }
        });
    }

    @Override // defpackage.lle
    public final synchronized void g(lvs lvsVar) {
        this.i.put(lvsVar, Long.valueOf(System.currentTimeMillis()));
        this.f.execute(new cwz(this, lvsVar, 1));
    }

    @Override // defpackage.lle
    public final synchronized void h(lvs lvsVar) {
        this.i.put(lvsVar, 0L);
        this.f.execute(new cwz(this, lvsVar, 0));
    }

    @Override // defpackage.lle
    public final void i() {
        this.f.execute(new Runnable() { // from class: cwx
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.r().a();
            }
        });
    }
}
