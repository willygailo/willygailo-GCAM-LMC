package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class fzt implements lij {
    final /* synthetic */ cpl a;
    final /* synthetic */ fzx b;
    private final lda c = new lce(ldz.FPS_AUTO);
    private final AtomicBoolean d = new AtomicBoolean(true);

    public fzt(fzx fzxVar, cpl cplVar) {
        this.b = fzxVar;
        this.a = cplVar;
    }

    @Override // defpackage.lij
    public final /* bridge */ /* synthetic */ void fB(Object obj) {
        ldz ldzVar;
        htg htgVar = (htg) obj;
        synchronized (this.b.m) {
            htg htgVar2 = htg.FPS_AUTO;
            switch (htgVar) {
                case FPS_AUTO:
                    ldzVar = ldz.FPS_AUTO;
                    break;
                case FPS_24:
                    ldzVar = this.b.f.a() != cqj.CINEMATIC ? ldz.FPS_24 : ldz.FPS_60C_24E;
                    break;
                case FPS_30:
                    ldzVar = this.b.f.a() != cqj.CINEMATIC ? ldz.FPS_30 : ldz.FPS_60C_30E;
                    break;
                case FPS_60:
                    ldzVar = ldz.FPS_60;
                    break;
                default:
                    String strValueOf = String.valueOf(htgVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 23);
                    sb.append("Unsupported FPS option ");
                    sb.append(strValueOf);
                    throw new IllegalArgumentException(sb.toString());
            }
            if (this.d.compareAndSet(true, false)) {
                this.c.fB(ldzVar);
                return;
            }
            if (ldzVar == ((lce) this.c).d) {
                ((oug) ((oug) fzx.b.b()).G((char) 2022)).r("changeCaptureRate() do nothing since captureRate [%s] does not change", ldzVar);
            } else {
                Object obj2 = ((lce) this.c).d;
                this.c.fB(ldzVar);
                cpl cplVarA = this.b.c.a(jrl.VIDEO);
                this.a.fB(ldzVar);
                if (cplVarA == this.a) {
                    leb lebVar = (leb) this.b.k.a.fA();
                    if (!this.b.i.j() || lebVar != leb.RES_2160P) {
                        if (this.b.j.k(dcu.X) && this.b.j.k(dcu.E)) {
                            if ((this.a instanceof cph) && lebVar == leb.RES_1080P) {
                                this.b.h.fB(ldzVar == ldz.FPS_AUTO ? ldz.FPS_30 : ldzVar);
                            }
                            if ((this.a instanceof cpi) && lebVar == leb.RES_2160P) {
                                this.b.g.fB(ldzVar);
                            }
                        }
                        ((jnw) this.b.e).get().e.n(jrl.VIDEO, new Runnable() { // from class: fzs
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.a.b.l.p(4);
                            }
                        });
                    }
                }
            }
        }
    }
}
