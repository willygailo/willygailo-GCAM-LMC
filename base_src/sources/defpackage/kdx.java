package defpackage;

import android.content.Context;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class kdx {
    private static volatile kdx h;
    public final Context a;
    public final Context b;
    public final ken c;
    public final kfa d;
    public final ker e;
    public final kff f;
    public final kny g;
    private final kdo i;
    private final kds j;
    private final kfn k;

    protected kdx(kdy kdyVar) {
        Context context = kdyVar.a;
        mip.du(context, "Application context can't be null");
        Context context2 = kdyVar.b;
        mip.dk(context2);
        this.a = context;
        this.b = context2;
        this.g = kny.a;
        this.c = new ken(this);
        kfa kfaVar = new kfa(this);
        kfaVar.A();
        this.d = kfaVar;
        kfa kfaVarD = d();
        String str = kdv.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 134);
        sb.append("Google Analytics ");
        sb.append(str);
        sb.append(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
        kfaVarD.w(4, sb.toString(), null, null, null);
        kff kffVar = new kff(this);
        kffVar.A();
        this.f = kffVar;
        kfn kfnVar = new kfn(this);
        kfnVar.A();
        this.k = kfnVar;
        kds kdsVar = new kds(this);
        kem kemVar = new kem(this);
        kdp kdpVar = new kdp(this);
        keg kegVar = new keg(this);
        keq keqVar = new keq(this);
        mip.dk(context);
        if (kdo.a == null) {
            synchronized (kdo.class) {
                if (kdo.a == null) {
                    kdo.a = new kdo(context);
                }
            }
        }
        kdo kdoVar = kdo.a;
        kdoVar.c = new kdw(this);
        this.i = kdoVar;
        kdg kdgVar = new kdg(this);
        kemVar.A();
        kdpVar.A();
        kegVar.A();
        keqVar.A();
        ker kerVar = new ker(this);
        kerVar.A();
        this.e = kerVar;
        kdsVar.A();
        this.j = kdsVar;
        kfn kfnVarE = kdgVar.a.e();
        kfnVarE.z();
        kfnVarE.z();
        if (kfnVarE.f) {
            kfnVarE.z();
            boolean z = kfnVarE.g;
        }
        kfnVarE.z();
        kel kelVar = kdsVar.a;
        kelVar.z();
        mip.dr(!kelVar.a, "Analytics backend already started");
        kelVar.a = true;
        kelVar.e().b(new kej(kelVar));
    }

    public static kdx c(Context context) {
        mip.dk(context);
        if (h == null) {
            synchronized (kdx.class) {
                if (h == null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    kdx kdxVar = new kdx(new kdy(context));
                    h = kdxVar;
                    kdg.a();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    long jLongValue = ((Long) keu.B.a()).longValue();
                    if (jElapsedRealtime2 > jLongValue) {
                        kdxVar.d().v("Slow initialization (ms)", Long.valueOf(jElapsedRealtime2), Long.valueOf(jLongValue));
                    }
                }
            }
        }
        return h;
    }

    public static final void f(kdu kduVar) {
        mip.du(kduVar, "Analytics service not created/initialized");
        mip.dm(kduVar.B(), "Analytics service not initialized");
    }

    public final kdo a() {
        mip.dk(this.i);
        return this.i;
    }

    public final kds b() {
        f(this.j);
        return this.j;
    }

    public final kfa d() {
        f(this.d);
        return this.d;
    }

    public final kfn e() {
        f(this.k);
        return this.k;
    }
}
