package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class kmr {
    public static final Object a = new Object();
    public static HandlerThread b;
    public static kmr h;
    public final HashMap c;
    public final Context d;
    public volatile Handler e;
    public final knx f;
    public final long g;
    private final kmt i;
    private final long j;

    public kmr() {
    }

    public kmr(Context context, Looper looper) {
        this.c = new HashMap();
        kmt kmtVar = new kmt(this);
        this.i = kmtVar;
        this.d = context.getApplicationContext();
        this.e = new ksg(looper, kmtVar);
        this.f = knx.a();
        this.j = 5000L;
        this.g = 300000L;
    }

    public final void a(String str, String str2, ServiceConnection serviceConnection, boolean z) {
        kmq kmqVar = new kmq(str, str2, z);
        synchronized (this.c) {
            kms kmsVar = (kms) this.c.get(kmqVar);
            if (kmsVar == null) {
                String strValueOf = String.valueOf(kmqVar);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(strValueOf);
                throw new IllegalStateException(sb.toString());
            }
            if (!kmsVar.a(serviceConnection)) {
                String strValueOf2 = String.valueOf(kmqVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(strValueOf2);
                throw new IllegalStateException(sb2.toString());
            }
            kmsVar.a.remove(serviceConnection);
            if (kmsVar.b()) {
                this.e.sendMessageDelayed(this.e.obtainMessage(0, kmqVar), this.j);
            }
        }
    }
}
