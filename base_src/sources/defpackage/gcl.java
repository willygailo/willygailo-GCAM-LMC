package defpackage;

import com.google.android.apps.camera.moments.MomentsUtils;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.PostviewParams;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class gcl implements gey {
    private static final AtomicInteger g = new AtomicInteger(0);
    public final ebe a;
    public final lvp b;
    public final ddf c;
    public final gcn d;
    public final hcg e;
    public final nvb f;
    private final lis h;
    private final Executor i;

    public gcl(ebe ebeVar, lvp lvpVar, lis lisVar, ddf ddfVar, gcn gcnVar, Executor executor, nvb nvbVar, hcg hcgVar, byte[] bArr, byte[] bArr2) {
        this.a = ebeVar;
        this.b = lvpVar;
        this.h = lisVar.a("MomentsHdrPLaunch");
        this.c = ddfVar;
        this.d = gcnVar;
        this.i = executor;
        this.f = nvbVar;
        this.e = hcgVar;
    }

    @Override // defpackage.gey
    public final int a() {
        return 1;
    }

    @Override // defpackage.gey
    public final void b(final lmr lmrVar, final gfs gfsVar, final gfi gfiVar, final gex gexVar) {
        int andIncrement = g.getAndIncrement();
        StringBuilder sb = new StringBuilder(26);
        sb.append("launcher shot ");
        sb.append(andIncrement);
        sb.append(" ");
        final lix lixVarJ = lix.j(sb.toString(), this.h);
        lixVarJ.b("launcher got a HDR+ burst");
        lmw lmwVarB = lmrVar.b();
        lmwVarB.getClass();
        long j = lmwVarB.b;
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("    with frame: ");
        sb2.append(j);
        lixVarJ.b(sb2.toString());
        this.i.execute(new Runnable() { // from class: gch
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                Throwable th;
                lwk lwkVar;
                gcl gclVar = this.a;
                lmr lmrVar2 = lmrVar;
                lis lisVar = lixVarJ;
                gex gexVar2 = gexVar;
                gfs gfsVar2 = gfsVar;
                gfi gfiVar2 = gfiVar;
                try {
                    lzv lzvVar = (lzv) MomentsUtils.a(lmrVar2).get();
                    lmw lmwVarB2 = lmrVar2.b();
                    lmwVarB2.getClass();
                    long j2 = lmwVarB2.b;
                    hcf hcfVarA = gclVar.e.a(lmrVar2);
                    mad madVarE = hcfVarA.e();
                    mad madVarD = hcfVarA.d();
                    mad lwjVar = madVarD == null ? new lwj(j2) : madVarD;
                    if (madVarE == null) {
                        gexVar2.b(new RuntimeException("Could not get a raw image from input frame"));
                        return;
                    }
                    lwk lwkVar2 = new lwk(madVarE, 1);
                    try {
                        try {
                            lwk lwkVar3 = new lwk(lwjVar, 1);
                            try {
                                int iA = gclVar.a.a(lzvVar);
                                lwkVar = lwkVar3;
                                mad madVar = lwjVar;
                                try {
                                    gci gciVar = new gci(gclVar, gfiVar2, j2, lzvVar, lwkVar, gexVar2);
                                    gcj gcjVar = new gcj(gclVar, gfiVar2, j2, lzvVar, madVar, lwkVar, gexVar2);
                                    hsp hspVarA = hsp.a();
                                    String strValueOf = String.valueOf(hspVarA);
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf).length() + 59);
                                    sb3.append(strValueOf);
                                    sb3.append(" + used internally by Moments. Not a shutter initiated shot");
                                    lisVar.f(sb3.toString());
                                    ede edeVarF = gclVar.f.f(hspVarA);
                                    ddf ddfVar = gclVar.c;
                                    ddg ddgVar = dds.a;
                                    ddfVar.c();
                                    PostviewParams postviewParams = new PostviewParams();
                                    lig ligVar = pkr.h(gclVar.b).b;
                                    int i = ligVar.a;
                                    if (i > ligVar.b) {
                                        postviewParams.d(i / 2);
                                        postviewParams.c(0);
                                    } else {
                                        postviewParams.d(0);
                                        postviewParams.c(ligVar.b / 2);
                                    }
                                    if (!gclVar.c.k(dds.y) || gfiVar2.b) {
                                        postviewParams.b(1);
                                        if (edeVarF.g == null) {
                                            edeVarF.g = ope.D();
                                        }
                                        edeVarF.g.d(gcjVar);
                                    } else {
                                        postviewParams.b(5);
                                        if (edeVarF.i == null) {
                                            edeVarF.i = ope.D();
                                        }
                                        edeVarF.i.d(gciVar);
                                    }
                                    try {
                                        edd eddVarD = gclVar.a.d(iA, hspVarA, new gog(gfsVar2, null, new god(), new gow()), postviewParams, gqt.OFF, lzvVar);
                                        lisVar.b("launched HDR+ shot");
                                        if (eddVarD == null) {
                                            lisVar.h("Failed to initiate HDR plus shot capture.");
                                            gexVar2.b(new gck(new RuntimeException("Failed to initiate HDR plus shot capture.")));
                                        } else {
                                            gclVar.a.t(eddVarD, new BurstSpec());
                                            StringBuilder sb4 = new StringBuilder(45);
                                            sb4.append("Submitting payload frame ");
                                            sb4.append(j2);
                                            lisVar.b(sb4.toString());
                                            gclVar.a.p(eddVarD, 0, lzvVar, 1, lwkVar2, null);
                                            if (gclVar.a.y(eddVarD)) {
                                                if (!gclVar.a.z(eddVarD)) {
                                                    lisVar.d("Couldn't end capture, aborting shot.");
                                                    gclVar.a.o(eddVarD);
                                                    gexVar2.b(new gck(new RuntimeException("Couldn't end capture")));
                                                }
                                                lwkVar2.k();
                                                lwkVar.k();
                                            } else {
                                                lisVar.d("Couldn't end burst payload, aborting shot.");
                                                gclVar.a.o(eddVarD);
                                                gexVar2.b(new gck(new RuntimeException("Couldn't end burst payload")));
                                            }
                                        }
                                    } catch (InterruptedException e) {
                                        e = e;
                                        lisVar.e("Couldn't start ZSL capture", e);
                                        gexVar2.b(e);
                                    } catch (ExecutionException e2) {
                                        e = e2;
                                        lisVar.e("Couldn't start ZSL capture", e);
                                        gexVar2.b(e);
                                    } catch (llv e3) {
                                        e = e3;
                                        lisVar.e("Couldn't start ZSL capture", e);
                                        gexVar2.b(e);
                                    }
                                    lwkVar.l();
                                    lwkVar2.l();
                                } catch (Throwable th2) {
                                    th = th2;
                                    Throwable th3 = th;
                                    try {
                                        lwkVar.l();
                                        throw th3;
                                    } catch (Throwable th4) {
                                        throw th3;
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                lwkVar = lwkVar3;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            th = th;
                            try {
                                lwkVar2.l();
                                throw th;
                            } catch (Throwable th7) {
                                throw th;
                            }
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        th = th;
                        lwkVar2.l();
                        throw th;
                    }
                } catch (InterruptedException e4) {
                    lisVar.d("metadata get interrupted");
                    gexVar2.b(e4);
                } catch (ExecutionException e5) {
                    lisVar.d("Failed to acquire metadata from the first frame.");
                    gexVar2.b(e5);
                }
            }
        });
    }

    @Override // defpackage.gey
    public final boolean c(lmr lmrVar, hcg hcgVar) {
        return true;
    }
}
