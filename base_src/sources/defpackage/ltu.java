package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ltu implements lij {
    final /* synthetic */ lty a;
    final /* synthetic */ ltv b;
    private boolean c = true;

    public ltu(ltv ltvVar, lty ltyVar) {
        this.b = ltvVar;
        this.a = ltyVar;
    }

    @Override // defpackage.lij
    public final /* bridge */ /* synthetic */ void fB(Object obj) {
        String string;
        ojc ojcVar = (ojc) obj;
        if (this.c) {
            this.c = false;
        } else {
            lis lisVar = this.b.c;
            String strValueOf = String.valueOf(this.a);
            if (ojcVar.g()) {
                String strValueOf2 = String.valueOf(ojcVar.c());
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf2).length() + 7);
                sb.append("set to ");
                sb.append(strValueOf2);
                string = sb.toString();
            } else {
                string = "destroyed.";
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 17 + String.valueOf(string).length());
            sb2.append("Surface for ");
            sb2.append(strValueOf);
            sb2.append(" was ");
            sb2.append(string);
            lisVar.f(sb2.toString());
        }
        this.b.e();
    }
}
