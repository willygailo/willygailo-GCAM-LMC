package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.bottombar.BottomBar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ibz implements idc, fik, fhw, fig, fij, fii {
    private static final ouj t = ouj.h("com/google/android/apps/camera/socialshare/SocialShareControllerImpl");
    private final dfx A;
    private final dga B;
    private final Handler C;
    public final Resources a;
    public final Activity b;
    public final qkg c;
    public final ida d;
    public final ibe e;
    public final ixj f;
    public final bue g;
    public final hrx h;
    public final lco i;
    public final BottomBar j;
    public final fhv k;
    public final lar l;
    public final huf m;
    public final hug n;
    public final bqg s;
    private final icf u;
    private final hpu v;
    private final iet w;
    private final idt x;
    private final boolean y;
    private final hnx z;
    private final Set D = new HashSet();
    public final List o = new ArrayList();
    public final idd p = new ibw(this);
    private boolean E = false;
    public int q = 0;
    public String r = "";

    public ibz(Activity activity, qkg qkgVar, ida idaVar, icf icfVar, hpu hpuVar, ibe ibeVar, ixj ixjVar, bue bueVar, hrx hrxVar, lda ldaVar, BottomBar bottomBar, fhv fhvVar, bqg bqgVar, iet ietVar, idt idtVar, boolean z, hnx hnxVar, dfx dfxVar, dga dgaVar, lar larVar, huf hufVar, hug hugVar, Handler handler) {
        this.a = activity.getResources();
        this.b = activity;
        this.c = qkgVar;
        this.d = idaVar;
        this.u = icfVar;
        this.v = hpuVar;
        this.e = ibeVar;
        this.f = ixjVar;
        this.g = bueVar;
        this.h = hrxVar;
        this.i = lci.c(ldaVar);
        this.j = bottomBar;
        this.k = fhvVar;
        this.s = bqgVar;
        this.w = ietVar;
        this.x = idtVar;
        this.y = z;
        this.z = hnxVar;
        this.A = dfxVar;
        this.B = dgaVar;
        this.l = larVar;
        this.m = hufVar;
        this.n = hugVar;
        this.C = handler;
    }

    private final void m(boolean z, bty btyVar) {
        if (this.y && btyVar != null) {
            this.z.d(btyVar.a(), btyVar.b());
            return;
        }
        if (this.u.e(btyVar) != 1) {
            ((icw) this.c.get()).j();
            return;
        }
        btyVar.getClass();
        btz btzVarA = btyVar.a();
        hsp hspVarD = btzVarA.d();
        hsa hsaVarA = hspVarD == null ? null : this.v.a(hspVarD);
        boolean z2 = hsaVarA != null && hsaVarA.a().e >= 100;
        if (!btzVarA.j() || z2) {
            ((icw) this.c.get()).b(btyVar, z);
        } else {
            ((icw) this.c.get()).d(btyVar, z);
        }
    }

    @Override // defpackage.idc
    public final void a(idd iddVar) {
        synchronized (this.o) {
            this.o.size();
            this.o.add(iddVar);
        }
    }

    @Override // defpackage.fhw
    public final void b(int i, int i2) {
        if (i == 1000 && i2 == -1) {
            this.E = true;
            ((icw) this.c.get()).n();
        }
    }

    @Override // defpackage.fij
    public final void e() {
        k(idb.NOT_STARTED);
    }

    @Override // defpackage.idc
    public final void f(ViewStub viewStub) {
        this.x.f();
        final ida idaVar = this.d;
        idaVar.f = viewStub.inflate();
        ((ViewGroup) idaVar.f.getParent()).setWillNotDraw(false);
        idaVar.d.d(idaVar.f);
        idaVar.g = idaVar.f.findViewById(R.id.social_processing_layout);
        idaVar.c.d(idaVar.f);
        idaVar.f.post(new Runnable() { // from class: icx
            @Override // java.lang.Runnable
            public final void run() {
                idaVar.b.o(null);
            }
        });
        this.d.b.d(new ibv(this, 0), this.l);
    }

    @Override // defpackage.fig
    public final void fV() {
        this.d.c();
        this.w.e();
        if (this.E) {
            this.E = false;
            this.C.post(new ibv(this, 1));
        }
    }

    @Override // defpackage.fii
    public final void fW() {
        l(idb.NOT_STARTED);
    }

    @Override // defpackage.idc
    public final void g(jrz jrzVar) {
        this.d.h = jrzVar;
        this.w.f(jrzVar);
        this.d.c();
    }

    public final void h(boolean z) {
        m(z, this.g.b());
    }

    @Override // defpackage.idc
    public final void i(Parcelable parcelable, Serializable serializable) {
        bty dfyVar;
        bua buaVar = (bua) serializable;
        btz btzVar = (btz) parcelable;
        if (bua.PHOTO.equals(buaVar)) {
            dfx dfxVar = this.A;
            dfyVar = new dfv(dfxVar.c, dfxVar.d, btzVar, dfxVar.h, hss.MEDIA_STORE);
        } else if (!bua.VIDEO.equals(buaVar)) {
            ((oug) ((oug) t.c()).G(2785)).A("%sopen: invalid item type=%s data=%s", this.r, buaVar, btzVar);
            return;
        } else {
            dga dgaVar = this.B;
            dfyVar = new dfy(dgaVar.a, dgaVar.b, btzVar, hss.MEDIA_STORE);
        }
        m(false, this.g.f(dfyVar));
    }

    @Override // defpackage.idc
    public final void j(idd iddVar) {
        synchronized (this.o) {
            this.o.remove(iddVar);
        }
    }

    final synchronized void k(idb idbVar) {
        this.D.add(idbVar);
        ((icw) this.c.get()).a();
    }

    final synchronized void l(idb idbVar) {
        this.D.remove(idbVar);
        if (this.D.isEmpty()) {
            ((icw) this.c.get()).i();
        }
    }
}
