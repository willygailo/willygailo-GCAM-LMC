package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public final class oao extends oas {
    public static final /* synthetic */ int c = 0;
    private static final acw j = new oan();
    public final oat a;
    public float b;
    private final acy k;
    private final acx l;
    private boolean m;

    public oao(Context context, oaf oafVar, oat oatVar) {
        super(context, oafVar);
        this.m = false;
        this.a = oatVar;
        oatVar.b = this;
        acy acyVar = new acy();
        this.k = acyVar;
        acyVar.c(1.0f);
        acyVar.e(50.0f);
        acx acxVar = new acx(this, j);
        this.l = acxVar;
        acxVar.q = acyVar;
        d(1.0f);
    }

    public final void a(float f) {
        this.b = f;
        invalidateSelf();
    }

    @Override // defpackage.oas
    public final boolean b(boolean z, boolean z2, boolean z3) {
        boolean zB = super.b(z, z2, z3);
        float fR = obr.r(this.d.getContentResolver());
        if (fR == 0.0f) {
            this.m = true;
        } else {
            this.m = false;
            this.k.e(50.0f / fR);
        }
        return zB;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.a.f(canvas, c());
            this.a.e(canvas, this.h);
            this.a.d(canvas, this.h, 0.0f, this.b, ohh.W(this.e.c[0], this.i));
            canvas.restore();
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

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.l.j();
        a(getLevel() / 10000.0f);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        if (this.m) {
            this.l.j();
            a(i / 10000.0f);
            return true;
        }
        this.l.h(this.b * 10000.0f);
        acx acxVar = this.l;
        float f = i;
        if (acxVar.m) {
            acxVar.r = f;
            return true;
        }
        if (acxVar.q == null) {
            acxVar.q = new acy(f);
        }
        acxVar.q.d(f);
        acxVar.e();
        return true;
    }
}
