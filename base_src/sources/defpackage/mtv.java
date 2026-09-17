package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mtv implements mtu {
    final /* synthetic */ mtu a;
    final /* synthetic */ Iterable b;
    private final boolean c = false;

    public mtv(mtu mtuVar, Iterable iterable) {
        this.a = mtuVar;
        this.b = iterable;
    }

    @Override // defpackage.mtu, defpackage.mls
    public final synchronized mne a() {
        return mne.i(this.a.a().g(pgr.INSTANCE, new mtw(this.b)));
    }

    @Override // defpackage.mtu
    public final Object c() {
        return this.a.c();
    }

    @Override // defpackage.mtu, defpackage.mmc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        mip.ac(a());
    }

    @Override // defpackage.mtu
    public final synchronized Object gx() {
        throw null;
    }
}
