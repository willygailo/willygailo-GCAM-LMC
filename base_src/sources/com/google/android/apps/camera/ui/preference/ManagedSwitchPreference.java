package com.google.android.apps.camera.ui.preference;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.preference.Preference;
import android.preference.SwitchPreference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.enc;
import defpackage.hts;
import defpackage.hub;
import defpackage.huf;
import defpackage.jhu;
import defpackage.jhy;
import defpackage.jia;
import defpackage.jid;
import defpackage.jif;
import j$.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public class ManagedSwitchPreference extends SwitchPreference implements Preference.OnPreferenceChangeListener, jhu {
    public static final /* synthetic */ int n = 0;
    public hub a;
    public huf b;
    public Preference.OnPreferenceChangeListener c;
    public ColorStateList d;
    public ColorStateList e;
    public Integer f;
    public Integer g;
    public Integer h;
    public Runnable i;
    public String j;
    public String k;
    public View l;
    public View.OnClickListener m;
    private Button o;
    private LinearLayout p;
    private String q;
    private Switch r;
    private TextView s;
    private Function t;

    public ManagedSwitchPreference(Context context) {
        super(context);
        this.c = jhy.a;
        d(context);
    }

    public ManagedSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = jhy.a;
        d(context);
    }

    public ManagedSwitchPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = jhy.a;
        d(context);
    }

    public static final int c(FrameLayout frameLayout) {
        return frameLayout.getVisibility() == 0 ? R.drawable.quantum_gm_ic_expand_less_gm_grey_24 : R.drawable.quantum_gm_ic_expand_more_gm_grey_24;
    }

    private final void d(Context context) {
        ((jia) ((enc) context.getApplicationContext()).c(jia.class)).v(this);
        setPersistent(false);
        hts htsVarA = hts.a(getKey());
        if (htsVarA != null) {
            setDefaultValue(this.b.c(htsVarA));
        } else {
            setDefaultValue(Boolean.valueOf(this.a.m(getKey())));
        }
        super.setOnPreferenceChangeListener(this);
    }

    @Override // defpackage.jhu
    public final void a(Function function) {
        this.t = function;
    }

    public final void b(String str, Runnable runnable) {
        this.q = str;
        this.i = runnable;
    }

    @Override // android.preference.Preference
    public final Preference.OnPreferenceChangeListener getOnPreferenceChangeListener() {
        return this.c;
    }

    @Override // android.preference.Preference
    public final boolean getPersistedBoolean(boolean z) {
        return this.a.m(getKey());
    }

    @Override // android.preference.SwitchPreference, android.preference.Preference
    protected final void onBindView(View view) {
        View viewFindViewById;
        TextView textView;
        super.onBindView(view);
        if (this.d != null) {
            Switch r0 = (Switch) view.findViewById(android.R.id.switch_widget);
            this.r = r0;
            if (r0 != null) {
                r0.setThumbTintList(this.d);
                this.r.setThumbTintMode(PorterDuff.Mode.MULTIPLY);
            }
        }
        if (this.e != null) {
            Switch r1 = (Switch) view.findViewById(android.R.id.switch_widget);
            this.r = r1;
            if (r1 != null) {
                r1.setTrackTintList(this.e);
                this.r.setTrackTintMode(PorterDuff.Mode.MULTIPLY);
            }
        }
        if (this.f != null) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(android.R.id.background);
            this.p = linearLayout;
            if (linearLayout != null) {
                linearLayout.setBackgroundColor(this.f.intValue());
            }
        }
        if (this.g != null) {
            TextView textView2 = (TextView) view.findViewById(android.R.id.title);
            this.s = textView2;
            if (textView2 != null) {
                textView2.setTextColor(this.g.intValue());
            }
        }
        if (this.k != null && (textView = (TextView) view.findViewById(R.id.subtitle)) != null) {
            textView.setText(this.k);
            textView.setTextColor(this.h.intValue());
        }
        if (this.q != null && this.i != null) {
            Button button = (Button) view.findViewById(R.id.action_button);
            this.o = button;
            if (button != null) {
                button.setText(this.q);
                this.o.setOnClickListener(new View.OnClickListener() { // from class: jhz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.a.i.run();
                    }
                });
            }
        }
        if (this.j != null && this.l != null) {
            Button button2 = (Button) view.findViewById(R.id.expand_button);
            ImageView imageView = (ImageView) view.findViewById(R.id.expand_icon);
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.expand_button_layout);
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.collapsible_layout);
            if (button2 != null && imageView != null && linearLayout2 != null && frameLayout != null) {
                button2.setText(this.j);
                button2.setOnClickListener(new jif(frameLayout, imageView, 1));
                imageView.setImageResource(c(frameLayout));
                linearLayout2.setContentDescription(this.j);
                linearLayout2.setOnClickListener(new jid(button2, 1));
                frameLayout.removeAllViews();
                frameLayout.addView(this.l);
            }
        }
        if (this.m == null || (viewFindViewById = view.findViewById(R.id.helper_button)) == null) {
            return;
        }
        viewFindViewById.setOnClickListener(this.m);
    }

    @Override // android.preference.TwoStatePreference, android.preference.Preference
    protected final void onClick() {
        Function function = this.t;
        if (function == null || !((Boolean) function.apply(this)).booleanValue()) {
            super.onClick();
        }
    }

    @Override // android.preference.Preference.OnPreferenceChangeListener
    public final boolean onPreferenceChange(Preference preference, Object obj) {
        this.a.l(getKey(), ((Boolean) obj).booleanValue());
        return this.c.onPreferenceChange(preference, obj);
    }

    @Override // android.preference.Preference
    public final void setOnPreferenceChangeListener(Preference.OnPreferenceChangeListener onPreferenceChangeListener) {
        this.c = onPreferenceChangeListener;
    }
}
