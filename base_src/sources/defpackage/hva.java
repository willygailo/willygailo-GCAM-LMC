package defpackage;

import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;

/* JADX INFO: loaded from: classes2.dex */
public final class hva implements pys {
    private final qkg a;
    private final /* synthetic */ int b;

    public hva(qkg qkgVar, int i) {
        this.b = i;
        this.a = qkgVar;
    }

    public static hva a(qkg qkgVar) {
        return new hva(qkgVar, 18);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                return ((huh) this.a).get().a("pref_audio_zoom_key", true);
            case 1:
                return ((huh) this.a).get().b("pref_zoom_out_command_string", 20);
            case 2:
                return ((huh) this.a).get().a("pref_has_checked_cheetah_mode", false);
            case 3:
                return ((huh) this.a).get().a("pref_has_checked_lasagna_mode", false);
            case 4:
                return (hwu) ((ojj) ((evv) this.a).a()).a;
            case 5:
                return new hwx(((emp) this.a).a());
            case 6:
                return new hzn((pht) this.a.get());
            case 7:
                return new hyc((pht) this.a.get());
            case 8:
                ddf ddfVar = (ddf) this.a.get();
                ddg ddgVar = dds.a;
                ddfVar.f();
                return false;
            case 9:
                huf hufVar = (huf) this.a.get();
                lco lcoVarI = lcv.i(hufVar.a(htu.g), hufVar.a(htu.h));
                qmd.ae(lcoVarI);
                return lcoVarI;
            case 10:
                return ((CameraActivityTiming) this.a.get()).d;
            case 11:
                Instrumentation instrumentation = (Instrumentation) this.a.get();
                Instrumentation.d(instrumentation);
                qmd.ae(instrumentation);
                return instrumentation;
            case 12:
                return new iio((fjs) this.a.get());
            case 13:
                return ((ikn) this.a).get();
            case 14:
                mcb mcbVarA = mcc.a(((emp) this.a).a());
                mcbVarA.g(nhn.a);
                mcbVarA.h(nhn.a);
                mcbVarA.c = "file_name";
                mcbVarA.f();
                mcbVarA.b();
                mcbVarA.f = "restore_path";
                mcbVarA.c();
                mcbVarA.d(myq.r(1));
                mcbVarA.e(myq.r(2));
                return mcbVarA.a();
            case 15:
                ddf ddfVar2 = (ddf) this.a.get();
                ddi ddiVar = dee.a;
                ddfVar2.d();
                return oih.a;
            case 16:
                ddf ddfVar3 = (ddf) this.a.get();
                ddi ddiVar2 = dee.a;
                ddfVar3.d();
                return oih.a;
            case 17:
                return new ine((Instrumentation) this.a.get());
            case 18:
                ojc ojcVar = (ojc) this.a.get();
                Object objH = ojcVar.g() ? ope.H((eav) ojcVar.c()) : orx.a;
                qmd.ae(objH);
                return objH;
            case 19:
                return new lce(Double.valueOf(((iqn) this.a.get()).b()));
            default:
                return ((inq) this.a).get();
        }
    }
}
