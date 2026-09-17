package defpackage;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class ooq implements Serializable {
    private static final long serialVersionUID = 0;
    private final Object a;
    private final Object b;

    public ooq(oor oorVar) {
        Object[] objArr = new Object[oorVar.size()];
        Object[] objArr2 = new Object[oorVar.size()];
        oti otiVarListIterator = oorVar.entrySet().listIterator();
        int i = 0;
        while (otiVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) otiVarListIterator.next();
            objArr[i] = entry.getKey();
            objArr2[i] = entry.getValue();
            i++;
        }
        this.a = objArr;
        this.b = objArr2;
    }

    public oon a(int i) {
        return new oon(i);
    }

    final Object readResolve() {
        Object obj = this.a;
        if (obj instanceof ope) {
            ope opeVar = (ope) obj;
            ood oodVar = (ood) this.b;
            oon oonVarA = a(opeVar.size());
            oti otiVarListIterator = opeVar.listIterator();
            oti otiVarListIterator2 = oodVar.listIterator();
            while (otiVarListIterator.hasNext()) {
                oonVarA.e(otiVarListIterator.next(), otiVarListIterator2.next());
            }
            return oonVarA.c();
        }
        Object[] objArr = (Object[]) obj;
        Object[] objArr2 = (Object[]) this.b;
        oon oonVarA2 = a(objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            oonVarA2.e(objArr[i], objArr2[i]);
        }
        return oonVarA2.c();
    }
}
