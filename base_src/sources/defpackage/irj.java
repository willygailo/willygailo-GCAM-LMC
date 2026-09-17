package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class irj extends FrameLayout {
    public final ImageView a;
    public final Resources b;
    public final TextView c;
    public final TextView d;

    public irj(Context context) {
        super(context);
        this.c = new TextView(context, null, 0, R.style.elapsedTimerStyle);
        this.d = new TextView(context, null, 0, R.style.outputTimerStyle);
        this.a = new ImageView(context);
        this.b = context.getResources();
    }

    public final void a() {
        this.c.setPadding(this.b.getDimensionPixelSize(R.dimen.frame_based_elapsed_timer_left_padding), 0, 0, 0);
        this.c.setCompoundDrawablePadding(this.b.getDimensionPixelSize(R.dimen.frame_based_timer_red_indicator_drawable_text_padding));
        this.c.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_recording_red_indicator, 0, 0, 0);
        this.c.setLetterSpacing(mip.eF(this.b.getDimension(R.dimen.frame_based_timer_text_character_spacing)));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, this.b.getDimensionPixelSize(R.dimen.frame_based_elapsed_timer_height));
        layoutParams.gravity = 19;
        this.c.setLayoutParams(layoutParams);
        this.c.setGravity(16);
        this.a.setImageDrawable(this.b.getDrawable(R.drawable.quantum_gm_ic_trending_flat_vd_theme_24, null));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = this.b.getDimensionPixelSize(R.dimen.frame_based_timer_arrow_indicator_left_margin);
        layoutParams2.gravity = 19;
        this.a.setLayoutParams(layoutParams2);
        this.d.setLetterSpacing(mip.eF(this.b.getDimension(R.dimen.frame_based_timer_text_character_spacing)));
        this.d.setGravity(16);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, this.b.getDimensionPixelSize(R.dimen.frame_based_output_timer_height));
        layoutParams3.leftMargin = this.b.getDimensionPixelSize(R.dimen.frame_based_output_timer_left_margin);
        layoutParams3.gravity = 19;
        this.d.setLayoutParams(layoutParams3);
    }

    public final void b(boolean z, boolean z2) {
        int dimensionPixelSize = this.b.getDimensionPixelSize(R.dimen.frame_based_timer_expand_width);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.a.getLayoutParams();
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        if (z) {
            layoutParams.width = -2;
            layoutParams2.leftMargin = this.b.getDimensionPixelSize(R.dimen.frame_based_timer_arrow_indicator_left_margin) + dimensionPixelSize;
            layoutParams3.leftMargin = this.b.getDimensionPixelSize(R.dimen.frame_based_output_timer_left_margin) + dimensionPixelSize;
        }
        if (z2) {
            layoutParams3.width = -2;
        }
        this.c.setLayoutParams(layoutParams);
        this.a.setLayoutParams(layoutParams2);
        this.d.setLayoutParams(layoutParams3);
        requestLayout();
    }

    final void c(String str) {
        if (this.c.getText().toString().equals(str)) {
            return;
        }
        this.c.setText(str);
    }

    public final void d(String str) {
        if (this.d.getText().toString().equals(str)) {
            return;
        }
        this.d.setText(str);
    }
}
