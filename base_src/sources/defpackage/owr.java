package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class owr {
    public final oxy a;
    public final String b;

    public owr(oxy oxyVar, String str) {
        oxh.x(oxyVar, "parser");
        this.a = oxyVar;
        oxh.x(str, "message");
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof owr) {
            owr owrVar = (owr) obj;
            if (this.a.equals(owrVar.a) && this.b.equals(owrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}
