package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class doh implements gjt {
    final /* synthetic */ dos a;
    final /* synthetic */ doi b;

    public doh(doi doiVar, dos dosVar) {
        this.b = doiVar;
        this.a = dosVar;
    }

    @Override // defpackage.gjt
    public final pht a() {
        final dos dosVar = this.a;
        phu phuVarA = phu.a(new Callable() { // from class: dog
            @Override // java.util.concurrent.Callable
            public final Object call() {
                doh dohVar = this.a;
                return dohVar.b.b(dosVar);
            }
        });
        this.b.a.execute(phuVarA);
        return phuVarA;
    }

    @Override // defpackage.gjt
    public final pht b() {
        return plk.V(new dod(this.a.a));
    }
}
