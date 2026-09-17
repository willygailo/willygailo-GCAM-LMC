package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class evg implements qkg {
    final /* synthetic */ evh a;

    public evg(evh evhVar) {
        this.a = evhVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final evz get() {
        evh evhVar = this.a;
        return new evz(evhVar.a, evhVar.b, evhVar.c);
    }
}
