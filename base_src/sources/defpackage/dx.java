package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.google.android.GoogleCameraEngR18F1.R;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class dx {
    private static final ThreadLocal a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                return b(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:133:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:75:0x0137  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        int i;
        float f;
        float f2;
        dv dvVar;
        Object[] objArr;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r4 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int i2 = 0;
        int[][] iArr = new int[20][];
        int i3 = 0;
        int[] iArr2 = new int[20];
        while (true) {
            int next = xmlPullParser.next();
            if (next == r4 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr3 = ae.a;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr3) : theme.obtainStyledAttributes(attributeSet, iArr3, i2, i2);
                int resourceId = typedArrayObtainAttributes.getResourceId(i2, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = a;
                    TypedValue typedValue = (TypedValue) threadLocal.get();
                    if (typedValue == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    }
                    resources.getValue(resourceId, typedValue, (boolean) r4);
                    if (typedValue.type < 28 || typedValue.type > 31) {
                        try {
                            color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception e) {
                            color = typedArrayObtainAttributes.getColor(i2, -65281);
                        }
                    } else {
                        color = typedArrayObtainAttributes.getColor(i2, -65281);
                    }
                } else {
                    color = typedArrayObtainAttributes.getColor(i2, -65281);
                }
                float f3 = typedArrayObtainAttributes.hasValue(r4) ? typedArrayObtainAttributes.getFloat(r4, 1.0f) : typedArrayObtainAttributes.hasValue(3) ? typedArrayObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                float f4 = typedArrayObtainAttributes.hasValue(2) ? typedArrayObtainAttributes.getFloat(2, -1.0f) : typedArrayObtainAttributes.getFloat(4, -1.0f);
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr4 = new int[attributeCount];
                int i4 = 0;
                for (int i5 = 0; i5 < attributeCount; i5++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i5);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i6 = i4 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i5, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr4[i4] = attributeNameResource;
                        i4 = i6;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr4, i4);
                boolean z = f4 >= 0.0f && f4 <= 100.0f;
                if (f3 != 1.0f) {
                    int iD = aao.d((int) ((Color.alpha(color) * f3) + 0.5f), 0, 255);
                    if (z) {
                        dv dvVarB = dv.b(color);
                        float f5 = dvVarB.a;
                        f = dvVarB.b;
                        ej ejVar = ej.a;
                        i = depth2;
                        if (f < 1.0d && Math.round(f4) > 0.0d && Math.round(f4) < 100.0d) {
                            float fMin = f5 < 0.0f ? 0.0f : Math.min(360.0f, f5);
                            float f6 = f;
                            dv dvVar2 = null;
                            boolean z2 = true;
                            float f7 = 0.0f;
                            while (true) {
                                if (Math.abs(f7 - f) < 0.4f) {
                                    iArr = iArr;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    if (dvVar2 != null) {
                                        color = dvVar2.a(ejVar);
                                        break;
                                    }
                                    color = dw.b(f4);
                                    break;
                                }
                                float f8 = 1000.0f;
                                float f9 = 1000.0f;
                                float f10 = 0.0f;
                                float f11 = 100.0f;
                                dv dvVar3 = null;
                                while (true) {
                                    if (Math.abs(f10 - f11) <= 0.01f) {
                                        fMin = fMin;
                                        iArr = iArr;
                                        f2 = f6;
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        dvVar = dvVar3;
                                        break;
                                    }
                                    float f12 = f10 + ((f11 - f10) / 2.0f);
                                    int iA = dv.c(f12, f6, fMin).a(ej.a);
                                    float fA = dw.a(Color.red(iA));
                                    float fA2 = dw.a(Color.green(iA));
                                    float fA3 = dw.a(Color.blue(iA));
                                    float[] fArr = dw.d[1];
                                    float f13 = (((fA * fArr[0]) + (fA2 * fArr[1])) + (fA3 * fArr[2])) / 100.0f;
                                    float fCbrt = f13 <= 0.008856452f ? f13 * 903.2963f : (((float) Math.cbrt(f13)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f4 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        dv dvVarB2 = dv.b(iA);
                                        dv dvVarC = dv.c(dvVarB2.c, dvVarB2.b, fMin);
                                        fMin = fMin;
                                        float f14 = dvVarB2.d - dvVarC.d;
                                        f2 = f6;
                                        float f15 = dvVarB2.e - dvVarC.e;
                                        float f16 = dvVarB2.f - dvVarC.f;
                                        double dSqrt = Math.sqrt((f14 * f14) + (f15 * f15) + (f16 * f16));
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        float fPow = (float) (Math.pow(dSqrt, 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            f8 = fPow;
                                            dvVar3 = dvVarB2;
                                            f9 = fAbs;
                                        }
                                    } else {
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        fMin = fMin;
                                        f2 = f6;
                                    }
                                    if (f9 == 0.0f && f8 == 0.0f) {
                                        dvVar = dvVar3;
                                        break;
                                    }
                                    if (fCbrt >= f4) {
                                        f11 = f12;
                                    }
                                    if (fCbrt < f4) {
                                        f10 = f12;
                                    }
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    iArr = iArr;
                                    fMin = fMin;
                                    f6 = f2;
                                }
                                if (!z2) {
                                    if (dvVar != null) {
                                        dvVar2 = dvVar;
                                    }
                                    if (dvVar != null) {
                                        f7 = f2;
                                    }
                                    if (dvVar == null) {
                                        f = f2;
                                    }
                                    f6 = f7 + ((f - f7) / 2.0f);
                                } else {
                                    if (dvVar != null) {
                                        color = dvVar.a(ejVar);
                                        break;
                                    }
                                    f6 = f7 + ((f - f7) / 2.0f);
                                    z2 = false;
                                }
                            }
                        } else {
                            color = dw.b(f4);
                        }
                    } else {
                        i = depth2;
                        iArr = iArr;
                        iArrTrimStateSet = iArrTrimStateSet;
                    }
                    color = (color & 16777215) | (iD << 24);
                } else if (z) {
                    z = true;
                    int iD2 = aao.d((int) ((Color.alpha(color) * f3) + 0.5f), 0, 255);
                    if (z) {
                        dv dvVarB3 = dv.b(color);
                        float f17 = dvVarB3.a;
                        f = dvVarB3.b;
                        ej ejVar2 = ej.a;
                        i = depth2;
                        if (f < 1.0d) {
                        }
                        color = dw.b(f4);
                    } else {
                        i = depth2;
                        iArr = iArr;
                        iArrTrimStateSet = iArrTrimStateSet;
                    }
                    color = (color & 16777215) | (iD2 << 24);
                } else {
                    i = depth2;
                    iArr = iArr;
                    iArrTrimStateSet = iArrTrimStateSet;
                }
                int i7 = i3 + 1;
                if (i7 > iArr2.length) {
                    int[] iArr5 = new int[et.G(i3)];
                    System.arraycopy(iArr2, 0, iArr5, 0, i3);
                    iArr2 = iArr5;
                }
                iArr2[i3] = color;
                int[][] iArr6 = iArr;
                if (i7 > iArr6.length) {
                    objArr = (Object[]) Array.newInstance(iArr6.getClass().getComponentType(), et.G(i3));
                    System.arraycopy(iArr6, 0, objArr, 0, i3);
                } else {
                    objArr = iArr6;
                }
                objArr[i3] = iArrTrimStateSet;
                iArr = (int[][]) objArr;
                i3 = i7;
                depth2 = i;
                r4 = 1;
                i2 = 0;
            } else {
                iArr = iArr;
                depth2 = depth2;
                r4 = 1;
                i2 = 0;
            }
        }
        int[] iArr7 = new int[i3];
        int[][] iArr8 = new int[i3][];
        System.arraycopy(iArr2, 0, iArr7, 0, i3);
        System.arraycopy(iArr, 0, iArr8, 0, i3);
        return new ColorStateList(iArr8, iArr7);
    }

    public static ColorStateList c(Resources resources, int i, Resources.Theme theme) {
        try {
            return a(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }
}
