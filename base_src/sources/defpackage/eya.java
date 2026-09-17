package defpackage;

import com.custom.Astro;
import com.custom.OneShot;

/* JADX INFO: loaded from: classes3.dex */
final class eya implements eak {
    final /* synthetic */ eyg a;

    public eya(eyg eygVar) {
        this.a = eygVar;
    }

    @Override // defpackage.eak
    public final void a(boolean z, final boolean z2, boolean z3, boolean z4) {
        fwc fwcVar = this.a.T;
        if (fwcVar == null) {
            return;
        }
        int i = 1;
        int i2 = 0;
        boolean z5 = z4 && ((Boolean) fwcVar.b().fA()).booleanValue() && !this.a.K;
        if (z3 && z5) {
            lar larVar = this.a.f;
            if (Astro.AstroState == 0 && OneShot.OneShotState == 0) {
                larVar.execute(new exy(this, i));
                return;
            } else {
                larVar.execute(new exy(this, 4));
                return;
            }
        }
        if (z && !z4) {
            this.a.f.execute(new exy(this, i2));
            return;
        }
        if (z && z5) {
            this.a.f.execute(new exy(this, 4));
        } else {
            if (z || !z5) {
                return;
            }
            this.a.f.execute(new Runnable() { // from class: exz
                @Override // java.lang.Runnable
                public final void run() {
                    eya eyaVar = this.a;
                    if (z2) {
                        fks fksVar = eyaVar.a.O;
                        fksVar.g(fksVar.c);
                    } else {
                        fks fksVar2 = eyaVar.a.O;
                        jgu jguVar = fksVar2.l;
                        if (jguVar == null || jguVar != fksVar2.e) {
                            fksVar2.f();
                        }
                    }
                    eyg eygVar = eyaVar.a;
                    if (eygVar.G) {
                        if (eygVar.q.fA() == hti.OFF) {
                            eyaVar.a.v.k();
                            eyaVar.a.E.q(false);
                            if (eyaVar.a.k.c() == eyg.c.floatValue()) {
                                eyaVar.a.k.o();
                                eyaVar.a.k.h();
                            }
                        } else {
                            eyg eygVar2 = eyaVar.a;
                            eygVar2.v.ak((hti) eygVar2.q.fA());
                        }
                        eyaVar.a.G = false;
                    }
                }
            });
        }
    }

    @Override // defpackage.eak
    public final /* synthetic */ void b(boolean z) {
    }

    @Override // defpackage.eak
    public final void c() {
        if (this.a.z.n()) {
            this.a.f.execute(new exy(this, 2));
        }
    }

    @Override // defpackage.eak
    public final void d() {
        this.a.f.execute(new exy(this, 3));
    }
}
