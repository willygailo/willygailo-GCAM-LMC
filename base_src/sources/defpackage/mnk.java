package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class mnk extends mmh {
    final /* synthetic */ int a;
    final /* synthetic */ mnm b;

    public mnk(mnm mnmVar, int i) {
        this.b = mnmVar;
        this.a = i;
    }

    @Override // defpackage.mmh
    public final void b(Object obj) {
        mnm mnmVar = this.b;
        mnmVar.b[this.a] = obj;
        mnmVar.a();
    }
}
