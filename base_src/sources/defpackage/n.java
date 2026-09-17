package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class n extends o {
    private static final long serialVersionUID = 7766999779862263523L;

    public n(p pVar, p pVar2) {
        super(pVar, pVar2);
    }

    @Override // defpackage.p
    public final boolean a(q qVar) {
        return this.a.a(qVar) && this.b.a(qVar);
    }

    public final String toString() {
        String string = this.a.toString();
        String string2 = this.b.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 5 + String.valueOf(string2).length());
        sb.append(string);
        sb.append(" and ");
        sb.append(string2);
        return sb.toString();
    }
}
