package defpackage;

import com.google.android.apps.cerebra.federatedperception.shared.communications.CommunicationsManager;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface nvd {
    void a();

    void close(long j, long j2, long j3, long j4);

    boolean disableSubpipeline(long j, String str);

    boolean enableSubpipeline(long j, String str);

    long initialize(byte[] bArr, long j, long j2, CommunicationsManager communicationsManager, long j3);

    long initializeFrameBufferReleaseCallback(long j);

    long initializeFrameManager();

    long initializeResultsCallback();

    boolean receiveYuvFrame(long j, long j2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6);

    void start(long j);

    boolean stop(long j);

    void waitUntilIdle(long j);
}
