package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
final class lfx {
    public final MediaCodec.BufferInfo a;
    public final ByteBuffer b;

    public lfx() {
    }

    public lfx(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        if (bufferInfo == null) {
            throw new NullPointerException("Null bufferInfo");
        }
        this.a = bufferInfo;
        if (byteBuffer == null) {
            throw new NullPointerException("Null byteBuffer");
        }
        this.b = byteBuffer;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lfx) {
            lfx lfxVar = (lfx) obj;
            if (this.a.equals(lfxVar.a) && this.b.equals(lfxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 37 + String.valueOf(strValueOf2).length());
        sb.append("AudioBuffer{bufferInfo=");
        sb.append(strValueOf);
        sb.append(", byteBuffer=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }
}
