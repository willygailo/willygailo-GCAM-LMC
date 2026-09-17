package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class dac implements czu {
    public static final dab a = new dab() { // from class: czx
        @Override // defpackage.dab
        public final void i(czo czoVar) {
        }
    };
    public final czq b;
    public final dad c;
    public final czv d;
    public final Executor e;
    public final ljl f;
    public final Map g;
    public final Context i;
    public final ljf j;
    public dab h = a;
    public final AtomicBoolean k = new AtomicBoolean(false);

    public dac(czq czqVar, dad dadVar, czv czvVar, Executor executor, ljl ljlVar, dbr dbrVar, Context context, ljf ljfVar) {
        this.b = czqVar;
        this.c = dadVar;
        this.d = czvVar;
        this.e = executor;
        this.f = ljlVar;
        this.g = dbrVar.fM();
        this.i = context;
        this.j = ljfVar;
    }

    @Override // defpackage.czu
    public final void a(Long l) {
        dab dabVar = this.h;
        czn cznVarA = czo.a();
        cznVarA.c(SystemClock.elapsedRealtimeNanos());
        cyj cyjVarA = cyk.a();
        cyjVarA.e(l.longValue());
        cyjVarA.e = 3;
        cznVarA.b(cyjVarA.a());
        dabVar.i(cznVarA.a());
    }

    public final Runnable b(long j) {
        return new czz(this, j, 0);
    }
}
