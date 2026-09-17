package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class kfn extends kdu {
    protected String a;
    protected String c;
    protected boolean d;
    protected int e;
    public boolean f;
    public boolean g;

    public kfn(kdx kdxVar) {
        super(kdxVar);
    }

    @Override // defpackage.kdu
    protected final void a() {
        ApplicationInfo applicationInfo;
        int i;
        int i2;
        Context contextD = d();
        try {
            applicationInfo = contextD.getPackageManager().getApplicationInfo(contextD.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            u("PackageManager doesn't know about the app package", e);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            t("Couldn't get ApplicationInfo to load global config");
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle == null || (i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource")) <= 0) {
            return;
        }
        kdx kdxVar = this.b;
        kew kewVarDJ = mip.dJ(i, new kev(kdxVar), new kdt(kdxVar));
        if (kewVarDJ != null) {
            q("Loading global XML config values");
            String str = kewVarDJ.a;
            if (str != null) {
                this.c = str;
                m("XML config - app name", str);
            }
            String str2 = kewVarDJ.b;
            if (str2 != null) {
                this.a = str2;
                m("XML config - app version", str2);
            }
            String str3 = kewVarDJ.c;
            if (str3 != null) {
                String lowerCase = str3.toLowerCase(Locale.US);
                if ("verbose".equals(lowerCase)) {
                    i2 = 0;
                } else if ("info".equals(lowerCase)) {
                    i2 = 1;
                } else if ("warning".equals(lowerCase)) {
                    i2 = 2;
                } else {
                    i2 = "error".equals(lowerCase) ? 3 : -1;
                }
                if (i2 >= 0) {
                    r("XML config - log level", Integer.valueOf(i2));
                }
            }
            int i3 = kewVarDJ.d;
            if (i3 >= 0) {
                this.e = i3;
                this.d = true;
                m("XML config - dispatch period (sec)", Integer.valueOf(i3));
            }
            int i4 = kewVarDJ.e;
            if (i4 != -1) {
                boolean z = 1 == i4;
                this.g = z;
                this.f = true;
                m("XML config - dry run", Boolean.valueOf(z));
            }
        }
    }
}
