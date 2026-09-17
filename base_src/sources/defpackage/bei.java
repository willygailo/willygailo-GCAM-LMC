package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class bei implements beg {
    private final /* synthetic */ int a;

    public bei(int i) {
        this.a = i;
    }

    @Override // defpackage.beg
    public final Class a() {
        switch (this.a) {
            case 0:
                return InputStream.class;
            default:
                return ByteBuffer.class;
        }
    }

    @Override // defpackage.beg
    public final /* synthetic */ Object b(byte[] bArr) {
        switch (this.a) {
            case 0:
                return new ByteArrayInputStream(bArr);
            default:
                return ByteBuffer.wrap(bArr);
        }
    }
}
