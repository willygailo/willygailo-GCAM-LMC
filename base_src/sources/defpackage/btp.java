package defpackage;

import android.app.admin.DevicePolicyManager;
import android.os.Handler;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
public final class btp implements avw, bud {
    public static final ouj a = ouj.h("com/google/android/apps/camera/app/LegacyCameraController");
    public final Handler b;
    public avw c;
    public awl d;
    public lvs e = null;
    public final HashSet f = new HashSet();
    private final btl g;
    private final lkd h;
    private final lvq i;
    private final DevicePolicyManager j;
    private final Executor k;
    private final Semaphore l;
    private axa m;
    private final axf n;
    private final dkc o;

    public btp(Handler handler, btl btlVar, lkd lkdVar, lvq lvqVar, dkc dkcVar, DevicePolicyManager devicePolicyManager, Executor executor, Semaphore semaphore) {
        avw avwVar;
        bto btoVar = new bto(this);
        this.n = btoVar;
        this.b = handler;
        this.g = btlVar;
        this.j = devicePolicyManager;
        this.o = dkcVar;
        this.h = lkdVar;
        this.i = lvqVar;
        this.k = executor;
        this.l = semaphore;
        axa axaVarA = btlVar.a();
        this.m = axaVarA;
        if (axaVarA == null && (avwVar = this.c) != null) {
            avwVar.c(-1, "GETTING_CAMERA_INFO");
        }
        btlVar.c(new axg(btoVar, handler));
    }

    private final void n(btl btlVar, final lvs lvsVar, Handler handler, final avw avwVar) throws InterruptedException {
        try {
            if (this.j.getCameraDisabled(null)) {
                throw new dlq();
            }
            this.l.acquire();
            btlVar.b(handler, lvsVar.a(), avwVar);
        } catch (dlq e) {
            handler.post(new Runnable() { // from class: btm
                @Override // java.lang.Runnable
                public final void run() {
                    avwVar.a(lvsVar.a());
                }
            });
        }
    }

    @Override // defpackage.avw
    public final void a(int i) {
        avw avwVar = this.c;
        if (avwVar != null) {
            avwVar.a(i);
        }
        k();
    }

    @Override // defpackage.avw
    public final synchronized void b(awl awlVar) {
        int iA = awlVar.a();
        lvs lvsVar = this.e;
        int iA2 = lvsVar != null ? lvsVar.a() : -1;
        if (iA2 != iA) {
            m(false);
            return;
        }
        if (awlVar.g().a() != 1) {
            awl awlVar2 = this.d;
            if (awlVar2 != null && awlVar2.a() != iA) {
                m(false);
            }
            this.e = null;
            this.d = awlVar;
            avw avwVar = this.c;
            if (avwVar != null) {
                avwVar.b(awlVar);
            }
        } else {
            avw avwVar2 = this.c;
            if (avwVar2 != null) {
                StringBuilder sb = new StringBuilder(48);
                sb.append("Camera ");
                sb.append(iA2);
                sb.append(" opened, but in UNOPENED state");
                avwVar2.c(iA, sb.toString());
            }
        }
    }

    @Override // defpackage.avw
    public final void c(int i, String str) {
        avw avwVar = this.c;
        if (avwVar != null) {
            avwVar.c(i, str);
        }
        k();
    }

    @Override // defpackage.avw
    public final void d(int i, String str) {
        g(i);
        avw avwVar = this.c;
        if (avwVar != null) {
            avwVar.d(i, str);
        }
        k();
    }

    @Override // defpackage.bud
    public final int e() {
        axa axaVar = this.m;
        if (axaVar == null) {
            return -1;
        }
        return axaVar.a();
    }

    @Override // defpackage.bud
    public final awz f(int i) {
        axa axaVar = this.m;
        if (axaVar == null) {
            return null;
        }
        return axaVar.b(i);
    }

    public final synchronized void g(int i) {
        lvs lvsVar = this.e;
        if (lvsVar != null) {
            lvsVar.a();
        }
        lvs lvsVar2 = this.e;
        if (lvsVar2 != null && lvsVar2.a() == i) {
            this.e = null;
        }
    }

    public final synchronized void h() {
        lvs lvsVar = this.e;
        if (lvsVar == null) {
            ((oug) ((oug) a.c()).G('\\')).o("doRequestCamera: might be interrupted by early release. return");
            return;
        }
        this.o.a(lvsVar);
        btl btlVar = this.g;
        btlVar.getClass();
        awl awlVar = this.d;
        if (awlVar == null) {
            n(btlVar, lvsVar, this.b, this);
        } else if (awlVar.a() != lvsVar.a()) {
            m(false);
            n(this.g, lvsVar, this.b, this);
        } else {
            try {
                awlVar.h().a(new awh(awlVar, this.b, this));
            } catch (RuntimeException e) {
                awlVar.d().c().c(e);
            }
        }
        this.m = this.g.a();
    }

    @Override // defpackage.bud
    public final /* synthetic */ void i() {
        int iE = e();
        if (iE != -1) {
            j(iE);
        }
    }

    @Override // defpackage.bud
    public final void j(int i) {
        g(i);
        awl awlVar = this.d;
        if (awlVar == null) {
            ((oug) ((oug) a.c()).G(96)).p("releaseCamera: Try to release a not-yet-available camera(%s). Wait till it's available", i);
            return;
        }
        int iA = awlVar.a();
        if (iA != i) {
            ((oug) ((oug) a.c()).G(95)).s("releaseCamera: Try to release a camera that is not opened. current=%s id=%s", iA, i);
            return;
        }
        dkc dkcVar = this.o;
        lvs lvsVarC = this.i.c(i);
        synchronized (dkcVar.a) {
            lvs lvsVar = dkcVar.b;
            if (lvsVar != null && lvsVar.equals(lvsVarC)) {
                dkcVar.b = null;
            }
        }
    }

    public final void k() {
        if (this.l.availablePermits() == 0) {
            this.l.release();
        }
    }

    @Override // defpackage.bud
    public final /* synthetic */ void l() {
        int iE = e();
        if (iE != -1) {
            lvs lvsVarC = this.i.c(iE);
            synchronized (this) {
                lvs lvsVar = this.e;
                if (lvsVar != null) {
                    if (lvsVar.equals(lvsVarC)) {
                        return;
                    } else {
                        j(this.e.a());
                    }
                }
                this.e = lvsVarC;
                this.h.a();
                this.k.execute(new btn(this, iE, 0));
            }
        }
    }

    public final void m(boolean z) {
        btl btlVar = this.g;
        btlVar.getClass();
        btlVar.d(z);
        k();
    }
}
