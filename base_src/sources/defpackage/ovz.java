package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class ovz extends owc {
    private final Map a;
    private final Map b;
    private final owa c;

    public ovz(ovy ovyVar) {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        map.putAll(ovyVar.c);
        map2.putAll(ovyVar.d);
        this.c = ovyVar.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.owc
    protected final void a(ovd ovdVar, Object obj, Object obj2) {
        owb owbVar = (owb) this.a.get(ovdVar);
        if (owbVar != null) {
            owbVar.a(ovdVar, obj, obj2);
        } else {
            ovdVar.b(obj, obj2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.owc
    protected final void b(ovd ovdVar, Iterator it, Object obj) {
        owa owaVar = (owa) this.b.get(ovdVar);
        if (owaVar != null) {
            owaVar.a(ovdVar, it, obj);
        } else if (this.c != null && !this.a.containsKey(ovdVar)) {
            ovdVar.a(it, obj);
        } else {
            while (it.hasNext()) {
                a(ovdVar, it.next(), obj);
            }
        }
    }
}
