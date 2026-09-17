package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class lah implements lij {
    public final lij a;
    private final Executor b;

    public lah(lij lijVar, Executor executor) {
        this.a = lijVar;
        this.b = executor;
    }

    @Override // defpackage.lij
    public final void fB(final Object obj) {
        this.b.execute(new Runnable() { // from class: lag
            @Override // java.lang.Runnable
            public final void run() {
                lah lahVar = this.a;
                lahVar.a.fB(obj);
            }
        });
    }
}
