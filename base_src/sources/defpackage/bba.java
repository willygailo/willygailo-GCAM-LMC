package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
final class bba extends WeakReference {
    final azp a;
    final boolean b;
    bcl c;

    public bba(azp azpVar, bce bceVar, ReferenceQueue referenceQueue) {
        super(bceVar, referenceQueue);
        aae.s(azpVar);
        this.a = azpVar;
        this.c = null;
        this.b = bceVar.a;
    }

    final void a() {
        this.c = null;
        clear();
    }
}
