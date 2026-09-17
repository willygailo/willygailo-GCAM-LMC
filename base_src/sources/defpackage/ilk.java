package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.camera.ui.preference.StorageStatusPreference;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class ilk {
    public final ilo a;
    public final ScheduledExecutorService b;
    public final lar c;
    public final fjs d;
    public final boolean e;
    public StorageStatusPreference f;
    public ilv g;
    public final ilx h;
    private final ilg i;

    public ilk(ilo iloVar, ilx ilxVar, ilg ilgVar, ScheduledExecutorService scheduledExecutorService, lar larVar, fjs fjsVar, ddf ddfVar) {
        this.a = iloVar;
        this.h = ilxVar;
        this.i = ilgVar;
        this.b = scheduledExecutorService;
        this.c = larVar;
        this.d = fjsVar;
        this.e = ddfVar.k(ddl.ay);
    }

    public static Intent a(Context context, ddf ddfVar) {
        Intent intent = new Intent();
        ddi ddiVar = ddl.a;
        ddfVar.b();
        intent.setClassName(context, "com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity");
        intent.putExtra("pref_open_setting_page", "pref_category_storage");
        intent.putExtra("pref_make_setting_page_root", true);
        return intent;
    }

    public final void b() {
        ilv ilvVar = this.g;
        if (ilvVar != null) {
            ilf ilfVarA = this.i.a(ilvVar);
            boolean z = false;
            boolean z2 = ilfVarA.c || ilfVarA.d;
            if (ilfVarA.e || ilfVarA.f) {
                z = true;
            }
            StorageStatusPreference storageStatusPreference = this.f;
            long j = ilvVar.b;
            long j2 = ilvVar.c;
            int i = ilfVarA.a;
            int i2 = ilfVarA.b;
            storageStatusPreference.a = j;
            storageStatusPreference.b = j2;
            storageStatusPreference.c = i;
            storageStatusPreference.d = i2;
            storageStatusPreference.f = z2;
            storageStatusPreference.g = z;
            storageStatusPreference.a();
        }
    }
}
