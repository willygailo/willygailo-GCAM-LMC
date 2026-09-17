package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class bqq implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;
    private final /* synthetic */ int g;

    public bqq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i) {
        this.g = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
    }

    public bqq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, byte[] bArr) {
        this.g = i;
        this.e = qkgVar;
        this.f = qkgVar2;
        this.b = qkgVar3;
        this.d = qkgVar4;
        this.a = qkgVar5;
        this.c = qkgVar6;
    }

    public bqq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, byte[] bArr, byte[] bArr2) {
        this.g = i;
        this.e = qkgVar;
        this.d = qkgVar2;
        this.f = qkgVar3;
        this.b = qkgVar4;
        this.c = qkgVar5;
        this.a = qkgVar6;
    }

    public bqq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, char[] cArr) {
        this.g = i;
        this.f = qkgVar;
        this.e = qkgVar2;
        this.b = qkgVar3;
        this.c = qkgVar4;
        this.a = qkgVar5;
        this.d = qkgVar6;
    }

    public bqq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, char[] cArr, byte[] bArr) {
        this.g = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.e = qkgVar3;
        this.b = qkgVar4;
        this.f = qkgVar5;
        this.d = qkgVar6;
    }

    public bqq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, float[] fArr) {
        this.g = i;
        this.b = qkgVar;
        this.d = qkgVar2;
        this.e = qkgVar3;
        this.c = qkgVar4;
        this.a = qkgVar5;
        this.f = qkgVar6;
    }

    public bqq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, int[] iArr) {
        this.g = i;
        this.a = qkgVar;
        this.e = qkgVar2;
        this.c = qkgVar3;
        this.b = qkgVar4;
        this.d = qkgVar5;
        this.f = qkgVar6;
    }

    public bqq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, short[] sArr) {
        this.g = i;
        this.a = qkgVar;
        this.f = qkgVar2;
        this.c = qkgVar3;
        this.e = qkgVar4;
        this.b = qkgVar5;
        this.d = qkgVar6;
    }

    public bqq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, boolean[] zArr) {
        this.g = i;
        this.d = qkgVar;
        this.c = qkgVar2;
        this.e = qkgVar3;
        this.f = qkgVar4;
        this.a = qkgVar5;
        this.b = qkgVar6;
    }

    public bqq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, byte[][] bArr) {
        this.g = i;
        this.f = qkgVar;
        this.d = qkgVar2;
        this.b = qkgVar3;
        this.a = qkgVar4;
        this.e = qkgVar5;
        this.c = qkgVar6;
    }

    public bqq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, char[][] cArr) {
        this.g = i;
        this.e = qkgVar;
        this.d = qkgVar2;
        this.b = qkgVar3;
        this.a = qkgVar4;
        this.c = qkgVar5;
        this.f = qkgVar6;
    }

    public bqq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, float[][] fArr) {
        this.g = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
        this.d = qkgVar4;
        this.f = qkgVar5;
        this.e = qkgVar6;
    }

    public bqq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, int[][] iArr) {
        this.g = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.f = qkgVar3;
        this.e = qkgVar4;
        this.d = qkgVar5;
        this.b = qkgVar6;
    }

    public bqq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, short[][] sArr) {
        this.g = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.e = qkgVar3;
        this.a = qkgVar4;
        this.f = qkgVar5;
        this.d = qkgVar6;
    }

    public bqq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, boolean[][] zArr) {
        this.g = i;
        this.d = qkgVar;
        this.f = qkgVar2;
        this.c = qkgVar3;
        this.a = qkgVar4;
        this.e = qkgVar5;
        this.b = qkgVar6;
    }

    public bqq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, byte[][][] bArr) {
        this.g = i;
        this.b = qkgVar;
        this.d = qkgVar2;
        this.e = qkgVar3;
        this.f = qkgVar4;
        this.a = qkgVar5;
        this.c = qkgVar6;
    }

    public bqq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, char[][][] cArr) {
        this.g = i;
        this.f = qkgVar;
        this.c = qkgVar2;
        this.e = qkgVar3;
        this.b = qkgVar4;
        this.a = qkgVar5;
        this.d = qkgVar6;
    }

    public bqq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, float[][][] fArr) {
        this.g = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.d = qkgVar3;
        this.f = qkgVar4;
        this.c = qkgVar5;
        this.e = qkgVar6;
    }

    public bqq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, int[][][] iArr) {
        this.g = i;
        this.d = qkgVar;
        this.a = qkgVar2;
        this.e = qkgVar3;
        this.c = qkgVar4;
        this.f = qkgVar5;
        this.b = qkgVar6;
    }

    public bqq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, short[][][] sArr) {
        this.g = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.e = qkgVar3;
        this.f = qkgVar4;
        this.b = qkgVar5;
        this.d = qkgVar6;
    }

    public bqq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, boolean[][][] zArr) {
        this.g = i;
        this.d = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
        this.a = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
    }

    public static bqq a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6) {
        return new bqq(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, 1, (byte[]) null);
    }

    public static bqq b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6) {
        return new bqq(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, 11, (boolean[][]) null);
    }

    public static bqq c(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6) {
        return new bqq(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, 19, (byte[]) null, (byte[]) null);
    }

    public static bqq d(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6) {
        return new bqq(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, 20, (char[]) null, (byte[]) null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.g) {
            case 0:
                return new bqp((bqm) this.a.get(), (cwl) this.b.get(), (CameraActivityTiming) this.c.get(), ((cwd) this.d).get(), (dlt) this.e.get(), (Executor) this.f.get(), null, null, null);
            case 1:
                fjs fjsVar = (fjs) this.e.get();
                Boolean boolA = ((bpk) this.f).a();
                lvp lvpVar = ((gjp) this.b).get();
                lco lcoVar = (lco) this.d.get();
                jth jthVar = (jth) this.a.get();
                return new box(fjsVar, boolA, lvpVar, lcoVar, jthVar.d().i(), ((giv) this.c).get());
            case 2:
                return new buw(this.f, this.e, this.b, (Executor) this.c.get(), (Executor) this.a.get(), (ljf) this.d.get());
            case 3:
                return new bvp(((emp) this.a).a(), (ddf) this.f.get(), ((etj) this.c).get(), (lar) this.e.get(), (Executor) this.b.get(), (ljf) this.d.get());
            case 4:
                nnv nnvVar = (nnv) this.a.get();
                nnu nnuVar = (nnu) this.e.get();
                ((jtn) this.d).get();
                return new cem(nnvVar, nnuVar, (Handler) this.f.get());
            case 5:
                return new cfk(((cpk) this.d).get(), (nvb) this.c.get(), ((cjn) this.e).get(), (ddf) this.f.get(), (cfi) this.a.get(), (cux) this.b.get(), null, null);
            case 6:
                return new chj(this.b, this.d, this.e, this.c, this.a, this.f, null);
            case 7:
                return new chj(this.f, this.d, this.b, this.a, this.e, this.c);
            case 8:
                return new cpm((cph) this.e.get(), (cpi) this.d.get(), (lce) this.b.get(), (cpf) this.a.get(), (cpe) this.c.get(), (lda) this.f.get());
            case 9:
                return new cpw((cmm) this.c.get(), (cka) this.b.get(), (jhj) this.e.get(), (cpc) this.a.get(), (cvo) this.f.get(), ((cqd) this.d).get());
            case 10:
                Context contextA = ((emp) this.a).a();
                lvp lvpVar2 = ((cow) this.c).get();
                ddf ddfVar = (ddf) this.f.get();
                Executor executor = (Executor) this.e.get();
                ljf ljfVar = (ljf) this.d.get();
                return hld.b(contextA, ddfVar, lvpVar2, new ljl(executor, ljfVar, "SmartCaptureFQS"), ljfVar, ((Boolean) ((lda) this.b.get()).fA()).booleanValue(), oih.a);
            case 11:
                return new cwc((lar) this.d.get(), (cxz) this.f.get(), (cwm) this.c.get(), ((cwd) this.a).get(), ((liq) this.e).get(), (cwf) this.b.get(), null, null, null);
            case 12:
                return new czq(((emp) this.b).a(), (mgo) this.c.get(), (nmb) this.a.get(), pyr.a(this.d), pyr.a(this.f), (ljf) this.e.get());
            case 13:
                return new daf((dbl) this.b.get(), (dch) this.d.get(), (dbv) this.e.get(), (dbw) this.f.get(), (dba) this.a.get(), (dah) this.c.get());
            case 14:
                return new dbl(((evv) this.f).a(), (dbo) this.c.get(), (gvb) this.e.get(), (lda) this.b.get(), (ScheduledExecutorService) this.a.get(), (fjs) this.d.get());
            case 15:
                return new dch(((evv) this.c).a(), (dcj) this.a.get(), (gvb) this.e.get(), (lda) this.f.get(), (ScheduledExecutorService) this.b.get(), (fjs) this.d.get());
            case 16:
                final jtx jtxVar = (jtx) this.d.get();
                final ddf ddfVar2 = (ddf) this.a.get();
                final CameraActivityTiming cameraActivityTiming = (CameraActivityTiming) this.e.get();
                final ojc ojcVar = (ojc) ((pyt) this.c).a;
                final pht phtVar = (pht) this.f.get();
                final byte[] bArr = null;
                final byte[] bArr2 = null;
                return new jqn(cameraActivityTiming, ddfVar2, jtxVar, ojcVar, bArr, bArr2) { // from class: dhj
                    public final /* synthetic */ CameraActivityTiming b;
                    public final /* synthetic */ ddf c;
                    public final /* synthetic */ ojc d;
                    public final /* synthetic */ jtx e;

                    @Override // defpackage.jqn
                    public final void a() {
                        pht phtVar2 = this.a;
                        final CameraActivityTiming cameraActivityTiming2 = this.b;
                        final ddf ddfVar3 = this.c;
                        final jtx jtxVar2 = this.e;
                        final ojc ojcVar2 = this.d;
                        final byte[] bArr3 = null;
                        final byte[] bArr4 = null;
                        phtVar2.d(new Runnable(ddfVar3, jtxVar2, ojcVar2, bArr3, bArr4) { // from class: dhk
                            public final /* synthetic */ ddf b;
                            public final /* synthetic */ ojc c;
                            public final /* synthetic */ jtx d;

                            @Override // java.lang.Runnable
                            public final void run() {
                                ojc ojcVarI;
                                CameraActivityTiming cameraActivityTiming3 = this.a;
                                ddf ddfVar4 = this.b;
                                jtx jtxVar3 = this.d;
                                ojc ojcVar3 = this.c;
                                long permissionStartupTaskTimeEndNs = 0;
                                if (cameraActivityTiming3.getShutterButtonFirstEnabledNs() == 0 || cameraActivityTiming3.getFirstPreviewFrameRenderedNs() == 0) {
                                    ojcVarI = oih.a;
                                } else {
                                    long shutterButtonFirstEnabledNs = cameraActivityTiming3.getShutterButtonFirstEnabledNs() - cameraActivityTiming3.getActivityOnCreateStartNs();
                                    long firstPreviewFrameRenderedNs = cameraActivityTiming3.getFirstPreviewFrameRenderedNs() - cameraActivityTiming3.getActivityOnCreateStartNs();
                                    if (cameraActivityTiming3.getPermissionStartupTaskTimeStartNs() != 0 && cameraActivityTiming3.getPermissionStartupTaskTimeEndNs() != 0) {
                                        permissionStartupTaskTimeEndNs = cameraActivityTiming3.getPermissionStartupTaskTimeEndNs() - cameraActivityTiming3.getPermissionStartupTaskTimeStartNs();
                                    }
                                    ojcVarI = ojc.i(Long.valueOf(TimeUnit.NANOSECONDS.toMillis(Math.max(shutterButtonFirstEnabledNs, firstPreviewFrameRenderedNs) - permissionStartupTaskTimeEndNs)));
                                }
                                int iIntValue = ((Integer) ddfVar4.a(ddl.r).c()).intValue();
                                int iIntValue2 = ((Integer) ddfVar4.a(ddl.p).c()).intValue();
                                if (cameraActivityTiming3.c || !ojcVarI.g()) {
                                    return;
                                }
                                ojcVarI.c();
                                if (((Long) ojcVarI.c()).longValue() >= iIntValue2) {
                                    jtxVar3.k();
                                }
                                if (ddfVar4.k(ddl.aL) || Build.TYPE.equals("user") || !ojcVar3.g() || ((Long) ojcVarI.c()).longValue() < iIntValue) {
                                    return;
                                }
                                ((dko) ojcVar3.c()).b();
                            }
                        }, pgr.INSTANCE);
                    }
                };
            case 17:
                final lda ldaVar = (lda) this.d.get();
                final dom domVar = (dom) this.c.get();
                final boolean zBooleanValue = ((Boolean) this.b.get()).booleanValue();
                final qkg qkgVar = this.a;
                final boolean zBooleanValue2 = ((Boolean) this.e.get()).booleanValue();
                final qkg qkgVar2 = this.f;
                return new iho() { // from class: dnp
                    @Override // java.lang.Runnable
                    public final void run() {
                        dom domVar2 = domVar;
                        lda ldaVar2 = ldaVar;
                        boolean z = zBooleanValue;
                        qkg qkgVar3 = qkgVar;
                        boolean z2 = zBooleanValue2;
                        qkg qkgVar4 = qkgVar2;
                        domVar2.e(ldaVar2);
                        if (z) {
                            ((dom) qkgVar3.get()).e(ldaVar2);
                        }
                        if (z2) {
                            ((dom) qkgVar4.get()).e(ldaVar2);
                        }
                    }
                };
            case 18:
                return new dnw(((emd) this.b).get(), (ius) this.a.get(), (lar) this.d.get(), (lzi) this.f.get(), (lda) this.c.get(), (ddf) this.e.get());
            case 19:
                ((cjc) this.c).a();
                ((cjc) this.a).a();
                orx orxVar = orx.a;
                qmd.ae(orxVar);
                return orxVar;
            default:
                return new dzb((ddf) this.a.get(), (lvp) this.c.get(), (jth) this.e.get(), (enm) this.b.get(), this.f, (gsf) this.d.get());
        }
    }
}
