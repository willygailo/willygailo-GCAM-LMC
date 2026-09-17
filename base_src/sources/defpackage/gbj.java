package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
final class gbj implements gbg {
    final /* synthetic */ AtomicInteger a;
    final /* synthetic */ gbg b;

    public gbj(AtomicInteger atomicInteger, gbg gbgVar) {
        this.a = atomicInteger;
        this.b = gbgVar;
    }

    @Override // defpackage.gbg
    public final gbe a(mad madVar, gbf gbfVar) {
        throw null;
    }

    @Override // defpackage.mmc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
