package defpackage;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class kut {
    public final Object b;
    public final PowerManager.WakeLock c;
    public int d;
    public Future e;
    public long f;
    public boolean g;
    public int h;
    public ksd i;
    public final String j;
    public final String k;
    public final Map l;
    public AtomicInteger m;
    public final ScheduledExecutorService n;
    public kny o;
    private final Set s;
    private WorkSource t;
    public static final long a = TimeUnit.DAYS.toMillis(366);
    private static volatile ScheduledExecutorService q = null;
    private static final Object r = new Object();
    public static volatile mip p = new mip();

    public kut(Context context) {
        String packageName = context.getPackageName();
        this.b = new Object();
        this.d = 0;
        this.s = new HashSet();
        this.g = true;
        this.o = kny.a;
        this.l = new HashMap();
        this.m = new AtomicInteger(0);
        mip.du(context, "WakeLock: context must not be null");
        mip.dt("Analytics WakeLock", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        this.k = "Analytics WakeLock";
        this.i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.j = "Analytics WakeLock";
        } else {
            this.j = "*gcore*:Analytics WakeLock";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        obr.ao(powerManager);
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "Analytics WakeLock");
        this.c = wakeLockNewWakeLock;
        if (kod.b(context)) {
            WorkSource workSourceA = kod.a(context, koc.a(packageName) ? context.getPackageName() : packageName);
            this.t = workSourceA;
            if (workSourceA != null) {
                e(wakeLockNewWakeLock, workSourceA);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = q;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (r) {
                scheduledExecutorServiceUnconfigurableScheduledExecutorService = q;
                if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                    mip mipVar = ksf.a;
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    q = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                }
            }
        }
        this.n = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    private static void e(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }

    public final void a() {
        if (this.s.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.s);
        this.s.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    public final boolean b() {
        boolean z;
        synchronized (this.b) {
            z = this.d > 0;
        }
        return z;
    }

    public final void c() {
        if (this.g) {
            TextUtils.isEmpty(null);
        }
    }

    public final void d() {
        synchronized (this.b) {
            if (b()) {
                if (this.g) {
                    int i = this.d - 1;
                    this.d = i;
                    if (i > 0) {
                        return;
                    }
                } else {
                    this.d = 0;
                }
                a();
                Iterator it = this.l.values().iterator();
                while (it.hasNext()) {
                    ((kus) it.next()).a = 0;
                }
                this.l.clear();
                Future future = this.e;
                if (future != null) {
                    future.cancel(false);
                    this.e = null;
                    this.f = 0L;
                }
                this.h = 0;
                try {
                    if (this.c.isHeld()) {
                        try {
                            this.c.release();
                            if (this.i != null) {
                                this.i = null;
                            }
                        } catch (RuntimeException e) {
                            if (!e.getClass().equals(RuntimeException.class)) {
                                throw e;
                            }
                            Log.e("WakeLock", this.j.concat(" failed to release!"), e);
                            if (this.i != null) {
                                this.i = null;
                            }
                        }
                    } else {
                        Log.e("WakeLock", this.j.concat(" should be held!"));
                    }
                } catch (Throwable th) {
                    if (this.i != null) {
                        this.i = null;
                    }
                    throw th;
                }
            }
        }
    }
}
