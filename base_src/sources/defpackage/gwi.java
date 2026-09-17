package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class gwi implements gvr {
    private final ljf a;
    private final lis b;
    private final lco c;
    private final lco d;
    private final jth e;
    private final boolean f;
    private final int g;
    private final boolean h;
    private final ojc i;
    private final gvm j;
    private final imy k;

    public gwi(ljf ljfVar, lir lirVar, imy imyVar, lco lcoVar, lco lcoVar2, jth jthVar, ddf ddfVar, ghx ghxVar, qkg qkgVar, gvm gvmVar, lap lapVar, byte[] bArr) {
        ojc ojcVarI;
        this.a = ljfVar;
        lis lisVarA = lirVar.a("PckConv3A");
        this.b = lisVarA;
        this.k = imyVar;
        this.c = lcoVar;
        this.d = lcoVar2;
        this.e = jthVar;
        this.f = ddfVar.k(ddm.an);
        this.g = ((Integer) ddfVar.a(ddm.w).e(3000)).intValue();
        boolean zK = ddfVar.k(dde.h);
        this.h = zK;
        this.j = gvmVar;
        if (zK) {
            dyx dyxVar = (dyx) qkgVar.get();
            String strValueOf = String.valueOf(ghxVar.k());
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 7);
            sb.append("conv3A-");
            sb.append(strValueOf);
            bns bnsVar = new bns(ghxVar, dyxVar, lisVarA, sb.toString(), ((Float) ddfVar.g(dde.i).e(Float.valueOf(300.0f))).floatValue());
            lapVar.c(bnsVar);
            bnsVar.b();
            ojcVarI = ojc.i(bnsVar);
        } else {
            ojcVarI = oih.a;
        }
        this.i = ojcVarI;
    }

    private final boolean b(int i) {
        if (i == 0) {
            throw null;
        }
        boolean z = i == 4 || i == 2;
        return z && ((hte) this.c.fA()).equals(hte.ON_LOCKED);
    }

    @Override // defpackage.gvr
    public final ggx a(lng lngVar, lnv lnvVar) {
        long j;
        ojc ojcVarI;
        lnu lnuVarA = lnv.a();
        lnuVarA.c(((Boolean) ((lce) this.k.a).d).booleanValue() ? 1 : lnvVar.c);
        lnuVarA.b(lnvVar.b);
        lnuVarA.e(lnvVar.d);
        lnuVarA.d(lnvVar.a);
        lnv lnvVarA = lnuVarA.a();
        try {
            try {
                this.b.b("Acquiring 3A lock.");
                this.a.e("3A");
                boolean z = this.e.a((String) this.d.fA()).F() && lnvVarA.c != 1;
                long j2 = -1;
                if (z) {
                    int i = lnvVarA.c;
                    lmp lmpVarA = lngVar.a();
                    if (i == 3) {
                        this.b.b("Switching AF Mode to AUTO for AF requirement CONVERGED");
                        ((lrs) lmpVarA).b = 1;
                        ojcVarI = ojc.i((lmw) lngVar.b(((lrs) lmpVarA).d()).get());
                    } else if (b(i)) {
                        this.b.b("AF was in implicit manual mode, changing AF to continuous mode and locking immediately.");
                        lmp lmpVarA2 = lngVar.a();
                        ((lrs) lmpVarA2).b = 4;
                        ojcVarI = ojc.i((lmw) lngVar.f(((lrs) lmpVarA2).d()).get());
                    } else {
                        ojcVarI = oih.a;
                    }
                    if (ojcVarI.g()) {
                        j2 = ((lmw) ojcVarI.c()).c;
                    }
                }
                boolean z2 = z && !b(lnvVarA.c);
                int i2 = lnvVarA.b;
                boolean z3 = i2 == 3 || i2 == 4;
                boolean z4 = lnvVarA.d == 3;
                if (z2 || z3 || z4) {
                    lis lisVar = this.b;
                    StringBuilder sb = new StringBuilder(88);
                    sb.append("triggering af and locking ae/awb as needed, afTrigger=");
                    sb.append(z2);
                    sb.append(", lockAe=");
                    sb.append(z3);
                    sb.append(", lockAwb=");
                    sb.append(z4);
                    lisVar.b(sb.toString());
                    lnu lnuVarA2 = lnv.a();
                    lnuVarA2.c(z2 ? lnvVarA.c : 1);
                    lnuVarA2.b(z3 ? lnvVarA.b : 1);
                    lnuVarA2.e(z4 ? lnvVarA.d : 1);
                    int i3 = lnvVarA.b;
                    boolean z5 = i3 == 3;
                    Long l = null;
                    if (i3 == 0) {
                        throw null;
                    }
                    lnuVarA2.d(z5);
                    pht phtVarC = ((lqb) lngVar).a.c(lnuVarA2.a(), false);
                    int i4 = lnvVarA.c;
                    if (this.h && this.i.g() && i4 == 2) {
                        if (((bns) this.i.c()).c()) {
                            this.b.b("Too much motion. Not safe to skip Af lock.");
                        } else {
                            gvq gvqVar = new gvq();
                            this.b.b("Waiting for Af to converge.");
                            this.j.n(gvqVar);
                            synchronized (gvqVar) {
                                while (gvqVar.a) {
                                    gvqVar.wait();
                                }
                            }
                            Long l2 = gvqVar.b;
                            this.b.b("Done waiting for Af to converge.");
                            this.j.o(gvqVar);
                            l = l2;
                        }
                    }
                    if (l != null) {
                        long jLongValue = l.longValue();
                        lis lisVar2 = this.b;
                        StringBuilder sb2 = new StringBuilder(77);
                        sb2.append("Safe to skip waiting for AF lock. converged frame number=");
                        sb2.append(jLongValue);
                        lisVar2.b(sb2.toString());
                        j = jLongValue;
                    } else if (this.f && z2 && lnvVarA.c == 2) {
                        try {
                            j = ((lmw) phtVarC.get(this.g, TimeUnit.MILLISECONDS)).c;
                        } catch (TimeoutException e) {
                            lis lisVar3 = this.b;
                            int i5 = this.g;
                            StringBuilder sb3 = new StringBuilder(87);
                            sb3.append("Timeout of ");
                            sb3.append(i5);
                            sb3.append("ms caught when waiting for AF lock. Locking AF again immediately.");
                            lisVar3.b(sb3.toString());
                            lmp lmpVarA3 = lngVar.a();
                            ((lrs) lmpVarA3).b = 0;
                            lngVar.f(((lrs) lmpVarA3).d());
                            lmp lmpVarA4 = lngVar.a();
                            ((lrs) lmpVarA4).b = 4;
                            j = ((lmw) lngVar.f(((lrs) lmpVarA4).d()).get()).c;
                        }
                    } else {
                        j = ((lmw) phtVarC.get()).c;
                    }
                } else {
                    j = j2;
                }
                lis lisVar4 = this.b;
                StringBuilder sb4 = new StringBuilder(46);
                sb4.append("3A lock acquired at frame ");
                sb4.append(j);
                lisVar4.b(sb4.toString());
                gwj gwjVar = new gwj(lngVar, j, z, z3, z4);
                this.a.f();
                return gwjVar;
            } catch (Throwable th) {
                this.a.f();
                throw th;
            }
        } catch (CancellationException | ExecutionException e2) {
            throw new InterruptedException(e2.getMessage());
        }
    }
}
