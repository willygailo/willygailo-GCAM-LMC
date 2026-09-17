package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;

/* JADX INFO: loaded from: classes.dex */
final class aul extends CameraDevice.StateCallback {
    final /* synthetic */ aup a;

    public aul(aup aupVar) {
        this.a = aupVar;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        axp.c(aur.a, "Camera device '" + this.a.b + "' was disconnected");
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        axp.a(aur.a, "Camera device '" + this.a.b + "' encountered error code '" + i + '\'');
        aup aupVar = this.a;
        avw avwVar = aupVar.a;
        if (avwVar != null) {
            int i2 = aupVar.b;
            avwVar.c(i2, aupVar.c(i2));
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        aup aupVar = this.a;
        aupVar.d = cameraDevice;
        if (aupVar.a != null) {
            try {
                CameraCharacteristics cameraCharacteristics = aupVar.q.e.getCameraCharacteristics(aupVar.c);
                awz awzVarB = this.a.q.b().b(this.a.b);
                aup aupVar2 = this.a;
                aur aurVar = aupVar2.q;
                aupVar2.e = new aui(aurVar, aurVar, aupVar2.b, awzVarB, cameraCharacteristics);
                this.a.f = new axr();
                this.a.g = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                this.a.h = ((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2;
                this.a.a(2);
                aup aupVar3 = this.a;
                aupVar3.a.b(aupVar3.e);
            } catch (CameraAccessException e) {
                aup aupVar4 = this.a;
                avw avwVar = aupVar4.a;
                int i = aupVar4.b;
                avwVar.c(i, aupVar4.c(i));
            }
        }
    }
}
