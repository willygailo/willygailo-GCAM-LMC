package androidx.work;

import android.content.Context;
import defpackage.ang;
import defpackage.asl;
import defpackage.ge;
import defpackage.pht;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    public asl a;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.ListenableWorker
    public final pht a() {
        this.a = asl.h();
        g().execute(new ang(this));
        return this.a;
    }

    public abstract ge b();
}
