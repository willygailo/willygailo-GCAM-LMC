package defpackage;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class bgl implements azw {
    private final bcv a;
    private final azw b;

    public bgl(bcv bcvVar, azw azwVar) {
        this.a = bcvVar;
        this.b = azwVar;
    }

    @Override // defpackage.aze
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, azt aztVar) {
        return this.b.a(new bgn(((BitmapDrawable) ((bcl) obj).c()).getBitmap(), this.a), file, aztVar);
    }

    @Override // defpackage.azw
    public final int b() {
        return 2;
    }
}
