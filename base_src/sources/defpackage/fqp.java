package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
final class fqp implements mln {
    public final int a;
    final /* synthetic */ fqq b;
    private final mln c;
    private final AtomicInteger d = new AtomicInteger(0);

    public fqp(fqq fqqVar, mln mlnVar, int i) {
        this.b = fqqVar;
        this.c = mlnVar;
        this.a = i;
    }

    @Override // defpackage.mln
    public final void a(pht phtVar) {
        plk.af(phtVar, new fqo(this), pgr.INSTANCE);
        this.c.a(phtVar);
    }

    @Override // defpackage.msx
    public final void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.c.b(byteBuffer, bufferInfo);
        if (this.d.incrementAndGet() % 10 == 1) {
            ddf ddfVar = this.b.c;
            ddi ddiVar = ddl.a;
            ddfVar.e();
        }
    }

    @Override // defpackage.msx, java.lang.AutoCloseable
    public final void close() {
        this.d.get();
        this.c.close();
    }
}
