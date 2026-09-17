package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class kqh extends Service {
    private krj b;
    private final kri c = new kri(this);
    private final Object a = new Object();

    private final krj a() {
        krj krjVar;
        synchronized (this.a) {
            krjVar = this.b;
        }
        return krjVar;
    }

    @Deprecated
    public void c(String str, byte[] bArr, byte[] bArr2, kre kreVar) {
        throw null;
    }

    public void d(String str, byte[] bArr, byte[] bArr2, kre kreVar) {
        c(str, bArr, bArr2, kreVar);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        krj krjVar;
        if (!"com.google.android.gms.learning.EXAMPLE_STORE_V2".equals(intent.getAction())) {
            String strValueOf = String.valueOf(intent.getAction());
            return new krk(strValueOf.length() != 0 ? "Received connection with unexpected action ".concat(strValueOf) : new String("Received connection with unexpected action "));
        }
        synchronized (this.a) {
            krjVar = this.b;
            if (krjVar == null) {
                try {
                    krjVar = (krj) krp.a(this, "com.google.android.gms.learning.dynamite.proxy.InAppExampleStoreProxyImpl", krw.b);
                    try {
                        koh kohVarB = kog.b(this);
                        kri kriVar = this.c;
                        Parcel parcelA = krjVar.a();
                        bmp.e(parcelA, kohVarB);
                        bmp.e(parcelA, kriVar);
                        krjVar.z(1, parcelA);
                        this.b = krjVar;
                    } catch (RemoteException e) {
                        if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                            Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.init", e);
                        }
                        return new krk("No IInAppExampleStoreProxy implementation found");
                    }
                } catch (krn e2) {
                    if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                        Log.w("brella.InAppExStProxy", "LoadingException during onBind", e2);
                    }
                    return new krk("No IInAppExampleStoreProxy implementation found");
                }
            }
        }
        try {
            Parcel parcelA2 = krjVar.a();
            bmp.c(parcelA2, intent);
            Parcel parcelY = krjVar.y(3, parcelA2);
            IBinder strongBinder = parcelY.readStrongBinder();
            parcelY.recycle();
            return strongBinder;
        } catch (RemoteException e3) {
            if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onBind", e3);
            }
            return new krk("No IInAppExampleStoreProxy implementation found");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        krj krjVarA = a();
        if (krjVarA != null) {
            try {
                krjVarA.z(2, krjVarA.a());
            } catch (RemoteException e) {
                if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onCreate", e);
                }
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        krj krjVarA = a();
        if (krjVarA != null) {
            try {
                Parcel parcelA = krjVarA.a();
                bmp.c(parcelA, intent);
                krjVarA.z(6, parcelA);
                return;
            } catch (RemoteException e) {
                if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onRebind", e);
                }
            }
        }
        super.onRebind(intent);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        krj krjVarA = a();
        if (krjVarA != null) {
            try {
                Parcel parcelA = krjVarA.a();
                parcelA.writeInt(i);
                krjVarA.z(4, parcelA);
            } catch (RemoteException e) {
                if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onTrimMemory", e);
                }
            }
        }
        super.onTrimMemory(i);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        krj krjVarA = a();
        if (krjVarA != null) {
            try {
                Parcel parcelA = krjVarA.a();
                bmp.c(parcelA, intent);
                Parcel parcelY = krjVarA.y(5, parcelA);
                boolean zF = bmp.f(parcelY);
                parcelY.recycle();
                return zF;
            } catch (RemoteException e) {
                if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onUnbind", e);
                }
            }
        }
        return super.onUnbind(intent);
    }
}
