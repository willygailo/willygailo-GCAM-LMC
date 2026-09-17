package androidx.core.app;

import android.app.PendingIntent;
import android.support.v4.app.RemoteActionCompat;
import android.support.v4.graphics.drawable.IconCompat;
import defpackage.aks;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(aks aksVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) aksVar.t(remoteActionCompat.a);
        remoteActionCompat.b = aksVar.d(remoteActionCompat.b, 2);
        remoteActionCompat.c = aksVar.d(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) aksVar.b(remoteActionCompat.d, 4);
        remoteActionCompat.e = aksVar.l(remoteActionCompat.e, 5);
        remoteActionCompat.f = aksVar.l(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, aks aksVar) {
        aksVar.u(remoteActionCompat.a);
        aksVar.g(remoteActionCompat.b, 2);
        aksVar.g(remoteActionCompat.c, 3);
        aksVar.i(remoteActionCompat.d, 4);
        aksVar.f(remoteActionCompat.e, 5);
        aksVar.f(remoteActionCompat.f, 6);
    }
}
