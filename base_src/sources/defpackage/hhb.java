package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hhb implements lij {
    final /* synthetic */ hhe a;

    public hhb(hhe hheVar) {
        this.a = hheVar;
    }

    @Override // defpackage.lij
    public final /* bridge */ /* synthetic */ void fB(Object obj) {
        synchronized (this.a.d) {
            hhe hheVar = this.a;
            if (!hheVar.e && ((Boolean) ((lce) hheVar.c).d).booleanValue()) {
                this.a.c();
            }
        }
    }
}
