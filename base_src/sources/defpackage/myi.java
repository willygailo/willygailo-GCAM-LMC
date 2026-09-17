package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class myi extends mye implements mxo, mvt, mwa, mvy {
    public static final ouj a = ouj.h("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricServiceImpl");
    volatile mul b;
    public final pyn c;
    public volatile boolean d;
    private final boolean f;
    private final Context g;
    private final Executor h;
    private final mxl i;
    private final ojc j;
    private final mwe k;
    private final Runnable p;
    private final nox q;
    private final AtomicBoolean e = new AtomicBoolean();
    private final AtomicInteger l = new AtomicInteger();
    private final AtomicInteger m = new AtomicInteger();
    private final AtomicInteger n = new AtomicInteger();
    private final AtomicBoolean o = new AtomicBoolean(false);

    public myi(mxm mxmVar, Context context, Executor executor, pyn pynVar, ojc ojcVar, mwe mweVar, nox noxVar, ojc ojcVar2, final qkg qkgVar, byte[] bArr) {
        this.c = pynVar;
        this.j = ojcVar;
        this.k = mweVar;
        this.q = noxVar;
        this.i = mxmVar.a(pgr.INSTANCE, pynVar, null);
        this.g = context;
        this.h = executor;
        this.f = ((Boolean) ojcVar2.e(Boolean.FALSE)).booleanValue();
        this.p = new Runnable() { // from class: myg
            @Override // java.lang.Runnable
            public final void run() {
                this.a.d = ((Boolean) qkgVar.get()).booleanValue();
            }
        };
    }

    private final void h(final int i, final AtomicInteger atomicInteger) {
        atomicInteger.getAndIncrement();
        plk.aa(new pgj() { // from class: myf
            @Override // defpackage.pgj
            public final pht a() {
                myi myiVar = this.a;
                return atomicInteger.getAndDecrement() <= 0 ? phq.a : myiVar.f(i, (myd) myiVar.c.get());
            }
        }, this.h);
    }

    @Override // defpackage.mvt
    public final void a(Activity activity, Bundle bundle) {
        if (this.o.getAndSet(true)) {
            return;
        }
        h(4, this.m);
    }

    @Override // defpackage.mvy
    public final void b(Activity activity) {
        mul mulVar;
        Class<?> cls = activity.getClass();
        if (oje.d(null)) {
            mulVar = new mul(cls.getSimpleName());
        } else {
            String strValueOf = String.valueOf((Object) null);
            String strValueOf2 = String.valueOf(cls.getSimpleName());
            mulVar = new mul(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
        }
        this.b = mulVar;
    }

    @Override // defpackage.mwa
    public final void c(Activity activity) {
        this.b = null;
    }

    @Override // defpackage.mye
    public final void d() {
        if (this.e.compareAndSet(false, true)) {
            Thread.setDefaultUncaughtExceptionHandler(new myh(this, Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    public final void e(qxy qxyVar) {
        mvp mvpVar;
        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        myd mydVar = (myd) this.c.get();
        if (mydVar.b()) {
            if (this.d) {
                mvq mvqVar = this.i.e;
                synchronized (mvqVar.a) {
                    if (mvqVar.a.isEmpty()) {
                        mvpVar = mvp.a;
                    } else {
                        mvpVar = new mvp((mvs[]) mvqVar.a.values().toArray(new mvs[0]));
                    }
                }
            } else {
                mvpVar = null;
            }
            mxl mxlVar = this.i;
            mxf mxfVarA = mxg.a();
            poy poyVarM = qyk.t.m();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qyk qykVar = (qyk) poyVarM.b;
            qxyVar.getClass();
            qykVar.g = qxyVar;
            qykVar.a |= 64;
            mxfVarA.d((qyk) poyVarM.j());
            mxfVarA.b = null;
            mxfVarA.e = mvpVar;
            mxlVar.b(mxfVarA.a());
            while (this.l.getAndDecrement() > 0) {
                f(3, mydVar);
            }
            while (this.m.getAndDecrement() > 0) {
                f(4, mydVar);
            }
            while (this.n.getAndDecrement() > 0) {
                f(5, mydVar);
            }
        }
    }

    final pht f(int i, myd mydVar) {
        if (!mydVar.b()) {
            return phq.a;
        }
        float f = mydVar.a;
        ncg ncgVarA = this.q.a(f / 100.0f);
        if (ncgVarA.b.nextFloat() >= ncgVarA.a) {
            return phq.a;
        }
        mxl mxlVar = this.i;
        mxf mxfVarA = mxg.a();
        poy poyVarM = qyk.t.m();
        poy poyVarM2 = qyi.d.m();
        int i2 = (int) (100.0f / f);
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        qyi qyiVar = (qyi) poyVarM2.b;
        int i3 = qyiVar.a | 2;
        qyiVar.a = i3;
        qyiVar.c = i2;
        qyiVar.b = i - 1;
        qyiVar.a = i3 | 1;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        qyk qykVar = (qyk) poyVarM.b;
        qyi qyiVar2 = (qyi) poyVarM2.j();
        qyiVar2.getClass();
        qykVar.h = qyiVar2;
        qykVar.a |= 128;
        mxfVarA.d((qyk) poyVarM.j());
        return mxlVar.b(mxfVarA.a());
    }

    public final poy g() {
        poy poyVarM = qxy.j.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        qxy qxyVar = (qxy) poyVarM.b;
        qxyVar.a |= 1;
        qxyVar.b = true;
        mul mulVar = this.b;
        String str = mulVar == null ? null : mulVar.a;
        if (str != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxy qxyVar2 = (qxy) poyVarM.b;
            qxyVar2.a |= 4;
            qxyVar2.d = str;
        }
        try {
            poy poyVarM2 = qxt.c.m();
            qxs qxsVarE = mwp.e(null, this.g);
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            qxt qxtVar = (qxt) poyVarM2.b;
            qxsVarE.getClass();
            qxtVar.b = qxsVarE;
            qxtVar.a |= 1;
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxy qxyVar3 = (qxy) poyVarM.b;
            qxt qxtVar2 = (qxt) poyVarM2.j();
            qxtVar2.getClass();
            qxyVar3.c = qxtVar2;
            qxyVar3.a |= 2;
        } catch (RuntimeException e) {
            ((oug) ((oug) ((oug) a.c()).h(e)).G((char) 3622)).o("Failed to get process stats.");
        }
        return poyVarM;
    }

    @Override // defpackage.mxo
    public final void t() {
        ((myj) ((qkg) ((ojj) this.j).a).get()).a(this);
        this.k.a(this);
        h(3, this.l);
        if (this.f) {
            d();
        }
        plk.Y(this.p, this.h);
    }
}
