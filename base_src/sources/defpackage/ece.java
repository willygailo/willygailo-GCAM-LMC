package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ece {
    public final ByteBuffer a;
    public final int b;
    public final int c;

    public ece(ByteBuffer byteBuffer, int i, int i2) {
        this.a = byteBuffer.duplicate();
        this.b = i;
        this.c = i2;
    }
}
