package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes2.dex */
final class kfb extends BroadcastReceiver {
    static final String a = kfb.class.getName();
    public final kdx b;
    public boolean c;
    public boolean d;

    public kfb(kdx kdxVar) {
        this.b = kdxVar;
    }

    private final kds e() {
        return this.b.b();
    }

    private final kfa f() {
        return this.b.d();
    }

    public final Context a() {
        return this.b.a;
    }

    public final void b() {
        f();
        e();
    }

    public final void c() {
        if (this.c) {
            this.b.d().q("Unregistering connectivity change receiver");
            this.c = false;
            this.d = false;
            try {
                a().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                f().o("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    protected final boolean d() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) a().getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (SecurityException e) {
            return false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        b();
        String action = intent.getAction();
        this.b.d().r("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean zD = d();
            if (this.d != zD) {
                this.d = zD;
                kds kdsVarE = e();
                kdsVarE.r("Network connectivity status changed", Boolean.valueOf(zD));
                kdsVarE.e().b(new kdq(kdsVarE));
                return;
            }
            return;
        }
        if (!"com.google.analytics.RADIO_POWERED".equals(action)) {
            this.b.d().u("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        if (intent.hasExtra(a)) {
            return;
        }
        kds kdsVarE2 = e();
        kdsVarE2.q("Radio powered up");
        kdsVarE2.z();
        Context contextD = kdsVarE2.d();
        if (!kfg.a(contextD) || !kfl.d(contextD)) {
            kdsVarE2.b(null);
            return;
        }
        Intent intent2 = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent2.setComponent(new ComponentName(contextD, "com.google.android.gms.analytics.AnalyticsService"));
        contextD.startService(intent2);
    }
}
