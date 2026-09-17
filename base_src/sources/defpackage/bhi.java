package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class bhi implements azg {
    @Override // defpackage.azg
    public final int a(InputStream inputStream, bct bctVar) throws Throwable {
        ade adeVar = new ade(inputStream);
        adb adbVarA = adeVar.a("Orientation");
        int iA = 1;
        if (adbVarA != null) {
            try {
                iA = adbVarA.a(adeVar.j);
            } catch (NumberFormatException e) {
            }
        }
        if (iA == 0) {
            return -1;
        }
        return iA;
    }

    @Override // defpackage.azg
    public final int b(ByteBuffer byteBuffer, bct bctVar) {
        return a(blr.a(byteBuffer), bctVar);
    }

    @Override // defpackage.azg
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.azg
    public final ImageHeaderParser$ImageType d(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
