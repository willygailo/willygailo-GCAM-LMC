package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public class li {
    public View a;
    public int b;
    public PopupWindow.OnDismissListener c;
    private final Context d;
    private final kw e;
    private final boolean f;
    private final int g;
    private boolean h;
    private lj i;
    private lg j;
    private final PopupWindow.OnDismissListener k;

    public li(Context context, kw kwVar, View view, boolean z) {
        this(context, kwVar, view, z, R.attr.actionOverflowMenuStyle);
    }

    public li(Context context, kw kwVar, View view, boolean z, int i) {
        this.b = 8388611;
        this.k = new lh(this);
        this.d = context;
        this.e = kwVar;
        this.a = view;
        this.f = z;
        this.g = i;
    }

    public final lg a() {
        if (this.j == null) {
            Display defaultDisplay = ((WindowManager) this.d.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            lg kqVar = Math.min(point.x, point.y) >= this.d.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width) ? new kq(this.d, this.a, this.g, this.f) : new lr(this.d, this.e, this.a, this.g, this.f);
            kqVar.j(this.e);
            kqVar.p(this.k);
            kqVar.l(this.a);
            kqVar.d(this.i);
            kqVar.m(this.h);
            kqVar.n(this.b);
            this.j = kqVar;
        }
        return this.j;
    }

    public final void b() {
        if (g()) {
            this.j.k();
        }
    }

    protected void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(boolean z) {
        this.h = z;
        lg lgVar = this.j;
        if (lgVar != null) {
            lgVar.m(z);
        }
    }

    public final void e(lj ljVar) {
        this.i = ljVar;
        lg lgVar = this.j;
        if (lgVar != null) {
            lgVar.d(ljVar);
        }
    }

    public final void f(int i, int i2, boolean z, boolean z2) {
        lg lgVarA = a();
        lgVarA.q(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.b, gl.f(this.a)) & 7) == 5) {
                i -= this.a.getWidth();
            }
            lgVarA.o(i);
            lgVarA.r(i2);
            int i3 = (int) ((this.d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            lgVarA.g = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        lgVarA.s();
    }

    public final boolean g() {
        lg lgVar = this.j;
        return lgVar != null && lgVar.u();
    }

    public final boolean h() {
        if (g()) {
            return true;
        }
        if (this.a == null) {
            return false;
        }
        f(0, 0, false, false);
        return true;
    }
}
