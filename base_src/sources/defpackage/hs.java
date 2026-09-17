package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public class hs extends ViewGroup.MarginLayoutParams {
    public int a;

    public hs() {
        super(-2, -2);
        this.a = 8388627;
    }

    public hs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jq.b);
        this.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public hs(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }

    public hs(hs hsVar) {
        super((ViewGroup.MarginLayoutParams) hsVar);
        this.a = 0;
        this.a = hsVar.a;
    }
}
