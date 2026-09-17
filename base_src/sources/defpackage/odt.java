package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class odt implements ods {
    private final oed a;
    private final Context b;
    private final oem c;

    public odt(oed oedVar, oem oemVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.a = oedVar;
        this.c = oemVar;
        this.b = context;
    }

    @Override // defpackage.ods
    public final off a() {
        oed oedVar = this.a;
        String packageName = this.b.getPackageName();
        if (oedVar.a == null) {
            return oed.c();
        }
        ofi ofiVar = new ofi();
        oedVar.a.b(new odz(oedVar, ofiVar, packageName, ofiVar), ofiVar);
        return ofiVar.a;
    }

    @Override // defpackage.ods
    public final synchronized void b(jta jtaVar) {
        this.c.b(jtaVar);
    }

    @Override // defpackage.ods
    public final synchronized void c(jta jtaVar) {
        this.c.c(jtaVar);
    }

    @Override // defpackage.ods
    public final void d() {
        oed oedVar = this.a;
        String packageName = this.b.getPackageName();
        if (oedVar.a == null) {
            oed.c();
        } else {
            ofi ofiVar = new ofi();
            oedVar.a.b(new oea(oedVar, ofiVar, ofiVar, packageName), ofiVar);
        }
    }

    @Override // defpackage.ods
    public final void e(odr odrVar, Activity activity) throws IntentSender.SendIntentException {
        ody odyVarA = ody.a();
        if (odrVar.a(odyVarA) == null || odrVar.d) {
            return;
        }
        odrVar.d = true;
        activity.startIntentSenderForResult(odrVar.a(odyVarA).getIntentSender(), 57439, null, 0, 0, 0, null);
    }
}
