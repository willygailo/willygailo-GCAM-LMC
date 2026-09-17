package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class lut extends CameraCaptureSession.CaptureCallback {
    private final lts a;

    public lut(lts ltsVar) {
        this.a = ltsVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        try {
            lts ltsVar = this.a;
            Long lB = ltt.b(new luy(captureRequest));
            ljf ljfVar = ltsVar.c.a;
            String strValueOf = String.valueOf(lB);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 20);
            sb.append("onCaptureBufferLost_");
            sb.append(strValueOf);
            ljfVar.e(sb.toString());
            lnx lnxVar = (lnx) ltsVar.b.get(surface);
            lnxVar.getClass();
            mip mipVar = (mip) ltsVar.a.get(lB);
            mipVar.getClass();
            mipVar.fv(lnxVar, j);
            synchronized (ltsVar.c) {
                ltsVar.c.h(lB.longValue());
            }
            ltsVar.c.a.f();
        } catch (Throwable th) {
            lbl.a(th);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        try {
            lts ltsVar = this.a;
            luy luyVar = new luy(captureRequest);
            lvm lvmVar = new lvm(totalCaptureResult);
            Long lB = ltt.b(luyVar);
            ljf ljfVar = ltsVar.c.a;
            String strValueOf = String.valueOf(lB);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 19);
            sb.append("onCaptureCompleted_");
            sb.append(strValueOf);
            ljfVar.e(sb.toString());
            mip mipVar = (mip) ltsVar.a.get(lB);
            mipVar.getClass();
            mipVar.b(lvmVar);
            synchronized (ltsVar.c) {
                ltsVar.c.h(lB.longValue());
            }
            ltsVar.c.a.f();
        } catch (Throwable th) {
            lbl.a(th);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        try {
            this.a.b(new luy(captureRequest), new lux(captureFailure));
        } catch (Throwable th) {
            lbl.a(th);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        try {
            lts ltsVar = this.a;
            luy luyVar = new luy(captureRequest);
            lvb lvbVar = new lvb(captureResult);
            Long lB = ltt.b(luyVar);
            ljf ljfVar = ltsVar.c.a;
            String strValueOf = String.valueOf(lB);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 20);
            sb.append("onCaptureProgressed_");
            sb.append(strValueOf);
            ljfVar.e(sb.toString());
            mip mipVar = (mip) ltsVar.a.get(lB);
            mipVar.getClass();
            mipVar.fH(lvbVar);
            ltsVar.c.a.f();
        } catch (Throwable th) {
            lbl.a(th);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        try {
            lts ltsVar = this.a;
            ljf ljfVar = ltsVar.c.a;
            StringBuilder sb = new StringBuilder(36);
            sb.append("onCaptureSequenceAborted_");
            sb.append(i);
            ljfVar.e(sb.toString());
            oti otiVarListIterator = ltsVar.a.entrySet().listIterator();
            while (otiVarListIterator.hasNext()) {
                Map.Entry entry = (Map.Entry) otiVarListIterator.next();
                ((mip) entry.getValue()).fI(((Long) entry.getKey()).longValue(), i);
            }
            ltsVar.c.a.f();
        } catch (Throwable th) {
            lbl.a(th);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        try {
            lts ltsVar = this.a;
            ljf ljfVar = ltsVar.c.a;
            StringBuilder sb = new StringBuilder(38);
            sb.append("onCaptureSequenceCompleted_");
            sb.append(i);
            ljfVar.e(sb.toString());
            oti otiVarListIterator = ltsVar.a.entrySet().listIterator();
            while (otiVarListIterator.hasNext()) {
                Map.Entry entry = (Map.Entry) otiVarListIterator.next();
                ((mip) entry.getValue()).k(((Long) entry.getKey()).longValue(), i, j);
            }
            ltsVar.c.a.f();
        } catch (Throwable th) {
            lbl.a(th);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        try {
            lts ltsVar = this.a;
            Long lB = ltt.b(new luy(captureRequest));
            ljf ljfVar = ltsVar.c.a;
            String strValueOf = String.valueOf(lB);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 17);
            sb.append("onCaptureStarted_");
            sb.append(strValueOf);
            ljfVar.e(sb.toString());
            lmw lmwVar = new lmw(j, j2, ltsVar.c.a());
            mip mipVar = (mip) ltsVar.a.get(lB);
            mipVar.getClass();
            mipVar.fJ(lmwVar);
            ltsVar.c.a.f();
        } catch (Throwable th) {
            lbl.a(th);
        }
    }
}
