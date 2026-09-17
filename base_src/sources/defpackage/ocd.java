package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public final class ocd extends ocf {
    private static final RectF h = new RectF();

    @Deprecated
    public final float a;

    @Deprecated
    public final float b;

    @Deprecated
    public final float c;

    @Deprecated
    public final float d;

    @Deprecated
    public float e;

    @Deprecated
    public float f;

    public ocd(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.ocf
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.g;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = h;
        rectF.set(this.a, this.b, this.c, this.d);
        path.arcTo(rectF, this.e, this.f, false);
        path.transform(matrix);
    }
}
