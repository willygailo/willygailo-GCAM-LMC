package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class jiq implements Runnable {
    final /* synthetic */ List a;

    public jiq(List list) {
        this.a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((jik) it.next()).a();
        }
    }
}
