package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes2.dex */
public final class ker extends kdu {
    public boolean a;
    public boolean c;
    private final AlarmManager d;
    private Integer e;

    protected ker(kdx kdxVar) {
        super(kdxVar);
        this.d = (AlarmManager) d().getSystemService("alarm");
    }

    @Override // defpackage.kdu
    protected final void a() {
        try {
            c();
            if (ken.b() > 0) {
                Context contextD = d();
                ActivityInfo receiverInfo = contextD.getPackageManager().getReceiverInfo(new ComponentName(contextD, "com.google.android.gms.analytics.AnalyticsReceiver"), 0);
                if (receiverInfo == null || !receiverInfo.enabled) {
                    return;
                }
                q("Receiver registered for local dispatch.");
                this.a = true;
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
    }

    public final int b() {
        if (this.e == null) {
            String strValueOf = String.valueOf(d().getPackageName());
            this.e = Integer.valueOf((strValueOf.length() != 0 ? "analytics".concat(strValueOf) : new String("analytics")).hashCode());
        }
        return this.e.intValue();
    }

    public final void c() {
        this.c = false;
        try {
            AlarmManager alarmManager = this.d;
            Context contextD = d();
            alarmManager.cancel(PendingIntent.getBroadcast(contextD, 0, new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH").setComponent(new ComponentName(contextD, "com.google.android.gms.analytics.AnalyticsReceiver")), 33554432));
        } catch (NullPointerException e) {
        }
        JobScheduler jobScheduler = (JobScheduler) d().getSystemService("jobscheduler");
        int iB = b();
        r("Cancelling job. JobID", Integer.valueOf(iB));
        jobScheduler.cancel(iB);
    }
}
