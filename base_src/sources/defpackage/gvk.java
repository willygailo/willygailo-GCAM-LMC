package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class gvk implements iho, fik, fhk {
    public final Context a;
    public final fhi b;
    public final bus c;
    public final lar d;
    private final Executor e;
    private final ljf f;

    public gvk(Context context, Executor executor, ljf ljfVar, fhi fhiVar, bus busVar, lar larVar) {
        this.a = context;
        this.e = executor;
        this.f = ljfVar;
        this.b = fhiVar;
        this.c = busVar;
        this.d = larVar;
    }

    public final void a() {
        this.e.execute(this.f.c("PhenotypeHelper#commitFlags", new gvj(this, 1)));
    }

    @Override // defpackage.fhk
    public final void b() {
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.execute(this.f.c("PhenotypeHelper#retrieveFlags", new gvj(this, 0)));
    }
}
