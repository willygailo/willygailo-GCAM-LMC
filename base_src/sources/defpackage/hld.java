package defpackage;

import android.content.Context;
import android.os.Trace;
import android.util.Log;
import com.google.android.libraries.vision.smartcapture.BurstCurator;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class hld implements dwj, lie {
    private static final ouj a = ouj.h("com/google/android/apps/camera/qualityscore/SmartCaptureFrameQualityScorer");
    private final pht b;
    private final boolean c;
    private final AtomicBoolean d = new AtomicBoolean(false);
    private boolean e = false;

    private hld(pht phtVar, boolean z) {
        this.b = phtVar;
        this.c = z;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    public static hld b(final Context context, ddf ddfVar, lvp lvpVar, Executor executor, final ljf ljfVar, boolean z, ojc ojcVar) {
        final boolean z2;
        boolean z3;
        final boolean z4;
        final boolean z5;
        final int i;
        final boolean zK = ddfVar.k(ddd.c);
        if (z) {
            z2 = true;
        } else {
            ddfVar.d();
            z2 = false;
        }
        ddfVar.d();
        lwd lwdVarK = lvpVar.k();
        lwd lwdVar = lwd.FRONT;
        if (lwdVarK == lwdVar) {
            if (ddfVar.k(dds.b)) {
                ddfVar.d();
                z3 = true;
            } else {
                z3 = false;
            }
        } else if (ddfVar.k(dds.c)) {
            ddfVar.d();
            z3 = true;
        } else {
            z3 = false;
        }
        if (ddfVar.k(dds.d)) {
            ddfVar.d();
            z4 = true;
        } else {
            z4 = false;
        }
        final boolean zK2 = lwdVarK == lwdVar ? ddfVar.k(dds.e) : ddfVar.k(dds.f);
        final boolean zK3 = lwdVarK == lwdVar ? ddfVar.k(dds.g) : ddfVar.k(dds.h);
        if (ddfVar.k(dds.i)) {
            ddfVar.d();
            z5 = true;
        } else {
            z5 = false;
        }
        ddfVar.d();
        if (ddfVar.k(dds.k)) {
            i = 3;
        } else {
            i = ddfVar.k(dds.j) ? 2 : 1;
        }
        final int i2 = true != ddfVar.k(dds.l) ? 2 : 5;
        final boolean z6 = z3;
        return new hld(plk.aa(new pgj() { // from class: hlc
            @Override // defpackage.pgj
            public final pht a() {
                Context context2 = context;
                ljf ljfVar2 = ljfVar;
                boolean z7 = zK;
                boolean z8 = z5;
                boolean z9 = z2;
                boolean z10 = z6;
                int i3 = i;
                boolean z11 = z4;
                boolean z12 = zK2;
                boolean z13 = zK3;
                int i4 = i2;
                obr.aR(!context2.isDeviceProtectedStorage(), "Must use credential protected storage");
                try {
                    ljfVar2.e("SmartCaptureFQS#curator");
                    String str = true != z7 ? "" : "FaceFamiliarityProcessorVMImpl";
                    poy poyVarM = puz.c.m();
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = false;
                    }
                    puz puzVar = (puz) poyVarM.b;
                    puzVar.a |= 4;
                    puzVar.b = str;
                    puz puzVar2 = (puz) poyVarM.j();
                    String str2 = true != z8 ? "SmartCaptureFaceAttributesV1Client" : "SmartCaptureFaceAttributesV2Client";
                    ppa ppaVar = (ppa) ptf.c.m();
                    if (ppaVar.c) {
                        ppaVar.m();
                        ppaVar.c = false;
                    }
                    ptf ptfVar = (ptf) ppaVar.b;
                    ptfVar.a |= 1;
                    ptfVar.b = str2;
                    ptf ptfVar2 = (ptf) ppaVar.j();
                    poy poyVarM2 = pum.r.m();
                    String absolutePath = context2.getFilesDir().getAbsolutePath();
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    pum pumVar = (pum) poyVarM2.b;
                    absolutePath.getClass();
                    pumVar.a |= 4194304;
                    pumVar.l = absolutePath;
                    String absolutePath2 = context2.getNoBackupFilesDir().getAbsolutePath();
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    pum pumVar2 = (pum) poyVarM2.b;
                    absolutePath2.getClass();
                    pumVar2.a |= 8388608;
                    pumVar2.m = absolutePath2;
                    String absolutePath3 = context2.getCacheDir().getAbsolutePath();
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    pum pumVar3 = (pum) poyVarM2.b;
                    absolutePath3.getClass();
                    int i5 = pumVar3.a | 16777216;
                    pumVar3.a = i5;
                    pumVar3.n = absolutePath3;
                    pumVar3.a = i5 | 64;
                    pumVar3.g = 3;
                    ptfVar2.getClass();
                    ppm ppmVar = pumVar3.b;
                    if (!ppmVar.c()) {
                        pumVar3.b = ppd.B(ppmVar);
                    }
                    pumVar3.b.add(ptfVar2);
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    pum pumVar4 = (pum) poyVarM2.b;
                    pumVar4.f = 3;
                    int i6 = pumVar4.a | 32;
                    pumVar4.a = i6;
                    int i7 = i6 | 33554432;
                    pumVar4.a = i7;
                    pumVar4.o = z9;
                    puzVar2.getClass();
                    pumVar4.q = puzVar2;
                    int i8 = i7 | 134217728;
                    pumVar4.a = i8;
                    int i9 = i8 | 512;
                    pumVar4.a = i9;
                    pumVar4.h = z10;
                    int i10 = i9 | 8192;
                    pumVar4.a = i10;
                    pumVar4.j = false;
                    pumVar4.k = i3 - 1;
                    int i11 = i10 | 16384;
                    pumVar4.a = i11;
                    int i12 = i11 | 4096;
                    pumVar4.a = i12;
                    pumVar4.i = z11;
                    int i13 = i12 | 2;
                    pumVar4.a = i13;
                    pumVar4.d = z12;
                    int i14 = i13 | 4;
                    pumVar4.a = i14;
                    pumVar4.e = z13;
                    pumVar4.c = i4 - 1;
                    int i15 = i14 | 1;
                    pumVar4.a = i15;
                    pumVar4.a = i15 | 67108864;
                    pumVar4.p = true;
                    return plk.V(new BurstCurator(BurstCurator.nativeCreateFromOptions(((pum) poyVarM2.j()).g())));
                } finally {
                    ljfVar2.f();
                }
            }
        }, executor), z3);
    }

    @Override // defpackage.dwj
    public final void a() {
        this.d.set(true);
    }

    final synchronized ojc c(mad madVar, hjz hjzVar) {
        pud pudVar;
        ojc ojcVarI;
        pud pudVar2;
        BurstCurator burstCurator = this.e ? null : (BurstCurator) mip.bY(this.b);
        if (burstCurator == null) {
            ((oug) ((oug) a.b()).G((char) 2518)).o("Input frame and metadata cannot be null.");
            return oih.a;
        }
        if (hjzVar.n == null) {
            ((oug) ((oug) a.b()).G((char) 2523)).o("Sensor region cannot be null.");
            return oih.a;
        }
        hjy[] hjyVarArr = hjzVar.p;
        if (hjyVarArr == null) {
            ((oug) ((oug) a.b()).G((char) 2522)).o("Faces array cannot be null.");
            return oih.a;
        }
        if (hjyVarArr.length != 0 || this.c) {
            float fC = madVar.c() / hjzVar.s.width();
            float fB = madVar.b() / hjzVar.s.height();
            boolean andSet = !hjzVar.q ? this.d.getAndSet(false) : false;
            poy poyVarM = pul.c.m();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pul pulVar = (pul) poyVarM.b;
            pulVar.a |= 1;
            pulVar.b = andSet;
            pul pulVar2 = (pul) poyVarM.j();
            poy poyVarM2 = ptx.k.m();
            int i = (360 - hjzVar.r) % 360;
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            ptx ptxVar = (ptx) poyVarM2.b;
            ptxVar.a |= 4;
            ptxVar.c = i;
            ptx ptxVar2 = (ptx) poyVarM2.j();
            pte pteVarL = enl.L(hjzVar, fC, fB);
            poy poyVarM3 = pud.l.m();
            long j = hjzVar.b;
            if (poyVarM3.c) {
                poyVarM3.m();
                poyVarM3.c = false;
            }
            pud pudVar3 = (pud) poyVarM3.b;
            int i2 = pudVar3.a | 2;
            pudVar3.a = i2;
            pudVar3.c = j;
            pteVarL.getClass();
            pudVar3.e = pteVarL;
            int i3 = i2 | 64;
            pudVar3.a = i3;
            boolean z = hjzVar.q;
            int i4 = i3 | 512;
            pudVar3.a = i4;
            pudVar3.f = z;
            ptxVar2.getClass();
            pudVar3.d = ptxVar2;
            int i5 = i4 | 32;
            pudVar3.a = i5;
            pulVar2.getClass();
            pudVar3.k = pulVar2;
            pudVar3.a = i5 | 2097152;
            pud pudVar4 = (pud) poyVarM3.j();
            if (hjzVar.q) {
                obr.aR(!burstCurator.c, "BurstCurator closed");
                Trace.beginSection("BurstCurator.toByteArray");
                byte[] bArrG = pudVar4.g();
                Trace.endSection();
                Trace.beginSection("BurstCurator.processYUVFrame");
                byte[] bArrNativeProcessMetadata = burstCurator.nativeProcessMetadata(burstCurator.b, bArrG);
                Trace.endSection();
                Trace.beginSection("BurstCurator.parseFrom");
                try {
                    pudVar2 = (pud) ppd.s(pud.l, bArrNativeProcessMetadata, burstCurator.a);
                } catch (ppp e) {
                    Log.e("BURST_CURATOR", "Proto serialization error.");
                    pudVar2 = pudVar4;
                }
                Trace.endSection();
                return ojc.i(new hla(pudVar2));
            }
            try {
                List listG = madVar.g();
                mac macVar = (mac) listG.get(0);
                mac macVar2 = (mac) listG.get(1);
                mac macVar3 = (mac) listG.get(2);
                ByteBuffer buffer = macVar.getBuffer();
                int pixelStride = macVar.getPixelStride();
                int rowStride = macVar.getRowStride();
                ByteBuffer buffer2 = macVar2.getBuffer();
                int pixelStride2 = macVar2.getPixelStride();
                int rowStride2 = macVar2.getRowStride();
                ByteBuffer buffer3 = macVar3.getBuffer();
                int pixelStride3 = macVar3.getPixelStride();
                int rowStride3 = macVar3.getRowStride();
                int iC = madVar.c();
                int iB = madVar.b();
                obr.aR(!burstCurator.c, "BurstCurator closed");
                if (!buffer.isDirect() || !buffer2.isDirect() || !buffer3.isDirect()) {
                    throw new IllegalArgumentException("Only direct buffers are currently supported");
                }
                Trace.beginSection("BurstCurator.toByteArray");
                byte[] bArrG2 = pudVar4.g();
                Trace.endSection();
                Trace.beginSection("BurstCurator.processYUVFrame");
                byte[] bArrNativeProcessYUV = burstCurator.nativeProcessYUV(burstCurator.b, buffer, pixelStride, rowStride, buffer2, pixelStride2, rowStride2, buffer3, pixelStride3, rowStride3, iC, iB, bArrG2);
                Trace.endSection();
                Trace.beginSection("BurstCurator.parseFrom");
                try {
                    pudVar = (pud) ppd.s(pud.l, bArrNativeProcessYUV, burstCurator.a);
                } catch (ppp e2) {
                    Log.e("BURST_CURATOR", "Proto serialization error.");
                    pudVar = pudVar4;
                }
                Trace.endSection();
                ojcVarI = ojc.i(new hla(pudVar));
            } catch (IllegalStateException e3) {
                ((oug) ((oug) ((oug) a.b()).h(e3)).G((char) 2521)).o("Couldn't get planes for analysis.");
                return oih.a;
            }
            throw th;
        }
        ojcVarI = oih.a;
        return ojcVarI;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.e) {
            this.e = true;
            mip.bZ(this.b, new lht() { // from class: hlb
                @Override // defpackage.lht
                public final void a(Object obj) {
                    BurstCurator burstCurator = (BurstCurator) obj;
                    synchronized (this.a) {
                        if (burstCurator != null) {
                            burstCurator.close();
                        }
                    }
                }
            });
        }
    }
}
