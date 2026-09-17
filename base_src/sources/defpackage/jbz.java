package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class jbz implements pys {
    private final qkg a;

    public jbz(qkg qkgVar) {
        this.a = qkgVar;
    }

    public static ojz b(final AtomicReference atomicReference) {
        return new ojz() { // from class: jbx
            @Override // defpackage.ojz
            public final Object a() {
                return (jbw) atomicReference.get();
            }
        };
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ojz get() {
        return b((AtomicReference) this.a.get());
    }
}
