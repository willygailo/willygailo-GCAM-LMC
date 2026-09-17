package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class qdb implements Callable, qco {
    public final Object a;

    public qdb(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.qco
    public final Object a(Object obj) {
        return this.a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a;
    }
}
