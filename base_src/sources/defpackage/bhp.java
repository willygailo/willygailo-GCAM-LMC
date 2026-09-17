package defpackage;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class bhp implements azv {
    private final bgh a = new bgh(null);
    private final /* synthetic */ int b;

    public bhp(int i) {
        this.b = i;
    }

    public bhp(int i, byte[] bArr) {
        this.b = i;
    }

    @Override // defpackage.azv
    public final /* synthetic */ bcl a(Object obj, int i, int i2, azt aztVar) {
        switch (this.b) {
            case 0:
                return this.a.a(ImageDecoder.createSource(blr.c((InputStream) obj)), i, i2, aztVar);
            default:
                return this.a.a(ImageDecoder.createSource((ByteBuffer) obj), i, i2, aztVar);
        }
    }

    @Override // defpackage.azv
    public final /* synthetic */ boolean b(Object obj, azt aztVar) {
        switch (this.b) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
