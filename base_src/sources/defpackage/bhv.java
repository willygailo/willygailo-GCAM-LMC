package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class bhv implements bhd {
    private final bht a;
    private final blu b;

    public bhv(bht bhtVar, blu bluVar) {
        this.a = bhtVar;
        this.b = bluVar;
    }

    @Override // defpackage.bhd
    public final void a(bcv bcvVar, Bitmap bitmap) throws IOException {
        IOException iOException = this.b.c;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            bcvVar.d(bitmap);
            throw iOException;
        }
    }

    @Override // defpackage.bhd
    public final void b() {
        this.a.a();
    }
}
