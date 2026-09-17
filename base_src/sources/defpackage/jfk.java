package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jfk {
    public final fjs a;
    public final jrl b;
    public final jrl c;
    public final ijs d;

    public jfk(fjs fjsVar, ijn ijnVar, jrl jrlVar, jrl jrlVar2) {
        this.a = fjsVar;
        this.b = jrlVar;
        this.c = jrlVar2;
        this.d = (ijs) ijnVar.a();
        String strValueOf = String.valueOf(jrlVar);
        String strValueOf2 = String.valueOf(jrlVar2);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 4 + String.valueOf(strValueOf2).length());
        sb.append(strValueOf);
        sb.append(" -> ");
        sb.append(strValueOf2);
        String.valueOf(sb.toString()).length();
    }
}
