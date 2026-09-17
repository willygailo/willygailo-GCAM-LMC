package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.vr.ndk.base.DaydreamApi;

/* JADX INFO: loaded from: classes2.dex */
public final class pwu implements Runnable {
    final /* synthetic */ DaydreamApi a;
    private final /* synthetic */ int b;

    public pwu(DaydreamApi daydreamApi, int i) {
        this.b = i;
        this.a = daydreamApi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                pxk pxkVar = this.a.f;
                if (pxkVar == null) {
                    Log.e("DaydreamApi", "Can't launch VR homescreen via DaydreamManager. Giving up trying to leave current VR activity...");
                    break;
                } else {
                    try {
                        Parcel parcelY = pxkVar.y(8, pxkVar.a());
                        boolean zF = bmp.f(parcelY);
                        parcelY.recycle();
                        if (!zF) {
                            Log.e("DaydreamApi", "There is no VR homescreen installed.");
                            break;
                        }
                    } catch (RemoteException e) {
                        String strValueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 47);
                        sb.append("RemoteException while launching VR homescreen: ");
                        sb.append(strValueOf);
                        Log.e("DaydreamApi", sb.toString());
                        return;
                    }
                }
                break;
            default:
                (this.a.a.getApplicationContext() != null ? this.a.a.getApplicationContext() : this.a.a).unbindService(this.a.d);
                this.a.e = null;
                break;
        }
    }
}
