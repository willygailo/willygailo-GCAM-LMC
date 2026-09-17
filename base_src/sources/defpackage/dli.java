package defpackage;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class dli implements dlt, fik, fig, fie {
    private static final ouj a = ouj.h("com/google/android/apps/camera/error/FatalActivityErrorHandler");
    private static final oom b = oom.p(jrl.PHOTO, jrl.VIDEO, jrl.VIDEO_INTENT, jrl.IMAGE_INTENT);
    private final WeakReference c;
    private final fjs d;
    private final bus e;
    private final lda f;
    private final AtomicBoolean g = new AtomicBoolean(false);
    private final jtx h;

    public dli(WeakReference weakReference, fjs fjsVar, bus busVar, lda ldaVar, jtx jtxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = weakReference;
        this.d = fjsVar;
        this.e = busVar;
        this.f = ldaVar;
        this.h = jtxVar;
    }

    protected final void a(boolean z, String str, Exception exc) {
        if (z) {
            Activity activity = (Activity) this.c.get();
            if (activity != null && !activity.isFinishing()) {
                ((oug) ((oug) ((oug) a.b()).h(exc)).G((char) 845)).r("Activity received a fatal error. Finishing activity: %s", str);
                activity.finish();
            }
        } else {
            ((oug) ((oug) a.b()).G((char) 846)).r("Activity received a fatal error. Not finishing the activity: %s", str);
        }
        synchronized (this.e) {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((bur) it.next()).a(exc);
            }
        }
    }

    @Override // defpackage.dlx
    public final void d() {
        Exception exc = new Exception();
        ((oug) ((oug) ((oug) a.b()).h(exc)).G((char) 847)).o("Handling Camera Disabled Failure:");
        this.d.S(2, null, exc, -1, -1, 0, oom.l(), oom.l(), lju.CAMERA_ERROR_CODE_UNKNOWN, false);
        a(true, "Camera has been disabled because of security policies.", exc);
    }

    @Override // defpackage.llt
    public final void e(Throwable th) {
        Exception exc = new Exception();
        ((oug) ((oug) ((oug) a.b()).h(exc)).G((char) 848)).o("Camera Hardware failure:");
        lju ljuVar = lju.CAMERA_OPEN_TIMEOUT;
        ArrayList arrayList = new ArrayList();
        dlr dlrVar = (dlr) th;
        lju ljuVar2 = dlrVar.b;
        arrayList.addAll(dlrVar.a);
        this.d.S(12, null, exc, -1, -1, 0, arrayList, oom.l(), ljuVar2, false);
        a(true, "Camera Hardware failure: One or more cameras may not have been enumerated", exc);
    }

    @Override // defpackage.llt
    public final void f(Throwable th) {
        lju ljuVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        dlh dlhVar;
        boolean z5;
        Exception exc = new Exception(th);
        ArrayList arrayList = new ArrayList();
        lju ljuVar2 = lju.CAMERA_ERROR_CODE_UNKNOWN;
        dlh dlhVar2 = dlh.UNKNOWN;
        if (th instanceof lka) {
            lka lkaVar = (lka) th;
            lju ljuVar3 = lkaVar.a;
            boolean z6 = lkaVar.c;
            if (lkaVar.b.c()) {
                arrayList.add(lkaVar.b.a);
            }
            if (lju.e(ljuVar3) && b.contains(this.f.fA()) && this.h.s()) {
                dlhVar = dlh.DEVICE_FORWARDED;
                z4 = true;
                z5 = false;
            } else {
                z4 = !this.g.get();
                dlhVar = dlh.DEVICE_HANDLED;
                z5 = true;
            }
            z2 = z4;
            ljuVar = ljuVar3;
            z = z6;
            dlhVar2 = dlhVar;
            z3 = z5;
        } else if (th instanceof dlu) {
            dlu dluVar = (dlu) th;
            lju ljuVar4 = dluVar.a;
            if (dluVar.b.c()) {
                arrayList.add(dluVar.b.a);
            }
            ljuVar = ljuVar4;
            z = dluVar.c > 0;
            z2 = true;
            z3 = true;
            dlhVar2 = dlh.FALLBACK_HANDLED;
        } else {
            ljuVar = ljuVar2;
            z = false;
            z2 = true;
            z3 = true;
        }
        this.d.S(3, dlhVar2.e, th, -1, -1, 0, oom.l(), arrayList, ljuVar, z);
        if (z3) {
            ((oug) ((oug) ((oug) a.b()).h(exc)).G(849)).r("Handling Camera Open Failure. %s", true != z2 ? "Not finishing activity. Activity in background when CameraDeviceException is received" : "Finishing activity.");
            a(z2, ljuVar.c(), exc);
        }
    }

    @Override // defpackage.fie
    public final void fU() {
        this.g.set(true);
    }

    @Override // defpackage.fig
    public final void fV() {
        this.g.set(false);
    }

    @Override // defpackage.dlx
    public final void g() {
        Exception exc = new Exception();
        ((oug) ((oug) ((oug) a.b()).h(exc)).G((char) 850)).o("Handling Camera Reconnect Failure:");
        this.d.S(4, null, exc, -1, -1, 0, oom.l(), oom.l(), lju.CAMERA_ERROR_CODE_UNKNOWN, false);
        a(true, "Camera Reconnect Failure", exc);
    }

    @Override // defpackage.dlx
    public final void h() {
        Exception exc = new Exception();
        ((oug) ((oug) ((oug) a.b()).h(exc)).G((char) 851)).o("Handling Camera Access Failure:");
        this.d.S(1, null, exc, -1, -1, 0, oom.l(), oom.l(), lju.CAMERA_ERROR_CODE_UNKNOWN, false);
        a(true, "Camera Access Failure", exc);
    }

    @Override // defpackage.dly
    public final void i() {
        Exception exc = new Exception();
        ((oug) ((oug) ((oug) a.b()).h(exc)).G((char) 852)).o("Handling MediaRecorder Failure:");
        this.d.j();
        a(true, "There was a problem with the media recorder.", exc);
    }
}
