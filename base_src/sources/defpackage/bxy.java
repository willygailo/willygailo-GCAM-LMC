package defpackage;

import android.os.Process;
import android.os.Trace;
import com.google.android.apps.camera.async.tt.CpuSets;

/* JADX INFO: loaded from: classes.dex */
public final class bxy {
    public static final ouj a = ouj.h("com/google/android/apps/camera/async/tt/ThreadThrottler");
    private final pyn b;
    private Boolean c;

    public bxy(pyn pynVar) {
        this.b = pynVar;
    }

    public final Runnable a(final Runnable runnable) {
        return new Runnable() { // from class: bxx
            @Override // java.lang.Runnable
            public final void run() {
                AutoCloseable autoCloseable;
                bxy bxyVar = this.a;
                Runnable runnable2 = runnable;
                if (bxyVar.c()) {
                    int iMyTid = Process.myTid();
                    kfm kfmVarA = CpuSets.a(iMyTid);
                    if (kfmVarA == null) {
                        ((oug) ((oug) bxy.a.c()).G((char) 150)).r("Failed to cpuset-limit thread %s.", Thread.currentThread().getName());
                        autoCloseable = bug.e;
                    } else {
                        Trace.beginSection("LimitCpuSet");
                        autoCloseable = new lie(iMyTid, kfmVarA, null, null, null) { // from class: bxw
                            public final /* synthetic */ int a;
                            public final /* synthetic */ kfm b;

                            @Override // defpackage.lie, java.lang.AutoCloseable
                            public final void close() {
                                int i = this.a;
                                kfm kfmVar = this.b;
                                obr.ap(kfmVar.a != 0);
                                long j = kfmVar.a;
                                kfmVar.a = 0L;
                                CpuSets.nativeRestoreCpuSet(i, j);
                                Trace.endSection();
                            }
                        };
                    }
                } else {
                    autoCloseable = bug.d;
                }
                try {
                    runnable2.run();
                } finally {
                    autoCloseable.close();
                }
            }
        };
    }

    public final void b() {
        if (c()) {
            if (CpuSets.a(Process.myTid()) != null) {
                Thread.currentThread().getName();
            } else {
                ((oug) ((oug) a.c()).G((char) 152)).r("Failed to cpuset-limit thread %s.", Thread.currentThread().getName());
            }
        }
    }

    public final boolean c() {
        boolean zBooleanValue;
        lil.a(CpuSets.class);
        synchronized (this) {
            if (this.c == null) {
                this.c = Boolean.valueOf(((ddf) this.b.get()).k(ddl.bg));
            }
            zBooleanValue = this.c.booleanValue();
        }
        return zBooleanValue;
    }
}
