package defpackage;

import android.util.Pair;
import com.google.android.apps.camera.bottombar.R;
import com.google.android.apps.camera.coach.CameraCoachHudView;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class dba implements lyy, iat, ian {
    private final dbe A;
    public final ojc b;
    public final gvb c;
    public final dcl j;
    public final eiy t;
    private final ScheduledExecutorService v;
    private final lda w;
    private final boolean x;
    private final dbl y;
    private final dch z;
    private static final ouj u = ouj.h("com/google/android/apps/camera/coach/CameraLockIndicator");
    public static final double a = Math.toRadians(5.0d);
    public final float[] d = new float[16];
    public final jua e = new jua();
    public final jtz f = new jtz();
    public final float[] g = new float[16];
    public final jua h = new jua();
    public final jtz i = new jtz();
    public final AtomicBoolean k = new AtomicBoolean(false);
    public ojc l = oih.a;
    public ojc m = oih.a;
    private ojc B = oih.a;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public ojc q = oih.a;
    public ojc r = oih.a;
    private boolean C = false;
    public daz s = dau.a;

    public dba(ojc ojcVar, eiy eiyVar, gvb gvbVar, lda ldaVar, ScheduledExecutorService scheduledExecutorService, ddf ddfVar, dbl dblVar, dbe dbeVar, dch dchVar, fjs fjsVar, byte[] bArr) {
        boolean z = false;
        this.b = ojcVar;
        this.v = scheduledExecutorService;
        this.c = gvbVar;
        this.t = eiyVar;
        this.w = ldaVar;
        this.j = new dcn(6, fjsVar);
        if (ddfVar.k(dcv.p) && ddfVar.k(dcv.n)) {
            z = true;
        }
        this.x = z;
        this.y = dblVar;
        this.z = dchVar;
        this.A = dbeVar;
    }

    public static boolean j(float f, float f2) {
        return Math.toDegrees((double) Math.abs(f)) < 0.5d && Math.toDegrees((double) Math.abs(f2)) < 0.5d;
    }

    private final boolean l() {
        return this.x && this.A.a().g() && ((dbd) this.A.a().c()).c.k() == lwd.BACK;
    }

    @Override // defpackage.iat
    public final void a() {
    }

    @Override // defpackage.iat
    public final void b(iay iayVar) {
    }

    public final void c() {
        if (this.m.g() && this.l.g() && this.n) {
            dah dahVar = (dah) this.m.c();
            if (dahVar.d.g()) {
                CameraCoachHudView cameraCoachHudView = (CameraCoachHudView) dahVar.d.c();
                if (cameraCoachHudView.d.g()) {
                    cameraCoachHudView.post(new dai(cameraCoachHudView, 3));
                }
            }
            ((elw) this.l.c()).m(elx.SECOND_RUN_TOAST);
            this.n = false;
            this.o = false;
            this.s = dau.b;
            this.k.set(false);
            this.p = false;
            this.j.g();
        }
    }

    @Override // defpackage.ian
    public final void d() {
        if (this.n) {
            if (this.o) {
                this.j.c(pbq.HEEDED);
            } else {
                this.j.c(pbq.NOT_HEEDED);
            }
        }
    }

    public final void e() {
        if (l()) {
            if (l()) {
                this.y.f(true);
                this.z.f(true);
            }
            this.t.a = false;
            this.q = oih.a;
            c();
            this.C = false;
            this.s = dau.c;
            this.k.set(false);
        }
    }

    public final void f(daz dazVar) {
        if (l()) {
            if (l()) {
                this.y.f(false);
                this.z.f(false);
            }
            this.t.a = true;
            if (!this.r.g()) {
                ((oug) ((oug) u.c()).G((char) 672)).o("No camera pose data available.");
                return;
            }
            if (!this.q.g()) {
                this.q = this.r;
            }
            this.C = true;
            this.s = dazVar;
        }
    }

    public final synchronized void g() {
        if (this.B.g()) {
            ((lap) this.B.c()).close();
        }
        lap lapVar = new lap();
        if (this.m.g()) {
            lapVar.c(dah.d(new Runnable() { // from class: day
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair;
                    boolean z;
                    dba dbaVar = this.a;
                    if (((dqx) ((ojj) dbaVar.b).a).e()) {
                        return;
                    }
                    fto ftoVar = new fto(((dqx) ((ojj) dbaVar.b).a).d().a);
                    dbaVar.r = ojc.i(ftoVar);
                    ojc ojcVar = dbaVar.q;
                    if (ojcVar.g()) {
                        mip.ee(((fto) ojcVar.c()).a, dbaVar.e);
                        dbaVar.e.b(dbaVar.d);
                        jtz jtzVar = dbaVar.f;
                        float[] fArr = dbaVar.d;
                        jtzVar.f(fArr[0], fArr[4], fArr[8], fArr[1], fArr[5], fArr[9], fArr[2], fArr[6], fArr[10]);
                        mip.ee(ftoVar.a, dbaVar.h);
                        dbaVar.h.b(dbaVar.g);
                        jtz jtzVar2 = dbaVar.i;
                        float[] fArr2 = dbaVar.g;
                        jtzVar2.f(fArr2[0], fArr2[4], fArr2[8], fArr2[1], fArr2[5], fArr2[9], fArr2[2], fArr2[6], fArr2[10]);
                        jtz jtzVar3 = new jtz();
                        dbaVar.f.l(jtzVar3);
                        jtz jtzVar4 = new jtz();
                        jtz.b(jtzVar3, dbaVar.i, jtzVar4);
                        switch (dbaVar.c.c().e) {
                            case 0:
                                pair = new Pair(Float.valueOf((float) Math.asin(jtzVar4.a(1, 2))), Float.valueOf(-((float) Math.asin(jtzVar4.a(0, 2)))));
                                break;
                            case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                                pair = new Pair(Float.valueOf((float) Math.asin(jtzVar4.a(2, 0))), Float.valueOf((float) Math.asin(jtzVar4.a(1, 0))));
                                break;
                            case 180:
                                pair = new Pair(Float.valueOf((float) Math.asin(jtzVar4.a(1, 2))), Float.valueOf((float) Math.asin(jtzVar4.a(0, 2))));
                                break;
                            case 270:
                                pair = new Pair(Float.valueOf(-((float) Math.asin(jtzVar4.a(2, 0)))), Float.valueOf((float) Math.asin(jtzVar4.a(1, 0))));
                                break;
                            default:
                                throw new IllegalStateException("Invalid device orientation value!");
                        }
                        float fFloatValue = ((Float) pair.first).floatValue();
                        float fFloatValue2 = ((Float) pair.second).floatValue();
                        if (dbaVar.l.g() && dbaVar.m.g()) {
                            dbaVar.j.f();
                            if (dbaVar.t.a) {
                                dah dahVar = (dah) dbaVar.m.c();
                                if (dahVar.b && dahVar.d.g()) {
                                    CameraCoachHudView cameraCoachHudView = (CameraCoachHudView) dahVar.d.c();
                                    cameraCoachHudView.post(new daj(cameraCoachHudView, fFloatValue, fFloatValue2, 1));
                                }
                                if (!dbaVar.n) {
                                    ((dah) dbaVar.m.c()).c();
                                    ((elw) dbaVar.l.c()).j(elx.SECOND_RUN_TOAST);
                                    dbaVar.n = true;
                                    dbaVar.j.e(oih.a);
                                }
                            } else {
                                dbaVar.c();
                            }
                            if (dbaVar.n) {
                                if (!dba.j(fFloatValue, fFloatValue2)) {
                                    z = false;
                                } else if (!dbaVar.p) {
                                    dbaVar.j.d();
                                    z = true;
                                }
                                dbaVar.p = z;
                            }
                        }
                        dbaVar.o = dba.j(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
                        float fFloatValue3 = ((Float) pair.first).floatValue();
                        float fFloatValue4 = ((Float) pair.second).floatValue();
                        if ((Math.abs(fFloatValue3) >= dba.a || Math.abs(fFloatValue4) >= dba.a) && dbaVar.k.compareAndSet(false, true)) {
                            dbaVar.s.a();
                        }
                    }
                }
            }, this.v));
        }
        lapVar.c(this.w.a(new lij() { // from class: daw
            @Override // defpackage.lij
            public final void fB(Object obj) {
                this.a.c();
            }
        }, this.v));
        this.c.g(this);
        lapVar.c(new lie() { // from class: dav
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                dba dbaVar = this.a;
                dbaVar.c.h(dbaVar);
            }
        });
        this.j.a();
        lapVar.c(new dce(this.j, 1));
        this.B = ojc.i(lapVar);
        this.t.a();
    }

    @Override // defpackage.lyy
    public final void h(lic licVar) {
        this.v.execute(new dax(this, 1));
    }

    public final synchronized void i() {
        c();
        if (this.B.g()) {
            ((lap) this.B.c()).close();
            this.B = oih.a;
        }
        this.t.a();
    }

    public final boolean k() {
        return this.k.get();
    }

    @Override // defpackage.iat
    public final void u() {
        if (this.C) {
            return;
        }
        this.v.execute(new dax(this, 2));
    }

    @Override // defpackage.iat
    public final void v() {
        this.v.execute(new dax(this, 0));
    }
}
