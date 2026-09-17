package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes2.dex */
public final class nzn {
    public obl A;
    private final View B;
    private boolean C;
    private final RectF D;
    private float F;
    private float G;
    private float H;
    private float I;
    private float J;
    private float K;
    private Typeface L;
    private boolean M;
    private float N;
    private float O;
    private final TextPaint P;
    private float Q;
    private float R;
    private float S;
    private ColorStateList T;
    private float U;
    private float V;
    private float W;
    private ColorStateList X;
    private float Y;
    private StaticLayout Z;
    public float a;
    private float aa;
    private float ab;
    private float ac;
    private CharSequence ad;
    public boolean b;
    public float c;
    public float d;
    public int e;
    public final Rect f;
    public final Rect g;
    public ColorStateList k;
    public ColorStateList l;
    public int m;
    public Typeface n;
    public Typeface o;
    public CharSequence p;
    public CharSequence q;
    public int[] s;
    public boolean t;
    public final TextPaint u;
    public TimeInterpolator v;
    public float w;
    public obl z;
    public int h = 16;
    public int i = 16;
    public float j = 15.0f;
    private float E = 15.0f;
    public boolean r = true;
    public int x = 1;
    public float y = 1.0f;

    public nzn(View view) {
        this.B = view;
        TextPaint textPaint = new TextPaint(129);
        this.P = textPaint;
        this.u = new TextPaint(textPaint);
        this.g = new Rect();
        this.f = new Rect();
        this.D = new RectF();
        this.d = a();
    }

    public static boolean j(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    private static float k(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return nwj.a(f, f2, f3);
    }

    private static int l(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    private final int m(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.s;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private final void n(float f, boolean z) {
        boolean z2;
        float f2;
        boolean z3;
        StaticLayout staticLayoutBuild;
        if (this.p == null) {
            return;
        }
        float fWidth = this.g.width();
        float fWidth2 = this.f.width();
        if (p(f, this.E)) {
            f2 = this.E;
            this.N = 1.0f;
            Typeface typeface = this.L;
            Typeface typeface2 = this.n;
            if (typeface != typeface2) {
                this.L = typeface2;
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            float f3 = this.j;
            Typeface typeface3 = this.L;
            Typeface typeface4 = this.o;
            if (typeface3 != typeface4) {
                this.L = typeface4;
                z2 = true;
            } else {
                z2 = false;
            }
            if (p(f, f3)) {
                this.N = 1.0f;
            } else {
                this.N = f / this.j;
            }
            float f4 = this.E / this.j;
            float f5 = fWidth2 * f4;
            if (z) {
                fWidth = fWidth2;
                f2 = f3;
                z3 = z2;
            } else {
                fWidth = f5 > fWidth ? Math.min(fWidth / f4, fWidth2) : fWidth2;
                f2 = f3;
                z3 = z2;
            }
        }
        if (fWidth > 0.0f) {
            z3 = this.O != f2 || this.t || z3;
            this.O = f2;
            this.t = false;
        }
        if (this.q == null || z3) {
            this.P.setTextSize(this.O);
            this.P.setTypeface(this.L);
            this.P.setLinearText(this.N != 1.0f);
            CharSequence charSequence = this.p;
            boolean z4 = gl.f(this.B) == 1;
            if (this.r) {
                nez nezVar = z4 ? abs.b : abs.a;
                int length = charSequence.length();
                if (charSequence == null || length < 0 || charSequence.length() - length < 0) {
                    throw new IllegalArgumentException();
                }
                char c = 2;
                for (int i = 0; i < length && c == 2; i++) {
                    switch (Character.getDirectionality(charSequence.charAt(i))) {
                        case 0:
                        case 14:
                        case 15:
                            c = 1;
                            break;
                        case 1:
                        case 2:
                        case 16:
                        case 17:
                            c = 0;
                            break;
                        default:
                            c = 2;
                            break;
                    }
                }
                switch (c) {
                    case 0:
                        z4 = true;
                        break;
                    case 1:
                        z4 = false;
                        break;
                    default:
                        z4 = nezVar.a;
                        break;
                }
            }
            this.M = z4;
            int i2 = q() ? this.x : 1;
            boolean z5 = this.M;
            try {
                nzv nzvVar = new nzv(this.p, this.P, (int) fWidth);
                nzvVar.k = TextUtils.TruncateAt.END;
                nzvVar.j = z5;
                nzvVar.e = Layout.Alignment.ALIGN_NORMAL;
                nzvVar.i = false;
                nzvVar.f = i2;
                nzvVar.g = this.y;
                nzvVar.h = 1;
                if (nzvVar.a == null) {
                    nzvVar.a = "";
                }
                int iMax = Math.max(0, nzvVar.c);
                CharSequence charSequenceEllipsize = nzvVar.a;
                if (nzvVar.f == 1) {
                    charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, nzvVar.b, iMax, nzvVar.k);
                }
                nzvVar.d = Math.min(charSequenceEllipsize.length(), nzvVar.d);
                if (nzvVar.j && nzvVar.f == 1) {
                    nzvVar.e = Layout.Alignment.ALIGN_OPPOSITE;
                }
                StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, nzvVar.d, nzvVar.b, iMax);
                builderObtain.setAlignment(nzvVar.e);
                builderObtain.setIncludePad(nzvVar.i);
                builderObtain.setTextDirection(nzvVar.j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
                TextUtils.TruncateAt truncateAt = nzvVar.k;
                if (truncateAt != null) {
                    builderObtain.setEllipsize(truncateAt);
                }
                builderObtain.setMaxLines(nzvVar.f);
                float f6 = nzvVar.g;
                if (f6 != 1.0f) {
                    builderObtain.setLineSpacing(0.0f, f6);
                }
                if (nzvVar.f > 1) {
                    builderObtain.setHyphenationFrequency(nzvVar.h);
                }
                staticLayoutBuild = builderObtain.build();
            } catch (nzu e) {
                Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
                staticLayoutBuild = null;
            }
            ew.c(staticLayoutBuild);
            this.Z = staticLayoutBuild;
            this.q = staticLayoutBuild.getText();
        }
    }

    private final void o(float f) {
        n(f, false);
        gl.z(this.B);
    }

    private static boolean p(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    private final boolean q() {
        if (this.x > 1) {
            return !this.M || this.b;
        }
        return false;
    }

    public final float a() {
        float f = this.c;
        return f + ((1.0f - f) * 0.5f);
    }

    public final int b() {
        return m(this.l);
    }

    public final void c() {
        float f;
        float f2 = this.a;
        if (this.b) {
            this.D.set(f2 < this.d ? this.f : this.g);
        } else {
            this.D.left = k(this.f.left, this.g.left, f2, null);
            this.D.top = k(this.F, this.G, f2, null);
            this.D.right = k(this.f.right, this.g.right, f2, null);
            this.D.bottom = k(this.f.bottom, this.g.bottom, f2, null);
        }
        if (!this.b) {
            this.J = k(this.H, this.I, f2, null);
            this.K = k(this.F, this.G, f2, null);
            o(k(this.j, this.E, f2, this.v));
            f = f2;
        } else if (f2 < this.d) {
            this.J = this.H;
            this.K = this.F;
            o(this.j);
            f = 0.0f;
        } else {
            this.J = this.I;
            this.K = this.G - Math.max(0, this.e);
            o(this.E);
            f = 1.0f;
        }
        this.aa = 1.0f - k(0.0f, 1.0f, 1.0f - f2, nwj.b);
        gl.z(this.B);
        this.ab = k(1.0f, 0.0f, f2, nwj.b);
        gl.z(this.B);
        ColorStateList colorStateList = this.l;
        ColorStateList colorStateList2 = this.k;
        if (colorStateList != colorStateList2) {
            this.P.setColor(l(m(colorStateList2), b(), f));
        } else {
            this.P.setColor(b());
        }
        float f3 = this.Y;
        float f4 = this.w;
        if (f3 != f4) {
            this.P.setLetterSpacing(k(f4, f3, f2, nwj.b));
        } else {
            this.P.setLetterSpacing(f3);
        }
        this.P.setShadowLayer(k(this.U, this.Q, f2, null), k(this.V, this.R, f2, null), k(this.W, this.S, f2, null), l(m(this.X), m(this.T), f2));
        if (this.b) {
            float f5 = this.d;
            this.P.setAlpha((int) ((f2 <= f5 ? nwj.b(1.0f, 0.0f, this.c, f5, f2) : nwj.b(0.0f, 1.0f, f5, 1.0f, f2)) * 255.0f));
        }
        gl.z(this.B);
    }

    public final void d(Canvas canvas) {
        int iSave = canvas.save();
        if (this.q == null || !this.C) {
            return;
        }
        float lineStart = this.x > 1 ? this.Z.getLineStart(0) : this.Z.getLineLeft(0);
        float f = this.J;
        float f2 = this.ac;
        float f3 = (f + lineStart) - (f2 + f2);
        this.P.setTextSize(this.O);
        float f4 = this.J;
        float f5 = this.K;
        float f6 = this.N;
        if (f6 != 1.0f && !this.b) {
            canvas.scale(f6, f6, f4, f5);
        }
        if (!q() || (this.b && this.a <= this.d)) {
            canvas.translate(f4, f5);
            this.Z.draw(canvas);
        } else {
            int alpha = this.P.getAlpha();
            canvas.translate(f3, f5);
            float f7 = alpha;
            this.P.setAlpha((int) (this.ab * f7));
            this.Z.draw(canvas);
            this.P.setAlpha((int) (this.aa * f7));
            int lineBaseline = this.Z.getLineBaseline(0);
            CharSequence charSequence = this.ad;
            float f8 = lineBaseline;
            canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f8, this.P);
            if (!this.b) {
                String strTrim = this.ad.toString().trim();
                String strSubstring = strTrim.endsWith("…") ? strTrim.substring(0, strTrim.length() - 1) : strTrim;
                this.P.setAlpha(alpha);
                canvas.drawText(strSubstring, 0, Math.min(this.Z.getLineEnd(0), strSubstring.length()), 0.0f, f8, (Paint) this.P);
            }
        }
        canvas.restoreToCount(iSave);
    }

    public final void e() {
        boolean z = false;
        if (this.g.width() > 0 && this.g.height() > 0 && this.f.width() > 0 && this.f.height() > 0) {
            z = true;
        }
        this.C = z;
    }

    public final void f() {
        g(false);
    }

    public final void g(boolean z) {
        StaticLayout staticLayout;
        if (this.B.getHeight() <= 0 || this.B.getWidth() <= 0) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        float f = this.O;
        n(this.E, z);
        CharSequence charSequence = this.q;
        if (charSequence != null && (staticLayout = this.Z) != null) {
            this.ad = TextUtils.ellipsize(charSequence, this.P, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.ad;
        float lineStart = 0.0f;
        float fMeasureText = charSequence2 != null ? this.P.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int absoluteGravity = Gravity.getAbsoluteGravity(this.i, this.M ? 1 : 0);
        switch (absoluteGravity & 112) {
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                this.G = this.g.top;
                break;
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                this.G = this.g.bottom + this.P.ascent();
                break;
            default:
                this.G = this.g.centerY() - ((this.P.descent() - this.P.ascent()) / 2.0f);
                break;
        }
        switch (absoluteGravity & 8388615) {
            case 1:
                this.I = this.g.centerX() - (fMeasureText / 2.0f);
                break;
            case 5:
                this.I = this.g.right - fMeasureText;
                break;
            default:
                this.I = this.g.left;
                break;
        }
        n(this.j, z);
        StaticLayout staticLayout2 = this.Z;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.Z;
        this.m = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        CharSequence charSequence3 = this.q;
        float fMeasureText2 = charSequence3 != null ? this.P.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout4 = this.Z;
        if (staticLayout4 != null && this.x > 1) {
            fMeasureText2 = staticLayout4.getWidth();
        }
        StaticLayout staticLayout5 = this.Z;
        if (staticLayout5 != null) {
            lineStart = this.x > 1 ? staticLayout5.getLineStart(0) : staticLayout5.getLineLeft(0);
        }
        this.ac = lineStart;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.h, this.M ? 1 : 0);
        switch (absoluteGravity2 & 112) {
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                this.F = this.f.top;
                break;
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                this.F = (this.f.bottom - height) + this.P.descent();
                break;
            default:
                this.F = this.f.centerY() - (height / 2.0f);
                break;
        }
        switch (absoluteGravity2 & 8388615) {
            case 1:
                this.H = this.f.centerX() - (fMeasureText2 / 2.0f);
                break;
            case 5:
                this.H = this.f.right - fMeasureText2;
                break;
            default:
                this.H = this.f.left;
                break;
        }
        o(f);
        c();
    }

    public final void h(int i) {
        obk obkVar = new obk(this.B.getContext(), i);
        ColorStateList colorStateList = obkVar.i;
        if (colorStateList != null) {
            this.l = colorStateList;
        }
        float f = obkVar.j;
        if (f != 0.0f) {
            this.E = f;
        }
        ColorStateList colorStateList2 = obkVar.a;
        if (colorStateList2 != null) {
            this.T = colorStateList2;
        }
        this.R = obkVar.e;
        this.S = obkVar.f;
        this.Q = obkVar.g;
        this.Y = obkVar.h;
        obl oblVar = this.A;
        if (oblVar != null) {
            oblVar.a();
        }
        this.A = new obl(new nzm(this, 1), obkVar.a());
        obkVar.b(this.B.getContext(), this.A);
        f();
    }

    public final void i(int i) {
        obk obkVar = new obk(this.B.getContext(), i);
        ColorStateList colorStateList = obkVar.i;
        if (colorStateList != null) {
            this.k = colorStateList;
        }
        float f = obkVar.j;
        if (f != 0.0f) {
            this.j = f;
        }
        ColorStateList colorStateList2 = obkVar.a;
        if (colorStateList2 != null) {
            this.X = colorStateList2;
        }
        this.V = obkVar.e;
        this.W = obkVar.f;
        this.U = obkVar.g;
        this.w = obkVar.h;
        obl oblVar = this.z;
        if (oblVar != null) {
            oblVar.a();
        }
        this.z = new obl(new nzm(this, 0), obkVar.a());
        obkVar.b(this.B.getContext(), this.z);
        f();
    }
}
