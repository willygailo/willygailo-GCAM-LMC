package defpackage;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class exd implements epk {
    final /* synthetic */ fjs a;
    final /* synthetic */ fwk b;
    final /* synthetic */ jlb c;
    final /* synthetic */ AtomicBoolean d;
    final /* synthetic */ exi e;
    final /* synthetic */ jrh f;

    public exd(exi exiVar, fjs fjsVar, fwk fwkVar, jrh jrhVar, jlb jlbVar, AtomicBoolean atomicBoolean) {
        this.e = exiVar;
        this.a = fjsVar;
        this.b = fwkVar;
        this.f = jrhVar;
        this.c = jlbVar;
        this.d = atomicBoolean;
    }

    @Override // defpackage.epk
    public final pht a(int i) {
        this.e.H(false);
        switch (i - 1) {
            case 1:
                this.a.aj(4, System.currentTimeMillis());
                break;
            default:
                this.a.aj(5, System.currentTimeMillis());
                break;
        }
        return this.b.a(i);
    }

    @Override // defpackage.epk
    public final pht b(int i) {
        if (!this.f.h) {
            pht phtVarB = this.b.b(i);
            mip.bV(Looper.getMainLooper()).post(new Runnable() { // from class: exc
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.e.H(true);
                }
            });
            return phtVarB;
        }
        this.a.aj(2, System.currentTimeMillis());
        this.f.a();
        this.c.S();
        if (!this.d.get()) {
            this.e.A.c();
        }
        return plk.V(true);
    }
}
