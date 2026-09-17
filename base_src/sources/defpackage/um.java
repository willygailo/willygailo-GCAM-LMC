package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class um {
    public Random a = new Random();
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    public final Map d = new HashMap();
    public ArrayList e = new ArrayList();
    public final transient Map f = new HashMap();
    public final Map g = new HashMap();
    public final Bundle h = new Bundle();
    final /* synthetic */ ub i;

    public um() {
    }

    public um(ub ubVar) {
        this.i = ubVar;
    }

    public final uk a(String str, up upVar, uj ujVar) {
        int i;
        if (((Integer) this.c.get(str)) == null) {
            int iNextInt = this.a.nextInt(2147418112);
            while (true) {
                i = iNextInt + 65536;
                if (!this.b.containsKey(Integer.valueOf(i))) {
                    break;
                }
                iNextInt = this.a.nextInt(2147418112);
            }
            b(i, str);
        }
        this.f.put(str, new ul(ujVar, upVar));
        if (this.g.containsKey(str)) {
            Object obj = this.g.get(str);
            this.g.remove(str);
            ujVar.a(obj);
        }
        ui uiVar = (ui) this.h.getParcelable(str);
        if (uiVar != null) {
            this.h.remove(str);
            ujVar.a(upVar.a(uiVar.a, uiVar.b));
        }
        return new uk(this, str, upVar);
    }

    public final void b(int i, String str) {
        Map map = this.b;
        Integer numValueOf = Integer.valueOf(i);
        map.put(numValueOf, str);
        this.c.put(str, numValueOf);
    }

    public final boolean c(int i, int i2, Intent intent) {
        String str = (String) this.b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        ul ulVar = (ul) this.f.get(str);
        if (ulVar == null || ulVar.a == null || !this.e.contains(str)) {
            this.g.remove(str);
            this.h.putParcelable(str, new ui(i2, intent));
            return true;
        }
        ulVar.a.a(ulVar.b.a(i2, intent));
        this.e.remove(str);
        return true;
    }

    public final void d(int i, up upVar, Object obj) {
        Bundle bundle;
        ub ubVar = this.i;
        kkm kkmVarC = upVar.c(ubVar, obj);
        if (kkmVarC != null) {
            new Handler(Looper.getMainLooper()).post(new ty(this, i, kkmVarC, null));
            return;
        }
        Intent intentB = upVar.b(obj);
        if (intentB.getExtras() != null && intentB.getExtras().getClassLoader() == null) {
            intentB.setExtrasClassLoader(ubVar.getClassLoader());
        }
        if (intentB.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = intentB.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentB.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentB.getAction())) {
            String[] stringArrayExtra = intentB.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            aan.a(ubVar, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentB.getAction())) {
            ubVar.startActivityForResult(intentB, i, bundle);
            return;
        }
        uo uoVar = (uo) intentB.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            ubVar.startIntentSenderForResult(uoVar.a, i, uoVar.b, uoVar.c, uoVar.d, 0, bundle);
        } catch (IntentSender.SendIntentException e) {
            new Handler(Looper.getMainLooper()).post(new tz(this, i, e));
        }
    }
}
