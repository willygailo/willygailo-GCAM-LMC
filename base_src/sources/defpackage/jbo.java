package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public final class jbo extends jbk {
    public jbo(Paint paint) {
        super(paint);
    }

    @Override // defpackage.jbk
    public final void b(Canvas canvas, RectF rectF) {
        if (this.b) {
            return;
        }
        canvas.drawLine(rectF.left + this.a, rectF.top, rectF.left + this.a, rectF.bottom, this.c);
    }
}
