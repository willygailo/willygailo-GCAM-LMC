package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class oka implements Serializable, ojz {
    private static final long serialVersionUID = 0;
    final ojz a;
    volatile transient boolean b;
    transient Object c;

    public oka(ojz ojzVar) {
        ojzVar.getClass();
        this.a = ojzVar;
    }

    @Override // defpackage.ojz
    public final Object a() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    Object objA = this.a.a();
                    this.c = objA;
                    this.b = true;
                    return objA;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object string;
        if (this.b) {
            String strValueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        } else {
            string = this.a;
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
