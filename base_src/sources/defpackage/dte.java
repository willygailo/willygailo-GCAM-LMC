package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class dte {
    private final dqw d;
    private int e = 9000;
    public int a = 1;
    private dsy f = dtd.a;
    public int c = 4;
    public int b = 30;
    private long g = 0;
    private TimeUnit h = null;

    public dte(dqw dqwVar) {
        this.d = dqwVar;
    }

    public final dsz a() {
        if (this.h != null) {
            this.e = (int) (((long) this.b) * TimeUnit.SECONDS.convert(this.g, this.h));
        }
        dta dtaVar = new dta(this.a);
        int i = this.a;
        dsx dtbVar = i == 1 ? new dtb() : new dtc(i);
        int i2 = this.a;
        return new dsz(this.d, this.e, i2, i2, this.c, this.f, dtaVar, dtbVar);
    }

    public final void b() {
        this.f = dtd.b;
    }

    public final void c(long j, TimeUnit timeUnit) {
        this.g = j;
        this.h = timeUnit;
    }
}
