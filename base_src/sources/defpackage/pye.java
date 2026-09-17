package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import com.google.vr.vrcore.controller.api.ControllerServiceBridge;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class pye extends bmo implements IInterface {
    private final WeakReference a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pye(ControllerServiceBridge controllerServiceBridge, int i) {
        super("com.google.vr.vrcore.controller.api.IControllerServiceListener");
        this.b = i;
        this.a = new WeakReference(controllerServiceBridge);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pye(pya pyaVar, int i) {
        super("com.google.vr.vrcore.controller.api.IControllerListener");
        this.b = i;
        this.a = new WeakReference(pyaVar);
    }

    @Override // defpackage.bmo
    protected final boolean x(int i, Parcel parcel, Parcel parcel2) {
        switch (this.b) {
            case 0:
                switch (i) {
                    case 1:
                        parcel2.writeNoException();
                        parcel2.writeInt(25);
                        return true;
                    case 2:
                        int i2 = parcel.readInt();
                        ControllerServiceBridge controllerServiceBridge = (ControllerServiceBridge) this.a.get();
                        if (controllerServiceBridge == null || i2 != 1) {
                            return true;
                        }
                        controllerServiceBridge.b.post(new pxy(controllerServiceBridge, 2));
                        return true;
                    default:
                        return false;
                }
            default:
                switch (i) {
                    case 1:
                        parcel2.writeNoException();
                        parcel2.writeInt(25);
                        return true;
                    case 2:
                        int i3 = parcel.readInt();
                        int i4 = parcel.readInt();
                        pya pyaVar = (pya) this.a.get();
                        if (pyaVar == null) {
                            return true;
                        }
                        pyaVar.a.d(i3, i4);
                        return true;
                    case 9:
                        pya pyaVar2 = (pya) this.a.get();
                        pxu pxuVar = pyaVar2 == null ? null : pyaVar2.b;
                        parcel2.writeNoException();
                        bmp.d(parcel2, pxuVar);
                        return true;
                    case 10:
                        pxs pxsVar = (pxs) bmp.a(parcel, pxs.CREATOR);
                        pya pyaVar3 = (pya) this.a.get();
                        if (pyaVar3 == null) {
                            return true;
                        }
                        pxsVar.e(pyaVar3.c);
                        pyaVar3.a.a(pxsVar);
                        pxsVar.d();
                        return true;
                    case 11:
                        pxv pxvVar = (pxv) bmp.a(parcel, pxv.CREATOR);
                        pya pyaVar4 = (pya) this.a.get();
                        if (pyaVar4 == null) {
                            return true;
                        }
                        pxvVar.e = pyaVar4.c;
                        pyaVar4.a.c(pxvVar);
                        return true;
                    case 12:
                        pxr pxrVar = (pxr) bmp.a(parcel, pxr.CREATOR);
                        pya pyaVar5 = (pya) this.a.get();
                        if (pyaVar5 == null) {
                            return true;
                        }
                        int i5 = ControllerServiceBridge.h;
                        if (pxrVar.g != 0) {
                            long jA = pxr.a() - pxrVar.g;
                            if (jA > 300) {
                                StringBuilder sb = new StringBuilder(122);
                                sb.append("Experiencing large controller packet delivery time between service and  client: timestamp diff in ms: ");
                                sb.append(jA);
                                Log.w("VrCtl.ServiceBridge", sb.toString());
                            }
                        }
                        pxrVar.e(pyaVar5.c);
                        pyaVar5.a.b(pxrVar);
                        pxrVar.d();
                        return true;
                    default:
                        return false;
                }
        }
    }
}
