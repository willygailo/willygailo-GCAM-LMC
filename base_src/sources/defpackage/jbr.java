package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.Size;
import android.view.WindowInsets;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class jbr {
    public static int a;
    private static final ouj b = ouj.h("com/google/android/apps/camera/ui/layout/CameraBoxesHelper");

    static int a() {
        return jsa.b(48.0f);
    }

    public static boolean b(jrl jrlVar) {
        return jrlVar.equals(jrl.VIDEO) || jrlVar.equals(jrl.SLOW_MOTION) || jrlVar.equals(jrl.TIME_LAPSE) || jrlVar.equals(jrl.MOTION_BLUR);
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0443  */
    public static jbt c(jbv jbvVar, boolean z, Context context, img imgVar, ojz ojzVar, boolean z2) {
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int i;
        int i2;
        boolean z3;
        int iA;
        int i3;
        boolean z4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z5;
        int iMax;
        int systemWindowInsetTop;
        int i11;
        int i12;
        boolean z6;
        obr.aR(jbvVar.a(), "Invalid Constraints!");
        Size size = jbvVar.b;
        obr.ao(size);
        Size size2 = jbvVar.d;
        obr.ao(size2);
        boolean z7 = jbvVar.f;
        jrz jrzVar = jbvVar.h;
        jrl jrlVar = jbvVar.i;
        boolean z8 = jbvVar.g;
        int i13 = 0;
        if (z) {
            int width = size.getWidth();
            int height = size.getHeight();
            int iB6 = jsa.b(84.0f);
            int iB7 = jsa.b(56.0f);
            int iB8 = jsa.b(84.0f);
            int iB9 = (b(jrlVar) && z2) ? jsa.b(56.0f) : 0;
            int iB10 = height - jsa.b(56.0f);
            int i14 = iB10 - iB6;
            int i15 = i14 - iB9;
            int i16 = i15 - iB8;
            lic licVarC = lic.c(((Activity) context).getWindowManager().getDefaultDisplay());
            lhs lhsVarG = lhs.g(size2);
            if (licVarC.equals(lic.CLOCKWISE_90) || licVarC.equals(lic.CLOCKWISE_270)) {
                lhsVarG = lhsVarG.j();
            }
            Size sizeE = e(size, lhsVarG);
            jbs jbsVarB = jbt.b();
            jbsVarB.n(size);
            jbsVarB.j(new Rect(0, 0, sizeE.getWidth(), sizeE.getHeight()));
            jbsVarB.p(new Rect(0, i16, width, i15));
            jbsVarB.b(new Rect(0, i14, width, iB10));
            jbsVarB.l(new Rect(0, iB7, width, i14));
            jbsVarB.m(new Rect(0, iB7, width, i14));
            jbsVarB.g(new Rect(0, iB10, width, height));
            jbsVarB.d(new Rect(0, 0, width, height));
            jbsVarB.e(new Rect(0, i14, width, height));
            jbsVarB.k(new Rect(0, 0, 0, 0));
            jbsVarB.i(new Rect(0, 0, 0, 0));
            jbsVarB.c(new Rect(0, 0, 0, 0));
            jbsVarB.f(new Rect(0, i15, width, i14));
            return jbsVarB.a();
        }
        Size sizeF = f(size, jrzVar);
        Size sizeF2 = f(size2, jrzVar);
        int width2 = sizeF.getWidth();
        int height2 = sizeF.getHeight();
        a = 7;
        WindowInsets windowInsets = (WindowInsets) ojzVar.a();
        Size sizeE2 = e(sizeF, lhs.g(sizeF2).f());
        int width3 = (width2 - sizeE2.getWidth()) / 2;
        Rect rect = new Rect(width3, 0, sizeE2.getWidth() + width3, height2);
        Size sizeE3 = e(new Size(rect.width(), rect.height()), lhs.b.f());
        int height3 = sizeE3.getHeight();
        if (z7) {
            iB2 = 0;
            iB5 = 0;
            iB = 0;
            iB3 = 0;
            iB4 = 0;
            i = 0;
        } else {
            iB = jsa.b(56.0f);
            iB2 = jsa.b(84.0f);
            iB3 = jsa.b(42.0f);
            iB4 = jsa.b(56.0f);
            int iB11 = (b(jrlVar) && z2) ? jsa.b(56.0f) : 0;
            if (z8) {
                iB5 = jsa.b(48.0f);
                i = 165;
                i13 = iB11;
            } else if (height2 <= height3) {
                iB5 = jsa.b(48.0f);
                i13 = iB11;
                i = 0;
            } else {
                iB5 = jsa.b(56.0f);
                i13 = iB11;
                i = 0;
            }
        }
        Size sizeE4 = e(new Size(rect.width(), rect.height()), lhs.g(sizeF2));
        int height4 = e(sizeE3, lhs.a.f()).getHeight();
        int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        imgVar.d(4100);
        if (z7) {
            iA = systemWindowInsetBottom;
            rect = rect;
            i3 = i;
            z4 = false;
        } else if ((((height2 - a()) - iB5) - jsa.b(86.0f)) - height4 < 0) {
            if (z8) {
                ((oug) ((oug) b.b()).G(3243)).C("We shall not hide nav bar for Sunfish device: %d, %d, %d, %d, %d", Integer.valueOf(height2), Integer.valueOf(a()), Integer.valueOf(iB5), Integer.valueOf(jsa.b(86.0f)), Integer.valueOf(height4));
            }
            imgVar.d(4102);
            i3 = i;
            z4 = false;
            iA = 0;
        } else {
            rect = rect;
            if (z8) {
                try {
                    i2 = windowInsets.getInsets(WindowInsets.Type.navigationBars()).bottom;
                    int i17 = windowInsets.getInsets(WindowInsets.Type.navigationBars()).left;
                    int i18 = windowInsets.getInsets(WindowInsets.Type.navigationBars()).right;
                    if (i2 != 0) {
                        z3 = false;
                    } else if (i17 == 0 && i18 == 0) {
                        i2 = 0;
                        z3 = true;
                    } else {
                        i2 = 0;
                        z3 = false;
                    }
                } catch (Throwable unused) {
                }
                if (i2 > jsa.b(16.0f) || i2 == 0) {
                    iA = a();
                    i3 = i;
                    z4 = z3;
                } else {
                    int i19 = (height2 - height3) - iB5;
                    boolean z9 = z3;
                    iA = Math.min(Math.max(i19 - i, 93), jsa.b(40.0f));
                    int i20 = i19 - iA;
                    z4 = z9;
                    i3 = i20;
                }
            } else {
                iA = a();
                i3 = i;
                z4 = false;
            }
        }
        int i21 = height2 - iA;
        boolean z10 = z4;
        int i22 = i21 - iB5;
        int height5 = sizeE4.getHeight();
        int i23 = iB5 + iA;
        if (z7) {
            systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
            i5 = i22;
            i10 = i5;
            i6 = i10;
            i7 = i6;
            i9 = (height2 - systemWindowInsetTop) - systemWindowInsetBottom;
            z5 = true;
            i4 = 0;
            i23 = 0;
            iMax = systemWindowInsetTop;
        } else if (z8) {
            int i24 = height3 + iA + iB5;
            if (height2 < i24) {
                ((oug) ((oug) b.b()).G(3242)).B("Window height is shorter than expected: %d, %d, %d, %d", Integer.valueOf(height2), Integer.valueOf(height3), Integer.valueOf(iA), Integer.valueOf(iB5));
            }
            if (height2 >= i24 + i3) {
                systemWindowInsetTop = i22 - height3;
                int i25 = ((i22 - height4) - systemWindowInsetTop) - iB4;
                i4 = i25 >= jsa.b(112.0f) ? i25 : (i25 + iB4) - iB5;
                i10 = i22 - i4;
                i6 = i10 - i13;
                i7 = i6 - iB2;
                if (i25 < jsa.b(112.0f) || sizeF2.getHeight() * 3 != sizeF2.getWidth() * 4) {
                    i12 = i10;
                    z5 = true;
                } else {
                    i12 = i6 - iB4;
                    z5 = false;
                }
                int i26 = i12;
                if (sizeF2.getHeight() * 3 == sizeF2.getWidth() * 4 && i25 < jsa.b(112.0f)) {
                    systemWindowInsetTop += iB5;
                }
                i5 = i26;
            } else {
                int i27 = i21 - height3;
                i4 = (i22 - height4) - i27;
                i10 = i22 - i4;
                i6 = i10 - i13;
                i5 = i10;
                z5 = true;
                i7 = i6 - iB2;
                systemWindowInsetTop = i27;
            }
            if (sizeF2.getHeight() * 3 == sizeF2.getWidth() * 4) {
                i23 += i4;
                a = 6;
            } else {
                a = 5;
            }
            iMax = iB <= systemWindowInsetTop ? Math.max(0, systemWindowInsetTop - jsa.b(64.0f)) : systemWindowInsetTop;
            i9 = height5;
        } else if (height2 <= height3) {
            i4 = i22 - height4;
            i5 = i22 - i4;
            i6 = i5 - i13;
            i7 = i6 - iB2;
            if (sizeF2.getHeight() * 3 == sizeF2.getWidth() * 4) {
                i23 += i4;
                i11 = 2;
            } else {
                i11 = 1;
            }
            a = i11;
            i9 = height5;
            i10 = i5;
            systemWindowInsetTop = 0;
            iMax = 0;
            z5 = true;
        } else {
            int i28 = iA + height3 + iB5;
            if (height2 < i28) {
                systemWindowInsetTop = i21 - height3;
                i4 = (i22 - height4) - systemWindowInsetTop;
                i5 = i22 - i4;
                i6 = i5 - i13;
                i7 = i6 - iB2;
                if (sizeF2.getHeight() * 3 == sizeF2.getWidth() * 4) {
                    i23 += i4;
                    a = 4;
                } else {
                    a = 3;
                }
                i9 = height5;
                iMax = systemWindowInsetTop;
                i10 = i5;
                z5 = true;
            } else {
                obr.aF(height2 >= i28);
                int i29 = i22 - height3;
                i4 = ((i21 - (iB5 + iB5)) - height4) - i29;
                i5 = i22 - i4;
                i6 = i5 - i13;
                i7 = i6 - iB2;
                if (sizeF2.getHeight() * 3 == sizeF2.getWidth() * 4) {
                    i8 = i29 + iB5;
                    i23 += i4;
                    a = 6;
                } else {
                    a = 5;
                    i8 = i29;
                }
                i9 = height5;
                i10 = i5;
                z5 = true;
                int i30 = i8;
                iMax = i29;
                systemWindowInsetTop = i30;
            }
        }
        int iMax2 = Math.max(systemWindowInsetTop, iB + iMax);
        int i31 = i5 - iMax2;
        boolean z11 = z5;
        int i32 = i5 - systemWindowInsetTop;
        int i33 = i13;
        int i34 = a;
        if (i34 == 0) {
            throw null;
        }
        int i35 = i6;
        if (i34 == 6) {
            z6 = true;
        } else {
            if (i34 == 0) {
                throw null;
            }
            if (i34 == 4) {
                z6 = true;
            } else {
                if (i34 == 0) {
                    throw null;
                }
                z6 = i34 == 2;
            }
        }
        if (z6) {
            i23 += i10 - i5;
        }
        int i36 = i23;
        int i37 = i5;
        int i38 = i3;
        if (jrlVar == jrl.TIME_LAPSE && !z2) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.timelapse_speed_up_seekbar_thumb_size);
            i7 -= dimensionPixelSize;
            i31 -= dimensionPixelSize;
        }
        int i39 = i7;
        int i40 = (i39 - iMax) + iB3;
        jbs jbsVarB2 = jbt.b();
        int i41 = iMax;
        jbsVarB2.n(sizeF);
        Rect rect2 = rect;
        jbsVarB2.p(d(rect2.left, i39, rect2.width(), iB2));
        jbsVarB2.g(d(rect2.left, i22, rect2.width(), iB5));
        jbsVarB2.b(d(rect2.left, i10, rect2.width(), i4));
        int i42 = rect2.left;
        if (true == z6) {
            i22 = i37;
        }
        jbsVarB2.e(d(i42, i22, rect2.width(), i36));
        jbsVarB2.m(d(rect2.left, iMax2, rect2.width(), i31));
        jbsVarB2.j(d(rect2.left, systemWindowInsetTop, rect2.width(), i9));
        jbsVarB2.k(d(rect2.left, systemWindowInsetTop, rect2.width(), i32));
        jbsVarB2.i(d(rect2.left, i41, rect2.width(), i40));
        jbsVarB2.l(d(rect2.left, iMax2, rect2.width(), i31));
        jbsVarB2.d(d(rect2.left, 0, rect2.width(), height2));
        jbsVarB2.c(d(rect2.left, 0, rect2.width(), i38));
        jbsVarB2.f(d(rect2.left, i35, rect2.width(), i33));
        jbsVarB2.h(z10);
        jbsVarB2.o(z11);
        jbt jbtVarA = jbsVarB2.a();
        Size size3 = jbtVarA.b;
        jrz jrzVar2 = jrz.PORTRAIT;
        switch (jrzVar) {
            case PORTRAIT:
            case REVERSE_PORTRAIT:
                break;
            case LANDSCAPE:
            case REVERSE_LANDSCAPE:
                size3 = new Size(size3.getHeight(), size3.getWidth());
                break;
            default:
                String strValueOf = String.valueOf(jrzVar);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 27);
                sb.append("Unexpected UI Orientation: ");
                sb.append(strValueOf);
                throw new IllegalArgumentException(sb.toString());
        }
        jbs jbsVarB3 = jbt.b();
        jbsVarB3.n(size3);
        jbsVarB3.j(jbt.a(jbtVarA.e, size3, jrzVar));
        jbsVarB3.k(jbt.a(jbtVarA.c, size3, jrzVar));
        jbsVarB3.i(jbt.a(jbtVarA.d, size3, jrzVar));
        jbsVarB3.l(jbt.a(jbtVarA.f, size3, jrzVar));
        jbsVarB3.m(jbt.a(jbtVarA.g, size3, jrzVar));
        jbsVarB3.p(jbt.a(jbtVarA.h, size3, jrzVar));
        jbsVarB3.b(jbt.a(jbtVarA.i, size3, jrzVar));
        jbsVarB3.f(jbt.a(jbtVarA.n, size3, jrzVar));
        jbsVarB3.d(jbt.a(jbtVarA.k, size3, jrzVar));
        jbsVarB3.e(jbt.a(jbtVarA.j, size3, jrzVar));
        jbsVarB3.c(jbt.a(jbtVarA.m, size3, jrzVar));
        jbsVarB3.g(jbt.a(jbtVarA.l, size3, jrzVar));
        jbsVarB3.h(jbtVarA.o);
        jbsVarB3.o(jbtVarA.p);
        return jbsVarB3.a();
    }

    private static Rect d(int i, int i2, int i3, int i4) {
        return new Rect(i, i2, i3 + i, i4 + i2);
    }

    private static Size e(Size size, lhs lhsVar) {
        float fMin = Math.min(size.getWidth() / lhsVar.d, size.getHeight() / lhsVar.e);
        return new Size(Math.round(lhsVar.d * fMin), Math.round(fMin * lhsVar.e));
    }

    private static Size f(Size size, jrz jrzVar) {
        jrz jrzVar2 = jrz.PORTRAIT;
        switch (jrzVar) {
            case PORTRAIT:
            case REVERSE_PORTRAIT:
                return size;
            case LANDSCAPE:
            case REVERSE_LANDSCAPE:
                return new Size(size.getHeight(), size.getWidth());
            default:
                String strValueOf = String.valueOf(jrzVar);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 24);
                sb.append("Unknown UI orientation: ");
                sb.append(strValueOf);
                throw new RuntimeException(sb.toString());
        }
    }
}
