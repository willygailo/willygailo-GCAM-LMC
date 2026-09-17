package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bmd {
    private Class a;
    private Class b;
    private Class c;

    public bmd() {
    }

    public bmd(Class cls, Class cls2, Class cls3) {
        a(cls, cls2, cls3);
    }

    public final void a(Class cls, Class cls2, Class cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bmd bmdVar = (bmd) obj;
        return this.a.equals(bmdVar.a) && this.b.equals(bmdVar.b) && bmf.l(this.c, bmdVar.c);
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        Class cls = this.c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 30 + String.valueOf(strValueOf2).length());
        sb.append("MultiClassKey{first=");
        sb.append(strValueOf);
        sb.append(", second=");
        sb.append(strValueOf2);
        sb.append('}');
        return sb.toString();
    }
}
