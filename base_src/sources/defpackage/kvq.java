package defpackage;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public final class kvq implements kvi, kvf {
    public final CountDownLatch a = new CountDownLatch(1);

    @Override // defpackage.kvf
    public final void a(Exception exc) {
        this.a.countDown();
    }

    @Override // defpackage.kvi
    public final void b(Object obj) {
        this.a.countDown();
    }
}
