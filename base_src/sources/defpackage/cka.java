package defpackage;

import android.content.res.Resources;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes.dex */
public final class cka implements lie {
    private final imy A;
    private final nvb B;
    public final jlb a;
    public final jhj b;
    public final String c;
    private final lco d;
    private final lco e;
    private final lco f;
    private final lda g;
    private final gfy h;
    private final ghf i;
    private final ckg j;
    private final cvo k;
    private final lar l;
    private final lda m;
    private final lda n;
    private final lda o;
    private final lda p;
    private final huf q;
    private final ddf r;
    private final lvq s;
    private final ojc t;
    private final cpp u;
    private final cje v;
    private lwd w;
    private cju y;
    private final Object z = new Object();
    private final lda x = new lce(cjr.UNINITIALIZED);

    public cka(Resources resources, gfy gfyVar, imy imyVar, ghf ghfVar, lco lcoVar, lda ldaVar, lco lcoVar2, ckg ckgVar, nvb nvbVar, cvo cvoVar, jlb jlbVar, jhj jhjVar, lar larVar, huf hufVar, ddf ddfVar, lvq lvqVar, lco lcoVar3, lda ldaVar2, lda ldaVar3, lda ldaVar4, lda ldaVar5, ojc ojcVar, cpp cppVar, cje cjeVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.h = gfyVar;
        this.A = imyVar;
        this.i = ghfVar;
        this.f = lcoVar;
        this.g = ldaVar;
        this.e = lcoVar2;
        this.j = ckgVar;
        this.B = nvbVar;
        this.k = cvoVar;
        this.a = jlbVar;
        this.b = jhjVar;
        this.l = larVar;
        this.c = resources.getString(R.string.pref_camera_video_flashmode_torch);
        this.m = ldaVar2;
        this.n = ldaVar3;
        this.o = ldaVar4;
        this.p = ldaVar5;
        this.q = hufVar;
        this.r = ddfVar;
        this.s = lvqVar;
        this.d = lcoVar3;
        this.t = ojcVar;
        this.u = cppVar;
        this.v = cjeVar;
    }

    public final synchronized cju a() {
        lco lcoVar;
        lda ldaVar;
        lda ldaVar2;
        lda ldaVar3;
        lda ldaVar4;
        lda ldaVar5;
        lda ldaVar6;
        lda ldaVar7;
        lda ldaVar8;
        lda ldaVar9;
        lco lcoVar2;
        lda ldaVar10;
        lda ldaVar11;
        lda ldaVar12;
        lda ldaVar13;
        lda ldaVar14;
        lco lcoVar3;
        lco lcoVar4;
        lco lcoVar5;
        lco lcoVar6;
        lco lcoVar7;
        lco lcoVar8;
        lco lcoVar9;
        lco lcoVar10;
        lco lcoVar11;
        lco lcoVar12;
        gsn gsnVar;
        cju cjuVar;
        synchronized (this.z) {
            if (this.k.d() == this.w && (cjuVar = this.y) != null) {
                return cjuVar;
            }
            this.B.k(cms.CAPTURE_SESSION).c(this);
            this.w = this.k.d();
            ghx ghxVar = (ghx) this.k.e().c();
            gsn gsnVar2 = !this.r.k(ddl.T) ? new gsn(this.d, this.e, ghxVar, this.r, this.s) : new gsn(this.d, this.e, ghxVar, lhs.h(this.u.a(this.k.d()).c()), this.r, this.s);
            lce lceVar = new lce(ghxVar.h());
            lco lcoVarJ = lcv.j(lceVar, bxe.k);
            lce lceVar2 = new lce(ggw.c());
            lce lceVar3 = new lce(ggw.c());
            gga ggaVar = new gga(lceVar2, lcoVarJ);
            ggj ggjVar = new ggj(lceVar3, lcoVarJ);
            final lce lceVar4 = new lce(false);
            lco lcoVarJ2 = lcv.j(this.q.a(htu.l), new oiu() { // from class: cjz
                @Override // defpackage.oiu
                public final Object a(Object obj) {
                    return Boolean.valueOf(((String) obj).equals(this.a.c));
                }
            });
            lco lcoVarJ3 = lcv.j(this.q.a(htu.o), bxe.l);
            lap lapVarK = this.B.k(cms.CAPTURE_SESSION);
            if (this.k.i()) {
                lapVarK.c(lcv.d(lcoVarJ3, lcoVarJ2).a(new cjx(lceVar4, 0), this.l));
            } else if (this.k.j()) {
                lapVarK.c(this.q.a(htu.m).a(new lij() { // from class: cjw
                    @Override // defpackage.lij
                    public final void fB(Object obj) {
                        lceVar4.fB(Boolean.valueOf(((String) obj).equals(this.a.c)));
                    }
                }, this.l));
            }
            this.g.fB(true);
            final lce lceVar5 = new lce(false);
            final lce lceVar6 = new lce(false);
            final int i = 2;
            lapVarK.c(this.h.b.a(new lij() { // from class: cjy
                @Override // defpackage.lij
                public final void fB(Object obj) {
                    switch (i) {
                        case 0:
                            lda ldaVar15 = lceVar5;
                            lda ldaVar16 = lceVar6;
                            ldaVar15.fB(true);
                            ldaVar16.fB(true);
                            break;
                        case 1:
                            lda ldaVar17 = lceVar5;
                            lda ldaVar18 = lceVar6;
                            ldaVar17.fB(true);
                            ldaVar18.fB(true);
                            break;
                        default:
                            lda ldaVar19 = lceVar5;
                            lda ldaVar20 = lceVar6;
                            ldaVar19.fB(true);
                            ldaVar20.fB(true);
                            break;
                    }
                }
            }, pgr.INSTANCE));
            lapVarK.c(this.i.a.a(new cjx(lceVar5, 2), pgr.INSTANCE));
            final int i2 = 0;
            lapVarK.c(lceVar4.a(new lij() { // from class: cjy
                @Override // defpackage.lij
                public final void fB(Object obj) {
                    switch (i2) {
                        case 0:
                            lda ldaVar15 = lceVar5;
                            lda ldaVar16 = lceVar6;
                            ldaVar15.fB(true);
                            ldaVar16.fB(true);
                            break;
                        case 1:
                            lda ldaVar17 = lceVar5;
                            lda ldaVar18 = lceVar6;
                            ldaVar17.fB(true);
                            ldaVar18.fB(true);
                            break;
                        default:
                            lda ldaVar19 = lceVar5;
                            lda ldaVar20 = lceVar6;
                            ldaVar19.fB(true);
                            ldaVar20.fB(true);
                            break;
                    }
                }
            }, pgr.INSTANCE));
            final int i3 = 1;
            lapVarK.c(gsnVar2.a(new lij() { // from class: cjy
                @Override // defpackage.lij
                public final void fB(Object obj) {
                    switch (i3) {
                        case 0:
                            lda ldaVar15 = lceVar5;
                            lda ldaVar16 = lceVar6;
                            ldaVar15.fB(true);
                            ldaVar16.fB(true);
                            break;
                        case 1:
                            lda ldaVar17 = lceVar5;
                            lda ldaVar18 = lceVar6;
                            ldaVar17.fB(true);
                            ldaVar18.fB(true);
                            break;
                        default:
                            lda ldaVar19 = lceVar5;
                            lda ldaVar20 = lceVar6;
                            ldaVar19.fB(true);
                            ldaVar20.fB(true);
                            break;
                    }
                }
            }, pgr.INSTANCE));
            lapVarK.c(this.x.a(new lij() { // from class: cjv
                @Override // defpackage.lij
                public final void fB(Object obj) {
                    cka ckaVar = this.a;
                    if (((cjr) obj) == cjr.ERROR) {
                        ckaVar.a.H(false);
                        ckaVar.b.a(jhi.CAPTURE_SESSION_ERROR);
                    }
                }
            }, this.l));
            cjt cjtVar = new cjt(null);
            ckg ckgVar = this.j;
            ckgVar.c();
            cjtVar.u = ckgVar.b;
            cjtVar.v = this.j.a();
            lco lcoVar13 = this.f;
            if (lcoVar13 == null) {
                throw new NullPointerException("Null portraitIdle");
            }
            cjtVar.t = lcoVar13;
            cjtVar.a = this.h.b;
            lco lcoVar14 = this.i.a;
            if (lcoVar14 == null) {
                throw new NullPointerException("Null awbSetting");
            }
            cjtVar.s = lcoVar14;
            cjtVar.r = this.t.g() ? ojc.i(((hcl) this.t.c()).b()) : oih.a;
            cjtVar.C = gsnVar2;
            cjtVar.e = lceVar;
            cjtVar.c = lceVar2;
            cjtVar.d = lceVar3;
            cjtVar.w = ggaVar;
            cjtVar.x = ggjVar;
            lco lcoVar15 = this.e;
            if (lcoVar15 == null) {
                throw new NullPointerException("Null zoomRatio");
            }
            cjtVar.b = lcoVar15;
            cjtVar.f = this.h.a;
            cjtVar.g = this.A.a;
            lda ldaVar15 = this.g;
            if (ldaVar15 == null) {
                throw new NullPointerException("Null caf");
            }
            cjtVar.h = ldaVar15;
            cjtVar.i = lceVar4;
            cjtVar.j = new lce(cjs.UNINITIALIZED);
            cjtVar.k = this.x;
            cjtVar.l = this.q.a(htu.o);
            cjtVar.m = lceVar5;
            cjtVar.n = lceVar6;
            cjtVar.o = new lce(true);
            cjtVar.p = new lce(false);
            lda ldaVar16 = this.m;
            if (ldaVar16 == null) {
                throw new NullPointerException("Null stabilizationMode");
            }
            cjtVar.q = ldaVar16;
            lda ldaVar17 = this.p;
            if (ldaVar17 == null) {
                throw new NullPointerException("Null micInputOption");
            }
            cjtVar.A = ldaVar17;
            lda ldaVar18 = this.n;
            if (ldaVar18 == null) {
                throw new NullPointerException("Null isExtMicWiredConnected");
            }
            cjtVar.y = ldaVar18;
            lda ldaVar19 = this.o;
            if (ldaVar19 == null) {
                throw new NullPointerException("Null isExtMicBluetoothConnected");
            }
            cjtVar.z = ldaVar19;
            cjtVar.B = this.v;
            lda ldaVar20 = cjtVar.a;
            if (ldaVar20 != null && (lcoVar = cjtVar.b) != null && (ldaVar = cjtVar.c) != null && (ldaVar2 = cjtVar.d) != null && (ldaVar3 = cjtVar.e) != null && (ldaVar4 = cjtVar.f) != null && (ldaVar5 = cjtVar.g) != null && (ldaVar6 = cjtVar.h) != null && (ldaVar7 = cjtVar.i) != null && (ldaVar8 = cjtVar.j) != null && (ldaVar9 = cjtVar.k) != null && (lcoVar2 = cjtVar.l) != null && (ldaVar10 = cjtVar.m) != null && (ldaVar11 = cjtVar.n) != null && (ldaVar12 = cjtVar.o) != null && (ldaVar13 = cjtVar.p) != null && (ldaVar14 = cjtVar.q) != null && (lcoVar3 = cjtVar.s) != null && (lcoVar4 = cjtVar.t) != null && (lcoVar5 = cjtVar.u) != null && (lcoVar6 = cjtVar.v) != null && (lcoVar7 = cjtVar.w) != null && (lcoVar8 = cjtVar.x) != null && (lcoVar9 = cjtVar.y) != null && (lcoVar10 = cjtVar.z) != null && (lcoVar11 = cjtVar.A) != null && (lcoVar12 = cjtVar.B) != null && (gsnVar = cjtVar.C) != null) {
                cju cjuVar2 = new cju(ldaVar20, lcoVar, ldaVar, ldaVar2, ldaVar3, ldaVar4, ldaVar5, ldaVar6, ldaVar7, ldaVar8, ldaVar9, lcoVar2, ldaVar10, ldaVar11, ldaVar12, ldaVar13, ldaVar14, cjtVar.r, lcoVar3, lcoVar4, lcoVar5, lcoVar6, lcoVar7, lcoVar8, lcoVar9, lcoVar10, lcoVar11, lcoVar12, gsnVar);
                this.y = cjuVar2;
                return cjuVar2;
            }
            StringBuilder sb = new StringBuilder();
            if (cjtVar.a == null) {
                sb.append(" aeComp");
            }
            if (cjtVar.b == null) {
                sb.append(" zoomRatio");
            }
            if (cjtVar.c == null) {
                sb.append(" aeMeteringParameters");
            }
            if (cjtVar.d == null) {
                sb.append(" afMeteringParameters");
            }
            if (cjtVar.e == null) {
                sb.append(" scalerRegion");
            }
            if (cjtVar.f == null) {
                sb.append(" aeLock");
            }
            if (cjtVar.g == null) {
                sb.append(" afLock");
            }
            if (cjtVar.h == null) {
                sb.append(" caf");
            }
            if (cjtVar.i == null) {
                sb.append(" torchOn");
            }
            if (cjtVar.j == null) {
                sb.append(" recordingState");
            }
            if (cjtVar.k == null) {
                sb.append(" moduleState");
            }
            if (cjtVar.l == null) {
                sb.append(" backFlashThermallyDisabled");
            }
            if (cjtVar.m == null) {
                sb.append(" shouldUpdatePreviewRequest");
            }
            if (cjtVar.n == null) {
                sb.append(" shouldUpdateRecordingRequest");
            }
            if (cjtVar.o == null) {
                sb.append(" shouldUpdateAfMode");
            }
            if (cjtVar.p == null) {
                sb.append(" isStorageLow");
            }
            if (cjtVar.q == null) {
                sb.append(" stabilizationMode");
            }
            if (cjtVar.s == null) {
                sb.append(" awbSetting");
            }
            if (cjtVar.t == null) {
                sb.append(" portraitIdle");
            }
            if (cjtVar.u == null) {
                sb.append(" videoOrientation");
            }
            if (cjtVar.v == null) {
                sb.append(" deviceOrientation");
            }
            if (cjtVar.w == null) {
                sb.append(" aeMeteringRegion");
            }
            if (cjtVar.x == null) {
                sb.append(" afMeteringRegion");
            }
            if (cjtVar.y == null) {
                sb.append(" isExtMicWiredConnected");
            }
            if (cjtVar.z == null) {
                sb.append(" isExtMicBluetoothConnected");
            }
            if (cjtVar.A == null) {
                sb.append(" micInputOption");
            }
            if (cjtVar.B == null) {
                sb.append(" speechMode");
            }
            if (cjtVar.C == null) {
                sb.append(" multiCropRegion");
            }
            String strValueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(strValueOf);
            throw new IllegalStateException(sb2.toString());
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.z) {
            this.y = null;
        }
    }
}
