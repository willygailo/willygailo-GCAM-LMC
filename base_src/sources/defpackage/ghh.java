package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
final class ghh implements phh {
    final /* synthetic */ bws a;
    final /* synthetic */ fwb b;
    final /* synthetic */ lap c;
    final /* synthetic */ ghj d;

    public ghh(ghj ghjVar, bws bwsVar, fwb fwbVar, lap lapVar) {
        this.d = ghjVar;
        this.a = bwsVar;
        this.b = fwbVar;
        this.c = lapVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        if (!(th instanceof CancellationException)) {
            ((oug) ((oug) ((oug) ghj.a.c()).h(th)).G((char) 2070)).o("OneCamera failed to open, closing lifetime.");
        }
        this.c.close();
        this.b.a(new llv("OneCamera failed to open"));
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        gfu gfuVar = (gfu) obj;
        gfuVar.getClass();
        ghj ghjVar = this.d;
        ghjVar.d = gfuVar;
        ghjVar.c = null;
        if (this.a.a()) {
            return;
        }
        fwb fwbVar = this.b;
        ghj ghjVar2 = this.d;
        fwbVar.b(new fwc(ghjVar2.d, this.c, ghjVar2.f, ghjVar2.g));
    }
}
