package defpackage;

import android.database.sqlite.SQLiteException;
import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class cye implements cxz {
    public final cwt a;
    public final CameraFatalErrorTrackerDatabase b;
    private final Executor c;

    public cye(cwt cwtVar, CameraFatalErrorTrackerDatabase cameraFatalErrorTrackerDatabase, Executor executor, ddf ddfVar) {
        this.a = cwtVar;
        this.b = cameraFatalErrorTrackerDatabase;
        this.c = executor;
        ddi ddiVar = ddl.a;
        ddfVar.e();
    }

    public static cxy l(lwd lwdVar) {
        return lwdVar == lwd.FRONT ? cxy.FRONT_ENUMERATION : cxy.BACK_ENUMERATION;
    }

    private static cxy m(lwd lwdVar) {
        return lwdVar == lwd.FRONT ? cxy.FRONT_UNOPENABLE : cxy.BACK_UNOPENABLE;
    }

    private final pht n(final cxy cxyVar) {
        return plk.Z(new Callable() { // from class: cyc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cye cyeVar = this.a;
                cxy cxyVar2 = cxyVar;
                try {
                    return cyeVar.b.t().a(cxyVar2);
                } catch (SQLiteException e) {
                    return new cxs(cxyVar2);
                }
            }
        }, this.c);
    }

    private final void o(final cxy cxyVar) {
        this.c.execute(new Runnable() { // from class: cya
            @Override // java.lang.Runnable
            public final void run() {
                cye cyeVar = this.a;
                cxy cxyVar2 = cxyVar;
                cyeVar.a.a();
                cxs cxsVarA = cyeVar.b.t().a(cxyVar2);
                if (cxsVarA.d == 0) {
                    cxsVarA.b++;
                } else {
                    cxsVarA.c++;
                }
                cyeVar.b.t().b(cxsVarA);
            }
        });
    }

    private final void p(final cxy... cxyVarArr) {
        this.c.execute(new Runnable() { // from class: cyb
            @Override // java.lang.Runnable
            public final void run() {
                final cye cyeVar = this.a;
                Collection.EL.forEach(Arrays.asList(cxyVarArr), new Consumer() { // from class: cyd
                    @Override // j$.util.function.Consumer
                    public final void accept(Object obj) {
                        cyeVar.b.t().b(new cxs((cxy) obj));
                    }

                    @Override // j$.util.function.Consumer
                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer.CC.$default$andThen(this, consumer);
                    }
                });
            }
        });
    }

    @Override // defpackage.cxz
    public final pht a(lwd lwdVar) {
        return n(l(lwdVar));
    }

    @Override // defpackage.cxz
    public final pht b(lwd lwdVar) {
        return n(m(lwdVar));
    }

    @Override // defpackage.cxz
    public final pht c() {
        return n(cxy.ENUMERATION);
    }

    @Override // defpackage.cxz
    public final pht d() {
        return n(cxy.UNOPENABLE);
    }

    @Override // defpackage.cxz
    public final void e(lwd... lwdVarArr) {
        p((cxy[]) DesugarArrays.stream(lwdVarArr).map(cgw.f).toArray(dbh.b));
    }

    @Override // defpackage.cxz
    public final void f(lwd lwdVar) {
        o(l(lwdVar));
    }

    @Override // defpackage.cxz
    public final void g(lwd lwdVar) {
        p(m(lwdVar), cxy.UNOPENABLE);
    }

    @Override // defpackage.cxz
    public final void h(lwd lwdVar) {
        o(m(lwdVar));
    }

    @Override // defpackage.cxz
    public final void i() {
        p(cxy.ENUMERATION);
    }

    @Override // defpackage.cxz
    public final void j() {
        o(cxy.ENUMERATION);
    }

    @Override // defpackage.cxz
    public final void k() {
        o(cxy.UNOPENABLE);
    }
}
