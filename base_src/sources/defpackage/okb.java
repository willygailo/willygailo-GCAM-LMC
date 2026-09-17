package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class okb implements ojz {
    volatile ojz a;
    volatile boolean b;
    Object c;

    public okb(ojz ojzVar) {
        ojzVar.getClass();
        this.a = ojzVar;
    }

    @Override // defpackage.ojz
    public final Object a() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    ojz ojzVar = this.a;
                    ojzVar.getClass();
                    Object objA = ojzVar.a();
                    this.c = objA;
                    this.b = true;
                    this.a = null;
                    return objA;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object string = this.a;
        if (string == null) {
            String strValueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
