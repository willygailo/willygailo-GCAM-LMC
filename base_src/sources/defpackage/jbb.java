package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.text.format.DateUtils;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.elapsedtimeui.ElapsedTimerView;
import com.google.android.apps.camera.ui.elapsedtimeui.LongPressElapsedTimeView;
import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public final class jbb implements jas {
    private static final ouj b = ouj.h("com/google/android/apps/camera/ui/elapsedtimeui/LongPressElapsedTimeUIControllerImpl");
    public LongPressElapsedTimeView a;
    private final Activity c;
    private final jas d;
    private final huf e;
    private ElapsedTimerView f;
    private ViewGroup g;
    private Resources h;
    private final int[] i = new int[2];
    private int j;
    private final boolean k;
    private final int l;

    public jbb(Activity activity, jas jasVar, huf hufVar, ddf ddfVar) {
        this.c = activity;
        this.d = jasVar;
        this.e = hufVar;
        this.k = ddfVar.k(ddr.n);
        this.l = ((Integer) ddfVar.a(ddr.a).c()).intValue();
        ddfVar.d();
    }

    private final void k(ViewGroup viewGroup, int i) {
        LongPressElapsedTimeView longPressElapsedTimeView;
        if (viewGroup != this.g && (longPressElapsedTimeView = this.a) != null) {
            viewGroup.removeView(longPressElapsedTimeView);
            this.g.addView(this.a);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.a.getLayoutParams();
        layoutParams.bottomMargin = this.j;
        layoutParams.topMargin = this.j;
        layoutParams.gravity = i | 1;
        this.a.setLayoutParams(layoutParams);
    }

    private final void l(ah ahVar, View view) {
        this.c.findViewById(R.id.bottom_bar).getLocationInWindow(this.i);
        ahVar.e(view.getId(), 3, 0, 3, (this.i[1] - this.h.getDimensionPixelSize(R.dimen.timer_height)) - this.h.getDimensionPixelOffset(R.dimen.long_press_bottom_padding));
        ahVar.e(view.getId(), 6, 0, 6, 0);
        ahVar.e(view.getId(), 7, 0, 7, 0);
    }

    @Override // defpackage.jas
    public final void a(boolean z) {
        if (!this.k) {
            this.d.a(z);
            return;
        }
        if (z) {
            LongPressElapsedTimeView longPressElapsedTimeView = this.a;
            longPressElapsedTimeView.removeCallbacks(longPressElapsedTimeView.d);
            this.a.animate().setDuration(60L).setStartDelay(0L).alpha(0.0f).withEndAction(new jba(this, 1));
        } else {
            this.a.animate().cancel();
            this.a.setAlpha(0.0f);
            this.a.setVisibility(8);
        }
    }

    @Override // defpackage.jas
    public final void b() {
        this.d.b();
    }

    @Override // defpackage.jas
    public final void c() {
        this.d.c();
    }

    @Override // defpackage.jas
    public final void d(jar jarVar) {
    }

    @Override // defpackage.jas
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.jas
    public final void f() {
        ah ahVar;
        Display display = this.c.getDisplay();
        if (display == null) {
            throw new IllegalStateException("Orientation can not be determined");
        }
        if (jrz.b(this.k ? jrz.a(display, this.a.getContext()) : jrz.a(display, this.f.getContext()))) {
            final LinearLayout linearLayout = this.k ? this.a : this.f;
            ((ViewGroup) linearLayout.getParent()).removeView(linearLayout);
            ViewGroup viewGroup = (ViewGroup) this.c.findViewById(R.id.activity_root_view);
            viewGroup.addView(linearLayout);
            linearLayout.bringToFront();
            ah ahVar2 = new ah();
            ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup;
            ahVar2.d(constraintLayout);
            switch (hls.h(((Integer) this.e.c(htu.d)).intValue()) - 1) {
                case 0:
                    if (!((Boolean) this.e.c(htu.k)).booleanValue()) {
                        View viewFindViewById = this.c.findViewById(R.id.shutter_button);
                        viewFindViewById.getLocationInWindow(this.i);
                        ahVar = ahVar2;
                        ahVar2.e(linearLayout.getId(), 3, 0, 3, (((this.i[1] + (viewFindViewById.getHeight() / 2)) - this.h.getDimensionPixelSize(R.dimen.photo_button_radius)) - this.h.getDimensionPixelSize(R.dimen.timer_height)) - this.h.getDimensionPixelOffset(R.dimen.long_press_bottom_padding));
                        ahVar.e(linearLayout.getId(), 6, 0, 6, 0);
                        ahVar.e(linearLayout.getId(), 7, 0, 7, 0);
                    } else {
                        l(ahVar2, linearLayout);
                        ahVar = ahVar2;
                    }
                    break;
                case 1:
                    l(ahVar2, linearLayout);
                    ahVar = ahVar2;
                    break;
                default:
                    ahVar = ahVar2;
                    ((oug) ((oug) b.b()).G((char) 3236)).o("Invalid aspect ratio detected!");
                    break;
            }
            ahVar.b(constraintLayout);
            h(0L);
            j();
            linearLayout.animate().setDuration(200L).setStartDelay(517L).alpha(1.0f).withStartAction(new Runnable() { // from class: jaz
                @Override // java.lang.Runnable
                public final void run() {
                    linearLayout.setVisibility(0);
                }
            });
        } else if (this.k) {
            h(0L);
            if (this.g != null) {
                Display display2 = this.c.getDisplay();
                if (display2 == null) {
                    throw new IllegalStateException("Orientation can not be determined");
                }
                jrz jrzVarA = jrz.a(display2, this.a.getContext());
                ViewGroup viewGroup2 = (ViewGroup) this.a.getParent();
                switch (jrzVarA.ordinal()) {
                    case 1:
                        k(viewGroup2, 80);
                        break;
                    case 2:
                        k(viewGroup2, 48);
                        break;
                }
            }
            j();
            this.a.animate().setDuration(200L).setStartDelay(517L).alpha(1.0f).withStartAction(new jba(this, 0));
        } else {
            this.d.f();
        }
        if (this.k) {
            LongPressElapsedTimeView longPressElapsedTimeView = this.a;
            switch (this.l) {
                case 0:
                    longPressElapsedTimeView.c.startAnimation(longPressElapsedTimeView.a);
                    return;
                case 1:
                    longPressElapsedTimeView.c.startAnimation(longPressElapsedTimeView.b);
                    return;
                case 2:
                    longPressElapsedTimeView.d.run();
                    return;
                default:
                    return;
            }
        }
    }

    @Override // defpackage.jas
    public final void g(long j) {
    }

    @Override // defpackage.jas
    public final void h(long j) {
        if (this.k) {
            this.a.b().setText(DateUtils.formatElapsedTime(Duration.ofMillis(j).getSeconds()));
        } else {
            this.d.h(j);
        }
    }

    @Override // defpackage.jas
    public final void i(LinearLayout linearLayout) {
        if (this.k) {
            LongPressElapsedTimeView longPressElapsedTimeView = (LongPressElapsedTimeView) linearLayout;
            this.a = longPressElapsedTimeView;
            longPressElapsedTimeView.setLayerType(1, null);
        } else {
            this.f = (ElapsedTimerView) linearLayout;
        }
        this.h = linearLayout.getResources();
        if (this.k) {
            ViewGroup viewGroup = (ViewGroup) this.a.getRootView();
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.camera_app_root);
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            }
            this.g = (ViewGroup) viewGroup.findViewById(R.id.uncovered_preview_layout);
            this.j = this.h.getDimensionPixelSize(R.dimen.recording_time_landscape_vertical_margin);
        }
    }

    public final void j() {
        if (this.k) {
            this.a.setBackground(this.h.getDrawable(R.drawable.bg_text_on_video_recording_counter, null));
            int dimensionPixelSize = this.h.getDimensionPixelSize(R.dimen.long_shot_elapsed_timer_text_size);
            int dimensionPixelSize2 = this.h.getDimensionPixelSize(R.dimen.timer_side_padding);
            this.a.b().setTextSize(0, dimensionPixelSize);
            this.a.b().setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
            this.a.b().setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_recording_on_red_circle, 0, 0, 0);
            this.a.a().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.a.a().setVisibility(8);
            return;
        }
        this.f.setBackground(this.h.getDrawable(R.drawable.bg_text_on_video_recording_counter, null));
        int dimensionPixelSize3 = this.h.getDimensionPixelSize(R.dimen.legacy_elapsed_timer_text_size);
        int dimensionPixelSize4 = this.h.getDimensionPixelSize(R.dimen.timer_side_padding);
        this.f.b().setTextSize(0, dimensionPixelSize3);
        this.f.b().setPadding(dimensionPixelSize4, 0, dimensionPixelSize4, 0);
        this.f.b().setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_recording_on_red_circle, 0, 0, 0);
        this.f.a().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        this.f.a().setVisibility(8);
    }
}
