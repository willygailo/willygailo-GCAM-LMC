package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class lbw implements lie, lby {
    private final lie a;
    private final String b = "OneCameraLifetime";

    public lbw(lie lieVar) {
        this.a = lieVar;
    }

    @Override // defpackage.lby
    public final String b() {
        return this.b;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
