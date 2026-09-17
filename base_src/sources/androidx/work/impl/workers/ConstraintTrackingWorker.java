package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import defpackage.apc;
import defpackage.asl;
import defpackage.asp;
import defpackage.ge;
import defpackage.kus;
import defpackage.pht;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements apc {
    public static final String a = kus.g("ConstraintTrkngWrkr");
    public WorkerParameters b;
    public final Object g;
    public volatile boolean h;
    public ListenableWorker i;
    public asl j;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.b = workerParameters;
        this.g = new Object();
        this.h = false;
        this.j = asl.h();
    }

    @Override // androidx.work.ListenableWorker
    public final pht a() {
        g().execute(new asp(this));
        return this.j;
    }

    public final void b() {
        this.j.e(ge.d());
    }

    @Override // androidx.work.ListenableWorker
    public final void c() {
        ListenableWorker listenableWorker = this.i;
        if (listenableWorker == null || listenableWorker.e) {
            return;
        }
        this.i.h();
    }

    @Override // defpackage.apc
    public final void e(List list) {
    }

    @Override // defpackage.apc
    public final void f(List list) {
        kus kusVarL = kus.l();
        String.format("Constraints changed for %s", list);
        kusVarL.h(new Throwable[0]);
        synchronized (this.g) {
            this.h = true;
        }
    }

    @Override // androidx.work.ListenableWorker
    public final boolean i() {
        ListenableWorker listenableWorker = this.i;
        return listenableWorker != null && listenableWorker.i();
    }

    public final void k() {
        this.j.e(ge.e());
    }
}
