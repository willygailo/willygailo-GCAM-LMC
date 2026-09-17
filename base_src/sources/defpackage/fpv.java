package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.google.android.libraries.microvideo.xmp.nativemotionphotos.NativeMotionPhotoProcessor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class fpv implements mlk {
    public static final ouj a = ouj.h("com/google/android/apps/camera/microvideo/encoder/AddMetaTrackMuxer");
    public final pht b;
    public final pih c;
    public final pht d;
    public final pht e;
    public final pht f;
    public final boolean g;
    public final boolean h;
    private final mlk i;
    private final MediaFormat j;
    private final List k = new ArrayList();
    private final Executor l;

    public fpv(mlk mlkVar, boolean z, pht phtVar, pih pihVar, pht phtVar2, pht phtVar3, pht phtVar4, boolean z2, Executor executor) {
        this.i = mlkVar;
        this.e = phtVar3;
        this.f = phtVar4;
        this.l = executor;
        this.b = phtVar;
        this.c = pihVar;
        this.d = phtVar2;
        this.g = z2;
        this.h = z;
        MediaFormat mediaFormat = new MediaFormat();
        this.j = mediaFormat;
        mediaFormat.setString("mime", true != z ? "application/microvideo-image-meta" : "application/motionphoto-image-meta");
    }

    @Override // defpackage.mlk
    public final synchronized mln a() {
        mln mlnVarA;
        pih pihVarF;
        mlnVarA = this.i.a();
        pihVarF = pih.f();
        this.k.add(pihVarF);
        return new fpu(mlnVarA, pihVarF);
    }

    @Override // defpackage.mlk
    public final pht b() {
        return this.i.b();
    }

    @Override // defpackage.mlk
    public final void c() {
        this.i.c();
    }

    @Override // defpackage.mlk
    public final void d() {
        final pht phtVarR;
        pht phtVarS;
        final mln mlnVarA = this.i.a();
        mlnVarA.a(plk.V(this.j));
        mlnVarA.b(ByteBuffer.allocateDirect(0), new MediaCodec.BufferInfo());
        synchronized (this) {
            phtVarR = plk.R(this.k);
        }
        synchronized (this) {
            phtVarS = plk.S(phtVarR, this.d, this.e, this.b, this.f);
        }
        phtVarS.d(new Runnable() { // from class: fpt
            @Override // java.lang.Runnable
            public final void run() {
                fpv fpvVar = this.a;
                pht phtVar = phtVarR;
                mln mlnVar = mlnVarA;
                long jLongValue = -1;
                for (Long l : (List) plk.ae(phtVar)) {
                    if (l != null && (jLongValue < 0 || l.longValue() < jLongValue)) {
                        jLongValue = l.longValue();
                    }
                }
                long jMax = Math.max(jLongValue, 0L);
                long jLongValue2 = ((Long) plk.ae(fpvVar.b)).longValue();
                fpvVar.c.o(Long.valueOf(jMax));
                if (jLongValue2 < jMax) {
                    ((oug) ((oug) fpv.a.b()).G(1850)).u("A shutter timestamp (%d) with value less than the starting timestamp (%d) was selected. Overwriting timestamp with starting timestamp.", jLongValue2, jMax);
                }
                long jMax2 = Math.max(jMax, jLongValue2);
                boolean z = fpvVar.g;
                ojc ojcVar = (ojc) plk.ae(fpvVar.d);
                ojc ojcVarI = (ojc) plk.ae(fpvVar.e);
                ojc ojcVar2 = (ojc) plk.ae(fpvVar.f);
                boolean z2 = fpvVar.h;
                poy poyVarM = psp.g.m();
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                psp pspVar = (psp) poyVarM.b;
                int i = pspVar.a | 4;
                pspVar.a = i;
                pspVar.d = z;
                int i2 = i | 1;
                pspVar.a = i2;
                pspVar.b = jMax2;
                pspVar.a = i2 | 2;
                pspVar.c = jMax2 - jMax;
                if (ojcVar.g()) {
                    psv psvVar = (psv) ojcVar.c();
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = false;
                    }
                    psp pspVar2 = (psp) poyVarM.b;
                    pspVar2.e = psvVar;
                    pspVar2.a |= 8;
                }
                if (ojcVarI.g()) {
                    if (ojcVar2.g()) {
                        obr.aR(!z2, "meta + V2 isn't supported yet!");
                        pss pssVar = (pss) ojcVarI.c();
                        poy poyVar = (poy) pssVar.G(5);
                        poyVar.o(pssVar);
                        pst pstVar = (pst) ojcVar2.c();
                        if (poyVar.c) {
                            poyVar.m();
                            poyVar.c = false;
                        }
                        pss pssVar2 = (pss) poyVar.b;
                        pssVar2.e = pstVar;
                        pssVar2.a |= 4;
                        ojcVarI = ojc.i((pss) poyVar.j());
                    }
                    pss pssVar3 = (pss) ojcVarI.c();
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = false;
                    }
                    psp pspVar3 = (psp) poyVarM.b;
                    pspVar3.f = pssVar3;
                    pspVar3.a |= 16;
                }
                byte[] bArrA = z2 ? NativeMotionPhotoProcessor.a((psp) poyVarM.j()) : ((psp) poyVarM.j()).g();
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                bufferInfo.size = bArrA.length;
                bufferInfo.presentationTimeUs = jMax2;
                mlnVar.b(ByteBuffer.wrap(bArrA), bufferInfo);
                mlnVar.close();
            }
        }, this.l);
        this.i.d();
    }
}
