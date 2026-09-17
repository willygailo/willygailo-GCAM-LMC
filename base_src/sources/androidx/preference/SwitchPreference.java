package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.ahm;
import defpackage.ahn;
import defpackage.ahr;
import defpackage.et;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    private final ahr c;
    private CharSequence d;
    private CharSequence e;

    public SwitchPreference(Context context) {
        this(context, null);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, et.u(context, R.attr.switchPreferenceStyle, android.R.attr.switchPreferenceStyle));
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = new ahr(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ahn.l, i, i2);
        o(et.z(typedArrayObtainStyledAttributes, 7, 0));
        l(et.z(typedArrayObtainStyledAttributes, 6, 1));
        this.d = et.z(typedArrayObtainStyledAttributes, 9, 3);
        d();
        this.e = et.z(typedArrayObtainStyledAttributes, 8, 4);
        d();
        ((TwoStatePreference) this).b = et.A(typedArrayObtainStyledAttributes, 5, 2, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ae(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.d);
            r4.setTextOff(this.e);
            r4.setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public void a(ahm ahmVar) {
        super.a(ahmVar);
        ae(ahmVar.B(android.R.id.switch_widget));
        ad(ahmVar);
    }

    @Override // androidx.preference.Preference
    public final void gn(View view) {
        F();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            ae(view.findViewById(android.R.id.switch_widget));
            go(view.findViewById(android.R.id.summary));
        }
    }
}
