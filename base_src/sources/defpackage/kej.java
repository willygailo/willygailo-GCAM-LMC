package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
final class kej implements Runnable {
    final /* synthetic */ kel a;

    public kej(kel kelVar) {
        this.a = kelVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zDI;
        kel kelVar = this.a;
        kelVar.z();
        kdo.a();
        Context context = kelVar.b.a;
        if (!kfg.a(context)) {
            kelVar.t("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!kfl.d(context)) {
            kelVar.n("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        mip.dk(context);
        if (kdf.a != null) {
            zDI = kdf.a.booleanValue();
        } else {
            zDI = mip.dI(context, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
            kdf.a = Boolean.valueOf(zDI);
        }
        if (!zDI) {
            kelVar.t("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        kff kffVarJ = kelVar.j();
        kdo.a();
        kffVarJ.z();
        if (kffVarJ.c == 0) {
            long j = kffVarJ.a.getLong("first_run", 0L);
            if (j != 0) {
                kffVarJ.c = j;
            } else {
                kffVarJ.y();
                long jCurrentTimeMillis = System.currentTimeMillis();
                SharedPreferences.Editor editorEdit = kffVarJ.a.edit();
                editorEdit.putLong("first_run", jCurrentTimeMillis);
                if (!editorEdit.commit()) {
                    kffVarJ.t("Failed to commit first run time");
                }
                kffVarJ.c = jCurrentTimeMillis;
            }
        }
        if (!kelVar.G("android.permission.ACCESS_NETWORK_STATE")) {
            kelVar.n("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            kelVar.E();
        }
        if (!kelVar.G("android.permission.INTERNET")) {
            kelVar.n("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            kelVar.E();
        }
        if (kfl.d(kelVar.d())) {
            kelVar.q("AnalyticsService registered in the app manifest and enabled");
        } else {
            kelVar.t("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!kelVar.f && !kelVar.c.H()) {
            kelVar.C();
        }
        kelVar.F();
    }
}
