package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class cq extends up {
    @Override // defpackage.up
    public final /* bridge */ /* synthetic */ Object a(int i, Intent intent) {
        return new ui(i, intent);
    }

    @Override // defpackage.up
    public final /* bridge */ /* synthetic */ Intent b(Object obj) {
        Bundle bundleExtra;
        uo uoVar = (uo) obj;
        Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent intent2 = uoVar.b;
        if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                uoVar = new uo(uoVar.a, uoVar.c, uoVar.d);
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", uoVar);
        if (cu.Q(2)) {
            String str = "CreateIntent created the following intent: " + intent;
        }
        return intent;
    }
}
