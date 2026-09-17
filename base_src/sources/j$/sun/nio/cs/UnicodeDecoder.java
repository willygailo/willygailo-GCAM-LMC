package j$.sun.nio.cs;

import j$.lang.DesugarCharacter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

/* JADX INFO: loaded from: classes2.dex */
abstract class UnicodeDecoder extends CharsetDecoder {
    private int currentByteOrder;
    private int defaultByteOrder;
    private final int expectedByteOrder;

    public UnicodeDecoder(Charset charset, int i) {
        super(charset, 0.5f, 1.0f);
        this.defaultByteOrder = 1;
        this.currentByteOrder = i;
        this.expectedByteOrder = i;
    }

    private char decode(int i, int i2) {
        return (char) (this.currentByteOrder == 1 ? (i << 8) | i2 : i | (i2 << 8));
    }

    @Override // java.nio.charset.CharsetDecoder
    protected CoderResult decodeLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        CoderResult coderResultMalformedForLength;
        int iPosition = byteBuffer.position();
        while (byteBuffer.remaining() > 1) {
            try {
                int i = byteBuffer.get() & 255;
                int i2 = byteBuffer.get() & 255;
                if (this.currentByteOrder == 0) {
                    char c = (char) ((i << 8) | i2);
                    if (c == 65279) {
                        this.currentByteOrder = 1;
                    } else if (c == 65534) {
                        this.currentByteOrder = 2;
                    } else {
                        this.currentByteOrder = this.defaultByteOrder;
                    }
                    iPosition += 2;
                }
                char cDecode = decode(i, i2);
                if (cDecode == 65534) {
                    coderResultMalformedForLength = CoderResult.malformedForLength(2);
                } else if (DesugarCharacter.isSurrogate(cDecode)) {
                    if (!Character.isHighSurrogate(cDecode)) {
                        coderResultMalformedForLength = CoderResult.malformedForLength(2);
                    } else if (byteBuffer.remaining() < 2) {
                        coderResultMalformedForLength = CoderResult.UNDERFLOW;
                    } else {
                        char cDecode2 = decode(byteBuffer.get() & 255, byteBuffer.get() & 255);
                        if (!Character.isLowSurrogate(cDecode2)) {
                            coderResultMalformedForLength = CoderResult.malformedForLength(4);
                        } else if (charBuffer.remaining() < 2) {
                            coderResultMalformedForLength = CoderResult.OVERFLOW;
                        } else {
                            iPosition += 4;
                            charBuffer.put(cDecode);
                            charBuffer.put(cDecode2);
                        }
                    }
                } else if (charBuffer.hasRemaining()) {
                    iPosition += 2;
                    charBuffer.put(cDecode);
                } else {
                    coderResultMalformedForLength = CoderResult.OVERFLOW;
                }
                return coderResultMalformedForLength;
            } catch (Throwable th) {
                throw th;
            }
        }
        coderResultMalformedForLength = CoderResult.UNDERFLOW;
        return coderResultMalformedForLength;
    }

    @Override // java.nio.charset.CharsetDecoder
    protected void implReset() {
        this.currentByteOrder = this.expectedByteOrder;
    }
}
