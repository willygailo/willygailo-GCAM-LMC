package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class frs implements mln {
    final /* synthetic */ mln a;
    final /* synthetic */ frt b;

    public frs(frt frtVar, mln mlnVar) {
        this.b = frtVar;
        this.a = mlnVar;
    }

    @Override // defpackage.mln
    public final void a(pht phtVar) {
        this.a.a(phtVar);
    }

    @Override // defpackage.msx
    public final void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.a.b(byteBuffer, bufferInfo);
        this.b.a.a.R();
    }

    @Override // defpackage.msx, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
