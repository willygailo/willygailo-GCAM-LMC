package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class oat {
    final oaf a;
    protected oas b;

    public oat(oaf oafVar) {
        this.a = oafVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract void c(Canvas canvas, float f);

    public abstract void d(Canvas canvas, Paint paint, float f, float f2, int i);

    public abstract void e(Canvas canvas, Paint paint);

    final void f(Canvas canvas, float f) {
        this.a.a();
        c(canvas, f);
    }
}
