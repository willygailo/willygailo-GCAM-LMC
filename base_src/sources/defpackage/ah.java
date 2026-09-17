package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import com.google.android.apps.camera.bottombar.R;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class ah {
    private static final int[] a = {0, 4, 8};
    private static final SparseIntArray b;
    private final HashMap c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        b = sparseIntArray;
        int[] iArr = ai.a;
        sparseIntArray.append(84, 25);
        sparseIntArray.append(85, 26);
        sparseIntArray.append(87, 29);
        sparseIntArray.append(88, 30);
        sparseIntArray.append(94, 36);
        sparseIntArray.append(93, 35);
        sparseIntArray.append(66, 4);
        sparseIntArray.append(65, 3);
        sparseIntArray.append(61, 1);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 6);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceListItem, 7);
        sparseIntArray.append(73, 17);
        sparseIntArray.append(74, 18);
        sparseIntArray.append(75, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(89, 32);
        sparseIntArray.append(90, 33);
        sparseIntArray.append(72, 10);
        sparseIntArray.append(71, 9);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 13);
        sparseIntArray.append(R.styleable.AppCompatTheme_textColorAlertDialogListItem, 16);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, 14);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceListItemSmall, 11);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu, 15);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, 12);
        sparseIntArray.append(97, 40);
        sparseIntArray.append(82, 39);
        sparseIntArray.append(81, 41);
        sparseIntArray.append(96, 42);
        sparseIntArray.append(80, 20);
        sparseIntArray.append(95, 37);
        sparseIntArray.append(70, 5);
        sparseIntArray.append(83, 60);
        sparseIntArray.append(92, 60);
        sparseIntArray.append(86, 60);
        sparseIntArray.append(64, 60);
        sparseIntArray.append(60, 60);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(25, 31);
        sparseIntArray.append(26, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(15, 43);
        sparseIntArray.append(28, 44);
        sparseIntArray.append(23, 45);
        sparseIntArray.append(24, 46);
        sparseIntArray.append(20, 47);
        sparseIntArray.append(21, 48);
        sparseIntArray.append(16, 49);
        sparseIntArray.append(17, 50);
        sparseIntArray.append(18, 51);
        sparseIntArray.append(19, 52);
        sparseIntArray.append(27, 53);
        sparseIntArray.append(98, 54);
        sparseIntArray.append(76, 55);
        sparseIntArray.append(99, 56);
        sparseIntArray.append(77, 57);
        sparseIntArray.append(100, 58);
        sparseIntArray.append(78, 59);
        sparseIntArray.append(1, 38);
    }

    private static int i(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    private static final String j(int i) {
        switch (i) {
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            default:
                return "end";
        }
    }

    public final ag a(int i) {
        HashMap map = this.c;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            this.c.put(numValueOf, new ag());
        }
        return (ag) this.c.get(numValueOf);
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.c = null;
    }

    public final void c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.c.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            HashMap map = this.c;
            Integer numValueOf = Integer.valueOf(id);
            if (map.containsKey(numValueOf)) {
                hashSet.remove(numValueOf);
                ag agVar = (ag) this.c.get(numValueOf);
                af afVar = (af) childAt.getLayoutParams();
                agVar.a(afVar);
                childAt.setLayoutParams(afVar);
                childAt.setVisibility(agVar.G);
                childAt.setAlpha(agVar.R);
                childAt.setRotationX(agVar.U);
                childAt.setRotationY(agVar.V);
                childAt.setScaleX(agVar.W);
                childAt.setScaleY(agVar.X);
                childAt.setPivotX(agVar.Y);
                childAt.setPivotY(agVar.Z);
                childAt.setTranslationX(agVar.aa);
                childAt.setTranslationY(agVar.ab);
                childAt.setTranslationZ(agVar.ac);
                if (agVar.S) {
                    childAt.setElevation(agVar.T);
                }
            }
        }
        for (Integer num : hashSet) {
            ag agVar2 = (ag) this.c.get(num);
            if (agVar2.a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                af afVarGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                agVar2.a(afVarGenerateDefaultLayoutParams);
                constraintLayout.addView(guideline, afVarGenerateDefaultLayoutParams);
            }
        }
    }

    public final void d(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.c.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            af afVar = (af) childAt.getLayoutParams();
            int id = childAt.getId();
            HashMap map = this.c;
            Integer numValueOf = Integer.valueOf(id);
            if (!map.containsKey(numValueOf)) {
                this.c.put(numValueOf, new ag());
            }
            ag agVar = (ag) this.c.get(numValueOf);
            agVar.d = id;
            agVar.h = afVar.d;
            agVar.i = afVar.e;
            agVar.j = afVar.f;
            agVar.k = afVar.g;
            agVar.l = afVar.h;
            agVar.m = afVar.i;
            agVar.n = afVar.j;
            agVar.o = afVar.k;
            agVar.p = afVar.l;
            agVar.q = afVar.m;
            agVar.r = afVar.n;
            agVar.s = afVar.o;
            agVar.t = afVar.p;
            agVar.u = afVar.w;
            agVar.v = afVar.x;
            agVar.w = afVar.y;
            agVar.x = afVar.K;
            agVar.y = afVar.L;
            agVar.z = afVar.M;
            agVar.g = afVar.c;
            agVar.e = afVar.a;
            agVar.f = afVar.b;
            agVar.b = afVar.width;
            agVar.c = afVar.height;
            agVar.A = afVar.leftMargin;
            agVar.B = afVar.rightMargin;
            agVar.C = afVar.topMargin;
            agVar.D = afVar.bottomMargin;
            agVar.N = afVar.B;
            agVar.O = afVar.A;
            agVar.Q = afVar.D;
            agVar.P = afVar.C;
            agVar.ad = afVar.E;
            agVar.ae = afVar.F;
            agVar.af = afVar.I;
            agVar.ag = afVar.J;
            agVar.ah = afVar.G;
            agVar.ai = afVar.H;
            agVar.E = afVar.getMarginEnd();
            agVar.F = afVar.getMarginStart();
            agVar.G = childAt.getVisibility();
            agVar.R = childAt.getAlpha();
            agVar.U = childAt.getRotationX();
            agVar.V = childAt.getRotationY();
            agVar.W = childAt.getScaleX();
            agVar.X = childAt.getScaleY();
            agVar.Y = childAt.getPivotX();
            agVar.Z = childAt.getPivotY();
            agVar.aa = childAt.getTranslationX();
            agVar.ab = childAt.getTranslationY();
            agVar.ac = childAt.getTranslationZ();
            if (agVar.S) {
                agVar.T = childAt.getElevation();
            }
        }
    }

    public final void e(int i, int i2, int i3, int i4, int i5) {
        HashMap map = this.c;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            this.c.put(numValueOf, new ag());
        }
        ag agVar = (ag) this.c.get(numValueOf);
        switch (i2) {
            case 3:
                if (i4 == 3) {
                    agVar.l = i3;
                    agVar.m = -1;
                    agVar.p = -1;
                } else {
                    if (i4 != 4) {
                        throw new IllegalArgumentException("right to " + j(i4) + " undefined");
                    }
                    agVar.m = i3;
                    agVar.l = -1;
                    agVar.p = -1;
                }
                agVar.C = i5;
                return;
            case 4:
                if (i4 == 4) {
                    agVar.o = i3;
                    agVar.n = -1;
                    agVar.p = -1;
                } else {
                    if (i4 != 3) {
                        throw new IllegalArgumentException("right to " + j(i4) + " undefined");
                    }
                    agVar.n = i3;
                    agVar.o = -1;
                    agVar.p = -1;
                }
                agVar.D = i5;
                return;
            case 5:
                if (i4 != 5) {
                    throw new IllegalArgumentException("right to " + j(i4) + " undefined");
                }
                agVar.p = i3;
                agVar.o = -1;
                agVar.n = -1;
                agVar.l = -1;
                agVar.m = -1;
                return;
            case 6:
                if (i4 == 6) {
                    agVar.r = i3;
                    agVar.q = -1;
                } else {
                    if (i4 != 7) {
                        throw new IllegalArgumentException("right to " + j(i4) + " undefined");
                    }
                    agVar.q = i3;
                    agVar.r = -1;
                }
                agVar.F = i5;
                return;
            default:
                if (i4 == 7) {
                    agVar.t = i3;
                    agVar.s = -1;
                } else {
                    if (i4 != 6) {
                        throw new IllegalArgumentException("right to " + j(i4) + " undefined");
                    }
                    agVar.s = i3;
                    agVar.t = -1;
                }
                agVar.E = i5;
                return;
        }
    }

    public final void f(int i, int i2) {
        a(i).c = i2;
    }

    public final void g(int i, int i2) {
        a(i).b = i2;
    }

    public final void h(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                switch (eventType) {
                    case 0:
                        xml.getName();
                        break;
                    case 2:
                        String name = xml.getName();
                        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                        ag agVar = new ag();
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, ai.b);
                        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                        for (int i2 = 0; i2 < indexCount; i2++) {
                            int index = typedArrayObtainStyledAttributes.getIndex(i2);
                            SparseIntArray sparseIntArray = b;
                            switch (sparseIntArray.get(index)) {
                                case 1:
                                    agVar.p = i(typedArrayObtainStyledAttributes, index, agVar.p);
                                    break;
                                case 2:
                                    agVar.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, agVar.D);
                                    break;
                                case 3:
                                    agVar.o = i(typedArrayObtainStyledAttributes, index, agVar.o);
                                    break;
                                case 4:
                                    agVar.n = i(typedArrayObtainStyledAttributes, index, agVar.n);
                                    break;
                                case 5:
                                    agVar.w = typedArrayObtainStyledAttributes.getString(index);
                                    break;
                                case 6:
                                    agVar.x = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, agVar.x);
                                    break;
                                case 7:
                                    agVar.y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, agVar.y);
                                    break;
                                case 8:
                                    agVar.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, agVar.E);
                                    break;
                                case 9:
                                    agVar.n = i(typedArrayObtainStyledAttributes, index, agVar.t);
                                    break;
                                case 10:
                                    agVar.s = i(typedArrayObtainStyledAttributes, index, agVar.s);
                                    break;
                                case 11:
                                    agVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, agVar.K);
                                    break;
                                case 12:
                                    agVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, agVar.L);
                                    break;
                                case 13:
                                    agVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, agVar.H);
                                    break;
                                case 14:
                                    agVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, agVar.J);
                                    break;
                                case 15:
                                    agVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, agVar.M);
                                    break;
                                case 16:
                                    agVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, agVar.I);
                                    break;
                                case 17:
                                    agVar.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, agVar.e);
                                    break;
                                case 18:
                                    agVar.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, agVar.f);
                                    break;
                                case 19:
                                    agVar.g = typedArrayObtainStyledAttributes.getFloat(index, agVar.g);
                                    break;
                                case 20:
                                    agVar.u = typedArrayObtainStyledAttributes.getFloat(index, agVar.u);
                                    break;
                                case 21:
                                    agVar.c = typedArrayObtainStyledAttributes.getLayoutDimension(index, agVar.c);
                                    break;
                                case 22:
                                    agVar.G = typedArrayObtainStyledAttributes.getInt(index, agVar.G);
                                    agVar.G = a[agVar.G];
                                    break;
                                case 23:
                                    agVar.b = typedArrayObtainStyledAttributes.getLayoutDimension(index, agVar.b);
                                    break;
                                case 24:
                                    agVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, agVar.A);
                                    break;
                                case 25:
                                    agVar.h = i(typedArrayObtainStyledAttributes, index, agVar.h);
                                    break;
                                case 26:
                                    agVar.i = i(typedArrayObtainStyledAttributes, index, agVar.i);
                                    break;
                                case 27:
                                    agVar.z = typedArrayObtainStyledAttributes.getInt(index, agVar.z);
                                    break;
                                case 28:
                                    agVar.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, agVar.B);
                                    break;
                                case 29:
                                    agVar.j = i(typedArrayObtainStyledAttributes, index, agVar.j);
                                    break;
                                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                                    agVar.k = i(typedArrayObtainStyledAttributes, index, agVar.k);
                                    break;
                                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                                    agVar.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, agVar.F);
                                    break;
                                case 32:
                                    agVar.q = i(typedArrayObtainStyledAttributes, index, agVar.q);
                                    break;
                                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                                    agVar.r = i(typedArrayObtainStyledAttributes, index, agVar.r);
                                    break;
                                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                                    agVar.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, agVar.C);
                                    break;
                                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                                    agVar.m = i(typedArrayObtainStyledAttributes, index, agVar.m);
                                    break;
                                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                                    agVar.l = i(typedArrayObtainStyledAttributes, index, agVar.l);
                                    break;
                                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                    agVar.v = typedArrayObtainStyledAttributes.getFloat(index, agVar.v);
                                    break;
                                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                    agVar.d = typedArrayObtainStyledAttributes.getResourceId(index, agVar.d);
                                    break;
                                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                    agVar.O = typedArrayObtainStyledAttributes.getFloat(index, agVar.O);
                                    break;
                                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                                    agVar.N = typedArrayObtainStyledAttributes.getFloat(index, agVar.N);
                                    break;
                                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                                    agVar.P = typedArrayObtainStyledAttributes.getInt(index, agVar.P);
                                    break;
                                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                                    agVar.Q = typedArrayObtainStyledAttributes.getInt(index, agVar.Q);
                                    break;
                                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                                    agVar.R = typedArrayObtainStyledAttributes.getFloat(index, agVar.R);
                                    break;
                                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                                    agVar.S = true;
                                    agVar.T = typedArrayObtainStyledAttributes.getFloat(index, agVar.T);
                                    break;
                                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                    agVar.U = typedArrayObtainStyledAttributes.getFloat(index, agVar.U);
                                    break;
                                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                    agVar.V = typedArrayObtainStyledAttributes.getFloat(index, agVar.V);
                                    break;
                                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                    agVar.W = typedArrayObtainStyledAttributes.getFloat(index, agVar.W);
                                    break;
                                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                                    agVar.X = typedArrayObtainStyledAttributes.getFloat(index, agVar.X);
                                    break;
                                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                    agVar.Y = typedArrayObtainStyledAttributes.getFloat(index, agVar.Y);
                                    break;
                                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                                    agVar.Z = typedArrayObtainStyledAttributes.getFloat(index, agVar.Z);
                                    break;
                                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                                    agVar.aa = typedArrayObtainStyledAttributes.getFloat(index, agVar.aa);
                                    break;
                                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                                    agVar.ab = typedArrayObtainStyledAttributes.getFloat(index, agVar.ab);
                                    break;
                                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                                    agVar.ac = typedArrayObtainStyledAttributes.getFloat(index, agVar.ac);
                                    break;
                                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                                case R.styleable.AppCompatTheme_colorError /* 56 */:
                                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                            }
                        }
                        typedArrayObtainStyledAttributes.recycle();
                        if (name.equalsIgnoreCase("Guideline")) {
                            agVar.a = true;
                        }
                        this.c.put(Integer.valueOf(agVar.d), agVar);
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }
}
