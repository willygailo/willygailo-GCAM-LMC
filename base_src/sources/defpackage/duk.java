package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class duk implements duj {
    private final GradientDrawable a;
    private float b;
    private float c;

    public duk() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.a = gradientDrawable;
        gradientDrawable.setShape(1);
    }

    @Override // defpackage.duj
    public final void a(Canvas canvas) {
        float f = this.b;
        if (f > 0.0f) {
            enl.E(canvas, this.a, f, this.c);
        }
    }

    @Override // defpackage.duj
    public final void b(int i, int i2) {
        this.a.setBounds(0, 0, i, i2);
    }

    @Override // defpackage.duj
    public final void c(float f) {
        this.a.setCornerRadius(f);
    }

    @Override // defpackage.duj
    public final void d(float f) {
        obr.aF(f > 0.0f);
        this.b = f;
    }

    @Override // defpackage.duj
    public final void e(float f) {
        this.a.setAlpha((int) (f * 255.0f));
    }

    @Override // defpackage.duj
    public final void f(float f) {
        this.c = f;
        this.a.setStroke((int) f, -1);
    }
}
