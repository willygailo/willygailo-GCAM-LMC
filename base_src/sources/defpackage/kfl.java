package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class kfl {
    private static Boolean c;
    public final Handler a = new ksg();
    public final Context b;

    public kfl(Context context) {
        this.b = context;
    }

    public static boolean d(Context context) {
        mip.dk(context);
        Boolean bool = c;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"), 0);
            if (serviceInfo != null && serviceInfo.enabled) {
                z = true;
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        c = Boolean.valueOf(z);
        return z;
    }

    public final void a() {
        kdx kdxVarC = kdx.c(this.b);
        kfa kfaVarD = kdxVarC.d();
        ken kenVar = kdxVarC.c;
        kfaVarD.q("Local AnalyticsService is starting up");
    }

    public final void b() {
        kdx kdxVarC = kdx.c(this.b);
        kfa kfaVarD = kdxVarC.d();
        ken kenVar = kdxVarC.c;
        kfaVarD.q("Local AnalyticsService is shutting down");
    }

    public final void c(Runnable runnable) {
        kdx.c(this.b).b().b(new kfj(this, runnable));
    }

    public final void e(Intent intent, final int i) {
        try {
            synchronized (kfg.a) {
                try {
                    kut kutVar = kfg.b;
                    if (kutVar != null && kutVar.b()) {
                        if (kutVar.m.decrementAndGet() < 0) {
                            Log.e("WakeLock", kutVar.j.concat(" release without a matched acquire!"));
                        }
                        synchronized (kutVar.b) {
                            kutVar.c();
                            if (kutVar.l.containsKey(null)) {
                                kus kusVar = (kus) kutVar.l.get(null);
                                if (kusVar != null) {
                                    int i2 = kusVar.a - 1;
                                    kusVar.a = i2;
                                    if (i2 == 0) {
                                        kutVar.l.remove(null);
                                    }
                                }
                            } else {
                                Log.w("WakeLock", kutVar.j.concat(" counter does not exist"));
                            }
                            kutVar.d();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (SecurityException e) {
        }
        kdx kdxVarC = kdx.c(this.b);
        final kfa kfaVarD = kdxVarC.d();
        if (intent == null) {
            kfaVarD.t("AnalyticsService started with null intent");
            return;
        }
        String action = intent.getAction();
        ken kenVar = kdxVarC.c;
        kfaVarD.s("Local AnalyticsService called. startId, action", Integer.valueOf(i), action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            c(new Runnable() { // from class: kfh
                @Override // java.lang.Runnable
                public final void run() {
                    kfl kflVar = this.a;
                    int i3 = i;
                    kfa kfaVar = kfaVarD;
                    if (((kfk) kflVar.b).a(i3)) {
                        kfaVar.q("Local AnalyticsService processed last dispatch request");
                    }
                }
            });
        }
    }
}
