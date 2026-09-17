package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes2.dex */
final class jal extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ jap a;

    public jal(jap japVar) {
        this.a = japVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        super.onCapabilitiesChanged(network, networkCapabilities);
        int iEf = mip.ef(this.a.a);
        jap japVar = this.a;
        if (iEf != japVar.c) {
            japVar.b(false);
        }
    }
}
