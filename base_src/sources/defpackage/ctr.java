package defpackage;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.camcorder.ui.modeslider.recordspeed.RecordSpeedSlider;

/* JADX INFO: loaded from: classes.dex */
final class ctr implements View.OnLayoutChangeListener {
    final /* synthetic */ int a;
    final /* synthetic */ ols b;
    final /* synthetic */ int c;
    final /* synthetic */ boolean d;
    final /* synthetic */ int e;
    final /* synthetic */ cts f;
    final /* synthetic */ int g;

    public ctr(cts ctsVar, int i, ols olsVar, int i2, int i3, boolean z, int i4) {
        this.f = ctsVar;
        this.a = i;
        this.b = olsVar;
        this.g = i2;
        this.c = i3;
        this.d = z;
        this.e = i4;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        final RecordSpeedSlider recordSpeedSlider = (RecordSpeedSlider) view;
        if (view.getWidth() != this.a) {
            if (recordSpeedSlider.getLayoutParams().width == -2) {
                view.removeOnLayoutChangeListener(this);
                return;
            }
            return;
        }
        ols olsVar = this.b;
        int i11 = this.g;
        int i12 = this.c;
        cts ctsVar = this.f;
        int i13 = ctsVar.n;
        ddf ddfVar = ctsVar.d;
        recordSpeedSlider.removeAllViews();
        recordSpeedSlider.a.set(-1);
        Resources resources = recordSpeedSlider.getResources();
        recordSpeedSlider.c = olsVar;
        recordSpeedSlider.h = i11;
        recordSpeedSlider.f = i13;
        recordSpeedSlider.g = i12;
        recordSpeedSlider.e = ddfVar;
        GradientDrawable gradientDrawable = (GradientDrawable) ((InsetDrawable) recordSpeedSlider.getBackground()).getDrawable();
        if (!ddfVar.k(ddl.ay) && gradientDrawable != null) {
            gradientDrawable.setTintMode(PorterDuff.Mode.DST);
            gradientDrawable.setTint(recordSpeedSlider.getContext().getColor(R.color.record_speed_slider_bg_color_legacy));
        }
        int size = olsVar.n().size() + 1;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.record_speed_slider_knob_min_width);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.record_speed_slider_knob_max_width);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.record_speed_slider_knob_min_width_medium);
        int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.record_speed_slider_knob_max_width_medium);
        int dimensionPixelSize5 = resources.getDimensionPixelSize(R.dimen.record_speed_slider_knob_min_width_large);
        int dimensionPixelSize6 = resources.getDimensionPixelSize(R.dimen.record_speed_slider_knob_max_width_large);
        int dimensionPixelSize7 = resources.getDimensionPixelSize(R.dimen.record_speed_slider_knob_height);
        float dimensionPixelSize8 = resources.getDimensionPixelSize(R.dimen.record_speed_slider_text_size);
        float fA = jsa.a(resources.getDimension(R.dimen.record_speed_slider_text_letter_spacing));
        Drawable drawable = resources.getDrawable(R.drawable.quantum_gm_ic_arrow_back_white_18, null);
        Drawable drawable2 = resources.getDrawable(R.drawable.quantum_gm_ic_arrow_forward_white_18, null);
        final int i14 = 0;
        while (i14 < size) {
            int i15 = size;
            String str = i14 == recordSpeedSlider.f ? "" : (String) recordSpeedSlider.c.b(Integer.valueOf(recordSpeedSlider.b(i14))).get(0);
            int i16 = recordSpeedSlider.h;
            if (i16 == 0) {
                throw null;
            }
            int i17 = dimensionPixelSize4;
            String string = i16 == 1 ? i14 == recordSpeedSlider.f ? recordSpeedSlider.getResources().getString(R.string.accessibility_back_to_video_description) : (String) recordSpeedSlider.c.b(Integer.valueOf(i14 - 1)).get(1) : i14 == recordSpeedSlider.f ? recordSpeedSlider.getResources().getString(R.string.accessibility_back_to_video_description) : (String) recordSpeedSlider.c.b(Integer.valueOf(i14)).get(1);
            int i18 = dimensionPixelSize5;
            TextView textView = new TextView(recordSpeedSlider.getContext());
            int i19 = dimensionPixelSize6;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, dimensionPixelSize7);
            layoutParams.gravity = 8388627;
            textView.setLayoutParams(layoutParams);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setSingleLine(true);
            textView.setBackgroundColor(0);
            textView.setGravity(17);
            recordSpeedSlider.k(textView, ddfVar.k(ddl.ay) ? obr.e(textView, R.attr.colorOnSurface) : recordSpeedSlider.getContext().getColor(R.color.record_speed_slider_text_color_legacy));
            textView.setTextAlignment(4);
            textView.setTextSize(0, dimensionPixelSize8);
            textView.setText(str);
            textView.setLetterSpacing(fA);
            textView.setAlpha(0.0f);
            textView.setContentDescription(string);
            textView.setOnClickListener(new View.OnClickListener() { // from class: ctt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    RecordSpeedSlider recordSpeedSlider2 = recordSpeedSlider;
                    int i20 = i14;
                    recordSpeedSlider2.d.c(true);
                    recordSpeedSlider2.g(i20, true);
                    recordSpeedSlider2.d.b(recordSpeedSlider2, true);
                }
            });
            if (str.length() > 3) {
                i9 = i18;
                i10 = i19;
            } else if (str.length() > 2) {
                i9 = dimensionPixelSize3;
                i10 = i17;
            } else {
                i9 = dimensionPixelSize;
                i10 = dimensionPixelSize2;
            }
            textView.setMinWidth(i9);
            textView.setMaxWidth(i10);
            if (i14 == i13) {
                int dimensionPixelSize9 = resources.getDimensionPixelSize(R.dimen.record_speed_slider_arrow_min_width);
                int intrinsicWidth = (dimensionPixelSize9 / 2) - (drawable.getIntrinsicWidth() / 2);
                textView.setMinWidth(dimensionPixelSize9);
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i11 != 1 ? drawable2 : drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(0);
                textView.setPadding(intrinsicWidth, 0, 0, 0);
            } else {
                int i20 = recordSpeedSlider.b;
                textView.setPadding(i20, 0, i20, 0);
            }
            recordSpeedSlider.addView(textView, i14);
            i14++;
            size = i15;
            drawable2 = drawable2;
            dimensionPixelSize4 = i17;
            dimensionPixelSize5 = i18;
            dimensionPixelSize6 = i19;
        }
        int dimensionPixelSize10 = recordSpeedSlider.getResources().getDimensionPixelSize(R.dimen.record_speed_slider_side_padding);
        recordSpeedSlider.setPadding(dimensionPixelSize10, 0, dimensionPixelSize10, 0);
        int iMin = Math.min(recordSpeedSlider.getRootView().getMeasuredWidth(), recordSpeedSlider.getRootView().getMeasuredHeight());
        if (!recordSpeedSlider.c.p()) {
            int dimensionPixelSize11 = recordSpeedSlider.getResources().getDimensionPixelSize(R.dimen.record_speed_slider_side_margin);
            int i21 = iMin - (dimensionPixelSize11 + dimensionPixelSize11);
            int size2 = recordSpeedSlider.c.n().size() + 1;
            int dimensionPixelSize12 = recordSpeedSlider.getResources().getDimensionPixelSize(R.dimen.record_speed_slider_side_padding);
            recordSpeedSlider.measure(0, 0);
            if (recordSpeedSlider.getMeasuredWidth() > i21) {
                int measuredWidth = ((recordSpeedSlider.getMeasuredWidth() - (dimensionPixelSize12 + dimensionPixelSize12)) - i21) / size2;
                for (int i22 = 0; i22 < size2; i22++) {
                    TextView textView2 = (TextView) recordSpeedSlider.getChildAt(i22);
                    int minWidth = textView2.getMinWidth();
                    int maxWidth = textView2.getMaxWidth();
                    textView2.setMinWidth(minWidth - measuredWidth);
                    textView2.setMaxWidth(maxWidth - measuredWidth);
                }
            }
        }
        recordSpeedSlider.setOnTouchListener(new ctu(recordSpeedSlider));
        recordSpeedSlider.requestLayout();
        recordSpeedSlider.invalidate();
        for (int i23 = 0; i23 < ((old) this.b).b; i23++) {
            this.f.a.add(i23, false);
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) recordSpeedSlider.getLayoutParams();
        layoutParams2.width = -2;
        recordSpeedSlider.setLayoutParams(layoutParams2);
        recordSpeedSlider.d = new ctq(this, recordSpeedSlider);
        recordSpeedSlider.f(this.e);
    }
}
