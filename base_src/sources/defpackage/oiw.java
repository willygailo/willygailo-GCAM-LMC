package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class oiw implements Serializable, oiu {
    private static final long serialVersionUID = 0;
    private final oiu a;
    private final oiu b;

    public oiw(oiu oiuVar, oiu oiuVar2) {
        this.a = oiuVar;
        oiuVar2.getClass();
        this.b = oiuVar2;
    }

    @Override // defpackage.oiu
    public final Object a(Object obj) {
        return this.a.a(this.b.a(obj));
    }

    @Override // defpackage.oiu
    public final boolean equals(Object obj) {
        if (obj instanceof oiw) {
            oiw oiwVar = (oiw) obj;
            if (this.b.equals(oiwVar.b) && this.a.equals(oiwVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 2 + String.valueOf(strValueOf2).length());
        sb.append(strValueOf);
        sb.append("(");
        sb.append(strValueOf2);
        sb.append(")");
        return sb.toString();
    }
}
