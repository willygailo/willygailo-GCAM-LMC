package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.Handler;
import android.os.Looper;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class en {
    public static final xe a;

    static {
        new ConcurrentHashMap();
        a = new xe(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static String b(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    public static Typeface c(Context context, dz dzVar, Resources resources, int i, int i2, eg egVar, boolean z) throws Throwable {
        Typeface typefaceCreate;
        int i3 = 1;
        Typeface typefaceBuild = null;
        if (dzVar instanceof ec) {
            ec ecVar = (ec) dzVar;
            String str = ecVar.d;
            if (str == null || str.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(str, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                if (egVar != null) {
                    egVar.c(typefaceCreate);
                }
                return typefaceCreate;
            }
            if (!z ? egVar != null : ecVar.c != 0) {
                i3 = 0;
            }
            int i4 = z ? ecVar.b : -1;
            Handler handlerD = eg.d();
            abn abnVar = new abn(egVar);
            abf abfVar = ecVar.a;
            abd abdVar = new abd(abnVar, handlerD);
            if (i3 != 0) {
                String strB = abl.b(abfVar, i2);
                Typeface typeface = (Typeface) abl.a.a(strB);
                if (typeface != null) {
                    abdVar.a(new abk(typeface));
                    typefaceBuild = typeface;
                } else if (i4 == -1) {
                    abk abkVarA = abl.a(strB, context, abfVar, i2);
                    abdVar.a(abkVarA);
                    typefaceBuild = abkVarA.a;
                } else {
                    try {
                        abk abkVar = (abk) aap.c(abl.b, new abg(strB, context, abfVar, i2), i4);
                        abdVar.a(abkVar);
                        typefaceBuild = abkVar.a;
                    } catch (InterruptedException e) {
                        abdVar.a(new abk(-3));
                    }
                }
            } else {
                String strB2 = abl.b(abfVar, i2);
                Typeface typeface2 = (Typeface) abl.a.a(strB2);
                if (typeface2 != null) {
                    abdVar.a(new abk(typeface2));
                    typefaceBuild = typeface2;
                } else {
                    abh abhVar = new abh(abdVar);
                    synchronized (abl.c) {
                        ArrayList arrayList = (ArrayList) abl.d.get(strB2);
                        if (arrayList != null) {
                            arrayList.add(abhVar);
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(abhVar);
                            abl.d.put(strB2, arrayList2);
                            abl.b.execute(new abr(Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler(), new abi(strB2, context, abfVar, i2), new abj(strB2)));
                        }
                    }
                }
            }
        } else {
            try {
                FontFamily.Builder builder = null;
                for (eb ebVar : ((ea) dzVar).a) {
                    try {
                        Font fontBuild = new Font.Builder(resources, ebVar.e).setWeight(ebVar.a).setSlant(ebVar.b ? 1 : 0).setTtcIndex(ebVar.d).setFontVariationSettings(ebVar.c).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                    } catch (IOException e2) {
                    }
                }
                if (builder != null) {
                    int i5 = 1 != (i2 & 1) ? 400 : 700;
                    if ((i2 & 2) == 0) {
                        i3 = 0;
                    }
                    typefaceBuild = new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i5, i3)).build();
                }
            } catch (Exception e3) {
            }
            if (egVar != null) {
                if (typefaceBuild != null) {
                    egVar.c(typefaceBuild);
                } else {
                    egVar.b(-3);
                }
            }
        }
        if (typefaceBuild != null) {
            a.b(b(resources, i, i2), typefaceBuild);
        }
        return typefaceBuild;
    }
}
