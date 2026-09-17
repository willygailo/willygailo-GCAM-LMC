package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import j$.util.Objects;
import java.util.BitSet;

/* JADX INFO: loaded from: classes2.dex */
public class obu extends Drawable implements oci {
    private static final Paint g;
    public obt a;
    public final ocg[] b;
    public final ocg[] c;
    public final BitSet d;
    public boolean e;
    public int f;
    private final Matrix h;
    private final Path i;
    private final Path j;
    private final RectF k;
    private final RectF l;
    private final Region m;
    private final Region n;
    private obz o;
    private final Paint p;
    private final Paint q;
    private final ocb r;
    private PorterDuffColorFilter s;
    private PorterDuffColorFilter t;
    private final RectF u;
    private final obs v;

    static {
        obu.class.getSimpleName();
        Paint paint = new Paint(1);
        g = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public obu() {
        this(new obz());
    }

    public obu(obt obtVar) {
        this.b = new ocg[4];
        this.c = new ocg[4];
        this.d = new BitSet(8);
        this.h = new Matrix();
        this.i = new Path();
        this.j = new Path();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new Region();
        this.n = new Region();
        Paint paint = new Paint(1);
        this.p = paint;
        Paint paint2 = new Paint(1);
        this.q = paint2;
        new Path();
        Paint paint3 = new Paint();
        Paint paint4 = new Paint();
        int iD = ek.d(-16777216, 68);
        ek.d(-16777216, 20);
        ek.d(-16777216, 0);
        paint4.setColor(iD);
        paint3.setColor(0);
        Paint paint5 = new Paint(4);
        paint5.setStyle(Paint.Style.FILL);
        new Paint(paint5);
        this.r = Looper.getMainLooper().getThread() == Thread.currentThread() ? oca.a : new ocb();
        this.u = new RectF();
        this.a = obtVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        v();
        u(getState());
        this.v = new obs(this);
    }

    public obu(obz obzVar) {
        this(new obt(obzVar));
    }

    private final float n() {
        if (t()) {
            return this.q.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private static int o(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    private final PorterDuffColorFilter p(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = d(colorForState);
            }
            this.f = colorForState;
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (!z) {
            return null;
        }
        int color = paint.getColor();
        int iD = d(color);
        this.f = iD;
        if (iD != color) {
            return new PorterDuffColorFilter(iD, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private final RectF q() {
        this.l.set(e());
        float fN = n();
        this.l.inset(fN, fN);
        return this.l;
    }

    private final void r(RectF rectF, Path path) {
        ocb ocbVar = this.r;
        obt obtVar = this.a;
        ocbVar.b(obtVar.a, obtVar.k, rectF, this.v, path);
        if (this.a.j != 1.0f) {
            this.h.reset();
            Matrix matrix = this.h;
            float f = this.a.j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.h);
        }
        path.computeBounds(this.u, true);
    }

    private final void s(Canvas canvas, Paint paint, Path path, obz obzVar, RectF rectF) {
        if (!obzVar.e(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = obzVar.c.a(rectF) * this.a.k;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    private final boolean t() {
        return (this.a.v == Paint.Style.FILL_AND_STROKE || this.a.v == Paint.Style.STROKE) && this.q.getStrokeWidth() > 0.0f;
    }

    private final boolean u(int[] iArr) {
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        boolean z = false;
        if (this.a.d != null && color2 != (colorForState2 = this.a.d.getColorForState(iArr, (color2 = this.p.getColor())))) {
            this.p.setColor(colorForState2);
            z = true;
        }
        if (this.a.e == null || color == (colorForState = this.a.e.getColorForState(iArr, (color = this.q.getColor())))) {
            return z;
        }
        this.q.setColor(colorForState);
        return true;
    }

    private final boolean v() {
        PorterDuffColorFilter porterDuffColorFilter = this.s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.t;
        obt obtVar = this.a;
        this.s = p(obtVar.g, obtVar.h, this.p, true);
        obt obtVar2 = this.a;
        ColorStateList colorStateList = obtVar2.f;
        this.t = p(null, obtVar2.h, this.q, false);
        boolean z = this.a.u;
        return (Objects.equals(porterDuffColorFilter, this.s) && Objects.equals(porterDuffColorFilter2, this.t)) ? false : true;
    }

    public final float a() {
        return this.a.o;
    }

    @Override // defpackage.oci
    public final void b(obz obzVar) {
        this.a.a = obzVar;
        invalidateSelf();
    }

    public final float c() {
        float fA = a();
        float f = this.a.p;
        return fA + 0.0f;
    }

    protected final int d(int i) {
        float fC = c();
        obt obtVar = this.a;
        float f = fC + obtVar.n;
        nyl nylVar = obtVar.b;
        return nylVar != null ? nylVar.b(i, f) : i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.p.setColorFilter(this.s);
        int alpha = this.p.getAlpha();
        this.p.setAlpha(o(alpha, this.a.m));
        this.q.setColorFilter(this.t);
        this.q.setStrokeWidth(this.a.l);
        int alpha2 = this.q.getAlpha();
        this.q.setAlpha(o(alpha2, this.a.m));
        if (this.e) {
            float f = -n();
            obz obzVar = this.a.a;
            oby obyVarC = obzVar.c();
            obyVarC.a = obr.o(obzVar.b, f);
            obyVarC.b = obr.o(obzVar.c, f);
            obyVarC.d = obr.o(obzVar.e, f);
            obyVarC.c = obr.o(obzVar.d, f);
            obz obzVarA = obyVarC.a();
            this.o = obzVarA;
            this.r.a(obzVarA, this.a.k, q(), this.j);
            r(e(), this.i);
            this.e = false;
        }
        obt obtVar = this.a;
        int i = obtVar.q;
        if (obtVar.r > 0 && !m()) {
            this.i.isConvex();
        }
        if (this.a.v == Paint.Style.FILL_AND_STROKE || this.a.v == Paint.Style.FILL) {
            s(canvas, this.p, this.i, this.a.a, e());
        }
        if (t()) {
            s(canvas, this.q, this.j, this.o, q());
        }
        this.p.setAlpha(alpha);
        this.q.setAlpha(alpha2);
    }

    protected final RectF e() {
        this.k.set(getBounds());
        return this.k;
    }

    public final void f(Context context) {
        this.a.b = new nyl(context);
        l();
    }

    public final void g(float f) {
        obt obtVar = this.a;
        if (obtVar.o != f) {
            obtVar.o = f;
            l();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        int i = this.a.q;
        if (m()) {
            outline.setRoundRect(getBounds(), this.a.a.b.a(e()) * this.a.k);
        } else {
            r(e(), this.i);
            this.i.isConvex();
            try {
                outline.setConvexPath(this.i);
            } catch (IllegalArgumentException e) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.a.i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        this.m.set(getBounds());
        r(e(), this.i);
        this.n.setPath(this.i, this.m);
        this.m.op(this.n, Region.Op.DIFFERENCE);
        return this.m;
    }

    public final void h(ColorStateList colorStateList) {
        obt obtVar = this.a;
        if (obtVar.d != colorStateList) {
            obtVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void i(float f) {
        obt obtVar = this.a;
        if (obtVar.k != f) {
            obtVar.k = f;
            this.e = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.a.g) == null || !colorStateList.isStateful())) {
            obt obtVar = this.a;
            ColorStateList colorStateList3 = obtVar.f;
            ColorStateList colorStateList4 = obtVar.e;
            if ((colorStateList4 == null || !colorStateList4.isStateful()) && ((colorStateList2 = this.a.d) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    public final void j(ColorStateList colorStateList) {
        obt obtVar = this.a;
        if (obtVar.e != colorStateList) {
            obtVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public final void k(float f) {
        this.a.l = f;
        invalidateSelf();
    }

    public final void l() {
        float fC = c();
        this.a.r = (int) Math.ceil(0.75f * fC);
        this.a.s = (int) Math.ceil(fC * 0.25f);
        v();
        super.invalidateSelf();
    }

    public final boolean m() {
        return this.a.a.e(e());
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.a = new obt(this.a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        boolean zU = u(iArr);
        boolean zV = v();
        boolean z = true;
        if (!zU && !zV) {
            z = false;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        obt obtVar = this.a;
        if (obtVar.m != i) {
            obtVar.m = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.c = colorFilter;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.a.g = colorStateList;
        v();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        obt obtVar = this.a;
        if (obtVar.h != mode) {
            obtVar.h = mode;
            v();
            super.invalidateSelf();
        }
    }
}
