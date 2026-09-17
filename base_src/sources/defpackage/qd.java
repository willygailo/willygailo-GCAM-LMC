package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public class qd extends ViewGroup.MarginLayoutParams {
    public qs c;
    public final Rect d;
    public boolean e;
    boolean f;

    public qd(int i, int i2) {
        super(i, i2);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public qd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public qd(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public qd(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public qd(qd qdVar) {
        super((ViewGroup.LayoutParams) qdVar);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public final int a() {
        return this.c.b();
    }

    public final boolean b() {
        return this.c.x();
    }

    public final boolean c() {
        return this.c.u();
    }
}
