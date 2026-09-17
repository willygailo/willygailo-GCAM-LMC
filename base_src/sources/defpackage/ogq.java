package defpackage;

import android.os.Trace;
import java.util.ArrayDeque;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ogq {
    public static final WeakHashMap a = new WeakHashMap();
    private static final ThreadLocal b = new ogm();

    static {
        new ArrayDeque();
        new ArrayDeque();
    }

    static ogi a() {
        return ((ogp) b.get()).c;
    }

    static ogi b() {
        ogi ogiVarA = a();
        return ogiVarA == null ? new ogc() : ogiVarA;
    }

    static ogi c(ogi ogiVar) {
        return h((ogp) b.get(), ogiVar);
    }

    static String d(ogi ogiVar) {
        int length = 0;
        ogi ogiVarA = ogiVar;
        while (ogiVarA != null) {
            length += ogiVarA.b().length();
            ogiVarA = ogiVarA.a();
            if (ogiVarA != null) {
                length += 4;
            }
        }
        char[] cArr = new char[length];
        while (ogiVar != null) {
            String strB = ogiVar.b();
            length -= strB.length();
            strB.getChars(0, strB.length(), cArr, length);
            ogiVar = ogiVar.a();
            if (ogiVar != null) {
                length -= 4;
                " -> ".getChars(0, 4, cArr, length);
            }
        }
        return new String(cArr);
    }

    static void e(ogi ogiVar) {
        ogiVar.getClass();
        ogp ogpVar = (ogp) b.get();
        ogi ogiVar2 = ogpVar.c;
        obr.aU(ogiVar == ogiVar2, "Wrong trace, expected %s but got %s", ogiVar2.b(), ogiVar.b());
        h(ogpVar, ogiVar2.a());
    }

    public static ogf f(String str) {
        return g(str, ogg.a, true);
    }

    public static ogf g(String str, ogh oghVar, boolean z) {
        ogi ogiVarD;
        ogi ogiVarA = a();
        if (ogiVarA == null) {
            ogiVarD = new ogd(str, oghVar, z);
        } else {
            ogiVarD = ogiVarA instanceof ofx ? ((ofx) ogiVarA).d(str, oghVar, z) : ogiVarA.f(str, oghVar);
        }
        c(ogiVarD);
        return new ogf(ogiVarD);
    }

    private static ogi h(ogp ogpVar, ogi ogiVar) {
        ogi ogiVar2 = ogpVar.c;
        if (ogiVar2 == ogiVar) {
            return ogiVar;
        }
        if (ogiVar2 == null) {
            ogpVar.b = ogn.a();
        }
        if (ogpVar.b) {
            l(ogiVar2, ogiVar);
        }
        ogpVar.c = ogiVar;
        ogo ogoVar = ogpVar.a;
        return ogiVar2;
    }

    private static void i(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    private static void j(ogi ogiVar) {
        if (ogiVar.a() != null) {
            j(ogiVar.a());
        }
        i(ogiVar.b());
    }

    private static void k(ogi ogiVar) {
        Trace.endSection();
        if (ogiVar.a() != null) {
            k(ogiVar.a());
        }
    }

    private static void l(ogi ogiVar, ogi ogiVar2) {
        if (ogiVar != null) {
            if (ogiVar2 != null) {
                if (ogiVar.a() == ogiVar2) {
                    Trace.endSection();
                    return;
                } else if (ogiVar == ogiVar2.a()) {
                    i(ogiVar2.b());
                    return;
                }
            }
            k(ogiVar);
        }
        if (ogiVar2 != null) {
            j(ogiVar2);
        }
    }
}
