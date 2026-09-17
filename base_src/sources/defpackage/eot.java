package defpackage;

import android.hardware.HardwareBuffer;
import android.location.Location;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.opengl.Matrix;
import android.view.Surface;
import com.google.android.libraries.oliveoil.gl.EGLImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class eot implements lie {
    public static final ouj a = ouj.h("com/google/android/apps/camera/kepler/AstrolapseEncoder");
    private static final float[] g = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
    public final ExecutorService b = mip.bM("resource-closing");
    public final mpi c;
    public final mrg d;
    public final Surface e;
    public final mrd f;
    private final msd h;
    private final lic i;
    private final Executor j;
    private final AtomicBoolean k;

    /* JADX WARN: Type inference failed for: r13v10, types: [mtc, mtd] */
    public eot(jtx jtxVar, fix fixVar, Executor executor, final FileOutputStream fileOutputStream, lig ligVar, lic licVar, byte[] bArr, byte[] bArr2) {
        Surface surfaceCreatePersistentInputSurface = MediaCodec.createPersistentInputSurface();
        this.e = surfaceCreatePersistentInputSurface;
        this.k = new AtomicBoolean(false);
        this.i = licVar;
        lig ligVarI = ligVar.i(licVar);
        ovd ovdVar = ovl.a;
        int i = licVar.e;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", ligVarI.a, ligVarI.b);
        mediaFormatCreateVideoFormat.setInteger("profile", 8);
        mediaFormatCreateVideoFormat.setInteger("level", 32768);
        mediaFormatCreateVideoFormat.setInteger("bitrate", 38000000);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", 10);
        mediaFormatCreateVideoFormat.setFloat("i-frame-interval", 1.0f);
        ?? H = mwp.h(executor);
        H.c(fileOutputStream.getFD());
        H.b(0);
        ojc ojcVarD = fixVar.d();
        if (ojcVarD.g()) {
            Location location = (Location) ojcVarD.c();
            mtb mtbVar = (mtb) H;
            mtbVar.b = plk.V(Float.valueOf((float) location.getLatitude()));
            mtbVar.c = plk.V(Float.valueOf((float) location.getLongitude()));
        }
        msr msrVarA = H.a();
        ((msv) msrVarA).g.d(new Runnable() { // from class: eor
            @Override // java.lang.Runnable
            public final void run() {
                FileOutputStream fileOutputStream2 = fileOutputStream;
                ouj oujVar = eot.a;
                try {
                    ovd ovdVar2 = ovl.a;
                    fileOutputStream2.close();
                } catch (IOException e) {
                    ((oug) ((oug) ((oug) eot.a.b().g(ovl.a, "KeplerEncoder")).h(e)).G((char) 1312)).o("Could not close file.");
                }
            }
        }, executor);
        msd msdVarJ = mwp.j(msrVarA);
        this.h = msdVarJ;
        msj msjVarC = ((msh) msdVarJ).c(mediaFormatCreateVideoFormat);
        msjVarC.d = false;
        msjVarC.e = surfaceCreatePersistentInputSurface;
        msjVarC.a();
        mpi mpiVarH = jtxVar.h("glContext");
        this.c = mpiVarH;
        this.d = mrg.a(mpiVarH);
        this.f = mrd.l(mpiVarH, new mrn(surfaceCreatePersistentInputSurface), mmf.d(ligVarI.a, ligVarI.b));
        msdVarJ.b();
        this.j = executor;
    }

    private static float[] d(lic licVar) {
        float[] fArr = (float[]) g.clone();
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArr, 0, licVar.e, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
        return fArr;
    }

    public final synchronized pht a() {
        c();
        return ((msh) this.h).b.b();
    }

    public final synchronized void b(final HardwareBuffer hardwareBuffer, long j) {
        if (this.k.get()) {
            ((oug) ((oug) a.c().g(ovl.a, "KeplerEncoder")).G((char) 1314)).o("Shutdown already called. Skipping additional requests.");
            hardwareBuffer.close();
            return;
        }
        final EGLImage eGLImage = new EGLImage(hardwareBuffer);
        try {
            mqg mqgVarB = mqg.b(this.c, eGLImage);
            try {
                this.f.e(gdr.b, new gdq(j, 1));
                this.d.e(mqgVarB, this.f, d(this.i));
                this.b.execute(new Runnable() { // from class: eoq
                    @Override // java.lang.Runnable
                    public final void run() {
                        eot eotVar = this.a;
                        EGLImage eGLImage2 = eGLImage;
                        HardwareBuffer hardwareBuffer2 = hardwareBuffer;
                        mwp.n(eotVar.c);
                        eGLImage2.close();
                        hardwareBuffer2.close();
                    }
                });
                mqgVarB.close();
                eGLImage.close();
            } catch (Throwable th) {
                try {
                    mqgVarB.close();
                } catch (Throwable th2) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                eGLImage.close();
            } catch (Throwable th4) {
            }
            throw th3;
        }
    }

    public final void c() {
        if (this.k.getAndSet(true)) {
            ((oug) ((oug) a.c().g(ovl.a, "KeplerEncoder")).G((char) 1316)).o("Shutdown already called. Skipping additional requests.");
        } else {
            ovd ovdVar = ovl.a;
            this.h.a().d(new Runnable() { // from class: eop
                @Override // java.lang.Runnable
                public final void run() {
                    eot eotVar = this.a;
                    ovd ovdVar2 = ovl.a;
                    eotVar.d.close();
                    eotVar.f.close();
                    eotVar.c.close();
                    eotVar.e.release();
                    eotVar.b.shutdown();
                }
            }, this.j);
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        c();
    }
}
