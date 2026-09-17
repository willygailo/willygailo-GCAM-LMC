package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.vr.ndk.base.DaydreamApi;

/* JADX INFO: loaded from: classes2.dex */
public final class pws implements Runnable {
    final /* synthetic */ PendingIntent a;
    final /* synthetic */ ComponentName b;
    final /* synthetic */ DaydreamApi c;

    public pws(DaydreamApi daydreamApi, PendingIntent pendingIntent, ComponentName componentName) {
        this.c = daydreamApi;
        this.a = pendingIntent;
        this.b = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pxk pxkVar = this.c.f;
        if (pxkVar == null) {
            Log.w("DaydreamApi", "Can't launch PendingIntent via DaydreamManager: not available.");
            try {
                this.a.send();
                return;
            } catch (Exception e) {
                Log.e("DaydreamApi", "Couldn't launch PendingIntent: ", e);
                return;
            }
        }
        try {
            PendingIntent pendingIntent = this.a;
            ComponentName componentName = this.b;
            Parcel parcelA = pxkVar.a();
            bmp.c(parcelA, pendingIntent);
            bmp.c(parcelA, componentName);
            Parcel parcelY = pxkVar.y(7, parcelA);
            bmp.f(parcelY);
            parcelY.recycle();
        } catch (RemoteException e2) {
            Log.e("DaydreamApi", "RemoteException while launching PendingIntent in VR.", e2);
        }
    }
}
