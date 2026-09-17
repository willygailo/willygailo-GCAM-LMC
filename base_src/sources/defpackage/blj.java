package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class blj {
    static Integer a;
    public final View b;
    public final List c = new ArrayList();
    public bli d;

    public blj(View view) {
        this.b = view;
    }

    public static final boolean d(int i, int i2) {
        return f(i) && f(i2);
    }

    private final int e(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        if (this.b.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        Context context = this.b.getContext();
        if (a == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            aae.s(windowManager);
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            a = Integer.valueOf(Math.max(point.x, point.y));
        }
        return a.intValue();
    }

    private static final boolean f(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    public final int a() {
        int paddingTop = this.b.getPaddingTop() + this.b.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        return e(this.b.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
    }

    public final int b() {
        int paddingLeft = this.b.getPaddingLeft() + this.b.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        return e(this.b.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
    }

    final void c() {
        ViewTreeObserver viewTreeObserver = this.b.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.d);
        }
        this.d = null;
        this.c.clear();
    }
}
