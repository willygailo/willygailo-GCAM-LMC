package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Handler;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ibe implements hsb, btw {
    private static final ope h = ope.K(hsr.NORMAL, hsr.HDR_PLUS, hsr.HDR_PLUS_AUTO, hsr.PORTRAIT);
    public final qkg a;
    public final icf b;
    public final Handler c;
    public final Runnable d = new Runnable() { // from class: ibc
        @Override // java.lang.Runnable
        public final void run() {
            ibe ibeVar = this.a;
            hsp hspVar = ibeVar.g;
            boolean zHasCallbacks = ibeVar.c.hasCallbacks(ibeVar.d);
            if (hspVar == null || zHasCallbacks) {
                ibeVar.c();
                return;
            }
            ibeVar.g = null;
            icl iclVar = (icl) ibeVar.a.get();
            icf icfVar = ibeVar.b;
            if (icfVar.e(icfVar.c.e(hspVar)) == 2) {
                ibeVar.c();
                iclVar.j();
                return;
            }
            boolean zIsFinishing = ibeVar.e.isFinishing();
            boolean zIsDestroyed = ibeVar.e.isDestroyed();
            ibeVar.f.q();
            if (zIsFinishing || zIsDestroyed) {
                ibeVar.c();
            } else {
                ibeVar.c();
                iclVar.gk();
            }
        }
    };
    public final Activity e;
    public final eam f;
    public hsp g;
    private final qkg i;
    private final lar j;
    private final Resources k;
    private hsp l;

    public ibe(qkg qkgVar, qkg qkgVar2, icf icfVar, lar larVar, Handler handler, Activity activity, Resources resources, eam eamVar) {
        this.a = qkgVar;
        this.i = qkgVar2;
        this.b = icfVar;
        this.j = larVar;
        this.c = handler;
        this.e = activity;
        this.k = resources;
        this.f = eamVar;
    }

    private final void d(hsp hspVar) {
        b();
        c();
        f(hspVar);
        if (hspVar.equals(this.g)) {
            this.c.postDelayed(this.d, this.k.getInteger(R.integer.social_handle_reveal_delay));
        }
    }

    private final void e(hsp hspVar) {
        b();
        bty btyVar = ((icw) this.a.get()).t;
        hsp hspVarD = btyVar == null ? null : btyVar.a().d();
        c();
        f(hspVar);
        hsp hspVar2 = this.g;
        if (hspVar2 == null) {
            ((icw) this.a.get()).j();
        } else if (hspVar2.equals(hspVar)) {
            this.g = null;
        }
        if (hspVarD == null || !hspVarD.equals(hspVar)) {
            return;
        }
        ((icw) this.a.get()).k();
    }

    private final void f(hsp hspVar) {
        if (hspVar.equals(this.l)) {
            c();
            this.l = null;
            ((ibz) this.i.get()).l(idb.SLOW_CAPTURE);
        }
    }

    @Override // defpackage.btw
    public final void a() {
        bty btyVar = ((icw) this.a.get()).t;
        boolean z = (btyVar == null || btyVar.a().j()) ? false : true;
        boolean z2 = btyVar != null && btyVar.a().j();
        c();
        if (z) {
            lar larVar = this.j;
            icw icwVar = (icw) this.a.get();
            icwVar.getClass();
            larVar.c(new ibd(icwVar, 1));
            return;
        }
        if (z2) {
            lar larVar2 = this.j;
            icw icwVar2 = (icw) this.a.get();
            icwVar2.getClass();
            larVar2.c(new ibd(icwVar2, 0));
        }
    }

    final void b() {
        this.c.removeCallbacks(this.d);
    }

    public final void c() {
        String hexString = Integer.toHexString(((icw) this.a.get()).hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 2);
        sb.append("[");
        sb.append(hexString);
        sb.append("]");
        sb.toString();
    }

    @Override // defpackage.hsb
    public final void j(hsp hspVar) {
        e(hspVar);
    }

    @Override // defpackage.hsb
    public final void k(hsp hspVar, Bitmap bitmap, int i) {
        c();
        d(hspVar);
    }

    @Override // defpackage.hsb
    public final void l(hsp hspVar) {
        c();
        d(hspVar);
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
    public final void p(hsp hspVar, hsj hsjVar, hss hssVar) {
        b();
        hsr hsrVar = hsjVar.c;
        c();
        this.g = hspVar;
        boolean z = true;
        boolean z2 = h.contains(hsrVar) && ((Boolean) this.f.a().fA()).booleanValue();
        if (!hsrVar.equals(hsr.LONG_EXPOSURE) && !z2) {
            z = false;
        }
        if (((ibz) this.i.get()).q == 0 && z) {
            c();
            ((ibz) this.i.get()).k(idb.SLOW_CAPTURE);
            this.l = hspVar;
        }
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void q(hsp hspVar) {
    }

    @Override // defpackage.hsb
    public final void w(hsp hspVar) {
        e(hspVar);
    }
}
