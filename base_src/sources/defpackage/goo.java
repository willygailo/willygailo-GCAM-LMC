package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class goo {
    private final pyn a;
    private final pyn b;
    private final lir c;
    private final ljf d;
    private final jug e;
    private final ddf f;
    private final ghx g;

    public goo(ghx ghxVar, final pyn pynVar, final pyn pynVar2, final pyn pynVar3, Executor executor, lir lirVar, final ljf ljfVar, jug jugVar, ddf ddfVar) {
        this.g = ghxVar;
        this.a = pynVar2;
        this.b = pynVar3;
        this.c = lirVar;
        this.d = ljfVar;
        this.e = jugVar;
        this.f = ddfVar;
        executor.execute(new Runnable() { // from class: gon
            @Override // java.lang.Runnable
            public final void run() {
                ljf ljfVar2 = ljfVar;
                pyn pynVar4 = pynVar;
                pyn pynVar5 = pynVar2;
                pyn pynVar6 = pynVar3;
                ljfVar2.e("MVCaptureCommand.Warmup");
                pynVar4.get();
                pynVar5.get();
                pynVar6.get();
                ljfVar2.f();
            }
        });
    }

    public final gop a(goy goyVar) {
        return new gop(goyVar, oih.a, this.g, this.a, this.b, false, false, this.c, this.d, this.f);
    }

    public final gop b(goy goyVar, goy goyVar2) {
        return new gop(goyVar, ojc.i(goyVar2), this.g, this.a, this.b, true, false, this.c, this.d, this.f);
    }

    public final gop c(goy goyVar, goy goyVar2) {
        return new gop(goyVar, ojc.i(goyVar2), this.g, this.a, this.b, true, true, this.c, this.d, this.f);
    }
}
