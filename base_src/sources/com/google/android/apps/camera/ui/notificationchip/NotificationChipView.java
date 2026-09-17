package com.google.android.apps.camera.ui.notificationchip;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.jgt;
import defpackage.jgz;
import defpackage.jrz;
import defpackage.nu;

/* JADX INFO: loaded from: classes.dex */
public class NotificationChipView extends nu {
    public final Context a;
    public final jgz b;
    public int c;
    public boolean d;
    public jgt e;
    public long f;
    public Runnable g;
    private FrameLayout.LayoutParams h;

    public NotificationChipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new jgz();
        this.a = context;
    }

    public final void a() {
        removeCallbacks(this.g);
    }

    public final void b() {
        FrameLayout.LayoutParams layoutParams;
        if (getDisplay() == null || this.h == null) {
            return;
        }
        jrz jrzVarA = jrz.a(getDisplay(), this.a);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
        if (jrzVarA == jrz.PORTRAIT) {
            int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.notification_chip_layout_margin_with_options_menu_closed_icon);
            layoutParams = new FrameLayout.LayoutParams(this.h);
            layoutParams.topMargin = dimensionPixelSize;
        } else if (jrzVarA == jrz.REVERSE_LANDSCAPE) {
            layoutParams = new FrameLayout.LayoutParams(this.h);
            layoutParams.bottomMargin = this.h.topMargin;
            layoutParams.gravity = 81;
        } else {
            layoutParams = this.h;
        }
        if (layoutParams2.topMargin == layoutParams.topMargin && layoutParams2.bottomMargin == layoutParams.bottomMargin && layoutParams2.gravity == layoutParams.gravity) {
            return;
        }
        setLayoutParams(layoutParams);
    }

    public final void c(int i) {
        postDelayed(this.g, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h = (FrameLayout.LayoutParams) getLayoutParams();
    }
}
