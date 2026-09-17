package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class evd implements qkg {
    final /* synthetic */ evh a;

    public evd(evh evhVar) {
        this.a = evhVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final evx get() {
        evh evhVar = this.a;
        return new evx(evhVar.a, evhVar.b, evhVar.c);
    }
}
