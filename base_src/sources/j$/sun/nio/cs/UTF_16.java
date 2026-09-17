package j$.sun.nio.cs;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/* JADX INFO: loaded from: classes2.dex */
public class UTF_16 extends Unicode {

    class Decoder extends UnicodeDecoder {
        public Decoder(Charset charset) {
            super(charset, 0);
        }
    }

    class Encoder extends UnicodeEncoder {
        public Encoder(Charset charset) {
            super(charset, 0, true);
        }
    }

    public UTF_16() {
        super("UTF-16", StandardCharsets.aliases_UTF_16());
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
