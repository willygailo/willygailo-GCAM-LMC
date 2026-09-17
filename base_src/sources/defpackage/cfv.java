package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class cfv implements phh {
    final /* synthetic */ List a;
    final /* synthetic */ cfy b;

    public cfv(cfy cfyVar, List list) {
        this.b = cfyVar;
        this.a = list;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        this.b.D.l(cms.RECORDING_SESSION);
        ((oug) ((oug) ((oug) cfy.a.b()).h(th)).G((char) 345)).o("Failed to stop recording.");
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        clf clfVar = (clf) obj;
        this.b.D.l(cms.RECORDING_SESSION);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((chy) it.next()).i(clfVar);
        }
    }
}
