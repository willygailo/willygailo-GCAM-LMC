package j$.sun.nio.cs;

import j$.lang.DesugarCharacter;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

/* JADX INFO: loaded from: classes2.dex */
public final class UTF_8 extends Unicode {
    public static final UTF_8 INSTANCE = new UTF_8();

    class Decoder extends CharsetDecoder {
        private Decoder(Charset charset) {
            super(charset, 1.0f, 1.0f);
        }

        private CoderResult decodeArrayLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
            int i;
            int i2;
            byte[] bArrArray = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            int iArrayOffset2 = byteBuffer.arrayOffset() + byteBuffer.limit();
            char[] cArrArray = charBuffer.array();
            int iArrayOffset3 = charBuffer.arrayOffset() + charBuffer.position();
            int iArrayOffset4 = charBuffer.arrayOffset() + charBuffer.limit();
            int iMin = Math.min(iArrayOffset2 - iArrayOffset, iArrayOffset4 - iArrayOffset3) + iArrayOffset3;
            while (iArrayOffset3 < iMin && bArrArray[iArrayOffset] >= 0) {
                cArrArray[iArrayOffset3] = (char) bArrArray[iArrayOffset];
                iArrayOffset3++;
                iArrayOffset++;
            }
            int i3 = iArrayOffset;
            loop1: while (true) {
                i = iArrayOffset3;
                while (i3 < iArrayOffset2) {
                    byte b = bArrArray[i3];
                    if (b < 0) {
                        if ((b >> 5) != -2 || (b & 30) == 0) {
                            if ((b >> 4) == -2) {
                                int i4 = iArrayOffset2 - i3;
                                if (i4 < 3 || i >= iArrayOffset4) {
                                    return (i4 <= 1 || !isMalformed3_2(b, bArrArray[i3 + 1])) ? xflow(byteBuffer, i3, iArrayOffset2, charBuffer, i, 3) : malformedForLength(byteBuffer, i3, charBuffer, i, 1);
                                }
                                byte b2 = bArrArray[i3 + 1];
                                byte b3 = bArrArray[i3 + 2];
                                if (isMalformed3(b, b2, b3)) {
                                    return malformed(byteBuffer, i3, charBuffer, i, 3);
                                }
                                char c = (char) (((b << 12) ^ (b2 << 6)) ^ ((-123008) ^ b3));
                                if (DesugarCharacter.isSurrogate(c)) {
                                    return malformedForLength(byteBuffer, i3, charBuffer, i, 3);
                                }
                                iArrayOffset3 = i + 1;
                                cArrArray[i] = c;
                                i3 += 3;
                            } else {
                                if ((b >> 3) != -2) {
                                    return malformed(byteBuffer, i3, charBuffer, i, 1);
                                }
                                int i5 = iArrayOffset2 - i3;
                                if (i5 < 4 || iArrayOffset4 - i < 2) {
                                    int i6 = b & 255;
                                    if (i6 > 244 || (i5 > 1 && isMalformed4_2(i6, bArrArray[i3 + 1] & 255))) {
                                        return malformedForLength(byteBuffer, i3, charBuffer, i, 1);
                                    }
                                    return (i5 <= 2 || !isMalformed4_3(bArrArray[i3 + 2])) ? xflow(byteBuffer, i3, iArrayOffset2, charBuffer, i, 4) : malformedForLength(byteBuffer, i3, charBuffer, i, 2);
                                }
                                byte b4 = bArrArray[i3 + 1];
                                byte b5 = bArrArray[i3 + 2];
                                byte b6 = bArrArray[i3 + 3];
                                int i7 = (((b << 18) ^ (b4 << 12)) ^ (b5 << 6)) ^ (3678080 ^ b6);
                                if (isMalformed4(b4, b5, b6) || !Character.isSupplementaryCodePoint(i7)) {
                                    break loop1;
                                }
                                int i8 = i + 1;
                                cArrArray[i] = DesugarCharacter.highSurrogate(i7);
                                i2 = i8 + 1;
                                cArrArray[i8] = DesugarCharacter.lowSurrogate(i7);
                                i3 += 4;
                            }
                        } else {
                            if (iArrayOffset2 - i3 < 2 || i >= iArrayOffset4) {
                                return xflow(byteBuffer, i3, iArrayOffset2, charBuffer, i, 2);
                            }
                            byte b7 = bArrArray[i3 + 1];
                            if (isNotContinuation(b7)) {
                                return malformedForLength(byteBuffer, i3, charBuffer, i, 1);
                            }
                            i2 = i + 1;
                            cArrArray[i] = (char) (((b << 6) ^ b7) ^ 3968);
                            i3 += 2;
                        }
                        i = i2;
                    } else {
                        if (i >= iArrayOffset4) {
                            return xflow(byteBuffer, i3, iArrayOffset2, charBuffer, i, 1);
                        }
                        iArrayOffset3 = i + 1;
                        cArrArray[i] = (char) b;
                        i3++;
                    }
                }
                return xflow(byteBuffer, i3, iArrayOffset2, charBuffer, i, 0);
            }
            return malformed(byteBuffer, i3, charBuffer, i, 4);
        }

        private CoderResult decodeBufferLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
            int iPosition = byteBuffer.position();
            int iLimit = byteBuffer.limit();
            while (iPosition < iLimit) {
                byte b = byteBuffer.get();
                if (b >= 0) {
                    if (charBuffer.remaining() < 1) {
                        return xflow(byteBuffer, iPosition, 1);
                    }
                    charBuffer.put((char) b);
                    iPosition++;
                } else if ((b >> 5) != -2 || (b & 30) == 0) {
                    if ((b >> 4) == -2) {
                        int i = iLimit - iPosition;
                        if (i < 3 || charBuffer.remaining() < 1) {
                            return (i <= 1 || !isMalformed3_2(b, byteBuffer.get())) ? xflow(byteBuffer, iPosition, 3) : malformedForLength(byteBuffer, iPosition, 1);
                        }
                        byte b2 = byteBuffer.get();
                        byte b3 = byteBuffer.get();
                        if (isMalformed3(b, b2, b3)) {
                            return malformed(byteBuffer, iPosition, 3);
                        }
                        char c = (char) (((b << 12) ^ (b2 << 6)) ^ ((-123008) ^ b3));
                        if (DesugarCharacter.isSurrogate(c)) {
                            return malformedForLength(byteBuffer, iPosition, 3);
                        }
                        charBuffer.put(c);
                        iPosition += 3;
                    } else {
                        if ((b >> 3) != -2) {
                            return malformed(byteBuffer, iPosition, 1);
                        }
                        int i2 = iLimit - iPosition;
                        if (i2 < 4 || charBuffer.remaining() < 2) {
                            int i3 = b & 255;
                            if (i3 > 244 || (i2 > 1 && isMalformed4_2(i3, byteBuffer.get() & 255))) {
                                return malformedForLength(byteBuffer, iPosition, 1);
                            }
                            return (i2 <= 2 || !isMalformed4_3(byteBuffer.get())) ? xflow(byteBuffer, iPosition, 4) : malformedForLength(byteBuffer, iPosition, 2);
                        }
                        byte b4 = byteBuffer.get();
                        byte b5 = byteBuffer.get();
                        byte b6 = byteBuffer.get();
                        int i4 = (((b << 18) ^ (b4 << 12)) ^ (b5 << 6)) ^ (3678080 ^ b6);
                        if (isMalformed4(b4, b5, b6) || !Character.isSupplementaryCodePoint(i4)) {
                            return malformed(byteBuffer, iPosition, 4);
                        }
                        charBuffer.put(DesugarCharacter.highSurrogate(i4));
                        charBuffer.put(DesugarCharacter.lowSurrogate(i4));
                        iPosition += 4;
                    }
                } else {
                    if (iLimit - iPosition < 2 || charBuffer.remaining() < 1) {
                        return xflow(byteBuffer, iPosition, 2);
                    }
                    byte b7 = byteBuffer.get();
                    if (isNotContinuation(b7)) {
                        return malformedForLength(byteBuffer, iPosition, 1);
                    }
                    charBuffer.put((char) (((b << 6) ^ b7) ^ 3968));
                    iPosition += 2;
                }
            }
            return xflow(byteBuffer, iPosition, 0);
        }

        private static boolean isMalformed3(int i, int i2, int i3) {
            return ((i != -32 || (i2 & 224) != 128) && (i2 & 192) == 128 && (i3 & 192) == 128) ? false : true;
        }

        private static boolean isMalformed3_2(int i, int i2) {
            return (i == -32 && (i2 & 224) == 128) || (i2 & 192) != 128;
        }

        private static boolean isMalformed4(int i, int i2, int i3) {
            return ((i & 192) == 128 && (i2 & 192) == 128 && (i3 & 192) == 128) ? false : true;
        }

        private static boolean isMalformed4_2(int i, int i2) {
            return (i == 240 && (i2 < 144 || i2 > 191)) || (i == 244 && (i2 & 240) != 128) || (i2 & 192) != 128;
        }

        private static boolean isMalformed4_3(int i) {
            return (i & 192) != 128;
        }

        private static boolean isNotContinuation(int i) {
            return (i & 192) != 128;
        }

        private static CoderResult malformed(ByteBuffer byteBuffer, int i, int i2) {
            CoderResult coderResultMalformedN = malformedN(byteBuffer, i2);
            return coderResultMalformedN;
        }

        private static CoderResult malformed(ByteBuffer byteBuffer, int i, CharBuffer charBuffer, int i2, int i3) {
            CoderResult coderResultMalformedN = malformedN(byteBuffer, i3);
            UTF_8.updatePositions(byteBuffer, i, charBuffer, i2);
            return coderResultMalformedN;
        }

        private static CoderResult malformedForLength(ByteBuffer byteBuffer, int i, int i2) {
            return CoderResult.malformedForLength(i2);
        }

        private static CoderResult malformedForLength(ByteBuffer byteBuffer, int i, CharBuffer charBuffer, int i2, int i3) {
            UTF_8.updatePositions(byteBuffer, i, charBuffer, i2);
            return CoderResult.malformedForLength(i3);
        }

        private static CoderResult malformedN(ByteBuffer byteBuffer, int i) {
            int i2 = 1;
            if (i == 1 || i == 2) {
                return CoderResult.malformedForLength(1);
            }
            if (i == 3) {
                byte b = byteBuffer.get();
                byte b2 = byteBuffer.get();
                if ((b != -32 || (b2 & 224) != 128) && !isNotContinuation(b2)) {
                    i2 = 2;
                }
                return CoderResult.malformedForLength(i2);
            }
            if (i != 4) {
                return null;
            }
            int i3 = byteBuffer.get() & 255;
            int i4 = byteBuffer.get() & 255;
            if (i3 > 244 || ((i3 == 240 && (i4 < 144 || i4 > 191)) || ((i3 == 244 && (i4 & 240) != 128) || isNotContinuation(i4)))) {
                return CoderResult.malformedForLength(1);
            }
            return isNotContinuation(byteBuffer.get()) ? CoderResult.malformedForLength(2) : CoderResult.malformedForLength(3);
        }

        private static CoderResult xflow(Buffer buffer, int i, int i2) {
            buffer.position(i);
            return (i2 == 0 || buffer.remaining() < i2) ? CoderResult.UNDERFLOW : CoderResult.OVERFLOW;
        }

        private static CoderResult xflow(Buffer buffer, int i, int i2, Buffer buffer2, int i3, int i4) {
            UTF_8.updatePositions(buffer, i, buffer2, i3);
            return (i4 == 0 || i2 - i < i4) ? CoderResult.UNDERFLOW : CoderResult.OVERFLOW;
        }

        @Override // java.nio.charset.CharsetDecoder
        protected CoderResult decodeLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
            return (byteBuffer.hasArray() && charBuffer.hasArray()) ? decodeArrayLoop(byteBuffer, charBuffer) : decodeBufferLoop(byteBuffer, charBuffer);
        }
    }

    final class Encoder extends CharsetEncoder {
        private Surrogate$Parser sgp;

        private Encoder(Charset charset) {
            super(charset, 1.1f, 3.0f);
        }

        private CoderResult encodeArrayLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
            int i;
            char[] cArrArray = charBuffer.array();
            int iArrayOffset = charBuffer.arrayOffset() + charBuffer.position();
            int iArrayOffset2 = charBuffer.arrayOffset() + charBuffer.limit();
            byte[] bArrArray = byteBuffer.array();
            int iArrayOffset3 = byteBuffer.arrayOffset() + byteBuffer.position();
            int iArrayOffset4 = byteBuffer.arrayOffset() + byteBuffer.limit();
            int iMin = Math.min(iArrayOffset2 - iArrayOffset, iArrayOffset4 - iArrayOffset3) + iArrayOffset3;
            while (iArrayOffset3 < iMin && cArrArray[iArrayOffset] < 128) {
                bArrArray[iArrayOffset3] = (byte) cArrArray[iArrayOffset];
                iArrayOffset3++;
                iArrayOffset++;
            }
            while (iArrayOffset < iArrayOffset2) {
                char c = cArrArray[iArrayOffset];
                if (c >= 128) {
                    if (c < 2048) {
                        if (iArrayOffset4 - iArrayOffset3 < 2) {
                            return overflow(charBuffer, iArrayOffset, byteBuffer, iArrayOffset3);
                        }
                        int i2 = iArrayOffset3 + 1;
                        bArrArray[iArrayOffset3] = (byte) ((c >> 6) | 192);
                        iArrayOffset3 = i2 + 1;
                        bArrArray[i2] = (byte) ((c & '?') | 128);
                    } else if (DesugarCharacter.isSurrogate(c)) {
                        if (this.sgp == null) {
                            this.sgp = new Surrogate$Parser();
                        }
                        int i3 = this.sgp.parse(c, cArrArray, iArrayOffset, iArrayOffset2);
                        if (i3 < 0) {
                            UTF_8.updatePositions(charBuffer, iArrayOffset, byteBuffer, iArrayOffset3);
                            return this.sgp.error();
                        }
                        if (iArrayOffset4 - iArrayOffset3 < 4) {
                            return overflow(charBuffer, iArrayOffset, byteBuffer, iArrayOffset3);
                        }
                        int i4 = iArrayOffset3 + 1;
                        bArrArray[iArrayOffset3] = (byte) ((i3 >> 18) | 240);
                        int i5 = i4 + 1;
                        bArrArray[i4] = (byte) (((i3 >> 12) & 63) | 128);
                        int i6 = i5 + 1;
                        bArrArray[i5] = (byte) (((i3 >> 6) & 63) | 128);
                        iArrayOffset3 = i6 + 1;
                        bArrArray[i6] = (byte) ((i3 & 63) | 128);
                        iArrayOffset++;
                    } else {
                        if (iArrayOffset4 - iArrayOffset3 < 3) {
                            return overflow(charBuffer, iArrayOffset, byteBuffer, iArrayOffset3);
                        }
                        int i7 = iArrayOffset3 + 1;
                        bArrArray[iArrayOffset3] = (byte) ((c >> '\f') | 224);
                        int i8 = i7 + 1;
                        bArrArray[i7] = (byte) (((c >> 6) & 63) | 128);
                        i = i8 + 1;
                        bArrArray[i8] = (byte) ((c & '?') | 128);
                    }
                    iArrayOffset++;
                } else {
                    if (iArrayOffset3 >= iArrayOffset4) {
                        return overflow(charBuffer, iArrayOffset, byteBuffer, iArrayOffset3);
                    }
                    i = iArrayOffset3 + 1;
                    bArrArray[iArrayOffset3] = (byte) c;
                }
                iArrayOffset3 = i;
                iArrayOffset++;
            }
            UTF_8.updatePositions(charBuffer, iArrayOffset, byteBuffer, iArrayOffset3);
            return CoderResult.UNDERFLOW;
        }

        private CoderResult encodeBufferLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
            int iPosition = charBuffer.position();
            while (charBuffer.hasRemaining()) {
                char c = charBuffer.get();
                if (c < 128) {
                    if (!byteBuffer.hasRemaining()) {
                        return overflow(charBuffer, iPosition);
                    }
                    byteBuffer.put((byte) c);
                } else if (c < 2048) {
                    if (byteBuffer.remaining() < 2) {
                        return overflow(charBuffer, iPosition);
                    }
                    byteBuffer.put((byte) ((c >> 6) | 192));
                    byteBuffer.put((byte) ((c & '?') | 128));
                } else if (DesugarCharacter.isSurrogate(c)) {
                    if (this.sgp == null) {
                        this.sgp = new Surrogate$Parser();
                    }
                    int i = this.sgp.parse(c, charBuffer);
                    if (i < 0) {
                        return this.sgp.error();
                    }
                    if (byteBuffer.remaining() < 4) {
                        return overflow(charBuffer, iPosition);
                    }
                    byteBuffer.put((byte) ((i >> 18) | 240));
                    byteBuffer.put((byte) (((i >> 12) & 63) | 128));
                    byteBuffer.put((byte) (((i >> 6) & 63) | 128));
                    byteBuffer.put((byte) ((i & 63) | 128));
                    iPosition++;
                } else {
                    if (byteBuffer.remaining() < 3) {
                        return overflow(charBuffer, iPosition);
                    }
                    byteBuffer.put((byte) ((c >> '\f') | 224));
                    byteBuffer.put((byte) (((c >> 6) & 63) | 128));
                    byteBuffer.put((byte) ((c & '?') | 128));
                }
                iPosition++;
            }
            return CoderResult.UNDERFLOW;
        }

        private static CoderResult overflow(CharBuffer charBuffer, int i) {
            return CoderResult.OVERFLOW;
        }

        private static CoderResult overflow(CharBuffer charBuffer, int i, ByteBuffer byteBuffer, int i2) {
            UTF_8.updatePositions(charBuffer, i, byteBuffer, i2);
            return CoderResult.OVERFLOW;
        }

        @Override // java.nio.charset.CharsetEncoder
        public boolean canEncode(char c) {
            return !DesugarCharacter.isSurrogate(c);
        }

        @Override // java.nio.charset.CharsetEncoder
        protected final CoderResult encodeLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
            return (charBuffer.hasArray() && byteBuffer.hasArray()) ? encodeArrayLoop(charBuffer, byteBuffer) : encodeBufferLoop(charBuffer, byteBuffer);
        }

        @Override // java.nio.charset.CharsetEncoder
        public boolean isLegalReplacement(byte[] bArr) {
            return (bArr.length == 1 && bArr[0] >= 0) || super.isLegalReplacement(bArr);
        }
    }

    public UTF_8() {
        super("UTF-8", StandardCharsets.aliases_UTF_8());
    }

    static final void updatePositions(Buffer buffer, int i, Buffer buffer2, int i2) {
        buffer.position(i - buffer.arrayOffset());
        buffer2.position(i2 - buffer2.arrayOffset());
    }

    @Override // j$.sun.nio.cs.Unicode, java.nio.charset.Charset
    public /* bridge */ /* synthetic */ boolean contains(Charset charset) {
        return super.contains(charset);
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
