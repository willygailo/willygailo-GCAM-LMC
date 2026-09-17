package defpackage;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class owq {
    private static final Set a;

    static {
        Set setSingleton = Collections.singleton(oun.a);
        a = setSingleton;
        owf.a(setSingleton);
    }

    public static String a(ovq ovqVar) {
        return ovt.b(ovqVar.l());
    }

    public static boolean b(ovq ovqVar, owm owmVar, Set set) {
        return (ovqVar.k() == null && owmVar.a() <= set.size() && set.containsAll(owmVar.b())) ? false : true;
    }

    public static void c(owm owmVar, owc owcVar, StringBuilder sb) {
        ovp ovpVar = new ovp(sb);
        owmVar.c(owcVar, ovpVar);
        if (ovpVar.c) {
            ovpVar.b.append(ovpVar.a);
        }
    }
}
