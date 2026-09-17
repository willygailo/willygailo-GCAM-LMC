package j$.sun.nio.cs;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

/* JADX INFO: loaded from: classes2.dex */
public class ISO_8859_1 extends Charset {
    public static final ISO_8859_1 INSTANCE = new ISO_8859_1();

    class Decoder extends CharsetDecoder {
        private Decoder(Charset charset) {
            super(charset, 1.0f, 1.0f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v0, types: [java.nio.ByteBuffer] */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v6, types: [java.nio.CharBuffer] */
        /* JADX WARN: Type inference failed for: r9v7, types: [java.nio.ByteBuffer] */
        private CoderResult decodeArrayLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) throws Throwable {
            CoderResult coderResult;
            byte[] bArrArray = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            int iArrayOffset2 = byteBuffer.arrayOffset() + byteBuffer.limit();
            if (iArrayOffset > iArrayOffset2) {
                iArrayOffset = iArrayOffset2;
            }
            char[] cArrArray = charBuffer.array();
            int iArrayOffset3 = charBuffer.arrayOffset() + charBuffer.position();
            int iArrayOffset4 = charBuffer.arrayOffset() + charBuffer.limit();
            if (iArrayOffset3 > iArrayOffset4) {
                iArrayOffset3 = iArrayOffset4;
            }
            while (iArrayOffset < iArrayOffset2) {
                try {
                    byte b = bArrArray[iArrayOffset];
                    if (iArrayOffset3 >= iArrayOffset4) {
                        coderResult = CoderResult.OVERFLOW;
                        iArrayOffset -= byteBuffer.arrayOffset();
                        iArrayOffset3 -= charBuffer.arrayOffset();
                        byteBuffer = (CharBuffer) charBuffer.position(iArrayOffset3);
                        return coderResult;
                    }
                    int i = iArrayOffset3 + 1;
                    try {
                        cArrArray[iArrayOffset3] = (char) (b & 255);
                        iArrayOffset++;
                        iArrayOffset3 = i;
                    } catch (Throwable th) {
                        th = th;
                        iArrayOffset3 = i;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            coderResult = CoderResult.UNDERFLOW;
            iArrayOffset -= byteBuffer.arrayOffset();
            iArrayOffset3 -= charBuffer.arrayOffset();
            byteBuffer = (CharBuffer) charBuffer.position(iArrayOffset3);
            return coderResult;
        }

        private CoderResult decodeBufferLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
            CoderResult coderResult;
            int iPosition = byteBuffer.position();
            while (byteBuffer.hasRemaining()) {
                try {
                    byte b = byteBuffer.get();
                    if (!charBuffer.hasRemaining()) {
                        coderResult = CoderResult.OVERFLOW;
                        return coderResult;
                    }
                    charBuffer.put((char) (b & 255));
                    iPosition++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            coderResult = CoderResult.UNDERFLOW;
            return coderResult;
        }

        @Override // java.nio.charset.CharsetDecoder
        protected CoderResult decodeLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
            return (byteBuffer.hasArray() && charBuffer.hasArray()) ? decodeArrayLoop(byteBuffer, charBuffer) : decodeBufferLoop(byteBuffer, charBuffer);
        }
    }

    class Encoder extends CharsetEncoder {
        private final Surrogate$Parser sgp;

        private Encoder(Charset charset) {
            super(charset, 1.0f, 1.0f);
            this.sgp = new Surrogate$Parser();
        }

        private CoderResult encodeArrayLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
            CoderResult coderResultError;
            char[] cArrArray = charBuffer.array();
            int iArrayOffset = charBuffer.arrayOffset();
            int iPosition = charBuffer.position() + iArrayOffset;
            int iLimit = charBuffer.limit() + iArrayOffset;
            if (iPosition > iLimit) {
                iPosition = iLimit;
            }
            byte[] bArrArray = byteBuffer.array();
            int iArrayOffset2 = byteBuffer.arrayOffset();
            int iPosition2 = byteBuffer.position() + iArrayOffset2;
            int iLimit2 = byteBuffer.limit() + iArrayOffset2;
            if (iPosition2 > iLimit2) {
                iPosition2 = iLimit2;
            }
            int i = iLimit2 - iPosition2;
            int i2 = iLimit - iPosition;
            if (i >= i2) {
                i = i2;
            }
            try {
                int iEncodeISOArray = encodeISOArray(cArrArray, iPosition, bArrArray, iPosition2, i);
                int i3 = iPosition + iEncodeISOArray;
                int i4 = iPosition2 + iEncodeISOArray;
                if (iEncodeISOArray != i) {
                    coderResultError = this.sgp.parse(cArrArray[i3], cArrArray, i3, iLimit) < 0 ? this.sgp.error() : this.sgp.unmappableResult();
                } else {
                    coderResultError = i < i2 ? CoderResult.OVERFLOW : CoderResult.UNDERFLOW;
                }
                int i5 = i4 - iArrayOffset2;
                return coderResultError;
            } finally {
            }
        }

        private CoderResult encodeBufferLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
            CoderResult coderResultError;
            int iPosition = charBuffer.position();
            while (charBuffer.hasRemaining()) {
                try {
                    char c = charBuffer.get();
                    if (c > 255) {
                        coderResultError = this.sgp.parse(c, charBuffer) < 0 ? this.sgp.error() : this.sgp.unmappableResult();
                    } else if (byteBuffer.hasRemaining()) {
                        byteBuffer.put((byte) c);
                        iPosition++;
                    } else {
                        coderResultError = CoderResult.OVERFLOW;
                    }
                    return coderResultError;
                } catch (Throwable th) {
                    throw th;
                }
            }
            coderResultError = CoderResult.UNDERFLOW;
            return coderResultError;
        }

        private static int encodeISOArray(char[] cArr, int i, byte[] bArr, int i2, int i3) {
            if (i3 <= 0) {
                return 0;
            }
            encodeISOArrayCheck(cArr, i, bArr, i2, i3);
            return implEncodeISOArray(cArr, i, bArr, i2, i3);
        }

        private static void encodeISOArrayCheck(char[] cArr, int i, byte[] bArr, int i2, int i3) {
            cArr.getClass();
            bArr.getClass();
            if (i < 0 || i >= cArr.length) {
                throw new ArrayIndexOutOfBoundsException(i);
            }
            if (i2 < 0 || i2 >= bArr.length) {
                throw new ArrayIndexOutOfBoundsException(i2);
            }
            int i4 = (i + i3) - 1;
            if (i4 < 0 || i4 >= cArr.length) {
                throw new ArrayIndexOutOfBoundsException(i4);
            }
            int i5 = (i2 + i3) - 1;
            if (i5 < 0 || i5 >= bArr.length) {
                throw new ArrayIndexOutOfBoundsException(i5);
            }
        }

        private static int implEncodeISOArray(char[] cArr, int i, byte[] bArr, int i2, int i3) {
            int i4 = 0;
            while (i4 < i3) {
                int i5 = i + 1;
                char c = cArr[i];
                if (c > 255) {
                    break;
                }
                bArr[i2] = (byte) c;
                i4++;
                i = i5;
                i2++;
            }
            return i4;
        }

        @Override // java.nio.charset.CharsetEncoder
        public boolean canEncode(char c) {
            return c <= 255;
        }

        @Override // java.nio.charset.CharsetEncoder
        protected CoderResult encodeLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
            return (charBuffer.hasArray() && byteBuffer.hasArray()) ? encodeArrayLoop(charBuffer, byteBuffer) : encodeBufferLoop(charBuffer, byteBuffer);
        }

        @Override // java.nio.charset.CharsetEncoder
        public boolean isLegalReplacement(byte[] bArr) {
            return true;
        }
    }

    public ISO_8859_1() {
        super("ISO-8859-1", StandardCharsets.aliases_ISO_8859_1());
    }

    @Override // java.nio.charset.Charset
    public boolean contains(Charset charset) {
        return (charset instanceof US_ASCII) || (charset instanceof ISO_8859_1);
    }

    @Override // java.nio.charset.Charset
    public CharsetDecoder newDecoder() {
        return new Decoder(this);
    }

    @Override // java.nio.charset.Charset
    public CharsetEncoder newEncoder() {
        return new Encoder(this);
    }
}
