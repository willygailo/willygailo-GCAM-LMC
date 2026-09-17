package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
final class ada extends InputStream implements DataInput {
    private static final ByteOrder d = ByteOrder.LITTLE_ENDIAN;
    private static final ByteOrder e = ByteOrder.BIG_ENDIAN;
    final DataInputStream a;
    public ByteOrder b;
    int c;
    private byte[] f;

    public ada(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public ada(InputStream inputStream, ByteOrder byteOrder) {
        this.b = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.a = dataInputStream;
        dataInputStream.mark(0);
        this.c = 0;
        this.b = byteOrder;
    }

    public ada(InputStream inputStream, byte[] bArr) {
        this(inputStream);
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
        this.a.mark(Integer.MAX_VALUE);
    }

    public ada(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
    }

    public ada(byte[] bArr, byte[] bArr2) {
        this(bArr);
        this.a.mark(Integer.MAX_VALUE);
    }

    public final long a() {
        return ((long) readInt()) & 4294967295L;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.a.available();
    }

    public final void b(int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            int iSkip = (int) this.a.skip(i3);
            if (iSkip <= 0) {
                if (this.f == null) {
                    this.f = new byte[8192];
                }
                iSkip = this.a.read(this.f, 0, Math.min(8192, i3));
                if (iSkip == -1) {
                    throw new EOFException("Reached EOF while skipping " + i + " bytes.");
                }
            }
            i2 += iSkip;
        }
        this.c += i2;
    }

    public final void c(long j) throws IOException {
        long j2 = this.c;
        if (j2 > j) {
            this.c = 0;
            this.a.reset();
        } else {
            j -= j2;
        }
        b((int) j);
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.c++;
        return this.a.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.a.read(bArr, i, i2);
        this.c += i3;
        return i3;
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.c++;
        return this.a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws EOFException {
        this.c++;
        int i = this.a.read();
        if (i >= 0) {
            return (byte) i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.c += 2;
        return this.a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.c += bArr.length;
        this.a.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.c += i2;
        this.a.readFully(bArr, i, i2);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.c += 4;
        int i = this.a.read();
        int i2 = this.a.read();
        int i3 = this.a.read();
        int i4 = this.a.read();
        if ((i | i2 | i3 | i4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.b;
        if (byteOrder == d) {
            return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
        }
        if (byteOrder == e) {
            return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
        }
        throw new IOException("Invalid byte order: " + this.b);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        this.c += 8;
        int i = this.a.read();
        int i2 = this.a.read();
        int i3 = this.a.read();
        int i4 = this.a.read();
        int i5 = this.a.read();
        int i6 = this.a.read();
        int i7 = this.a.read();
        int i8 = this.a.read();
        if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.b;
        if (byteOrder == d) {
            return (((long) i8) << 56) + (((long) i7) << 48) + (((long) i6) << 40) + (((long) i5) << 32) + (((long) i4) << 24) + (((long) i3) << 16) + (((long) i2) << 8) + ((long) i);
        }
        if (byteOrder == e) {
            return (((long) i) << 56) + (((long) i2) << 48) + (((long) i3) << 40) + (((long) i4) << 32) + (((long) i5) << 24) + (((long) i6) << 16) + (((long) i7) << 8) + ((long) i8);
        }
        throw new IOException("Invalid byte order: " + this.b);
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.c += 2;
        int i = this.a.read();
        int i2 = this.a.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.b;
        if (byteOrder == d) {
            return (short) ((i2 << 8) + i);
        }
        if (byteOrder == e) {
            return (short) ((i << 8) + i2);
        }
        throw new IOException("Invalid byte order: " + this.b);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.c += 2;
        return this.a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.c++;
        return this.a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.c += 2;
        int i = this.a.read();
        int i2 = this.a.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.b;
        if (byteOrder == d) {
            return (i2 << 8) + i;
        }
        if (byteOrder == e) {
            return (i << 8) + i2;
        }
        throw new IOException("Invalid byte order: " + this.b);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }
}
