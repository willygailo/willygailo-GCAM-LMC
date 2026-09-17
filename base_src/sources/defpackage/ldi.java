package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class ldi extends lce {
    public int a;
    public volatile Object e;

    public ldi(Object obj) {
        super(obj);
        this.e = null;
    }

    public ldi(Object obj, ldb ldbVar) {
        super(obj, ldbVar);
        this.e = null;
    }

    @Override // defpackage.lce
    public final void c(Object obj) {
        if (this.a > 0) {
            this.e = obj;
        } else {
            if (obr.bc(this.d, obj)) {
                return;
            }
            super.c(obj);
        }
    }

    public final lie d() {
        this.c.execute(new ldh(this, 1));
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        return new lie() { // from class: ldg
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                ldi ldiVar = this.a;
                if (atomicBoolean.getAndSet(true)) {
                    return;
                }
                ldiVar.c.execute(new ldh(ldiVar, 0));
            }
        };
    }
}
