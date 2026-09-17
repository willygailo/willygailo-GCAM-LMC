package com.google.vr.vrcore.controller.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import defpackage.bmp;
import defpackage.poy;
import defpackage.pxj;
import defpackage.pxr;
import defpackage.pxs;
import defpackage.pxu;
import defpackage.pxv;
import defpackage.pxx;
import defpackage.pxy;
import defpackage.pxz;
import defpackage.pya;
import defpackage.pyd;
import defpackage.pye;
import defpackage.pyf;
import defpackage.pyg;
import defpackage.pyh;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class ControllerServiceBridge implements ServiceConnection {
    public static final /* synthetic */ int h = 0;
    private static final AtomicInteger i = new AtomicInteger(-1);
    public final Context a;
    public final Handler b;
    final String c;
    public final SparseArray d;
    public pya e;
    public boolean f;
    public pyd g;
    private final int j;
    private final pye k;

    public interface Callbacks {
        void a(pxs pxsVar);

        void b(pxr pxrVar);

        void c(pxv pxvVar);

        void d(int i, int i2);

        void e();

        void f();

        void g(int i);

        void h();

        void i();
    }

    public ControllerServiceBridge(Context context, Callbacks callbacks, int i2) {
        pxu pxuVar = new pxu(i2);
        SparseArray sparseArray = new SparseArray();
        this.d = sparseArray;
        this.a = context.getApplicationContext();
        int vrCoreClientApiVersion = 0;
        pya pyaVar = new pya(callbacks, pxuVar, 0);
        this.e = pyaVar;
        sparseArray.put(pyaVar.c, pyaVar);
        this.b = new Handler(Looper.getMainLooper());
        this.k = new pye(this, 0);
        try {
            vrCoreClientApiVersion = VrCoreUtils.getVrCoreClientApiVersion(context);
        } catch (pxj e) {
        }
        this.j = vrCoreClientApiVersion;
        int iIncrementAndGet = i.incrementAndGet();
        StringBuilder sb = new StringBuilder(30);
        sb.append("VrCtl.ServiceBridge");
        sb.append(iIncrementAndGet);
        this.c = sb.toString();
    }

    public static final void d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("This should be running on the main thread.");
        }
    }

    private final boolean e(int i2, pya pyaVar) {
        try {
            pyd pydVar = this.g;
            String str = this.c;
            pye pyeVar = new pye(pyaVar, 1);
            Parcel parcelA = pydVar.a();
            parcelA.writeInt(i2);
            parcelA.writeString(str);
            bmp.e(parcelA, pyeVar);
            Parcel parcelY = pydVar.y(5, parcelA);
            boolean zF = bmp.f(parcelY);
            parcelY.recycle();
            return zF;
        } catch (RemoteException e) {
            Log.w("VrCtl.ServiceBridge", "RemoteException while registering listener.", e);
            return false;
        }
    }

    public final void a() {
        d();
        if (!this.f) {
            Log.w("VrCtl.ServiceBridge", "Service is already unbound.");
            return;
        }
        d();
        pyd pydVar = this.g;
        if (pydVar != null) {
            try {
                String str = this.c;
                Parcel parcelA = pydVar.a();
                parcelA.writeString(str);
                Parcel parcelY = pydVar.y(6, parcelA);
                bmp.f(parcelY);
                parcelY.recycle();
            } catch (RemoteException e) {
                Log.w("VrCtl.ServiceBridge", "RemoteException while unregistering listeners.", e);
            }
        }
        if (this.j >= 21) {
            try {
                pyd pydVar2 = this.g;
                if (pydVar2 != null) {
                    pye pyeVar = this.k;
                    Parcel parcelA2 = pydVar2.a();
                    bmp.e(parcelA2, pyeVar);
                    Parcel parcelY2 = pydVar2.y(9, parcelA2);
                    boolean zF = bmp.f(parcelY2);
                    parcelY2.recycle();
                    if (!zF) {
                        Log.w("VrCtl.ServiceBridge", "Failed to unregister remote service listener.");
                    }
                }
            } catch (RemoteException e2) {
                String strValueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 55);
                sb.append("Exception while unregistering remote service listener: ");
                sb.append(strValueOf);
                Log.w("VrCtl.ServiceBridge", sb.toString());
            }
        }
        this.a.unbindService(this);
        this.g = null;
        this.f = false;
    }

    public final void b() {
        this.e.a.i();
        pya pyaVar = this.e;
        if (e(pyaVar.c, pyaVar)) {
            SparseArray sparseArray = this.d;
            pya pyaVar2 = this.e;
            sparseArray.put(pyaVar2.c, pyaVar2);
        } else {
            Log.w("VrCtl.ServiceBridge", "Failed to register service listener.");
            this.e.a.f();
            a();
        }
    }

    public final void c(int i2, pxx pxxVar) {
        d();
        pyd pydVar = this.g;
        if (pydVar == null) {
            Log.w("VrCtl.ServiceBridge", "Vibration cancelled: service not connected");
            return;
        }
        try {
            Parcel parcelA = pydVar.a();
            parcelA.writeInt(i2);
            bmp.c(parcelA, pxxVar);
            pydVar.z(11, parcelA);
        } catch (RemoteException e) {
            Log.w("VrCtl.ServiceBridge", "RemoteException while vibrating the controller.", e);
        }
    }

    public void controllerHapticsEffect(int i2, int i3, int i4) {
        poy poyVarM = pyh.d.m();
        poy poyVarM2 = pyf.d.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pyf pyfVar = (pyf) poyVarM2.b;
        int i5 = pyfVar.a | 1;
        pyfVar.a = i5;
        pyfVar.b = i3;
        pyfVar.a = i5 | 2;
        pyfVar.c = i4;
        pyf pyfVar2 = (pyf) poyVarM2.j();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pyh pyhVar = (pyh) poyVarM.b;
        pyfVar2.getClass();
        pyhVar.c = pyfVar2;
        pyhVar.a |= 2;
        pyh pyhVar2 = (pyh) poyVarM.j();
        pxx pxxVar = new pxx();
        pxxVar.a(pyhVar2);
        this.b.post(new pxz(this, i2, pxxVar, 1));
    }

    public boolean createAndConnectController(int i2, Callbacks callbacks, int i3) {
        pxu pxuVar = new pxu(i3);
        d();
        if (this.g == null) {
            return false;
        }
        pya pyaVar = new pya(callbacks, pxuVar, i2);
        if (e(pyaVar.c, pyaVar)) {
            if (pyaVar.c == 0) {
                this.e = pyaVar;
            }
            this.d.put(i2, pyaVar);
            return true;
        }
        if (i2 == 0) {
            Log.e("VrCtl.ServiceBridge", "Failed to connect controller 0.");
            i2 = 0;
        }
        this.d.remove(i2);
        return false;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        pyd pydVar;
        String string;
        d();
        if (this.f) {
            if (iBinder == null) {
                pydVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.controller.api.IControllerService");
                pydVar = iInterfaceQueryLocalInterface instanceof pyd ? (pyd) iInterfaceQueryLocalInterface : new pyd(iBinder);
            }
            this.g = pydVar;
            try {
                Parcel parcelA = pydVar.a();
                parcelA.writeInt(25);
                Parcel parcelY = pydVar.y(1, parcelA);
                int i2 = parcelY.readInt();
                parcelY.recycle();
                if (i2 != 0) {
                    switch (i2) {
                        case 0:
                            string = "SUCCESS";
                            break;
                        case 1:
                            string = "FAILED_UNSUPPORTED";
                            break;
                        case 2:
                            string = "FAILED_NOT_AUTHORIZED";
                            break;
                        case 3:
                            string = "FAILED_CLIENT_OBSOLETE";
                            break;
                        default:
                            StringBuilder sb = new StringBuilder(45);
                            sb.append("[UNKNOWN CONTROLLER INIT RESULT: ");
                            sb.append(i2);
                            sb.append("]");
                            string = sb.toString();
                            break;
                    }
                    String strValueOf = String.valueOf(string);
                    Log.e("VrCtl.ServiceBridge", strValueOf.length() != 0 ? "initialize() returned error: ".concat(strValueOf) : new String("initialize() returned error: "));
                    this.e.a.g(i2);
                    a();
                    return;
                }
                if (this.j >= 21) {
                    try {
                        pyd pydVar2 = this.g;
                        pye pyeVar = this.k;
                        Parcel parcelA2 = pydVar2.a();
                        bmp.e(parcelA2, pyeVar);
                        Parcel parcelY2 = pydVar2.y(8, parcelA2);
                        boolean zF = bmp.f(parcelY2);
                        parcelY2.recycle();
                        if (!zF) {
                            Log.e("VrCtl.ServiceBridge", "Failed to register remote service listener.");
                            this.e.a.g(0);
                            a();
                            return;
                        }
                    } catch (RemoteException e) {
                        String strValueOf2 = String.valueOf(e);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 53);
                        sb2.append("Exception while registering remote service listener: ");
                        sb2.append(strValueOf2);
                        Log.w("VrCtl.ServiceBridge", sb2.toString());
                    }
                }
                b();
            } catch (RemoteException e2) {
                Log.e("VrCtl.ServiceBridge", "Failed to call initialize() on controller service (RemoteException).", e2);
                this.e.a.f();
                a();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        d();
        this.g = null;
        this.e.a.e();
    }

    public void requestBind() {
        this.b.post(new pxy(this, 1));
    }

    public void requestUnbind() {
        this.b.post(new pxy(this, 0));
    }

    public void vibrateController(int i2, int i3, int i4, int i5) {
        poy poyVarM = pyh.d.m();
        poy poyVarM2 = pyg.e.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pyg pygVar = (pyg) poyVarM2.b;
        int i6 = pygVar.a | 1;
        pygVar.a = i6;
        pygVar.b = i3;
        int i7 = i6 | 2;
        pygVar.a = i7;
        pygVar.c = i4;
        pygVar.a = i7 | 4;
        pygVar.d = i5;
        pyg pygVar2 = (pyg) poyVarM2.j();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pyh pyhVar = (pyh) poyVarM.b;
        pygVar2.getClass();
        pyhVar.b = pygVar2;
        pyhVar.a |= 1;
        pyh pyhVar2 = (pyh) poyVarM.j();
        pxx pxxVar = new pxx();
        pxxVar.a(pyhVar2);
        this.b.post(new pxz(this, i2, pxxVar, 0));
    }
}
