package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import j$.time.Instant;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class dff implements bue, hsb {
    public static final ouj a = ouj.h("com/google/android/apps/camera/data/CameraFilmstripDataAdapter");
    public final dfi b = new dfi();
    public final phh c = new dfe(this);
    public final Context d;
    public final dfx e;
    public final dga f;
    public final dfs g;
    public final Executor h;
    public final ljf i;
    public final hpu j;
    public final boolean k;
    public final dfu l;
    public final dfu m;
    public final pih n;
    public final huf o;
    public final Instant p;
    public final dfm q;
    public final bqg r;
    private final ddf s;

    public dff(Context context, bqg bqgVar, dfx dfxVar, dga dgaVar, dfs dfsVar, ljf ljfVar, ddf ddfVar, Executor executor, hpu hpuVar, boolean z, huf hufVar, dfm dfmVar) {
        this.d = context;
        this.r = bqgVar;
        this.e = dfxVar;
        this.f = dgaVar;
        this.g = dfsVar;
        this.i = ljfVar;
        this.s = ddfVar;
        this.h = executor;
        this.j = hpuVar;
        this.k = z;
        this.o = hufVar;
        this.q = dfmVar;
        pff pffVar = pff.INSTANCE;
        this.p = Instant.now();
        this.n = pih.f();
        this.l = new dfu();
        this.m = new dfu();
    }

    private final bty v(hsp hspVar) {
        bty btyVarE = e(hspVar);
        obr.aT(true, "Could not find %s in dataAdapter", hspVar);
        return btyVarE;
    }

    private final dfu x(bty btyVar) {
        return btyVar.d() == hss.MEDIA_STORE ? this.l : this.m;
    }

    @Override // defpackage.btx
    public final int a() {
        return r().a();
    }

    @Override // defpackage.btx
    public final bty b() {
        return r().b();
    }

    @Override // defpackage.btx
    public final void c(btw btwVar) {
        dfi dfiVar = this.b;
        obr.aR(dfiVar.a.size() < 4, "More listeners added than is allowed in configured capacity: 4");
        dfiVar.a.add(btwVar);
        if (this.n.isDone()) {
            btwVar.a();
        }
    }

    @Override // defpackage.btx
    public final void d(btw btwVar) {
        this.b.a.remove(btwVar);
    }

    @Override // defpackage.bue
    public final bty e(hsp hspVar) {
        bty btyVarD = this.l.d(hspVar);
        return btyVarD != null ? btyVarD : this.m.d(hspVar);
    }

    @Override // defpackage.bue
    public final bty f(bty btyVar) {
        return x(btyVar).e(btyVar);
    }

    @Override // defpackage.bue
    public final void fN() {
        this.h.execute(new dfb(this, 2));
    }

    @Override // defpackage.bue
    public final void fO() {
        if (a() == 0) {
            pht phtVar = phq.a;
            return;
        }
        pht phtVarY = plk.Y(new dfb(this, 0), this.h);
        plk.af(phtVarY, this.c, this.h);
        this.r.i().c(new dfa(phtVarY, 0));
    }

    @Override // defpackage.bue
    public final pht g() {
        pht phtVarY = plk.Y(new dfb(this, 3), this.h);
        ddf ddfVar = this.s;
        ddi ddiVar = ddl.a;
        ddfVar.e();
        this.r.i().c(new dfa(phtVarY, 1));
        plk.af(phtVarY, this.c, this.h);
        return phtVarY;
    }

    @Override // defpackage.bue
    public final void h() {
        a();
        this.m.h();
        this.b.a();
    }

    @Override // defpackage.bue
    public final void i() {
        g().d(new dfb(this, 1), this.h);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return r().iterator();
    }

    @Override // defpackage.hsb
    public final void j(hsp hspVar) {
        bty btyVarE = e(hspVar);
        if (btyVarE == null) {
            ((oug) ((oug) a.c()).G((char) 716)).r("onSessionCanceled tried to remove URI that couldn't be found: %s", hspVar);
        } else {
            s(btyVarE);
        }
    }

    @Override // defpackage.hsb
    public final void k(hsp hspVar, Bitmap bitmap, int i) {
        if (v(hspVar) == null) {
            return;
        }
        new lig(bitmap.getWidth(), bitmap.getHeight());
        this.b.a();
    }

    @Override // defpackage.hsb
    public final void l(hsp hspVar) {
        bty btyVarV = v(hspVar);
        if (btyVarV == null) {
            return;
        }
        boolean zBooleanValue = ((Boolean) ojc.h(this.j.a(hspVar)).b(bxe.o).e(false)).booleanValue();
        if (btyVarV.d() == hss.MARS_STORE) {
            q(hspVar);
            btz btzVarA = btyVarV.a();
            if (btzVarA instanceof dfo) {
                dfn dfnVar = new dfn((dfo) btzVarA);
                dfnVar.d(false);
                btyVarV.f(dfnVar.a());
                return;
            }
            return;
        }
        if ((btyVarV instanceof dfy) || zBooleanValue) {
            Uri uriC = btyVarV.a().c();
            obr.aT(!uriC.equals(Uri.EMPTY), "Could not find MediaStore URI for %s", hspVar);
            dga dgaVar = this.f;
            t(btyVarV, new dfy(dgaVar.a, dgaVar.b, dgaVar.d.c(uriC, hspVar), btyVarV.d()));
            return;
        }
        if (btyVarV instanceof dfv) {
            Uri uriC2 = btyVarV.a().c();
            obr.aQ(!uriC2.equals(Uri.EMPTY));
            dfx dfxVar = this.e;
            t(btyVarV, new dfv(dfxVar.c, dfxVar.d, dfxVar.f.c(uriC2, hspVar), dfxVar.h, btyVarV.d()));
        }
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
        Instant instantOfEpochMilli;
        hsr hsrVar = hsjVar.c;
        if (hsrVar == hsr.LONG_SHOT || hsrVar == hsr.VIDEO || hsrVar == hsr.TIMELAPSE || hsrVar == hsr.CINEMATIC) {
            if (hsrVar == hsr.LONG_SHOT || !this.k || hsjVar.d) {
                dga dgaVar = this.f;
                pfg pfgVar = dgaVar.c;
                Instant instantNow = Instant.now();
                dfn dfnVarK = dfo.k();
                dfnVarK.c(instantNow);
                dfnVarK.e(instantNow);
                dfnVarK.d(true);
                dfnVarK.b(hsjVar.a);
                dfnVarK.i(hsjVar.b);
                dfnVarK.a = hspVar;
                u(new dfy(dgaVar.a, dgaVar.b, dfnVarK.a(), hssVar));
                return;
            }
            return;
        }
        dfx dfxVar = this.e;
        lig ligVar = (lig) dfxVar.h.c.get(hspVar);
        if (ligVar == null) {
            ligVar = dfx.b;
            ((oug) ((oug) dfx.a.c()).G(760)).A("Size not set for in-progress item %s with mediaStoreRecord %s. Assuming %s", hspVar, hsjVar, ligVar);
        }
        hsa hsaVarA = dfxVar.g.a(hspVar);
        if (hsaVarA == null) {
            pfg pfgVar2 = dfxVar.e;
            instantOfEpochMilli = Instant.now();
        } else {
            instantOfEpochMilli = Instant.ofEpochMilli(hsaVarA.d());
        }
        dfn dfnVarK2 = dfo.k();
        dfnVarK2.a = hspVar;
        dfnVarK2.c(instantOfEpochMilli);
        dfnVarK2.e(instantOfEpochMilli);
        dfnVarK2.b = ligVar;
        dfnVarK2.d(true);
        dfnVarK2.b(hsjVar.a);
        dfnVarK2.i(hsjVar.b);
        u(new dfv(dfxVar.c, dfxVar.d, dfnVarK2.a(), dfxVar.h, hssVar));
    }

    @Override // defpackage.hsb
    public final void q(hsp hspVar) {
        if (v(hspVar) == null) {
            return;
        }
        this.b.a();
    }

    public final dfu r() {
        return ((Boolean) this.o.c(htu.ab)).booleanValue() ? this.m : this.l;
    }

    public final void s(bty btyVar) {
        x(btyVar).j(btyVar);
        this.b.a();
    }

    public final void t(final bty btyVar, bty btyVar2) {
        x(btyVar2).k(btyVar2);
        pht phtVarZ = plk.Z(new Callable() { // from class: dfd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dff dffVar = this.a;
                return Boolean.valueOf(dffVar.g.a(dffVar.d, btyVar));
            }
        }, this.h);
        final dfi dfiVar = this.b;
        phtVarZ.d(new Runnable() { // from class: dfc
            @Override // java.lang.Runnable
            public final void run() {
                dfiVar.a();
            }
        }, this.h);
        this.r.i().c(new dfa(phtVarZ, 2));
    }

    public final void u(bty btyVar) {
        x(btyVar).k(btyVar);
    }

    @Override // defpackage.hsb
    public final void w(hsp hspVar) throws Throwable {
        bty btyVarE = e(hspVar);
        hsa hsaVarA = this.j.a(hspVar);
        if (hsaVarA != null) {
            ((iik) hsaVarA.k()).j(2, SystemClock.elapsedRealtime());
        }
        if (btyVarE != null) {
            s(btyVarE);
        }
    }
}
