package com.google.android.apps.camera.ui.preference;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.agm;
import defpackage.ahm;
import defpackage.enc;
import defpackage.hts;
import defpackage.hub;
import defpackage.huf;
import defpackage.jib;
import defpackage.jid;
import defpackage.jif;
import defpackage.jig;
import defpackage.jih;
import j$.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public class MaterialManagedSwitchPreference extends SwitchPreference implements agm, jib {
    public Integer F;
    public Runnable G;
    public String H;
    public String I;
    public View J;
    private Button K;
    private LinearLayout L;
    private String M;
    private Switch N;
    private TextView O;
    private Function P;
    public hub c;
    public huf d;
    public agm e;
    public ColorStateList f;
    public ColorStateList g;
    public Integer h;
    public Integer i;

    public MaterialManagedSwitchPreference(Context context) {
        super(context);
        this.e = jig.a;
        ag(context);
    }

    public MaterialManagedSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = jig.a;
        ag(context);
    }

    public MaterialManagedSwitchPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = jig.a;
        ag(context);
    }

    public static final int af(FrameLayout frameLayout) {
        return frameLayout.getVisibility() == 0 ? R.drawable.quantum_gm_ic_expand_less_gm_grey_24 : R.drawable.quantum_gm_ic_expand_more_gm_grey_24;
    }

    private final void ag(Context context) {
        ((jih) ((enc) context.getApplicationContext()).c(jih.class)).w(this);
        this.w = false;
        hts htsVarA = hts.a(this.t);
        if (htsVarA != null) {
            this.x = this.d.c(htsVarA);
        } else {
            this.x = Boolean.valueOf(this.c.m(this.t));
        }
        this.n = this;
    }

    @Override // androidx.preference.Preference
    public final void M(agm agmVar) {
        this.e = agmVar;
    }

    @Override // androidx.preference.Preference
    public final boolean V(boolean z) {
        return this.c.m(this.t);
    }

    @Override // androidx.preference.SwitchPreference, androidx.preference.Preference
    public final void a(ahm ahmVar) {
        TextView textView;
        super.a(ahmVar);
        if (this.f != null) {
            Switch r0 = (Switch) ahmVar.a.findViewById(android.R.id.switch_widget);
            this.N = r0;
            if (r0 != null) {
                r0.setThumbTintList(this.f);
                this.N.setThumbTintMode(PorterDuff.Mode.MULTIPLY);
            }
        }
        if (this.g != null) {
            Switch r1 = (Switch) ahmVar.a.findViewById(android.R.id.switch_widget);
            this.N = r1;
            if (r1 != null) {
                r1.setTrackTintList(this.g);
                this.N.setTrackTintMode(PorterDuff.Mode.MULTIPLY);
            }
        }
        if (this.h != null) {
            LinearLayout linearLayout = (LinearLayout) ahmVar.a.findViewById(android.R.id.background);
            this.L = linearLayout;
            if (linearLayout != null) {
                linearLayout.setBackgroundColor(this.h.intValue());
            }
        }
        if (this.i != null) {
            TextView textView2 = (TextView) ahmVar.a.findViewById(android.R.id.title);
            this.O = textView2;
            if (textView2 != null) {
                textView2.setTextColor(this.i.intValue());
            }
        }
        if (this.I != null && (textView = (TextView) ahmVar.a.findViewById(R.id.subtitle)) != null) {
            textView.setText(this.I);
            textView.setTextColor(this.F.intValue());
        }
        if (this.M != null && this.G != null) {
            Button button = (Button) ahmVar.a.findViewById(R.id.action_button);
            this.K = button;
            if (button != null) {
                button.setText(this.M);
                this.K.setOnClickListener(new View.OnClickListener() { // from class: jie
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.G.run();
                    }
                });
            }
        }
        if (this.H == null || this.J == null) {
            return;
        }
        Button button2 = (Button) ahmVar.a.findViewById(R.id.expand_button);
        ImageView imageView = (ImageView) ahmVar.a.findViewById(R.id.expand_icon);
        LinearLayout linearLayout2 = (LinearLayout) ahmVar.a.findViewById(R.id.expand_button_layout);
        FrameLayout frameLayout = (FrameLayout) ahmVar.a.findViewById(R.id.collapsible_layout);
        if (button2 == null || imageView == null || linearLayout2 == null || frameLayout == null) {
            return;
        }
        button2.setText(this.H);
        button2.setOnClickListener(new jif(frameLayout, imageView, 0));
        imageView.setImageResource(af(frameLayout));
        linearLayout2.setContentDescription(this.H);
        linearLayout2.setOnClickListener(new jid(button2, 0));
        frameLayout.removeAllViews();
        frameLayout.addView(this.J);
    }

    @Override // defpackage.jib
    public final void ac(Function function) {
        this.P = function;
    }

    public final void ae(String str, Runnable runnable) {
        this.M = str;
        this.G = runnable;
    }

    @Override // defpackage.agm
    public final boolean b(Preference preference, Object obj) {
        this.c.l(this.t, ((Boolean) obj).booleanValue());
        return this.e.b(preference, obj);
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    protected final void c() {
        Function function = this.P;
        if (function == null || !((Boolean) function.apply(this)).booleanValue()) {
            super.c();
        }
    }

    @Override // androidx.preference.Preference
    public final agm s() {
        return this.e;
    }
}
