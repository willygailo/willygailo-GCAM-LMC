package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
final class fdk implements avu {
    final /* synthetic */ fdm a;

    public fdk(fdm fdmVar) {
        this.a = fdmVar;
    }

    @Override // defpackage.avu
    public final void a(boolean z, awl awlVar) {
        fdt fdtVar = this.a.h;
        feg fegVar = fdtVar.b;
        if (fegVar != null) {
            fegVar.b();
            fdtVar.b.e();
            fdtVar.c = SystemClock.elapsedRealtimeNanos();
            fcz.p(fdtVar.b.k);
            fdtVar.g = true;
            fdtVar.h = false;
        }
        this.a.v = false;
    }
}
