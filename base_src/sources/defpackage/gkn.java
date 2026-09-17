package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* JADX INFO: loaded from: classes.dex */
final class gkn implements phh {
    final /* synthetic */ gko a;
    private final /* synthetic */ int b;

    public gkn(gko gkoVar, int i) {
        this.b = i;
        this.a = gkoVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        switch (this.b) {
            case 0:
                this.a.e.a.e("Failed to save image!", th);
                break;
            case 1:
                this.a.e.a.e("Jpeg encoding result failed, not updating remote thumbnail.", th);
                break;
            case 2:
                this.a.e.a.e("Failed to generate thumbnail", th);
                break;
            case 3:
                this.a.e.a.e("Failed to generate thumbnail", th);
                break;
            default:
                this.a.e.a.e("Failed to generate thumbnails", th);
                break;
        }
    }

    @Override // defpackage.phh
    public final /* synthetic */ void b(Object obj) {
        int i = 0;
        switch (this.b) {
            case 0:
                gjx gjxVar = (gjx) obj;
                synchronized (this.a.e.f) {
                    gjxVar.getClass();
                    gkp gkpVar = this.a.e;
                    gkpVar.i = 2;
                    gkpVar.a.g("Setting final result");
                    this.a.e.d.a(gjxVar.d);
                    ikc ikcVar = new ikc(mbs.JPEG);
                    ikcVar.a(gjxVar.d);
                    ikcVar.b(lic.b(gjxVar.c));
                    this.a.a.r(gjxVar.b, ikcVar);
                    this.a.e.a.g("Done saving image");
                    break;
                }
                return;
            case 1:
                gjx gjxVar2 = (gjx) obj;
                synchronized (this.a.e.f) {
                    int i2 = this.a.e.i;
                    if (i2 == 0) {
                        throw null;
                    }
                    if (i2 == 3) {
                        return;
                    }
                    gjxVar2.getClass();
                    byte[] bArr = gjxVar2.b;
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    hsa hsaVar = this.a.a;
                    bitmapDecodeByteArray.getClass();
                    hsaVar.U(bitmapDecodeByteArray, gjxVar2.c);
                    gko gkoVar = this.a;
                    gkoVar.a.W(gkoVar.c.a(bitmapDecodeByteArray, 0, gkoVar.b.d));
                    this.a.e.i = 2;
                    return;
                }
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                synchronized (this.a.e.f) {
                    gko gkoVar2 = this.a;
                    gkp gkpVar2 = gkoVar2.e;
                    int i3 = gkpVar2.i;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == 4) {
                        return;
                    }
                    gkpVar2.i = 3;
                    hsa hsaVar2 = gkoVar2.a;
                    hoh hohVar = gkoVar2.c;
                    bitmap.getClass();
                    hsaVar2.W(hohVar.a(bitmap, 0, gkoVar2.b.d));
                    return;
                }
            case 3:
                Bitmap bitmap2 = (Bitmap) obj;
                synchronized (this.a.e.f) {
                    gko gkoVar3 = this.a;
                    gkp gkpVar3 = gkoVar3.e;
                    int i4 = gkpVar3.i;
                    if (i4 == 0) {
                        throw null;
                    }
                    if (i4 == 4) {
                        return;
                    }
                    gkpVar3.i = 3;
                    if (!gkoVar3.c.e(gkoVar3.b.d)) {
                        lic licVar = this.a.d;
                        licVar.getClass();
                        i = licVar.e;
                    }
                    gko gkoVar4 = this.a;
                    hsa hsaVar3 = gkoVar4.a;
                    hoh hohVar2 = gkoVar4.c;
                    bitmap2.getClass();
                    lic licVar2 = gkoVar4.d;
                    licVar2.getClass();
                    hsaVar3.U(hohVar2.a(bitmap2, licVar2.e, gkoVar4.b.d), i);
                    return;
                }
            default:
                glq glqVar = (glq) obj;
                glqVar.getClass();
                plk.af(glqVar.b, new gkn(this.a, 2), pgr.INSTANCE);
                plk.af(glqVar.a, new gkn(this.a, 3), pgr.INSTANCE);
                return;
        }
    }
}
