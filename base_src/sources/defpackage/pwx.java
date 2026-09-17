package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.vr.ndk.base.DaydreamApi;

/* JADX INFO: loaded from: classes2.dex */
public final class pwx implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ PendingIntent b;
    final /* synthetic */ DaydreamApi c;

    public pwx(DaydreamApi daydreamApi, Runnable runnable, PendingIntent pendingIntent) {
        this.c = daydreamApi;
        this.a = runnable;
        this.b = pendingIntent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DaydreamApi daydreamApi = this.c;
        pxk pxkVar = daydreamApi.f;
        if (pxkVar == null) {
            Log.w("DaydreamApi", "Failed to exit VR: Daydream service unavailable.");
            this.a.run();
            return;
        }
        try {
            if (daydreamApi.c < 23) {
                PendingIntent pendingIntent = this.b;
                Parcel parcelA = pxkVar.a();
                bmp.c(parcelA, pendingIntent);
                Parcel parcelY = pxkVar.y(10, parcelA);
                boolean zF = bmp.f(parcelY);
                parcelY.recycle();
                if (zF) {
                    return;
                }
                Log.w("DaydreamApi", "Failed to exit VR: Invalid request.");
                this.a.run();
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXIT_VR_INTENT_KEY", this.b);
            bundle.putString("EXIT_VR_TEXT_KEY", null);
            pxk pxkVar2 = this.c.f;
            Parcel parcelA2 = pxkVar2.a();
            bmp.c(parcelA2, bundle);
            Parcel parcelY2 = pxkVar2.y(17, parcelA2);
            boolean zF2 = bmp.f(parcelY2);
            parcelY2.recycle();
            if (zF2) {
                return;
            }
            Log.w("DaydreamApi", "Failed to exit VR: Invalid request.");
            this.a.run();
        } catch (RemoteException e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 49);
            sb.append("Failed to exit VR: RemoteException while exiting:");
            sb.append(strValueOf);
            Log.e("DaydreamApi", sb.toString());
            this.a.run();
        }
    }
}
