package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.afv;
import defpackage.ahm;
import defpackage.ahn;
import defpackage.et;

/* JADX INFO: loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    private final afv c;

    /* JADX WARN: Illegal instructions before constructor call */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        int iU = et.u(context, R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle);
        super(context, attributeSet, iU, 0);
        this.c = new afv(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ahn.b, iU, 0);
        o(et.z(typedArrayObtainStyledAttributes, 5, 0));
        l(et.z(typedArrayObtainStyledAttributes, 4, 1));
        ((TwoStatePreference) this).b = et.A(typedArrayObtainStyledAttributes, 3, 2, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ae(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public void a(ahm ahmVar) {
        super.a(ahmVar);
        ae(ahmVar.B(android.R.id.checkbox));
        ad(ahmVar);
    }

    @Override // androidx.preference.Preference
    public final void gn(View view) {
        F();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            ae(view.findViewById(android.R.id.checkbox));
            go(view.findViewById(android.R.id.summary));
        }
    }
}
