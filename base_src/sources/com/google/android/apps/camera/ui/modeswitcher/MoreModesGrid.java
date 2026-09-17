package com.google.android.apps.camera.ui.modeswitcher;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridLayout;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.fjs;
import defpackage.jgm;
import defpackage.jgp;
import defpackage.jrl;
import defpackage.jrz;
import defpackage.lar;
import defpackage.obr;
import defpackage.oih;
import defpackage.ojc;
import defpackage.oug;
import defpackage.ouj;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MoreModesGrid extends GridLayout implements jgm {
    public final ArrayList b;
    public ojc c;
    public jrz d;
    public fjs e;
    public boolean f;
    public boolean g;
    public Animator h;
    int i;
    public int j;
    public float k;
    public boolean l;
    public ojc m;
    private int o;
    private int p;
    private static final ouj n = ouj.h("com/google/android/apps/camera/ui/modeswitcher/MoreModesGrid");
    public static final ColorFilter a = new ColorMatrixColorFilter(new float[]{0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});

    public MoreModesGrid(Context context) {
        super(context);
        this.b = new ArrayList();
        this.c = oih.a;
        this.f = false;
        this.g = true;
        this.h = new ObjectAnimator();
        this.k = 0.0f;
        this.l = false;
        this.m = oih.a;
        c(context);
    }

    public MoreModesGrid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new ArrayList();
        this.c = oih.a;
        this.f = false;
        this.g = true;
        this.h = new ObjectAnimator();
        this.k = 0.0f;
        this.l = false;
        this.m = oih.a;
        c(context);
    }

    public MoreModesGrid(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new ArrayList();
        this.c = oih.a;
        this.f = false;
        this.g = true;
        this.h = new ObjectAnimator();
        this.k = 0.0f;
        this.l = false;
        this.m = oih.a;
        c(context);
    }

    public MoreModesGrid(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = new ArrayList();
        this.c = oih.a;
        this.f = false;
        this.g = true;
        this.h = new ObjectAnimator();
        this.k = 0.0f;
        this.l = false;
        this.m = oih.a;
        c(context);
    }

    private final void c(Context context) {
        lar.a();
        setColumnCount(3);
        Resources resources = context.getResources();
        this.i = resources.getInteger(R.integer.show_more_modes_animation_duration);
        this.j = resources.getInteger(R.integer.hide_more_modes_animation_duration);
        this.k = resources.getDimension(R.dimen.more_modes_motion_animation_offset);
        this.o = resources.getDimensionPixelOffset(R.dimen.more_modes_grid_side_padding);
        this.p = resources.getDimensionPixelOffset(R.dimen.more_modes_grid_bottom_padding);
    }

    public final Animator a() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<MoreModesGrid, Float>) View.ALPHA, getAlpha(), 0.0f);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        return objectAnimatorOfFloat;
    }

    public final void b() {
        ObjectAnimator objectAnimatorOfFloat;
        this.h.cancel();
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<MoreModesGrid, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
        if (this.d == jrz.LANDSCAPE) {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<MoreModesGrid, Float>) View.TRANSLATION_Y, -this.k, 0.0f);
        } else {
            objectAnimatorOfFloat = this.d == jrz.REVERSE_LANDSCAPE ? ObjectAnimator.ofFloat(this, (Property<MoreModesGrid, Float>) View.TRANSLATION_Y, this.k, 0.0f) : ObjectAnimator.ofFloat(this, (Property<MoreModesGrid, Float>) View.TRANSLATION_X, this.k, 0.0f);
        }
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat2).with(objectAnimatorOfFloat);
        animatorSet.setDuration(this.i);
        setPivotY(getHeight());
        setPivotX(getWidth() / 2);
        setAlpha(0.0f);
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        setVisibility(0);
        if (((AccessibilityManager) getContext().getSystemService("accessibility")).isTouchExplorationEnabled() && getChildCount() > 1) {
            getChildAt(1).sendAccessibilityEvent(8);
        }
        animatorSet.start();
        this.h = animatorSet;
    }

    @Override // defpackage.jgm
    public final void i(jrl jrlVar, boolean z) {
        jgp jgpVar;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                jgpVar = null;
                break;
            } else {
                jgpVar = (jgp) arrayList.get(i);
                i++;
            }
        } while (jgpVar.a != jrlVar);
        if (jgpVar == null) {
            ((oug) ((oug) n.b()).G((char) 3364)).r("No ModeInfo found for %s", jrlVar);
            return;
        }
        if (z && jgpVar.c) {
            return;
        }
        if (z || jgpVar.c) {
            jgpVar.c = z;
            View view = jgpVar.b;
            if (view == null) {
                return;
            }
            ((LayerDrawable) ((TextView) view).getCompoundDrawables()[1]).getDrawable(2).setAlpha(true == z ? 255 : 0);
        }
    }

    @Override // android.widget.GridLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = false;
        if (getVisibility() == 0 && this.c.c() != this.d) {
            z2 = true;
        }
        this.c = ojc.i(this.d);
        if (z2) {
            if (this.l) {
                setVisibility(8);
            } else {
                b();
            }
        }
    }

    @Override // android.widget.GridLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size;
        obr.aR(!this.f, "modes changed without a later call to finalizeModeSetup");
        obr.aR(this.c.g(), "setUiOrientation must be called prior to layout");
        int i3 = this.o;
        if ((this.d == jrz.LANDSCAPE || this.d == jrz.REVERSE_LANDSCAPE) && (size = View.MeasureSpec.getSize(i) - View.MeasureSpec.getSize(i2)) > 0) {
            i3 += size >> 1;
        }
        setPadding(i3, getPaddingTop(), i3, this.p);
        super.onMeasure(i, i2);
    }
}
