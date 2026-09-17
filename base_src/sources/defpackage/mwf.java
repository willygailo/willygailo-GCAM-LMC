package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class mwf implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final /* synthetic */ int c = 0;
    private Boolean i;
    private volatile String j;
    private volatile Activity k;
    private final oxk m;
    public final List a = new CopyOnWriteArrayList();
    private final AtomicInteger d = new AtomicInteger();
    private final AtomicInteger e = new AtomicInteger();
    public final AtomicInteger b = new AtomicInteger();
    private final AtomicInteger f = new AtomicInteger();
    private final AtomicInteger g = new AtomicInteger();
    private final AtomicInteger h = new AtomicInteger();
    private boolean l = false;

    public mwf(oxk oxkVar, byte[] bArr, byte[] bArr2) {
        this.m = oxkVar;
    }

    private final void a(Activity activity) {
        c(Boolean.valueOf(mwh.c(activity.getApplicationContext())), activity);
    }

    private final void b() {
        if (!this.l && this.d.get() == 0) {
            oxk oxkVar = this.m;
            if (oxkVar.i()) {
                this.l = true;
            } else {
                String strValueOf = String.valueOf(oxkVar.a);
                throw new IllegalStateException(strValueOf.length() != 0 ? "Primes did not observe lifecycle events in the expected order. This is usually because Primes is not being initialized properly (i.e. from the main thread and in onCreate). Send a cl to the Primes team requesting your app to be allowlisted for your package: ".concat(strValueOf) : new String("Primes did not observe lifecycle events in the expected order. This is usually because Primes is not being initialized properly (i.e. from the main thread and in onCreate). Send a cl to the Primes team requesting your app to be allowlisted for your package: "));
            }
        }
    }

    private final void c(Boolean bool, Activity activity) {
        if (bool.equals(this.i)) {
            return;
        }
        this.i = bool;
        if (bool.booleanValue()) {
            for (mwd mwdVar : this.a) {
                if (mwdVar instanceof mwb) {
                    ((mwb) mwdVar).b(activity);
                }
            }
            return;
        }
        for (mwd mwdVar2 : this.a) {
            if (mwdVar2 instanceof mwa) {
                ((mwa) mwdVar2).c(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.d.incrementAndGet();
        this.k = null;
        for (mwd mwdVar : this.a) {
            if (mwdVar instanceof mvt) {
                ((mvt) mwdVar).a(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.h.getAndIncrement() == 0) {
            b();
        }
        this.k = null;
        for (mwd mwdVar : this.a) {
            if (mwdVar instanceof mvu) {
                ((mvu) mwdVar).a();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.f.getAndIncrement() == 0) {
            b();
        }
        this.j = null;
        for (mwd mwdVar : this.a) {
            if (mwdVar instanceof mvv) {
                ((mvv) mwdVar).b(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (this.b.getAndIncrement() == 0) {
            b();
        }
        this.k = null;
        this.j = activity.getClass().getSimpleName();
        for (mwd mwdVar : this.a) {
            if (mwdVar instanceof mvw) {
                ((mvw) mwdVar).a(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        for (mwd mwdVar : this.a) {
            if (mwdVar instanceof mvx) {
                ((mvx) mwdVar).a();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.e.getAndIncrement() == 0) {
            b();
        }
        this.k = null;
        a(activity);
        for (mwd mwdVar : this.a) {
            if (mwdVar instanceof mvy) {
                ((mvy) mwdVar).b(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (this.g.getAndIncrement() == 0) {
            b();
        }
        this.k = activity;
        for (mwd mwdVar : this.a) {
            if (mwdVar instanceof mvz) {
                ((mvz) mwdVar).a();
            }
        }
        a(activity);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        for (mwd mwdVar : this.a) {
            if (mwdVar instanceof mwc) {
                ((mwc) mwdVar).a();
            }
        }
        if (i >= 20 && this.k != null) {
            c(false, this.k);
        }
        this.k = null;
    }
}
