package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class guz implements lco {
    public final lzb a;
    private final lar b = new lar();

    public guz(lzb lzbVar) {
        this.a = lzbVar;
    }

    @Override // defpackage.lco
    public final lie a(lij lijVar, Executor executor) {
        guv guvVar = new guv(executor, lijVar);
        this.a.b(guvVar);
        this.b.execute(new gux(this, executor, lijVar));
        return new guy(this, guvVar);
    }

    @Override // defpackage.lco
    public final /* bridge */ /* synthetic */ Object fA() {
        return this.a.a();
    }
}
