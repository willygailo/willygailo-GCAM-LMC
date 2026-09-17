package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.elapsedtimeui.ElapsedTimerView;
import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public final class jay implements jas {
    private static final jar g = jar.a().a();
    public final ddf a;
    public ElapsedTimerView b;
    public TextView c;
    public TextView d;
    public long e;
    public long f;
    private final Activity h;
    private final lar i;
    private final lda j;
    private jar k = g;
    private Resources l;
    private View m;
    private ViewGroup n;
    private View o;
    private int p;
    private lie q;

    public jay(Activity activity, ddf ddfVar, lar larVar, lda ldaVar) {
        this.h = activity;
        this.a = ddfVar;
        this.i = larVar;
        this.j = ldaVar;
    }

    private final void l(ViewGroup viewGroup, int i) {
        if (viewGroup != this.n) {
            viewGroup.removeView(this.b);
            this.n.addView(this.b);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        layoutParams.bottomMargin = this.p;
        layoutParams.topMargin = this.p;
        layoutParams.gravity = i | 1;
        this.b.setLayoutParams(layoutParams);
    }

    private final void m() {
        this.c.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_recording_on_red_circle, 0, 0, 0);
    }

    @Override // defpackage.jas
    public final void a(boolean z) {
        lie lieVar = this.q;
        if (lieVar != null) {
            lieVar.close();
        }
        if (z) {
            this.b.animate().setDuration(120L).setStartDelay(0L).alpha(0.0f).withEndAction(new jau(this, 1));
        } else {
            this.b.animate().cancel();
            this.b.setAlpha(0.0f);
            this.b.setVisibility(8);
            k();
        }
        ddf ddfVar = this.a;
        ddi ddiVar = ddl.a;
        ddfVar.d();
        this.k = g;
        this.j.fB(false);
        if (((AccessibilityManager) this.h.getSystemService("accessibility")).isTouchExplorationEnabled()) {
            this.o.setFocusable(true);
            this.o.setImportantForAccessibility(1);
        }
    }

    @Override // defpackage.jas
    public final void b() {
        if (!this.a.k(dcu.J)) {
            this.c.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        this.c.setText(this.l.getString(R.string.video_recording_paused_indicator, DateUtils.formatElapsedTime(Duration.ofMillis(this.e).getSeconds())));
    }

    @Override // defpackage.jas
    public final void c() {
        this.c.setText(DateUtils.formatElapsedTime(Duration.ofMillis(this.e).getSeconds()));
        if (this.a.k(dcu.J)) {
            return;
        }
        m();
    }

    @Override // defpackage.jas
    public final void d(jar jarVar) {
        this.k = jarVar;
    }

    @Override // defpackage.jas
    public final void e() {
        Drawable drawable;
        int dimensionPixelSize = this.l.getDimensionPixelSize(R.dimen.timer_side_padding);
        this.d.setTextSize(0, this.l.getDimensionPixelSize(R.dimen.elapsed_timer_text_size));
        int color = this.l.getColor(R.color.elapsed_timer_text_color, null);
        if (!this.a.k(ddl.ay)) {
            color = this.l.getColor(R.color.elapsed_timer_text_color_legacy, null);
            ei.e(this.d.getContext(), R.font.google_sans_medium_compat, new jax(this));
            this.d.setTextColor(color);
        }
        Drawable drawable2 = this.h.getDrawable(R.drawable.quantum_gm_ic_trending_flat_white_18);
        drawable2.getClass();
        drawable2.setTint(color);
        jar jarVar = this.k;
        if (jarVar.b) {
            drawable = this.h.getDrawable(R.drawable.quantum_gm_ic_mic_off_white_18);
        } else if (((Boolean) jarVar.d.fA()).booleanValue()) {
            drawable = this.a.k(dcu.r) ? this.h.getDrawable(R.drawable.gm_filled_mic_external_on_white_18) : this.h.getDrawable(R.drawable.quantum_ic_mic_external_on_white_18);
        } else {
            drawable = ((Boolean) this.k.e.fA()).booleanValue() ? this.h.getDrawable(R.drawable.gm_filled_bluetooth_connected_white_18) : null;
        }
        if (drawable != null) {
            drawable.setTint(color);
        }
        this.d.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        this.d.setCompoundDrawablesWithIntrinsicBounds(drawable2, (Drawable) null, drawable, (Drawable) null);
        TextView textView = this.c;
        textView.setPadding(textView.getPaddingLeft(), 0, 0, 0);
        this.c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        this.d.setVisibility(0);
    }

    @Override // defpackage.jas
    public final void f() {
        jar jarVar = this.k;
        this.q = lcv.b(jarVar.d, jarVar.e).a(new lij() { // from class: jat
            @Override // defpackage.lij
            public final void fB(Object obj) {
                this.a.j();
            }
        }, this.i);
        h(0L);
        if (this.n != null) {
            jrz jrzVarA = jrz.a(this.b.getDisplay(), this.b.getContext());
            ViewGroup viewGroup = (ViewGroup) this.b.getParent();
            switch (jrzVarA) {
                case PORTRAIT:
                case REVERSE_PORTRAIT:
                    viewGroup.removeView(this.b);
                    ViewGroup viewGroup2 = (ViewGroup) this.h.findViewById(R.id.activity_root_view);
                    viewGroup2.addView(this.b);
                    this.b.bringToFront();
                    ah ahVar = new ah();
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup2;
                    ahVar.d(constraintLayout);
                    int[] iArr = new int[2];
                    this.o.getLocationInWindow(iArr);
                    ahVar.e(this.b.getId(), 3, 0, 3, (iArr[1] + (this.o.getHeight() / 2)) - (this.l.getDimensionPixelSize(R.dimen.timer_height) / 2));
                    ahVar.e(this.b.getId(), 6, 0, 6, 0);
                    ahVar.e(this.b.getId(), 7, 0, 7, 0);
                    ahVar.b(constraintLayout);
                    break;
                case LANDSCAPE:
                    l(viewGroup, 80);
                    break;
                case REVERSE_LANDSCAPE:
                    l(viewGroup, 48);
                    break;
            }
        }
        j();
        if (this.a.k(dcu.J)) {
            g(0L);
        } else {
            m();
        }
        this.b.animate().setDuration(200L).setStartDelay(517L).alpha(1.0f).withStartAction(new jau(this, 0));
        this.j.fB(true);
        if (((AccessibilityManager) this.h.getSystemService("accessibility")).isTouchExplorationEnabled()) {
            this.o.setFocusable(false);
            this.o.setImportantForAccessibility(2);
        }
        ddf ddfVar = this.a;
        ddi ddiVar = ddl.a;
        ddfVar.d();
    }

    @Override // defpackage.jas
    public final void g(long j) {
        this.f = j;
        this.d.setText(DateUtils.formatElapsedTime(Duration.ofMillis(j).getSeconds()));
    }

    @Override // defpackage.jas
    public final void h(long j) {
        this.e = j;
        this.c.setText(DateUtils.formatElapsedTime(Duration.ofMillis(j).getSeconds()));
    }

    @Override // defpackage.jas
    public final void i(LinearLayout linearLayout) {
        this.l = linearLayout.getResources();
        ElapsedTimerView elapsedTimerView = (ElapsedTimerView) linearLayout;
        this.b = elapsedTimerView;
        TextView textViewB = elapsedTimerView.b();
        this.c = textViewB;
        textViewB.setCompoundDrawablePadding(this.l.getDimensionPixelSize(R.dimen.indicator_padding));
        this.d = this.b.a();
        if (this.a.k(dcu.J)) {
            this.d.setCompoundDrawablePadding(this.l.getDimensionPixelSize(R.dimen.indicator_padding));
        }
        this.m = this.b.findViewById(R.id.speech_enhance_view);
        this.p = this.l.getDimensionPixelSize(R.dimen.recording_time_landscape_vertical_margin);
        ViewGroup viewGroup = (ViewGroup) linearLayout.getRootView();
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.camera_app_root);
        if (viewGroup2 == null) {
            viewGroup2 = viewGroup;
        }
        this.n = (ViewGroup) viewGroup2.findViewById(R.id.uncovered_preview_layout);
        this.o = viewGroup.findViewById(R.id.mode_switcher);
        ddf ddfVar = this.a;
        ddi ddiVar = ddl.a;
        ddfVar.d();
        linearLayout.setAccessibilityDelegate(new jav(this));
    }

    public final void j() {
        Drawable drawable;
        if (!this.a.k(dcu.J)) {
            this.b.setBackground(this.h.getDrawable(R.drawable.bg_text_on_video_recording_counter));
            this.c.setTextSize(0, this.l.getDimensionPixelSize(R.dimen.legacy_elapsed_timer_text_size));
            return;
        }
        Drawable drawable2 = this.l.getDrawable(R.drawable.bg_elapsed_timer, null);
        int color = this.l.getColor(R.color.elapsed_timer_text_color, null);
        if (!this.a.k(ddl.ay)) {
            color = this.l.getColor(R.color.elapsed_timer_text_color_legacy, null);
            this.c.setTextColor(color);
            ei.e(this.c.getContext(), R.font.google_sans_medium_compat, new jaw(this));
            drawable2.setTint(this.l.getColor(R.color.google_red600, null));
        }
        this.b.setBackground(drawable2);
        int dimensionPixelSize = this.l.getDimensionPixelSize(R.dimen.timer_side_padding);
        this.c.setTextSize(0, this.l.getDimensionPixelSize(R.dimen.elapsed_timer_text_size));
        this.c.setPadding(dimensionPixelSize, 0, true != this.k.c ? dimensionPixelSize : 0, 0);
        jar jarVar = this.k;
        if (jarVar.b) {
            drawable = this.h.getDrawable(R.drawable.quantum_gm_ic_mic_off_white_18);
        } else if (((Boolean) jarVar.d.fA()).booleanValue()) {
            drawable = this.a.k(dcu.r) ? this.h.getDrawable(R.drawable.gm_filled_mic_external_on_white_18) : this.h.getDrawable(R.drawable.quantum_ic_mic_external_on_white_18);
        } else {
            drawable = ((Boolean) this.k.e.fA()).booleanValue() ? this.h.getDrawable(R.drawable.gm_filled_bluetooth_connected_white_18) : null;
        }
        if (drawable != null) {
            drawable.setTint(color);
        }
        this.m.setVisibility(true != this.k.c ? 8 : 0);
        if (this.k.a) {
            this.c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            e();
        } else {
            this.c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            k();
        }
    }

    public final void k() {
        this.d.setVisibility(8);
        this.d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }
}
