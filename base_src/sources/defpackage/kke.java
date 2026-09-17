package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
final class kke implements Runnable {
    final /* synthetic */ khi a;
    final /* synthetic */ kkf b;

    public kke(kkf kkfVar, khi khiVar) {
        this.b = kkfVar;
        this.a = khiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kkf kkfVar = this.b;
        kkc kkcVar = (kkc) kkfVar.e.l.get(kkfVar.b);
        if (kkcVar == null) {
            return;
        }
        if (!this.a.c()) {
            kkcVar.i(this.a);
            return;
        }
        kkf kkfVar2 = this.b;
        kkfVar2.d = true;
        if (kkfVar2.a.n()) {
            this.b.c();
            return;
        }
        try {
            kie kieVar = this.b.a;
            kieVar.r(null, kieVar.g());
        } catch (SecurityException e) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
            this.b.a.j("Failed to get service from broker.");
            kkcVar.i(new khi(10));
        }
    }
}
