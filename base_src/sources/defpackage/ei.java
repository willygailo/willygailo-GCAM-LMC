package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class ei {
    static {
        new ThreadLocal();
        new WeakHashMap(0);
    }

    public static Typeface a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return f(context, i, new TypedValue(), 0, null, false, true);
    }

    public static Typeface b(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return f(context, i, new TypedValue(), 0, null, false, false);
    }

    public static Typeface c(Context context, int i, TypedValue typedValue, int i2, eg egVar) {
        if (context.isRestricted()) {
            return null;
        }
        return f(context, i, typedValue, i2, egVar, true, false);
    }

    public static Drawable d(Resources resources, int i, Resources.Theme theme) {
        return resources.getDrawable(i, theme);
    }

    public static void e(Context context, int i, eg egVar) {
        if (context.isRestricted()) {
            egVar.b(-4);
        } else {
            f(context, i, new TypedValue(), 0, egVar, false, false);
        }
    }

    private static Typeface f(Context context, int i, TypedValue typedValue, int i2, eg egVar, boolean z, boolean z2) throws Throwable {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface typefaceG = g(context, resources, typedValue, i, i2, egVar, z, z2);
        if (typefaceG != null || egVar != null || z2) {
            return typefaceG;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0280  */
    /* JADX WARN: Code duplicated, block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 16, insn: 0x023e: MOVE (r2 I:??[OBJECT, ARRAY]) = (r16 I:??[OBJECT, ARRAY]), block:B:120:0x023e */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v8 */
    private static Typeface g(Context context, Resources resources, TypedValue typedValue, int i, int i2, eg egVar, boolean z, boolean z2) throws Throwable {
        ?? r2;
        Object obj;
        Typeface typefaceBuild;
        int next;
        dz eaVar;
        List arrayList;
        if (typedValue.string == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        ?? string = typedValue.string.toString();
        if (!string.startsWith("res/")) {
            if (egVar != null) {
                egVar.b(-3);
            }
            return null;
        }
        Typeface typeface = (Typeface) en.a.a(en.b(resources, i, i2));
        if (typeface != null) {
            if (egVar != null) {
                egVar.c(typeface);
            }
            return typeface;
        }
        if (z2) {
            return null;
        }
        try {
            try {
                if (!string.toLowerCase().endsWith(".xml")) {
                    try {
                        Font fontBuild = new Font.Builder(resources, i).build();
                        typefaceBuild = new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
                    } catch (Exception e) {
                        typefaceBuild = null;
                    }
                    if (typefaceBuild != null) {
                        en.a.b(en.b(resources, i, i2), typefaceBuild);
                    }
                    if (egVar != null) {
                        if (typefaceBuild != null) {
                            egVar.c(typefaceBuild);
                        } else {
                            egVar.b(-3);
                        }
                    }
                    return typefaceBuild;
                }
                XmlResourceParser xml = resources.getXml(i);
                do {
                    next = xml.next();
                    if (next == 2) {
                        xml.require(2, null, "font-family");
                        if (xml.getName().equals("font-family")) {
                            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), ae.b);
                            String string2 = typedArrayObtainAttributes.getString(0);
                            String string3 = typedArrayObtainAttributes.getString(4);
                            String string4 = typedArrayObtainAttributes.getString(5);
                            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
                            int integer = typedArrayObtainAttributes.getInteger(2, 1);
                            int integer2 = typedArrayObtainAttributes.getInteger(3, 500);
                            String string5 = typedArrayObtainAttributes.getString(6);
                            typedArrayObtainAttributes.recycle();
                            if (string2 == null || string3 == null || string4 == null) {
                                ArrayList arrayList2 = new ArrayList();
                                while (xml.next() != 3) {
                                    if (xml.getEventType() == 2) {
                                        if (xml.getName().equals("font")) {
                                            TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xml), ae.c);
                                            int i3 = typedArrayObtainAttributes2.getInt(true != typedArrayObtainAttributes2.hasValue(8) ? 1 : 8, 400);
                                            boolean z3 = typedArrayObtainAttributes2.getInt(true != typedArrayObtainAttributes2.hasValue(6) ? 2 : 6, 0) == 1;
                                            int i4 = true != typedArrayObtainAttributes2.hasValue(9) ? 3 : 9;
                                            String string6 = typedArrayObtainAttributes2.getString(true != typedArrayObtainAttributes2.hasValue(7) ? 4 : 7);
                                            int i5 = typedArrayObtainAttributes2.getInt(i4, 0);
                                            int i6 = true != typedArrayObtainAttributes2.hasValue(5) ? 0 : 5;
                                            int resourceId2 = typedArrayObtainAttributes2.getResourceId(i6, 0);
                                            typedArrayObtainAttributes2.getString(i6);
                                            typedArrayObtainAttributes2.recycle();
                                            while (xml.next() != 3) {
                                                d.j(xml);
                                            }
                                            arrayList2.add(new eb(i3, z3, string6, i5, resourceId2));
                                        } else {
                                            d.j(xml);
                                        }
                                    }
                                }
                                eaVar = arrayList2.isEmpty() ? null : new ea((eb[]) arrayList2.toArray(new eb[arrayList2.size()]));
                            } else {
                                while (xml.next() != 3) {
                                    d.j(xml);
                                }
                                if (resourceId == 0) {
                                    arrayList = Collections.emptyList();
                                } else {
                                    TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(resourceId);
                                    try {
                                        if (typedArrayObtainTypedArray.length() == 0) {
                                            arrayList = Collections.emptyList();
                                            typedArrayObtainTypedArray.recycle();
                                            string = string;
                                        } else {
                                            arrayList = new ArrayList();
                                            try {
                                                int type = typedArrayObtainTypedArray.getType(0);
                                                if (type == 1) {
                                                    int i7 = 0;
                                                    while (true) {
                                                        type = typedArrayObtainTypedArray.length();
                                                        if (i7 >= type) {
                                                            break;
                                                        }
                                                        int resourceId3 = typedArrayObtainTypedArray.getResourceId(i7, 0);
                                                        if (resourceId3 != 0) {
                                                            arrayList.add(d.i(resources.getStringArray(resourceId3)));
                                                        }
                                                        i7++;
                                                    }
                                                } else {
                                                    arrayList.add(d.i(resources.getStringArray(resourceId)));
                                                }
                                                typedArrayObtainTypedArray.recycle();
                                                string = type;
                                            } catch (Throwable th) {
                                                th = th;
                                                typedArrayObtainTypedArray.recycle();
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                                eaVar = new ec(new abf(string2, string3, string4, arrayList), integer, integer2, string5);
                            }
                        } else {
                            d.j(xml);
                            eaVar = null;
                        }
                        if (eaVar != null) {
                            return en.c(context, eaVar, resources, i, i2, egVar, z);
                        }
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        if (egVar == null) {
                            return null;
                        }
                        egVar.b(-3);
                        return null;
                    }
                } while (next != 1);
                throw new XmlPullParserException("No start tag found");
            } catch (IOException e2) {
                e = e2;
                Log.e("ResourcesCompat", "Failed to read xml resource " + string, e);
                if (egVar != null) {
                    return null;
                }
                egVar.b(-3);
                return null;
            } catch (XmlPullParserException e3) {
                e = e3;
                r2 = obj;
                Log.e("ResourcesCompat", "Failed to parse xml resource " + r2, e);
                if (egVar != null) {
                    return null;
                }
                egVar.b(-3);
                return null;
            }
        } catch (IOException e4) {
            e = e4;
        } catch (XmlPullParserException e5) {
            e = e5;
            r2 = string;
        }
    }
}
