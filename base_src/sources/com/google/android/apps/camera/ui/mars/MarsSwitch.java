package com.google.android.apps.camera.ui.mars;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.popupmenu.PopupMenuButton;
import com.google.android.apps.camera.ui.popupmenu.PopupMenuView;
import defpackage.hss;
import defpackage.jhp;
import defpackage.jrz;
import defpackage.mip;

/* JADX INFO: loaded from: classes.dex */
public class MarsSwitch extends FrameLayout {
    public PopupMenuView a;
    public PopupMenuButton b;
    private jrz c;

    public MarsSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = jrz.PORTRAIT;
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.mars_menu, this);
        this.b = (PopupMenuButton) findViewById(R.id.mars_menu_button);
        this.a = (PopupMenuView) findViewById(R.id.mars_menu_view);
    }

    public final void a(jrz jrzVar) {
        this.c = jrzVar;
        mip.es(this, jrzVar);
        mip.et(this.b, jrzVar);
        this.a.a(jrzVar);
    }

    public final void b(jhp jhpVar, boolean z) {
        this.b.setImageResource(jhpVar.c);
        if (z) {
            if (((hss) jhpVar.a).equals(hss.MARS_STORE)) {
                this.b.a(mip.dU(this));
                this.b.setColorFilter(mip.dP(this));
                return;
            } else {
                this.b.a(mip.dT(this));
                this.b.setColorFilter(mip.dS(this));
                return;
            }
        }
        if (((hss) jhpVar.a).equals(hss.MARS_STORE)) {
            this.b.a(getContext().getColor(R.color.mars_selected_legacy));
            this.b.b(getContext().getColor(R.color.button_container_bg_legacy));
        } else {
            this.b.a(getContext().getColor(R.color.normal_selected_legacy));
            this.b.b(getContext().getColor(R.color.button_container_bg_legacy));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            a(this.c);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (jrz.b(this.c)) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i2, i);
        }
    }
}
