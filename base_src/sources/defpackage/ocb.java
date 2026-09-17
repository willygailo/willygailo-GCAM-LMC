package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public final class ocb {
    private final och[] a = new och[4];
    private final Matrix[] b = new Matrix[4];
    private final Matrix[] c = new Matrix[4];
    private final PointF d = new PointF();
    private final Path e = new Path();
    private final Path f = new Path();
    private final och g = new och();
    private final float[] h = new float[2];
    private final float[] i = new float[2];
    private final Path j = new Path();
    private final Path k = new Path();
    private boolean l = true;

    public ocb() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new och();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    private final boolean c(Path path, int i) {
        this.k.reset();
        this.a[i].c(this.b[i], this.k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.k.computeBounds(rectF, true);
        path.op(this.k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private static final float d(int i) {
        return (i + 1) * 90;
    }

    public final void a(obz obzVar, float f, RectF rectF, Path path) {
        b(obzVar, f, rectF, null, path);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0217  */
    /* JADX WARN: Code duplicated, block: B:52:0x0232  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    public final void b(obz obzVar, float f, RectF rectF, obs obsVar, Path path) {
        int i;
        obp obpVar;
        obr obrVar;
        path.rewind();
        this.e.rewind();
        this.f.rewind();
        this.f.addRect(rectF, Path.Direction.CW);
        ?? r5 = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            switch (i2) {
                case 1:
                    obpVar = obzVar.d;
                    break;
                case 2:
                    obpVar = obzVar.e;
                    break;
                case 3:
                    obpVar = obzVar.b;
                    break;
                default:
                    obpVar = obzVar.c;
                    break;
            }
            switch (i2) {
                case 1:
                    obrVar = obzVar.l;
                    break;
                case 2:
                    obrVar = obzVar.m;
                    break;
                case 3:
                    obrVar = obzVar.j;
                    break;
                default:
                    obrVar = obzVar.k;
                    break;
            }
            obrVar.a(this.a[i2], f, obpVar.a(rectF));
            float fD = d(i2);
            this.b[i2].reset();
            PointF pointF = this.d;
            switch (i2) {
                case 1:
                    pointF.set(rectF.right, rectF.bottom);
                    break;
                case 2:
                    pointF.set(rectF.left, rectF.bottom);
                    break;
                case 3:
                    pointF.set(rectF.left, rectF.top);
                    break;
                default:
                    pointF.set(rectF.right, rectF.top);
                    break;
            }
            this.b[i2].setTranslate(this.d.x, this.d.y);
            this.b[i2].preRotate(fD);
            float[] fArr = this.h;
            och ochVar = this.a[i2];
            fArr[0] = ochVar.b;
            fArr[1] = ochVar.c;
            this.b[i2].mapPoints(fArr);
            this.c[i2].reset();
            Matrix matrix = this.c[i2];
            float[] fArr2 = this.h;
            matrix.setTranslate(fArr2[0], fArr2[1]);
            this.c[i2].preRotate(d(i2));
        }
        int i3 = 0;
        while (i3 < 4) {
            float[] fArr3 = this.h;
            och ochVar2 = this.a[i3];
            fArr3[r5] = 0.0f;
            fArr3[1] = ochVar2.a;
            this.b[i3].mapPoints(fArr3);
            if (i3 == 0) {
                float[] fArr4 = this.h;
                path.moveTo(fArr4[r5], fArr4[1]);
            } else {
                float[] fArr5 = this.h;
                path.lineTo(fArr5[r5], fArr5[1]);
            }
            this.a[i3].c(this.b[i3], path);
            if (obsVar != null) {
                och ochVar3 = this.a[i3];
                Matrix matrix2 = this.b[i3];
                obsVar.a.d.set(i3, (boolean) r5);
                obsVar.a.b[i3] = ochVar3.a(matrix2);
            }
            int i4 = i3 + 1;
            int i5 = i4 % 4;
            float[] fArr6 = this.h;
            och ochVar4 = this.a[i3];
            fArr6[r5] = ochVar4.b;
            fArr6[1] = ochVar4.c;
            this.b[i3].mapPoints(fArr6);
            float[] fArr7 = this.i;
            och ochVar5 = this.a[i5];
            fArr7[r5] = 0.0f;
            fArr7[1] = ochVar5.a;
            this.b[i5].mapPoints(fArr7);
            float[] fArr8 = this.h;
            float f2 = fArr8[r5];
            float[] fArr9 = this.i;
            int i6 = i3;
            float fMax = Math.max(((float) Math.hypot(f2 - fArr9[r5], fArr8[1] - fArr9[1])) - 0.001f, 0.0f);
            float[] fArr10 = this.h;
            och ochVar6 = this.a[i6];
            fArr10[0] = ochVar6.b;
            fArr10[1] = ochVar6.c;
            this.b[i6].mapPoints(fArr10);
            switch (i6) {
                case 1:
                case 3:
                    Math.abs(rectF.centerX() - this.h[0]);
                    break;
                case 2:
                default:
                    Math.abs(rectF.centerY() - this.h[1]);
                    break;
            }
            this.g.e();
            switch (i6) {
                case 1:
                    obr obrVar2 = obzVar.h;
                    break;
                case 2:
                    obr obrVar3 = obzVar.i;
                    break;
                case 3:
                    obr obrVar4 = obzVar.f;
                    break;
                default:
                    obr obrVar5 = obzVar.g;
                    break;
            }
            this.g.d(fMax, 0.0f);
            this.j.reset();
            this.g.c(this.c[i6], this.j);
            if (this.l) {
                i = i6;
                if (c(this.j, i) || c(this.j, i5)) {
                    Path path2 = this.j;
                    path2.op(path2, this.f, Path.Op.DIFFERENCE);
                    float[] fArr11 = this.h;
                    fArr11[0] = 0.0f;
                    fArr11[1] = this.g.a;
                    this.c[i].mapPoints(fArr11);
                    Path path3 = this.e;
                    float[] fArr12 = this.h;
                    path3.moveTo(fArr12[0], fArr12[1]);
                    this.g.c(this.c[i], this.e);
                }
                if (obsVar != null) {
                    och ochVar7 = this.g;
                    Matrix matrix3 = this.c[i];
                    obsVar.a.d.set(i + 4, false);
                    obsVar.a.c[i] = ochVar7.a(matrix3);
                }
                i3 = i4;
                r5 = 0;
            } else {
                i = i6;
            }
            this.g.c(this.c[i], path);
            if (obsVar != null) {
                och ochVar8 = this.g;
                Matrix matrix4 = this.c[i];
                obsVar.a.d.set(i + 4, false);
                obsVar.a.c[i] = ochVar8.a(matrix4);
            }
            i3 = i4;
            r5 = 0;
        }
        path.close();
        this.e.close();
        if (this.e.isEmpty()) {
            return;
        }
        path.op(this.e, Path.Op.UNION);
    }
}
