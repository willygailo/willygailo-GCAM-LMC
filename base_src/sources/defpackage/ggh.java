package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ggh {
    private final ggd a;
    private final ggd b;

    public ggh() {
    }

    public ggh(ggd ggdVar, ggd ggdVar2) {
        if (ggdVar == null) {
            throw new NullPointerException("Null prevState");
        }
        this.a = ggdVar;
        if (ggdVar2 == null) {
            throw new NullPointerException("Null curState");
        }
        this.b = ggdVar2;
    }

    public static ggh a(ggd ggdVar, ggd ggdVar2) {
        return new ggh(ggdVar, ggdVar2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ggh) {
            ggh gghVar = (ggh) obj;
            if (this.a.equals(gghVar.a) && this.b.equals(gghVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 40 + String.valueOf(strValueOf2).length());
        sb.append("AeStateTransition{prevState=");
        sb.append(strValueOf);
        sb.append(", curState=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }
}
