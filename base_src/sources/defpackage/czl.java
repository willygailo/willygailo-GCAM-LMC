package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.ArrayMap;
import com.google.android.apps.camera.bottombar.R;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class czl implements iat, hzh, cyv {
    public final imt A;
    public final long B;
    public long D;
    public final cyp E;
    public imr F;
    private final Executor G;
    private final ddf H;
    public final cyw b;
    public final dbr c;
    public final dbg d;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final Executor k;
    public iay l;
    public final lar o;
    public final fvv p;
    public final jcw q;
    public final qkg r;
    public final hzi s;
    public final gvb t;
    public final lco u;
    public boolean v;
    public final ScheduledExecutorService w;
    public final bxy x;
    public final ims y;
    public final cyl z;
    public lie a = bug.h;
    public final Map e = new ConcurrentHashMap();
    public ojc m = oih.a;
    public ojc n = oih.a;
    public ojc C = oih.a;
    public final lap j = new lap();

    public czl(cyw cywVar, ljl ljlVar, lar larVar, fvv fvvVar, jcw jcwVar, qkg qkgVar, hzi hziVar, gvb gvbVar, lco lcoVar, dbr dbrVar, dbg dbgVar, ddf ddfVar, ScheduledExecutorService scheduledExecutorService, Executor executor, cyp cypVar, bxy bxyVar, cyl cylVar, imt imtVar, ims imsVar) {
        this.b = cywVar;
        this.c = dbrVar;
        this.d = dbgVar;
        this.k = ljlVar;
        this.o = larVar;
        this.p = fvvVar;
        this.q = jcwVar;
        this.r = qkgVar;
        this.s = hziVar;
        this.t = gvbVar;
        this.u = lcoVar;
        this.v = ((Boolean) lcoVar.fA()).booleanValue();
        this.G = executor;
        this.H = ddfVar;
        this.w = scheduledExecutorService;
        this.E = cypVar;
        this.z = cylVar;
        this.A = imtVar;
        this.x = bxyVar;
        this.y = imsVar;
        this.B = TimeUnit.SECONDS.toMillis(1L) / ((long) ((Integer) ddfVar.a(ddp.c).c()).intValue());
    }

    @Override // defpackage.iat
    public final void a() {
        this.k.execute(new lsl(this.j, 1));
    }

    @Override // defpackage.iat
    public final void b(final iay iayVar) {
        this.k.execute(new Runnable() { // from class: czg
            @Override // java.lang.Runnable
            public final void run() {
                czl czlVar = this.a;
                czlVar.l = iayVar;
                if (czlVar.n.g()) {
                    czlVar.i(czlVar.e((cyk) czlVar.n.c()));
                }
            }
        });
    }

    @Override // defpackage.cyv
    public final void c(long j) {
        mad madVar = (mad) this.e.remove(Long.valueOf(j));
        if (madVar != null) {
            madVar.close();
        }
    }

    @Override // defpackage.cyv
    public final void d(final czo czoVar) {
        this.k.execute(new Runnable() { // from class: czf
            @Override // java.lang.Runnable
            public final void run() {
                czl czlVar = this.a;
                czo czoVar2 = czoVar;
                if (czlVar.f) {
                    czlVar.f(czoVar2.b);
                    long j = czoVar2.a;
                    ojc ojcVar = czoVar2.c;
                    if (ojcVar.g()) {
                        oor oorVar = ((cyn) ojcVar.c()).a;
                        if (!oorVar.isEmpty()) {
                            czlVar.c.fL(j, oorVar);
                        }
                        ojc ojcVar2 = ((cyn) ojcVar.c()).b;
                        if (ojcVar2.g()) {
                            ArrayMap arrayMap = new ArrayMap();
                            for (nwg nwgVar : ((nwh) ojcVar2.c()).a) {
                                nwi nwiVar = nwgVar.a;
                                if (nwiVar == null) {
                                    nwiVar = nwi.b;
                                }
                                ppj ppjVar = nwiVar.a;
                                if (!ppjVar.isEmpty()) {
                                    arrayMap.put(Long.valueOf(nwgVar.b), ppjVar);
                                }
                            }
                            if (arrayMap.isEmpty()) {
                                return;
                            }
                            czlVar.d.g(j, arrayMap);
                        }
                    }
                }
            }
        });
    }

    public final iax e(final cyk cykVar) {
        iaw iawVarA = iax.a();
        String str = cykVar.b;
        if (str != null) {
            iawVarA.b = str;
        }
        Drawable drawable = cykVar.d;
        if (drawable != null) {
            iawVarA.c = drawable;
        }
        final int i = 1;
        iawVarA.d = new Runnable(this) { // from class: cze
            public final /* synthetic */ czl a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        czl czlVar = this.a;
                        cyk cykVar2 = cykVar;
                        cykVar2.e.run();
                        fjs fjsVar = czlVar.E.a;
                        poy poyVarM = pcj.d.m();
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        pcj pcjVar = (pcj) poyVarM.b;
                        pcjVar.c = 3;
                        pcjVar.a |= 2;
                        pck pckVarB = cyp.b(cykVar2);
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        pcj pcjVar2 = (pcj) poyVarM.b;
                        pckVarB.getClass();
                        pcjVar2.b = pckVarB;
                        pcjVar2.a = 1 | pcjVar2.a;
                        fjsVar.s((pcj) poyVarM.j());
                        break;
                    case 1:
                        final czl czlVar2 = this.a;
                        final cyk cykVar3 = cykVar;
                        if (cykVar3.i == 1) {
                            ((hzq) czlVar2.r.get()).a(new iar() { // from class: czb
                                @Override // defpackage.iar
                                public final void a(final Bitmap bitmap) {
                                    final czl czlVar3 = czlVar2;
                                    final cyk cykVar4 = cykVar3;
                                    if (bitmap != null) {
                                        czlVar3.o.execute(new Runnable() { // from class: czd
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                pmh pmhVar;
                                                czl czlVar4 = czlVar3;
                                                Bitmap bitmap2 = bitmap;
                                                cyk cykVar5 = cykVar4;
                                                jcw jcwVar = czlVar4.q;
                                                pmr pmrVarB = pms.b();
                                                pmrVarB.b = bitmap2;
                                                pmrVarB.f = Integer.valueOf(cykVar5.j == 3 ? 7 : 0);
                                                if (cykVar5.f.g()) {
                                                    poy poyVarM2 = pmh.c.m();
                                                    poy poyVarM3 = pmb.c.m();
                                                    plz plzVar = (plz) cykVar5.f.c();
                                                    if (poyVarM3.c) {
                                                        poyVarM3.m();
                                                        poyVarM3.c = false;
                                                    }
                                                    pmb pmbVar = (pmb) poyVarM3.b;
                                                    pmbVar.b = plzVar;
                                                    pmbVar.a |= 1;
                                                    if (poyVarM2.c) {
                                                        poyVarM2.m();
                                                        poyVarM2.c = false;
                                                    }
                                                    pmh pmhVar2 = (pmh) poyVarM2.b;
                                                    pmb pmbVar2 = (pmb) poyVarM3.j();
                                                    pmbVar2.getClass();
                                                    pmhVar2.b = pmbVar2;
                                                    pmhVar2.a = 1;
                                                    pmhVar = (pmh) poyVarM2.j();
                                                } else {
                                                    pmhVar = pmh.c;
                                                }
                                                pmrVarB.d = pmhVar;
                                                jcwVar.g = pmrVarB.a();
                                                if (czlVar4.p.b(jrl.LENS)) {
                                                    return;
                                                }
                                                czlVar4.q.e();
                                            }
                                        });
                                    }
                                }
                            });
                            czlVar2.E.a(cykVar3);
                        } else {
                            Runnable runnable = cykVar3.c;
                            if (runnable != null) {
                                runnable.run();
                                czlVar2.E.a(cykVar3);
                            }
                        }
                        break;
                    default:
                        czl czlVar3 = this.a;
                        cyk cykVar4 = cykVar;
                        if (!czlVar3.m.g() || ((cyk) czlVar3.m.c()).a != cykVar4.a) {
                            fjs fjsVar2 = czlVar3.E.a;
                            poy poyVarM2 = pcj.d.m();
                            if (poyVarM2.c) {
                                poyVarM2.m();
                                poyVarM2.c = false;
                            }
                            pcj pcjVar3 = (pcj) poyVarM2.b;
                            pcjVar3.c = 1;
                            pcjVar3.a |= 2;
                            pck pckVarB2 = cyp.b(cykVar4);
                            if (poyVarM2.c) {
                                poyVarM2.m();
                                poyVarM2.c = false;
                            }
                            pcj pcjVar4 = (pcj) poyVarM2.b;
                            pckVarB2.getClass();
                            pcjVar4.b = pckVarB2;
                            pcjVar4.a = 1 | pcjVar4.a;
                            fjsVar2.s((pcj) poyVarM2.j());
                        }
                        czlVar3.m = ojc.i(cykVar4);
                        break;
                }
            }
        };
        final int i2 = 0;
        iawVarA.g = new Runnable(this) { // from class: cze
            public final /* synthetic */ czl a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        czl czlVar = this.a;
                        cyk cykVar2 = cykVar;
                        cykVar2.e.run();
                        fjs fjsVar = czlVar.E.a;
                        poy poyVarM = pcj.d.m();
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        pcj pcjVar = (pcj) poyVarM.b;
                        pcjVar.c = 3;
                        pcjVar.a |= 2;
                        pck pckVarB = cyp.b(cykVar2);
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        pcj pcjVar2 = (pcj) poyVarM.b;
                        pckVarB.getClass();
                        pcjVar2.b = pckVarB;
                        pcjVar2.a = 1 | pcjVar2.a;
                        fjsVar.s((pcj) poyVarM.j());
                        break;
                    case 1:
                        final czl czlVar2 = this.a;
                        final cyk cykVar3 = cykVar;
                        if (cykVar3.i == 1) {
                            ((hzq) czlVar2.r.get()).a(new iar() { // from class: czb
                                @Override // defpackage.iar
                                public final void a(final Bitmap bitmap) {
                                    final czl czlVar3 = czlVar2;
                                    final cyk cykVar4 = cykVar3;
                                    if (bitmap != null) {
                                        czlVar3.o.execute(new Runnable() { // from class: czd
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                pmh pmhVar;
                                                czl czlVar4 = czlVar3;
                                                Bitmap bitmap2 = bitmap;
                                                cyk cykVar5 = cykVar4;
                                                jcw jcwVar = czlVar4.q;
                                                pmr pmrVarB = pms.b();
                                                pmrVarB.b = bitmap2;
                                                pmrVarB.f = Integer.valueOf(cykVar5.j == 3 ? 7 : 0);
                                                if (cykVar5.f.g()) {
                                                    poy poyVarM2 = pmh.c.m();
                                                    poy poyVarM3 = pmb.c.m();
                                                    plz plzVar = (plz) cykVar5.f.c();
                                                    if (poyVarM3.c) {
                                                        poyVarM3.m();
                                                        poyVarM3.c = false;
                                                    }
                                                    pmb pmbVar = (pmb) poyVarM3.b;
                                                    pmbVar.b = plzVar;
                                                    pmbVar.a |= 1;
                                                    if (poyVarM2.c) {
                                                        poyVarM2.m();
                                                        poyVarM2.c = false;
                                                    }
                                                    pmh pmhVar2 = (pmh) poyVarM2.b;
                                                    pmb pmbVar2 = (pmb) poyVarM3.j();
                                                    pmbVar2.getClass();
                                                    pmhVar2.b = pmbVar2;
                                                    pmhVar2.a = 1;
                                                    pmhVar = (pmh) poyVarM2.j();
                                                } else {
                                                    pmhVar = pmh.c;
                                                }
                                                pmrVarB.d = pmhVar;
                                                jcwVar.g = pmrVarB.a();
                                                if (czlVar4.p.b(jrl.LENS)) {
                                                    return;
                                                }
                                                czlVar4.q.e();
                                            }
                                        });
                                    }
                                }
                            });
                            czlVar2.E.a(cykVar3);
                        } else {
                            Runnable runnable = cykVar3.c;
                            if (runnable != null) {
                                runnable.run();
                                czlVar2.E.a(cykVar3);
                            }
                        }
                        break;
                    default:
                        czl czlVar3 = this.a;
                        cyk cykVar4 = cykVar;
                        if (!czlVar3.m.g() || ((cyk) czlVar3.m.c()).a != cykVar4.a) {
                            fjs fjsVar2 = czlVar3.E.a;
                            poy poyVarM2 = pcj.d.m();
                            if (poyVarM2.c) {
                                poyVarM2.m();
                                poyVarM2.c = false;
                            }
                            pcj pcjVar3 = (pcj) poyVarM2.b;
                            pcjVar3.c = 1;
                            pcjVar3.a |= 2;
                            pck pckVarB2 = cyp.b(cykVar4);
                            if (poyVarM2.c) {
                                poyVarM2.m();
                                poyVarM2.c = false;
                            }
                            pcj pcjVar4 = (pcj) poyVarM2.b;
                            pckVarB2.getClass();
                            pcjVar4.b = pckVarB2;
                            pcjVar4.a = 1 | pcjVar4.a;
                            fjsVar2.s((pcj) poyVarM2.j());
                        }
                        czlVar3.m = ojc.i(cykVar4);
                        break;
                }
            }
        };
        final int i3 = 2;
        iawVarA.h = new Runnable(this) { // from class: cze
            public final /* synthetic */ czl a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        czl czlVar = this.a;
                        cyk cykVar2 = cykVar;
                        cykVar2.e.run();
                        fjs fjsVar = czlVar.E.a;
                        poy poyVarM = pcj.d.m();
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        pcj pcjVar = (pcj) poyVarM.b;
                        pcjVar.c = 3;
                        pcjVar.a |= 2;
                        pck pckVarB = cyp.b(cykVar2);
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        pcj pcjVar2 = (pcj) poyVarM.b;
                        pckVarB.getClass();
                        pcjVar2.b = pckVarB;
                        pcjVar2.a = 1 | pcjVar2.a;
                        fjsVar.s((pcj) poyVarM.j());
                        break;
                    case 1:
                        final czl czlVar2 = this.a;
                        final cyk cykVar3 = cykVar;
                        if (cykVar3.i == 1) {
                            ((hzq) czlVar2.r.get()).a(new iar() { // from class: czb
                                @Override // defpackage.iar
                                public final void a(final Bitmap bitmap) {
                                    final czl czlVar3 = czlVar2;
                                    final cyk cykVar4 = cykVar3;
                                    if (bitmap != null) {
                                        czlVar3.o.execute(new Runnable() { // from class: czd
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                pmh pmhVar;
                                                czl czlVar4 = czlVar3;
                                                Bitmap bitmap2 = bitmap;
                                                cyk cykVar5 = cykVar4;
                                                jcw jcwVar = czlVar4.q;
                                                pmr pmrVarB = pms.b();
                                                pmrVarB.b = bitmap2;
                                                pmrVarB.f = Integer.valueOf(cykVar5.j == 3 ? 7 : 0);
                                                if (cykVar5.f.g()) {
                                                    poy poyVarM2 = pmh.c.m();
                                                    poy poyVarM3 = pmb.c.m();
                                                    plz plzVar = (plz) cykVar5.f.c();
                                                    if (poyVarM3.c) {
                                                        poyVarM3.m();
                                                        poyVarM3.c = false;
                                                    }
                                                    pmb pmbVar = (pmb) poyVarM3.b;
                                                    pmbVar.b = plzVar;
                                                    pmbVar.a |= 1;
                                                    if (poyVarM2.c) {
                                                        poyVarM2.m();
                                                        poyVarM2.c = false;
                                                    }
                                                    pmh pmhVar2 = (pmh) poyVarM2.b;
                                                    pmb pmbVar2 = (pmb) poyVarM3.j();
                                                    pmbVar2.getClass();
                                                    pmhVar2.b = pmbVar2;
                                                    pmhVar2.a = 1;
                                                    pmhVar = (pmh) poyVarM2.j();
                                                } else {
                                                    pmhVar = pmh.c;
                                                }
                                                pmrVarB.d = pmhVar;
                                                jcwVar.g = pmrVarB.a();
                                                if (czlVar4.p.b(jrl.LENS)) {
                                                    return;
                                                }
                                                czlVar4.q.e();
                                            }
                                        });
                                    }
                                }
                            });
                            czlVar2.E.a(cykVar3);
                        } else {
                            Runnable runnable = cykVar3.c;
                            if (runnable != null) {
                                runnable.run();
                                czlVar2.E.a(cykVar3);
                            }
                        }
                        break;
                    default:
                        czl czlVar3 = this.a;
                        cyk cykVar4 = cykVar;
                        if (!czlVar3.m.g() || ((cyk) czlVar3.m.c()).a != cykVar4.a) {
                            fjs fjsVar2 = czlVar3.E.a;
                            poy poyVarM2 = pcj.d.m();
                            if (poyVarM2.c) {
                                poyVarM2.m();
                                poyVarM2.c = false;
                            }
                            pcj pcjVar3 = (pcj) poyVarM2.b;
                            pcjVar3.c = 1;
                            pcjVar3.a |= 2;
                            pck pckVarB2 = cyp.b(cykVar4);
                            if (poyVarM2.c) {
                                poyVarM2.m();
                                poyVarM2.c = false;
                            }
                            pcj pcjVar4 = (pcj) poyVarM2.b;
                            pckVarB2.getClass();
                            pcjVar4.b = pckVarB2;
                            pcjVar4.a = 1 | pcjVar4.a;
                            fjsVar2.s((pcj) poyVarM2.j());
                        }
                        czlVar3.m = ojc.i(cykVar4);
                        break;
                }
            }
        };
        iawVarA.i = new bvf(6);
        return iawVarA.a();
    }

    public void f(ojc ojcVar) {
        Object[] objArr = {this, ojcVar};
    }

    public final void g() {
        if (this.C.g()) {
            ((ScheduledFuture) this.C.c()).cancel(false);
        }
        this.a.close();
        this.F = null;
        if (this.f) {
            this.b.f();
            this.n = oih.a;
            this.m = oih.a;
            this.f = false;
        }
    }

    public final void h() {
        if (this.g && this.v && !this.i && this.h && !this.f) {
            this.b.d();
            this.G.execute(new czk(this, 1));
            this.f = true;
        }
    }

    public final void i(iax iaxVar) {
        iay iayVar = this.l;
        if (iayVar != null) {
            iayVar.a();
            this.l.b(iaxVar);
        }
    }

    @Override // defpackage.hzh
    public final void j() {
    }

    @Override // defpackage.hzh
    public final void k(final mad madVar) {
        this.k.execute(new Runnable() { // from class: czh
            @Override // java.lang.Runnable
            public final void run() {
                czl czlVar = this.a;
                mad madVar2 = madVar;
                if (czlVar.f) {
                    long jD = madVar2.d();
                    if (TimeUnit.NANOSECONDS.toMillis(jD - czlVar.D) >= czlVar.B) {
                        czlVar.D = jD;
                        long micros = TimeUnit.NANOSECONDS.toMicros(madVar2.d());
                        Map map = czlVar.e;
                        Long lValueOf = Long.valueOf(micros);
                        map.put(lValueOf, madVar2);
                        int i = (czlVar.t.f().e + 90) % 360;
                        List listG = madVar2.g();
                        mac macVar = (mac) listG.get(0);
                        int i2 = 1;
                        mac macVar2 = (mac) listG.get(1);
                        mac macVar3 = (mac) listG.get(2);
                        switch (i) {
                            case 0:
                                break;
                            case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                                i2 = 4;
                                break;
                            case 180:
                                i2 = 3;
                                break;
                            case 270:
                                i2 = 2;
                                break;
                            default:
                                StringBuilder sb = new StringBuilder(33);
                                sb.append("Unsupported rotation: ");
                                sb.append(i);
                                throw new IllegalArgumentException(sb.toString());
                        }
                        if (czlVar.b.h(micros, macVar.getBuffer(), macVar2.getBuffer(), macVar3.getBuffer(), madVar2.c(), madVar2.b(), macVar.getRowStride(), macVar2.getRowStride(), macVar2.getPixelStride(), i2 - 1)) {
                            return;
                        }
                        czlVar.e.remove(lValueOf);
                        madVar2.close();
                        return;
                    }
                }
                madVar2.close();
            }
        });
    }

    @Override // defpackage.hzh
    public final void l() {
    }

    @Override // defpackage.iat
    public final void u() {
        this.k.execute(new czk(this, 3));
    }

    @Override // defpackage.iat
    public final void v() {
        this.k.execute(new czk(this, 4));
    }
}
