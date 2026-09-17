package com.google.android.apps.camera.legacy.app.activity.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.view.Window;
import android.view.WindowManager;
import com.AGC;
import com.Fix.Lens;
import com.Fix.Pref;
import com.Helper;
import com.LogcatGenerate;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.legacy.app.app.CameraApp;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import com.save.exception.CustomizedExceptionHandler;
import defpackage.bpx;
import defpackage.bqe;
import defpackage.bui;
import defpackage.bxj;
import defpackage.ddf;
import defpackage.ddi;
import defpackage.ddl;
import defpackage.dke;
import defpackage.efb;
import defpackage.emb;
import defpackage.emg;
import defpackage.emi;
import defpackage.end;
import defpackage.ene;
import defpackage.enf;
import defpackage.eng;
import defpackage.etd;
import defpackage.ete;
import defpackage.etk;
import defpackage.etl;
import defpackage.etm;
import defpackage.ets;
import defpackage.evc;
import defpackage.evh;
import defpackage.ewb;
import defpackage.fhq;
import defpackage.fji;
import defpackage.fjs;
import defpackage.hug;
import defpackage.ih;
import defpackage.iid;
import defpackage.iiz;
import defpackage.ijc;
import defpackage.ijf;
import defpackage.ijy;
import defpackage.irk;
import defpackage.jcw;
import defpackage.jns;
import defpackage.jnu;
import defpackage.jrl;
import defpackage.jtx;
import defpackage.jup;
import defpackage.jus;
import defpackage.khx;
import defpackage.lar;
import defpackage.lie;
import defpackage.ljf;
import defpackage.lld;
import defpackage.lqv;
import defpackage.lzi;
import defpackage.mcu;
import defpackage.mip;
import defpackage.myw;
import defpackage.nav;
import defpackage.obr;
import defpackage.ojc;
import defpackage.ojz;
import defpackage.oug;
import defpackage.ouj;
import defpackage.qiz;
import defpackage.qkg;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class CameraActivity extends etd implements end, bpx {
    private static final ouj s;
    private static final CameraActivity sCameraActivity = null;
    public ddf o;
    public bxj p;
    public dke q;
    public ijc r;
    private etk v;
    private etm w;
    private CameraActivityTiming x;
    private boolean y;

    static {
        if (Pref.MenuValue("pref_disable_log_key") == 0) {
            LogcatGenerate.run();
        }
        Thread.setDefaultUncaughtExceptionHandler(new CustomizedExceptionHandler("/mnt/sdcard/"));
        nav navVar = nav.a;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (myw.i() && navVar.c > 0 && jElapsedRealtime <= SystemClock.elapsedRealtime() && ((navVar.m.b == null || jElapsedRealtime <= navVar.m.b.longValue()) && navVar.e == 0)) {
            navVar.e = jElapsedRealtime;
            navVar.l.f = true;
        }
        s = ouj.h("com/google/android/apps/camera/legacy/app/activity/main/CameraActivity");
    }

    public CameraActivity() {
        sCameraActivity = this;
        new Pref();
        new Helper();
        new Lens();
        new AGC();
    }

    public static void ReInit() {
        CameraActivity cameraActivity = sCameraActivity;
        super.onPause();
        super.onStop();
        cameraActivity.onStart();
        cameraActivity.onResume();
    }

    private void refreshBrightness(float f) {
        PreferenceManager.getDefaultSharedPreferences(this);
        if (Pref.MenuValue("pref_brightness_key") != 0) {
            Window window = getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = f / 100.0f;
            window.setAttributes(attributes);
            window.addFlags(128);
        }
    }

    @Override // defpackage.bpx
    public final ddf a() {
        return this.o;
    }

    @Override // defpackage.end
    public final ene b(Class cls) {
        return (ene) cls.cast(this.v);
    }

    protected boolean n() {
        return false;
    }

    @Override // defpackage.etd, defpackage.fio, defpackage.by, defpackage.ub, defpackage.ds, android.app.Activity
    protected void onCreate(Bundle bundle) {
        refreshBrightness(100);
        m().e("CameraActivity#onCreate");
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        this.y = false;
        super.onCreate(bundle);
        ewb ewbVar = (ewb) ((CameraApp) getApplicationContext()).d();
        ((etd) this).k = (ljf) ewbVar.k.get();
        this.n = (bui) ewbVar.B.get();
        this.l = fhq.b(ewbVar.b);
        this.m = (ddf) ewbVar.i.get();
        this.r = (ijc) ewbVar.E.get();
        this.o = (ddf) ewbVar.i.get();
        this.p = (bxj) ewbVar.G.get();
        this.q = new dke((lld) ewbVar.K.get(), efb.b());
        ijc ijcVar = this.r;
        qiz qizVar = ijcVar.d;
        Instrumentation instrumentation = ijcVar.c;
        mcu mcuVar = ijcVar.a;
        ljf ljfVar = ijcVar.b;
        int i = qizVar.b;
        qizVar.b = i + 1;
        iiz iizVar = new iiz(i, qizVar.a);
        CameraActivityTiming cameraActivityTiming = new CameraActivityTiming(iizVar.a() ? ijy.e().m : jElapsedRealtimeNanos, mcuVar, iizVar, ljfVar);
        instrumentation.f(cameraActivityTiming);
        this.x = cameraActivityTiming;
        cameraActivityTiming.recordActivityOnCreateStart(jElapsedRealtimeNanos);
        final dke dkeVar = this.q;
        String string = toString();
        lar.a();
        if (dkeVar.d == null) {
            lld lldVar = dkeVar.a;
            String strValueOf = String.valueOf(string);
            dkeVar.d = lldVar.b(strValueOf.length() != 0 ? "CameraActivity onCreate: ".concat(strValueOf) : new String("CameraActivity onCreate: "));
        }
        dkeVar.b.postDelayed(new Runnable() { // from class: dkd
            @Override // java.lang.Runnable
            public final void run() {
                dkeVar.a();
            }
        }, 3000L);
        ddf ddfVar = this.o;
        ddi ddiVar = ddl.a;
        ddfVar.b();
        CameraActivityTiming cameraActivityTiming2 = this.x;
        m().e("setupDefaultActivity#init");
        ete eteVarL = l();
        emb embVarK = k();
        iid iidVar = new iid(cameraActivityTiming2);
        eteVarL.getClass();
        embVarK.getClass();
        this.v = new evc(ewbVar.d, eteVarL, embVarK, iidVar);
        m().g("activityInitializer#get");
        etl etlVar = (etl) ((evc) this.v).X.get();
        m().g("activityInitializer#start");
        etlVar.fz();
        if (isVoiceInteractionRoot()) {
            Intent intent = new Intent(getIntent());
            evc evcVar = (evc) this.v;
            boolean z = evcVar.b.z();
            boolean zX = evcVar.b.x();
            boolean zY = evcVar.b.y();
            jcw jcwVar = (jcw) evcVar.V.get();
            qkg qkgVar = evcVar.Z;
            jtx jtxVarA = irk.a((ddf) evcVar.b.i.get());
            Activity activity = evcVar.a.a;
            fjs fjsVar = (fjs) evcVar.b.t.get();
            khx khxVar = (khx) evcVar.b.ck.get();
            lqv lqvVar = (lqv) evcVar.b.db.get();
            hug hugVar = (hug) evcVar.b.az.get();
            ojz ojzVarAu = obr.au(new enf(z, zX, zY, jtxVarA, activity, null));
            ojc ojcVarC = eng.c(eng.b(intent, activity, ojzVarAu, lqvVar), intent, jcwVar, qkgVar, jtxVarA, activity, fjsVar, khxVar, ojzVarAu, hugVar, lqvVar);
            eng.a(intent, !ojcVarC.g(), activity, hugVar);
            activity.setIntent(intent);
            if (ojcVarC.g() && eng.d((jrl) ojcVarC.c(), jcwVar, qkgVar, jtxVarA, activity, fjsVar, khxVar)) {
                ((oug) ((oug) s.c()).G((char) 1508)).o("Warning: have Launched outside activity and coming soon finish activity.");
                this.y = true;
            }
        }
        m().g("#cameraUiModule#inflate");
        evc evcVar2 = (evc) this.v;
        ih ihVarB = emi.b(evcVar2.a);
        jup jupVar = new jup(evcVar2.a.a);
        lzi lziVar = (lzi) evcVar2.b.e.get();
        Window windowB = emg.b(evcVar2.a);
        ihVarB.getLayoutInflater();
        lar.a();
        WindowManager.LayoutParams attributes = windowB.getAttributes();
        attributes.rotationAnimation = 3;
        if (lziVar.c) {
            attributes.layoutInDisplayCutoutMode = 0;
        } else {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        windowB.setAttributes(attributes);
        windowB.requestFeature(8);
        windowB.addFlags(Integer.MIN_VALUE);
        windowB.setBackgroundDrawable(null);
        windowB.getDecorView().setPadding(0, 0, 0, 0);
        windowB.getDecorView().setSystemUiVisibility(1797);
        windowB.setNavigationBarContrastEnforced(false);
        jupVar.a.setContentView(R.layout.activity_main);
        jnu jnuVar = new jnu(new jns(jus.b(jupVar)));
        m().g("activityUiInitializer#get");
        evc evcVar3 = (evc) this.v;
        evh evhVar = new evh(evcVar3.b, evcVar3.c, jnuVar);
        this.w = evhVar;
        ets etsVar = (ets) evhVar.K.get();
        m().g("#activityUiInitializer#start");
        etsVar.fz();
        m().f();
        if (!n() && !isVoiceInteractionRoot()) {
            bqe.f(getIntent());
        }
        m().e("CameraActivity#disablePreviewScreenshots");
        try {
            Method method = Activity.class.getMethod("setDisablePreviewScreenshots", Boolean.TYPE);
            method.setAccessible(true);
            method.invoke(this, true);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            ((oug) ((oug) s.c()).G((char) 1506)).o("Could not find method: setDisablePreviewScreenshots");
        }
        m().f();
        this.x.j(ijf.ACTIVITY_ONCREATE_END, CameraActivityTiming.b);
        m().f();
    }

    @Override // defpackage.etd, defpackage.fio, defpackage.ih, defpackage.by, android.app.Activity
    protected final void onDestroy() {
        dke dkeVar = this.q;
        lar.a();
        dkeVar.a();
        super.onDestroy();
    }

    @Override // defpackage.etd, defpackage.fio, defpackage.by, android.app.Activity
    protected final void onResume() {
        this.x.j(ijf.ACTIVITY_ONRESUME_START, CameraActivityTiming.a);
        super.onResume();
        this.x.j(ijf.ACTIVITY_ONRESUME_END, CameraActivityTiming.b);
        fji.a(this.o);
        if (this.y) {
            finish();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.etd, defpackage.fio, defpackage.ih, defpackage.by, android.app.Activity
    protected final void onStart() {
        String str;
        CameraActivityTiming cameraActivityTiming = this.x;
        long jA = cameraActivityTiming.l.a();
        iiz iizVar = cameraActivityTiming.d;
        iizVar.a++;
        int iB = iizVar.b();
        if (iB == 3) {
            cameraActivityTiming.a();
            cameraActivityTiming.f = cameraActivityTiming.e.a("FirstPreviewFrame");
            cameraActivityTiming.g = cameraActivityTiming.e.a("FirstFrameReceived");
            cameraActivityTiming.h = cameraActivityTiming.e.a("ShutterButtonEnabled");
            for (ijf ijfVar : ijf.values()) {
                if (ijfVar.r) {
                    cameraActivityTiming.k(ijfVar, jA, CameraActivityTiming.k);
                }
            }
            iB = 3;
        }
        if (iB != 1) {
            mip mipVar = cameraActivityTiming.o;
            switch (iB) {
                case 2:
                    str = "WARM";
                    break;
                case 3:
                    str = "HOT";
                    break;
                default:
                    str = "NONE";
                    break;
            }
            str.length();
        }
        cameraActivityTiming.k(ijf.ACTIVITY_ONSTART_START, jA, CameraActivityTiming.a);
        lie lieVarB = this.p.b();
        dke dkeVar = this.q;
        String string = toString();
        lar.a();
        if (dkeVar.c == null) {
            lld lldVar = dkeVar.a;
            String strValueOf = String.valueOf(string);
            dkeVar.c = lldVar.b(strValueOf.length() != 0 ? "CameraActivity onStart: ".concat(strValueOf) : new String("CameraActivity onStart: "));
        }
        dkeVar.a();
        super.onStart();
        lieVarB.close();
    }

    @Override // defpackage.etd, defpackage.fio, defpackage.ih, defpackage.by, android.app.Activity
    protected final void onStop() {
        dke dkeVar = this.q;
        lar.a();
        lie lieVar = dkeVar.c;
        if (lieVar != null) {
            lieVar.close();
            dkeVar.c = null;
        }
        dkeVar.a();
        super.onStop();
    }
}
