package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class luq extends maa {
    private final lie a;

    public luq(mad madVar, lie lieVar) {
        super(madVar);
        this.a = lieVar;
    }

    @Override // defpackage.maa, defpackage.lie, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a.close();
    }
}
