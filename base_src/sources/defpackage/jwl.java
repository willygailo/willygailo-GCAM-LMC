package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class jwl extends mip {
    final /* synthetic */ jwm a;
    private final lmr b;
    private final boolean c;
    private final lji d;

    public jwl(jwm jwmVar, lmr lmrVar, boolean z) {
        this.a = jwmVar;
        this.b = lmrVar;
        this.c = z;
        this.d = jwmVar.d.a(true != z ? "VFE.FrameToImg" : "VFE.FrameToMd");
    }

    @Override // defpackage.mip
    public final void fF() {
        if (this.c) {
            return;
        }
        this.d.a();
        this.a.e(this.b);
    }

    @Override // defpackage.mip
    public final void fy() {
        if (this.c) {
            this.d.a();
            this.a.e(this.b);
        }
    }

    @Override // defpackage.mip
    public final Executor t() {
        return this.a.b;
    }
}
