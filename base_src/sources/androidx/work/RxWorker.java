package androidx.work;

import android.content.Context;
import defpackage.anb;
import defpackage.blv;
import defpackage.pht;
import defpackage.qco;
import defpackage.qka;
import defpackage.qmd;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class RxWorker extends ListenableWorker {
    public static final Executor a = new blv(1);
    private anb b;

    public RxWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.ListenableWorker
    public final pht a() {
        this.b = new anb();
        qka.a(g());
        b();
        qco qcoVar = qmd.m;
        j();
        throw null;
    }

    public abstract void b();

    @Override // androidx.work.ListenableWorker
    public final void c() {
        anb anbVar = this.b;
        if (anbVar != null) {
            anbVar.a();
            this.b = null;
        }
    }
}
