package defpackage;

import com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker;

/* JADX INFO: loaded from: classes2.dex */
final class nrx extends qnp implements qmj {
    final /* synthetic */ nsb a;
    final /* synthetic */ aml b;
    final /* synthetic */ nrl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nrx(nsb nsbVar, aml amlVar, nrl nrlVar) {
        super(0);
        this.a = nsbVar;
        this.b = amlVar;
        this.c = nrlVar;
    }

    @Override // defpackage.qmj
    public final /* bridge */ /* synthetic */ Object invoke() {
        nsb nsbVar = this.a;
        and andVar = (and) nsbVar.a.get();
        ane aneVar = new ane(F250Worker.class);
        aml amlVar = this.b;
        aneVar.b.i = amlVar;
        aneVar.b(String.valueOf(amlVar.hashCode()));
        ana anaVarC = andVar.c("F250_WORKER_TAG", 2, aneVar.a());
        anaVarC.getClass();
        return nsbVar.c(anaVarC, this.c, 5);
    }
}
