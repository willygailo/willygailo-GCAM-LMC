package defpackage;

import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class fxi {
    private final EnumMap a = new EnumMap(jrl.class);

    public fxi(Iterable iterable, jrl jrlVar) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            fxj fxjVar = (fxj) it.next();
            if (fxjVar != null) {
                jrl jrlVar2 = fxjVar.b.a;
                obr.aG(jrl.UNINITIALIZED != jrlVar2, "ModuleManager: The ApplicationMode can not be UNINITIALIZED");
                if (this.a.get(jrlVar2) != null) {
                    String strValueOf = String.valueOf(jrlVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 42);
                    sb.append("ModuleManager: Mode ");
                    sb.append(strValueOf);
                    sb.append(" is registered already");
                    throw new IllegalArgumentException(sb.toString());
                }
                this.a.put(jrlVar2, fxjVar);
            }
        }
        ((fxj) this.a.get(jrlVar)).getClass();
    }

    public final fxj a(jrl jrlVar) {
        fxj fxjVar = (fxj) this.a.get(jrlVar);
        fxjVar.getClass();
        return fxjVar;
    }
}
