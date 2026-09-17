package defpackage;

import android.graphics.Bitmap;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes.dex */
final class eup implements hsb {
    final /* synthetic */ eur a;

    public eup(eur eurVar) {
        this.a = eurVar;
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void j(hsp hspVar) {
    }

    @Override // defpackage.hsb
    public final void k(hsp hspVar, final Bitmap bitmap, final int i) {
        this.a.e.post(new Runnable() { // from class: euo
            @Override // java.lang.Runnable
            public final void run() {
                eup eupVar = this.a;
                Bitmap bitmap2 = bitmap;
                int i2 = i;
                ivj ivjVar = (ivj) eupVar.a.l.get();
                eur eurVar = eupVar.a;
                String strC = eurVar.o.c();
                if (strC == null) {
                    jrl jrlVar = jrl.UNINITIALIZED;
                    switch (eurVar.x().ordinal()) {
                        case 1:
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                        case 10:
                            strC = eurVar.i.getString(R.string.photo_accessibility_peek);
                            break;
                        case 2:
                        case 5:
                        case 8:
                        case 13:
                            strC = eurVar.i.getString(R.string.video_accessibility_peek);
                            break;
                        case 9:
                        case 11:
                        case 12:
                        default:
                            strC = eurVar.i.getString(R.string.media_accessibility_peek);
                            break;
                    }
                }
                ivjVar.h(strC);
                ((ivj) eupVar.a.l.get()).j(bitmap2, i2);
            }
        });
        if (this.a.o.s()) {
            ((jxo) this.a.Q.get()).f(bitmap);
        }
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void l(hsp hspVar) {
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void m(long j) {
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void n(Bitmap bitmap) {
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void o(hsp hspVar, lif lifVar) {
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void p(hsp hspVar, hsj hsjVar, hss hssVar) {
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void q(hsp hspVar) {
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void w(hsp hspVar) {
    }
}
