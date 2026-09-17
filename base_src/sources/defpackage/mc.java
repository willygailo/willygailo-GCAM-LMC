package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
final class mc implements Runnable {
    final /* synthetic */ mh a;
    private final mf b;

    public mc(mh mhVar, mf mfVar) {
        this.a = mhVar;
        this.b = mfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ku kuVar;
        kw kwVar = this.a.c;
        if (kwVar != null && (kuVar = kwVar.b) != null) {
            kuVar.C(kwVar);
        }
        View view = (View) this.a.f;
        if (view != null && view.getWindowToken() != null && this.b.h()) {
            this.a.i = this.b;
        }
        this.a.k = null;
    }
}
