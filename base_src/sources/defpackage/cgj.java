package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
final class cgj implements phh {
    final /* synthetic */ cgl a;
    private final /* synthetic */ int b;

    public cgj(cgl cglVar, int i) {
        this.b = i;
        this.a = cglVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        switch (this.b) {
            case 0:
                ((oug) ((oug) cgl.a.b()).G((char) 371)).r("CamcorderSnapshot is not available: %s", th);
                cfy cfyVar = (cfy) this.a.b;
                cfyVar.d.a(th, cfyVar.b);
                this.a.d.l(true);
                break;
            default:
                ((oug) ((oug) ((oug) cgl.a.c()).h(th)).G((char) 370)).o("Failed to capture video cover image.");
                break;
        }
    }

    @Override // defpackage.phh
    public final /* synthetic */ void b(Object obj) {
        switch (this.b) {
            case 0:
                this.a.e.add((ckv) obj);
                this.a.d.l(true);
                break;
            default:
                this.a.n.set((Bitmap) obj);
                break;
        }
    }
}
