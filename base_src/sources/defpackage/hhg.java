package defpackage;

import android.app.Activity;
import com.google.android.apps.camera.bottombar.R;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class hhg implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final /* synthetic */ int d;

    public hhg(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i) {
        this.d = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    public hhg(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, byte[] bArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public hhg(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, char[] cArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public hhg(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, float[] fArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    public hhg(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, int[] iArr) {
        this.d = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
    }

    public hhg(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, short[] sArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public hhg(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, boolean[] zArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public hhg(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, byte[][] bArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    public hhg(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, char[][] cArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        htg htgVar;
        switch (this.d) {
            case 0:
                return new hhe((fmf) this.a.get(), (mos) this.b.get(), (hhl) this.c.get(), null);
            case 1:
                Activity activity = ((eme) this.b).get();
                bqs bqsVar = (bqs) this.a.get();
                pht phtVar = (pht) this.c.get();
                hgx hgxVar = new hgx(activity, bqsVar);
                phtVar.d(hgxVar, pgr.INSTANCE);
                return hgxVar;
            case 2:
                return new hia(mip.bR("BckndCritEx", -8), mip.bR("BckndFastEx", 8), mip.bR("BckndAvgEx", 11), mip.bR("BckndSlowEx", 9), new hjd(), (hhl) this.b.get(), (ljf) this.c.get(), ((emn) this.a).get().getDimensionPixelSize(R.dimen.rounded_thumbnail_diameter_max));
            case 3:
                return new hnv(((emd) this.b).get(), (brc) this.a.get(), ((dgb) this.c).get());
            case 4:
                return new hop((lar) this.c.get(), (ddf) this.a.get(), (lda) this.b.get());
            case 5:
                return new meh(this.b, this.a, this.c);
            case 6:
                return new hrx((lar) this.c.get(), (hpu) this.b.get(), pyr.a(this.a));
            case 7:
                htp htpVar = ((huh) this.c).get();
                ddf ddfVar = (ddf) this.b.get();
                pyn pynVarA = pyr.a(this.a);
                HashSet hashSet = new HashSet(Arrays.asList(htg.values()));
                if (!ddfVar.j(ddl.aF)) {
                    hashSet.remove(htg.FPS_60);
                }
                if (!ddfVar.j(ddl.M)) {
                    hashSet.remove(htg.FPS_AUTO);
                }
                ddi ddiVar = dcu.a;
                ddfVar.f();
                hashSet.remove(htg.FPS_24);
                if (hashSet.contains(htg.FPS_AUTO) && ddfVar.k(ddl.L)) {
                    htgVar = htg.FPS_AUTO;
                } else {
                    if (!hashSet.contains(htg.FPS_30)) {
                        ((oug) ((oug) hus.a.b()).G((char) 2648)).o("30 FPS is not available");
                    }
                    htgVar = htg.FPS_30;
                }
                hup hupVar = ddfVar.k(dcu.v) ? new hup(htpVar.c("pref_video_fps_p2018_key", htgVar.name())) : (hup) pynVarA.get();
                if (!hashSet.contains(hupVar.fA())) {
                    hupVar.fA();
                    hupVar.fB(htgVar);
                }
                qmd.ae(hupVar);
                return hupVar;
            default:
                return new huq((hup) this.b.get(), (hup) this.a.get(), (hup) this.c.get());
        }
    }
}
