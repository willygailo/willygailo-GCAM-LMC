package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class lcf implements lij {
    private final lij a;
    private final Executor b;
    private final lap c;
    private lap d;

    public lcf(lij lijVar, Executor executor, lap lapVar) {
        this.a = lijVar;
        this.b = executor;
        this.c = lapVar;
        this.d = lapVar.b();
    }

    @Override // defpackage.lij
    public final /* bridge */ /* synthetic */ void fB(Object obj) {
        lap lapVar = this.d;
        lap lapVarB = this.c.b();
        this.d = lapVarB;
        lapVarB.c(((lco) obj).a(this.a, this.b));
        lapVar.close();
    }
}
