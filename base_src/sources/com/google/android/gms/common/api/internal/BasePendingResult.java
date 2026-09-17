package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import defpackage.kim;
import defpackage.kio;
import defpackage.kip;
import defpackage.kis;
import defpackage.kiv;
import defpackage.kiw;
import defpackage.kix;
import defpackage.kjn;
import defpackage.kjo;
import defpackage.kjp;
import defpackage.kkh;
import defpackage.kll;
import defpackage.mip;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasePendingResult extends kip {
    public static final ThreadLocal c = new kjn();
    private final CountDownLatch a;
    private final ArrayList b;
    public final Object d;
    public final kjo e;
    public kiw f;
    public kiv g;
    public volatile boolean h;
    public boolean i;
    public volatile kix j;
    private final AtomicReference k;
    private Status l;
    private boolean m;
    private kjp mResultGuardian;

    @Deprecated
    BasePendingResult() {
        this.d = new Object();
        this.a = new CountDownLatch(1);
        this.b = new ArrayList();
        this.k = new AtomicReference();
        this.i = false;
        this.e = new kjo(Looper.getMainLooper());
        new WeakReference(null);
    }

    protected BasePendingResult(kim kimVar) {
        this.d = new Object();
        this.a = new CountDownLatch(1);
        this.b = new ArrayList();
        this.k = new AtomicReference();
        this.i = false;
        this.e = new kjo(kimVar != null ? ((kkh) kimVar).a.h : Looper.getMainLooper());
        new WeakReference(kimVar);
    }

    public static void i(kiv kivVar) {
        if (kivVar instanceof kis) {
            try {
                ((kis) kivVar).b();
            } catch (RuntimeException e) {
                String strValueOf = String.valueOf(kivVar);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(strValueOf);
                Log.w("BasePendingResult", sb.toString(), e);
            }
        }
    }

    protected abstract kiv a(Status status);

    public final kiv g() {
        kiv kivVar;
        synchronized (this.d) {
            mip.dr(!this.h, "Result has already been consumed.");
            mip.dr(k(), "Result is not ready.");
            kivVar = this.g;
            this.g = null;
            this.f = null;
            this.h = true;
        }
        kll kllVar = (kll) this.k.getAndSet(null);
        if (kllVar != null) {
            kllVar.a();
        }
        mip.dk(kivVar);
        return kivVar;
    }

    @Deprecated
    public final void h(Status status) {
        synchronized (this.d) {
            if (!k()) {
                j(a(status));
                this.m = true;
            }
        }
    }

    public final void j(kiv kivVar) {
        synchronized (this.d) {
            if (this.m) {
                i(kivVar);
                return;
            }
            k();
            mip.dr(!k(), "Results have already been set");
            mip.dr(!this.h, "Result has already been consumed");
            this.g = kivVar;
            this.l = kivVar.a();
            this.a.countDown();
            kiw kiwVar = this.f;
            if (kiwVar != null) {
                this.e.removeMessages(2);
                this.e.a(kiwVar, g());
            } else if (this.g instanceof kis) {
                this.mResultGuardian = new kjp(this);
            }
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((kio) arrayList.get(i)).a(this.l);
            }
            this.b.clear();
        }
    }

    public final boolean k() {
        return this.a.getCount() == 0;
    }

    @Override // defpackage.kip
    public final void l(kio kioVar) {
        mip.dm(kioVar != null, "Callback cannot be null.");
        synchronized (this.d) {
            if (k()) {
                kioVar.a(this.l);
            } else {
                this.b.add(kioVar);
            }
        }
    }

    @Override // defpackage.kip
    public final kiv m(TimeUnit timeUnit) {
        mip.dr(!this.h, "Result has already been consumed.");
        mip.dr(true, "Cannot await if then() has been called.");
        try {
            if (!this.a.await(0L, timeUnit)) {
                h(Status.d);
            }
        } catch (InterruptedException e) {
            h(Status.b);
        }
        mip.dr(k(), "Result is not ready.");
        return g();
    }
}
