package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.ConditionVariable;
import android.os.SystemClock;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class eig implements ehu, ehi {
    private static final ouj N = ouj.h("com/google/android/apps/camera/imax/ImaxRecordingController");
    public final huf A;
    public final hug B;
    public long D;
    public long E;
    public long F;
    public long G;
    public ehc I;
    public final egy J;
    public final emb K;
    public final gzf L;
    public final mip M;
    private final qkg O;
    private final elw P;
    private final Set Q;
    private final Activity R;
    private final ifn S;
    private final ScheduledExecutorService T;
    private final ekf U;
    private final lap V;
    private final ejm W;
    private final jty X;
    private int Y;
    public final Context a;
    public final eke b;
    public final hhq c;
    public final ddf d;
    public final ejj e;
    public final ehw f;
    public final lar g;
    public final lda h;
    public final fjs i;
    public final ljf j;
    public final jlb k;
    public final Set l;
    public final ehl m;
    public final ehj n;
    public final ejd o;
    public final ceo t;
    public final jgu u;
    public final jgu v;
    public final jgu w;
    public final jgu x;
    public final jgu y;
    public final jxb z;
    public float p = 0.0f;
    public final AtomicBoolean q = new AtomicBoolean(false);
    public final AtomicInteger r = new AtomicInteger(0);
    public final ConditionVariable s = new ConditionVariable(true);
    public boolean C = false;
    public int H = 1;

    public eig(Context context, eke ekeVar, qkg qkgVar, hhq hhqVar, ejj ejjVar, ehw ehwVar, lar larVar, elw elwVar, egy egyVar, ejd ejdVar, ddf ddfVar, lda ldaVar, fjs fjsVar, ejm ejmVar, gzf gzfVar, lap lapVar, ljf ljfVar, Activity activity, ifn ifnVar, jlb jlbVar, ScheduledExecutorService scheduledExecutorService, mip mipVar, Set set, ehl ehlVar, jxb jxbVar, ehj ehjVar, ekf ekfVar, emb embVar, jty jtyVar, huf hufVar, hug hugVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        this.a = context;
        this.b = ekeVar;
        this.O = qkgVar;
        this.c = hhqVar;
        this.e = ejjVar;
        this.f = ehwVar;
        this.g = larVar;
        this.P = elwVar;
        this.J = egyVar;
        this.o = ejdVar;
        this.d = ddfVar;
        this.h = ldaVar;
        this.i = fjsVar;
        this.W = ejmVar;
        this.L = gzfVar;
        this.j = ljfVar;
        this.R = activity;
        this.S = ifnVar;
        this.k = jlbVar;
        this.T = scheduledExecutorService;
        this.M = mipVar;
        this.l = set;
        this.m = ehlVar;
        this.z = jxbVar;
        this.n = ehjVar;
        this.V = lapVar;
        this.U = ekfVar;
        this.K = embVar;
        this.X = jtyVar;
        this.A = hufVar;
        this.B = hugVar;
        ekeVar.f();
        this.t = new ceo(ljfVar, set);
        lapVar.c(ehjVar.f.a(new lij() { // from class: ehx
            @Override // defpackage.lij
            public final void fB(Object obj) {
                eig eigVar = this.a;
                if (((Boolean) obj).booleanValue() && bqe.v(eigVar.K)) {
                    eigVar.f();
                    if (eigVar.K.a() != null) {
                        Intent intentA = eigVar.K.a();
                        intentA.getClass();
                        bqe.f(intentA);
                    }
                }
            }
        }, larVar));
        ehlVar.requestLayout();
        ehjVar.l = this;
        jgv jgvVar = new jgv();
        jgvVar.f = context;
        jgvVar.a = false;
        jgvVar.i = 9;
        jgvVar.b = 1500;
        jgvVar.h = ddfVar.k(ddl.ay);
        jgvVar.g = true;
        jgvVar.e = context.getString(R.string.accessibility_imax_too_fast);
        this.u = jgvVar.a();
        jgvVar.e = context.getString(R.string.accessibility_imax_backtracking);
        this.v = jgvVar.a();
        jgvVar.e = context.getString(R.string.accessibility_imax_too_much_roll);
        this.w = jgvVar.a();
        jgvVar.e = context.getString(R.string.imax_too_much_vertical_tilt);
        this.x = jgvVar.a();
        jgvVar.e = context.getString(R.string.imax_too_much_horizontal_tilt);
        this.y = jgvVar.a();
        this.Q = new HashSet();
    }

    private final void i(boolean z, float f, int i) {
        this.n.a(false);
        if (!this.q.get()) {
            g();
            this.S.b(R.raw.video_stop);
            if (i != 2) {
                if (!z) {
                    this.X.c(1);
                } else if (f >= 1.0f || i != 1) {
                    this.X.c(0);
                }
            }
        }
        this.r.set(0);
    }

    private final void j(Runnable runnable) {
        try {
            this.T.schedule(runnable, 250L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
        }
    }

    @Override // defpackage.ehu
    public final void a(final int i) {
        c();
        d(enl.u(i, this.a, this.f.k()));
        ova ovaVarC = N.c();
        ouk oukVar = new ouk() { // from class: ehz
            @Override // defpackage.ouk
            public final Object a() {
                eig eigVar = this.a;
                return enl.u(i, eigVar.a, eigVar.f.k());
            }
        };
        oxh.g(oukVar);
        ((oug) ((oug) ovaVarC).G((char) 1177)).r("Capture stopped reason: %s", oukVar);
        this.g.execute(new Runnable() { // from class: eid
            @Override // java.lang.Runnable
            public final void run() {
                this.a.h(true, i);
            }
        });
    }

    public final float b() {
        float fA = (float) this.W.a();
        float f = this.p;
        if (f < 0.0f) {
            fA = -fA;
        }
        return ((360.0f - fA) * f) + fA;
    }

    public final void c() {
        Iterator it = this.Q.iterator();
        while (it.hasNext()) {
            this.P.g((elv) it.next());
        }
        this.Q.clear();
    }

    public final void d(String str) {
        jgv jgvVar = new jgv();
        jgvVar.f = this.a;
        jgvVar.e = str;
        jgvVar.i = 11;
        jgvVar.a = false;
        jgvVar.h = this.d.k(ddl.ay);
        jgu jguVarA = jgvVar.a();
        this.P.d(jguVarA);
        this.Q.add(jguVarA);
    }

    public final void e(jgu jguVar) {
        this.P.d(jguVar);
        this.Q.add(jguVar);
    }

    public final void f() {
        if (!this.C && this.r.get() == 0 && this.n.b()) {
            this.s.close();
            int i = 1;
            this.r.set(1);
            this.D = SystemClock.uptimeMillis() + 250;
            this.n.a(true);
            lar larVar = this.g;
            final ejj ejjVar = this.e;
            ejjVar.getClass();
            larVar.c(new Runnable() { // from class: eie
                @Override // java.lang.Runnable
                public final void run() {
                    ejjVar.a();
                }
            });
            int requestedOrientation = this.R.getRequestedOrientation();
            this.Y = requestedOrientation;
            int rotation = this.R.getWindowManager().getDefaultDisplay().getRotation() * 90;
            if (rotation != 0 && rotation != 180) {
                if (rotation == 90) {
                    i = 0;
                } else {
                    i = rotation == 270 ? 8 : requestedOrientation;
                }
            }
            this.R.setRequestedOrientation(i);
            this.S.b(R.raw.video_start);
            this.I = ((eld) this.O).get();
            this.U.c(this.R.getWindowManager().getDefaultDisplay().getRotation() * 90);
            j(new eib(this, 2));
        }
    }

    public final void g() {
        this.R.setRequestedOrientation(this.Y);
    }

    public final void h(boolean z, int i) {
        eky ekyVar;
        lar.a();
        int i2 = this.r.get();
        if (this.q.get()) {
            if (i2 != 3 && i2 != 2) {
                return;
            }
        } else if (i2 != 3 || (ekyVar = this.b.c.b) == null || ekyVar.a() == 0) {
            return;
        }
        this.r.set(4);
        this.E = SystemClock.uptimeMillis();
        float fG = this.f.g();
        this.f.e.set(false);
        this.H = i;
        this.e.b();
        this.j.e("record#prepareToStop");
        eke ekeVar = this.b;
        synchronized (ekeVar) {
            ekeVar.g = true;
        }
        ekb ekbVar = ekeVar.c;
        ekbVar.d();
        eky ekyVar2 = ekbVar.b;
        if (ekyVar2 != null) {
            ekyVar2.a();
        }
        this.j.f();
        if (z) {
            this.j.e("record#getCapturePreview");
            eke ekeVar2 = this.b;
            ekeVar2.l.a(new ekc(ekeVar2, new oiu() { // from class: ehy
                @Override // defpackage.oiu
                public final Object a(Object obj) {
                    eig eigVar = this.a;
                    Bitmap bitmap = (Bitmap) obj;
                    eigVar.j.e("record#stopCapture");
                    eigVar.b.g(eigVar.I.a());
                    eigVar.j.f();
                    if (bitmap == null) {
                        synchronized (eigVar.l) {
                            eigVar.l.remove(eigVar.I.a());
                        }
                        return null;
                    }
                    synchronized (eigVar.l) {
                        eigVar.l.add(eigVar.I.a());
                    }
                    eigVar.F = SystemClock.uptimeMillis();
                    gzf gzfVar = eigVar.L;
                    ehc ehcVar = eigVar.I;
                    boolean zK = eigVar.f.k();
                    Object obj2 = gzfVar.b.get();
                    hpu hpuVar = (hpu) gzfVar.g.get();
                    hpuVar.getClass();
                    jtx jtxVar = (jtx) gzfVar.c.get();
                    jtxVar.getClass();
                    ljf ljfVar = (ljf) gzfVar.h.get();
                    ljfVar.getClass();
                    fix fixVar = (fix) gzfVar.d.get();
                    fixVar.getClass();
                    lda ldaVar = (lda) gzfVar.f.get();
                    ldaVar.getClass();
                    ddf ddfVar = (ddf) gzfVar.a.get();
                    ddfVar.getClass();
                    hsh hshVar = (hsh) gzfVar.e.get();
                    hshVar.getClass();
                    ehcVar.getClass();
                    eht ehtVar = new eht((nox) obj2, hpuVar, jtxVar, ljfVar, fixVar, ldaVar, ddfVar, hshVar, ehcVar, bitmap, zK, null, null, null);
                    ehtVar.c(new eif(eigVar, ehtVar, enl.v(eigVar.H)));
                    eigVar.c.b(ehtVar);
                    return null;
                }
            }));
            this.J.b(bvf.h);
            this.j.f();
            i(true, fG, this.H);
            return;
        }
        this.j.e("record#stopCapture");
        this.b.g(this.I.a());
        this.j.f();
        long jMax = Math.max(this.E - this.D, 0L);
        fjs fjsVar = this.i;
        int i3 = this.H;
        this.I.c();
        fjsVar.at(enl.v(i3), 0L, jMax, b(), ((Boolean) this.h.fA()).booleanValue());
        i(false, fG, i);
        synchronized (this.l) {
            this.l.remove(this.I.a());
        }
    }
}
