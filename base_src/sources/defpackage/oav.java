package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public final class oav extends oas {
    public final oat a;
    public final oau b;

    public oav(Context context, oaf oafVar, oat oatVar, oau oauVar) {
        super(context, oafVar);
        this.a = oatVar;
        oatVar.b = this;
        this.b = oauVar;
        oauVar.j = this;
    }

    @Override // defpackage.oas
    public final boolean b(boolean z, boolean z2, boolean z3) {
        boolean zB = super.b(z, z2, z3);
        if (!isRunning()) {
            this.b.a();
        }
        obr.r(this.d.getContentResolver());
        if (z && z3) {
            this.b.c();
        }
        return zB;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        this.a.f(canvas, c());
        this.a.e(canvas, this.h);
        int i = 0;
        while (true) {
            oau oauVar = this.b;
            int[] iArr = oauVar.l;
            if (i >= iArr.length) {
                canvas.restore();
                return;
            }
            oat oatVar = this.a;
            Paint paint = this.h;
            float[] fArr = oauVar.k;
            int i2 = i + i;
            oatVar.d(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.b();
    }

    @Override // defpackage.oas, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }
}
