package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class gqw implements lda {
    public final ghx a;
    private final boolean b;
    private final gqv c;
    private final gqv d;

    public gqw(lda ldaVar, lda ldaVar2, ghx ghxVar, gqt gqtVar) {
        this.a = ghxVar;
        this.c = new gqv(ldaVar, gqtVar);
        this.d = new gqv(ldaVar2, gqtVar);
        this.b = ghxVar.H();
    }

    @Override // defpackage.lco
    public final lie a(final lij lijVar, Executor executor) {
        lap lapVar = new lap();
        final int i = 1;
        lapVar.c(this.c.a(new lij(this) { // from class: gqu
            public final /* synthetic */ gqw a;

            {
                this.a = this;
            }

            @Override // defpackage.lij
            public final void fB(Object obj) {
                switch (i) {
                    case 0:
                        gqw gqwVar = this.a;
                        lij lijVar2 = lijVar;
                        gqt gqtVar = (gqt) obj;
                        if (gqwVar.a.k() == lwd.FRONT) {
                            lijVar2.fB(gqtVar);
                        }
                        break;
                    default:
                        gqw gqwVar2 = this.a;
                        lij lijVar3 = lijVar;
                        gqt gqtVar2 = (gqt) obj;
                        if (gqwVar2.a.k() == lwd.BACK) {
                            lijVar3.fB(gqtVar2);
                        }
                        break;
                }
            }
        }, executor));
        final int i2 = 0;
        lapVar.c(this.d.a(new lij(this) { // from class: gqu
            public final /* synthetic */ gqw a;

            {
                this.a = this;
            }

            @Override // defpackage.lij
            public final void fB(Object obj) {
                switch (i2) {
                    case 0:
                        gqw gqwVar = this.a;
                        lij lijVar2 = lijVar;
                        gqt gqtVar = (gqt) obj;
                        if (gqwVar.a.k() == lwd.FRONT) {
                            lijVar2.fB(gqtVar);
                        }
                        break;
                    default:
                        gqw gqwVar2 = this.a;
                        lij lijVar3 = lijVar;
                        gqt gqtVar2 = (gqt) obj;
                        if (gqwVar2.a.k() == lwd.BACK) {
                            lijVar3.fB(gqtVar2);
                        }
                        break;
                }
            }
        }, executor));
        return lapVar;
    }

    @Override // defpackage.lco
    public final /* bridge */ /* synthetic */ Object fA() {
        if (this.b) {
            return this.a.k() == lwd.FRONT ? (gqt) this.d.fA() : (gqt) this.c.fA();
        }
        return gqt.OFF;
    }

    @Override // defpackage.lij
    public final /* bridge */ /* synthetic */ void fB(Object obj) {
        gqt gqtVar = (gqt) obj;
        if (this.a.k() == lwd.FRONT) {
            this.d.fB(gqtVar);
        } else {
            this.c.fB(gqtVar);
        }
    }
}
