package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class bxd implements lco {
    private final lco a;

    public bxd(lco lcoVar) {
        this.a = lcoVar;
    }

    @Override // defpackage.lco
    public final lie a(final lij lijVar, Executor executor) {
        return this.a.a(new lij() { // from class: bxc
            @Override // defpackage.lij
            public final void fB(Object obj) {
                lij lijVar2 = lijVar;
                if (obj != null) {
                    lijVar2.fB(obj);
                }
            }
        }, executor);
    }

    @Override // defpackage.lco
    public final Object fA() {
        return this.a.fA();
    }
}
