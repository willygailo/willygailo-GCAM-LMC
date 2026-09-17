package defpackage;

import java.io.FileDescriptor;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class mtb implements mtd, mtc {
    public final Executor a;
    private pht e = null;
    public pht b = plk.V(null);
    public pht c = plk.V(null);
    private pht f = plk.V(null);
    public boolean d = true;

    public mtb(Executor executor) {
        this.a = executor;
    }

    @Override // defpackage.mtc
    public final msr a() {
        pht phtVar = this.e;
        if (phtVar != null) {
            return new msv(pgb.h(pho.q(phtVar), imd.o, this.a), this.f, this.b, this.c, this.d, this.a);
        }
        throw new IllegalArgumentException("Output not properly specified");
    }

    @Override // defpackage.mtc
    public final void b(int i) {
        this.f = plk.V(Integer.valueOf(i));
    }

    @Override // defpackage.mtd
    public final void c(FileDescriptor fileDescriptor) {
        this.e = plk.V(fileDescriptor);
    }
}
