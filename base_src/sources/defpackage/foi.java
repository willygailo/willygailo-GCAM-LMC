package defpackage;

import android.os.SystemClock;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class foi implements fuv {
    final /* synthetic */ gfg a;
    final /* synthetic */ fuv b;
    final /* synthetic */ fns c;
    final /* synthetic */ fot d;
    final /* synthetic */ boolean e;
    final /* synthetic */ mlk f;
    final /* synthetic */ FileOutputStream g;
    final /* synthetic */ fou h;

    public foi(fou fouVar, gfg gfgVar, fuv fuvVar, fns fnsVar, fot fotVar, boolean z, mlk mlkVar, FileOutputStream fileOutputStream) {
        this.h = fouVar;
        this.a = gfgVar;
        this.b = fuvVar;
        this.c = fnsVar;
        this.d = fotVar;
        this.e = z;
        this.f = mlkVar;
        this.g = fileOutputStream;
    }

    @Override // defpackage.fuv
    public final void a(fuj fujVar) {
        boolean zK = this.h.l.k(ddr.w);
        if (!this.e || zK) {
            this.a.a();
            this.b.a(fujVar);
            this.f.c();
            this.c.a();
            if (!this.h.l.k(ddr.z)) {
                try {
                    this.g.close();
                } catch (IOException e) {
                    ((oug) ((oug) ((oug) fou.a.c()).h(e)).G(1788)).r("Failed to close %s", this.g);
                }
            }
        }
        if (this.e && zK) {
            if (this.d.q.g()) {
                this.h.t.a(((fmp) this.d.q.c()).a);
            } else {
                ((oug) ((oug) fou.a.c()).G((char) 1787)).o("Didn't take second shot since UI resources are missing");
            }
        }
        this.d.q = oih.a;
    }

    @Override // defpackage.fuv
    public final void b(long j, fuz fuzVar) {
        this.a.b(j);
        this.b.b(j, fuzVar);
        this.c.a();
        this.d.r = ojc.i(Long.valueOf(SystemClock.elapsedRealtime()));
        final fot fotVar = this.d;
        if (!fotVar.p) {
            fotVar.q = oih.a;
            return;
        }
        final fou fouVar = this.h;
        obr.aQ(true);
        fouVar.p.postDelayed(new Runnable() { // from class: foe
            @Override // java.lang.Runnable
            public final void run() {
                fou fouVar2 = fouVar;
                fot fotVar2 = fotVar;
                if (fotVar2.l.get()) {
                    return;
                }
                ((oug) ((oug) fou.a.b()).G(1817)).r("Long Shot with uri %s timed out.", fotVar2.a);
                fouVar2.j.c();
            }
        }, fotVar.a, 15000L);
        fou.e(fotVar.g, fotVar.a, fouVar.p);
    }
}
