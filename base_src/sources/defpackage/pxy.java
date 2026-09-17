package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.vr.vrcore.controller.api.ControllerServiceBridge;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pxy implements Runnable {
    public final /* synthetic */ ControllerServiceBridge a;
    private final /* synthetic */ int b;

    public /* synthetic */ pxy(ControllerServiceBridge controllerServiceBridge, int i) {
        this.b = i;
        this.a = controllerServiceBridge;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.a.a();
                break;
            case 1:
                ControllerServiceBridge controllerServiceBridge = this.a;
                ControllerServiceBridge.d();
                if (controllerServiceBridge.f) {
                    Log.w("VrCtl.ServiceBridge", "Service is already bound.");
                } else {
                    Intent intent = new Intent("com.google.vr.vrcore.controller.BIND");
                    intent.setPackage("com.google.vr.vrcore");
                    if (!controllerServiceBridge.a.bindService(intent, controllerServiceBridge, 1)) {
                        Log.w("VrCtl.ServiceBridge", "Bind failed. Service is not available.");
                        controllerServiceBridge.e.a.h();
                    }
                    controllerServiceBridge.f = true;
                }
                break;
            default:
                ControllerServiceBridge controllerServiceBridge2 = this.a;
                ControllerServiceBridge.d();
                pyd pydVar = controllerServiceBridge2.g;
                if (pydVar != null) {
                    try {
                        Parcel parcelY = pydVar.y(10, pydVar.a());
                        int i = parcelY.readInt();
                        parcelY.recycle();
                        if (i > 0) {
                            if (controllerServiceBridge2.f) {
                                controllerServiceBridge2.b();
                            }
                        }
                    } catch (RemoteException e) {
                        String strValueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 54);
                        sb.append("Remote exception while getting number of controllers: ");
                        sb.append(strValueOf);
                        Log.w("VrCtl.ServiceBridge", sb.toString());
                    }
                }
                int size = controllerServiceBridge2.d.size();
                for (int i2 = 0; i2 < size; i2++) {
                    pya pyaVar = (pya) controllerServiceBridge2.d.valueAt(i2);
                    if (pyaVar != null) {
                        pyaVar.a.d(i2, 0);
                    }
                }
                ControllerServiceBridge.d();
                controllerServiceBridge2.d.clear();
                controllerServiceBridge2.e.a.e();
                break;
        }
    }
}
