package androidx.work;

import android.content.Context;
import defpackage.amq;
import defpackage.aso;
import defpackage.pht;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class ListenableWorker {
    public Context c;
    public WorkerParameters d;
    public volatile boolean e;
    public boolean f;

    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.c = context;
        this.d = workerParameters;
    }

    public abstract pht a();

    public void c() {
    }

    public final int d() {
        return this.d.c;
    }

    public final amq fs() {
        return this.d.b;
    }

    public final UUID ft() {
        return this.d.a;
    }

    public final Executor g() {
        return this.d.d;
    }

    public final void h() {
        this.e = true;
        c();
    }

    public boolean i() {
        return false;
    }

    public final aso j() {
        return this.d.f;
    }
}
