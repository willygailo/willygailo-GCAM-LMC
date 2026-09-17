package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class gal implements gey {
    public final lyb a;
    public final lyb b;
    public final lyg c;
    public final lyg d;
    private final gey e;
    private final lyb f;

    public gal(lyp lypVar, gey geyVar) {
        this.e = geyVar;
        this.f = lypVar.a("/gca/moments/hdr_launch_count", new lyd[0]);
        this.a = lypVar.a("/gca/moments/hdr_finish_count", lyd.b("result"));
        this.b = lypVar.a("/gca/moments/hdr_images_closed_count", new lyd[0]);
        this.c = lypVar.b("/gca/moments/hdr_processing_time_ms", lyd.b("result"));
        this.d = lypVar.b("/gca/moments/hdr_result_open_ms", new lyd[0]);
    }

    @Override // defpackage.gey
    public final int a() {
        this.e.a();
        return 1;
    }

    @Override // defpackage.gey
    public final void b(lmr lmrVar, gfs gfsVar, gfi gfiVar, gex gexVar) {
        this.e.b(lmrVar, gfsVar, gfiVar, new gaj(this, SystemClock.elapsedRealtime(), gexVar));
        this.f.a(new Object[0]);
    }

    @Override // defpackage.gey
    public final boolean c(lmr lmrVar, hcg hcgVar) {
        return true;
    }
}
