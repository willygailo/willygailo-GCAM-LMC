package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.GoogleCameraEngR18F1.R;
import j$.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final class jlq {
    private static final oor G;
    private static final oor H;
    private static final oor I;
    public static boolean a = false;
    public static boolean b = false;
    public static boolean c = false;
    public static int d;
    public static int e;
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final ojc n;
    public final int o;
    public final String p;
    public final int q;
    public final boolean r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final jkc x;
    public final hti y;
    public final int z;

    static {
        oon oonVarM = oor.m();
        oonVarM.e(hti.THREE, Integer.valueOf(R.drawable.timer_3_on_shutter));
        oonVarM.e(hti.TEN, Integer.valueOf(R.drawable.timer_10_on_shutter));
        oor oorVarC = oonVarM.c();
        G = oorVarC;
        oon oonVarM2 = oor.m();
        oonVarM2.e(hti.THREE, Integer.valueOf(R.drawable.timer_3_on_shutter_night));
        oonVarM2.e(hti.TEN, Integer.valueOf(R.drawable.timer_10_on_shutter_night));
        oor oorVarC2 = oonVarM2.c();
        H = oorVarC2;
        oon oonVarM3 = oor.m();
        oonVarM3.e(jkc.PHOTO_IDLE, oorVarC);
        oonVarM3.e(jkc.PORTRAIT_IDLE, oorVarC);
        oonVarM3.e(jkc.CATSHARK_PHOTO_IDLE, oorVarC);
        oonVarM3.e(jkc.CATSHARK_PORTRAIT_IDLE, oorVarC);
        oonVarM3.e(jkc.NIGHT_IDLE, oorVarC2);
        oonVarM3.e(jkc.ASTRO_IDLE, oorVarC2);
        oonVarM3.e(jkc.LASAGNA_IDLE, oorVarC);
        I = oonVarM3.c();
    }

    public jlq() {
    }

    public jlq(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, ojc ojcVar, int i9, String str, int i10, boolean z, int i11, int i12, int i13, int i14, int i15, jkc jkcVar, hti htiVar, int i16, int i17, int i18, int i19, int i20, int i21, int i22) {
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.l = i7;
        this.m = i8;
        this.n = ojcVar;
        this.o = i9;
        this.p = str;
        this.q = i10;
        this.r = z;
        this.s = i11;
        this.t = i12;
        this.u = i13;
        this.v = i14;
        this.w = i15;
        this.x = jkcVar;
        this.y = htiVar;
        this.z = i16;
        this.A = i17;
        this.B = i18;
        this.C = i19;
        this.D = i20;
        this.E = i21;
        this.F = i22;
    }

    public static jlp a() {
        jlp jlpVar = new jlp((byte[]) null);
        jlpVar.b(false);
        jlpVar.r(0);
        jlpVar.d(0);
        jlpVar.c("none");
        jlpVar.i(0);
        jlpVar.j(-1);
        jlpVar.q(0);
        jlpVar.p(0);
        jlpVar.w(0);
        jlpVar.x(0);
        jlpVar.y(0);
        jlpVar.v(0);
        jlpVar.g(255);
        jlpVar.e();
        jlpVar.f(-1);
        return jlpVar;
    }

    public static jlq b(jkc jkcVar, hti htiVar, View view, boolean z, boolean z2, boolean z3) {
        Function function;
        a = z;
        b = z2;
        c = z3;
        d = mip.dU(view);
        e = mip.dR(view);
        jkc jkcVar2 = jkc.PHOTO_IDLE;
        switch (jkcVar.ordinal()) {
            case 0:
                function = jlo.l;
                break;
            case 1:
                function = jlo.b;
                break;
            case 2:
                function = jln.n;
                break;
            case 3:
                function = jlo.f;
                break;
            case 4:
                function = jln.a;
                break;
            case 5:
                function = jlo.d;
                break;
            case 6:
                function = jlo.c;
                break;
            case 7:
                function = jlo.k;
                break;
            case 8:
                function = jln.e;
                break;
            case 9:
                function = icd.u;
                break;
            case 10:
                function = jln.i;
                break;
            case 11:
                function = jlo.l;
                break;
            case 12:
                function = jlo.g;
                break;
            case 13:
                function = jln.b;
                break;
            case 14:
                function = jln.g;
                break;
            case 15:
                function = jln.s;
                break;
            case 16:
                function = jln.f;
                break;
            case 17:
                function = jlo.j;
                break;
            case 18:
                function = jln.l;
                break;
            case 19:
                function = jln.h;
                break;
            case 20:
                function = jln.q;
                break;
            case 21:
                function = jln.t;
                break;
            case 22:
                function = jln.u;
                break;
            case 23:
                function = jln.k;
                break;
            case 24:
                function = jln.o;
                break;
            case 25:
                function = jlo.a;
                break;
            case 26:
                function = jlo.m;
                break;
            case 27:
                function = jln.m;
                break;
            case 28:
                function = jln.d;
                break;
            case 29:
                function = jlo.e;
                break;
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                function = jlo.i;
                break;
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                function = jln.p;
                break;
            case 32:
                function = jln.c;
                break;
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                function = jln.r;
                break;
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                function = jlo.h;
                break;
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                function = jln.j;
                break;
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                function = jlo.l;
                break;
            default:
                String strValueOf = String.valueOf(jkcVar);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 42);
                sb.append("Should never get here! ");
                sb.append(strValueOf);
                sb.append(" missing in switch.");
                throw new IllegalArgumentException(sb.toString());
        }
        Resources resources = view.getResources();
        jlp jlpVar = (jlp) function.apply(resources);
        jlpVar.k(jkcVar);
        if (htiVar == null) {
            throw new NullPointerException("Null timerOption");
        }
        jlpVar.b = htiVar;
        int iIntValue = ((Integer) ((oor) I.getOrDefault(jkcVar, orw.a)).getOrDefault(htiVar, 0)).intValue();
        if (iIntValue != 0) {
            jlpVar.d(iIntValue);
        }
        Integer num = jlpVar.a;
        if (num == null) {
            throw new IllegalStateException("Property \"buttonImageResourceId\" has not been set");
        }
        int iIntValue2 = num.intValue();
        if (iIntValue2 != 0) {
            Drawable drawable = resources.getDrawable(iIntValue2, null);
            Drawable.ConstantState constantState = drawable.getConstantState();
            constantState.getClass();
            jlpVar.h(ojc.i(constantState));
            jlpVar.c(resources.getResourceEntryName(iIntValue2));
            jlpVar.i(drawable.getIntrinsicWidth() / 2);
        }
        return jlpVar.a();
    }

    public final jlp c() {
        return new jlp(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jlq) {
            jlq jlqVar = (jlq) obj;
            if (this.f == jlqVar.f && this.g == jlqVar.g && this.h == jlqVar.h && this.i == jlqVar.i && this.j == jlqVar.j && this.k == jlqVar.k && this.l == jlqVar.l && this.m == jlqVar.m && this.n.equals(jlqVar.n) && this.o == jlqVar.o && this.p.equals(jlqVar.p) && this.q == jlqVar.q && this.r == jlqVar.r && this.s == jlqVar.s && this.t == jlqVar.t && this.u == jlqVar.u && this.v == jlqVar.v && this.w == jlqVar.w && this.x.equals(jlqVar.x) && this.y.equals(jlqVar.y) && this.z == jlqVar.z && this.A == jlqVar.A && this.B == jlqVar.B && this.C == jlqVar.C && this.D == jlqVar.D && this.E == jlqVar.E && this.F == jlqVar.F) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((this.f ^ 1000003) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ this.k) * 1000003) ^ this.l) * 1000003) ^ this.m) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q) * 1000003) ^ (true != this.r ? 1237 : 1231)) * 1000003) ^ this.s) * 1000003) ^ this.t) * 1000003) ^ this.u) * 1000003) ^ this.v) * 1000003) ^ this.w) * 1000003) ^ this.x.hashCode()) * 1000003) ^ this.y.hashCode()) * 1000003) ^ this.z) * 1000003) ^ this.A) * 1000003) ^ this.B) * 1000003) ^ this.C) * 1000003) ^ this.D) * 1000003) ^ this.E) * 1000003) ^ this.F;
    }

    public final String toString() {
        int i = this.f;
        int i2 = this.g;
        int i3 = this.h;
        int i4 = this.i;
        int i5 = this.j;
        int i6 = this.k;
        int i7 = this.l;
        int i8 = this.m;
        String strValueOf = String.valueOf(this.n);
        int i9 = this.o;
        String str = this.p;
        int i10 = this.q;
        boolean z = this.r;
        int i11 = this.s;
        int i12 = this.t;
        int i13 = this.u;
        int i14 = this.v;
        int i15 = this.w;
        String strValueOf2 = String.valueOf(this.x);
        String strValueOf3 = String.valueOf(this.y);
        int i16 = this.z;
        int i17 = this.A;
        int i18 = this.B;
        int i19 = this.C;
        int i20 = this.D;
        int i21 = this.E;
        int i22 = this.F;
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 816 + length2 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length());
        sb.append("ShutterButtonSpec{photoCircleRadius=");
        sb.append(i);
        sb.append(", photoCircleAlpha=");
        sb.append(i2);
        sb.append(", photoCircleColor=");
        sb.append(i3);
        sb.append(", videoDotRadius=");
        sb.append(i4);
        sb.append(", videoCircleColor=");
        sb.append(i5);
        sb.append(", stopSquareHalfSize=");
        sb.append(i6);
        sb.append(", portraitInnerCircleRadius=");
        sb.append(i7);
        sb.append(", portraitOuterCircleRadius=");
        sb.append(i8);
        sb.append(", buttonImage=");
        sb.append(strValueOf);
        sb.append(", buttonImageResourceId=");
        sb.append(i9);
        sb.append(", buttonImageResourceEntryName=");
        sb.append(str);
        sb.append(", buttonImageRectHalfSize=");
        sb.append(i10);
        sb.append(", animateRippleEffect=");
        sb.append(z);
        sb.append(", ripplePaintAlpha=");
        sb.append(i11);
        sb.append(", rippleRadius=");
        sb.append(i12);
        sb.append(", mainButtonColor=");
        sb.append(i13);
        sb.append(", roundButtonRadius=");
        sb.append(i14);
        sb.append(", outerButtonRadius=");
        sb.append(i15);
        sb.append(", mode=");
        sb.append(strValueOf2);
        sb.append(", timerOption=");
        sb.append(strValueOf3);
        sb.append(", tickMarkLength=");
        sb.append(i16);
        sb.append(", tickMarkPaddingToCircleEdge=");
        sb.append(i17);
        sb.append(", tickMarkRectRoundRadius=");
        sb.append(i18);
        sb.append(", tickMarkAlpha=");
        sb.append(i19);
        sb.append(", mainOuterButtonAlpha=");
        sb.append(i20);
        sb.append(", innerDotCenterOffset=");
        sb.append(i21);
        sb.append(", innerDotColor=");
        sb.append(i22);
        sb.append("}");
        return sb.toString();
    }
}
