package defpackage;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
final class ljb implements ljk {
    private final String b;
    private final AtomicInteger c = new AtomicInteger(0);

    public ljb(String str) {
        this.b = str;
    }

    @Override // defpackage.ljk
    public final void a() {
        Trace.setCounter(this.b, this.c.decrementAndGet());
    }

    @Override // defpackage.ljk
    public final void b() {
        Trace.setCounter(this.b, this.c.incrementAndGet());
    }

    @Override // defpackage.ljk
    public final void c(int i) {
        this.c.set(i);
        Trace.setCounter(this.b, this.c.get());
    }
}
