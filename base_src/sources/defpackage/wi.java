package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wi extends Thread {
    final /* synthetic */ qpc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi(qpc qpcVar, Runnable runnable) {
        super(runnable);
        this.a = qpcVar;
        setName(qno.a("CXCP-IO-", qno.p(String.valueOf(qpcVar.c()))));
    }
}
