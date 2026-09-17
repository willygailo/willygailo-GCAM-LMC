package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class lhh implements Callable {
    final /* synthetic */ lhk a;

    public lhh(lhk lhkVar) {
        this.a = lhkVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.a.close();
        return null;
    }
}
