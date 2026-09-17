package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class npb implements Callable {
    final /* synthetic */ npe a;
    final /* synthetic */ npd b;

    public npb(npd npdVar, npe npeVar) {
        this.b = npdVar;
        this.a = npeVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.b.a.h();
        try {
            int iA = this.b.b.a(this.a);
            this.b.a.j();
            return Integer.valueOf(iA);
        } finally {
            this.b.a.i();
        }
    }
}
