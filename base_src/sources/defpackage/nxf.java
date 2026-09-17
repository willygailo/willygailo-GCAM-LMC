package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
public class nxf extends aae {
    private nxg a;
    private int b;

    public nxf() {
        this.b = 0;
    }

    public nxf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }

    public final int G() {
        nxg nxgVar = this.a;
        if (nxgVar != null) {
            return nxgVar.b;
        }
        return 0;
    }

    public final boolean H(int i) {
        nxg nxgVar = this.a;
        if (nxgVar != null) {
            return nxgVar.c(i);
        }
        this.b = i;
        return false;
    }

    protected void X(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.l(view, i);
    }

    @Override // defpackage.aae
    public boolean e(CoordinatorLayout coordinatorLayout, View view, int i) {
        X(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new nxg(view);
        }
        this.a.b();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        this.a.c(i2);
        this.b = 0;
        return true;
    }
}
