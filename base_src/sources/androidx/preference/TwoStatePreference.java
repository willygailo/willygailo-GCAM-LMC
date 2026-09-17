package androidx.preference;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import defpackage.ahm;
import defpackage.aht;

/* JADX INFO: loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    public boolean a;
    public boolean b;
    private CharSequence c;
    private CharSequence d;
    private boolean e;

    public TwoStatePreference(Context context) {
        this(context, null);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    protected final void ad(ahm ahmVar) {
        go(ahmVar.B(R.id.summary));
    }

    @Override // androidx.preference.Preference
    protected void c() {
        boolean z = !this.a;
        if (U(Boolean.valueOf(z))) {
            k(z);
        }
    }

    @Override // androidx.preference.Preference
    protected final Parcelable e() {
        Parcelable parcelableE = super.e();
        if (this.w) {
            return parcelableE;
        }
        aht ahtVar = new aht(parcelableE);
        ahtVar.a = this.a;
        return ahtVar;
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(aht.class)) {
            super.g(parcelable);
            return;
        }
        aht ahtVar = (aht) parcelable;
        super.g(ahtVar.getSuperState());
        k(ahtVar.a);
    }

    protected final void go(View view) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            int i = 0;
            if (this.a && !TextUtils.isEmpty(this.c)) {
                textView.setText(this.c);
            } else if (this.a || TextUtils.isEmpty(this.d)) {
                CharSequence charSequenceM = m();
                if (TextUtils.isEmpty(charSequenceM)) {
                    i = 8;
                } else {
                    textView.setText(charSequenceM);
                }
            } else {
                textView.setText(this.d);
            }
            if (i != textView.getVisibility()) {
                textView.setVisibility(i);
            }
        }
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        if (obj == null) {
            obj = false;
        }
        k(V(((Boolean) obj).booleanValue()));
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        if (this.b) {
            if (this.a) {
                return true;
            }
        } else if (!this.a) {
            return true;
        }
        return super.j();
    }

    public final void k(boolean z) {
        boolean z2 = this.a;
        if (z2 == z && this.e) {
            return;
        }
        this.a = z;
        this.e = true;
        if (Y() && z != V(!z)) {
            SharedPreferences.Editor editorB = this.k.b();
            editorB.putBoolean(this.t, z);
            super.S(editorB);
        }
        if (z2 != z) {
            z(j());
            d();
        }
    }

    public final void l(CharSequence charSequence) {
        this.d = charSequence;
        if (this.a) {
            return;
        }
        d();
    }

    public final void o(CharSequence charSequence) {
        this.c = charSequence;
        if (this.a) {
            d();
        }
    }
}
