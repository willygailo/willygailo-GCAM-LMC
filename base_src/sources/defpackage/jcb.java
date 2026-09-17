package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class jcb extends af {
    public int Z;

    public jcb() {
        super(-1, -1);
        this.Z = 1;
    }

    public jcb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jcc.a);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.Z = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13}[typedArrayObtainStyledAttributes.getInt(0, 0)];
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public jcb(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
