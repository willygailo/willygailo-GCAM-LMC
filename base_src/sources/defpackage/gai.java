package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class gai extends maa {
    final AtomicBoolean a;
    final /* synthetic */ long b;
    final /* synthetic */ mad c;
    final /* synthetic */ gaj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gai(gaj gajVar, mad madVar, long j, mad madVar2) {
        super(madVar);
        this.d = gajVar;
        this.b = j;
        this.c = madVar2;
        this.a = new AtomicBoolean(false);
    }

    @Override // defpackage.maa, defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        if (!this.a.getAndSet(true)) {
            this.d.c.b.a(new Object[0]);
            this.d.c.d.b(SystemClock.elapsedRealtime() - this.b, new Object[0]);
        }
        this.c.close();
    }
}
