package defpackage;

import com.google.android.apps.camera.ui.preference.MaterialStorageStatusPreference;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class ila {
    public final ilo a;
    public final ScheduledExecutorService b;
    public final lar c;
    public final fjs d;
    public MaterialStorageStatusPreference e;
    public ilv f;
    public final ilx g;
    private final ilg h;

    public ila(ilo iloVar, ilx ilxVar, ilg ilgVar, ScheduledExecutorService scheduledExecutorService, lar larVar, fjs fjsVar) {
        this.a = iloVar;
        this.g = ilxVar;
        this.h = ilgVar;
        this.b = scheduledExecutorService;
        this.c = larVar;
        this.d = fjsVar;
    }

    public final void a() {
        ilv ilvVar = this.f;
        if (ilvVar != null) {
            ilf ilfVarA = this.h.a(ilvVar);
            MaterialStorageStatusPreference materialStorageStatusPreference = this.e;
            long j = ilvVar.b;
            long j2 = ilvVar.c;
            int i = ilfVarA.a;
            int i2 = ilfVarA.b;
            materialStorageStatusPreference.a = j;
            materialStorageStatusPreference.b = j2;
            materialStorageStatusPreference.c = i;
            materialStorageStatusPreference.d = i2;
            materialStorageStatusPreference.k();
        }
    }
}
