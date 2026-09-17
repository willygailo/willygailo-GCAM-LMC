package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: loaded from: classes.dex */
final class bka extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ bkb a;

    public bka(bkb bkbVar) {
        this.a = bkbVar;
    }

    private final void a(boolean z) {
        bmf.j(new bjz(this, z));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        a(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        a(false);
    }
}
