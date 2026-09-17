package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class lvm extends lvb implements lzv {
    private final TotalCaptureResult a;
    private volatile Map b;

    public lvm(TotalCaptureResult totalCaptureResult) {
        super(totalCaptureResult);
        this.b = null;
        this.a = totalCaptureResult;
    }

    @Override // defpackage.lzv
    public final Map g() {
        Map mapC = this.b;
        if (mapC == null) {
            synchronized (this) {
                mapC = this.b;
                if (mapC == null) {
                    Map<String, CaptureResult> physicalCameraResults = this.a.getPhysicalCameraResults();
                    oon oonVarM = oor.m();
                    for (String str : physicalCameraResults.keySet()) {
                        CaptureResult captureResult = physicalCameraResults.get(str);
                        if (captureResult != null) {
                            oonVarM.e(str, new lvb(captureResult));
                        }
                    }
                    mapC = oonVarM.c();
                    this.b = mapC;
                }
            }
        }
        return mapC;
    }

    @Override // defpackage.lzl
    public final kkm j() {
        return new kkm(this.a);
    }

    public final String toString() {
        ojb ojbVarBa = obr.ba("TotalCaptureResult");
        ojbVarBa.f("FrameNumber", b());
        ojbVarBa.e("SequenceNumber", a());
        return ojbVarBa.toString();
    }
}
