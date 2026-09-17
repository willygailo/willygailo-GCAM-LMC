package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.vr.ndk.base.DaydreamApi;

/* JADX INFO: loaded from: classes2.dex */
public final class pwt implements Runnable {
    final /* synthetic */ DaydreamApi a;
    final /* synthetic */ pxl b;

    public pwt(DaydreamApi daydreamApi, pxl pxlVar) {
        this.a = daydreamApi;
        this.b = pxlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pxk pxkVar = this.a.f;
        if (pxkVar != null) {
            try {
                pxl pxlVar = this.b;
                Parcel parcelA = pxkVar.a();
                bmp.e(parcelA, pxlVar);
                Parcel parcelY = pxkVar.y(9, parcelA);
                boolean zF = bmp.f(parcelY);
                parcelY.recycle();
                if (zF) {
                    return;
                }
            } catch (RemoteException e) {
                Log.e("DaydreamApi", "RemoteException while launching VR transition: ", e);
            }
        }
        Log.w("DaydreamApi", "Can't launch callbacks via DaydreamManager, sending manually");
        try {
            this.b.b();
        } catch (RemoteException e2) {
        }
    }
}
