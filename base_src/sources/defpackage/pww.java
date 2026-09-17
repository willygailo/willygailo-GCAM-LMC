package defpackage;

import android.app.PendingIntent;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class pww implements Runnable {
    final /* synthetic */ PendingIntent a;

    public pww(PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.send(0);
        } catch (Exception e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 31);
            sb.append("Couldn't launch PendingIntent: ");
            sb.append(strValueOf);
            Log.e("DaydreamApi", sb.toString());
        }
    }
}
