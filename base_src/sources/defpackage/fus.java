package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class fus {
    public final lis a;
    public final fuo b;
    public final boolean c;
    public final long d;
    public final Set e = new HashSet();
    public boolean f = false;
    public long g = 0;

    public fus(lis lisVar, fuo fuoVar, ddf ddfVar) {
        this.a = lisVar.a("LongPressTrimming");
        this.b = fuoVar;
        this.c = ddfVar.k(ddr.w);
        this.d = TimeUnit.MICROSECONDS.convert(((Integer) ddfVar.a(ddr.b).c()).intValue(), TimeUnit.MILLISECONDS);
    }

    public final synchronized fuw a(long j, fuw fuwVar) {
        return new fur(this, j, fuwVar);
    }

    public final synchronized void b() {
        this.f = true;
    }

    @Deprecated
    public final synchronized boolean c() {
        return this.f;
    }
}
