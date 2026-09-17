package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.ahm;
import defpackage.ahn;
import defpackage.ahs;
import defpackage.et;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    private final ahs c;
    private CharSequence d;
    private CharSequence e;

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle, 0);
        this.c = new ahs(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ahn.m, R.attr.switchPreferenceCompatStyle, 0);
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
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.a = this.d;
            switchCompat.requestLayout();
            if (switchCompat.isChecked()) {
                switchCompat.b();
            }
            switchCompat.b = this.e;
            switchCompat.requestLayout();
            if (!switchCompat.isChecked()) {
                switchCompat.a();
            }
            switchCompat.setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public final void a(ahm ahmVar) {
        super.a(ahmVar);
        ae(ahmVar.B(R.id.switchWidget));
        ad(ahmVar);
    }

    @Override // androidx.preference.Preference
    public final void gn(View view) {
        F();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            ae(view.findViewById(R.id.switchWidget));
            go(view.findViewById(android.R.id.summary));
        }
    }
}
