package defpackage;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.ui.gridlines.GridLinesUi;
import com.google.android.apps.camera.ui.wirers.PreviewOverlay;

/* JADX INFO: loaded from: classes2.dex */
public class ixx extends ixk {
    public final kas a;
    public final jfn b;
    public final eah c;
    public final gtg d;
    public final gfy e;
    public final hoz f;
    public final bta g;
    public final qkg h;
    public final cvo i;
    public final jhh j;
    public final ddf k;
    public final int l;
    public boolean m = true;
    public lwd n;
    public final jjp o;
    private final lda p;
    private final Window q;
    private final BottomBarController r;
    private final jlb s;
    private final jak t;
    private final Handler u;
    private final qkg v;

    public ixx(lda ldaVar, qkg qkgVar, Window window, BottomBarController bottomBarController, jlb jlbVar, kas kasVar, jfn jfnVar, jak jakVar, eah eahVar, gtg gtgVar, final jjp jjpVar, gfy gfyVar, hoz hozVar, Handler handler, bta btaVar, qkg qkgVar2, cvo cvoVar, jhh jhhVar, ddf ddfVar) {
        this.p = ldaVar;
        this.q = window;
        this.r = bottomBarController;
        this.s = jlbVar;
        this.l = window.getAttributes().rotationAnimation;
        this.a = kasVar;
        this.b = jfnVar;
        this.t = jakVar;
        this.c = eahVar;
        this.d = gtgVar;
        this.e = gfyVar;
        this.f = hozVar;
        this.u = handler;
        this.g = btaVar;
        this.h = qkgVar2;
        this.i = cvoVar;
        this.o = jjpVar;
        this.j = jhhVar;
        this.v = qkgVar;
        this.k = ddfVar;
        final boolean zK = ddfVar.k(ddl.ay);
        jjpVar.a.post(new Runnable() { // from class: jjo
            @Override // java.lang.Runnable
            public final void run() {
                jjp jjpVar2 = jjpVar;
                boolean z = zK;
                jjn jjnVar = jjpVar2.a;
                lar.a();
                if (z) {
                    return;
                }
                jjnVar.e.setTextColor(jjnVar.getResources().getColor(R.color.shared_mode_chip_text_color_legacy));
                jjnVar.e.setTypeface(Typeface.create("google-sans-medium_compat", 0));
                jjnVar.f.setTextColor(jjnVar.getResources().getColor(R.color.shared_camera_chip_text_color_legacy));
                jjnVar.f.setTypeface(Typeface.create("google-sans-medium_compat", 0));
                Drawable drawable = jjnVar.getContext().getResources().getDrawable(R.drawable.mode_chip_view, null);
                drawable.setTint(jjnVar.getResources().getColor(R.color.mode_chip_color_legacy));
                Drawable drawable2 = jjnVar.getContext().getResources().getDrawable(R.drawable.mode_chip_background, null);
                drawable2.setTint(jjnVar.getResources().getColor(R.color.mode_chip_ripple_color_legacy));
                jjnVar.e.setBackground(drawable);
                jjnVar.f.setBackground(drawable2);
                jjnVar.invalidate();
            }
        });
    }

    public final void A(jrl jrlVar) {
        this.p.fB(jrlVar);
        this.s.ai(jrlVar);
        this.r.switchToMode(jrlVar);
    }

    public final Resources q() {
        return s().getResources();
    }

    public final GridLinesUi r() {
        return (GridLinesUi) ((jnr) this.v.get()).c.c(R.id.grid_lines);
    }

    public final PreviewOverlay s() {
        return (PreviewOverlay) ((jnr) this.v.get()).c.c(R.id.preview_overlay);
    }

    public final void t() {
        this.t.d(false);
        jxn.c();
    }

    public final void u() {
        r().setVisibility(4);
    }

    public final void v() {
        this.t.d(true);
        jxn.d();
    }

    public final void w() {
        this.u.postDelayed(new Runnable() { // from class: ixl
            @Override // java.lang.Runnable
            public final void run() {
                this.a.r().setVisibility(0);
            }
        }, 250L);
    }

    public final void x() {
        v();
        this.b.m();
        s().d = true;
        w();
        this.a.v(true);
        kas kasVar = this.a;
        if (((kbi) kasVar).L) {
            kasVar.h();
        }
    }

    public final void y() {
        this.f.c();
        s().d = false;
        this.a.v(false);
        this.a.g();
    }

    public final void z(int i) {
        WindowManager.LayoutParams attributes = this.q.getAttributes();
        attributes.rotationAnimation = i;
        this.q.setAttributes(attributes);
    }
}
