package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class co implements uj {
    final /* synthetic */ cu a;
    private final /* synthetic */ int b;

    public co(cu cuVar, int i) {
        this.b = i;
        this.a = cuVar;
    }

    @Override // defpackage.uj
    public final /* synthetic */ void a(Object obj) {
        switch (this.b) {
            case 0:
                ui uiVar = (ui) obj;
                cr crVar = (cr) this.a.o.pollFirst();
                if (crVar != null) {
                    String str = crVar.a;
                    int i = crVar.b;
                    bu buVarB = this.a.a.b(str);
                    if (buVarB != null) {
                        buVarB.I(i, uiVar.a, uiVar.b);
                    } else {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                    }
                } else {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                }
                break;
            default:
                ui uiVar2 = (ui) obj;
                cr crVar2 = (cr) this.a.o.pollFirst();
                if (crVar2 != null) {
                    String str2 = crVar2.a;
                    int i2 = crVar2.b;
                    bu buVarB2 = this.a.a.b(str2);
                    if (buVarB2 != null) {
                        buVarB2.I(i2, uiVar2.a, uiVar2.b);
                    } else {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    }
                } else {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                }
                break;
        }
    }
}
