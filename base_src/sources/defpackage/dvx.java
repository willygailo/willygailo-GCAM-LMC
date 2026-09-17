package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class dvx extends mip {
    public final dvp a;
    public final jth b;
    private final brg c;
    private final Executor d;
    private final Set g = new HashSet();

    public dvx(dvp dvpVar, brg brgVar, jth jthVar, Executor executor) {
        this.a = dvpVar;
        this.c = brgVar;
        this.d = executor;
        this.b = jthVar;
    }

    @Override // defpackage.mip
    public final void b(final lzv lzvVar) {
        if (this.g.isEmpty()) {
            return;
        }
        final lic licVarB = this.c.b();
        this.d.execute(new Runnable() { // from class: dvw
            @Override // java.lang.Runnable
            public final void run() {
                dvx dvxVar = this.a;
                hjz hjzVarA = hjz.a(lzvVar, dvxVar.b, licVarB.e);
                dvp dvpVar = dvxVar.a;
                dvpVar.a.e(enl.D(hjzVarA.b), hjzVarA);
                dvpVar.d(hjzVarA);
            }
        });
    }

    public final synchronized void h(String str) {
        this.g.add(str);
    }

    public final synchronized void i(String str) {
        this.g.remove(str);
    }
}
