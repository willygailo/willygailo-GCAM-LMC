package defpackage;

import j$.util.Collection;
import j$.util.function.Function;
import j$.util.stream.Collectors;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class ets implements bvv {
    public final pyn a;
    public final pht b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;
    private final qkg g;
    private final pyn h;
    private final lar i;
    private final Executor j;
    private final AtomicBoolean k = new AtomicBoolean(false);
    private final lbl l;
    private final ljf m;
    private final lis n;
    private final ivj o;
    private pht p;

    public ets(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, pyn pynVar, lar larVar, Executor executor, pht phtVar, lir lirVar, lbl lblVar, pyn pynVar2, ljf ljfVar, ivj ivjVar) {
        this.c = qkgVar;
        this.d = qkgVar2;
        this.h = pynVar;
        this.i = larVar;
        this.j = executor;
        this.b = phtVar;
        this.l = lblVar;
        this.a = pynVar2;
        this.m = ljfVar;
        this.o = ivjVar;
        this.e = qkgVar3;
        this.f = qkgVar4;
        this.g = qkgVar5;
        this.n = lirVar.a("ActivityUiStartup");
    }

    private final qkg a(final qkg qkgVar) {
        return new qkg() { // from class: etr
            @Override // defpackage.qkg
            public final Object get() {
                ets etsVar = this.a;
                qkg qkgVar2 = qkgVar;
                final bxy bxyVar = (bxy) etsVar.a.get();
                return (Set) Collection.EL.stream(((pyw) qkgVar2).get()).map(new Function() { // from class: etp
                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function andThen(Function function) {
                        return Function.CC.$default$andThen(this, function);
                    }

                    @Override // j$.util.function.Function
                    public final Object apply(Object obj) {
                        return new dks(bxyVar.a((iho) obj), 2);
                    }

                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function compose(Function function) {
                        return Function.CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toSet());
            }
        };
    }

    @Override // defpackage.bvv
    public final /* synthetic */ String c() {
        return aas.g(this);
    }

    @Override // defpackage.bvv
    public final pht fz() {
        if (this.k.getAndSet(true)) {
            return this.p;
        }
        this.m.e("ActivityUiStartup");
        lar larVar = this.i;
        pyn pynVar = this.h;
        pynVar.getClass();
        larVar.execute(new doa(pynVar, 3));
        this.o.c();
        qkg qkgVar = new qkg() { // from class: etq
            @Override // defpackage.qkg
            public final Object get() {
                final ets etsVar = this.a;
                return new bvv() { // from class: etn
                    @Override // defpackage.bvv
                    public final /* synthetic */ String c() {
                        return aas.g(this);
                    }

                    @Override // defpackage.bvv
                    public final pht fz() {
                        return pgb.h(etsVar.b, eto.a, pgr.INSTANCE);
                    }
                };
            }
        };
        bvu bvuVarA = bvu.a(this.j);
        bvuVarA.d = this.l;
        bvuVarA.b = this.m;
        bvuVarA.c = this.n;
        bvuVarA.c(this.c, "ActivityStartup");
        bvuVarA.d(this.e, "WiringStartup");
        bvuVarA.c(this.d, "CameraActivityController");
        bvuVarA.c(qkgVar, "Interactivity");
        bvuVarA.d(a(this.f), "ShotStartup");
        bvuVarA.d(a(this.g), "SmartsStartup");
        this.p = bvuVarA.b();
        this.m.h();
        this.m.f();
        return this.p;
    }
}
