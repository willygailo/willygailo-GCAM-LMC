package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class opa implements Serializable {
    private static final long serialVersionUID = 0;
    private final oor a;

    public opa(oor oorVar) {
        this.a = oorVar;
    }

    Object readResolve() {
        if (this.a.isEmpty()) {
            return opb.a;
        }
        ArrayList arrayListAg = obr.ag();
        oti otiVarListIterator = this.a.entrySet().listIterator();
        while (otiVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) otiVarListIterator.next();
            ohh.B((orj) entry.getKey(), entry.getValue(), arrayListAg);
        }
        return ohh.A(arrayListAg);
    }
}
