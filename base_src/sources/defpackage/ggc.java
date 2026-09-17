package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ggc {
    private hka a;
    private hkb b;

    public final ggd a() {
        hkb hkbVar;
        hka hkaVar = this.a;
        if (hkaVar != null && (hkbVar = this.b) != null) {
            return new ggd(hkaVar, hkbVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" aeMode");
        }
        if (this.b == null) {
            sb.append(" aeState");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(hka hkaVar) {
        if (hkaVar == null) {
            throw new NullPointerException("Null aeMode");
        }
        this.a = hkaVar;
    }

    public final void c(hkb hkbVar) {
        if (hkbVar == null) {
            throw new NullPointerException("Null aeState");
        }
        this.b = hkbVar;
    }
}
