package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ozb implements oyx {
    final DataInput a;

    public ozb(ByteArrayInputStream byteArrayInputStream) {
        this.a = new DataInputStream(byteArrayInputStream);
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        try {
            return this.a.readBoolean();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        try {
            return this.a.readByte();
        } catch (EOFException e) {
            throw new IllegalStateException(e);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // java.io.DataInput
    public final char readChar() {
        try {
            return this.a.readChar();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        try {
            return this.a.readDouble();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        try {
            return this.a.readFloat();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        try {
            this.a.readFully(bArr);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        try {
            this.a.readFully(bArr, i, i2);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.io.DataInput
    public final int readInt() {
        try {
            return this.a.readInt();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.io.DataInput
    public final String readLine() {
        try {
            return this.a.readLine();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.io.DataInput
    public final long readLong() {
        try {
            return this.a.readLong();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.io.DataInput
    public final short readShort() {
        try {
            return this.a.readShort();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        try {
            return this.a.readUTF();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        try {
            return this.a.readUnsignedByte();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        try {
            return this.a.readUnsignedShort();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        try {
            return this.a.skipBytes(i);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
