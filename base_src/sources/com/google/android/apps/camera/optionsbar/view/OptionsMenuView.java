package com.google.android.apps.camera.optionsbar.view;

import android.content.Context;
import android.os.Trace;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.gtk;
import defpackage.gtl;
import defpackage.gtm;
import defpackage.gtp;
import defpackage.gtv;
import defpackage.gtw;
import defpackage.gug;
import defpackage.guq;
import defpackage.gut;
import defpackage.jrz;
import defpackage.mip;
import defpackage.oug;
import defpackage.ouj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class OptionsMenuView extends ScrollView {
    public static final ouj a = ouj.h("com/google/android/apps/camera/optionsbar/view/OptionsMenuView");
    public final GestureDetector b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final Map f;
    public boolean g;
    public int h;
    public jrz i;
    public guq j;
    public gtw k;
    public LinearLayout l;
    public gug m;

    public OptionsMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
        this.g = false;
        this.i = jrz.PORTRAIT;
        this.b = new GestureDetector(context, new gut(this));
    }

    public final int a() {
        LinearLayout linearLayout = this.l;
        if (linearLayout != null) {
            return linearLayout.getChildCount();
        }
        return 0;
    }

    public final void b(gtm gtmVar) {
        c(gtmVar, null);
    }

    public final void c(gtm gtmVar, String str) {
        synchronized (this) {
            guq guqVar = (guq) this.f.get(gtmVar);
            if (guqVar != null) {
                ArrayList arrayList = guqVar.d;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ImageButton imageButton = (ImageButton) ((FrameLayout) arrayList.get(i)).getChildAt(0);
                    imageButton.setEnabled(false);
                    if (guqVar.l) {
                        imageButton.setImageAlpha(153);
                    } else {
                        imageButton.setImageAlpha(64);
                    }
                }
                ImageButton imageButton2 = (ImageButton) guqVar.e.get(guqVar.n);
                if (imageButton2 != null) {
                    guqVar.f(imageButton2);
                }
                if (TextUtils.isEmpty(str)) {
                    guqVar.h.setText(R.string.options_menu_disabled);
                    guqVar.h.setContentDescription(guqVar.getResources().getString(R.string.options_menu_disabled_desc));
                } else {
                    guqVar.h.setText(str);
                    guqVar.h.setContentDescription(str);
                }
                if (guqVar.l) {
                    guqVar.h.setTextColor(mip.dO(guqVar));
                } else {
                    guqVar.h.setTextColor(guqVar.getResources().getColor(R.color.options_menu_value_color_disabled, null));
                }
                guqVar.setEnabled(false);
            }
        }
    }

    public final void d(gtm gtmVar, gtv gtvVar) {
        synchronized (this) {
            if (this.f.get(gtmVar) != null) {
                guq guqVar = (guq) this.f.get(gtmVar);
                ImageButton imageButton = (ImageButton) guqVar.e.get(gtvVar);
                imageButton.getClass();
                if (imageButton != ((ImageButton) guqVar.e.get(guqVar.n))) {
                    imageButton.setEnabled(false);
                    if (guqVar.l) {
                        imageButton.setImageAlpha(153);
                    } else {
                        imageButton.setImageAlpha(64);
                    }
                }
            }
        }
    }

    public final void e(gtm gtmVar) {
        synchronized (this) {
            if (this.f.get(gtmVar) != null) {
                guq guqVar = (guq) this.f.get(gtmVar);
                ArrayList arrayList = guqVar.d;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ImageButton imageButton = (ImageButton) ((FrameLayout) arrayList.get(i)).getChildAt(0);
                    imageButton.setEnabled(true);
                    imageButton.setImageAlpha(255);
                }
                ImageButton imageButton2 = (ImageButton) guqVar.e.get(guqVar.n);
                if (imageButton2 != null) {
                    guqVar.e(imageButton2);
                    gtl gtlVar = (gtl) guqVar.f.get(imageButton2);
                    gtlVar.getClass();
                    guqVar.h.setText(gtlVar.b(guqVar.getResources()));
                    guqVar.h.setContentDescription(gtlVar.a(guqVar.getResources()));
                    if (guqVar.l) {
                        guqVar.h.setTextColor(mip.dQ(guqVar));
                    } else {
                        guqVar.h.setTextColor(guqVar.getResources().getColor(R.color.options_menu_value_color, null));
                    }
                }
                ((guq) this.f.get(gtmVar)).setEnabled(true);
            }
        }
    }

    public final void f(gtm gtmVar, boolean z) {
        if (this.f.get(gtmVar) != null) {
            ArrayList arrayList = ((guq) this.f.get(gtmVar)).d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ImageButton) ((FrameLayout) arrayList.get(i)).getChildAt(0)).setEnabled(z);
            }
            ((guq) this.f.get(gtmVar)).setEnabled(z);
        }
    }

    public final void g(gtk gtkVar, gtp gtpVar) {
        this.d.put(gtkVar, gtpVar);
    }

    public final boolean h(gtm gtmVar) {
        boolean z;
        synchronized (this) {
            z = ((guq) this.f.get(gtmVar)) != null;
        }
        return z;
    }

    public final boolean i(gtm gtmVar) {
        if (this.f.get(gtmVar) != null) {
            return ((guq) this.f.get(gtmVar)).isEnabled();
        }
        return false;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        Trace.beginSection("optionsMenu:inflate");
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.options_menu_layout, this);
        setLayerType(1, null);
        this.l = (LinearLayout) findViewById(R.id.options_menu_internal_list);
        setOnTouchListener(new View.OnTouchListener() { // from class: gur
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.a.b.onTouchEvent(motionEvent);
            }
        });
        setScrollbarFadingEnabled(false);
        Trace.endSection();
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.g) {
            int mode = View.MeasureSpec.getMode(i2);
            if (this.h > 0 && mode != 1073741824 && (mode == 0 || View.MeasureSpec.getSize(i2) > this.h)) {
                i2 = View.MeasureSpec.makeMeasureSpec(this.h, Integer.MIN_VALUE);
            }
        } else {
            try {
                int size = View.MeasureSpec.getSize(i2);
                int dimensionPixelSize = (this.h - getResources().getDimensionPixelSize(R.dimen.options_menu_setting_height)) - getResources().getDimensionPixelSize(R.dimen.options_menu_line_height);
                int dimensionPixelSize2 = dimensionPixelSize / getResources().getDimensionPixelSize(R.dimen.options_row_height);
                if (size > dimensionPixelSize) {
                    double d = dimensionPixelSize2;
                    Double.isNaN(d);
                    double d2 = d - 0.5d;
                    double dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.options_row_height);
                    Double.isNaN(dimensionPixelSize3);
                    size = (int) (d2 * dimensionPixelSize3);
                }
                i2 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                try {
                    getLayoutParams().height = size;
                } catch (RuntimeException e) {
                    e = e;
                    ((oug) ((oug) ((oug) a.b()).h(e)).G((char) 2153)).o("Error forcing height.");
                }
            } catch (RuntimeException e2) {
                e = e2;
            }
        }
        super.onMeasure(i, i2);
    }
}
