package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.ViewStub;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.views.MainActivityLayout;
import com.google.android.apps.camera.ui.views.ToggleUi;

/* JADX INFO: loaded from: classes2.dex */
public final class jpt implements jqn {
    private final ojc a;
    private final qkg b;
    private final jbq c;

    public jpt(ojc ojcVar, jbq jbqVar, qkg qkgVar) {
        this.a = ojcVar;
        this.c = jbqVar;
        this.b = qkgVar;
    }

    @Override // defpackage.jqn
    public final void a() {
        LayerDrawable layerDrawable;
        Drawable drawableFindDrawableByLayerId;
        if (this.a.g()) {
            jns jnsVar = ((jnw) this.b).get();
            jus jusVar = jnsVar.k;
            ((eso) this.a.c()).c((ViewStub) jusVar.c(R.id.lasagna_mode_slider_ui_stub));
            ViewStub viewStub = (ViewStub) jusVar.c(R.id.help_ui);
            jbq jbqVar = this.c;
            if (jbqVar.b == null) {
                jbqVar.b = (ToggleUi) viewStub.inflate();
            }
            boolean zK = jbqVar.a.k(ddl.ay);
            int i = R.drawable.toggle_off_background;
            if (zK && (layerDrawable = (LayerDrawable) jbqVar.b.getContext().getDrawable(R.drawable.toggle_off_background)) != null && (drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.toggle_off_inner_circle)) != null) {
                drawableFindDrawableByLayerId.setTint(mip.dT(jbqVar.b));
            }
            ToggleUi toggleUi = jbqVar.b;
            if (true != zK) {
                i = R.drawable.toggle_off_background_legacy;
            }
            toggleUi.c(i);
            Drawable drawable = jbqVar.b.getResources().getDrawable(R.drawable.quantum_gm_ic_help_outline_vd_theme_24, null);
            if (zK && drawable != null) {
                drawable.mutate().setTint(mip.dS(jbqVar.b));
            }
            jbqVar.b.d(drawable);
            jbqVar.a();
            MainActivityLayout mainActivityLayout = jnsVar.c;
            mainActivityLayout.q = this.a;
            mainActivityLayout.p(mainActivityLayout.d().h);
            mainActivityLayout.m = ojc.i(this.c);
            mainActivityLayout.l();
        }
    }
}
