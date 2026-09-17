package defpackage;

import com.google.common.io.ByteStreams;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
final class mdb implements mdd {
    private final InputStream a;

    public mdb(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.mdd
    public final int a() {
        return this.a.read();
    }

    @Override // defpackage.mdd
    public final mdc b(int i, int i2) {
        byte[] bArr = new byte[i];
        return new mdc(bArr, i2, 0, ByteStreams.read(this.a, bArr, 0, i));
    }

    @Override // defpackage.mdd
    public final void c(int i) throws IOException {
        ByteStreams.skipFully(this.a, i);
    }

    @Override // defpackage.mdd
    public final mdc d() {
        byte[] byteArray = ByteStreams.toByteArray(this.a);
        return new mdc(byteArray, 218, 0, byteArray.length);
    }
}
