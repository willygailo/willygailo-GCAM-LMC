package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class biu extends bik implements bch {
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public biu(BitmapDrawable bitmapDrawable, int i) {
        super(bitmapDrawable);
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public biu(bis bisVar, int i) {
        super(bisVar);
        this.b = i;
    }

    @Override // defpackage.bcl
    public final int a() {
        switch (this.b) {
            case 0:
                biz bizVar = ((bis) this.a).a.a;
                azc azcVar = (azc) bizVar.a;
                return azcVar.a.limit() + azcVar.c.length + (azcVar.d.length * 4) + bizVar.j;
            default:
                return bmf.a(((BitmapDrawable) this.a).getBitmap());
        }
    }

    @Override // defpackage.bcl
    public final Class b() {
        switch (this.b) {
            case 0:
                return bis.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // defpackage.bik, defpackage.bch
    public final void d() {
        switch (this.b) {
            case 0:
                ((bis) this.a).a().prepareToDraw();
                break;
            default:
                ((BitmapDrawable) this.a).getBitmap().prepareToDraw();
                break;
        }
    }

    @Override // defpackage.bcl
    public final void e() {
        bct bctVar;
        switch (this.b) {
            case 0:
                ((bis) this.a).stop();
                bis bisVar = (bis) this.a;
                bisVar.b = true;
                biz bizVar = bisVar.a.a;
                bizVar.b.clear();
                bizVar.d();
                bizVar.f();
                biw biwVar = bizVar.e;
                if (biwVar != null) {
                    bizVar.c.f(biwVar);
                    bizVar.e = null;
                }
                biw biwVar2 = bizVar.g;
                if (biwVar2 != null) {
                    bizVar.c.f(biwVar2);
                    bizVar.g = null;
                }
                biw biwVar3 = bizVar.i;
                if (biwVar3 != null) {
                    bizVar.c.f(biwVar3);
                    bizVar.i = null;
                }
                azc azcVar = (azc) bizVar.a;
                azcVar.f = null;
                byte[] bArr = azcVar.c;
                if (bArr != null) {
                    azcVar.j.b(bArr);
                }
                int[] iArr = azcVar.d;
                if (iArr != null && (bctVar = azcVar.j.b) != null) {
                    bctVar.c(iArr);
                }
                Bitmap bitmap = azcVar.g;
                if (bitmap != null) {
                    azcVar.j.a(bitmap);
                }
                azcVar.g = null;
                azcVar.a = null;
                azcVar.h = null;
                byte[] bArr2 = azcVar.b;
                if (bArr2 != null) {
                    azcVar.j.b(bArr2);
                }
                bizVar.f = true;
                break;
            default:
                ((BitmapDrawable) this.a).getBitmap().recycle();
                break;
        }
    }
}
