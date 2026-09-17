package defpackage;

import android.media.MediaFormat;
import j$.util.Collection;
import j$.util.function.Consumer;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class fci implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final /* synthetic */ int e;

    public fci(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i) {
        this.e = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    public fci(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, byte[] bArr) {
        this.e = i;
        this.b = qkgVar;
        this.d = qkgVar2;
        this.a = qkgVar3;
        this.c = qkgVar4;
    }

    public fci(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, char[] cArr) {
        this.e = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
        this.d = qkgVar4;
    }

    public fci(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, float[] fArr) {
        this.e = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.d = qkgVar3;
        this.b = qkgVar4;
    }

    public fci(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, int[] iArr) {
        this.e = i;
        this.d = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
        this.c = qkgVar4;
    }

    public fci(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, short[] sArr) {
        this.e = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    public fci(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, boolean[] zArr) {
        this.e = i;
        this.c = qkgVar;
        this.d = qkgVar2;
        this.b = qkgVar3;
        this.a = qkgVar4;
    }

    public fci(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, byte[][] bArr) {
        this.e = i;
        this.d = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
        this.b = qkgVar4;
    }

    public fci(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, char[][] cArr) {
        this.e = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.d = qkgVar3;
        this.c = qkgVar4;
    }

    public fci(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, float[][] fArr) {
        this.e = i;
        this.d = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.a = qkgVar4;
    }

    public fci(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, int[][] iArr) {
        this.e = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.d = qkgVar3;
        this.a = qkgVar4;
    }

    public fci(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, short[][] sArr) {
        this.e = i;
        this.a = qkgVar;
        this.d = qkgVar2;
        this.c = qkgVar3;
        this.b = qkgVar4;
    }

    public fci(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, boolean[][] zArr) {
        this.e = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.d = qkgVar3;
        this.a = qkgVar4;
    }

    public fci(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, byte[][][] bArr) {
        this.e = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.d = qkgVar3;
        this.c = qkgVar4;
    }

    public fci(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, char[][][] cArr) {
        this.e = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.d = qkgVar3;
        this.a = qkgVar4;
    }

    public fci(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, float[][][] fArr) {
        this.e = i;
        this.b = qkgVar;
        this.d = qkgVar2;
        this.a = qkgVar3;
        this.c = qkgVar4;
    }

    public fci(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, int[][][] iArr) {
        this.e = i;
        this.c = qkgVar;
        this.d = qkgVar2;
        this.a = qkgVar3;
        this.b = qkgVar4;
    }

    public fci(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, short[][][] sArr) {
        this.e = i;
        this.c = qkgVar;
        this.d = qkgVar2;
        this.b = qkgVar3;
        this.a = qkgVar4;
    }

    public fci(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, boolean[][][] zArr) {
        this.e = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.d = qkgVar3;
        this.a = qkgVar4;
    }

    public static bvv a(final Executor executor, final Executor executor2, final qkg qkgVar, final qkg qkgVar2) {
        return aas.f(new bvv() { // from class: gnd
            @Override // defpackage.bvv
            public final /* synthetic */ String c() {
                return aas.g(this);
            }

            @Override // defpackage.bvv
            public final pht fz() {
                final qkg qkgVar3 = qkgVar2;
                final qkg qkgVar4 = qkgVar;
                final Executor executor3 = executor2;
                return plk.aa(new pgj() { // from class: gne
                    @Override // defpackage.pgj
                    public final pht a() {
                        qkg qkgVar5 = qkgVar3;
                        qkg qkgVar6 = qkgVar4;
                        final Executor executor4 = executor3;
                        Stream streamConcat = Stream.CC.concat(Collection.EL.stream((Set) ((pyt) qkgVar5).a), Collection.EL.stream(((pyw) qkgVar6).get()).map(cgw.o));
                        executor4.getClass();
                        streamConcat.forEach(new Consumer() { // from class: gnh
                            @Override // j$.util.function.Consumer
                            public final void accept(Object obj) {
                                executor4.execute((Runnable) obj);
                            }

                            @Override // j$.util.function.Consumer
                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer.CC.$default$andThen(this, consumer);
                            }
                        });
                        return plk.V(true);
                    }
                }, executor);
            }
        }, "poststartup");
    }

    public static fci b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new fci(qkgVar, qkgVar2, qkgVar3, qkgVar4, 5, (boolean[]) null);
    }

    public static fci c(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new fci(qkgVar, qkgVar2, qkgVar3, qkgVar4, 6);
    }

    public static fci d(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new fci(qkgVar, qkgVar2, qkgVar3, qkgVar4, 7);
    }

    public static fci e(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new fci(qkgVar, qkgVar2, qkgVar3, qkgVar4, 14, (float[][]) null);
    }

    public static fci f(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new fci(qkgVar, qkgVar2, qkgVar3, qkgVar4, 16, (char[][][]) null);
    }

    public static fci g(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new fci(qkgVar, qkgVar2, qkgVar3, qkgVar4, 17, (short[][][]) null);
    }

    public static fci h(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new fci(qkgVar, qkgVar2, qkgVar3, qkgVar4, 18, (int[][][]) null);
    }

    public static fci i(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new fci(qkgVar, qkgVar2, qkgVar3, qkgVar4, 20, (float[][][]) null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.e) {
            case 0:
                return new fch(this.a, this.b, this.c, ((jrj) this.d).get());
            case 1:
                ojc ojcVarA = ((hlj) this.b).a();
                fxk fxkVar = (fxk) this.d.get();
                qkg qkgVar = this.a;
                lje ljeVar = new lje((ljf) this.c.get(), "McFlyModeModule#provideMcFlyAgent");
                try {
                    Object objI = ojcVarA.g() ? ojc.i(new fxj(fxkVar, qkgVar)) : oih.a;
                    ljeVar.close();
                    return objI;
                } catch (Throwable th) {
                    try {
                        ljeVar.close();
                        break;
                    } catch (Throwable th2) {
                    }
                    throw th;
                }
            case 2:
                jjj jjjVar = ((jjk) this.c).get();
                lar larVar = (lar) this.b.get();
                bqg bqgVar = ((etg) this.a).get();
                enl.f(larVar, ((etj) this.d).get(), jjjVar);
                bqgVar.i().c(jjjVar);
                return jjjVar;
            case 3:
                return new fky(((emn) this.b).get(), (fvv) this.a.get(), (huf) this.c.get(), (jhd) this.d.get());
            case 4:
                return new fpe(((emp) this.d).a(), ((ikv) this.b).get(), (ddf) this.a.get(), (fjs) this.c.get());
            case 5:
                return (((Boolean) this.b.get()).booleanValue() && ((Boolean) this.a.get()).booleanValue() && ((gjf) this.c).get().a) ? ((evv) this.d).a() : oih.a;
            case 6:
                ddf ddfVar = (ddf) this.a.get();
                ((ftf) this.b).get();
                gsf gsfVar = ((gsi) this.c).get();
                double dAbs = Math.abs(gsfVar.b.d().a() - dvv.d.a());
                lig ligVar = dAbs < 0.05d ? dvv.d : dvv.c;
                boolean zK = ddfVar.k(dds.N);
                boolean zK2 = ddfVar.k(dds.O);
                boolean zK3 = ddfVar.k(ddl.N);
                boolean zK4 = ddfVar.k(dds.P);
                if (zK) {
                    ligVar = dAbs < 0.05d ? dvv.f : dvv.e;
                }
                MediaFormat mediaFormatG = fvq.g(ligVar, true == zK2 ? 38000000 : 19000000, 3600.0f, zK3, zK4);
                qmd.ae(mediaFormatG);
                return mediaFormatG;
            case 7:
                ddf ddfVar2 = (ddf) this.a.get();
                ((ftf) this.b).get();
                gsf gsfVar2 = ((gsi) this.c).get();
                lig ligVar2 = dvv.a;
                lig ligVar3 = ((double) Math.abs(gsfVar2.b.d().a() - dvv.d.a())) < 0.05d ? dvv.d : dvv.c;
                ddg ddgVar = dds.a;
                ddfVar2.d();
                ddfVar2.d();
                MediaFormat mediaFormatG2 = fvq.g(ligVar3, 19000000, 3600.0f, ddfVar2.k(ddl.N), ddfVar2.k(dds.P));
                qmd.ae(mediaFormatG2);
                return mediaFormatG2;
            case 8:
                ddf ddfVar3 = (ddf) this.a.get();
                final hrx hrxVar = (hrx) this.c.get();
                final bqg bqgVar2 = ((etg) this.d).get();
                final qkg qkgVar2 = this.b;
                Object objH = ddfVar3.k(ddr.s) ? ope.H(new iho() { // from class: fta
                    @Override // java.lang.Runnable
                    public final void run() {
                        qkg qkgVar3 = qkgVar2;
                        final hrx hrxVar2 = hrxVar;
                        bqg bqgVar3 = bqgVar2;
                        final fnc fncVar = (fnc) qkgVar3.get();
                        hrxVar2.a(fncVar);
                        if (fncVar.c.g()) {
                            ((idc) fncVar.c.c()).a(fncVar.e);
                            fncVar.a.set(true);
                        }
                        bqgVar3.i().c(new lie() { // from class: ftb
                            @Override // defpackage.lie, java.lang.AutoCloseable
                            public final void close() {
                                hrx hrxVar3 = hrxVar2;
                                fnc fncVar2 = fncVar;
                                hrxVar3.i(fncVar2);
                                if (fncVar2.c.g()) {
                                    fncVar2.a.set(false);
                                    ((idc) fncVar2.c.c()).j(fncVar2.e);
                                }
                            }
                        });
                    }
                }) : orx.a;
                qmd.ae(objH);
                return objH;
            case 9:
                qkg qkgVar3 = this.d;
                qkg qkgVar4 = this.c;
                gxm gxmVar = ((djc) this.a).get();
                ddf ddfVar4 = (ddf) this.b.get();
                HashSet hashSet = new HashSet();
                if (gxmVar.c()) {
                    hashSet.add((iho) qkgVar3.get());
                }
                ddi ddiVar = ddr.a;
                ddfVar4.b();
                if (ddfVar4.k(ddr.x)) {
                    hashSet.add((iho) qkgVar4.get());
                }
                return hashSet;
            case 10:
                Object obj = this.b.get();
                ((dsa) this.a).a();
                final dqv dqvVarA = ((dsa) this.d).a();
                drp drpVarB = dru.b((dsz) this.c.get());
                drpVarB.c = new dqv() { // from class: fts
                    @Override // defpackage.dqv
                    public final boolean e() {
                        return ((dqz) dqvVarA).a;
                    }
                };
                drpVarB.c((ftr) obj);
                return drpVarB.a();
            case 11:
                return new fui(((cjc) this.a).a(), ((fuf) this.d).get(), (fpo) this.c.get(), (nvb) this.b.get(), null, null);
            case 12:
                return new fxc((lwf) this.c.get(), ((emj) this.b).get(), (dkm) this.d.get(), (ddf) this.a.get());
            case 13:
                qkg qkgVar5 = this.b;
                qkg qkgVar6 = this.c;
                bqg bqgVar3 = ((etg) this.d).get();
                buf bufVar = ((ddf) this.a.get()).k(dcu.J) ? (buf) qkgVar5.get() : (buf) qkgVar6.get();
                bqgVar3.i().c(bufVar);
                return bufVar;
            case 14:
                return ((gah) this.d).get().a(((pyv) pyv.b(this.b)).get(), ((gcd) this.c).get(), (gbb) this.a.get());
            case 15:
                ExecutorService executorServiceBJ = mip.bJ("ImageSaver");
                qmd.ae(executorServiceBJ);
                return new gkw(executorServiceBJ, (jtx) this.d.get(), ((gkd) this.a).get(), ((hoi) this.b).get(), (ljf) this.c.get());
            case 16:
                return a((Executor) this.b.get(), (Executor) this.c.get(), this.d, this.a);
            case 17:
                return new gpn((lco) this.c.get(), (lco) this.d.get(), (ead) this.b.get(), (ddf) this.a.get());
            case 18:
                hen henVar = (hen) this.c.get();
                Object obj2 = this.d.get();
                Executor executor = (Executor) this.a.get();
                lap lapVar = (lap) this.b.get();
                gpn gpnVar = (gpn) obj2;
                if (gpnVar.a || gpnVar.b) {
                    lapVar.c(lci.c(gpnVar).a(new gpq(henVar), plk.M(executor)));
                }
                qmd.ae(henVar);
                return henVar;
            case 19:
                return ((haa) this.c).get().a(((gzr) this.b).get().a(((gpr) this.d).get(), new gxp((ddf) this.a.get())));
            default:
                lir lirVar = ((dgb) this.b).get();
                lco lcoVar = (lco) this.d.get();
                gzh gzhVar = ((gzi) this.a).get();
                ham hamVar = ((han) this.c).get();
                ArrayList arrayList = new ArrayList(3);
                if (kcz.j != null) {
                    arrayList.add(mip.be(kcz.j, 1));
                }
                if (kcy.a != null) {
                    arrayList.add(mip.be(kcy.a, 1));
                }
                hau hauVar = new hau(gzhVar.a, gzhVar.b, gzhVar.d, gzhVar.c, fcy.j(arrayList));
                goy goyVarA = hamVar.a();
                return new gom(lirVar, new gol(lcoVar, hauVar, goyVarA, hauVar, goyVarA, hauVar, goyVarA));
        }
    }
}
