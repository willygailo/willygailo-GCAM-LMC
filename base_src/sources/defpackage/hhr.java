package defpackage;

import android.hardware.HardwareBuffer;
import com.google.android.libraries.camera.jni.yuv.YuvUtilNative;
import com.google.android.libraries.oliveoil.gl.EGLImage;
import com.google.googlex.gcam.YuvWriteView;
import com.google.googlex.gcam.imageproc.Resample;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hhr implements hht {
    private final pko a;
    private final mrg b;
    private hhu c;
    private hhs d;

    public hhr(pko pkoVar, mrg mrgVar) {
        this.a = pkoVar;
        this.b = mrgVar;
    }

    private final synchronized hhs b() {
        if (this.d == null) {
            this.d = new hhs(this.b);
        }
        return this.d;
    }

    private final synchronized hht c() {
        if (this.c == null) {
            this.c = new hhu(this.a);
        }
        return this.c;
    }

    @Override // defpackage.hht
    public final void a(mad madVar, mad madVar2) {
        HardwareBuffer hardwareBufferF = madVar.f();
        try {
            HardwareBuffer hardwareBufferF2 = madVar2.f();
            try {
                if (hardwareBufferF != null && hardwareBufferF2 != null) {
                    hhs hhsVarB = b();
                    mpi mpiVar = hhsVarB.a.b;
                    EGLImage eGLImage = new EGLImage(hardwareBufferF);
                    try {
                        EGLImage eGLImage2 = new EGLImage(hardwareBufferF2);
                        try {
                            mqg mqgVarB = mqg.b(mpiVar, eGLImage);
                            try {
                                mrd mrdVarK = mrd.k(mpiVar, eGLImage2);
                                try {
                                    hhsVarB.a.d(mqgVarB, mrdVarK);
                                    mwp.n(mpiVar);
                                    mrdVarK.close();
                                    mqgVarB.close();
                                    eGLImage2.close();
                                    eGLImage.close();
                                    hardwareBufferF2.close();
                                    hardwareBufferF.close();
                                    return;
                                } catch (Throwable th) {
                                    try {
                                        mrdVarK.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                try {
                                    mqgVarB.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    throw th3;
                                }
                            }
                        } catch (Throwable th5) {
                            try {
                                eGLImage2.close();
                                throw th5;
                            } catch (Throwable th6) {
                                throw th5;
                            }
                        }
                    } catch (Throwable th7) {
                        try {
                            eGLImage.close();
                            throw th7;
                        } catch (Throwable th8) {
                            throw th7;
                        }
                    }
                }
                if (madVar.a() != ((lve) madVar2).a || madVar.a() != 35) {
                    throw new UnsupportedOperationException("No transformer available to transform image!");
                }
                hht hhtVarC = c();
                madVar.getClass();
                obr.aF(madVar.a() == ((lve) madVar2).a);
                obr.aF(madVar.a() == 35);
                if (madVar.c() == ((lve) madVar2).b && madVar.b() == ((lve) madVar2).c) {
                    fcy fcyVar = ((hhu) hhtVarC).b;
                    obr.aF(madVar.a() == ((lve) madVar2).a);
                    obr.aF(madVar.a() != 34);
                    obr.aF(((lve) madVar2).a != 34);
                    lig ligVar = new lig(madVar.c(), madVar.b());
                    lig ligVar2 = new lig(((lve) madVar2).b, ((lve) madVar2).c);
                    boolean zEquals = ligVar.equals(ligVar2);
                    String strValueOf = String.valueOf(ligVar);
                    String strValueOf2 = String.valueOf(ligVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 60 + String.valueOf(strValueOf2).length());
                    sb.append("source image size ");
                    sb.append(strValueOf);
                    sb.append(" is different with destination image size ");
                    sb.append(strValueOf2);
                    obr.aG(zEquals, sb.toString());
                    if (madVar.a() != 35) {
                        int iA = madVar.a();
                        StringBuilder sb2 = new StringBuilder(37);
                        sb2.append("Unsupported image format: ");
                        sb2.append(iA);
                        throw new UnsupportedOperationException(sb2.toString());
                    }
                    List listG = madVar.g();
                    oom oomVarK = ((lve) madVar2).k();
                    if (!YuvUtilNative.copyYUV_420_888Native(madVar.c(), madVar.b(), ((mac) listG.get(0)).getBuffer(), ((mac) listG.get(1)).getBuffer(), ((mac) listG.get(2)).getBuffer(), ((mac) listG.get(0)).getRowStride(), ((mac) listG.get(1)).getRowStride(), ((mac) listG.get(1)).getPixelStride(), ((mac) oomVarK.get(0)).getBuffer(), ((mac) oomVarK.get(1)).getBuffer(), ((mac) oomVarK.get(2)).getBuffer(), ((mac) oomVarK.get(0)).getRowStride(), ((mac) oomVarK.get(1)).getRowStride(), ((mac) oomVarK.get(1)).getPixelStride())) {
                        throw new IllegalStateException("Copy failed.");
                    }
                    otj it = ((lve) madVar2).k().iterator();
                    while (it.hasNext()) {
                    }
                } else {
                    YuvWriteView yuvWriteViewC = ((hhu) hhtVarC).a.c(madVar);
                    YuvWriteView yuvWriteViewC2 = ((hhu) hhtVarC).a.c(madVar2);
                    long j = yuvWriteViewC.a;
                    long jE = YuvWriteView.e(yuvWriteViewC2);
                    obr.aG(j != 0, "src is null");
                    obr.aG(jE != 0, "dst is null");
                    Resample.resampleLanczosYuvImpl(j, 0.0f, jE);
                }
                if (hardwareBufferF2 != null) {
                    hardwareBufferF2.close();
                }
                if (hardwareBufferF != null) {
                    hardwareBufferF.close();
                }
            } catch (Throwable th9) {
                if (hardwareBufferF2 == null) {
                    throw th9;
                }
                try {
                    hardwareBufferF2.close();
                    throw th9;
                } catch (Throwable th10) {
                    throw th9;
                }
            }
        } catch (Throwable th11) {
            if (hardwareBufferF == null) {
                throw th11;
            }
            try {
                hardwareBufferF.close();
                throw th11;
            } catch (Throwable th12) {
                throw th11;
            }
        }
    }
}
