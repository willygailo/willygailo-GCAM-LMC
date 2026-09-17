package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class frb implements msx {
    final /* synthetic */ frc a;

    public frb(frc frcVar) {
        this.a = frcVar;
    }

    @Override // defpackage.msx
    public final void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.a.a.b(byteBuffer, bufferInfo);
    }

    @Override // defpackage.msx, java.lang.AutoCloseable
    public final void close() {
        this.a.a.close();
        this.a.b.o(new Object());
    }
}
