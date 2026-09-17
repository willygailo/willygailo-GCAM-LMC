package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class nt {
    public Typeface b;
    public boolean c;
    private final TextView d;
    private rl e;
    private rl f;
    private rl g;
    private rl h;
    private rl i;
    private rl j;
    private final nv k;
    public int a = 0;
    private int l = -1;

    public nt(TextView textView) {
        this.d = textView;
        this.k = new nv(textView);
    }

    private static rl e(Context context, mu muVar, int i) {
        ColorStateList colorStateListA = muVar.a(context, i);
        if (colorStateListA == null) {
            return null;
        }
        rl rlVar = new rl();
        rlVar.d = true;
        rlVar.a = colorStateListA;
        return rlVar;
    }

    private final void f(Drawable drawable, rl rlVar) {
        if (drawable == null || rlVar == null) {
            return;
        }
        qw.h(drawable, rlVar, this.d.getDrawableState());
    }

    private final void g(Context context, rn rnVar) {
        String strM;
        Typeface typeface;
        int[] iArr = jq.a;
        this.a = rnVar.c(2, this.a);
        int iC = rnVar.c(14, -1);
        this.l = iC;
        if (iC != -1) {
            this.a &= 2;
        }
        if (!rnVar.p(10) && !rnVar.p(15)) {
            if (rnVar.p(1)) {
                this.c = false;
                switch (rnVar.c(1, 1)) {
                    case 1:
                        typeface = Typeface.SANS_SERIF;
                        break;
                    case 2:
                        typeface = Typeface.SERIF;
                        break;
                    case 3:
                        typeface = Typeface.MONOSPACE;
                        break;
                    default:
                        return;
                }
                this.b = typeface;
                return;
            }
            return;
        }
        Typeface typefaceC = null;
        this.b = null;
        int i = true == rnVar.p(15) ? 15 : 10;
        int i2 = this.l;
        int i3 = this.a;
        if (!context.isRestricted()) {
            nr nrVar = new nr(this, i2, i3, new WeakReference(this.d));
            try {
                int i4 = this.a;
                int resourceId = rnVar.b.getResourceId(i, 0);
                if (resourceId != 0) {
                    if (rnVar.c == null) {
                        rnVar.c = new TypedValue();
                    }
                    typefaceC = ei.c(rnVar.a, resourceId, rnVar.c, i4, nrVar);
                }
                if (typefaceC != null) {
                    if (this.l != -1) {
                        this.b = Typeface.create(Typeface.create(typefaceC, 0), this.l, (this.a & 2) != 0);
                    } else {
                        this.b = typefaceC;
                    }
                }
                this.c = this.b == null;
            } catch (Resources.NotFoundException e) {
            } catch (UnsupportedOperationException e2) {
            }
        }
        if (this.b != null || (strM = rnVar.m(i)) == null) {
            return;
        }
        if (this.l != -1) {
            this.b = Typeface.create(Typeface.create(strM, 0), this.l, (this.a & 2) != 0);
        } else {
            this.b = Typeface.create(strM, this.a);
        }
    }

    public final void a() {
        if (this.e != null || this.f != null || this.g != null || this.h != null) {
            Drawable[] compoundDrawables = this.d.getCompoundDrawables();
            f(compoundDrawables[0], this.e);
            f(compoundDrawables[1], this.f);
            f(compoundDrawables[2], this.g);
            f(compoundDrawables[3], this.h);
        }
        if (this.i == null && this.j == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
        f(compoundDrawablesRelative[0], this.i);
        f(compoundDrawablesRelative[2], this.j);
    }

    public final void b(AttributeSet attributeSet, int i) {
        boolean zO;
        boolean z;
        String strM;
        String strM2;
        int i2;
        int resourceId;
        Context context = this.d.getContext();
        mu muVarD = mu.d();
        rn rnVarQ = rn.q(context, attributeSet, jq.h, i);
        TextView textView = this.d;
        gl.E(textView, textView.getContext(), jq.h, attributeSet, rnVarQ.b, i, 0);
        int iF = rnVarQ.f(0, -1);
        if (rnVarQ.p(3)) {
            this.e = e(context, muVarD, rnVarQ.f(3, 0));
        }
        if (rnVarQ.p(1)) {
            this.f = e(context, muVarD, rnVarQ.f(1, 0));
        }
        if (rnVarQ.p(4)) {
            this.g = e(context, muVarD, rnVarQ.f(4, 0));
        }
        if (rnVarQ.p(2)) {
            this.h = e(context, muVarD, rnVarQ.f(2, 0));
        }
        if (rnVarQ.p(5)) {
            this.i = e(context, muVarD, rnVarQ.f(5, 0));
        }
        if (rnVarQ.p(6)) {
            this.j = e(context, muVarD, rnVarQ.f(6, 0));
        }
        rnVarQ.n();
        boolean z2 = this.d.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iF != -1) {
            rn rnVarJ = rn.j(context, iF, jq.v);
            if (z2 || !rnVarJ.p(17)) {
                zO = false;
                z = false;
            } else {
                zO = rnVarJ.o(17, false);
                z = true;
            }
            g(context, rnVarJ);
            strM = rnVarJ.p(18) ? rnVarJ.m(18) : null;
            strM2 = rnVarJ.p(16) ? rnVarJ.m(16) : null;
            rnVarJ.n();
        } else {
            zO = false;
            z = false;
            strM = null;
            strM2 = null;
        }
        rn rnVarQ2 = rn.q(context, attributeSet, jq.v, i);
        if (!z2 && rnVarQ2.p(17)) {
            zO = rnVarQ2.o(17, false);
            z = true;
        }
        if (rnVarQ2.p(18)) {
            strM = rnVarQ2.m(18);
        }
        String strM3 = rnVarQ2.p(16) ? rnVarQ2.m(16) : strM2;
        if (rnVarQ2.p(0) && rnVarQ2.b(0, -1) == 0) {
            this.d.setTextSize(0, 0.0f);
        }
        g(context, rnVarQ2);
        rnVarQ2.n();
        if (!z2 && z) {
            d(zO);
        }
        Typeface typeface = this.b;
        if (typeface != null) {
            if (this.l == -1) {
                this.d.setTypeface(typeface, this.a);
            } else {
                this.d.setTypeface(typeface);
            }
        }
        if (strM3 != null) {
            this.d.setFontVariationSettings(strM3);
        }
        if (strM != null) {
            this.d.setTextLocales(LocaleList.forLanguageTags(strM));
        }
        nv nvVar = this.k;
        TypedArray typedArrayObtainStyledAttributes = nvVar.h.obtainStyledAttributes(attributeSet, jq.i, i, 0);
        TextView textView2 = nvVar.g;
        gl.E(textView2, textView2.getContext(), jq.i, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            nvVar.a = typedArrayObtainStyledAttributes.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(4) ? typedArrayObtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(2) ? typedArrayObtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(1) ? typedArrayObtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(3) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr = new int[length];
            if (length > 0) {
                for (int i3 = 0; i3 < length; i3++) {
                    iArr[i3] = typedArrayObtainTypedArray.getDimensionPixelSize(i3, -1);
                }
                nvVar.e = nv.b(iArr);
                int[] iArr2 = nvVar.e;
                int length2 = iArr2.length;
                boolean z3 = length2 > 0;
                nvVar.f = z3;
                if (z3) {
                    nvVar.a = 1;
                    nvVar.c = iArr2[0];
                    nvVar.d = iArr2[length2 - 1];
                    nvVar.b = -1.0f;
                }
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!nvVar.a()) {
            nvVar.a = 0;
        } else if (nvVar.a == 1) {
            if (!nvVar.f) {
                DisplayMetrics displayMetrics = nvVar.h.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i2 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i2 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                if (dimension2 <= 0.0f) {
                    throw new IllegalArgumentException("Minimum auto-size text size (" + dimension2 + "px) is less or equal to (0px)");
                }
                if (dimension3 <= dimension2) {
                    throw new IllegalArgumentException("Maximum auto-size text size (" + dimension3 + "px) is less or equal to minimum auto-size text size (" + dimension2 + "px)");
                }
                if (dimension <= 0.0f) {
                    throw new IllegalArgumentException("The auto-size step granularity (" + dimension + "px) is less or equal to (0px)");
                }
                nvVar.a = 1;
                nvVar.c = dimension2;
                nvVar.d = dimension3;
                nvVar.b = dimension;
                nvVar.f = false;
            }
            if (nvVar.a() && nvVar.a == 1 && (!nvVar.f || nvVar.e.length == 0)) {
                int iFloor = ((int) Math.floor((nvVar.d - nvVar.c) / nvVar.b)) + 1;
                int[] iArr3 = new int[iFloor];
                for (int i4 = 0; i4 < iFloor; i4++) {
                    iArr3[i4] = Math.round(nvVar.c + (i4 * nvVar.b));
                }
                nvVar.e = nv.b(iArr3);
            }
        }
        nv nvVar2 = this.k;
        if (nvVar2.a != 0) {
            int[] iArr4 = nvVar2.e;
            if (iArr4.length > 0) {
                if (this.d.getAutoSizeStepGranularity() != -1.0f) {
                    this.d.setAutoSizeTextTypeUniformWithConfiguration(Math.round(this.k.c), Math.round(this.k.d), Math.round(this.k.b), 0);
                } else {
                    this.d.setAutoSizeTextTypeUniformWithPresetSizes(iArr4, 0);
                }
            }
        }
        rn rnVarK = rn.k(context, attributeSet, jq.i);
        int iF2 = rnVarK.f(8, -1);
        Drawable drawableC = iF2 != -1 ? muVarD.c(context, iF2) : null;
        int iF3 = rnVarK.f(13, -1);
        Drawable drawableC2 = iF3 != -1 ? muVarD.c(context, iF3) : null;
        int iF4 = rnVarK.f(9, -1);
        Drawable drawableC3 = iF4 != -1 ? muVarD.c(context, iF4) : null;
        int iF5 = rnVarK.f(6, -1);
        Drawable drawableC4 = iF5 != -1 ? muVarD.c(context, iF5) : null;
        int iF6 = rnVarK.f(10, -1);
        Drawable drawableC5 = iF6 != -1 ? muVarD.c(context, iF6) : null;
        int iF7 = rnVarK.f(7, -1);
        Drawable drawableC6 = iF7 != -1 ? muVarD.c(context, iF7) : null;
        if (drawableC5 != null || drawableC6 != null) {
            Drawable[] compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
            TextView textView3 = this.d;
            if (drawableC5 == null) {
                drawableC5 = compoundDrawablesRelative[0];
            }
            if (drawableC2 == null) {
                drawableC2 = compoundDrawablesRelative[1];
            }
            if (drawableC6 == null) {
                drawableC6 = compoundDrawablesRelative[2];
            }
            if (drawableC4 == null) {
                drawableC4 = compoundDrawablesRelative[3];
            }
            textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableC5, drawableC2, drawableC6, drawableC4);
        } else if (drawableC != null || drawableC2 != null || drawableC3 != null || drawableC4 != null) {
            Drawable[] compoundDrawablesRelative2 = this.d.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = this.d.getCompoundDrawables();
                TextView textView4 = this.d;
                if (drawableC == null) {
                    drawableC = compoundDrawables[0];
                }
                if (drawableC2 == null) {
                    drawableC2 = compoundDrawables[1];
                }
                if (drawableC3 == null) {
                    drawableC3 = compoundDrawables[2];
                }
                if (drawableC4 == null) {
                    drawableC4 = compoundDrawables[3];
                }
                textView4.setCompoundDrawablesWithIntrinsicBounds(drawableC, drawableC2, drawableC3, drawableC4);
            } else {
                TextView textView5 = this.d;
                if (drawableC2 == null) {
                    drawableC2 = compoundDrawablesRelative2[1];
                }
                Drawable drawable2 = compoundDrawablesRelative2[2];
                if (drawableC4 == null) {
                    drawableC4 = compoundDrawablesRelative2[3];
                }
                textView5.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableC2, drawable2, drawableC4);
            }
        }
        if (rnVarK.p(11)) {
            this.d.setCompoundDrawableTintList(rnVarK.g(11));
        }
        if (rnVarK.p(12)) {
            this.d.setCompoundDrawableTintMode(oj.a(rnVarK.c(12, -1), null));
        }
        int iB = rnVarK.b(14, -1);
        int iB2 = rnVarK.b(17, -1);
        int iB3 = rnVarK.b(18, -1);
        rnVarK.n();
        if (iB != -1) {
            TextView textView6 = this.d;
            ew.b(iB);
            textView6.setFirstBaselineToTopHeight(iB);
        }
        if (iB2 != -1) {
            TextView textView7 = this.d;
            ew.b(iB2);
            Paint.FontMetricsInt fontMetricsInt = textView7.getPaint().getFontMetricsInt();
            int i5 = textView7.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
            if (iB2 > Math.abs(i5)) {
                textView7.setPadding(textView7.getPaddingLeft(), textView7.getPaddingTop(), textView7.getPaddingRight(), iB2 - i5);
            }
        }
        if (iB3 != -1) {
            fz.b(this.d, iB3);
        }
    }

    public final void c(Context context, int i) {
        String strM;
        rn rnVarJ = rn.j(context, i, jq.v);
        if (rnVarJ.p(17)) {
            d(rnVarJ.o(17, false));
        }
        if (rnVarJ.p(0) && rnVarJ.b(0, -1) == 0) {
            this.d.setTextSize(0, 0.0f);
        }
        g(context, rnVarJ);
        if (rnVarJ.p(16) && (strM = rnVarJ.m(16)) != null) {
            this.d.setFontVariationSettings(strM);
        }
        rnVarJ.n();
        Typeface typeface = this.b;
        if (typeface != null) {
            this.d.setTypeface(typeface, this.a);
        }
    }

    final void d(boolean z) {
        this.d.setAllCaps(z);
    }
}
