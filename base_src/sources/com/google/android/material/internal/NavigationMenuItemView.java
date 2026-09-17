package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import defpackage.fg;
import defpackage.fz;
import defpackage.gl;
import defpackage.kz;
import defpackage.ll;
import defpackage.nzp;
import defpackage.nzq;
import defpackage.pa;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends nzp implements ll {
    private static final int[] d = {R.attr.state_checked};
    public boolean c;
    private int e;
    private final CheckedTextView i;
    private FrameLayout j;
    private kz k;
    private final fg l;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        nzq nzqVar = new nzq(this);
        this.l = nzqVar;
        q(0);
        LayoutInflater.from(context).inflate(com.google.android.GoogleCameraEngR18F1.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        this.e = context.getResources().getDimensionPixelSize(com.google.android.GoogleCameraEngR18F1.R.dimen.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.google.android.GoogleCameraEngR18F1.R.id.design_menu_item_text);
        this.i = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        gl.F(checkedTextView, nzqVar);
    }

    @Override // defpackage.ll
    public final kz a() {
        return this.k;
    }

    @Override // defpackage.ll
    public final boolean e() {
        return false;
    }

    @Override // defpackage.ll
    public final void f(kz kzVar) {
        StateListDrawable stateListDrawable;
        this.k = kzVar;
        int i = kzVar.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(true != kzVar.isVisible() ? 8 : 0);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.google.android.GoogleCameraEngR18F1.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(d, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            gl.G(this, stateListDrawable);
        }
        boolean zIsCheckable = kzVar.isCheckable();
        refreshDrawableState();
        if (this.c != zIsCheckable) {
            this.c = zIsCheckable;
            this.l.e(this.i, 2048);
        }
        boolean zIsChecked = kzVar.isChecked();
        refreshDrawableState();
        this.i.setChecked(zIsChecked);
        setEnabled(kzVar.isEnabled());
        this.i.setText(kzVar.d);
        Drawable icon = kzVar.getIcon();
        if (icon != null) {
            int i2 = this.e;
            icon.setBounds(0, 0, i2, i2);
        }
        fz.c(this.i, icon, null, null);
        View actionView = kzVar.getActionView();
        if (actionView != null) {
            if (this.j == null) {
                this.j = (FrameLayout) ((ViewStub) findViewById(com.google.android.GoogleCameraEngR18F1.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.j.removeAllViews();
            this.j.addView(actionView);
        }
        setContentDescription(kzVar.l);
        setTooltipText(kzVar.m);
        kz kzVar2 = this.k;
        if (kzVar2.d == null && kzVar2.getIcon() == null && this.k.getActionView() != null) {
            this.i.setVisibility(8);
            FrameLayout frameLayout = this.j;
            if (frameLayout != null) {
                pa paVar = (pa) frameLayout.getLayoutParams();
                paVar.width = -1;
                this.j.setLayoutParams(paVar);
                return;
            }
            return;
        }
        this.i.setVisibility(0);
        FrameLayout frameLayout2 = this.j;
        if (frameLayout2 != null) {
            pa paVar2 = (pa) frameLayout2.getLayoutParams();
            paVar2.width = -2;
            this.j.setLayoutParams(paVar2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        kz kzVar = this.k;
        if (kzVar != null && kzVar.isCheckable() && this.k.isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, d);
        }
        return iArrOnCreateDrawableState;
    }
}
