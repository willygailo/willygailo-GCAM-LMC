package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class guy implements lie {
    final /* synthetic */ lyy a;
    final /* synthetic */ guz b;

    public guy(guz guzVar, lyy lyyVar) {
        this.b = guzVar;
        this.a = lyyVar;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.b.a.c(this.a);
    }
}
