package defpackage;

import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fbi implements agm {
    public final /* synthetic */ fbn a;
    private final /* synthetic */ int b;

    public /* synthetic */ fbi(fbn fbnVar, int i) {
        this.b = i;
        this.a = fbnVar;
    }

    @Override // defpackage.agm
    public final boolean b(Preference preference, Object obj) {
        switch (this.b) {
            case 0:
                this.a.ab.q.fB(Boolean.valueOf(((Boolean) obj).booleanValue()));
                break;
            case 1:
                fbn fbnVar = this.a;
                fbnVar.ab.p.p(preference.t, Boolean.valueOf(((TwoStatePreference) fbnVar.ac).a), obj);
                if (((Boolean) obj).booleanValue() && !fbnVar.al()) {
                    by byVarW = fbnVar.w();
                    byVarW.getClass();
                    byVarW.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 1);
                }
                break;
            default:
                fbn fbnVar2 = this.a;
                ListPreference listPreference = (ListPreference) preference;
                int iK = listPreference.k(listPreference.i);
                int iK2 = listPreference.k((String) obj);
                listPreference.n(listPreference.g[iK2]);
                fjs fjsVar = fbnVar2.ab.p;
                String str = preference.t;
                CharSequence[] charSequenceArr = listPreference.g;
                fjsVar.p(str, charSequenceArr[iK], charSequenceArr[iK2]);
                break;
        }
        return true;
    }
}
