package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
final class eif implements lht {
    final /* synthetic */ hhn a;
    final /* synthetic */ eig b;
    final /* synthetic */ int c;

    public eif(eig eigVar, hhn hhnVar, int i) {
        this.b = eigVar;
        this.a = hhnVar;
        this.c = i;
    }

    @Override // defpackage.lht
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.a.e(this);
        this.b.G = SystemClock.uptimeMillis();
        eig eigVar = this.b;
        fjs fjsVar = eigVar.i;
        int i = this.c;
        eigVar.I.c();
        eig eigVar2 = this.b;
        fjsVar.at(i, eigVar2.G - eigVar2.F, Math.max(eigVar2.E - eigVar2.D, 0L), this.b.b(), ((Boolean) this.b.h.fA()).booleanValue());
        synchronized (this.b.l) {
            eig eigVar3 = this.b;
            eigVar3.l.remove(eigVar3.I.a());
        }
    }
}
