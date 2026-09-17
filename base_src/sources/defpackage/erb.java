package defpackage;

import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.view.ViewStub;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.modeslider.ModeSlider;
import com.google.android.apps.camera.ui.modeslider.ModeSliderUi;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class erb implements eso, lie {
    public final lda a;
    public ModeSliderUi b;
    public final jdy c;
    private final ddf d;
    private final jek e;
    private final Set f;
    private final lap g = new lap();
    private final bqg h;

    public erb(lda ldaVar, ddf ddfVar, jek jekVar, Set set, jdy jdyVar, bqg bqgVar) {
        this.a = ldaVar;
        this.d = ddfVar;
        this.e = jekVar;
        this.f = new HashSet(set);
        this.c = jdyVar;
        this.h = bqgVar;
    }

    @Override // defpackage.eso
    public final void a(boolean z) {
        ovd ovdVar = ovl.a;
        if (z) {
            this.b.b().d();
        } else {
            this.b.b().c();
        }
    }

    @Override // defpackage.eso
    public final void b(jrz jrzVar) {
        this.b.c(jrzVar);
    }

    @Override // defpackage.eso
    public final void c(ViewStub viewStub) {
        if (this.b == null) {
            this.b = (ModeSliderUi) viewStub.inflate().findViewById(R.id.lasagna_mode_slider_ui);
        }
        jek jekVar = this.e;
        ModeSliderUi modeSliderUi = this.b;
        ModeSlider modeSliderB = modeSliderUi.b();
        Set set = this.f;
        jekVar.d = modeSliderUi;
        jekVar.e = modeSliderB;
        jekVar.f = set;
        ModeSlider modeSliderB2 = this.b.b();
        GradientDrawable gradientDrawable = (GradientDrawable) ((InsetDrawable) modeSliderB2.getBackground()).getDrawable();
        if (!this.d.k(ddl.ay) && gradientDrawable != null) {
            gradientDrawable.setTintMode(PorterDuff.Mode.DST);
            gradientDrawable.setTint(modeSliderB2.getContext().getColor(R.color.mode_slider_bg_color_legacy));
        }
        modeSliderB2.i(this.c, this.d);
        modeSliderB2.a = new era(this);
        this.e.f();
        this.g.c(this.a.a(new lij() { // from class: eqz
            @Override // defpackage.lij
            public final void fB(Object obj) {
                jdz jdzVar;
                erb erbVar = this.a;
                esn esnVarA = esn.a(((Integer) obj).intValue());
                Iterator it = erbVar.c.h.iterator();
                do {
                    if (!it.hasNext()) {
                        jdzVar = null;
                        break;
                    }
                    jdzVar = (jdz) it.next();
                } while (!((esn) jdzVar.a).equals(esnVarA));
                if (jdzVar == null) {
                    erbVar.d();
                } else {
                    erbVar.b.b().k(erbVar.b.b().b(jdzVar));
                }
            }
        }, pgr.INSTANCE));
        this.h.i().c(this);
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        d();
        this.f.clear();
        this.g.close();
    }

    @Override // defpackage.eso
    public final void d() {
        this.b.setAlpha(0.0f);
        this.e.a();
    }

    @Override // defpackage.eso
    public final void e() {
        this.b.setAlpha(1.0f);
        this.e.b();
    }
}
