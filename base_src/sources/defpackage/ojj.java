package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ojj extends ojc {
    private static final long serialVersionUID = 0;
    public final Object a;

    public ojj(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.ojc
    public final ojc a(ojc ojcVar) {
        return this;
    }

    @Override // defpackage.ojc
    public final ojc b(oiu oiuVar) {
        Object objA = oiuVar.a(this.a);
        objA.getClass();
        return new ojj(objA);
    }

    @Override // defpackage.ojc
    public final Object c() {
        return this.a;
    }

    @Override // defpackage.ojc
    public final Object d(ojz ojzVar) {
        return this.a;
    }

    @Override // defpackage.ojc
    public final Object e(Object obj) {
        obj.getClass();
        return this.a;
    }

    @Override // defpackage.ojc
    public final boolean equals(Object obj) {
        if (obj instanceof ojj) {
            return this.a.equals(((ojj) obj).a);
        }
        return false;
    }

    @Override // defpackage.ojc
    public final Object f() {
        return this.a;
    }

    @Override // defpackage.ojc
    public final boolean g() {
        return true;
    }

    @Override // defpackage.ojc
    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    @Override // defpackage.ojc
    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
