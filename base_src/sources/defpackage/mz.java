package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes2.dex */
final class mz extends PopupWindow {
    public mz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        rn rnVarQ = rn.q(context, attributeSet, jq.r, i);
        if (rnVarQ.p(2)) {
            hr.a(this, rnVarQ.o(2, false));
        }
        setBackgroundDrawable(rnVarQ.h(0));
        rnVarQ.n();
    }
}
