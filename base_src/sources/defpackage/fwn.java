package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fwn implements gft, lie {
    private gft a;

    public fwn(gft gftVar) {
        this.a = gftVar;
    }

    @Override // defpackage.gft
    public final synchronized void A() {
        gft gftVar = this.a;
        if (gftVar != null) {
            gftVar.A();
        }
    }

    @Override // defpackage.gft
    public final synchronized void B() {
        gft gftVar = this.a;
        if (gftVar != null) {
            gftVar.B();
        }
    }

    @Override // defpackage.gft
    public final synchronized void D(float f) {
        gft gftVar = this.a;
        if (gftVar != null) {
            gftVar.D(f);
        }
    }

    @Override // defpackage.gft
    public final synchronized void E(float f, int i) {
    }

    @Override // defpackage.gft
    public final synchronized void F(float f, long j) {
        gft gftVar = this.a;
        if (gftVar != null) {
            gftVar.F(f, j);
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a = null;
    }
}
