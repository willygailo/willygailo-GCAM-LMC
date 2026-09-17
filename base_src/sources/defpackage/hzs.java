package defpackage;

import com.google.android.apps.camera.smarts.SmartsChipView;

/* JADX INFO: loaded from: classes2.dex */
final class hzs implements iay {
    final /* synthetic */ iay a;
    final /* synthetic */ hzu b;

    public hzs(hzu hzuVar, iay iayVar) {
        this.b = hzuVar;
        this.a = iayVar;
    }

    @Override // defpackage.iay
    public final void a() {
        hzy hzyVar = (hzy) this.a;
        hzyVar.c.d.h(hzyVar.b);
        hzyVar.c.e.remove(hzyVar.b);
    }

    @Override // defpackage.iay
    public final void b(iax iaxVar) {
        if (this.b.e) {
            hzy hzyVar = (hzy) this.a;
            iav iavVar = hzyVar.a;
            iat iatVar = hzyVar.b;
            hzz hzzVar = hzyVar.c;
            SmartsChipView smartsChipView = hzzVar.a;
            smartsChipView.getClass();
            hzb hzbVar = new hzb(iavVar, iatVar, iaxVar, smartsChipView, hzzVar.g, hzzVar.h, hzzVar.c, hzzVar.j, hzzVar.i, null);
            hzyVar.c.d.d(hzbVar);
            hzyVar.c.e.put(hzyVar.b, hzbVar);
        }
    }

    @Override // defpackage.iay
    public final void c(final iax iaxVar) {
        if (this.b.e) {
            hzy hzyVar = (hzy) this.a;
            final iap iapVar = (iap) hzyVar.c.e.get(hzyVar.b);
            if (iapVar != null) {
                hzyVar.c.f.c(new Runnable() { // from class: hzx
                    @Override // java.lang.Runnable
                    public final void run() {
                        iapVar.r(iaxVar);
                    }
                });
            }
        }
    }
}
