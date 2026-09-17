package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
final class akn {
    public static final Matrix a = new Matrix();
    Paint b;
    Paint c;
    final akl d;
    float e;
    float f;
    float g;
    float h;
    int i;
    String j;
    Boolean k;
    final wy l;
    private final Path m;
    private final Path n;
    private final Matrix o;
    private PathMeasure p;
    private int q;

    public akn() {
        this.o = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 255;
        this.j = null;
        this.k = null;
        this.l = new wy();
        this.d = new akl();
        this.m = new Path();
        this.n = new Path();
    }

    public akn(akn aknVar) {
        this.o = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 255;
        this.j = null;
        this.k = null;
        wy wyVar = new wy();
        this.l = wyVar;
        this.d = new akl(aknVar.d, wyVar);
        this.m = new Path(aknVar.m);
        this.n = new Path(aknVar.n);
        this.e = aknVar.e;
        this.f = aknVar.f;
        this.g = aknVar.g;
        this.h = aknVar.h;
        int i = aknVar.q;
        this.q = 0;
        this.i = aknVar.i;
        this.j = aknVar.j;
        String str = aknVar.j;
        if (str != null) {
            wyVar.put(str, this);
        }
        this.k = aknVar.k;
    }

    public final void a(akl aklVar, Matrix matrix, Canvas canvas, int i, int i2) {
        aklVar.a.set(matrix);
        aklVar.a.preConcat(aklVar.j);
        canvas.save();
        for (int i3 = 0; i3 < aklVar.b.size(); i3++) {
            ga gaVar = (ga) aklVar.b.get(i3);
            if (gaVar instanceof akl) {
                a((akl) gaVar, aklVar.a, canvas, i, i2);
            } else if (gaVar instanceof akm) {
                akm akmVar = (akm) gaVar;
                float f = i / this.g;
                float f2 = i2 / this.h;
                float fMin = Math.min(f, f2);
                Matrix matrix2 = aklVar.a;
                this.o.set(matrix2);
                this.o.postScale(f, f2);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                double dHypot = Math.hypot(fArr[0], fArr[1]);
                double dHypot2 = Math.hypot(fArr[2], fArr[3]);
                float f3 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                float fMax = Math.max((float) dHypot, (float) dHypot2);
                float fAbs = fMax > 0.0f ? Math.abs(f3) / fMax : 0.0f;
                if (fAbs != 0.0f) {
                    Path path = this.m;
                    path.reset();
                    em[] emVarArr = akmVar.m;
                    if (emVarArr != null) {
                        em.a(emVarArr, path);
                    }
                    Path path2 = this.m;
                    this.n.reset();
                    if (akmVar.k()) {
                        this.n.setFillType(akmVar.o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        this.n.addPath(path2, this.o);
                        canvas.clipPath(this.n);
                    } else {
                        akk akkVar = (akk) akmVar;
                        float f4 = akkVar.g;
                        if (f4 != 0.0f || akkVar.h != 1.0f) {
                            float f5 = akkVar.i;
                            float f6 = (f4 + f5) % 1.0f;
                            float f7 = (akkVar.h + f5) % 1.0f;
                            if (this.p == null) {
                                this.p = new PathMeasure();
                            }
                            this.p.setPath(this.m, false);
                            float length = this.p.getLength();
                            float f8 = f6 * length;
                            float f9 = f7 * length;
                            path2.reset();
                            if (f8 > f9) {
                                this.p.getSegment(f8, length, path2, true);
                                this.p.getSegment(0.0f, f9, path2, true);
                            } else {
                                this.p.getSegment(f8, f9, path2, true);
                            }
                            path2.rLineTo(0.0f, 0.0f);
                        }
                        this.n.addPath(path2, this.o);
                        if (akkVar.d.e()) {
                            dy dyVar = akkVar.d;
                            if (this.c == null) {
                                Paint paint = new Paint(1);
                                this.c = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.c;
                            if (dyVar.b()) {
                                Shader shader = dyVar.a;
                                shader.setLocalMatrix(this.o);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(akkVar.f * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                paint2.setColor(akq.a(dyVar.b, akkVar.f));
                            }
                            paint2.setColorFilter(null);
                            this.n.setFillType(akkVar.o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(this.n, paint2);
                        }
                        if (akkVar.b.e()) {
                            dy dyVar2 = akkVar.b;
                            if (this.b == null) {
                                Paint paint3 = new Paint(1);
                                this.b = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.b;
                            Paint.Join join = akkVar.k;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = akkVar.j;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(akkVar.l);
                            if (dyVar2.b()) {
                                Shader shader2 = dyVar2.a;
                                shader2.setLocalMatrix(this.o);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(akkVar.e * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                paint4.setColor(akq.a(dyVar2.b, akkVar.e));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(akkVar.c * fAbs * fMin);
                            canvas.drawPath(this.n, paint4);
                        }
                    }
                }
            }
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.i;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.i = i;
    }
}
