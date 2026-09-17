package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class bc implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ dp b;

    public bc(List list, dp dpVar) {
        this.a = list;
        this.b = dpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.contains(this.b)) {
            this.a.remove(this.b);
            dq.f(this.b);
        }
    }
}
