package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.view.WindowManager;
import com.Helper;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.ui.views.ViewfinderCover;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jet implements jfn {
    public static final ouj a = ouj.h("com/google/android/apps/camera/ui/modeswitch/ModeSwitchControllerImpl");
    private final bqg A;
    private final emb B;
    public final BottomBarController b;
    public jfl c;
    public final jlb d;
    public final epj e;
    public boolean f;
    public jrl g;
    public final jgq h;
    public final gtg i;
    public final pyn j;
    public final boolean k;
    public final jev l;
    private final WindowManager m;
    private jfm n;
    private final ArrayList o;
    private int p;
    private final Context q;
    private final ljf r;
    private final boolean s;
    private final fjs t;
    private final ijn u;
    private final ddf v;
    private final boolean w;
    private boolean x;
    private boolean y = true;
    private ViewfinderCover z;

    public jet(WindowManager windowManager, fjs fjsVar, BottomBarController bottomBarController, bqg bqgVar, jlb jlbVar, epj epjVar, jgq jgqVar, boolean z, ljf ljfVar, Context context, emb embVar, fvy fvyVar, ijn ijnVar, gtg gtgVar, pyn pynVar, boolean z2, ddf ddfVar, byte[] bArr, byte[] bArr2) {
        this.m = windowManager;
        this.b = bottomBarController;
        this.A = bqgVar;
        this.d = jlbVar;
        this.e = epjVar;
        this.h = jgqVar;
        this.q = context;
        this.r = ljfVar;
        this.B = embVar;
        this.s = z;
        this.t = fjsVar;
        this.u = ijnVar;
        this.i = gtgVar;
        this.j = pynVar;
        this.k = z2;
        this.v = ddfVar;
        this.l = new jev(this, windowManager, context);
        ArrayList arrayList = new ArrayList();
        this.o = arrayList;
        boolean zK = ddfVar.k(ddt.e);
        this.w = zK;
        arrayList.add(jrl.LONG_EXPOSURE);
        if (zK) {
            arrayList.add(jrl.MOTION_BLUR);
        }
        if (z) {
            arrayList.add(jrl.PORTRAIT);
        }
        arrayList.add(jrl.PHOTO);
        arrayList.add(jrl.VIDEO);
        arrayList.add(jrl.MORE_MODES);
        jrl jrlVarD = bqe.d(embVar.a());
        switch (jrlVarD.ordinal()) {
            case 5:
            case 13:
                if (!ddfVar.k(dcu.J)) {
                    jrlVarD = jrl.PHOTO;
                    break;
                } else {
                    jrlVarD = jrl.VIDEO;
                    break;
                }
            case 2:
            case 6:
            case 11:
            case 12:
            case 15:
                this.g = jrlVarD;
                break;
            default:
                this.g = jrl.PHOTO;
                break;
        }
        int iIndexOf = arrayList.indexOf(this.g);
        z(iIndexOf);
        this.p = iIndexOf;
        fvyVar.a(this);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    private final void y(jrl jrlVar, boolean z) {
        ValueAnimator valueAnimatorOfInt;
        if (this.o.contains(jrlVar)) {
            this.b.setClickable(false);
            this.d.F(false);
            this.e.g(2);
            final int i = 1;
            this.f = true;
            final jfk jfkVar = new jfk(this.t, this.u, this.g, jrlVar);
            int iIndexOf = this.o.indexOf(jrlVar);
            if (iIndexOf != -1) {
                int i2 = this.p;
                if (iIndexOf < i2) {
                    valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
                    valueAnimatorOfInt.setDuration(60L);
                    if (z) {
                        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: jeo
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                jet jetVar = this.a;
                                jetVar.h.y(valueAnimator.getAnimatedFraction(), i);
                            }
                        });
                    }
                    valueAnimatorOfInt.addListener(new jes(this));
                    valueAnimatorOfInt.start();
                } else if (iIndexOf > i2) {
                    i = 2;
                    valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
                    valueAnimatorOfInt.setDuration(60L);
                    if (z) {
                        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: jeo
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                jet jetVar = this.a;
                                jetVar.h.y(valueAnimator.getAnimatedFraction(), i);
                            }
                        });
                    }
                    valueAnimatorOfInt.addListener(new jes(this));
                    valueAnimatorOfInt.start();
                }
            }
            Runnable runnable = new Runnable() { // from class: jeq
                @Override // java.lang.Runnable
                public final void run() {
                    jfk jfkVar2 = jfkVar;
                    jfkVar2.d.i(iji.MODE_SWITCH_END);
                    fjs fjsVar = jfkVar2.a;
                    poy poyVarM = pcy.g.m();
                    int iF = jri.f(jfkVar2.b);
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = false;
                    }
                    pcy pcyVar = (pcy) poyVarM.b;
                    pcyVar.b = iF - 1;
                    pcyVar.a |= 1;
                    int iF2 = jri.f(jfkVar2.c);
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = false;
                    }
                    pcy pcyVar2 = (pcy) poyVarM.b;
                    pcyVar2.c = iF2 - 1;
                    int i3 = pcyVar2.a | 2;
                    pcyVar2.a = i3;
                    pcyVar2.f = 2;
                    int i4 = i3 | 16;
                    pcyVar2.a = i4;
                    ijs ijsVar = jfkVar2.d;
                    long j = ijsVar.m;
                    pcyVar2.a = i4 | 4;
                    pcyVar2.d = j;
                    long jG = ijsVar.g(iji.MODE_SWITCH_END);
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = false;
                    }
                    pcy pcyVar3 = (pcy) poyVarM.b;
                    pcyVar3.a |= 8;
                    pcyVar3.e = jG;
                    fjsVar.u((pcy) poyVarM.j());
                }
            };
            if (this.c != null) {
                if (this.A.f()) {
                    return;
                }
                if (this.g != jrlVar) {
                    this.g = jrlVar;
                    Helper.IsMode(jrlVar);
                    int iIndexOf2 = this.o.indexOf(jrlVar);
                    z(iIndexOf2);
                    this.p = iIndexOf2;
                    this.z.m(jrlVar, new jpb() { // from class: jep
                        @Override // defpackage.jpb
                        public final void a(jrl jrlVar2) {
                            this.a.c.p(jrlVar2);
                        }
                    }, runnable);
                    return;
                }
            }
            runnable.run();
        }
    }

    private static void z(int i) {
        obr.aQ(i != -1);
    }

    @Override // defpackage.jfn
    public final List a() {
        return this.o;
    }

    @Override // defpackage.jfn
    public final void b() {
        jrl jrlVar = jrl.PHOTO;
        this.h.o(jrlVar, false);
        y(jrlVar, false);
    }

    @Override // defpackage.jfn
    public final void c() {
        this.h.m();
    }

    @Override // defpackage.jfn
    public final void d(boolean z) {
        this.h.n(z);
    }

    @Override // defpackage.jfn
    public final void e(jns jnsVar) {
        this.z = jnsVar.e;
        this.g.getClass();
        this.r.e("ModeSwitchCtrl#init");
        this.h.r(this);
        this.h.t(this.t);
        this.h.j(jrl.LONG_EXPOSURE);
        if (this.w) {
            this.h.j(jrl.MOTION_BLUR);
        }
        if (this.s) {
            this.h.j(jrl.PORTRAIT);
        }
        this.h.j(jrl.PHOTO);
        this.h.j(jrl.VIDEO);
        this.h.l(this.g);
        this.r.f();
    }

    @Override // defpackage.jgr
    public final void f(jrl jrlVar) {
        if (this.g == jrlVar || !this.x) {
            return;
        }
        y(jrlVar, false);
        j(jrlVar, true);
    }

    @Override // defpackage.jgr
    public final void g(jrl jrlVar) {
        pht phtVarV;
        jfm jfmVar = this.n;
        if (jfmVar == null || !this.x) {
            return;
        }
        final eur eurVar = (eur) jfmVar;
        if (eurVar.T.f()) {
            phtVarV = plk.V(true);
        } else if (jrlVar == jrl.ORNAMENT) {
            eurVar.u = true;
            ((jho) eurVar.M).get().a();
            eurVar.I.fB(true);
            phtVarV = plk.V(true);
        } else if (jrlVar == jrl.MEASURE) {
            eurVar.u = true;
            jhn jhnVarA = ((jho) eurVar.M).get();
            Context context = eurVar.c;
            Intent intent = new Intent();
            intent.setClassName(new pvr(context.getPackageManager()).b(), "com.google.vr.apps.ornament.measure.MeasureMainActivity");
            jhnVarA.b(intent);
            eurVar.K.fB(true);
            phtVarV = plk.V(true);
        } else if (jrlVar == jrl.TIARA) {
            eurVar.u = true;
            ((jho) eurVar.M).get().c();
            eurVar.L.fB(true);
            phtVarV = plk.V(true);
        } else if (jrlVar == jrl.LENS) {
            eurVar.u = true;
            phtVarV = pgb.h(((jcw) eurVar.N.get()).b(), new oiu() { // from class: eue
                @Override // defpackage.oiu
                public final Object a(Object obj) {
                    eur eurVar2 = eurVar;
                    Boolean bool = (Boolean) obj;
                    bool.getClass();
                    if (bool.booleanValue()) {
                        eurVar2.J.fB(true);
                        return true;
                    }
                    eurVar2.P.j();
                    return false;
                }
            }, mip.bS());
        } else {
            btv btvVar = eurVar.n;
            if (jrlVar == jrl.ORNAMENT || jrlVar == jrl.TIARA || jrlVar == jrl.LENS || jrlVar == jrl.MEASURE) {
                ((bvk) btvVar).x.W(jri.f(jrlVar), 1);
            }
            final bvk bvkVar = (bvk) btvVar;
            bvkVar.i.H(false);
            if (jrlVar == jrl.PHOTO_SPHERE || jrlVar == jrl.REWIND) {
                bvkVar.e.g(jrlVar);
                bvkVar.e.l();
                if (jrlVar == jrl.REWIND) {
                    bvkVar.e.e();
                    bvkVar.e.f();
                }
                bvkVar.q(jrlVar);
            } else {
                bvkVar.e.m(jrlVar, new jpb() { // from class: bve
                    @Override // defpackage.jpb
                    public final void a(jrl jrlVar2) {
                        bvkVar.q(jrlVar2);
                    }
                }, bvf.a);
            }
            phtVarV = plk.V(true);
        }
        plk.af(phtVarV, new jer(this, jrlVar), pgr.INSTANCE);
    }

    public final void h(boolean z) {
        lar.a();
        this.y = z;
        if (!z) {
            this.l.a = false;
            this.h.p(false);
        } else if (this.x) {
            this.l.a = true;
            this.h.p(true);
        }
    }

    @Override // defpackage.jfn
    public final void i(jfl jflVar) {
        this.c = jflVar;
    }

    @Override // defpackage.jfn
    public final void j(jrl jrlVar, boolean z) {
        if (jrlVar == null || this.g == jrlVar || this.f) {
            return;
        }
        this.g = jrlVar;
        Helper.IsMode(jrlVar);
        if (s(jrlVar)) {
            int iIndexOf = this.o.indexOf(jrlVar);
            z(iIndexOf);
            this.p = iIndexOf;
        } else if (this.v.k(dcu.J) && (jrlVar.equals(jrl.TIME_LAPSE) || jrlVar.equals(jrl.SLOW_MOTION))) {
            int iIndexOf2 = this.o.indexOf(jrl.VIDEO);
            z(iIndexOf2);
            this.p = iIndexOf2;
        } else {
            int iIndexOf3 = this.o.indexOf(jrl.MORE_MODES);
            z(iIndexOf3);
            this.p = iIndexOf3;
        }
        this.h.o(this.g, z);
    }

    @Override // defpackage.jfn
    public final void k(jfm jfmVar) {
        this.n = jfmVar;
    }

    @Override // defpackage.jfn
    public final void l(boolean z) {
        lar.a();
        this.x = z;
        if (!z) {
            this.l.a = false;
            this.h.p(false);
        } else if (this.y) {
            this.l.a = true;
            this.h.p(true);
        }
    }

    @Override // defpackage.jfn
    public final void m() {
        this.h.u();
    }

    @Override // defpackage.jfn
    public final void n() {
        this.h.v();
    }

    @Override // defpackage.jfo
    public final boolean o() {
        return this.p == 0;
    }

    @Override // defpackage.jfo
    public final boolean p() {
        return this.p == this.o.size() + (-1);
    }

    @Override // defpackage.jfn
    public final boolean q() {
        return this.x;
    }

    @Override // defpackage.jfn
    public final boolean r() {
        return this.l.a;
    }

    @Override // defpackage.jfn
    public final boolean s(jrl jrlVar) {
        return this.o.contains(jrlVar);
    }

    @Override // defpackage.jfn
    public final boolean t(jrl jrlVar) {
        obr.aG(jrlVar != null, "requested mode is null");
        if (this.g == jrlVar) {
            ((oug) ((oug) a.c()).G((char) 3283)).o("requested mode is currently active");
            return true;
        }
        if (this.f) {
            ((oug) ((oug) a.b()).G((char) 3282)).o("scroll is currently in progress; don't know what to do with this.");
            return false;
        }
        if (!this.x) {
            ((oug) ((oug) a.c()).G((char) 3281)).o("mode switch requested when switcher is disabled. Ignoring.");
            return false;
        }
        if (s(jrlVar)) {
            f(jrlVar);
        } else {
            g(jrlVar);
        }
        return true;
    }

    @Override // defpackage.jfo
    public final void u(int i, boolean z) {
        if (i == 1 && o()) {
            return;
        }
        if (i == 2 && p()) {
            return;
        }
        jrl jrlVar = null;
        if (z) {
            if (i == 2) {
                int i2 = p() ? 0 : this.p + 1;
                while (this.o.get(i2) == jrl.MORE_MODES && i2 != this.p) {
                    i2 = i2 >= this.o.size() + (-1) ? 0 : i2 + 1;
                }
                if (i2 != this.p) {
                    jrlVar = (jrl) this.o.get(i2);
                }
            } else {
                int size = o() ? this.o.size() : this.p;
                while (true) {
                    size--;
                    if (this.o.get(size) != jrl.MORE_MODES || size == this.p) {
                        break;
                    } else if (size <= 0) {
                        size = this.o.size();
                    }
                }
                if (size != this.p) {
                    jrlVar = (jrl) this.o.get(size);
                }
            }
        } else if (i == 2 && !p()) {
            jrlVar = (jrl) this.o.get(this.p + 1);
        } else if (i == 1 && !o()) {
            jrlVar = (jrl) this.o.get(this.p - 1);
        }
        if (jrlVar != null) {
            this.t.aa(2, this.g.toString(), jrlVar.toString());
            y(jrlVar, true);
        }
    }

    @Override // defpackage.jfn
    public final void v(boolean z) {
        this.h.z(z);
    }

    @Override // defpackage.jfn
    public final jev w() {
        return this.l;
    }

    @Override // defpackage.jfn
    public final void x(jrl jrlVar) {
        y(jrlVar, false);
    }
}
