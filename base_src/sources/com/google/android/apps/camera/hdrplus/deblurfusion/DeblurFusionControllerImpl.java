package com.google.android.apps.camera.hdrplus.deblurfusion;

import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import defpackage.ddf;
import defpackage.ddi;
import defpackage.ddm;
import defpackage.edw;
import defpackage.edx;
import defpackage.eev;
import defpackage.eew;
import defpackage.eey;
import defpackage.fsr;
import defpackage.ghx;
import defpackage.hgm;
import defpackage.lce;
import defpackage.lig;
import defpackage.ljf;
import defpackage.ojc;
import defpackage.oug;
import defpackage.ouj;
import defpackage.ovd;
import defpackage.ovl;
import defpackage.pgr;
import defpackage.pht;
import defpackage.pih;
import defpackage.pjl;
import defpackage.qkg;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class DeblurFusionControllerImpl implements eew {
    public static final ouj a = ouj.h("com/google/android/apps/camera/hdrplus/deblurfusion/DeblurFusionControllerImpl");
    public final hgm b;
    public final ljf c;
    public final lce g;
    public final ddf h;
    private final Executor i;
    private final qkg j;
    public final Object e = new Object();
    public final pjl d = new pjl();
    public final AtomicBoolean f = new AtomicBoolean(false);

    public DeblurFusionControllerImpl(hgm hgmVar, Executor executor, lce lceVar, ljf ljfVar, qkg qkgVar, ddf ddfVar) {
        this.b = hgmVar;
        this.i = executor;
        this.g = lceVar;
        this.c = ljfVar;
        this.j = qkgVar;
        this.h = ddfVar;
    }

    public static native long deblurFaceImpl(long j, long j2, long j3, long j4, long j5, InterleavedU8ClientAllocator interleavedU8ClientAllocator, InterleavedU8ClientAllocator interleavedU8ClientAllocator2, boolean z, boolean z2, boolean z3, boolean z4, long[] jArr, long[] jArr2, long[] jArr3, long j6, String str, boolean z5, boolean z6, boolean z7, int i, int i2);

    public static native boolean initialize(String str, String str2);

    public static native long retrieveResultImage(long j);

    public static native int retrieveResultStatus(long j);

    public final String a() {
        ojc ojcVarB = ((fsr) this.j).b();
        return ojcVarB.g() ? ((File) ojcVarB.c()).getAbsolutePath() : "";
    }

    @Override // defpackage.eew
    public final void b() {
        this.i.execute(new edw(this, 1));
    }

    public final void c() {
        ddf ddfVar = this.h;
        ddi ddiVar = ddm.a;
        ddfVar.d();
    }

    @Override // defpackage.eew
    public final pht d(long j, ghx ghxVar, eev eevVar, eev eevVar2, eey eeyVar, lig ligVar) {
        c();
        if (eevVar.a.b()) {
            ((oug) ((oug) a.b().g(ovl.a, "FalconController")).G((char) 1084)).o("Empty primary raw image.");
        }
        if (eevVar2.a.b()) {
            ((oug) ((oug) a.b().g(ovl.a, "FalconController")).G((char) 1083)).o("Empty secondary raw image.");
        }
        ovd ovdVar = ovl.a;
        pih pihVarF = pih.f();
        this.i.execute(new edx(this, j, eevVar, eevVar2, ghxVar, ligVar, eeyVar, pihVarF));
        pihVarF.d(new edw(this, 0), pgr.INSTANCE);
        return pihVarF;
    }
}
