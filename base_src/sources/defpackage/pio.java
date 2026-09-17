package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class pio extends phs {
    final /* synthetic */ pip a;
    private final Callable b;

    public pio(pip pipVar, Callable callable) {
        this.a = pipVar;
        callable.getClass();
        this.b = callable;
    }

    @Override // defpackage.phs
    public final Object a() {
        return this.b.call();
    }

    @Override // defpackage.phs
    public final String b() {
        return this.b.toString();
    }

    @Override // defpackage.phs
    public final void d(Throwable th) {
        this.a.a(th);
    }

    @Override // defpackage.phs
    public final void e(Object obj) {
        this.a.o(obj);
    }

    @Override // defpackage.phs
    public final boolean g() {
        return this.a.isDone();
    }
}
