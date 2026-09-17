package j$.sun.nio.cs;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

/* JADX INFO: loaded from: classes2.dex */
public class US_ASCII extends Charset {
    public static final US_ASCII INSTANCE = new US_ASCII();

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
            CoderResult coderResultMalformedForLength;
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
                    if (b < 0) {
                        coderResultMalformedForLength = CoderResult.malformedForLength(1);
                    } else if (iArrayOffset3 >= iArrayOffset4) {
                        coderResultMalformedForLength = CoderResult.OVERFLOW;
                    } else {
                        int i = iArrayOffset3 + 1;
                        try {
                            cArrArray[iArrayOffset3] = (char) b;
                            iArrayOffset++;
                            iArrayOffset3 = i;
                        } catch (Throwable th) {
                            th = th;
                            iArrayOffset3 = i;
                            throw th;
                        }
                    }
                    iArrayOffset -= byteBuffer.arrayOffset();
                    iArrayOffset3 -= charBuffer.arrayOffset();
                    byteBuffer = (CharBuffer) charBuffer.position(iArrayOffset3);
                    return coderResultMalformedForLength;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            coderResultMalformedForLength = CoderResult.UNDERFLOW;
            iArrayOffset -= byteBuffer.arrayOffset();
            iArrayOffset3 -= charBuffer.arrayOffset();
            byteBuffer = (CharBuffer) charBuffer.position(iArrayOffset3);
            return coderResultMalformedForLength;
        }

        private CoderResult decodeBufferLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
            CoderResult coderResultMalformedForLength;
            int iPosition = byteBuffer.position();
            while (byteBuffer.hasRemaining()) {
                try {
                    byte b = byteBuffer.get();
                    if (b < 0) {
                        coderResultMalformedForLength = CoderResult.malformedForLength(1);
                    } else if (charBuffer.hasRemaining()) {
                        charBuffer.put((char) b);
                        iPosition++;
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
            int iArrayOffset = charBuffer.arrayOffset() + charBuffer.position();
            int iArrayOffset2 = charBuffer.arrayOffset() + charBuffer.limit();
            if (iArrayOffset > iArrayOffset2) {
                iArrayOffset = iArrayOffset2;
            }
            byte[] bArrArray = byteBuffer.array();
            int iArrayOffset3 = byteBuffer.arrayOffset() + byteBuffer.position();
            int iArrayOffset4 = byteBuffer.arrayOffset() + byteBuffer.limit();
            if (iArrayOffset3 > iArrayOffset4) {
                iArrayOffset3 = iArrayOffset4;
            }
            while (iArrayOffset < iArrayOffset2) {
                try {
                    char c = cArrArray[iArrayOffset];
                    if (c >= 128) {
                        coderResultError = this.sgp.parse(c, cArrArray, iArrayOffset, iArrayOffset2) < 0 ? this.sgp.error() : this.sgp.unmappableResult();
                    } else if (iArrayOffset3 >= iArrayOffset4) {
                        coderResultError = CoderResult.OVERFLOW;
                    } else {
                        bArrArray[iArrayOffset3] = (byte) c;
                        iArrayOffset++;
                        iArrayOffset3++;
                    }
                    return coderResultError;
                } catch (Throwable th) {
                    throw th;
                }
            }
            coderResultError = CoderResult.UNDERFLOW;
            return coderResultError;
        }

        private CoderResult encodeBufferLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
            CoderResult coderResultError;
            int iPosition = charBuffer.position();
            while (charBuffer.hasRemaining()) {
                try {
                    char c = charBuffer.get();
                    if (c >= 128) {
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

        @Override // java.nio.charset.CharsetEncoder
        public boolean canEncode(char c) {
            return c < 128;
        }

        @Override // java.nio.charset.CharsetEncoder
        protected CoderResult encodeLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
            return (charBuffer.hasArray() && byteBuffer.hasArray()) ? encodeArrayLoop(charBuffer, byteBuffer) : encodeBufferLoop(charBuffer, byteBuffer);
        }

        @Override // java.nio.charset.CharsetEncoder
        public boolean isLegalReplacement(byte[] bArr) {
            return (bArr.length == 1 && bArr[0] >= 0) || super.isLegalReplacement(bArr);
        }
    }

    public US_ASCII() {
        super("US-ASCII", StandardCharsets.aliases_US_ASCII());
    }

    @Override // java.nio.charset.Charset
    public boolean contains(Charset charset) {
        return charset instanceof US_ASCII;
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
