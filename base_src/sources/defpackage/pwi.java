package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class pwi {
    public final HashMap a;
    public final HashMap b;

    public pwi() {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public pwi(pwi pwiVar) {
        this.a = new HashMap(pwiVar.a);
        HashMap map = new HashMap(pwiVar.b);
        this.b = map;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((pwf) ((Map.Entry) it.next()).getValue()).e.get()) {
                it.remove();
            }
        }
    }
}
