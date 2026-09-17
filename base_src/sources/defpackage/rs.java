package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class rs extends hs {
    public int b;

    public rs() {
        this.b = 0;
        this.a = 8388627;
    }

    public rs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }

    public rs(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = 0;
    }

    public rs(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = 0;
        this.leftMargin = marginLayoutParams.leftMargin;
        this.topMargin = marginLayoutParams.topMargin;
        this.rightMargin = marginLayoutParams.rightMargin;
        this.bottomMargin = marginLayoutParams.bottomMargin;
    }

    public rs(hs hsVar) {
        super(hsVar);
        this.b = 0;
    }

    public rs(rs rsVar) {
        super((hs) rsVar);
        this.b = 0;
        this.b = rsVar.b;
    }
}
