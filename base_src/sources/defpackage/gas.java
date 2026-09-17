package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class gas implements gey {
    public final gey a;
    public final hcg b;
    private final Handler c;

    public gas(gey geyVar, Handler handler, hcg hcgVar) {
        this.a = geyVar;
        this.c = handler;
        this.b = hcgVar;
    }

    @Override // defpackage.gey
    public final int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.gey
    public final synchronized void b(lmr lmrVar, gfs gfsVar, gfi gfiVar, final gex gexVar) {
        final gar garVar = new gar(this, lmrVar, gfsVar, gfiVar);
        this.c.postDelayed(new Runnable() { // from class: gap
            @Override // java.lang.Runnable
            public final void run() {
                gexVar.c(garVar);
            }
        }, 100L);
    }

    @Override // defpackage.gey
    public final boolean c(lmr lmrVar, hcg hcgVar) {
        return this.a.c(lmrVar, hcgVar);
    }
}
