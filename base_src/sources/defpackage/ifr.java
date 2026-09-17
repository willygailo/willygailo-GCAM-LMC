package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class ifr implements iho {
    private final ljf a;
    private final ifn b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public ifr(ifn ifnVar, ljf ljfVar) {
        this.b = ifnVar;
        this.a = ljfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c.getAndSet(true)) {
            return;
        }
        this.a.e("AudioInit");
        this.b.d();
        this.a.f();
    }
}
