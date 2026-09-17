package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.android.apps.camera.bottombar.R;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class lrk implements lie {
    private final lrl b;
    private final lrg c;
    private final lol g;
    private final boolean h;
    private final lis i;
    private final mjg j;
    private pht d = pih.f();
    private final pht e = pih.f();
    private pht f = pih.f();
    public final ExecutorService a = mip.bM("Sess3AEx");

    public lrk(lol lolVar, lvp lvpVar, lis lisVar, lnf lnfVar, lrl lrlVar, lrg lrgVar) {
        this.c = lrgVar;
        this.b = lrlVar;
        this.g = lolVar;
        this.h = lvpVar.F();
        this.i = lisVar.a("SessCtrl3A");
        this.j = new mjg(lnfVar.k, lnfVar.l);
    }

    private static final boolean i(Integer num) {
        return num.intValue() == 4 || num.intValue() == 3;
    }

    private static final boolean j(lrt lrtVar, lmq lmqVar) {
        return !lrtVar.b().equals(lmqVar.b());
    }

    private static final boolean k(lrt lrtVar, lmq lmqVar) {
        return lrtVar.b.booleanValue() && lrtVar.a().equals(lmqVar.a()) && Arrays.equals(lrtVar.e, ((lrt) lmqVar).e);
    }

    private static final boolean l(lrt lrtVar, lmq lmqVar) {
        return lrtVar.c.booleanValue() && lrtVar.c().equals(lmqVar.c()) && Arrays.equals(lrtVar.f, ((lrt) lmqVar).f);
    }

    final synchronized lrs a() {
        return this.c.b();
    }

    /* JADX WARN: Code duplicated, block: B:65:0x01b8 A[Catch: all -> 0x0173, TryCatch #1 {all -> 0x0173, blocks: (B:49:0x0101, B:52:0x0155, B:55:0x0168, B:59:0x0178, B:60:0x0196, B:62:0x01b2, B:74:0x020c, B:76:0x0210, B:82:0x0223, B:88:0x0232, B:93:0x023f, B:68:0x01d9, B:70:0x01df, B:72:0x01eb, B:73:0x01f5, B:65:0x01b8), top: B:117:0x0101 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01d9 A[Catch: all -> 0x0173, TryCatch #1 {all -> 0x0173, blocks: (B:49:0x0101, B:52:0x0155, B:55:0x0168, B:59:0x0178, B:60:0x0196, B:62:0x01b2, B:74:0x020c, B:76:0x0210, B:82:0x0223, B:88:0x0232, B:93:0x023f, B:68:0x01d9, B:70:0x01df, B:72:0x01eb, B:73:0x01f5, B:65:0x01b8), top: B:117:0x0101 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01df A[Catch: all -> 0x0173, TryCatch #1 {all -> 0x0173, blocks: (B:49:0x0101, B:52:0x0155, B:55:0x0168, B:59:0x0178, B:60:0x0196, B:62:0x01b2, B:74:0x020c, B:76:0x0210, B:82:0x0223, B:88:0x0232, B:93:0x023f, B:68:0x01d9, B:70:0x01df, B:72:0x01eb, B:73:0x01f5, B:65:0x01b8), top: B:117:0x0101 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01eb A[Catch: all -> 0x0173, TryCatch #1 {all -> 0x0173, blocks: (B:49:0x0101, B:52:0x0155, B:55:0x0168, B:59:0x0178, B:60:0x0196, B:62:0x01b2, B:74:0x020c, B:76:0x0210, B:82:0x0223, B:88:0x0232, B:93:0x023f, B:68:0x01d9, B:70:0x01df, B:72:0x01eb, B:73:0x01f5, B:65:0x01b8), top: B:117:0x0101 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0210 A[Catch: all -> 0x0173, TryCatch #1 {all -> 0x0173, blocks: (B:49:0x0101, B:52:0x0155, B:55:0x0168, B:59:0x0178, B:60:0x0196, B:62:0x01b2, B:74:0x020c, B:76:0x0210, B:82:0x0223, B:88:0x0232, B:93:0x023f, B:68:0x01d9, B:70:0x01df, B:72:0x01eb, B:73:0x01f5, B:65:0x01b8), top: B:117:0x0101 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x021a  */
    /* JADX WARN: Code duplicated, block: B:79:0x021c  */
    /* JADX WARN: Code duplicated, block: B:80:0x021e  */
    final synchronized pht b(lnv lnvVar, boolean z) {
        lie lieVar;
        boolean z2;
        lpc lpcVarA;
        lrt lrtVar;
        boolean z3;
        boolean z4;
        boolean z5;
        lis lisVar = this.i;
        String strValueOf = String.valueOf(lnvVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 31);
        sb.append("Call to trigger 3A with Spec : ");
        sb.append(strValueOf);
        lisVar.b(sb.toString());
        try {
            lie lieVarA = this.c.a();
            try {
                this.e.cancel(true);
                boolean z6 = lnvVar.d() && this.h;
                int i = lnvVar.b;
                boolean z7 = i == 4 || i == 3;
                int i2 = lnvVar.d;
                boolean z8 = i2 == 4 || i2 == 3;
                boolean z9 = lnvVar.a;
                if (z7 || z8 || z9) {
                    lis lisVar2 = this.i;
                    StringBuilder sb2 = new StringBuilder(R.styleable.AppCompatTheme_textAppearanceListItemSecondary);
                    sb2.append("Unlocking 3a, deciding params aeRescan = ");
                    sb2.append(z7);
                    sb2.append(", awbRescan = ");
                    sb2.append(z8);
                    sb2.append(", usePreCaptureMeteringSequence = ");
                    sb2.append(z9);
                    lisVar2.b(sb2.toString());
                    boolean z10 = z7 || z9;
                    c(false, z10, z8, false);
                }
                boolean zB = lnvVar.b();
                boolean zC = lnvVar.c();
                lrt lrtVarC = this.c.c();
                lpc lpcVarA2 = lpc.a(this.b.a());
                if (z7 || z9) {
                    lpcVarA2.d(CaptureRequest.CONTROL_AE_LOCK, false);
                }
                if (z8) {
                    lpcVarA2.d(CaptureRequest.CONTROL_AWB_LOCK, false);
                }
                lre lreVarD = this.j.d(lrtVarC, z6, zB, zC);
                lre lreVarC = this.j.c(lrtVarC, false, z7, z8);
                lpc lpcVarA3 = lpc.a(lpcVarA2);
                if (z6) {
                    if (lnvVar.c == 2 || !i(lrtVarC.b())) {
                        lieVar = lieVarA;
                    } else {
                        this.i.b("For continuous AF mode, unlocking AF and waiting to converge.");
                        lrl lrlVar = this.b;
                        lre lreVarC2 = this.j.c(lrtVarC, true, false, false);
                        lpc lpcVarA4 = lpc.a(lpcVarA2);
                        lieVar = lieVarA;
                        try {
                            lpcVarA4.d(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                            lpcVarA4.g(lnb.c(lreVarC2));
                            lrlVar.h(lpcVarA4.b());
                            lpc lpcVarA5 = lpc.a(lpcVarA2);
                            lpcVarA5.d(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                            lpcVarA5.g(lnb.c(lreVarC2));
                            lrlVar.f(lpcVarA5.b());
                            final pht phtVar = lreVarC2.a;
                            this.a.submit(new Callable() { // from class: lrj
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return (lmw) phtVar.get();
                                }
                            }).get();
                            this.i.b("AF converged");
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            try {
                                lieVar.close();
                                throw th2;
                            } catch (Throwable th3) {
                                throw th2;
                            }
                        }
                    }
                    lpcVarA3.d(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                    z2 = true;
                } else {
                    lieVar = lieVarA;
                    lrtVarC = lrtVarC;
                    z2 = false;
                }
                if (!z9) {
                    if (z2) {
                    }
                    lpcVarA2.g(lnb.c(lreVarC));
                    lpcVarA2.g(lnb.c(lreVarD));
                    this.b.f(lpcVarA2.b());
                    if (lnvVar.b != 4 || lnvVar.d == 4 || z9) {
                        this.i.b("Wait for for AE/AWB to converge.");
                        this.a.submit(new lri(lreVarC, 1)).get();
                        this.i.b("AE/AWB converged.");
                    }
                    if (zB || zC) {
                        lpcVarA = lpc.a(lpcVarA2);
                        if (zB) {
                            lpcVarA.d(CaptureRequest.CONTROL_AE_LOCK, true);
                        }
                        if (zC) {
                            lpcVarA.d(CaptureRequest.CONTROL_AWB_LOCK, true);
                        }
                        lpcVarA.g(lnb.c(lreVarD));
                        this.i.b("Sending the request to lock AE/AWB.");
                        this.b.f(lpcVarA.b());
                    }
                    lrg lrgVar = this.c;
                    if (z6) {
                        lrtVar = lrtVarC;
                        z3 = true;
                    } else {
                        lrtVar = lrtVarC;
                        if (lrtVar.a.booleanValue()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    }
                    z4 = zB || lrtVar.b.booleanValue();
                    z5 = zC || lrtVar.c.booleanValue();
                    lrgVar.e(z3, z4, z5, z);
                    pht phtVarI = pgb.i(plk.S(lreVarC.a, lreVarD.a), ewp.f, pgr.INSTANCE);
                    lieVar.close();
                    return phtVarI;
                }
                lpcVarA3.d(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                lpcVarA3.g(lnb.c(lreVarC));
                lpcVarA3.g(lnb.c(lreVarD));
                this.b.h(lpcVarA3.b());
                this.i.b("Trigger request sent.");
                lpcVarA2.g(lnb.c(lreVarC));
                lpcVarA2.g(lnb.c(lreVarD));
                this.b.f(lpcVarA2.b());
                if (lnvVar.b != 4) {
                    this.i.b("Wait for for AE/AWB to converge.");
                    this.a.submit(new lri(lreVarC, 1)).get();
                    this.i.b("AE/AWB converged.");
                } else {
                    this.i.b("Wait for for AE/AWB to converge.");
                    this.a.submit(new lri(lreVarC, 1)).get();
                    this.i.b("AE/AWB converged.");
                }
                if (zB) {
                    lpcVarA = lpc.a(lpcVarA2);
                    if (zB) {
                        lpcVarA.d(CaptureRequest.CONTROL_AE_LOCK, true);
                    }
                    if (zC) {
                        lpcVarA.d(CaptureRequest.CONTROL_AWB_LOCK, true);
                    }
                    lpcVarA.g(lnb.c(lreVarD));
                    this.i.b("Sending the request to lock AE/AWB.");
                    this.b.f(lpcVarA.b());
                } else {
                    lpcVarA = lpc.a(lpcVarA2);
                    if (zB) {
                        lpcVarA.d(CaptureRequest.CONTROL_AE_LOCK, true);
                    }
                    if (zC) {
                        lpcVarA.d(CaptureRequest.CONTROL_AWB_LOCK, true);
                    }
                    lpcVarA.g(lnb.c(lreVarD));
                    this.i.b("Sending the request to lock AE/AWB.");
                    this.b.f(lpcVarA.b());
                }
                lrg lrgVar2 = this.c;
                if (z6) {
                    lrtVar = lrtVarC;
                    if (lrtVar.a.booleanValue()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    lrtVar = lrtVarC;
                    z3 = true;
                }
                if (zB) {
                    z4 = true;
                }
                if (zC) {
                    z5 = true;
                }
                lrgVar2.e(z3, z4, z5, z);
                pht phtVarI2 = pgb.i(plk.S(lreVarC.a, lreVarD.a), ewp.f, pgr.INSTANCE);
                lieVar.close();
                return phtVarI2;
            } catch (Throwable th4) {
                th = th4;
                lieVar = lieVarA;
            }
        } catch (InterruptedException | ExecutionException | RejectedExecutionException e) {
            return plk.U(e);
        }
    }

    final synchronized pht c(boolean z, boolean z2, boolean z3, boolean z4) {
        pht phtVar;
        lie lieVarA = this.c.a();
        try {
            boolean z5 = true;
            this.f.cancel(true);
            if (!z || !this.h) {
                z5 = false;
            }
            lrs lrsVarC = lrs.c(this.c.b().d());
            if (z2) {
                lrsVarC.g = false;
            }
            if (z3) {
                lrsVarC.h = false;
            }
            if (z5) {
                lrsVarC.f = false;
            }
            lrt lrtVarD = lrsVarC.d();
            lpc lpcVarA = lpc.a(this.b.a());
            lrg.g(lpcVarA, lrtVarD);
            lre lreVarB = this.j.b(lrtVarD, z5, z2, z3);
            lpcVarA.g(lnb.c(lreVarB));
            if (z5) {
                lpc lpcVarA2 = lpc.a(lpcVarA);
                lpcVarA2.d(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                this.b.h(lpcVarA2.b());
            }
            this.b.f(lpcVarA.b());
            this.c.e(lrtVarD.a.booleanValue(), lrtVarD.b.booleanValue(), lrtVarD.c.booleanValue(), z4);
            phtVar = lreVarB.a;
            this.f = phtVar;
            lieVarA.close();
        } catch (Throwable th) {
            try {
                lieVarA.close();
            } catch (Throwable th2) {
            }
            throw th;
        }
        return phtVar;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.d.cancel(true);
        this.e.cancel(true);
        this.f.cancel(true);
    }

    final synchronized pht d(lmq lmqVar, boolean z) {
        pht phtVar;
        lie lieVarA = this.c.a();
        try {
            this.d.cancel(true);
            lmq lmqVarA = this.g.a(lmqVar, this.c.c());
            lrt lrtVarD = this.c.b().d();
            boolean zK = k(lrtVarD, lmqVarA);
            boolean zL = l(lrtVarD, lmqVarA);
            boolean zJ = j(lrtVarD, lmqVarA);
            lrs lrsVarB = lrs.b(lmqVarA);
            boolean z2 = false;
            if (lrtVarD.a.booleanValue() && !zJ) {
                z2 = true;
            }
            lrsVarB.f = Boolean.valueOf(z2);
            lrsVarB.g = Boolean.valueOf(zK);
            lrsVarB.h = Boolean.valueOf(zL);
            lrt lrtVarD2 = lrsVarB.d();
            lpc lpcVarA = lpc.a(this.b.a());
            lrg.g(lpcVarA, lrtVarD2);
            lre lreVarB = this.j.b(lrtVarD2, zJ, !zK, true ^ zL);
            lpcVarA.g(lnb.c(lreVarB));
            this.b.f(lpcVarA.b());
            if (zJ) {
                lpcVarA.d(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                lrg.g(lpcVarA, lrtVarD2);
                this.b.h(lpcVarA.b());
            }
            this.c.d(lrtVarD2, z);
            phtVar = lreVarB.a;
            this.d = phtVar;
            lieVarA.close();
        } catch (Throwable th) {
            try {
                lieVarA.close();
            } catch (Throwable th2) {
            }
            throw th;
        }
        return phtVar;
    }

    final synchronized pht e(lmq lmqVar) {
        boolean z;
        pht phtVar;
        lie lieVarA = this.c.a();
        try {
            boolean z2 = this.h;
            lmq lmqVarA = this.g.a(lmqVar, this.c.c());
            lrt lrtVarD = this.c.b().d();
            if (z2) {
                z = true;
            } else {
                z = lrtVarD.a.booleanValue() && !j(lrtVarD, lmqVarA);
            }
            boolean zK = k(lrtVarD, lmqVarA);
            boolean zL = l(lrtVarD, lmqVarA);
            lrs lrsVarB = lrs.b(lmqVarA);
            lrsVarB.f = Boolean.valueOf(z);
            lrsVarB.g = Boolean.valueOf(zK);
            lrsVarB.h = Boolean.valueOf(zL);
            lrt lrtVarD2 = lrsVarB.d();
            lpc lpcVarA = lpc.a(this.b.a());
            lre lreVarD = this.j.d(lmqVarA, z2, false, false);
            lpcVarA.g(lnb.c(lreVarD));
            lrg.g(lpcVarA, lrtVarD2);
            if (z2) {
                lpc lpcVarA2 = lpc.a(lpcVarA);
                lpcVarA2.d(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                this.b.h(lpcVarA2.b());
            }
            this.b.f(lpcVarA.b());
            this.c.d(lrtVarD2, false);
            phtVar = lreVarD.a;
            lieVarA.close();
        } catch (Throwable th) {
            try {
                lieVarA.close();
            } catch (Throwable th2) {
            }
            throw th;
        }
        return phtVar;
    }

    final synchronized void f(lmq lmqVar) {
        h(lmqVar);
    }

    final synchronized void g(lmq lmqVar) {
        lie lieVarA = this.c.a();
        try {
            lmq lmqVarA = this.g.a(lmqVar, this.c.c());
            lrt lrtVarC = this.c.c();
            lrs lrsVarB = lrs.b(lmqVarA);
            lrsVarB.f = lrtVarC.a;
            lrsVarB.g = lrtVarC.b;
            lrsVarB.h = lrtVarC.c;
            lrt lrtVarD = lrsVarB.d();
            lpc lpcVarA = lpc.a(this.b.a());
            lrg.g(lpcVarA, lrtVarD);
            lpcVarA.g(lnb.c(this.j.b(lrtVarD, false, false, false)));
            this.b.h(lpcVarA.b());
            lieVarA.close();
        } catch (Throwable th) {
            try {
                lieVarA.close();
            } catch (Throwable th2) {
            }
            throw th;
        }
    }

    final synchronized void h(lmq lmqVar) {
        lie lieVarA = this.c.a();
        try {
            this.d.cancel(true);
            lmq lmqVarA = this.g.a(lmqVar, this.c.c());
            lrt lrtVarD = this.c.b().d();
            lrs lrsVarB = lrs.b(lmqVarA);
            lrsVarB.f = lrtVarD.a;
            lrsVarB.g = lrtVarD.b;
            lrsVarB.h = lrtVarD.c;
            lrt lrtVarD2 = lrsVarB.d();
            lpc lpcVarA = lpc.a(this.b.a());
            lrg.g(lpcVarA, lrtVarD2);
            boolean zBooleanValue = lrtVarD2.a.booleanValue();
            if (lrtVarD.a.booleanValue() && lmqVarA.b().equals(lrtVarD.b())) {
                zBooleanValue = false;
            }
            int i = (zBooleanValue && i(lrtVarD2.b())) ? 1 : 0;
            lpcVarA.d(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(i));
            mjg mjgVar = this.j;
            boolean zBooleanValue2 = lrtVarD.a.booleanValue();
            boolean zBooleanValue3 = lrtVarD.b.booleanValue();
            boolean zBooleanValue4 = lrtVarD.c.booleanValue();
            HashSet hashSet = new HashSet();
            hashSet.add(mjgVar.a(CaptureResult.CONTROL_AF_MODE, ope.H(lrtVarD2.b())));
            hashSet.add(mjgVar.a(CaptureResult.CONTROL_AE_MODE, ope.H(lrtVarD2.a())));
            hashSet.add(mjgVar.a(CaptureResult.CONTROL_AWB_MODE, ope.H(lrtVarD2.c())));
            hashSet.addAll(mjgVar.e(lrtVarD2, zBooleanValue2, zBooleanValue3, zBooleanValue4));
            mip mipVarC = lnb.c(new lre(ope.F(hashSet)));
            lpcVarA.g(mipVarC);
            mjg mjgVar2 = this.j;
            lre lreVar = new lre(ope.I(mjgVar2.a(CaptureResult.CONTROL_AF_MODE, ope.H(lrtVarD2.b())), mjgVar2.a(CaptureResult.CONTROL_AF_TRIGGER, ope.H(1))));
            if (i != 0) {
                lpcVarA.g(lnb.c(lreVar));
            }
            this.b.f(lpcVarA.b());
            if (i != 0) {
                try {
                    this.a.submit(new lri(lreVar, 0)).get();
                } catch (InterruptedException | ExecutionException | RejectedExecutionException e) {
                    plk.U(e);
                }
            }
            if (zBooleanValue && !i(lmqVarA.b())) {
                lpc lpcVarA2 = lpc.a(lpcVarA);
                lpcVarA2.d(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                lpcVarA2.g(mipVarC);
                this.b.h(lpcVarA2.b());
            }
            this.c.d(lrtVarD2, true);
            lieVarA.close();
        } catch (Throwable th) {
            try {
                lieVarA.close();
            } catch (Throwable th2) {
            }
            throw th;
        }
    }
}
