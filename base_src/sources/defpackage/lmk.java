package defpackage;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class lmk extends FilterOutputStream {
    public final ByteBuffer a;

    public lmk(OutputStream outputStream) {
        super(outputStream);
        this.a = ByteBuffer.allocate(4);
    }

    public final void a(int i) throws IOException {
        this.a.putInt(i);
        this.out.write(this.a.array());
    }

    public final void b(short s) throws IOException {
        this.a.putShort(s);
        this.out.write(this.a.array(), 0, 2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
    }
}
