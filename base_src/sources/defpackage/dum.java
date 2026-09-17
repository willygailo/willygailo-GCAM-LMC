package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class dum implements dul {
    private final ShapeDrawable a;
    private float b;

    public dum(ShapeDrawable shapeDrawable) {
        this.a = shapeDrawable;
    }

    @Override // defpackage.dul
    public final void a(Canvas canvas) {
        float f = this.b;
        if (f > 0.0f) {
            enl.E(canvas, this.a, f, 0.0f);
        }
    }

    @Override // defpackage.dul
    public final void b(int i, int i2) {
        this.a.setBounds(0, 0, i, i2);
    }

    @Override // defpackage.dul
    public final void c(float f) {
        obr.aF(f > 0.0f);
        this.b = f;
    }

    @Override // defpackage.dul
    public final void d(float f) {
        this.a.setAlpha((int) (f * 255.0f));
    }
}
