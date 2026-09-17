package defpackage;

import com.google.android.apps.cerebra.federatedperception.shared.communications.CommunicationsManager;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
final class nve implements nvd {
    @Override // defpackage.nvd
    public final void a() {
    }

    @Override // defpackage.nvd
    public final void close(long j, long j2, long j3, long j4) {
    }

    @Override // defpackage.nvd
    public final boolean disableSubpipeline(long j, String str) {
        return true;
    }

    @Override // defpackage.nvd
    public final boolean enableSubpipeline(long j, String str) {
        return true;
    }

    @Override // defpackage.nvd
    public final long initialize(byte[] bArr, long j, long j2, CommunicationsManager communicationsManager, long j3) {
        return 1L;
    }

    @Override // defpackage.nvd
    public final long initializeFrameBufferReleaseCallback(long j) {
        return 1L;
    }

    @Override // defpackage.nvd
    public final long initializeFrameManager() {
        return 1L;
    }

    @Override // defpackage.nvd
    public final long initializeResultsCallback() {
        return 1L;
    }

    @Override // defpackage.nvd
    public final boolean receiveYuvFrame(long j, long j2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6) {
        return true;
    }

    @Override // defpackage.nvd
    public final void start(long j) {
    }

    @Override // defpackage.nvd
    public final boolean stop(long j) {
        return true;
    }

    @Override // defpackage.nvd
    public final void waitUntilIdle(long j) {
    }
}
