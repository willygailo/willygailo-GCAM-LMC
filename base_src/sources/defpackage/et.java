package defpackage;

import MC.hsld;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.google.android.apps.camera.bottombar.R;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class et {
    public static boolean A(TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    public static boolean B(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static CharSequence[] C(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    public static int D(TypedArray typedArray, int i, int i2) {
        return typedArray.getInt(i, typedArray.getInt(i2, Integer.MAX_VALUE));
    }

    public static int E(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (B(xmlPullParser, str)) {
            return typedArray.getColor(i, 0);
        }
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    /* JADX WARN: Multi-variable type inference failed */
    public static dy F(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        dy dyVar;
        byte b;
        Shader radialGradient;
        String str2 = "centerColor";
        if (B(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                return dy.a(typedValue.data);
            }
            Resources resources = typedArray.getResources();
            try {
                XmlResourceParser xml = resources.getXml(typedArray.getResourceId(i, 0));
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    int next = xml.next();
                    if (next == 2) {
                        String name = xml.getName();
                        switch (name) {
                            case "gradient":
                                b = 1;
                                break;
                            case "selector":
                                b = 0;
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        try {
                            switch (b) {
                                case 0:
                                    ColorStateList colorStateListB = dx.b(resources, xml, attributeSetAsAttributeSet, theme);
                                    dyVar = new dy(null, colorStateListB, colorStateListB.getDefaultColor());
                                    break;
                                case 1:
                                    String name2 = xml.getName();
                                    if (!name2.equals("gradient")) {
                                        throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
                                    }
                                    TypedArray typedArrayX = x(resources, theme, attributeSetAsAttributeSet, ae.d);
                                    float fT = t(typedArrayX, xml, "startX", 8, 0.0f);
                                    float fT2 = t(typedArrayX, xml, "startY", 9, 0.0f);
                                    float fT3 = t(typedArrayX, xml, "endX", 10, 0.0f);
                                    float fT4 = t(typedArrayX, xml, "endY", 11, 0.0f);
                                    float fT5 = t(typedArrayX, xml, "centerX", 3, 0.0f);
                                    float fT6 = t(typedArrayX, xml, "centerY", 4, 0.0f);
                                    int iV = v(typedArrayX, xml, "type", 2, 0);
                                    int iE = E(typedArrayX, xml, "startColor", 0);
                                    boolean zB = B(xml, "centerColor");
                                    int iE2 = E(typedArrayX, xml, "centerColor", 7);
                                    int iE3 = E(typedArrayX, xml, "endColor", 1);
                                    int iV2 = v(typedArrayX, xml, "tileMode", 6, 0);
                                    float fT7 = t(typedArrayX, xml, "gradientRadius", 5, 0.0f);
                                    typedArrayX.recycle();
                                    int depth = xml.getDepth() + 1;
                                    ArrayList arrayList = new ArrayList(20);
                                    ArrayList arrayList2 = new ArrayList(20);
                                    while (true) {
                                        int next2 = xml.next();
                                        fT = fT;
                                        if (next2 != 1) {
                                            int depth2 = xml.getDepth();
                                            if (depth2 < depth) {
                                                iV2 = iV2;
                                                if (next2 != 3) {
                                                }
                                            } else {
                                                iV2 = iV2;
                                            }
                                            if (next2 == 2 && depth2 <= depth) {
                                                if (xml.getName().equals("item")) {
                                                    TypedArray typedArrayX2 = x(resources, theme, attributeSetAsAttributeSet, ae.e);
                                                    boolean zHasValue = typedArrayX2.hasValue(0);
                                                    boolean zHasValue2 = typedArrayX2.hasValue(1);
                                                    if (!zHasValue || !zHasValue2) {
                                                        throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                                                    }
                                                    int color = typedArrayX2.getColor(0, 0);
                                                    float f = typedArrayX2.getFloat(1, 0.0f);
                                                    typedArrayX2.recycle();
                                                    arrayList2.add(Integer.valueOf(color));
                                                    arrayList.add(Float.valueOf(f));
                                                }
                                            }
                                        } else {
                                            iV2 = iV2;
                                        }
                                    }
                                    ed edVar = arrayList2.size() > 0 ? new ed(arrayList2, arrayList) : null;
                                    if (edVar == null) {
                                        edVar = zB ? new ed(iE, iE2, iE3) : new ed(iE, iE3);
                                    }
                                    switch (iV) {
                                        case 1:
                                            if (fT7 <= 0.0f) {
                                                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
                                            }
                                            radialGradient = new RadialGradient(fT5, fT6, fT7, edVar.a, edVar.b, d.h(iV2));
                                            break;
                                            break;
                                        case 2:
                                            radialGradient = new SweepGradient(fT5, fT6, edVar.a, edVar.b);
                                            break;
                                        default:
                                            radialGradient = new LinearGradient(fT, fT2, fT3, fT4, edVar.a, edVar.b, d.h(iV2));
                                            break;
                                    }
                                    try {
                                        dyVar = new dy(radialGradient, null, 0);
                                    } catch (Exception e) {
                                        e = e;
                                        str2 = null;
                                        Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                                        dyVar = str2;
                                    }
                                    break;
                                    break;
                                default:
                                    throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } else if (next == 1) {
                        throw new XmlPullParserException("No start tag found");
                    }
                }
            } catch (Exception e3) {
                e = e3;
                str2 = null;
            }
            if (dyVar != 0) {
                return dyVar;
            }
        }
        return dy.a(0);
    }

    public static int G(int i) {
        if (i <= 4) {
            return 8;
        }
        return i + i;
    }

    public static void H(ddj ddjVar, ddf ddfVar, lzi lziVar, dei deiVar) {
        ddjVar.m(dcs.e, Float.valueOf(1.3229325E7f));
        ddjVar.m(dcs.f, Float.valueOf(3.807744E7f));
        ddjVar.n(ddl.aa, "Pixel-2H19-Droidfood-Discuss@google.com");
        ddjVar.n(ddl.ab, "Pixel-2H19-Dogfood-Discuss@google.com");
        dep depVar = (dep) ddjVar;
        depVar.s(ddl.aR, true);
        depVar.s(ddl.K, lziVar.g);
        depVar.s(ddl.aV, true);
        ddjVar.l(ddl.m, lziVar.g ? -1 : -1);
        ddjVar.l(ddl.q, 60);
        depVar.s(ddl.ad, false);
        ddjVar.l(ddl.c, 2);
        ddjVar.l(ddl.d, 2);
        depVar.s(ddl.aZ, true);
        depVar.s(dde.f, true);
        depVar.s(dde.g, true);
        depVar.s(ddd.a, true);
        depVar.s(dcu.E, true);
        depVar.s(dcu.G, true);
        depVar.s(dcu.I, true);
        depVar.s(dcu.R, true);
        depVar.s(dcu.P, true);
        depVar.s(dcu.L, true);
        depVar.s(dcu.T, true);
        depVar.s(dcu.U, true);
        depVar.s(dcu.V, true);
        depVar.s(dcu.X, true);
        depVar.s(dcu.ae, false);
        depVar.s(dcv.f, true);
        depVar.s(dcv.g, true);
        depVar.s(ddm.O, true);
        depVar.s(ddm.P, true);
        depVar.s(ddm.D, false);
        ddjVar.l(ddm.c, 2);
        depVar.s(ddt.e, deiVar.b(dei.ENG));
        depVar.s(ddm.ao, false);
        depVar.s(ddu.j, true);
        depVar.s(ddm.z, false);
        depVar.s(ddm.at, false);
        depVar.s(ddm.aa, true);
        depVar.s(ddm.ab, true);
        depVar.s(ddm.aj, true);
        depVar.s(ddm.ah, true);
        depVar.s(ddm.an, true);
        depVar.s(ddm.L, false);
        depVar.s(ddm.K, false);
        depVar.s(ddx.C, true);
        depVar.s(ddp.i, true);
        depVar.s(ddp.h, true);
        ddjVar.m(ddq.b, Float.valueOf(2.948064E7f));
        ddjVar.m(ddq.c, Float.valueOf(2.380845E7f));
        depVar.s(ddq.e, false);
        depVar.q(ddr.f, false);
        depVar.s(ddr.q, true);
        depVar.s(ddr.j, false);
        depVar.s(dds.O, true);
        depVar.s(dds.N, true);
        depVar.s(dds.r, true);
        depVar.s(dds.t, true);
        depVar.s(dds.u, true);
        depVar.s(dds.j, true);
        deiVar.b(dei.FISHFOOD);
        ddjVar.l(ddu.b, Integer.valueOf(((Integer) ddfVar.a(ddu.c).c()).intValue() * 4));
        ddjVar.l(ddu.a, 300);
        depVar.s(ddx.w, false);
        depVar.s(ddx.v, true);
        ddjVar.l(ddx.c, 2328);
        ddjVar.l(ddx.d, 1746);
        ddjVar.l(ddx.e, 2);
        depVar.s(ddx.B, true);
        depVar.s(ddy.c, true);
        ddjVar.l(ddy.a, 1);
        depVar.s(ddl.T, true);
        depVar.s(dcy.c, true);
        depVar.s(deh.a, false);
        depVar.s(ddn.b, false);
    }

    public static void I(ddj ddjVar, ddf ddfVar, lzi lziVar) {
        ddjVar.m(dcs.e, Float.valueOf(1.3229325E7f));
        ddjVar.m(dcs.f, Float.valueOf(3.807744E7f));
        dep depVar = (dep) ddjVar;
        depVar.s(ddl.I, false);
        depVar.q(ddl.M, false);
        ddjVar.n(ddl.ab, "pixel-1h19-dogfood-discuss@google.com");
        depVar.s(ddl.ad, false);
        depVar.s(ddl.am, false);
        ddjVar.l(ddl.m, -1);
        depVar.s(ddl.aG, false);
        depVar.s(ddl.bn, true);
        depVar.s(ddl.aS, false);
        if (lziVar.d) {
            ddjVar.l(ddl.h, -855643188);
            ddjVar.l(ddl.i, -855643188);
        } else {
            ddjVar.l(ddl.h, -855645759);
            ddjVar.l(ddl.i, -855645759);
        }
        ddjVar.m(dde.a, Float.valueOf(hsld.setHDRregion()));
        depVar.s(dcu.ae, false);
        ddjVar.l(ddm.r, 10);
        ddjVar.l(ddm.i, 13);
        depVar.s(ddm.O, true);
        depVar.s(ddm.W, false);
        depVar.s(ddm.am, false);
        depVar.s(ddm.ak, false);
        depVar.s(ddm.ao, false);
        depVar.s(ddm.z, false);
        depVar.s(ddm.at, false);
        depVar.s(ddp.x, false);
        ddjVar.m(ddq.b, Float.valueOf(2.095425E7f));
        ddjVar.m(ddq.c, Float.valueOf(5.194001E7f));
        depVar.s(dds.u, true);
        depVar.s(dds.w, false);
        depVar.s(dds.b, false);
        depVar.s(dds.c, false);
        ddjVar.l(ddu.c, 10);
        ddjVar.l(ddu.b, Integer.valueOf(((Integer) ddfVar.a(ddu.c).c()).intValue() * 4));
        ddjVar.m(ddx.g, Float.valueOf(2.0f));
        ddjVar.m(ddx.h, Float.valueOf(3.0f));
        depVar.s(ddx.o, true);
        depVar.s(ddx.p, true);
        depVar.s(ddx.q, false);
        depVar.s(ddx.y, false);
        depVar.s(ddx.D, false);
        depVar.s(deh.a, false);
        depVar.s(ddl.bo, false);
        depVar.q(dcz.b, false);
        depVar.s(ddn.b, false);
        depVar.s(ddl.ak, false);
    }

    private static void J(ArrayList arrayList, char c, float[] fArr) {
        arrayList.add(new em(c, fArr));
    }

    public static Bitmap a(MediaDescription mediaDescription) {
        return mediaDescription.getIconBitmap();
    }

    public static MediaDescription.Builder b() {
        return new MediaDescription.Builder();
    }

    public static MediaDescription c(MediaDescription.Builder builder) {
        return builder.build();
    }

    public static Uri d(MediaDescription mediaDescription) {
        return mediaDescription.getIconUri();
    }

    public static Bundle e(MediaDescription mediaDescription) {
        return mediaDescription.getExtras();
    }

    public static CharSequence f(MediaDescription mediaDescription) {
        return mediaDescription.getDescription();
    }

    public static CharSequence g(MediaDescription mediaDescription) {
        return mediaDescription.getSubtitle();
    }

    public static CharSequence h(MediaDescription mediaDescription) {
        return mediaDescription.getTitle();
    }

    public static String i(MediaDescription mediaDescription) {
        return mediaDescription.getMediaId();
    }

    public static void j(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setDescription(charSequence);
    }

    public static void k(MediaDescription.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    public static void l(MediaDescription.Builder builder, Bitmap bitmap) {
        builder.setIconBitmap(bitmap);
    }

    public static void m(MediaDescription.Builder builder, Uri uri) {
        builder.setIconUri(uri);
    }

    public static void n(MediaDescription.Builder builder, String str) {
        builder.setMediaId(str);
    }

    public static void o(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    public static void p(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setTitle(charSequence);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0049  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a1 A[Catch: NumberFormatException -> 0x00bd, TryCatch #0 {NumberFormatException -> 0x00bd, blocks: (B:27:0x005b, B:29:0x006e, B:30:0x0074, B:32:0x007a, B:33:0x007e, B:46:0x009b, B:38:0x0089, B:41:0x0091, B:48:0x00a1, B:49:0x00ae, B:52:0x00b4, B:54:0x00b8), top: B:69:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b4 A[Catch: NumberFormatException -> 0x00bd, TryCatch #0 {NumberFormatException -> 0x00bd, blocks: (B:27:0x005b, B:29:0x006e, B:30:0x0074, B:32:0x007a, B:33:0x007e, B:46:0x009b, B:38:0x0089, B:41:0x0091, B:48:0x00a1, B:49:0x00ae, B:52:0x00b4, B:54:0x00b8), top: B:69:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00da  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e3 A[SYNTHETIC] */
    public static em[] q(String str) {
        String strTrim;
        float[] fArrS;
        byte[] bArr = null;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                if (((cCharAt - 'A') * (cCharAt - 'Z') > 0 && (cCharAt - 'a') * (cCharAt - 'z') > 0) || cCharAt == 'e' || cCharAt == 'E') {
                    i++;
                } else {
                    strTrim = str.substring(i2, i).trim();
                    if (strTrim.length() <= 0) {
                        if (strTrim.charAt(0) != 'z' || strTrim.charAt(0) == 'Z') {
                            fArrS = new float[0];
                        } else {
                            try {
                                float[] fArr = new float[strTrim.length()];
                                eiy eiyVar = new eiy(bArr, bArr);
                                int length = strTrim.length();
                                int i3 = 1;
                                int i4 = 0;
                                while (i3 < length) {
                                    eiyVar.a = false;
                                    boolean z = false;
                                    boolean z2 = false;
                                    boolean z3 = false;
                                    for (int i5 = i3; i5 < strTrim.length(); i5++) {
                                        switch (strTrim.charAt(i5)) {
                                            case ' ':
                                            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                                                z2 = false;
                                                z3 = true;
                                                break;
                                            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                if (i5 == i3 || z2) {
                                                    z2 = false;
                                                } else {
                                                    eiyVar.a = true;
                                                    z2 = false;
                                                    z3 = true;
                                                }
                                                break;
                                            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                if (z) {
                                                    eiyVar.a = true;
                                                    z = true;
                                                    z2 = false;
                                                    z3 = true;
                                                } else {
                                                    z = true;
                                                    z2 = false;
                                                }
                                                break;
                                            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                                            case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                                                z2 = true;
                                                break;
                                            default:
                                                z2 = false;
                                                break;
                                        }
                                        if (z3) {
                                            if (i3 < i5) {
                                                fArr[i4] = Float.parseFloat(strTrim.substring(i3, i5));
                                                i4++;
                                            }
                                            if (eiyVar.a) {
                                                i3 = i5;
                                            } else {
                                                i3 = i5 + 1;
                                            }
                                        }
                                    }
                                    if (i3 < i5) {
                                        fArr[i4] = Float.parseFloat(strTrim.substring(i3, i5));
                                        i4++;
                                    }
                                    if (eiyVar.a) {
                                        i3 = i5;
                                    } else {
                                        i3 = i5 + 1;
                                    }
                                }
                                fArrS = s(fArr, i4);
                            } catch (NumberFormatException e) {
                                throw new RuntimeException("error in parsing \"" + strTrim + "\"", e);
                            }
                        }
                        J(arrayList, strTrim.charAt(0), fArrS);
                    }
                    i2 = i;
                    i++;
                    bArr = null;
                }
            }
            strTrim = str.substring(i2, i).trim();
            if (strTrim.length() <= 0) {
                if (strTrim.charAt(0) != 'z') {
                    fArrS = new float[0];
                } else {
                    fArrS = new float[0];
                }
                J(arrayList, strTrim.charAt(0), fArrS);
            }
            i2 = i;
            i++;
            bArr = null;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            J(arrayList, str.charAt(i2), new float[0]);
        }
        return (em[]) arrayList.toArray(new em[arrayList.size()]);
    }

    public static em[] r(em[] emVarArr) {
        if (emVarArr == null) {
            return null;
        }
        em[] emVarArr2 = new em[emVarArr.length];
        for (int i = 0; i < emVarArr.length; i++) {
            emVarArr2[i] = new em(emVarArr[i]);
        }
        return emVarArr2;
    }

    public static float[] s(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int iMin = Math.min(i, fArr.length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static float t(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !B(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int u(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static int v(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !B(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static int w(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    public static TypedArray x(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static CharSequence y(TypedArray typedArray, int i, int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    public static String z(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }
}
