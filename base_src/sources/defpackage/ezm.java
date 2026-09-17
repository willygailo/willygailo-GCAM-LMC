package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
final class ezm implements phh {
    final /* synthetic */ ezn a;

    public ezm(ezn eznVar) {
        this.a = eznVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        ((oug) ((oug) ((oug) ezn.a.b()).h(th)).G((char) 1596)).o("Failed to get screenshot.");
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            this.a.b(bitmap, true);
        }
    }
}
