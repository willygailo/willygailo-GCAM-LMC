package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;

/* JADX INFO: loaded from: classes2.dex */
public final class pis extends InputStream {
    private final pit a;

    public pis(InputStream inputStream) {
        this.a = new pit(Channels.newChannel(inputStream));
    }

    @Override // java.io.InputStream
    public final int available() {
        ByteBuffer byteBuffer = this.a.a;
        if (byteBuffer != null) {
            return byteBuffer.remaining();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.b();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int iA;
        if (this.a.b) {
            throw new IOException("read after close");
        }
        do {
            iA = this.a.a();
        } while (iA == 0);
        if (iA == -1) {
            return -1;
        }
        return this.a.a.get() & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        pit pitVar = this.a;
        if (pitVar.b) {
            throw new IOException("read after close");
        }
        if (pitVar.a() == -1) {
            return -1;
        }
        int i3 = 0;
        while (i2 > 0) {
            int iMin = Math.min(i2, this.a.a.remaining());
            this.a.a.get(bArr, i, iMin);
            i += iMin;
            i2 -= iMin;
            i3 += iMin;
            if (this.a.a() == -1) {
                break;
            }
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        if (this.a.b) {
            throw new IOException("read after close");
        }
        long j2 = 0;
        while (j > 0 && this.a.a() != -1) {
            int iMin = (int) Math.min(j, this.a.a.remaining());
            pit pitVar = this.a;
            ByteBuffer byteBuffer = pitVar.a;
            byteBuffer.position(byteBuffer.position() + iMin);
            if (!pitVar.a.hasRemaining()) {
                pitVar.a = null;
            }
            long j3 = iMin;
            j2 += j3;
            j -= j3;
        }
        return j2;
    }
}
