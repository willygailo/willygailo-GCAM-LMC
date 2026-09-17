package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.camera.bottombar.R;
import com.google.lens.sdk.LensApi;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class zu {
    public static final int[] a = {0, 4, 8};
    private static final SparseIntArray c;
    private static final SparseIntArray d;
    private final HashMap e = new HashMap();
    public final HashMap b = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        d = sparseIntArray2;
        int[] iArr = zz.a;
        sparseIntArray.append(81, 25);
        sparseIntArray.append(82, 26);
        sparseIntArray.append(84, 29);
        sparseIntArray.append(85, 30);
        sparseIntArray.append(91, 36);
        sparseIntArray.append(90, 35);
        sparseIntArray.append(62, 4);
        sparseIntArray.append(61, 3);
        sparseIntArray.append(57, 1);
        sparseIntArray.append(59, 91);
        sparseIntArray.append(58, 92);
        sparseIntArray.append(100, 6);
        sparseIntArray.append(R.styleable.AppCompatTheme_switchStyle, 7);
        sparseIntArray.append(69, 17);
        sparseIntArray.append(70, 18);
        sparseIntArray.append(71, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(86, 32);
        sparseIntArray.append(87, 33);
        sparseIntArray.append(68, 10);
        sparseIntArray.append(67, 9);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceListItemSmall, 13);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, 16);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, 14);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceListItem, 11);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 15);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 12);
        sparseIntArray.append(94, 40);
        sparseIntArray.append(79, 39);
        sparseIntArray.append(78, 41);
        sparseIntArray.append(93, 42);
        sparseIntArray.append(77, 20);
        sparseIntArray.append(92, 37);
        sparseIntArray.append(66, 5);
        sparseIntArray.append(80, 87);
        sparseIntArray.append(89, 87);
        sparseIntArray.append(83, 87);
        sparseIntArray.append(60, 87);
        sparseIntArray.append(56, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(95, 95);
        sparseIntArray.append(72, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(96, 54);
        sparseIntArray.append(73, 55);
        sparseIntArray.append(97, 56);
        sparseIntArray.append(74, 57);
        sparseIntArray.append(98, 58);
        sparseIntArray.append(75, 59);
        sparseIntArray.append(63, 61);
        sparseIntArray.append(65, 62);
        sparseIntArray.append(64, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowFixedHeightMajor, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(121, 67);
        sparseIntArray.append(112, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(111, 68);
        sparseIntArray.append(99, 69);
        sparseIntArray.append(76, 70);
        sparseIntArray.append(R.styleable.AppCompatTheme_textColorAlertDialogListItem, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(113, 76);
        sparseIntArray.append(88, 77);
        sparseIntArray.append(122, 78);
        sparseIntArray.append(55, 80);
        sparseIntArray.append(54, 81);
        sparseIntArray.append(R.styleable.AppCompatTheme_tooltipFrameBackground, 82);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowActionModeOverlay, 83);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowActionBarOverlay, 84);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowActionBar, 85);
        sparseIntArray.append(R.styleable.AppCompatTheme_viewInflaterClass, 86);
        sparseIntArray2.append(84, 6);
        sparseIntArray2.append(84, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(88, 13);
        sparseIntArray2.append(91, 16);
        sparseIntArray2.append(89, 14);
        sparseIntArray2.append(86, 11);
        sparseIntArray2.append(90, 15);
        sparseIntArray2.append(87, 12);
        sparseIntArray2.append(77, 40);
        sparseIntArray2.append(70, 39);
        sparseIntArray2.append(69, 41);
        sparseIntArray2.append(76, 42);
        sparseIntArray2.append(68, 20);
        sparseIntArray2.append(75, 37);
        sparseIntArray2.append(59, 5);
        sparseIntArray2.append(71, 87);
        sparseIntArray2.append(74, 87);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(55, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(78, 95);
        sparseIntArray2.append(63, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(79, 54);
        sparseIntArray2.append(64, 55);
        sparseIntArray2.append(80, 56);
        sparseIntArray2.append(65, 57);
        sparseIntArray2.append(81, 58);
        sparseIntArray2.append(66, 59);
        sparseIntArray2.append(58, 62);
        sparseIntArray2.append(57, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(R.styleable.AppCompatTheme_textAppearanceListItemSmall, 67);
        sparseIntArray2.append(95, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(96, 98);
        sparseIntArray2.append(94, 68);
        sparseIntArray2.append(82, 69);
        sparseIntArray2.append(67, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(97, 76);
        sparseIntArray2.append(73, 77);
        sparseIntArray2.append(R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, 78);
        sparseIntArray2.append(54, 80);
        sparseIntArray2.append(53, 81);
        sparseIntArray2.append(99, 82);
        sparseIntArray2.append(R.styleable.AppCompatTheme_textAppearanceListItem, 83);
        sparseIntArray2.append(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 84);
        sparseIntArray2.append(R.styleable.AppCompatTheme_switchStyle, 85);
        sparseIntArray2.append(100, 86);
        sparseIntArray2.append(93, 97);
    }

    public static int a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    static void e(Object obj, TypedArray typedArray, int i, int i2) {
        boolean z = true;
        int dimensionPixelSize = 0;
        switch (typedArray.peekValue(i).type) {
            case 3:
                String string = typedArray.getString(i);
                if (string == null) {
                    return;
                }
                int iIndexOf = string.indexOf(61);
                int length = string.length();
                if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                    return;
                }
                String strSubstring = string.substring(0, iIndexOf);
                String strSubstring2 = string.substring(iIndexOf + 1);
                if (strSubstring2.length() > 0) {
                    String strTrim = strSubstring.trim();
                    String strTrim2 = strSubstring2.trim();
                    if ("ratio".equalsIgnoreCase(strTrim)) {
                        if (obj instanceof zk) {
                            zk zkVar = (zk) obj;
                            if (i2 == 0) {
                                zkVar.width = 0;
                            } else {
                                zkVar.height = 0;
                            }
                            f(zkVar, strTrim2);
                            return;
                        }
                        if (obj instanceof zq) {
                            ((zq) obj).z = strTrim2;
                            return;
                        } else {
                            if (obj instanceof zo) {
                                ((zo) obj).c(5, strTrim2);
                                return;
                            }
                            return;
                        }
                    }
                    if ("weight".equalsIgnoreCase(strTrim)) {
                        try {
                            float f = Float.parseFloat(strTrim2);
                            if (obj instanceof zk) {
                                zk zkVar2 = (zk) obj;
                                if (i2 == 0) {
                                    zkVar2.width = 0;
                                    zkVar2.G = f;
                                    return;
                                } else {
                                    zkVar2.height = 0;
                                    zkVar2.H = f;
                                    return;
                                }
                            }
                            if (obj instanceof zq) {
                                zq zqVar = (zq) obj;
                                if (i2 == 0) {
                                    zqVar.d = 0;
                                    zqVar.V = f;
                                    return;
                                } else {
                                    zqVar.e = 0;
                                    zqVar.U = f;
                                    return;
                                }
                            }
                            if (obj instanceof zo) {
                                zo zoVar = (zo) obj;
                                if (i2 == 0) {
                                    zoVar.b(23, 0);
                                    zoVar.a(39, f);
                                    return;
                                } else {
                                    zoVar.b(21, 0);
                                    zoVar.a(40, f);
                                    return;
                                }
                            }
                            return;
                        } catch (NumberFormatException e) {
                            return;
                        }
                    }
                    if ("parent".equalsIgnoreCase(strTrim)) {
                        try {
                            float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                            if (obj instanceof zk) {
                                zk zkVar3 = (zk) obj;
                                if (i2 == 0) {
                                    zkVar3.width = 0;
                                    zkVar3.Q = fMax;
                                    zkVar3.K = 2;
                                    return;
                                } else {
                                    zkVar3.height = 0;
                                    zkVar3.R = fMax;
                                    zkVar3.L = 2;
                                    return;
                                }
                            }
                            if (obj instanceof zq) {
                                zq zqVar2 = (zq) obj;
                                if (i2 == 0) {
                                    zqVar2.d = 0;
                                    zqVar2.ae = fMax;
                                    zqVar2.Y = 2;
                                    return;
                                } else {
                                    zqVar2.e = 0;
                                    zqVar2.af = fMax;
                                    zqVar2.Z = 2;
                                    return;
                                }
                            }
                            if (obj instanceof zo) {
                                zo zoVar2 = (zo) obj;
                                if (i2 == 0) {
                                    zoVar2.b(23, 0);
                                    zoVar2.b(54, 2);
                                    return;
                                } else {
                                    zoVar2.b(21, 0);
                                    zoVar2.b(55, 2);
                                    return;
                                }
                            }
                            return;
                        } catch (NumberFormatException e2) {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 4:
            default:
                int i3 = typedArray.getInt(i, 0);
                switch (i3) {
                    case -4:
                        dimensionPixelSize = -2;
                        break;
                    case -2:
                    case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                        dimensionPixelSize = i3;
                    case -3:
                        z = false;
                        break;
                    default:
                        z = false;
                        break;
                }
                break;
            case 5:
                dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
                z = false;
                break;
        }
        if (obj instanceof zk) {
            zk zkVar4 = (zk) obj;
            if (i2 == 0) {
                zkVar4.width = dimensionPixelSize;
                zkVar4.V = z;
                return;
            } else {
                zkVar4.height = dimensionPixelSize;
                zkVar4.W = z;
                return;
            }
        }
        if (obj instanceof zq) {
            zq zqVar3 = (zq) obj;
            if (i2 == 0) {
                zqVar3.d = dimensionPixelSize;
                zqVar3.am = z;
                return;
            } else {
                zqVar3.e = dimensionPixelSize;
                zqVar3.an = z;
                return;
            }
        }
        if (obj instanceof zo) {
            zo zoVar3 = (zo) obj;
            if (i2 == 0) {
                zoVar3.b(23, dimensionPixelSize);
                zoVar3.d(80, z);
            } else {
                zoVar3.b(21, dimensionPixelSize);
                zoVar3.d(81, z);
            }
        }
    }

    static void f(zk zkVar, String str) {
        int i;
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i2 = 0;
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                i = -1;
            } else {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i2 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                int i3 = i2;
                i2 = iIndexOf + 1;
                i = i3;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i2);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i2, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > 0.0f && f2 > 0.0f) {
                            if (i == 1) {
                                Math.abs(f2 / f);
                            } else {
                                Math.abs(f / f2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException e) {
            }
        }
        zkVar.F = str;
    }

    public static final int[] g(View view, String str) {
        int length;
        int iIntValue;
        Object objE;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = strArrSplit.length;
            if (i >= length) {
                break;
            }
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = zy.class.getField(strTrim).getInt(null);
            } catch (Exception e) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0) {
                iIntValue = (view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objE = ((ConstraintLayout) view.getParent()).e(strTrim)) != null && (objE instanceof Integer)) ? ((Integer) objE).intValue() : 0;
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    private static final zp h(Context context, AttributeSet attributeSet, boolean z) {
        zp zpVar = new zp();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? zz.c : zz.a);
        if (z) {
            i(zpVar, typedArrayObtainStyledAttributes);
        } else {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index != 1 && index != 23 && index != 24) {
                    zpVar.c.b = true;
                    zpVar.d.c = true;
                    zpVar.b.a = true;
                    zpVar.e.b = true;
                }
                SparseIntArray sparseIntArray = c;
                switch (sparseIntArray.get(index)) {
                    case 1:
                        zq zqVar = zpVar.d;
                        zqVar.q = a(typedArrayObtainStyledAttributes, index, zqVar.q);
                        break;
                    case 2:
                        zq zqVar2 = zpVar.d;
                        zqVar2.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zqVar2.J);
                        break;
                    case 3:
                        zq zqVar3 = zpVar.d;
                        zqVar3.p = a(typedArrayObtainStyledAttributes, index, zqVar3.p);
                        break;
                    case 4:
                        zq zqVar4 = zpVar.d;
                        zqVar4.o = a(typedArrayObtainStyledAttributes, index, zqVar4.o);
                        break;
                    case 5:
                        zpVar.d.z = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        zq zqVar5 = zpVar.d;
                        zqVar5.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, zqVar5.D);
                        break;
                    case 7:
                        zq zqVar6 = zpVar.d;
                        zqVar6.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, zqVar6.E);
                        break;
                    case 8:
                        zq zqVar7 = zpVar.d;
                        zqVar7.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zqVar7.K);
                        break;
                    case 9:
                        zq zqVar8 = zpVar.d;
                        zqVar8.w = a(typedArrayObtainStyledAttributes, index, zqVar8.w);
                        break;
                    case 10:
                        zq zqVar9 = zpVar.d;
                        zqVar9.v = a(typedArrayObtainStyledAttributes, index, zqVar9.v);
                        break;
                    case 11:
                        zq zqVar10 = zpVar.d;
                        zqVar10.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zqVar10.Q);
                        break;
                    case 12:
                        zq zqVar11 = zpVar.d;
                        zqVar11.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zqVar11.R);
                        break;
                    case 13:
                        zq zqVar12 = zpVar.d;
                        zqVar12.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zqVar12.N);
                        break;
                    case 14:
                        zq zqVar13 = zpVar.d;
                        zqVar13.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zqVar13.P);
                        break;
                    case 15:
                        zq zqVar14 = zpVar.d;
                        zqVar14.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zqVar14.S);
                        break;
                    case 16:
                        zq zqVar15 = zpVar.d;
                        zqVar15.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zqVar15.O);
                        break;
                    case 17:
                        zq zqVar16 = zpVar.d;
                        zqVar16.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, zqVar16.f);
                        break;
                    case 18:
                        zq zqVar17 = zpVar.d;
                        zqVar17.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, zqVar17.g);
                        break;
                    case 19:
                        zq zqVar18 = zpVar.d;
                        zqVar18.h = typedArrayObtainStyledAttributes.getFloat(index, zqVar18.h);
                        break;
                    case 20:
                        zq zqVar19 = zpVar.d;
                        zqVar19.x = typedArrayObtainStyledAttributes.getFloat(index, zqVar19.x);
                        break;
                    case 21:
                        zq zqVar20 = zpVar.d;
                        zqVar20.e = typedArrayObtainStyledAttributes.getLayoutDimension(index, zqVar20.e);
                        break;
                    case 22:
                        zs zsVar = zpVar.b;
                        zsVar.b = typedArrayObtainStyledAttributes.getInt(index, zsVar.b);
                        zpVar.b.b = a[zpVar.b.b];
                        break;
                    case 23:
                        zq zqVar21 = zpVar.d;
                        zqVar21.d = typedArrayObtainStyledAttributes.getLayoutDimension(index, zqVar21.d);
                        break;
                    case 24:
                        zq zqVar22 = zpVar.d;
                        zqVar22.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zqVar22.G);
                        break;
                    case 25:
                        zq zqVar23 = zpVar.d;
                        zqVar23.i = a(typedArrayObtainStyledAttributes, index, zqVar23.i);
                        break;
                    case 26:
                        zq zqVar24 = zpVar.d;
                        zqVar24.j = a(typedArrayObtainStyledAttributes, index, zqVar24.j);
                        break;
                    case 27:
                        zq zqVar25 = zpVar.d;
                        zqVar25.F = typedArrayObtainStyledAttributes.getInt(index, zqVar25.F);
                        break;
                    case 28:
                        zq zqVar26 = zpVar.d;
                        zqVar26.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zqVar26.H);
                        break;
                    case 29:
                        zq zqVar27 = zpVar.d;
                        zqVar27.k = a(typedArrayObtainStyledAttributes, index, zqVar27.k);
                        break;
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                        zq zqVar28 = zpVar.d;
                        zqVar28.l = a(typedArrayObtainStyledAttributes, index, zqVar28.l);
                        break;
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                        zq zqVar29 = zpVar.d;
                        zqVar29.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zqVar29.L);
                        break;
                    case 32:
                        zq zqVar30 = zpVar.d;
                        zqVar30.t = a(typedArrayObtainStyledAttributes, index, zqVar30.t);
                        break;
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        zq zqVar31 = zpVar.d;
                        zqVar31.u = a(typedArrayObtainStyledAttributes, index, zqVar31.u);
                        break;
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        zq zqVar32 = zpVar.d;
                        zqVar32.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zqVar32.I);
                        break;
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                        zq zqVar33 = zpVar.d;
                        zqVar33.n = a(typedArrayObtainStyledAttributes, index, zqVar33.n);
                        break;
                    case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                        zq zqVar34 = zpVar.d;
                        zqVar34.m = a(typedArrayObtainStyledAttributes, index, zqVar34.m);
                        break;
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        zq zqVar35 = zpVar.d;
                        zqVar35.y = typedArrayObtainStyledAttributes.getFloat(index, zqVar35.y);
                        break;
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        zpVar.a = typedArrayObtainStyledAttributes.getResourceId(index, zpVar.a);
                        break;
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        zq zqVar36 = zpVar.d;
                        zqVar36.V = typedArrayObtainStyledAttributes.getFloat(index, zqVar36.V);
                        break;
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                        zq zqVar37 = zpVar.d;
                        zqVar37.U = typedArrayObtainStyledAttributes.getFloat(index, zqVar37.U);
                        break;
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                        zq zqVar38 = zpVar.d;
                        zqVar38.W = typedArrayObtainStyledAttributes.getInt(index, zqVar38.W);
                        break;
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                        zq zqVar39 = zpVar.d;
                        zqVar39.X = typedArrayObtainStyledAttributes.getInt(index, zqVar39.X);
                        break;
                    case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                        zs zsVar2 = zpVar.b;
                        zsVar2.d = typedArrayObtainStyledAttributes.getFloat(index, zsVar2.d);
                        break;
                    case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                        zt ztVar = zpVar.e;
                        ztVar.n = true;
                        ztVar.o = typedArrayObtainStyledAttributes.getDimension(index, ztVar.o);
                        break;
                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                        zt ztVar2 = zpVar.e;
                        ztVar2.d = typedArrayObtainStyledAttributes.getFloat(index, ztVar2.d);
                        break;
                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                        zt ztVar3 = zpVar.e;
                        ztVar3.e = typedArrayObtainStyledAttributes.getFloat(index, ztVar3.e);
                        break;
                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                        zt ztVar4 = zpVar.e;
                        ztVar4.f = typedArrayObtainStyledAttributes.getFloat(index, ztVar4.f);
                        break;
                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                        zt ztVar5 = zpVar.e;
                        ztVar5.g = typedArrayObtainStyledAttributes.getFloat(index, ztVar5.g);
                        break;
                    case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                        zt ztVar6 = zpVar.e;
                        ztVar6.h = typedArrayObtainStyledAttributes.getDimension(index, ztVar6.h);
                        break;
                    case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                        zt ztVar7 = zpVar.e;
                        ztVar7.i = typedArrayObtainStyledAttributes.getDimension(index, ztVar7.i);
                        break;
                    case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                        zt ztVar8 = zpVar.e;
                        ztVar8.k = typedArrayObtainStyledAttributes.getDimension(index, ztVar8.k);
                        break;
                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                        zt ztVar9 = zpVar.e;
                        ztVar9.l = typedArrayObtainStyledAttributes.getDimension(index, ztVar9.l);
                        break;
                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                        zt ztVar10 = zpVar.e;
                        ztVar10.m = typedArrayObtainStyledAttributes.getDimension(index, ztVar10.m);
                        break;
                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                        zq zqVar40 = zpVar.d;
                        zqVar40.Y = typedArrayObtainStyledAttributes.getInt(index, zqVar40.Y);
                        break;
                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                        zq zqVar41 = zpVar.d;
                        zqVar41.Z = typedArrayObtainStyledAttributes.getInt(index, zqVar41.Z);
                        break;
                    case R.styleable.AppCompatTheme_colorError /* 56 */:
                        zq zqVar42 = zpVar.d;
                        zqVar42.aa = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zqVar42.aa);
                        break;
                    case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                        zq zqVar43 = zpVar.d;
                        zqVar43.ab = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zqVar43.ab);
                        break;
                    case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                        zq zqVar44 = zpVar.d;
                        zqVar44.ac = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zqVar44.ac);
                        break;
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        zq zqVar45 = zpVar.d;
                        zqVar45.ad = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zqVar45.ad);
                        break;
                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        zt ztVar11 = zpVar.e;
                        ztVar11.c = typedArrayObtainStyledAttributes.getFloat(index, ztVar11.c);
                        break;
                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                        zq zqVar46 = zpVar.d;
                        zqVar46.A = a(typedArrayObtainStyledAttributes, index, zqVar46.A);
                        break;
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                        zq zqVar47 = zpVar.d;
                        zqVar47.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zqVar47.B);
                        break;
                    case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                        zq zqVar48 = zpVar.d;
                        zqVar48.C = typedArrayObtainStyledAttributes.getFloat(index, zqVar48.C);
                        break;
                    case 64:
                        zr zrVar = zpVar.c;
                        zrVar.c = a(typedArrayObtainStyledAttributes, index, zrVar.c);
                        break;
                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            zpVar.c.e = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            zpVar.c.e = yg.a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                        zpVar.c.g = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                        zr zrVar2 = zpVar.c;
                        zrVar2.j = typedArrayObtainStyledAttributes.getFloat(index, zrVar2.j);
                        break;
                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                        zs zsVar3 = zpVar.b;
                        zsVar3.e = typedArrayObtainStyledAttributes.getFloat(index, zsVar3.e);
                        break;
                    case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                        zpVar.d.ae = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                        zpVar.d.af = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                        zq zqVar49 = zpVar.d;
                        zqVar49.ag = typedArrayObtainStyledAttributes.getInt(index, zqVar49.ag);
                        break;
                    case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                        zq zqVar50 = zpVar.d;
                        zqVar50.ah = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zqVar50.ah);
                        break;
                    case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                        zpVar.d.ak = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                        zq zqVar51 = zpVar.d;
                        zqVar51.ao = typedArrayObtainStyledAttributes.getBoolean(index, zqVar51.ao);
                        break;
                    case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                        zr zrVar3 = zpVar.c;
                        zrVar3.f = typedArrayObtainStyledAttributes.getInt(index, zrVar3.f);
                        break;
                    case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                        zpVar.d.al = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                        zs zsVar4 = zpVar.b;
                        zsVar4.c = typedArrayObtainStyledAttributes.getInt(index, zsVar4.c);
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                        zr zrVar4 = zpVar.c;
                        zrVar4.h = typedArrayObtainStyledAttributes.getFloat(index, zrVar4.h);
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                        zq zqVar52 = zpVar.d;
                        zqVar52.am = typedArrayObtainStyledAttributes.getBoolean(index, zqVar52.am);
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                        zq zqVar53 = zpVar.d;
                        zqVar53.an = typedArrayObtainStyledAttributes.getBoolean(index, zqVar53.an);
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                        zr zrVar5 = zpVar.c;
                        zrVar5.d = typedArrayObtainStyledAttributes.getInteger(index, zrVar5.d);
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                        zt ztVar12 = zpVar.e;
                        ztVar12.j = a(typedArrayObtainStyledAttributes, index, ztVar12.j);
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                        zr zrVar6 = zpVar.c;
                        zrVar6.l = typedArrayObtainStyledAttributes.getInteger(index, zrVar6.l);
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                        zr zrVar7 = zpVar.c;
                        zrVar7.k = typedArrayObtainStyledAttributes.getFloat(index, zrVar7.k);
                        break;
                    case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(index);
                        if (typedValuePeekValue.type == 1) {
                            zpVar.c.o = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            zr zrVar8 = zpVar.c;
                            if (zrVar8.o != -1) {
                                zrVar8.n = -2;
                            }
                        } else if (typedValuePeekValue.type == 3) {
                            zpVar.c.m = typedArrayObtainStyledAttributes.getString(index);
                            if (zpVar.c.m.indexOf("/") > 0) {
                                zpVar.c.o = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                zpVar.c.n = -2;
                            } else {
                                zpVar.c.n = -1;
                            }
                        } else {
                            zr zrVar9 = zpVar.c;
                            zrVar9.n = typedArrayObtainStyledAttributes.getInteger(index, zrVar9.o);
                        }
                        break;
                    case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                    case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                    case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                    default:
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                        zq zqVar54 = zpVar.d;
                        zqVar54.r = a(typedArrayObtainStyledAttributes, index, zqVar54.r);
                        break;
                    case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                        zq zqVar55 = zpVar.d;
                        zqVar55.s = a(typedArrayObtainStyledAttributes, index, zqVar55.s);
                        break;
                    case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                        zq zqVar56 = zpVar.d;
                        zqVar56.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zqVar56.M);
                        break;
                    case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                        zq zqVar57 = zpVar.d;
                        zqVar57.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zqVar57.T);
                        break;
                    case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                        e(zpVar.d, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                        e(zpVar.d, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                        zq zqVar58 = zpVar.d;
                        zqVar58.ap = typedArrayObtainStyledAttributes.getInt(index, zqVar58.ap);
                        break;
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return zpVar;
    }

    private static void i(zp zpVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        zo zoVar = new zo();
        zpVar.g = zoVar;
        zpVar.c.b = false;
        zpVar.d.c = false;
        zpVar.b.a = false;
        zpVar.e.b = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (d.get(index)) {
                case 2:
                    zoVar.b(2, typedArray.getDimensionPixelSize(index, zpVar.d.J));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                case 32:
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + c.get(index));
                    break;
                case 5:
                    zoVar.c(5, typedArray.getString(index));
                    break;
                case 6:
                    zoVar.b(6, typedArray.getDimensionPixelOffset(index, zpVar.d.D));
                    break;
                case 7:
                    zoVar.b(7, typedArray.getDimensionPixelOffset(index, zpVar.d.E));
                    break;
                case 8:
                    zoVar.b(8, typedArray.getDimensionPixelSize(index, zpVar.d.K));
                    break;
                case 11:
                    zoVar.b(11, typedArray.getDimensionPixelSize(index, zpVar.d.Q));
                    break;
                case 12:
                    zoVar.b(12, typedArray.getDimensionPixelSize(index, zpVar.d.R));
                    break;
                case 13:
                    zoVar.b(13, typedArray.getDimensionPixelSize(index, zpVar.d.N));
                    break;
                case 14:
                    zoVar.b(14, typedArray.getDimensionPixelSize(index, zpVar.d.P));
                    break;
                case 15:
                    zoVar.b(15, typedArray.getDimensionPixelSize(index, zpVar.d.S));
                    break;
                case 16:
                    zoVar.b(16, typedArray.getDimensionPixelSize(index, zpVar.d.O));
                    break;
                case 17:
                    zoVar.b(17, typedArray.getDimensionPixelOffset(index, zpVar.d.f));
                    break;
                case 18:
                    zoVar.b(18, typedArray.getDimensionPixelOffset(index, zpVar.d.g));
                    break;
                case 19:
                    zoVar.a(19, typedArray.getFloat(index, zpVar.d.h));
                    break;
                case 20:
                    zoVar.a(20, typedArray.getFloat(index, zpVar.d.x));
                    break;
                case 21:
                    zoVar.b(21, typedArray.getLayoutDimension(index, zpVar.d.e));
                    break;
                case 22:
                    zoVar.b(22, a[typedArray.getInt(index, zpVar.b.b)]);
                    break;
                case 23:
                    zoVar.b(23, typedArray.getLayoutDimension(index, zpVar.d.d));
                    break;
                case 24:
                    zoVar.b(24, typedArray.getDimensionPixelSize(index, zpVar.d.G));
                    break;
                case 27:
                    zoVar.b(27, typedArray.getInt(index, zpVar.d.F));
                    break;
                case 28:
                    zoVar.b(28, typedArray.getDimensionPixelSize(index, zpVar.d.H));
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    zoVar.b(31, typedArray.getDimensionPixelSize(index, zpVar.d.L));
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    zoVar.b(34, typedArray.getDimensionPixelSize(index, zpVar.d.I));
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    zoVar.a(37, typedArray.getFloat(index, zpVar.d.y));
                    break;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    int resourceId = typedArray.getResourceId(index, zpVar.a);
                    zpVar.a = resourceId;
                    zoVar.b(38, resourceId);
                    break;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    zoVar.a(39, typedArray.getFloat(index, zpVar.d.V));
                    break;
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    zoVar.a(40, typedArray.getFloat(index, zpVar.d.U));
                    break;
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    zoVar.b(41, typedArray.getInt(index, zpVar.d.W));
                    break;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    zoVar.b(42, typedArray.getInt(index, zpVar.d.X));
                    break;
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    zoVar.a(43, typedArray.getFloat(index, zpVar.b.d));
                    break;
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                    zoVar.d(44, true);
                    zoVar.a(44, typedArray.getDimension(index, zpVar.e.o));
                    break;
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    zoVar.a(45, typedArray.getFloat(index, zpVar.e.d));
                    break;
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    zoVar.a(46, typedArray.getFloat(index, zpVar.e.e));
                    break;
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    zoVar.a(47, typedArray.getFloat(index, zpVar.e.f));
                    break;
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    zoVar.a(48, typedArray.getFloat(index, zpVar.e.g));
                    break;
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    zoVar.a(49, typedArray.getDimension(index, zpVar.e.h));
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    zoVar.a(50, typedArray.getDimension(index, zpVar.e.i));
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    zoVar.a(51, typedArray.getDimension(index, zpVar.e.k));
                    break;
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    zoVar.a(52, typedArray.getDimension(index, zpVar.e.l));
                    break;
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    zoVar.a(53, typedArray.getDimension(index, zpVar.e.m));
                    break;
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    zoVar.b(54, typedArray.getInt(index, zpVar.d.Y));
                    break;
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    zoVar.b(55, typedArray.getInt(index, zpVar.d.Z));
                    break;
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    zoVar.b(56, typedArray.getDimensionPixelSize(index, zpVar.d.aa));
                    break;
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    zoVar.b(57, typedArray.getDimensionPixelSize(index, zpVar.d.ab));
                    break;
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    zoVar.b(58, typedArray.getDimensionPixelSize(index, zpVar.d.ac));
                    break;
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    zoVar.b(59, typedArray.getDimensionPixelSize(index, zpVar.d.ad));
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    zoVar.a(60, typedArray.getFloat(index, zpVar.e.c));
                    break;
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    zoVar.b(62, typedArray.getDimensionPixelSize(index, zpVar.d.B));
                    break;
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    zoVar.a(63, typedArray.getFloat(index, zpVar.d.C));
                    break;
                case 64:
                    zoVar.b(64, a(typedArray, index, zpVar.c.c));
                    break;
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (typedArray.peekValue(index).type == 3) {
                        zoVar.c(65, typedArray.getString(index));
                    } else {
                        zoVar.c(65, yg.a[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    zoVar.b(66, typedArray.getInt(index, 0));
                    break;
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    zoVar.a(67, typedArray.getFloat(index, zpVar.c.j));
                    break;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    zoVar.a(68, typedArray.getFloat(index, zpVar.b.e));
                    break;
                case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                    zoVar.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                    zoVar.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                    zoVar.b(72, typedArray.getInt(index, zpVar.d.ag));
                    break;
                case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                    zoVar.b(73, typedArray.getDimensionPixelSize(index, zpVar.d.ah));
                    break;
                case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                    zoVar.c(74, typedArray.getString(index));
                    break;
                case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                    zoVar.d(75, typedArray.getBoolean(index, zpVar.d.ao));
                    break;
                case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                    zoVar.b(76, typedArray.getInt(index, zpVar.c.f));
                    break;
                case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                    zoVar.c(77, typedArray.getString(index));
                    break;
                case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                    zoVar.b(78, typedArray.getInt(index, zpVar.b.c));
                    break;
                case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                    zoVar.a(79, typedArray.getFloat(index, zpVar.c.h));
                    break;
                case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                    zoVar.d(80, typedArray.getBoolean(index, zpVar.d.am));
                    break;
                case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                    zoVar.d(81, typedArray.getBoolean(index, zpVar.d.an));
                    break;
                case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                    zoVar.b(82, typedArray.getInteger(index, zpVar.c.d));
                    break;
                case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                    zoVar.b(83, a(typedArray, index, zpVar.e.j));
                    break;
                case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                    zoVar.b(84, typedArray.getInteger(index, zpVar.c.l));
                    break;
                case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                    zoVar.a(85, typedArray.getFloat(index, zpVar.c.k));
                    break;
                case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                    TypedValue typedValuePeekValue = typedArray.peekValue(index);
                    if (typedValuePeekValue.type == 1) {
                        zpVar.c.o = typedArray.getResourceId(index, -1);
                        zoVar.b(89, zpVar.c.o);
                        zr zrVar = zpVar.c;
                        if (zrVar.o != -1) {
                            zrVar.n = -2;
                            zoVar.b(88, -2);
                        }
                    } else if (typedValuePeekValue.type == 3) {
                        zpVar.c.m = typedArray.getString(index);
                        zoVar.c(90, zpVar.c.m);
                        if (zpVar.c.m.indexOf("/") > 0) {
                            zpVar.c.o = typedArray.getResourceId(index, -1);
                            zoVar.b(89, zpVar.c.o);
                            zpVar.c.n = -2;
                            zoVar.b(88, -2);
                        } else {
                            zpVar.c.n = -1;
                            zoVar.b(88, -1);
                        }
                    } else {
                        zr zrVar2 = zpVar.c;
                        zrVar2.n = typedArray.getInteger(index, zrVar2.o);
                        zoVar.b(88, zpVar.c.n);
                    }
                    break;
                case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + c.get(index));
                    break;
                case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                    zoVar.b(93, typedArray.getDimensionPixelSize(index, zpVar.d.M));
                    break;
                case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                    zoVar.b(94, typedArray.getDimensionPixelSize(index, zpVar.d.T));
                    break;
                case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                    e(zoVar, typedArray, index, 0);
                    break;
                case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                    e(zoVar, typedArray, index, 1);
                    break;
                case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                    zoVar.b(97, typedArray.getInt(index, zpVar.d.ap));
                    break;
                case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                    if (typedArray.peekValue(index).type == 3) {
                        typedArray.getString(index);
                    } else {
                        zpVar.a = typedArray.getResourceId(index, zpVar.a);
                    }
                    break;
            }
        }
    }

    public final void b(Context context, int i) {
        zu zuVar = this;
        ConstraintLayout constraintLayout = (ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        int childCount = constraintLayout.getChildCount();
        zuVar.b.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            zk zkVar = (zk) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            HashMap map = zuVar.b;
            Integer numValueOf = Integer.valueOf(id);
            if (!map.containsKey(numValueOf)) {
                zuVar.b.put(numValueOf, new zp());
            }
            zp zpVar = (zp) zuVar.b.get(numValueOf);
            if (zpVar != null) {
                HashMap map2 = zuVar.e;
                HashMap map3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : map2.keySet()) {
                    zh zhVar = (zh) map2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new zh(zhVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            try {
                                map3.put(str, new zh(zhVar, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException e) {
                                e = e;
                                e.printStackTrace();
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                e.printStackTrace();
                            } catch (InvocationTargetException e3) {
                                e = e3;
                                e.printStackTrace();
                            }
                        }
                    } catch (IllegalAccessException e4) {
                        e = e4;
                    } catch (NoSuchMethodException e5) {
                        e = e5;
                    } catch (InvocationTargetException e6) {
                        e = e6;
                    }
                }
                zpVar.f = map3;
                zpVar.a = id;
                zq zqVar = zpVar.d;
                zqVar.i = zkVar.d;
                zqVar.j = zkVar.e;
                zqVar.k = zkVar.f;
                zqVar.l = zkVar.g;
                zqVar.m = zkVar.h;
                zqVar.n = zkVar.i;
                zqVar.o = zkVar.j;
                zqVar.p = zkVar.k;
                zqVar.q = zkVar.l;
                zqVar.r = zkVar.m;
                zqVar.s = zkVar.n;
                zqVar.t = zkVar.r;
                zqVar.u = zkVar.s;
                zqVar.v = zkVar.t;
                zqVar.w = zkVar.u;
                zqVar.x = zkVar.D;
                zqVar.y = zkVar.E;
                zqVar.z = zkVar.F;
                zqVar.A = zkVar.o;
                zqVar.B = zkVar.p;
                zqVar.C = zkVar.q;
                zqVar.D = zkVar.S;
                zqVar.E = zkVar.T;
                zqVar.F = zkVar.U;
                zqVar.h = zkVar.c;
                zqVar.f = zkVar.a;
                zqVar.g = zkVar.b;
                zqVar.d = zkVar.width;
                zpVar.d.e = zkVar.height;
                zpVar.d.G = zkVar.leftMargin;
                zpVar.d.H = zkVar.rightMargin;
                zpVar.d.I = zkVar.topMargin;
                zpVar.d.J = zkVar.bottomMargin;
                zq zqVar2 = zpVar.d;
                zqVar2.M = zkVar.C;
                zqVar2.U = zkVar.H;
                zqVar2.V = zkVar.G;
                zqVar2.X = zkVar.J;
                zqVar2.W = zkVar.I;
                zqVar2.am = zkVar.V;
                zqVar2.an = zkVar.W;
                zqVar2.Y = zkVar.K;
                zqVar2.Z = zkVar.L;
                zqVar2.aa = zkVar.O;
                zqVar2.ab = zkVar.P;
                zqVar2.ac = zkVar.M;
                zqVar2.ad = zkVar.N;
                zqVar2.ae = zkVar.Q;
                zqVar2.af = zkVar.R;
                zqVar2.al = zkVar.X;
                zqVar2.O = zkVar.w;
                zqVar2.Q = zkVar.y;
                zqVar2.N = zkVar.v;
                zqVar2.P = zkVar.x;
                zqVar2.S = zkVar.z;
                zqVar2.R = zkVar.A;
                zqVar2.T = zkVar.B;
                zqVar2.ap = zkVar.Y;
                zqVar2.K = zkVar.getMarginEnd();
                zpVar.d.L = zkVar.getMarginStart();
                zpVar.b.b = childAt.getVisibility();
                zpVar.b.d = childAt.getAlpha();
                zpVar.e.c = childAt.getRotation();
                zpVar.e.d = childAt.getRotationX();
                zpVar.e.e = childAt.getRotationY();
                zpVar.e.f = childAt.getScaleX();
                zpVar.e.g = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    zt ztVar = zpVar.e;
                    ztVar.h = pivotX;
                    ztVar.i = pivotY;
                }
                zpVar.e.k = childAt.getTranslationX();
                zpVar.e.l = childAt.getTranslationY();
                zpVar.e.m = childAt.getTranslationZ();
                zt ztVar2 = zpVar.e;
                if (ztVar2.n) {
                    ztVar2.o = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    zq zqVar3 = zpVar.d;
                    zqVar3.ao = barrier.b.b;
                    zqVar3.aj = Arrays.copyOf(barrier.c, barrier.d);
                    zq zqVar4 = zpVar.d;
                    zqVar4.ag = barrier.a;
                    zqVar4.ah = barrier.b.c;
                }
            }
            i2++;
            zuVar = this;
        }
    }

    public final void c(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                switch (eventType) {
                    case 0:
                        xml.getName();
                        break;
                    case 2:
                        String name = xml.getName();
                        zp zpVarH = h(context, Xml.asAttributeSet(xml), false);
                        if (name.equalsIgnoreCase("Guideline")) {
                            zpVarH.d.b = true;
                        }
                        this.b.put(Integer.valueOf(zpVarH.a), zpVarH);
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX WARN: Code duplicated, block: B:65:0x00de  */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0022. Please report as an issue. */
    /* JADX WARN: Switch 'out' block B:296:0x0789 for B:25:0x004e already processed. Defaulting to fallback option. */
    public final void d(Context context, XmlPullParser xmlPullParser) {
        Object obj;
        try {
            int eventType = xmlPullParser.getEventType();
            zp zpVarH = null;
            while (true) {
                if (eventType != 1) {
                    int i = 2;
                    switch (eventType) {
                        case 0:
                            xmlPullParser.getName();
                            try {
                                eventType = xmlPullParser.next();
                            } catch (IOException e) {
                                e = e;
                            } catch (XmlPullParserException e2) {
                                e = e2;
                                e.printStackTrace();
                                return;
                            }
                            break;
                        case 1:
                        default:
                            eventType = xmlPullParser.next();
                            break;
                        case 2:
                            int i2 = 7;
                            switch (xmlPullParser.getName()) {
                                case "Constraint":
                                    zpVarH = h(context, Xml.asAttributeSet(xmlPullParser), false);
                                    eventType = xmlPullParser.next();
                                    break;
                                case "ConstraintOverride":
                                    zpVarH = h(context, Xml.asAttributeSet(xmlPullParser), true);
                                    eventType = xmlPullParser.next();
                                    break;
                                case "Guideline":
                                    zpVarH = h(context, Xml.asAttributeSet(xmlPullParser), false);
                                    zq zqVar = zpVarH.d;
                                    zqVar.b = true;
                                    zqVar.c = true;
                                    eventType = xmlPullParser.next();
                                    break;
                                case "Barrier":
                                    zpVarH = h(context, Xml.asAttributeSet(xmlPullParser), false);
                                    zpVarH.d.ai = 1;
                                    eventType = xmlPullParser.next();
                                    break;
                                case "PropertySet":
                                    if (zpVarH == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    zs zsVar = zpVarH.b;
                                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), zz.g);
                                    zsVar.a = true;
                                    int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                                    for (int i3 = 0; i3 < indexCount; i3++) {
                                        int index = typedArrayObtainStyledAttributes.getIndex(i3);
                                        if (index == 1) {
                                            zsVar.d = typedArrayObtainStyledAttributes.getFloat(1, zsVar.d);
                                        } else if (index == 0) {
                                            zsVar.b = typedArrayObtainStyledAttributes.getInt(0, zsVar.b);
                                            zsVar.b = a[zsVar.b];
                                        } else if (index == 4) {
                                            zsVar.c = typedArrayObtainStyledAttributes.getInt(4, zsVar.c);
                                        } else if (index == 3) {
                                            zsVar.e = typedArrayObtainStyledAttributes.getFloat(3, zsVar.e);
                                        }
                                    }
                                    typedArrayObtainStyledAttributes.recycle();
                                    eventType = xmlPullParser.next();
                                    break;
                                    break;
                                case "Transform":
                                    if (zpVarH == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    zt ztVar = zpVarH.e;
                                    TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), zz.i);
                                    ztVar.b = true;
                                    int indexCount2 = typedArrayObtainStyledAttributes2.getIndexCount();
                                    for (int i4 = 0; i4 < indexCount2; i4++) {
                                        int index2 = typedArrayObtainStyledAttributes2.getIndex(i4);
                                        switch (zt.a.get(index2)) {
                                            case 1:
                                                ztVar.c = typedArrayObtainStyledAttributes2.getFloat(index2, ztVar.c);
                                                break;
                                            case 2:
                                                ztVar.d = typedArrayObtainStyledAttributes2.getFloat(index2, ztVar.d);
                                                break;
                                            case 3:
                                                ztVar.e = typedArrayObtainStyledAttributes2.getFloat(index2, ztVar.e);
                                                break;
                                            case 4:
                                                ztVar.f = typedArrayObtainStyledAttributes2.getFloat(index2, ztVar.f);
                                                break;
                                            case 5:
                                                ztVar.g = typedArrayObtainStyledAttributes2.getFloat(index2, ztVar.g);
                                                break;
                                            case 6:
                                                ztVar.h = typedArrayObtainStyledAttributes2.getDimension(index2, ztVar.h);
                                                break;
                                            case 7:
                                                ztVar.i = typedArrayObtainStyledAttributes2.getDimension(index2, ztVar.i);
                                                break;
                                            case 8:
                                                ztVar.k = typedArrayObtainStyledAttributes2.getDimension(index2, ztVar.k);
                                                break;
                                            case 9:
                                                ztVar.l = typedArrayObtainStyledAttributes2.getDimension(index2, ztVar.l);
                                                break;
                                            case 10:
                                                ztVar.m = typedArrayObtainStyledAttributes2.getDimension(index2, ztVar.m);
                                                break;
                                            case 11:
                                                ztVar.n = true;
                                                ztVar.o = typedArrayObtainStyledAttributes2.getDimension(index2, ztVar.o);
                                                break;
                                            case 12:
                                                ztVar.j = a(typedArrayObtainStyledAttributes2, index2, ztVar.j);
                                                break;
                                        }
                                    }
                                    typedArrayObtainStyledAttributes2.recycle();
                                    eventType = xmlPullParser.next();
                                    break;
                                    break;
                                case "Layout":
                                    if (zpVarH == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    zq zqVar2 = zpVarH.d;
                                    TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), zz.e);
                                    zqVar2.c = true;
                                    int indexCount3 = typedArrayObtainStyledAttributes3.getIndexCount();
                                    for (int i5 = 0; i5 < indexCount3; i5++) {
                                        int index3 = typedArrayObtainStyledAttributes3.getIndex(i5);
                                        switch (zq.a.get(index3)) {
                                            case 1:
                                                zqVar2.q = a(typedArrayObtainStyledAttributes3, index3, zqVar2.q);
                                                break;
                                            case 2:
                                                zqVar2.J = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, zqVar2.J);
                                                break;
                                            case 3:
                                                zqVar2.p = a(typedArrayObtainStyledAttributes3, index3, zqVar2.p);
                                                break;
                                            case 4:
                                                zqVar2.o = a(typedArrayObtainStyledAttributes3, index3, zqVar2.o);
                                                break;
                                            case 5:
                                                zqVar2.z = typedArrayObtainStyledAttributes3.getString(index3);
                                                break;
                                            case 6:
                                                zqVar2.D = typedArrayObtainStyledAttributes3.getDimensionPixelOffset(index3, zqVar2.D);
                                                break;
                                            case 7:
                                                zqVar2.E = typedArrayObtainStyledAttributes3.getDimensionPixelOffset(index3, zqVar2.E);
                                                break;
                                            case 8:
                                                zqVar2.K = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, zqVar2.K);
                                                break;
                                            case 9:
                                                zqVar2.w = a(typedArrayObtainStyledAttributes3, index3, zqVar2.w);
                                                break;
                                            case 10:
                                                zqVar2.v = a(typedArrayObtainStyledAttributes3, index3, zqVar2.v);
                                                break;
                                            case 11:
                                                zqVar2.Q = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, zqVar2.Q);
                                                break;
                                            case 12:
                                                zqVar2.R = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, zqVar2.R);
                                                break;
                                            case 13:
                                                zqVar2.N = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, zqVar2.N);
                                                break;
                                            case 14:
                                                zqVar2.P = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, zqVar2.P);
                                                break;
                                            case 15:
                                                zqVar2.S = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, zqVar2.S);
                                                break;
                                            case 16:
                                                zqVar2.O = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, zqVar2.O);
                                                break;
                                            case 17:
                                                zqVar2.f = typedArrayObtainStyledAttributes3.getDimensionPixelOffset(index3, zqVar2.f);
                                                break;
                                            case 18:
                                                zqVar2.g = typedArrayObtainStyledAttributes3.getDimensionPixelOffset(index3, zqVar2.g);
                                                break;
                                            case 19:
                                                zqVar2.h = typedArrayObtainStyledAttributes3.getFloat(index3, zqVar2.h);
                                                break;
                                            case 20:
                                                zqVar2.x = typedArrayObtainStyledAttributes3.getFloat(index3, zqVar2.x);
                                                break;
                                            case 21:
                                                zqVar2.e = typedArrayObtainStyledAttributes3.getLayoutDimension(index3, zqVar2.e);
                                                break;
                                            case 22:
                                                zqVar2.d = typedArrayObtainStyledAttributes3.getLayoutDimension(index3, zqVar2.d);
                                                break;
                                            case 23:
                                                zqVar2.G = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, zqVar2.G);
                                                break;
                                            case 24:
                                                zqVar2.i = a(typedArrayObtainStyledAttributes3, index3, zqVar2.i);
                                                break;
                                            case 25:
                                                zqVar2.j = a(typedArrayObtainStyledAttributes3, index3, zqVar2.j);
                                                break;
                                            case 26:
                                                zqVar2.F = typedArrayObtainStyledAttributes3.getInt(index3, zqVar2.F);
                                                break;
                                            case 27:
                                                zqVar2.H = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, zqVar2.H);
                                                break;
                                            case 28:
                                                zqVar2.k = a(typedArrayObtainStyledAttributes3, index3, zqVar2.k);
                                                break;
                                            case 29:
                                                zqVar2.l = a(typedArrayObtainStyledAttributes3, index3, zqVar2.l);
                                                break;
                                            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                                                zqVar2.L = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, zqVar2.L);
                                                break;
                                            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                                                zqVar2.t = a(typedArrayObtainStyledAttributes3, index3, zqVar2.t);
                                                break;
                                            case 32:
                                                zqVar2.u = a(typedArrayObtainStyledAttributes3, index3, zqVar2.u);
                                                break;
                                            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                                                zqVar2.I = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, zqVar2.I);
                                                break;
                                            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                                                zqVar2.n = a(typedArrayObtainStyledAttributes3, index3, zqVar2.n);
                                                break;
                                            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                                                zqVar2.m = a(typedArrayObtainStyledAttributes3, index3, zqVar2.m);
                                                break;
                                            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                                                zqVar2.y = typedArrayObtainStyledAttributes3.getFloat(index3, zqVar2.y);
                                                break;
                                            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                zqVar2.V = typedArrayObtainStyledAttributes3.getFloat(index3, zqVar2.V);
                                                break;
                                            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                zqVar2.U = typedArrayObtainStyledAttributes3.getFloat(index3, zqVar2.U);
                                                break;
                                            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                zqVar2.W = typedArrayObtainStyledAttributes3.getInt(index3, zqVar2.W);
                                                break;
                                            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                                                zqVar2.X = typedArrayObtainStyledAttributes3.getInt(index3, zqVar2.X);
                                                break;
                                            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                                                e(zqVar2, typedArrayObtainStyledAttributes3, index3, 0);
                                                break;
                                            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                                                e(zqVar2, typedArrayObtainStyledAttributes3, index3, 1);
                                                break;
                                            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                                            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                                            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                                            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                                            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                                            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                                            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                                            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                                            case 64:
                                            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                                            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                                            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                                            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                                            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                                            case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                                            case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                                            case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                                            case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                                            case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                                            case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                                            case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                                            case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                                            case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                                            case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                                            case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                                            case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                                            default:
                                                Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index3) + "   " + zq.a.get(index3));
                                                break;
                                            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                                                zqVar2.Y = typedArrayObtainStyledAttributes3.getInt(index3, zqVar2.Y);
                                                break;
                                            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                                                zqVar2.Z = typedArrayObtainStyledAttributes3.getInt(index3, zqVar2.Z);
                                                break;
                                            case R.styleable.AppCompatTheme_colorError /* 56 */:
                                                zqVar2.aa = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, zqVar2.aa);
                                                break;
                                            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                                                zqVar2.ab = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, zqVar2.ab);
                                                break;
                                            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                                                zqVar2.ac = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, zqVar2.ac);
                                                break;
                                            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                                                zqVar2.ad = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, zqVar2.ad);
                                                break;
                                            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                                                zqVar2.A = a(typedArrayObtainStyledAttributes3, index3, zqVar2.A);
                                                break;
                                            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                                                zqVar2.B = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, zqVar2.B);
                                                break;
                                            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                                                zqVar2.C = typedArrayObtainStyledAttributes3.getFloat(index3, zqVar2.C);
                                                break;
                                            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                                                zqVar2.ae = typedArrayObtainStyledAttributes3.getFloat(index3, 1.0f);
                                                break;
                                            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                                                zqVar2.af = typedArrayObtainStyledAttributes3.getFloat(index3, 1.0f);
                                                break;
                                            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                                                Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                break;
                                            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                                                zqVar2.ag = typedArrayObtainStyledAttributes3.getInt(index3, zqVar2.ag);
                                                break;
                                            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                                                zqVar2.ah = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, zqVar2.ah);
                                                break;
                                            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                                                zqVar2.ak = typedArrayObtainStyledAttributes3.getString(index3);
                                                break;
                                            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                                                zqVar2.ao = typedArrayObtainStyledAttributes3.getBoolean(index3, zqVar2.ao);
                                                break;
                                            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                                                Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index3) + "   " + zq.a.get(index3));
                                                break;
                                            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                                                zqVar2.al = typedArrayObtainStyledAttributes3.getString(index3);
                                                break;
                                            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                                                zqVar2.am = typedArrayObtainStyledAttributes3.getBoolean(index3, zqVar2.am);
                                                break;
                                            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                                                zqVar2.an = typedArrayObtainStyledAttributes3.getBoolean(index3, zqVar2.an);
                                                break;
                                            case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                                                zqVar2.r = a(typedArrayObtainStyledAttributes3, index3, zqVar2.r);
                                                break;
                                            case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                                                zqVar2.s = a(typedArrayObtainStyledAttributes3, index3, zqVar2.s);
                                                break;
                                            case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                                                zqVar2.M = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, zqVar2.M);
                                                break;
                                            case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                                                zqVar2.T = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, zqVar2.T);
                                                break;
                                            case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                                                zqVar2.ap = typedArrayObtainStyledAttributes3.getInt(index3, zqVar2.ap);
                                                break;
                                        }
                                    }
                                    typedArrayObtainStyledAttributes3.recycle();
                                    eventType = xmlPullParser.next();
                                    break;
                                    break;
                                case "Motion":
                                    if (zpVarH == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    zr zrVar = zpVarH.c;
                                    TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), zz.f);
                                    zrVar.b = true;
                                    int indexCount4 = typedArrayObtainStyledAttributes4.getIndexCount();
                                    for (int i6 = 0; i6 < indexCount4; i6++) {
                                        int index4 = typedArrayObtainStyledAttributes4.getIndex(i6);
                                        switch (zr.a.get(index4)) {
                                            case 1:
                                                zrVar.j = typedArrayObtainStyledAttributes4.getFloat(index4, zrVar.j);
                                                break;
                                            case 2:
                                                zrVar.f = typedArrayObtainStyledAttributes4.getInt(index4, zrVar.f);
                                                break;
                                            case 3:
                                                if (typedArrayObtainStyledAttributes4.peekValue(index4).type == 3) {
                                                    zrVar.e = typedArrayObtainStyledAttributes4.getString(index4);
                                                } else {
                                                    zrVar.e = yg.a[typedArrayObtainStyledAttributes4.getInteger(index4, 0)];
                                                }
                                                break;
                                            case 4:
                                                zrVar.g = typedArrayObtainStyledAttributes4.getInt(index4, 0);
                                                break;
                                            case 5:
                                                zrVar.c = a(typedArrayObtainStyledAttributes4, index4, zrVar.c);
                                                break;
                                            case 6:
                                                zrVar.d = typedArrayObtainStyledAttributes4.getInteger(index4, zrVar.d);
                                                break;
                                            case 7:
                                                zrVar.h = typedArrayObtainStyledAttributes4.getFloat(index4, zrVar.h);
                                                break;
                                            case 8:
                                                zrVar.l = typedArrayObtainStyledAttributes4.getInteger(index4, zrVar.l);
                                                break;
                                            case 9:
                                                zrVar.k = typedArrayObtainStyledAttributes4.getFloat(index4, zrVar.k);
                                                break;
                                            case 10:
                                                TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(index4);
                                                if (typedValuePeekValue.type == 1) {
                                                    int resourceId = typedArrayObtainStyledAttributes4.getResourceId(index4, -1);
                                                    zrVar.o = resourceId;
                                                    if (resourceId != -1) {
                                                        zrVar.n = -2;
                                                    }
                                                } else if (typedValuePeekValue.type == 3) {
                                                    zrVar.m = typedArrayObtainStyledAttributes4.getString(index4);
                                                    if (zrVar.m.indexOf("/") > 0) {
                                                        zrVar.o = typedArrayObtainStyledAttributes4.getResourceId(index4, -1);
                                                        zrVar.n = -2;
                                                    } else {
                                                        zrVar.n = -1;
                                                    }
                                                } else {
                                                    zrVar.n = typedArrayObtainStyledAttributes4.getInteger(index4, zrVar.o);
                                                }
                                                break;
                                        }
                                    }
                                    typedArrayObtainStyledAttributes4.recycle();
                                    eventType = xmlPullParser.next();
                                    break;
                                    break;
                                case "CustomAttribute":
                                case "CustomMethod":
                                    if (zpVarH == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    HashMap map = zpVarH.f;
                                    TypedArray typedArrayObtainStyledAttributes5 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), zz.d);
                                    int indexCount5 = typedArrayObtainStyledAttributes5.getIndexCount();
                                    int i7 = 0;
                                    String string = null;
                                    Object objValueOf = null;
                                    int i8 = 0;
                                    boolean z = false;
                                    while (i7 < indexCount5) {
                                        int index5 = typedArrayObtainStyledAttributes5.getIndex(i7);
                                        if (index5 == 0) {
                                            String string2 = typedArrayObtainStyledAttributes5.getString(0);
                                            string = (string2 == null || string2.length() <= 0) ? string2 : Character.toUpperCase(string2.charAt(0)) + string2.substring(1);
                                        } else if (index5 == 10) {
                                            string = typedArrayObtainStyledAttributes5.getString(10);
                                            z = true;
                                        } else if (index5 == 1) {
                                            objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes5.getBoolean(1, false));
                                            i8 = 6;
                                        } else if (index5 == 3) {
                                            objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes5.getColor(3, 0));
                                            i8 = 3;
                                        } else if (index5 == i) {
                                            objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes5.getColor(i, 0));
                                            i8 = 4;
                                        } else if (index5 == i2) {
                                            objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes5.getDimension(i2, 0.0f), context.getResources().getDisplayMetrics()));
                                            i8 = 7;
                                        } else if (index5 == 4) {
                                            objValueOf = Float.valueOf(typedArrayObtainStyledAttributes5.getDimension(4, 0.0f));
                                            i8 = 7;
                                        } else if (index5 == 5) {
                                            objValueOf = Float.valueOf(typedArrayObtainStyledAttributes5.getFloat(5, Float.NaN));
                                            i8 = 2;
                                        } else if (index5 == 6) {
                                            objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes5.getInteger(6, -1));
                                            i8 = 1;
                                        } else if (index5 == 9) {
                                            objValueOf = typedArrayObtainStyledAttributes5.getString(9);
                                            i8 = 5;
                                        } else if (index5 == 8) {
                                            int resourceId2 = typedArrayObtainStyledAttributes5.getResourceId(8, -1);
                                            if (resourceId2 == -1) {
                                                resourceId2 = typedArrayObtainStyledAttributes5.getInt(8, -1);
                                            }
                                            objValueOf = Integer.valueOf(resourceId2);
                                            i8 = 8;
                                        }
                                        i7++;
                                        i2 = 7;
                                        i = 2;
                                    }
                                    String str = string;
                                    if (str != null && (obj = objValueOf) != null) {
                                        map.put(str, new zh(str, i8, obj, z));
                                    }
                                    typedArrayObtainStyledAttributes5.recycle();
                                    eventType = xmlPullParser.next();
                                    break;
                                    break;
                                default:
                                    eventType = xmlPullParser.next();
                                    break;
                            }
                            break;
                        case 3:
                            switch (xmlPullParser.getName().toLowerCase(Locale.ROOT)) {
                                case "constraintset":
                                    return;
                                case "constraint":
                                case "constraintoverride":
                                case "guideline":
                                    this.b.put(Integer.valueOf(zpVarH.a), zpVarH);
                                    zpVarH = null;
                                    eventType = xmlPullParser.next();
                                    break;
                                default:
                                    eventType = xmlPullParser.next();
                                    break;
                            }
                            break;
                    }
                } else {
                    return;
                }
                e.printStackTrace();
                return;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (XmlPullParserException e4) {
            e = e4;
        }
    }
}
