package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
final class kqs implements phh {
    final /* synthetic */ kqt a;
    final /* synthetic */ krd b;

    public kqs(kqt kqtVar, krd krdVar) {
        this.a = kqtVar;
        this.b = krdVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        Log.e("ExampleIterator", "Failed to get results", th);
        this.b.a(okd.b(th));
    }

    @Override // defpackage.phh
    public final void b(Object obj) {
        synchronized (this.a.a) {
            if (this.a.a.isEmpty()) {
                this.b.b(null, null);
            } else {
                ojd ojdVar = (ojd) this.a.a.removeFirst();
                this.b.b((byte[]) ojdVar.b, ((plq) ojdVar.a).g());
            }
        }
    }
}
