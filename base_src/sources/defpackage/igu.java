package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.optionsbar.common.LinearMinibarImpl;
import j$.util.function.Supplier;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class igu implements ihc, gtu {
    private static final ouj i = ouj.h("com/google/android/apps/camera/speechenhancer/SpeechEnhancerUiControllerImpl");
    public final Context a;
    public final gts b;
    public final ddf c;
    public final Executor d;
    public final elw e;
    public boolean f = false;
    public boolean g = false;
    public lie h;
    private final gtg j;
    private final huf k;
    private final hug l;
    private final lco m;
    private lie n;
    private lie o;

    public igu(Context context, ojc ojcVar, gtg gtgVar, ddf ddfVar, Executor executor, elw elwVar, huf hufVar, hug hugVar, lco lcoVar) {
        this.a = context;
        this.b = (gts) ojcVar.f();
        this.j = gtgVar;
        this.c = ddfVar;
        this.d = executor;
        this.e = elwVar;
        this.k = hufVar;
        this.l = hugVar;
        this.m = lcoVar;
    }

    private final boolean i() {
        return (((Boolean) this.k.c(htu.v)).booleanValue() || this.f) ? false : true;
    }

    @Override // defpackage.gtu
    public final void a() {
        lie lieVar = this.o;
        if (lieVar != null) {
            lieVar.close();
            this.o = null;
        }
    }

    @Override // defpackage.gtu
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.gtu
    public final void c() {
        this.j.F();
        Object obj = ((lce) this.m).d;
        this.k.c(htu.v);
        this.j.z(gtm.COCKTAIL_PARTY_FRONT);
        if (this.j.F() && lwd.FRONT.equals(((lce) this.m).d) && !((Boolean) this.k.c(htu.v)).booleanValue() && !this.g && this.j.z(gtm.COCKTAIL_PARTY_FRONT)) {
            gtg gtgVar = this.j;
            gtm gtmVar = gtm.COCKTAIL_PARTY_FRONT;
            gtv gtvVar = gtv.COCKTAIL_PARTY_ON;
            guq guqVar = (guq) gtgVar.aT.f.get(gtmVar);
            ojc ojcVarH = guqVar != null ? ojc.h((View) guqVar.e.get(gtvVar)) : oih.a;
            if (!ojcVarH.g()) {
                ((oug) ((oug) i.c()).G((char) 2914)).o("showMenuTooltipIfAppropriate: absent anchorView!");
                return;
            }
            jlz jlzVar = new jlz(this.a.getString(R.string.reduce_noise_when_talk_tooltip));
            jlzVar.s((View) ojcVarH.c());
            jlzVar.i();
            jlzVar.h = this.c.k(ddl.ay);
            jlzVar.n();
            jlzVar.g(new igs(this, 1), this.d);
            jlzVar.c = 300;
            jlzVar.o();
            jlzVar.d = 5000;
            jlzVar.e = false;
            jlzVar.g = false;
            jlzVar.i = this.e;
            jlzVar.m = 4;
            this.o = jlzVar.a();
        }
    }

    @Override // defpackage.gtu
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.ihc
    public final void e() {
        this.j.f(this);
        if (i()) {
            this.n = this.m.a(new lij() { // from class: igr
                @Override // defpackage.lij
                public final void fB(Object obj) {
                    gts gtsVar;
                    final igu iguVar = this.a;
                    if (!iguVar.h() || (gtsVar = iguVar.b) == null) {
                        return;
                    }
                    LinearMinibarImpl linearMinibarImpl = gtsVar.b;
                    jlz jlzVar = new jlz(iguVar.a.getString(R.string.try_speech_enhancement_tooltip));
                    jlzVar.u(linearMinibarImpl);
                    jlzVar.i();
                    jlzVar.h = iguVar.c.k(ddl.ay);
                    jlzVar.n();
                    jlzVar.d(new Supplier() { // from class: igt
                        @Override // j$.util.function.Supplier
                        public final Object get() {
                            return Boolean.valueOf(iguVar.h());
                        }
                    });
                    jlzVar.g(new igs(iguVar, 0), iguVar.d);
                    jlzVar.c = 300;
                    jlzVar.o();
                    jlzVar.d = 5000;
                    jlzVar.e = false;
                    jlzVar.g = true;
                    jlzVar.i = iguVar.e;
                    jlzVar.m = 4;
                    iguVar.h = jlzVar.a();
                }
            }, this.d);
        }
    }

    @Override // defpackage.ihc
    public final void f() {
        this.j.o(this);
        lie lieVar = this.n;
        if (lieVar != null) {
            lieVar.close();
            this.n = null;
        }
        lie lieVar2 = this.h;
        if (lieVar2 != null) {
            lieVar2.close();
            this.h = null;
        }
    }

    @Override // defpackage.ihc
    public final void g() {
        this.l.e(htu.v, true);
    }

    public final boolean h() {
        Object obj = ((lce) this.m).d;
        this.j.F();
        this.k.c(htu.v);
        return lwd.FRONT.equals(((lce) this.m).d) && !this.j.F() && i();
    }
}
