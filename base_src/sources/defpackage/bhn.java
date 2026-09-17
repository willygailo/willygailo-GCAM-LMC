package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bhn implements bho {
    private final bct a;
    private final List b;
    private final baq c;

    public bhn(ParcelFileDescriptor parcelFileDescriptor, List list, bct bctVar) {
        aae.s(bctVar);
        this.a = bctVar;
        aae.s(list);
        this.b = list;
        this.c = new baq(parcelFileDescriptor);
    }

    @Override // defpackage.bho
    public final int a() {
        return vj.g(this.b, new azm(this.c, this.a));
    }

    @Override // defpackage.bho
    public final Bitmap b(BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(this.c.a().getFileDescriptor(), null, options);
    }

    @Override // defpackage.bho
    public final ImageHeaderParser$ImageType c() {
        return vj.j(this.b, new azj(this.c, this.a));
    }

    @Override // defpackage.bho
    public final void d() {
    }
}
