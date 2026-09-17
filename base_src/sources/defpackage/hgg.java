package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.apps.camera.processing.ProcessingService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class hgg implements pys {
    private final qkg a;
    private final qkg b;
    private final /* synthetic */ int c;

    public hgg(qkg qkgVar, qkg qkgVar2, int i) {
        this.c = i;
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public hgg(qkg qkgVar, qkg qkgVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public hgg(qkg qkgVar, qkg qkgVar2, int i, char[] cArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public hgg(qkg qkgVar, qkg qkgVar2, int i, float[] fArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public hgg(qkg qkgVar, qkg qkgVar2, int i, int[] iArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public hgg(qkg qkgVar, qkg qkgVar2, int i, short[] sArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public hgg(qkg qkgVar, qkg qkgVar2, int i, boolean[] zArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public hgg(qkg qkgVar, qkg qkgVar2, int i, byte[][] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public hgg(qkg qkgVar, qkg qkgVar2, int i, char[][] cArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public hgg(qkg qkgVar, qkg qkgVar2, int i, int[][] iArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public hgg(qkg qkgVar, qkg qkgVar2, int i, short[][] sArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public static hgg a(qkg qkgVar, qkg qkgVar2) {
        return new hgg(qkgVar, qkgVar2, 1);
    }

    public static hgg b(qkg qkgVar, qkg qkgVar2) {
        return new hgg(qkgVar, qkgVar2, 7);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        boolean z = false;
        switch (this.c) {
            case 0:
                lco lcoVarE = lcv.e(((grz) this.b.get()).a, Integer.valueOf(((Integer) ((ddf) this.a.get()).a(ddx.a).c()).intValue()));
                qmd.ae(lcoVarE);
                return lcoVarE;
            case 1:
                lvp lvpVar = ((gjp) this.a).get();
                lvq lvqVar = ((lhr) this.b).get();
                Set setB = lvpVar.B();
                obr.aF(true ^ setB.isEmpty());
                ArrayList arrayList = new ArrayList();
                Iterator it = setB.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ghx(lvqVar.a((lvs) it.next())));
                }
                Collections.sort(arrayList, cdg.l);
                return arrayList;
            case 2:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.a.get();
                ljf ljfVar = (ljf) this.b.get();
                muw muwVarA = mux.a();
                muwVarA.a = plk.L(new djb(scheduledExecutorService, ljfVar));
                return muwVarA.a();
            case 3:
                lir lirVar = ((dgb) this.b).get();
                final Context contextA = ((emp) this.a).a();
                return new hhl(lirVar, new Runnable() { // from class: hhf
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context = contextA;
                        context.startService(new Intent(context, (Class<?>) ProcessingService.class));
                    }
                });
            case 4:
                return ((ddf) this.a.get()).k(ddx.B) ? (ojc) ((pyt) this.b).a : oih.a;
            case 5:
                return ((gah) this.a).get().a(((pyv) pyv.b(this.b)).get(), new hmk(), new hml());
            case 6:
                ddf ddfVar = (ddf) this.b.get();
                ddi ddiVar = ddl.a;
                ddfVar.f();
                return bwb.a;
            case 7:
                Activity activity = ((eme) this.a).get();
                KeyguardManager keyguardManager = ((emw) this.b).get();
                if (hoc.a(activity.getIntent())) {
                    if (keyguardManager.isKeyguardLocked() || ActivityManager.isRunningInTestHarness()) {
                        z = true;
                    } else {
                        ((oug) ((oug) hoc.a.c()).G((char) 2579)).o("Warning: Overriding the secure camera intent because the keyguard is not currently locked. The camera will open in normal mode.");
                    }
                }
                return Boolean.valueOf(z);
            case 8:
                return new hpe(((ena) this.b).get(), (Executor) this.a.get());
            case 9:
                return new hpj(((ena) this.b).get(), (Executor) this.a.get());
            case 10:
                return new hpl(((ena) this.b).get(), (Executor) this.a.get());
            case 11:
                return new hpw(((hqa) this.a).get(), new lar(), (fjs) this.b.get());
            case 12:
                return new hrc(((emp) this.a).a(), ((ikx) this.b).get());
            case 13:
                return new hua((ddf) this.a.get(), (SharedPreferences) this.b.get());
            case 14:
                return new hue(((emp) this.a).a(), (SharedPreferences) this.b.get());
            case 15:
                return ((huh) this.b).get().b("pref_mode_vesper_level", ((gfb) this.a).b().intValue());
            case 16:
                return ((ddf) this.a.get()).k(ddl.bo) ? ((huh) this.b).get().a("pref_camera_cd_indicator_enabled_key", true) : lcz.a(Boolean.FALSE);
            case 17:
                ddf ddfVar2 = (ddf) this.a.get();
                return (ddfVar2.k(ddl.aV) || ddfVar2.k(ddl.aW)) ? ((huh) this.b).get().a("pref_camera_dynamic_depth_enabled_key", false) : lcz.a(Boolean.FALSE);
            case 18:
                return ((ddf) this.a.get()).k(ddm.X) ? lcz.a(false) : ((huh) this.b).get().a("pref_camera_hdrplus_option_available_key", true);
            case 19:
                return ((ddf) this.a.get()).k(ddm.ak) ? ((huh) this.b).get().a("pref_camera_kepler_enabled_key", true) : lcz.a(Boolean.FALSE);
            default:
                return ((huh) this.b).get().b("pref_mode_vesperad_option", ((cbe) this.a).a().intValue());
        }
    }
}
