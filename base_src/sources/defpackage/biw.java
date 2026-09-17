package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
final class biw extends bld {
    final int a;
    public Bitmap b;
    private final Handler c;
    private final long d;

    public biw(Handler handler, int i, long j) {
        this.c = handler;
        this.a = i;
        this.d = j;
    }

    @Override // defpackage.blh
    public final void a(Drawable drawable) {
        this.b = null;
    }

    @Override // defpackage.blh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b = (Bitmap) obj;
        this.c.sendMessageAtTime(this.c.obtainMessage(1, this), this.d);
    }
}
