package defpackage;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class owf {
    private static final owb a = new owd();
    private static final owa b = new owe();

    public static owc a(Set set) {
        ovy ovyVar = new ovy(a);
        ovyVar.f = b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ovd ovdVar = (ovd) it.next();
            oxh.x(ovdVar, "key");
            if (ovdVar.b) {
                owa owaVar = ovy.b;
                oxh.x(ovdVar, "key");
                oxh.y(ovdVar.b, "key must be repeating");
                ovyVar.c.remove(ovdVar);
                ovyVar.d.put(ovdVar, owaVar);
            } else {
                owb owbVar = ovy.a;
                oxh.x(ovdVar, "key");
                ovyVar.d.remove(ovdVar);
                ovyVar.c.put(ovdVar, owbVar);
            }
        }
        return new ovz(ovyVar);
    }
}
