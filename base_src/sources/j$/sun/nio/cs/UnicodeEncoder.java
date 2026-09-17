package j$.sun.nio.cs;

import j$.lang.DesugarCharacter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

/* JADX INFO: loaded from: classes2.dex */
public abstract class UnicodeEncoder extends CharsetEncoder {
    private int byteOrder;
    private boolean needsMark;
    private final Surrogate$Parser sgp;
    private boolean usesMark;

    protected UnicodeEncoder(Charset charset, int i, boolean z) {
        super(charset, 2.0f, z ? 4.0f : 2.0f, i == 0 ? new byte[]{-1, -3} : new byte[]{-3, -1});
        this.sgp = new Surrogate$Parser();
        this.needsMark = z;
        this.usesMark = z;
        this.byteOrder = i;
    }

    private void put(char c, ByteBuffer byteBuffer) {
        if (this.byteOrder == 0) {
            byteBuffer.put((byte) (c >> '\b'));
            byteBuffer.put((byte) (c & 255));
        } else {
            byteBuffer.put((byte) (c & 255));
            byteBuffer.put((byte) (c >> '\b'));
        }
    }

    @Override // java.nio.charset.CharsetEncoder
    public boolean canEncode(char c) {
        return !DesugarCharacter.isSurrogate(c);
    }

    @Override // java.nio.charset.CharsetEncoder
    protected CoderResult encodeLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
        CoderResult coderResultError;
        int iPosition = charBuffer.position();
        if (this.needsMark && charBuffer.hasRemaining()) {
            if (byteBuffer.remaining() < 2) {
                return CoderResult.OVERFLOW;
            }
            put((char) 65279, byteBuffer);
            this.needsMark = false;
        }
        while (charBuffer.hasRemaining()) {
            try {
                char c = charBuffer.get();
                if (DesugarCharacter.isSurrogate(c)) {
                    int i = this.sgp.parse(c, charBuffer);
                    if (i < 0) {
                        coderResultError = this.sgp.error();
                    } else if (byteBuffer.remaining() < 4) {
                        coderResultError = CoderResult.OVERFLOW;
                    } else {
                        iPosition += 2;
                        put(DesugarCharacter.highSurrogate(i), byteBuffer);
                        put(DesugarCharacter.lowSurrogate(i), byteBuffer);
                    }
                    return coderResultError;
                }
                if (byteBuffer.remaining() < 2) {
                    coderResultError = CoderResult.OVERFLOW;
                    return coderResultError;
                }
                iPosition++;
                put(c, byteBuffer);
            } catch (Throwable th) {
                throw th;
            }
        }
        coderResultError = CoderResult.UNDERFLOW;
        return coderResultError;
    }

    @Override // java.nio.charset.CharsetEncoder
    protected void implReset() {
        this.needsMark = this.usesMark;
    }
}
