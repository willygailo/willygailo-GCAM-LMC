package defpackage;

import android.hardware.HardwareBuffer;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import com.google.android.libraries.oliveoil.gl.EGLImage;

/* JADX INFO: loaded from: classes.dex */
public final class fri implements fqx {
    public mrg b;
    private final MediaFormat d;
    private mpi e;
    private dyd f;
    private msd g;
    private Surface h;
    private msc i;
    private mrd j;
    private static final float[] c = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    public static final float[] a = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};

    public fri(MediaFormat mediaFormat) {
        MediaFormat mediaFormat2 = new MediaFormat(mediaFormat);
        this.d = mediaFormat2;
        mediaFormat2.setInteger("color-format", 2130708361);
    }

    private final synchronized void h() {
        mrg mrgVar = this.b;
        if (mrgVar != null) {
            mrgVar.close();
        }
        mrd mrdVar = this.j;
        if (mrdVar != null) {
            mrdVar.close();
        }
    }

    @Override // defpackage.fqx
    public final synchronized pht a() {
        msd msdVar;
        h();
        msdVar = this.g;
        return msdVar != null ? msdVar.a() : phq.a;
    }

    @Override // defpackage.fqx
    public final synchronized void b(mln mlnVar, mpi mpiVar, msn msnVar, Handler handler) {
        dyd dydVar;
        this.e = mpiVar;
        synchronized (dyd.class) {
            if (dyd.b == null) {
                dyd.b = mip.bM("gl-guard");
            }
            dydVar = new dyd(mpiVar, dyd.b);
        }
        this.f = dydVar;
        msd msdVarJ = mwp.j(new frc(mlnVar));
        msj msjVarC = ((msh) msdVarJ).c(this.d);
        msjVarC.c = handler;
        msjVarC.d = true;
        msjVarC.e = null;
        msjVarC.b(msnVar);
        msc mscVarA = msjVarC.a();
        Surface surfaceA = mscVarA.a();
        surfaceA.getClass();
        this.h = surfaceA;
        this.j = mrd.l(mpiVar, mwp.f(surfaceA), mme.d(this.d.getInteger("width"), this.d.getInteger("height")));
        msdVarJ.b();
        this.b = mrg.a(mpiVar);
        this.i = mscVarA;
        this.g = msdVarJ;
    }

    @Override // defpackage.fqx
    public final synchronized boolean c() {
        return this.i != null;
    }

    @Override // defpackage.fqx
    public final float[] d() {
        return c;
    }

    @Override // defpackage.fqx
    public final synchronized void e(mad madVar) {
        f(madVar, new fqw() { // from class: frh
            @Override // defpackage.fqw
            public final void a(mqg mqgVar, mrd mrdVar) {
                mrg mrgVar = this.a.b;
                mrgVar.getClass();
                mrgVar.e(mqgVar, mrdVar, fri.a);
            }
        });
    }

    @Override // defpackage.fqx
    public final synchronized void f(mad madVar, fqw fqwVar) {
        mrd mrdVar = this.j;
        mrdVar.getClass();
        dyd dydVar = this.f;
        dydVar.getClass();
        mpi mpiVar = this.e;
        mpiVar.getClass();
        dyc dycVarA = dydVar.a(madVar.f());
        try {
            if (dycVarA.a != null) {
                dyc dycVarA2 = dydVar.a(new EGLImage((HardwareBuffer) dycVarA.a()));
                try {
                    mqg mqgVarB = mqg.b(mpiVar, (EGLImage) dycVarA2.a());
                    try {
                        mrdVar.e(gdr.e, new gdq(madVar.d(), 3)).h(mmg.a);
                        fqwVar.a(mqgVarB, mrdVar);
                        mqgVarB.close();
                        dycVarA2.close();
                    } catch (Throwable th) {
                        try {
                            mqgVarB.close();
                        } catch (Throwable th2) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        dycVarA2.close();
                    } catch (Throwable th4) {
                    }
                    throw th3;
                }
            }
            dycVarA.close();
        } catch (Throwable th5) {
            try {
                dycVarA.close();
            } catch (Throwable th6) {
            }
            throw th5;
        }
    }

    @Override // defpackage.fqx
    public final void g() {
    }
}
