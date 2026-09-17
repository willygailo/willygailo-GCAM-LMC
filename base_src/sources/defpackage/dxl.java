package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class dxl {
    public static final String[] a = {"special_type_id"};
    public final pih b = pih.f();
    public final pih c = pih.f();
    public final Executor d;

    public dxl(final dxn dxnVar, Executor executor) {
        this.d = executor;
        executor.execute(new Runnable() { // from class: dxi
            @Override // java.lang.Runnable
            public final void run() {
                dxl dxlVar = this.a;
                dxn dxnVar2 = dxnVar;
                dxlVar.b.o(dxnVar2.getReadableDatabase());
                dxlVar.c.o(dxnVar2.getWritableDatabase());
            }
        });
    }
}
