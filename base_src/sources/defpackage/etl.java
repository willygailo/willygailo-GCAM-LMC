package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class etl implements bvv {
    private final lbk a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;
    private final qkg g;
    private final Executor h;
    private final AtomicBoolean i = new AtomicBoolean(false);
    private final lbl j;
    private final ljf k;
    private final lis l;
    private pht m;

    public etl(lbk lbkVar, qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, Executor executor, lir lirVar, lbl lblVar, ljf ljfVar) {
        this.a = lbkVar;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.d = qkgVar3;
        this.e = qkgVar4;
        this.f = qkgVar5;
        this.g = qkgVar6;
        this.h = executor;
        this.j = lblVar;
        this.k = ljfVar;
        this.l = lirVar.a("ActivityStartup");
    }

    @Override // defpackage.bvv
    public final /* synthetic */ String c() {
        return aas.g(this);
    }

    @Override // defpackage.bvv
    public final pht fz() {
        if (this.i.getAndSet(true)) {
            return this.m;
        }
        this.k.e("ActivityStartup");
        this.a.a();
        this.e.get();
        bvu bvuVarA = bvu.a(this.h);
        bvuVarA.d = this.j;
        bvuVarA.b = this.k;
        bvuVarA.c = this.l;
        bvuVarA.c(this.b, "ErrorHandlerStartup");
        bvuVarA.c(this.c, "WaitForHalUpdate");
        bvuVarA.c(this.e, "PermissionsStartup");
        bvuVarA.c(this.d, "WaitForCameraDevices");
        bvuVarA.c(this.f, "CriticalPath");
        bvuVarA.d(this.g, "ActivityBehaviors");
        this.m = bvuVarA.b();
        this.k.f();
        return this.m;
    }
}
