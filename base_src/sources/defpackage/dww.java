package defpackage;

import android.graphics.Bitmap;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class dww implements hsb {
    private static final ouj a = ouj.h("com/google/android/apps/camera/gallery/processing/ProcessingSessionManagerListener");
    private final dxp b;
    private final Set c = Collections.newSetFromMap(new ConcurrentHashMap());
    private final dei d;
    private final ikp e;
    private final dwu f;

    public dww(ikp ikpVar, dxp dxpVar, dwu dwuVar, dei deiVar) {
        this.e = ikpVar;
        this.b = dxpVar;
        this.f = dwuVar;
        this.d = deiVar;
    }

    private final void a(hsp hspVar) {
        this.c.add(hspVar);
        if (this.f.b(hspVar).g()) {
            this.f.d(hspVar).close();
        } else {
            ((oug) ((oug) a.c()).G((char) 967)).r("Refusing to remove %s from processingMediaManager because it is not present. It's likely the mediaStoreInsertion future was canceled", hspVar);
        }
    }

    @Override // defpackage.hsb
    public final void j(hsp hspVar) {
        a(hspVar);
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void k(hsp hspVar, Bitmap bitmap, int i) {
    }

    @Override // defpackage.hsb
    public final void l(hsp hspVar) {
        a(hspVar);
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void m(long j) {
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void n(Bitmap bitmap) {
    }

    @Override // defpackage.hsb
    public final void o(hsp hspVar, lif lifVar) {
        if (this.c.contains(hspVar)) {
            return;
        }
        dws dwsVar = (dws) this.f.b(hspVar).f();
        if (dwsVar == null) {
            ((oug) ((oug) a.c()).G((char) 961)).r("#onSessionProgress update for neither completed nor queued shot %s", hspVar);
        } else {
            dwsVar.d(lifVar);
        }
    }

    @Override // defpackage.hsb
    public final void p(hsp hspVar, hsj hsjVar, hss hssVar) {
        this.f.e(hspVar, new dws(hsjVar));
        if (hssVar == hss.MEDIA_STORE) {
            dxh dxhVar = dxh.NONE;
            hsr hsrVar = hsr.UNKNOWN;
            switch (hsjVar.c.ordinal()) {
                case 4:
                    dxhVar = dxh.BURSTS;
                    break;
                case 5:
                    dxhVar = dxh.PANORAMA;
                    break;
                case 6:
                    dxhVar = dxh.PHOTOSPHERE;
                    break;
                case 10:
                    dxhVar = dxh.PORTRAIT;
                    break;
                case 12:
                    dxhVar = dxh.NIGHT;
                    break;
                case 13:
                    dxhVar = dxh.TIMELAPSE;
                    break;
                case 16:
                    dxhVar = !this.d.b(dei.DOGFOOD) ? dxh.MOTION_BLUR : dxh.DOGFOOD_ONLY;
                    break;
                case 17:
                    dxhVar = dxh.CINEMATIC;
                    break;
            }
            this.b.b(hsjVar.a, dxhVar);
        }
    }

    @Override // defpackage.hsb
    public final void q(hsp hspVar) {
        if (this.c.contains(hspVar)) {
            return;
        }
        dws dwsVar = (dws) this.f.b(hspVar).f();
        if (dwsVar == null) {
            ((oug) ((oug) a.c()).G((char) 965)).r("#onSessionUpdated Update for neither completed nor queued shot %s", hspVar);
            return;
        }
        ojc ojcVarA = this.e.a(hspVar);
        if (ojcVarA.g()) {
            dwsVar.c((bcl) ojcVarA.c());
        } else {
            ((oug) ((oug) a.b()).G((char) 964)).r("thumbnailDrawable not present for shot %s", hspVar);
        }
    }

    @Override // defpackage.hsb
    public final void w(hsp hspVar) {
        a(hspVar);
    }
}
