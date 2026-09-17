package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final class nxj extends aca {
    final /* synthetic */ SwipeDismissBehavior a;
    private int b;
    private int c = -1;

    public nxj(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }

    @Override // defpackage.aca
    public final int a(View view) {
        return view.getWidth();
    }

    @Override // defpackage.aca
    public final void b(View view, int i) {
        this.c = i;
        this.b = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // defpackage.aca
    public final void c(int i) {
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    @Override // defpackage.aca
    public final void d(View view, float f, float f2) {
        int left;
        int i;
        int i2;
        this.c = -1;
        int width = view.getWidth();
        if (f != 0.0f) {
            int iF = gl.f(view);
            int i3 = this.a.b;
            if (i3 != 2 && (i3 != 0 ? iF != 1 ? f >= 0.0f : f <= 0.0f : iF != 1 ? f <= 0.0f : f >= 0.0f)) {
                i2 = this.b;
            } else {
                left = view.getLeft();
                i = this.b;
                if (left < i) {
                    i2 = i - width;
                } else {
                    i2 = i + width;
                }
            }
        } else {
            if (Math.abs(view.getLeft() - this.b) >= Math.round(view.getWidth() * this.a.c)) {
                left = view.getLeft();
                i = this.b;
                if (left < i) {
                    i2 = i - width;
                } else {
                    i2 = i + width;
                }
            } else {
                i2 = this.b;
            }
        }
        if (this.a.a.i(i2, view.getTop())) {
            gl.A(view, new nxl(this.a, view));
        }
    }

    @Override // defpackage.aca
    public final boolean e(View view, int i) {
        int i2 = this.c;
        return (i2 == -1 || i2 == i) && this.a.x(view);
    }

    @Override // defpackage.aca
    public final int f(View view, int i) {
        int width;
        int width2;
        int iF = gl.f(view);
        int i2 = this.a.b;
        if (i2 == 0) {
            if (iF == 1) {
                width = this.b - view.getWidth();
                width2 = this.b;
            } else {
                width = this.b;
                width2 = view.getWidth() + width;
            }
        } else if (i2 != 1) {
            width = this.b - view.getWidth();
            width2 = view.getWidth() + this.b;
        } else if (iF == 1) {
            width = this.b;
            width2 = view.getWidth() + width;
        } else {
            width = this.b - view.getWidth();
            width2 = this.b;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.aca
    public final int g(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.aca
    public final void i(View view, int i, int i2) {
        float width = this.b + (view.getWidth() * this.a.d);
        float width2 = this.b + (view.getWidth() * this.a.e);
        float f = i;
        if (f <= width) {
            view.setAlpha(1.0f);
        } else if (f >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(SwipeDismissBehavior.y(1.0f - ((f - width) / (width2 - width))));
        }
    }
}
