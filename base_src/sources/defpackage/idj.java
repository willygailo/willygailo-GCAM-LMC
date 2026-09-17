package defpackage;

import android.widget.Toast;
import androidx.preference.Preference;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.preference.MaterialManagedSwitchPreference;

/* JADX INFO: loaded from: classes2.dex */
public final class idj implements agm {
    final /* synthetic */ idk a;

    public idj(idk idkVar) {
        this.a = idkVar;
    }

    @Override // defpackage.agm
    public final boolean b(Preference preference, Object obj) {
        int iA = this.a.a();
        boolean z = true;
        this.a.d.e(htu.D, true);
        if (((Boolean) this.a.c.c(htu.z)).booleanValue()) {
            Boolean bool = (Boolean) obj;
            if (bool.booleanValue() && iA > 3) {
                idk idkVar = this.a;
                Toast toast = idkVar.m;
                if (toast != null) {
                    toast.cancel();
                }
                idkVar.m = Toast.makeText(idkVar.a, mip.ey(R.plurals.social_share_select_error, 3, 3).a(idkVar.a.getResources()), 0);
                idkVar.m.show();
                this.a.d((MaterialManagedSwitchPreference) preference, false);
                z = false;
            } else if (!bool.booleanValue() && iA <= 0) {
                this.a.e(false);
            }
        } else {
            this.a.e(true);
        }
        if (z) {
            this.a.b.m(preference.t);
            this.a.f();
            idk idkVar2 = this.a;
            fjs fjsVar = idkVar2.f;
            String str = preference.t;
            fjsVar.p(str, Boolean.valueOf(idkVar2.b.m(str)), obj);
        }
        return z;
    }
}
