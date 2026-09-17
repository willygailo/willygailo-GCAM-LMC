package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class frc implements msr {
    public final mln a;
    private final AtomicBoolean c = new AtomicBoolean();
    public final pih b = pih.f();

    public frc(mln mlnVar) {
        this.a = mlnVar;
    }

    @Override // defpackage.msr
    public final msx a(msw mswVar) {
        if (this.c.getAndSet(true)) {
            throw new IllegalStateException("Added more than one track");
        }
        this.a.a(mswVar.a);
        return new frb(this);
    }

    @Override // defpackage.msr
    public final pht b() {
        return this.b;
    }

    @Override // defpackage.msr
    public final void c() {
        if (!this.c.get()) {
            throw new IllegalStateException("Staring with no track added");
        }
    }
}
