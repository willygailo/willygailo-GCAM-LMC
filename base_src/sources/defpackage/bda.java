package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class bda implements bdf {
    int a;
    public Class b;
    private final bdb c;

    public bda(bdb bdbVar) {
        this.c = bdbVar;
    }

    @Override // defpackage.bdf
    public final void a() {
        this.c.c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bda) {
            bda bdaVar = (bda) obj;
            if (this.a == bdaVar.a && this.b == bdaVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a * 31;
        Class cls = this.b;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        int i = this.a;
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 27);
        sb.append("Key{size=");
        sb.append(i);
        sb.append("array=");
        sb.append(strValueOf);
        sb.append('}');
        return sb.toString();
    }
}
