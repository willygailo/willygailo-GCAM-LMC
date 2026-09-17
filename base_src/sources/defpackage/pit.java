package defpackage;

import com.google.compression.brotli.wrapper.dec.DecoderJNI;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: loaded from: classes2.dex */
public final class pit {
    private static final ByteBuffer c = ByteBuffer.allocate(0);
    ByteBuffer a;
    boolean b;
    private final ReadableByteChannel d;
    private final piu e;

    public pit(ReadableByteChannel readableByteChannel) {
        if (readableByteChannel == null) {
            throw new NullPointerException("source can not be null");
        }
        this.d = readableByteChannel;
        this.e = new piu();
    }

    private final void c(String str) throws IOException {
        try {
            b();
        } catch (IOException e) {
        }
        throw new IOException(str);
    }

    final int a() throws IOException {
        while (true) {
            ByteBuffer byteBuffer = this.a;
            if (byteBuffer != null) {
                if (byteBuffer.hasRemaining()) {
                    return this.a.remaining();
                }
                this.a = null;
            }
            piu piuVar = this.e;
            int i = piuVar.c;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            int i3 = -1;
            switch (i2) {
                case 1:
                    return -1;
                case 2:
                    ByteBuffer byteBuffer2 = piuVar.b;
                    byteBuffer2.clear();
                    int i4 = this.d.read(byteBuffer2);
                    if (i4 == -1) {
                        c("unexpected end of input");
                    } else {
                        i3 = i4;
                    }
                    if (i3 == 0) {
                        this.a = c;
                        return 0;
                    }
                    this.e.c(i3);
                    break;
                case 3:
                    long[] jArr = piuVar.a;
                    if (jArr[0] == 0) {
                        throw new IllegalStateException("brotli decoder is already destroyed");
                    }
                    if (i != 4 && jArr[2] == 0) {
                        String strH = plk.H(i);
                        StringBuilder sb = new StringBuilder(strH.length() + 37);
                        sb.append("pulling output from decoder in ");
                        sb.append(strH);
                        sb.append(" state");
                        throw new IllegalStateException(sb.toString());
                    }
                    ByteBuffer byteBufferNativePull = DecoderJNI.nativePull(jArr);
                    piuVar.b();
                    this.a = byteBufferNativePull;
                    break;
                    break;
                case 4:
                    piuVar.c(0);
                    break;
                default:
                    c("corrupted input");
                    break;
            }
        }
    }

    final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.e.a();
        this.d.close();
    }
}
