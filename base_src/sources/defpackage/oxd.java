package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
final class oxd extends oxh {
    public static final oxd a = new oxd(oxj.a);
    public final AtomicReference b;

    public oxd(oxh oxhVar) {
        this.b = new AtomicReference(oxhVar);
    }

    @Override // defpackage.oxh
    public final ovv a() {
        return ((oxh) this.b.get()).a();
    }

    @Override // defpackage.oxh
    public final oxp b() {
        return ((oxh) this.b.get()).b();
    }

    @Override // defpackage.oxh
    public final void c(String str, Level level, boolean z) {
        ((oxh) this.b.get()).c(str, level, z);
    }
}
