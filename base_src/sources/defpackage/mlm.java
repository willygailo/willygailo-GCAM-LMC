package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
final class mlm implements mln {
    final /* synthetic */ pih a;
    final /* synthetic */ msx b;

    public mlm(pih pihVar, msx msxVar) {
        this.a = pihVar;
        this.b = msxVar;
    }

    @Override // defpackage.mln
    public final void a(pht phtVar) {
        this.a.e(phtVar);
    }

    @Override // defpackage.msx
    public final void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.b.b(byteBuffer, bufferInfo);
    }

    @Override // defpackage.msx, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
