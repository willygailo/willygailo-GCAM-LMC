package defpackage;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class dlf implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final /* synthetic */ int e;

    public dlf(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i) {
        this.e = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    public dlf(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, byte[] bArr) {
        this.e = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
        this.d = qkgVar4;
    }

    public dlf(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, byte[] bArr, byte[] bArr2) {
        this.e = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
        this.d = qkgVar4;
    }

    public dlf(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, char[] cArr) {
        this.e = i;
        this.c = qkgVar;
        this.d = qkgVar2;
        this.b = qkgVar3;
        this.a = qkgVar4;
    }

    public dlf(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, float[] fArr) {
        this.e = i;
        this.d = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
        this.a = qkgVar4;
    }

    public dlf(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, int[] iArr) {
        this.e = i;
        this.d = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
        this.c = qkgVar4;
    }

    public dlf(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, short[] sArr) {
        this.e = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.d = qkgVar3;
        this.c = qkgVar4;
    }

    public dlf(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, boolean[] zArr) {
        this.e = i;
        this.d = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
        this.c = qkgVar4;
    }

    public dlf(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, byte[][] bArr) {
        this.e = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.d = qkgVar3;
        this.a = qkgVar4;
    }

    public dlf(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, char[][] cArr) {
        this.e = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
        this.d = qkgVar4;
    }

    public dlf(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, float[][] fArr) {
        this.e = i;
        this.d = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.a = qkgVar4;
    }

    public dlf(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, int[][] iArr) {
        this.e = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
        this.d = qkgVar4;
    }

    public dlf(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, short[][] sArr) {
        this.e = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
        this.d = qkgVar4;
    }

    public dlf(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, boolean[][] zArr) {
        this.e = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.d = qkgVar3;
        this.c = qkgVar4;
    }

    public dlf(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, byte[][][] bArr) {
        this.e = i;
        this.d = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
        this.b = qkgVar4;
    }

    public dlf(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, char[][][] cArr) {
        this.e = i;
        this.b = qkgVar;
        this.d = qkgVar2;
        this.a = qkgVar3;
        this.c = qkgVar4;
    }

    public dlf(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, float[][][] fArr) {
        this.e = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
        this.d = qkgVar4;
    }

    public dlf(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, int[][][] iArr) {
        this.e = i;
        this.b = qkgVar;
        this.d = qkgVar2;
        this.c = qkgVar3;
        this.a = qkgVar4;
    }

    public dlf(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, short[][][] sArr) {
        this.e = i;
        this.b = qkgVar;
        this.d = qkgVar2;
        this.a = qkgVar3;
        this.c = qkgVar4;
    }

    public dlf(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, boolean[][][] zArr) {
        this.e = i;
        this.d = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
        this.c = qkgVar4;
    }

    public static dlf a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new dlf(qkgVar, qkgVar2, qkgVar3, qkgVar4, 6, (float[]) null);
    }

    public static dlf b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new dlf(qkgVar, qkgVar2, qkgVar3, qkgVar4, 7, (byte[][]) null);
    }

    public static dlf c(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new dlf(qkgVar, qkgVar2, qkgVar3, qkgVar4, 8, (char[][]) null);
    }

    public static dlf d(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new dlf(qkgVar, qkgVar2, qkgVar3, qkgVar4, 9, (short[][]) null);
    }

    public static dlf e(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new dlf(qkgVar, qkgVar2, qkgVar3, qkgVar4, 10, (int[][]) null);
    }

    public static dlf f(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new dlf(qkgVar, qkgVar2, qkgVar3, qkgVar4, 11, (boolean[][]) null);
    }

    public static dlf g(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new dlf(qkgVar, qkgVar2, qkgVar3, qkgVar4, 13, (byte[][][]) null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        Object objH;
        Object objH2;
        switch (this.e) {
            case 0:
                btg btgVar = (btg) this.a.get();
                ((dlb) this.b).get();
                fhv fhvVar = ((etf) this.c).get();
                lar larVar = (lar) this.d.get();
                dle dleVar = new dle(btgVar);
                enl.f(larVar, fhvVar, dleVar);
                return dleVar;
            case 1:
                return dgz.a((lda) this.a.get(), ((etg) this.c).get(), (dha) this.b.get(), (jlb) this.d.get());
            case 2:
                Object objH3 = (((Boolean) this.c.get()).booleanValue() && ((Boolean) this.d.get()).booleanValue()) ? ope.H(jwv.a((jwu) this.a.get(), (lco) this.b.get(), jwt.FACE_BEAUTIFICATION)) : orx.a;
                qmd.ae(objH3);
                return objH3;
            case 3:
                lco lcoVarB = ((eej) this.b).b();
                boolean zBooleanValue = ((Boolean) this.a.get()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) this.d.get()).booleanValue();
                dom domVar = new dom((Executor) this.c.get());
                domVar.g(lcv.j(lcoVarB, new doo(zBooleanValue, zBooleanValue2, 1)));
                return domVar;
            case 4:
                lda ldaVar = (lda) this.d.get();
                boolean zBooleanValue3 = ((Boolean) this.a.get()).booleanValue();
                boolean zBooleanValue4 = ((Boolean) this.b.get()).booleanValue();
                dom domVar2 = new dom((Executor) this.c.get());
                domVar2.g(lcv.j(ldaVar, new doo(zBooleanValue3, zBooleanValue4, 3)));
                return domVar2;
            case 5:
                final lda ldaVar2 = (lda) this.d.get();
                final dqe dqeVar = (dqe) this.b.get();
                final cvo cvoVar = (cvo) this.a.get();
                final bqg bqgVar = ((etg) this.c).get();
                return new iho() { // from class: dqb
                    @Override // java.lang.Runnable
                    public final void run() {
                        bqg bqgVar2 = bqgVar;
                        lda ldaVar3 = ldaVar2;
                        final dqe dqeVar2 = dqeVar;
                        cvo cvoVar2 = cvoVar;
                        lap lapVarI = bqgVar2.i();
                        final AtomicReference atomicReference = dqeVar2.c;
                        lapVarI.c(ldaVar3.a(new lij() { // from class: dqd
                            @Override // defpackage.lij
                            public final void fB(Object obj) {
                                atomicReference.set((jrl) obj);
                            }
                        }, pgr.INSTANCE));
                        bqgVar2.i().c(cvoVar2.a(new lij() { // from class: dqc
                            @Override // defpackage.lij
                            public final void fB(Object obj) {
                                dqeVar2.b.set(((cwi) obj).a());
                            }
                        }, pgr.INSTANCE));
                    }
                };
            case 6:
                Set setA = dqg.a((ddf) this.d.get(), this.c, this.b, this.a);
                qmd.ae(setA);
                return setA;
            case 7:
                return new dqo((Executor) this.c.get(), (ojc) this.b.get(), (ojc) this.d.get(), ((pyw) this.a).get(), dln.c());
            case 8:
                ojc ojcVar = (ojc) this.c.get();
                qkg qkgVar = this.a;
                qkg qkgVar2 = this.b;
                qkg qkgVar3 = this.d;
                if (ojcVar.g()) {
                    try {
                        lap lapVar = (lap) qkgVar2.get();
                        dvt dvtVar = new dvt((mrp) qkgVar.get(), (dve) ojcVar.c(), TimeUnit.MICROSECONDS.convert(33333L, TimeUnit.MICROSECONDS), (ScheduledExecutorService) qkgVar3.get());
                        lapVar.c(dvtVar);
                        return ojc.i(dvtVar);
                    } catch (RuntimeException e) {
                        ((oug) ((oug) ((oug) dvh.a.b()).h(e)).G((char) 940)).o("Error trying to initialize audio");
                    }
                }
                return oih.a;
            case 9:
                Integer num = (Integer) this.b.get();
                Boolean bool = ((dvr) this.c).get();
                qkg qkgVar4 = this.a;
                ljf ljfVar = (ljf) this.d.get();
                if (!bool.booleanValue() || num.intValue() >= 0) {
                    objH = orx.a;
                } else {
                    try {
                        ljfVar.e("FRAMESTORE_MetadataModule#provideRequestTransformer");
                        objH = ope.H((mip) qkgVar4.get());
                        ljfVar.f();
                    } catch (Throwable th) {
                        ljfVar.f();
                        throw th;
                    }
                }
                qmd.ae(objH);
                return objH;
            case 10:
                Integer num2 = (Integer) this.b.get();
                Boolean bool2 = ((dvr) this.c).get();
                qkg qkgVar5 = this.a;
                ljf ljfVar2 = (ljf) this.d.get();
                if (!bool2.booleanValue() || num2.intValue() < 0) {
                    objH2 = orx.a;
                } else {
                    try {
                        ljfVar2.e("FRAMESTORE_MetadataModule#provideRequestListener");
                        objH2 = ope.H((mip) qkgVar5.get());
                        ljfVar2.f();
                    } catch (Throwable th2) {
                        ljfVar2.f();
                        throw th2;
                    }
                }
                qmd.ae(objH2);
                return objH2;
            case 11:
                return new dvx((dvp) this.b.get(), ((brh) this.a).get(), (jth) this.d.get(), (Executor) this.c.get());
            case 12:
                ikp ikpVar = ((ikx) this.d).get();
                dxp dxpVar = (dxp) this.b.get();
                return new dww(ikpVar, dxpVar, (dwu) this.a.get(), dug.a());
            case 13:
                return new dyt((Integer) this.d.get(), (Executor) this.c.get(), ((pyw) this.a).get(), (Set) this.b.get());
            case 14:
                return new eca((ddf) this.b.get(), (ead) this.d.get(), this.a, dug.a(), (lzi) this.c.get());
            case 15:
                return new egg(((liq) this.b).get(), (ljf) this.d.get(), this.a, ((emp) this.c).a());
            case 16:
                return new ejl((egz) this.b.get(), ((eve) this.d).get(), ((eme) this.c).get(), ((jnw) this.a).get());
            case 17:
                return new eja((eij) this.d.get(), (ehj) this.a.get(), (ehw) this.b.get(), ((emd) this.c).get());
            case 18:
                return new enx(((emo) this.c).get(), ((emv) this.b).get(), (ddf) this.a.get(), (mos) this.d.get(), null, null);
            case 19:
                return new epw(((emd) this.a).get(), (ius) this.c.get(), (ddf) this.b.get(), (lar) this.d.get());
            default:
                fxk fxkVar = (fxk) this.a.get();
                qkg qkgVar6 = this.b;
                boolean zBooleanValue5 = ((bpk) this.c).a().booleanValue();
                lje ljeVar = new lje((ljf) this.d.get(), "PortraitModeModule#providePortraitAgent");
                try {
                    Object objI = zBooleanValue5 ? ojc.i(new fxj(fxkVar, qkgVar6)) : oih.a;
                    ljeVar.close();
                    return objI;
                } catch (Throwable th3) {
                    try {
                        ljeVar.close();
                        break;
                    } catch (Throwable th4) {
                    }
                    throw th3;
                }
        }
    }
}
