package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class oji implements Serializable, ojf {
    private static final long serialVersionUID = 0;
    final ojf a;

    public oji(ojf ojfVar) {
        this.a = ojfVar;
    }

    @Override // defpackage.ojf
    public final boolean a(Object obj) {
        return !this.a.a(obj);
    }

    @Override // defpackage.ojf
    public final boolean equals(Object obj) {
        if (obj instanceof oji) {
            return this.a.equals(((oji) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (-1);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 16);
        sb.append("Predicates.not(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
