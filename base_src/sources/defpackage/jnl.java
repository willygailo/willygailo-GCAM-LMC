package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jnl {
    public final lig a;
    public final lhs b;
    public final ojc c;
    private final lwd d;

    public jnl() {
    }

    public jnl(lwd lwdVar, lig ligVar, lhs lhsVar, ojc ojcVar) {
        this.d = lwdVar;
        this.a = ligVar;
        this.b = lhsVar;
        this.c = ojcVar;
    }

    public static jnl a(lwd lwdVar, lig ligVar, lhs lhsVar) {
        return b(lwdVar, ligVar, lhsVar, oih.a);
    }

    public static jnl b(lwd lwdVar, lig ligVar, lhs lhsVar, ojc ojcVar) {
        lig ligVar2;
        lhs lhsVar2;
        jnk jnkVar = new jnk(null);
        if (lwdVar == null) {
            throw new NullPointerException("Null cameraFacing");
        }
        jnkVar.a = lwdVar;
        if (ligVar == null) {
            throw new NullPointerException("Null resolution");
        }
        jnkVar.b = ligVar;
        jnkVar.c = lhsVar;
        jnkVar.d = ojcVar;
        lwd lwdVar2 = jnkVar.a;
        if (lwdVar2 != null && (ligVar2 = jnkVar.b) != null && (lhsVar2 = jnkVar.c) != null) {
            return new jnl(lwdVar2, ligVar2, lhsVar2, jnkVar.d);
        }
        StringBuilder sb = new StringBuilder();
        if (jnkVar.a == null) {
            sb.append(" cameraFacing");
        }
        if (jnkVar.b == null) {
            sb.append(" resolution");
        }
        if (jnkVar.c == null) {
            sb.append(" aspectRatio");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jnl) {
            jnl jnlVar = (jnl) obj;
            if (this.d.equals(jnlVar.d) && this.a.equals(jnlVar.a) && this.b.equals(jnlVar.b) && this.c.equals(jnlVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.d);
        String strValueOf2 = String.valueOf(this.a);
        String strValueOf3 = String.valueOf(this.b);
        String strValueOf4 = String.valueOf(this.c);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        StringBuilder sb = new StringBuilder(length + 67 + length2 + String.valueOf(strValueOf3).length() + String.valueOf(strValueOf4).length());
        sb.append("ViewfinderConfig{cameraFacing=");
        sb.append(strValueOf);
        sb.append(", resolution=");
        sb.append(strValueOf2);
        sb.append(", aspectRatio=");
        sb.append(strValueOf3);
        sb.append(", format=");
        sb.append(strValueOf4);
        sb.append("}");
        return sb.toString();
    }
}
