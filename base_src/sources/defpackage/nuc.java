package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class nuc extends plk {
    public final qbm a;
    public qbn b;

    public nuc(pvn pvnVar) {
        qgk qgkVar = new qgk(new qgj(new AtomicReference()), qbm.a(new nub(this, pvnVar)));
        qco qcoVar = qmd.k;
        qgn qgnVar = new qgn(qgkVar.a);
        qco qcoVar2 = qmd.k;
        qgq qgqVar = new qgq(qgnVar);
        qco qcoVar3 = qmd.j;
        this.a = qgqVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(pvn pvnVar, pvp pvpVar) {
        pvo pvoVar = pvpVar.a;
        ((ovg) nuf.a.c()).A("%s error from %s: %s", pvoVar == null ? null : pvoVar.name(), pvnVar.c(), pvpVar.getMessage());
        qbn qbnVar = this.b;
        if (qbnVar != null) {
            int i = 29;
            if (pvoVar != null) {
                switch (pvoVar) {
                    case BAD_URL:
                        i = 27;
                        break;
                    case CANCELED:
                        i = 26;
                        break;
                    case REQUEST_BODY_READ_ERROR:
                        i = 30;
                        break;
                    case CONNECTION_ERROR:
                        i = 28;
                        break;
                    case SERVER_ERROR:
                        break;
                    case UNKNOWN:
                        i = 31;
                        break;
                    default:
                        throw new qkk();
                }
            }
            qbnVar.c(new nui(i, pvpVar));
        }
        qbn qbnVar2 = this.b;
        if (qbnVar2 == null) {
            return;
        }
        qbnVar2.a();
    }

    @Override // defpackage.plk
    public final void b(pvn pvnVar) {
        qbn qbnVar = this.b;
        if (qbnVar == null) {
            return;
        }
        qbnVar.c(new nuk(pvnVar.a()));
    }
}
