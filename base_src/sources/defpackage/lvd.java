package defpackage;

import android.media.Image;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class lvd implements mac {
    private final int a;
    private final int b;
    private final ByteBuffer c;
    private final /* synthetic */ int d;

    public lvd(Image.Plane plane, int i) {
        this.d = i;
        this.a = plane.getPixelStride();
        this.b = plane.getRowStride();
        this.c = plane.getBuffer();
    }

    public lvd(ByteBuffer byteBuffer, int i, int i2, int i3) {
        this.d = i3;
        this.c = byteBuffer;
        this.b = i;
        this.a = i2;
    }

    @Override // defpackage.mac
    public final ByteBuffer getBuffer() {
        switch (this.d) {
            case 0:
                break;
        }
        return this.c;
    }

    @Override // defpackage.mac
    public final int getPixelStride() {
        switch (this.d) {
            case 0:
                break;
        }
        return this.a;
    }

    @Override // defpackage.mac
    public final int getRowStride() {
        switch (this.d) {
            case 0:
                break;
        }
        return this.b;
    }
}
