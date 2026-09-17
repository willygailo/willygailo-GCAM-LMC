package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bhl implements bho {
    private final ByteBuffer a;
    private final List b;
    private final bct c;

    public bhl(ByteBuffer byteBuffer, List list, bct bctVar) {
        this.a = byteBuffer;
        this.b = list;
        this.c = bctVar;
    }

    @Override // defpackage.bho
    public final int a() {
        List list = this.b;
        ByteBuffer byteBufferD = blr.d(this.a);
        bct bctVar = this.c;
        if (byteBufferD == null) {
            return -1;
        }
        return vj.g(list, new azk(byteBufferD, bctVar));
    }

    @Override // defpackage.bho
    public final Bitmap b(BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(blr.a(blr.d(this.a)), null, options);
    }

    @Override // defpackage.bho
    public final ImageHeaderParser$ImageType c() {
        return vj.h(this.b, blr.d(this.a));
    }

    @Override // defpackage.bho
    public final void d() {
    }
}
