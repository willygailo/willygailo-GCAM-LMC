package defpackage;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import defpackage.adz;
import defpackage.aee;

/* JADX INFO: loaded from: classes.dex */
public final class ajn {
    public final ajm a = new ajm();
    private final ajo b;

    private ajn(ajo ajoVar) {
        this.b = ajoVar;
    }

    public static ajn a(ajo ajoVar) {
        return new ajn(ajoVar);
    }

    public final void b(Bundle bundle) {
        aeb aebVarC = this.b.C();
        if (aebVarC.a != aea.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        aebVarC.b(new Recreator(this.b));
        ajm ajmVar = this.a;
        if (ajmVar.c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            ajmVar.b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        aebVarC.b(new aec() { // from class: androidx.savedstate.SavedStateRegistry$1
            @Override // defpackage.aec
            public final void a(aee aeeVar, adz adzVar) {
            }
        });
        ajmVar.c = true;
    }

    public final void c(Bundle bundle) {
        ajm ajmVar = this.a;
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = ajmVar.b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        va vaVarE = ajmVar.a.e();
        while (vaVarE.hasNext()) {
            uz uzVar = (uz) vaVarE.next();
            bundle2.putBundle((String) uzVar.a, ((ajl) uzVar.b).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
