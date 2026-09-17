package defpackage;

import com.google.android.libraries.lens.lenslite.api.ImageProxy;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class fex implements ImageProxy.Plane {
    private final mac a;

    public fex(mac macVar) {
        this.a = macVar;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.ImageProxy.Plane
    public final ByteBuffer getBuffer() {
        return this.a.getBuffer();
    }

    @Override // com.google.android.libraries.lens.lenslite.api.ImageProxy.Plane
    public final int getPixelStride() {
        return this.a.getPixelStride();
    }

    @Override // com.google.android.libraries.lens.lenslite.api.ImageProxy.Plane
    public final int getRowStride() {
        return this.a.getRowStride();
    }
}
