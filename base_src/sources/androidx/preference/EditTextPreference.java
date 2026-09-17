package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.afy;
import defpackage.agd;
import defpackage.ahn;
import defpackage.et;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public String g;

    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iU = et.u(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iU, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ahn.d, iU, 0);
        if (et.A(typedArrayObtainStyledAttributes, 0, 0, false)) {
            if (agd.b == null) {
                agd.b = new agd(1);
            }
            P(agd.b);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected final Parcelable e() {
        Parcelable parcelableE = super.e();
        if (this.w) {
            return parcelableE;
        }
        afy afyVar = new afy(parcelableE);
        afyVar.a = this.g;
        return afyVar;
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(afy.class)) {
            super.g(parcelable);
            return;
        }
        afy afyVar = (afy) parcelable;
        super.g(afyVar.getSuperState());
        i(afyVar.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        i(u((String) obj));
    }

    public final void i(String str) {
        boolean zJ = j();
        this.g = str;
        ab(str);
        boolean zJ2 = j();
        if (zJ2 != zJ) {
            z(zJ2);
        }
        d();
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        return TextUtils.isEmpty(this.g) || super.j();
    }
}
