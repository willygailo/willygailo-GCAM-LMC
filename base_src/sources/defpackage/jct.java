package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class jct implements Callable {
    final /* synthetic */ jcw a;

    public jct(jcw jcwVar) {
        this.a = jcwVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.a.d().onPause();
        return null;
    }
}
