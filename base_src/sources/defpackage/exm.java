package defpackage;

import android.content.res.Resources;
import android.os.Looper;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;

/* JADX INFO: loaded from: classes.dex */
final class exm implements fwk {
    public final pyn a;
    private final fnv d;
    private final pyn e;
    private final ivj f;
    private final String g;
    public boolean c = true;
    public final lcw b = new lcw(new ojz() { // from class: exk
        @Override // defpackage.ojz
        public final Object a() {
            return Boolean.valueOf(this.a.c);
        }
    });

    public exm(fnv fnvVar, pyn pynVar, pyn pynVar2, ivj ivjVar, Resources resources) {
        this.d = fnvVar;
        this.a = pynVar;
        this.e = pynVar2;
        this.f = ivjVar;
        this.g = resources.getString(R.string.longshot_accessibility_peek);
    }

    @Override // defpackage.epk
    public final synchronized pht a(int i) {
        this.c = false;
        this.b.c();
        fnj fnjVar = (fnj) this.e.get();
        lap lapVar = fnjVar.m;
        fno fnoVar = fnjVar.l;
        lapVar.c(!fnoVar.g.b() ? fnoVar.e.d(fnoVar.d) : bug.k);
        fnjVar.p = true;
        fnjVar.q = false;
        if (fnjVar.r) {
            jrh jrhVar = fnjVar.v;
            ZoomLockView zoomLockView = jrhVar.a;
            jrg jrgVar = new jrg(jrhVar);
            if (zoomLockView.h == null) {
                zoomLockView.h = jrgVar;
            }
            ZoomLockView zoomLockView2 = jrhVar.a;
            if (zoomLockView2.getVisibility() == 8) {
                zoomLockView2.c.start();
            }
        }
        this.d.d();
        exi exiVar = (exi) this.a.get();
        exiVar.U.fB(true);
        kas kasVar = exiVar.j;
        if (kasVar != null) {
            kasVar.i(true);
            exiVar.j.g();
        }
        dmh dmhVar = exiVar.k;
        if (dmhVar != null) {
            dmhVar.e();
        }
        if (exiVar.x.g()) {
            ((bys) exiVar.x.c()).m();
        }
        exiVar.y.g().e();
        gtg gtgVar = exiVar.V;
        if (gtgVar.G()) {
            gtgVar.h();
        }
        exiVar.s.l(false);
        exiVar.l.d(false);
        exiVar.A.b();
        exiVar.ac.j(elx.FIRST_RUN_TOAST);
        exi exiVar2 = (exi) this.a.get();
        if (exiVar2.F != null) {
            exiVar2.H.f();
            exiVar2.K(true);
        }
        ((exi) this.a.get()).B.a();
        return plk.V(true);
    }

    @Override // defpackage.epk
    public final synchronized pht b(int i) {
        this.d.c();
        ((fnj) this.e.get()).a();
        this.f.h(this.g);
        mip.bV(Looper.getMainLooper()).post(new Runnable() { // from class: exl
            @Override // java.lang.Runnable
            public final void run() {
                exm exmVar = this.a;
                exi exiVar = (exi) exmVar.a.get();
                exiVar.U.fB(false);
                kas kasVar = exiVar.j;
                if (kasVar != null) {
                    kasVar.i(false);
                    if (exiVar.W.k(ddl.V) || (exiVar.m.j() && exiVar.ai.C())) {
                        exiVar.j.h();
                    }
                }
                dmh dmhVar = exiVar.k;
                if (dmhVar != null) {
                    dmhVar.h();
                }
                exiVar.A.c();
                if (exiVar.x.g()) {
                    ((bys) exiVar.x.c()).n();
                    ((bys) exiVar.x.c()).h();
                }
                exiVar.aa.j(false);
                if (((Boolean) exiVar.aa.a().fA()).booleanValue()) {
                    exiVar.h.i();
                }
                exiVar.l.d(true);
                exiVar.s.l(true);
                exiVar.y.g().f();
                exiVar.V.i();
                exiVar.ac.m(elx.FIRST_RUN_TOAST);
                exmVar.c = true;
                exmVar.b.c();
            }
        });
        ((exi) this.a.get()).B.b();
        return plk.V(true);
    }

    @Override // defpackage.fwk
    public final synchronized void c() {
        if (!this.c) {
            b(4);
        }
    }
}
