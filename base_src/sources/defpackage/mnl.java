package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class mnl extends mmh {
    final /* synthetic */ int a;
    final /* synthetic */ mnm b;

    public mnl(mnm mnmVar, int i) {
        this.b = mnmVar;
        this.a = i;
    }

    @Override // defpackage.mmh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        mnm mnmVar = this.b;
        mnmVar.c[this.a] = (mnc) obj;
        mnmVar.d = true;
        this.b.a();
    }
}
