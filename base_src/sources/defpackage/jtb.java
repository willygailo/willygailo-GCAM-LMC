package defpackage;

import android.app.Activity;
import android.content.IntentSender;

/* JADX INFO: loaded from: classes2.dex */
public final class jtb implements jsw, fik, fhw, fib {
    public static final ouj a = ouj.h("com/google/android/apps/camera/update/PlayStoreInAppUpdater");
    public final ods b;
    public jsv c;
    public odr d;
    private final Activity e;
    private jta f;

    public jtb(Activity activity, lar larVar, fhv fhvVar) {
        ods odsVar = (ods) ohh.g(activity).d.get();
        this.c = new jsz();
        this.e = activity;
        this.b = odsVar;
        enl.f(larVar, fhvVar, this);
    }

    @Override // defpackage.fhw
    public final void b(int i, int i2) {
        if (i == 57439) {
            if (i2 == -1) {
                this.c.h();
                this.c.x();
            } else if (i2 == 0) {
                this.c.t();
            } else {
                ((oug) ((oug) a.c()).G(3507)).p("Failed to update during user confirmation. resultCode: %s", i2);
                this.c.y(3, i2);
            }
        }
    }

    @Override // defpackage.jsw
    public final void c() {
        this.d = null;
        this.c.e();
        off offVarA = this.b.a();
        jta jtaVar = new jta(this, null);
        offVarA.b.a(new ofd(ofl.a, jtaVar, null));
        offVarA.a();
        offVarA.b.a(new ofb(ofl.a));
        offVarA.a();
    }

    @Override // defpackage.jsw
    public final void d() {
        this.b.d();
    }

    @Override // defpackage.jsw
    public final void e(jsv jsvVar) {
        this.c = jsvVar;
    }

    @Override // defpackage.jsw
    public final void f() {
        odr odrVar = this.d;
        if (odrVar == null || odrVar.b != 2 || !odrVar.b()) {
            ((oug) ((oug) a.c()).G(3508)).r("App update info is null or not valid: %s", this.d);
            return;
        }
        g();
        try {
            ods odsVar = this.b;
            odr odrVar2 = this.d;
            odrVar2.getClass();
            odsVar.e(odrVar2, this.e);
        } catch (IntentSender.SendIntentException e) {
            ((oug) ((oug) ((oug) a.c()).h(e)).G((char) 3509)).o("Failed to start update flow");
            this.c.y(2, 1);
        }
    }

    @Override // defpackage.fib
    public final void fT() {
        jta jtaVar = this.f;
        if (jtaVar != null) {
            this.b.c(jtaVar);
        }
    }

    public final void g() {
        if (this.f == null) {
            this.f = new jta(this);
        }
        ods odsVar = this.b;
        jta jtaVar = this.f;
        jtaVar.getClass();
        odsVar.b(jtaVar);
    }
}
