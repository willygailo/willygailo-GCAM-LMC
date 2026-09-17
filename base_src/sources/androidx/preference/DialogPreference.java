package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.ahg;
import defpackage.ahn;
import defpackage.et;

/* JADX INFO: loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public CharSequence a;
    public CharSequence b;
    public Drawable c;
    public CharSequence d;
    public CharSequence e;
    public int f;

    public DialogPreference(Context context) {
        this(context, null);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, et.u(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ahn.c, i, i2);
        String strZ = et.z(typedArrayObtainStyledAttributes, 9, 0);
        this.a = strZ;
        if (strZ == null) {
            this.a = this.q;
        }
        this.b = et.z(typedArrayObtainStyledAttributes, 8, 1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.c = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        this.d = et.z(typedArrayObtainStyledAttributes, 11, 3);
        this.e = et.z(typedArrayObtainStyledAttributes, 10, 4);
        this.f = et.w(typedArrayObtainStyledAttributes, 7, 5, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected void c() {
        ahg ahgVar = this.k.d;
        if (ahgVar != null) {
            ahgVar.ah(this);
        }
    }
}
