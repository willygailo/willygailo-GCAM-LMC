package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bhm implements bho {
    private final ban a;
    private final bct b;
    private final List c;

    public bhm(InputStream inputStream, List list, bct bctVar) {
        aae.s(bctVar);
        this.b = bctVar;
        aae.s(list);
        this.c = list;
        this.a = new ban(inputStream, bctVar);
    }

    @Override // defpackage.bho
    public final int a() {
        return vj.f(this.c, this.a.a(), this.b);
    }

    @Override // defpackage.bho
    public final Bitmap b(BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(this.a.a(), null, options);
    }

    @Override // defpackage.bho
    public final ImageHeaderParser$ImageType c() {
        return vj.i(this.c, this.a.a(), this.b);
    }

    @Override // defpackage.bho
    public final void d() {
        this.a.a.a();
    }
}
