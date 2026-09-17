package defpackage;

import android.content.Context;
import android.hardware.HardwareBuffer;
import com.google.android.libraries.oliveoil.gl.EGLImage;
import com.google.mediapipe.framework.AndroidAssetUtil;
import com.google.mediapipe.framework.GraphTextureFrame;
import com.google.mediapipe.framework.TextureFrame;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class dpt implements dpx {
    private static final ouj d = ouj.h("com/google/android/apps/camera/faceobfuscation/GpuFaceObfuscationController");
    public final mpi a;
    public final mrg b;
    public volatile dps c;
    private final Executor e;
    private final pmv f;
    private volatile mrf g;
    private final gjw h;

    public dpt(gjw gjwVar, jtx jtxVar, Executor executor, Context context, byte[] bArr, byte[] bArr2) {
        AndroidAssetUtil.a(context);
        this.h = gjwVar;
        this.e = executor;
        mpi mpiVarH = jtxVar.h("faceobfuscation");
        this.a = mpiVarH;
        this.b = mrg.a(mpiVarH);
        final pih pihVarF = pih.f();
        mpiVarH.execute(new Runnable() { // from class: dpm
            @Override // java.lang.Runnable
            public final void run() {
                pihVarF.o(Long.valueOf(((mqq) this.a.a.h().c()).e().getNativeHandle()));
            }
        });
        try {
            pmv pmvVar = new pmv(context, ((Long) pihVarF.get(1000L, TimeUnit.MILLISECONDS)).longValue());
            this.f = pmvVar;
            pmw pmwVar = new pmw() { // from class: dpk
                @Override // defpackage.pmw
                public final void a(TextureFrame textureFrame) {
                    this.a.d(textureFrame);
                }
            };
            synchronized (pmvVar) {
                pmvVar.a = Arrays.asList(pmwVar);
            }
            if (pmvVar.b.getAndSet(true)) {
                return;
            }
            pmvVar.b();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new AssertionError("Unhandled exception");
        }
    }

    public final pht a(final HardwareBuffer hardwareBuffer, long j) throws Throwable {
        this.c = new dps(this, hardwareBuffer.getWidth(), hardwareBuffer.getHeight(), hardwareBuffer.getFormat(), hardwareBuffer.getLayers(), hardwareBuffer.getUsage(), j);
        EGLImage eGLImage = new EGLImage(hardwareBuffer);
        mqg mqgVarB = mqg.b(this.a, eGLImage);
        mrf mrfVarG = mrf.g(this.a, mqgVarB.g());
        mrd mrdVarM = mrd.m(mwp.f(mrfVarG));
        this.b.d(mqgVarB, mrdVarM);
        mrdVarM.close();
        mqgVarB.close();
        eGLImage.close();
        hardwareBuffer.close();
        this.g = mrfVarG;
        try {
            final mrf mrfVar = this.g;
            final pih pihVarF = pih.f();
            this.a.execute(new Runnable() { // from class: dpn
                @Override // java.lang.Runnable
                public final void run() {
                    pihVarF.o(Integer.valueOf(((mrb) mrfVar.c()).b));
                }
            });
            dpq dpqVar = new dpq(((Integer) pihVarF.get(1000L, TimeUnit.MILLISECONDS)).intValue(), mrfVar, j);
            pmv pmvVar = this.f;
            pmvVar.getClass();
            pmvVar.a(dpqVar);
            phu phuVarA = phu.a(new Callable() { // from class: dpo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    HardwareBuffer hardwareBuffer2;
                    dpt dptVar = this.a;
                    HardwareBuffer hardwareBuffer3 = hardwareBuffer;
                    dps dpsVar = dptVar.c;
                    dpsVar.getClass();
                    dpsVar.b.get(3000L, TimeUnit.MILLISECONDS);
                    synchronized (dpsVar.d) {
                        hardwareBuffer2 = dpsVar.e;
                    }
                    return new dpf(hardwareBuffer3, hardwareBuffer2, 0);
                }
            });
            this.e.execute(phuVarA);
            return phuVarA;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((oug) ((oug) d.c()).G((char) 893)).o("couldn't create input texture frame");
            return plk.U(e);
        }
    }

    @Override // defpackage.dpx
    public final pht b(HardwareBuffer hardwareBuffer) {
        return this.h.a(new dpp(this, hardwareBuffer, System.currentTimeMillis()));
    }

    public final synchronized void c() {
        this.b.close();
        if (this.g != null) {
            this.g.close();
        }
        this.a.close();
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.e.execute(new Runnable() { // from class: dpl
            @Override // java.lang.Runnable
            public final void run() {
                this.a.c();
            }
        });
    }

    final /* synthetic */ void d(final TextureFrame textureFrame) {
        if (this.g != null) {
            this.g.close();
        }
        try {
            if (this.c == null || !((Boolean) this.c.c.get(3000L, TimeUnit.MILLISECONDS)).booleanValue()) {
                textureFrame.release();
                return;
            }
            final dps dpsVar = this.c;
            if (((GraphTextureFrame) textureFrame).c == dpsVar.a && dpsVar.c.isDone()) {
                dpsVar.f.a.execute(new Runnable() { // from class: dpr
                    @Override // java.lang.Runnable
                    public final void run() {
                        dps dpsVar2 = dpsVar;
                        TextureFrame textureFrame2 = textureFrame;
                        synchronized (dpsVar2.d) {
                            EGLImage eGLImage = new EGLImage(dpsVar2.e);
                            mrd mrdVarK = mrd.k(dpsVar2.f.a, eGLImage);
                            mrf mrfVarH = mrf.h(dpsVar2.f.a, new mor(mmf.d(((GraphTextureFrame) textureFrame2).a, ((GraphTextureFrame) textureFrame2).b)), textureFrame2.getTextureName(), 3553);
                            mrg mrgVar = dpsVar2.f.b;
                            float[] fArr = mrg.a;
                            mrgVar.b(mrfVarH.b);
                            mrgVar.b(mrdVarK.b);
                            obr.aG(mrfVarH.b().c == ((mqq) mrdVarK.f()).l().c, "Data type of texture and canvas must match!");
                            mpy mpyVarA = mqb.a(mqo.a(mrdVarK.b));
                            mrh mrhVarD = mrgVar.b.d();
                            mrfVarH.b();
                            mqb mqbVarA = mpyVarA.a(mrgVar.c(mrhVarD, false));
                            mqbVarA.e("uImgTex", mrfVarH);
                            mqbVarA.i(fArr);
                            mqbVarA.c("aPosition", 0);
                            mqbVarA.c("aTexCoord", 1);
                            mqbVarA.j(mrdVarK);
                            mrfVarH.close();
                            mrdVarK.close();
                            eGLImage.close();
                            textureFrame2.release();
                        }
                        dpsVar2.b.o(true);
                    }
                });
            } else {
                ((oug) ((oug) d.c()).G((char) 897)).o("couldn't set result frame");
                textureFrame.release();
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((oug) ((oug) d.c()).G((char) 896)).o("couldn't wait for initialization of result texture");
            textureFrame.release();
        }
    }
}
