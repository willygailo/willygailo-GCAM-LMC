package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public class jbk {
    int a;
    boolean b;
    final Paint c;

    public jbk(Paint paint) {
        this.c = paint;
    }

    public final void a(int i) {
        this.c.setAlpha(i);
    }

    public void b(Canvas canvas, RectF rectF) {
        if (this.b) {
            return;
        }
        canvas.drawLine(rectF.left, rectF.top + this.a, rectF.right, rectF.top + this.a, this.c);
    }
}
