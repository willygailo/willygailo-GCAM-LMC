package defpackage;

import android.content.IntentSender;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class pwv implements Runnable {
    final /* synthetic */ pxl a;

    public pwv(pxl pxlVar) {
        this.a = pxlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            pxl pxlVar = this.a;
            pxlVar.a.startIntentSenderForResult(pxlVar.b.getIntentSender(), this.a.c, null, 0, 0, 0);
        } catch (IntentSender.SendIntentException e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 43);
            sb.append("Exception while starting next VR activity: ");
            sb.append(strValueOf);
            Log.e("DaydreamApi", sb.toString());
        }
    }
}
