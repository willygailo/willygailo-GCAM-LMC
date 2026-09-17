package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes.dex */
public final class apu extends aps {
    static final String f = kus.g("NetworkStateTracker");
    public static final /* synthetic */ int g = 0;
    private final ConnectivityManager h;
    private final apt i;

    public apu(Context context, aso asoVar) {
        super(context, asoVar);
        this.h = (ConnectivityManager) this.a.getSystemService("connectivity");
        this.i = new apt(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.aps
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final apb b() {
        boolean z;
        NetworkInfo activeNetworkInfo = this.h.getActiveNetworkInfo();
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            NetworkCapabilities networkCapabilities = this.h.getNetworkCapabilities(this.h.getActiveNetwork());
            z = networkCapabilities != null && networkCapabilities.hasCapability(16);
        } catch (SecurityException e) {
            kus.l();
            kus.i(f, "Unable to validate active network", e);
            z = false;
        }
        return new apb(z2, z, this.h.isActiveNetworkMetered(), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }

    @Override // defpackage.aps
    public final void d() {
        try {
            kus.l().h(new Throwable[0]);
            this.h.registerDefaultNetworkCallback(this.i);
        } catch (IllegalArgumentException | SecurityException e) {
            kus.l();
            kus.i(f, "Received exception while registering network callback", e);
        }
    }

    @Override // defpackage.aps
    public final void e() {
        try {
            kus.l().h(new Throwable[0]);
            this.h.unregisterNetworkCallback(this.i);
        } catch (IllegalArgumentException | SecurityException e) {
            kus.l();
            kus.i(f, "Received exception while unregistering network callback", e);
        }
    }
}
