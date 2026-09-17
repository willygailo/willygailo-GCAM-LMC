package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class czz implements Runnable {
    public final /* synthetic */ dac a;
    public final /* synthetic */ long b;
    private final /* synthetic */ int c;

    public /* synthetic */ czz(dac dacVar, long j, int i) {
        this.c = i;
        this.a = dacVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                dac dacVar = this.a;
                dacVar.e.execute(new czz(dacVar, this.b, 1));
                break;
            default:
                dac dacVar2 = this.a;
                long j = this.b;
                dacVar2.c.b(Long.valueOf(j));
                dab dabVar = dacVar2.h;
                czn cznVarA = czo.a();
                cznVarA.c(SystemClock.elapsedRealtimeNanos());
                cyj cyjVarA = cyk.a();
                cyjVarA.e(j);
                cyjVarA.e = 3;
                cznVarA.b(cyjVarA.a());
                dabVar.i(cznVarA.a());
                break;
        }
    }
}
