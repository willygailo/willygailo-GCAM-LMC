package defpackage;

import j$.util.Collection;
import j$.util.function.Consumer;
import j$.util.stream.Stream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class cbh implements pys {
    private final qkg a;
    private final qkg b;
    private final /* synthetic */ int c;

    public cbh(qkg qkgVar, qkg qkgVar2, int i) {
        this.c = i;
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public cbh(qkg qkgVar, qkg qkgVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public cbh(qkg qkgVar, qkg qkgVar2, int i, char[] cArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public cbh(qkg qkgVar, qkg qkgVar2, int i, float[] fArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public cbh(qkg qkgVar, qkg qkgVar2, int i, int[] iArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public cbh(qkg qkgVar, qkg qkgVar2, int i, short[] sArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public cbh(qkg qkgVar, qkg qkgVar2, int i, boolean[] zArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public cbh(qkg qkgVar, qkg qkgVar2, int i, byte[][] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public cbh(qkg qkgVar, qkg qkgVar2, int i, char[][] cArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public cbh(qkg qkgVar, qkg qkgVar2, int i, int[][] iArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public cbh(qkg qkgVar, qkg qkgVar2, int i, short[][] sArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.c) {
            case 0:
                Object objH = ((bpk) this.a).a().booleanValue() ? ope.H((cbl) pyr.a(this.b).get()) : orx.a;
                qmd.ae(objH);
                return objH;
            case 1:
                return new bzn((fjs) this.a.get(), (bzo) this.b.get());
            case 2:
                dlt dltVar = (dlt) this.b.get();
                return new cfg(dltVar);
            case 3:
                return new cgq(((jnw) this.b).get(), (lar) this.a.get());
            case 4:
                return new cok(((eth) this.a).get(), (ddf) this.b.get(), null, null);
            case 5:
                return new cpd(this.b, (nvb) this.a.get(), null, null);
            case 6:
                return new cph((ddf) this.a.get(), (hup) this.b.get());
            case 7:
                return new cpi((ddf) this.a.get(), (hup) this.b.get());
            case 8:
                return new crs((dmh) this.a.get(), (gfy) this.b.get());
            case 9:
                mip mipVar = (mip) this.a.get();
                bqg bqgVar = ((etg) this.b).get();
                csh cshVar = new csh(mipVar, null, null, null);
                bqgVar.i().c(cshVar);
                return cshVar;
            case 10:
                final lap lapVar = (lap) this.b.get();
                final qkg qkgVar = this.a;
                return new bvv() { // from class: csk
                    @Override // defpackage.bvv
                    public final /* synthetic */ String c() {
                        return aas.g(this);
                    }

                    @Override // defpackage.bvv
                    public final pht fz() {
                        lapVar.c(new fsv(((ftz) qkgVar.get()).a(), 1));
                        return plk.V(true);
                    }
                };
            case 11:
                final ckd ckdVar = ((coo) this.b).get();
                final qkg qkgVar2 = this.a;
                return new bvv() { // from class: csi
                    @Override // defpackage.bvv
                    public final /* synthetic */ String c() {
                        return aas.g(this);
                    }

                    @Override // defpackage.bvv
                    public final pht fz() {
                        ckd ckdVar2 = ckdVar;
                        qkg qkgVar3 = qkgVar2;
                        final int i = 1;
                        if (ckdVar2.C) {
                            final csq csqVar = (csq) qkgVar3.get();
                            if (!csqVar.d.getAndSet(true)) {
                                imt imtVar = csqVar.a;
                                imv imvVarA = imw.a();
                                imvVarA.c(csqVar.c);
                                imvVarA.a = "CamcorderTS";
                                imvVarA.d(new Runnable() { // from class: csp
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i) {
                                            case 0:
                                                csqVar.e.fB(false);
                                                break;
                                            default:
                                                csqVar.e.fB(true);
                                                break;
                                        }
                                    }
                                });
                                final int i2 = 0;
                                imvVarA.e(new Runnable() { // from class: csp
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i2) {
                                            case 0:
                                                csqVar.e.fB(false);
                                                break;
                                            default:
                                                csqVar.e.fB(true);
                                                break;
                                        }
                                    }
                                });
                                imvVarA.f(csqVar.b);
                                imtVar.d(imvVarA.a());
                            }
                        }
                        return plk.V(true);
                    }
                };
            case 12:
                return new ctd((hkr) this.a.get(), ((hkh) this.b).get());
            case 13:
                return new cvh(jwg.a(), (hsh) this.b.get(), (ljf) this.a.get());
            case 14:
                final qkg qkgVar3 = this.a;
                final qkg qkgVar4 = this.b;
                return new jqn() { // from class: cwp
                    @Override // defpackage.jqn
                    public final void a() {
                        qkg qkgVar5 = qkgVar4;
                        qkg qkgVar6 = qkgVar3;
                        Stream stream = Collection.EL.stream(((pyw) qkgVar5).get());
                        final cvo cvoVar = (cvo) qkgVar6.get();
                        cvoVar.getClass();
                        stream.forEach(new Consumer() { // from class: cwq
                            @Override // j$.util.function.Consumer
                            public final void accept(Object obj) {
                                cvoVar.c.add((cwh) obj);
                            }

                            @Override // j$.util.function.Consumer
                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer.CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                };
            case 15:
                nox noxVar = ((hzj) this.a).get();
                Executor executor = (Executor) this.b.get();
                hxj hxjVar = (hxj) noxVar.a.get();
                hxjVar.getClass();
                executor.getClass();
                return new hzi(hxjVar, executor);
            case 16:
                return new ljl(plk.M((Executor) this.a.get()), (ljf) this.b.get(), "cvkTracingExecutor");
            case 17:
                return new dah((gvb) this.a.get(), ((etg) this.b).get());
            case 18:
                return new dbo((dbe) this.b.get(), (ddf) this.a.get());
            case 19:
                return new dfl(((emp) this.b).a(), (ddf) this.a.get());
            default:
                ddf ddfVar = (ddf) this.b.get();
                ddi ddiVar = ddl.a;
                ddfVar.d();
                return new fw();
        }
    }
}
