package com.google.android.apps.camera.smarts;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.smarts.SmartsChipView;
import defpackage.huq;
import defpackage.hxa;
import defpackage.hxy;
import defpackage.hxz;
import defpackage.hya;
import defpackage.hzb;
import defpackage.iap;
import defpackage.iax;
import defpackage.jsa;
import defpackage.lap;
import defpackage.lce;

/* JADX INFO: loaded from: classes.dex */
public class SmartsChipView extends LinearLayout {
    public FrameLayout a;
    public TextView b;
    public FrameLayout c;
    public boolean d;
    public boolean e;
    public Runnable f;
    public Runnable g;
    public CharSequence h;
    public boolean i;
    public boolean j;
    public boolean k;
    public lap l;
    public int m;
    private ImageView n;
    private ImageView o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;

    public SmartsChipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = false;
        this.e = false;
        this.h = "";
        this.m = 1;
        this.i = true;
        this.j = true;
        this.l = new lap();
    }

    public final void a(int i) {
        animate().alpha(i == 0 ? 1.0f : 0.0f).setDuration(this.t).setListener(new hya(this, i)).start();
    }

    public final void b() {
        this.h = "";
        this.e = false;
        this.d = false;
        a(8);
        Runnable runnable = this.g;
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.f;
        if (runnable2 != null) {
            runnable2.run();
        }
        this.l.close();
        this.f = null;
    }

    public final void c(final iap iapVar) {
        if (iapVar.s()) {
            iax iaxVar = ((hzb) iapVar).b;
            String str = iaxVar.c;
            Drawable drawable = iaxVar.d;
            final Runnable runnable = iaxVar.e;
            final Runnable runnable2 = iaxVar.h;
            if (str != null) {
                this.b.setText(str);
                this.b.setVisibility(0);
            } else {
                this.b.setVisibility(8);
            }
            if (drawable != null) {
                this.n.setImageDrawable(drawable);
                this.n.setVisibility(0);
            } else {
                this.n.setVisibility(8);
            }
            if (runnable != null) {
                this.a.setClickable(true);
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: hxt
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        iap iapVar2 = iapVar;
                        Runnable runnable3 = runnable;
                        hzb hzbVar = (hzb) iapVar2;
                        hzbVar.d.ab(3, hzbVar.a.a);
                        runnable3.run();
                    }
                };
                View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: hxv
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        SmartsChipView smartsChipView = this.a;
                        if (motionEvent.getAction() == 0) {
                            smartsChipView.a.animate().scaleX(1.1f);
                            smartsChipView.a.animate().scaleY(1.1f);
                            return false;
                        }
                        if (motionEvent.getAction() != 1) {
                            return false;
                        }
                        smartsChipView.a.animate().scaleX(1.0f);
                        smartsChipView.a.animate().scaleY(1.0f);
                        return false;
                    }
                };
                this.a.setOnClickListener(onClickListener);
                this.a.setOnTouchListener(onTouchListener);
                this.b.setOnClickListener(onClickListener);
                this.b.setOnTouchListener(onTouchListener);
            } else {
                this.a.setClickable(false);
            }
            if (runnable2 != null) {
                this.o.setVisibility(0);
                this.o.setClickable(true);
                this.o.setOnClickListener(new View.OnClickListener() { // from class: hxs
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SmartsChipView smartsChipView = this.a;
                        iap iapVar2 = iapVar;
                        Runnable runnable3 = runnable2;
                        hzb hzbVar = (hzb) iapVar2;
                        hzbVar.d.ab(5, hzbVar.a.a);
                        runnable3.run();
                        if (smartsChipView.e) {
                            smartsChipView.b();
                        }
                    }
                });
                this.o.setContentDescription(getResources().getString(R.string.dialog_dismiss));
                TextView textView = this.b;
                textView.setPaddingRelative(textView.getPaddingLeft(), this.b.getPaddingTop(), 0, this.b.getPaddingBottom());
            } else {
                this.o.setVisibility(8);
                this.o.setContentDescription("");
                TextView textView2 = this.b;
                textView2.setPaddingRelative(textView2.getPaddingLeft(), this.b.getPaddingTop(), this.s, this.b.getPaddingBottom());
            }
            this.a.setVisibility(0);
            this.a.setContentDescription(iaxVar.g);
        } else {
            this.a.setVisibility(8);
            this.a.setContentDescription("");
        }
        this.b.setMaxWidth(this.p);
        this.c.setVisibility(8);
        this.c.setContentDescription("");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    public final void d(hxa hxaVar) {
        boolean z;
        boolean z2;
        boolean z3;
        iap iapVar = hxaVar.a;
        boolean z4 = hxaVar.b;
        this.j = hxaVar.d;
        this.k = hxaVar.e;
        this.m = hxaVar.f;
        this.i = hxaVar.c;
        hzb hzbVar = (hzb) iapVar;
        int i = hzbVar.f.f().e % 180;
        int i2 = hzbVar.f.f().e;
        if (this.k) {
            z = true;
        } else {
            int i3 = this.m;
            if (i3 == 0) {
                throw null;
            }
            z = i3 != 1;
        }
        huq huqVar = hzbVar.h;
        if (i2 == 90 && ((Boolean) ((lce) huqVar.c).d).booleanValue()) {
            z2 = true;
        } else if (i != 0) {
            z2 = false;
        } else {
            int i4 = this.m;
            if (i4 == 0) {
                throw null;
            }
            if (i4 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if ((i2 == 90 && ((Boolean) ((lce) huqVar.b).d).booleanValue()) || (i == 0 && z && this.i)) {
            z3 = true;
        } else {
            z3 = i == 0 && this.j;
        }
        int i5 = this.q;
        if (i == 0 && z && this.i && this.j) {
            i5 += this.r;
        } else if (i == 0 && this.j) {
            i5 = this.r;
        }
        if (!z2 && !z3) {
            i5 = 0;
        }
        boolean z5 = !z4 && hzbVar.g;
        float f = i5;
        if (f != getTranslationY()) {
            if (z5) {
                animate().translationY(f).setDuration(this.t).start();
            } else {
                setTranslationY(f);
            }
        }
        if (hzbVar.g) {
            if (z2 && getVisibility() == 0) {
                a(8);
            } else {
                if (z2 || getVisibility() != 8) {
                    return;
                }
                a(0);
            }
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (FrameLayout) findViewById(R.id.smarts_chip);
        this.n = (ImageView) findViewById(R.id.smarts_chip_icon);
        this.b = (TextView) findViewById(R.id.smarts_chip_text);
        this.o = (ImageView) findViewById(R.id.smarts_chip_dismiss_button);
        this.c = (FrameLayout) findViewById(R.id.smarts_action_button);
        this.q = getContext().getResources().getDimensionPixelSize(R.dimen.smarts_notification_drawables_slide_up_y_translation);
        this.r = -jsa.b(56.0f);
        this.t = getResources().getInteger(R.integer.smarts_ui_animation_duration_ms);
        getResources().getDimensionPixelSize(R.dimen.smarts_notification_chip_max_width_with_button);
        this.p = getResources().getDimensionPixelSize(R.dimen.smarts_notification_chip_max_width_without_button);
        this.s = getResources().getDimensionPixelSize(R.dimen.smarts_notification_chip_text_padding_right);
        hxy hxyVar = new hxy(this);
        this.a.setAccessibilityDelegate(new hxz(this, hxyVar));
        this.c.setAccessibilityDelegate(hxyVar);
        this.b.setMovementMethod(new ScrollingMovementMethod());
    }
}
