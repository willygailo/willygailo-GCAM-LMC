package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class cyg implements Executor {
    private final Executor a;
    private final lis b;

    public cyg(lis lisVar, ddf ddfVar, Executor executor) {
        this.a = executor;
        this.b = lisVar.a("SQLiteExpnCatchr");
        ddi ddiVar = ddl.a;
        ddfVar.e();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(new cyf(this.b, runnable));
    }
}
