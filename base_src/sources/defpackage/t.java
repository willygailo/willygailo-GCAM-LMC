package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class t extends o {
    private static final long serialVersionUID = 1405488568664762222L;

    public t(p pVar, p pVar2) {
        super(pVar, pVar2);
    }

    @Override // defpackage.p
    public final boolean a(q qVar) {
        return this.a.a(qVar) || this.b.a(qVar);
    }

    public final String toString() {
        String string = this.a.toString();
        String string2 = this.b.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 4 + String.valueOf(string2).length());
        sb.append(string);
        sb.append(" or ");
        sb.append(string2);
        return sb.toString();
    }
}
