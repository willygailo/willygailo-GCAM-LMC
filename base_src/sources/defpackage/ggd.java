package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ggd {
    private final hka a;
    private final hkb b;

    public ggd() {
    }

    public ggd(hka hkaVar, hkb hkbVar) {
        this.a = hkaVar;
        this.b = hkbVar;
    }

    public static ggc a() {
        return new ggc();
    }

    public static ggd b() {
        ggc ggcVarA = a();
        ggcVarA.b(hka.OFF);
        ggcVarA.c(hkb.INACTIVE);
        return ggcVarA.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ggd) {
            ggd ggdVar = (ggd) obj;
            if (this.a.equals(ggdVar.a) && this.b.equals(ggdVar.b)) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 26 + String.valueOf(strValueOf2).length());
        sb.append("AeState{aeMode=");
        sb.append(strValueOf);
        sb.append(", aeState=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }
}
