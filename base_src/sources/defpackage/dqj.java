package defpackage;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.util.ArrayMap;
import android.util.SizeF;
import com.google.android.libraries.oliveoil.gl.EGLImage;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class dqj implements jws {
    private static final ouj a = ouj.h("com/google/android/apps/camera/fastzoom/FastZoomEffect");
    private static final String b = oxk.e("\n").c("in vec2 position;", "uniform float zoomFactor;", "out vec2 texCoord;", "void main() {", "  texCoord = (1.0 + position) / 2.0;", "  gl_Position = vec4(zoomFactor * position, 0.0, 1.0);", "}");
    private static final String c = oxk.e("\n").c("#extension GL_EXT_YUV_target : enable", "precision highp float;", "uniform highp sampler2D imgTex;", "in vec2 texCoord;", "layout(yuv) out vec4 outColor;", "void main() {", "  outColor = vec4(rgb_2_yuv(texture(imgTex, texCoord).rgb, itu_601_full_range), 1.0);", "}");
    private static final float[] d = {-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f};
    private final mri f;
    private final mrg g;
    private final mpi h;
    private final dqe i;
    private mrf j;
    private lwd k;
    private final mrd n;
    private mrd o;
    private final Map e = new ArrayMap();
    private float l = 1.0f;
    private float m = 0.001953125f;

    public dqj(mpi mpiVar, dqe dqeVar) {
        this.h = mpiVar;
        this.i = dqeVar;
        mrj mrjVarA = mrj.a(d);
        int i = mrjVarA.a;
        int i2 = mrjVarA.c;
        mod[] modVarArr = {mrjVarA.b};
        int[] iArr = {i2};
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(((i2 * 32) * i) / 8).order(ByteOrder.nativeOrder());
        for (int i3 = 0; i3 < i; i3++) {
            mrjVarA.c(i3, byteBufferOrder);
        }
        this.f = new mri(mpa.b(mpiVar, 34962, byteBufferOrder), modVarArr, iArr, i);
        this.g = mrg.a(mpiVar);
        mqm mqmVarI = mrd.i(mpiVar);
        mqmVarI.a(mwp.g(mrd.h(mpiVar, b)));
        mqmVarI.a(mwp.g(mrd.b(mpiVar, c)));
        this.n = mqmVarI.b();
        this.k = (lwd) dqeVar.b.get();
    }

    private final boolean e(float f, float f2) {
        return Math.abs(f - f2) < this.m;
    }

    @Override // defpackage.jws
    public final jwt a() {
        return jwt.ZEBRAS;
    }

    @Override // defpackage.jws
    public final /* synthetic */ String b() {
        return mip.dL(this);
    }

    @Override // defpackage.jws
    public final boolean c() {
        return !e(this.i.a(), this.l);
    }

    @Override // defpackage.jws, defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        mrf mrfVar = this.j;
        if (mrfVar != null) {
            mrfVar.a();
            this.j = null;
        }
        mrd mrdVar = this.o;
        if (mrdVar != null) {
            mrdVar.a();
            this.o = null;
        }
        this.f.a();
        this.n.a();
        mrg mrgVar = this.g;
        mrd mrdVar2 = mrgVar.c;
        if (mrdVar2 != null) {
            mrdVar2.a();
            mrgVar.c = null;
        }
        mrd mrdVar3 = mrgVar.d;
        if (mrdVar3 != null) {
            mrdVar3.a();
            mrgVar.d = null;
        }
    }

    @Override // defpackage.jws
    public final void d(lmr lmrVar, lnx lnxVar, lmr lmrVar2) {
        dqi dqiVarA;
        lzr lzrVar;
        HardwareBuffer hardwareBufferF;
        dqi dqiVarA2;
        lzr lzrVar2;
        lwd lwdVar = (lwd) this.i.b.get();
        if (lwdVar == null) {
            return;
        }
        if (this.k == null) {
            this.k = lwdVar;
        }
        if (this.k == lwdVar && (dqiVarA = this.i.a.a()) != null) {
            if (this.j == null || this.o == null) {
                dqi dqiVarA3 = this.i.a.a();
                if (dqiVarA3 == null) {
                    return;
                }
                lig ligVar = dqiVarA3.b;
                mrf mrfVarG = mrf.g(this.h, new mor(mme.d(ligVar.a, ligVar.b)));
                this.j = mrfVarG;
                this.o = mrd.m(mwp.f(mrfVarG));
                this.m = 2.0f / Math.max(ligVar.a, ligVar.b);
            }
            mrf mrfVar = this.j;
            mrd mrdVar = this.o;
            lzv lzvVarC = lmrVar.c();
            if (mrdVar == null || mrfVar == null || lzvVarC == null || e(this.i.a(), this.l)) {
                return;
            }
            String str = (String) lzvVarC.d(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
            Map mapG = lzvVarC.g();
            if (str != null && !mapG.isEmpty() && (lzrVar2 = (lzr) mapG.get(str)) == null) {
                lzrVar = lzvVarC;
                lzrVar = lzvVarC;
                lzrVar = lzrVar2;
                Map.Entry entry = (Map.Entry) ((oor) mapG).entrySet().iterator().next();
                ((oug) ((oug) a.c()).G(905)).y("Missing camera metadata for activeId=%s. Resorting to metadata from id=%s", str, entry.getKey());
                str = (String) entry.getKey();
                lzrVar = (lzr) entry.getValue();
            }
            lzrVar = lzvVarC;
            lzrVar = lzvVarC;
            lzrVar = lzrVar2;
            lzrVar = lzvVarC;
            lzrVar = lzvVarC;
            lzrVar = lzvVarC;
            boolean z = true;
            if (this.e.isEmpty() && (dqiVarA2 = this.i.a.a()) != null) {
                List<lvs> listF = dqiVarA2.a.f();
                if (listF.size() > 1) {
                    lvp lvpVarD = dqiVarA2.a.d();
                    SizeF sizeF = (SizeF) lvpVarD.l(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
                    float[] fArr = (float[]) lvpVarD.l(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                    if (sizeF != null && fArr != null) {
                        float fI = oxh.I(fArr);
                        for (lvs lvsVar : listF) {
                            SizeF sizeF2 = (SizeF) dqiVarA2.a.a(lvsVar.a).l(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
                            if (sizeF2 != null) {
                                this.e.put(lvsVar.a, Float.valueOf((sizeF.getWidth() / fI) / sizeF2.getWidth()));
                            }
                        }
                    }
                }
            }
            Rect rect = (Rect) lzrVar.d(CaptureResult.SCALER_CROP_REGION);
            if (rect == null) {
                ((oug) ((oug) a.b()).G((char) 904)).o("Scaler crop region unexpectedly missing.");
                return;
            }
            Float f = (Float) lzrVar.d(CaptureResult.LENS_FOCAL_LENGTH);
            if (f == null) {
                ((oug) ((oug) a.b()).G((char) 903)).o("Focal length unexpectedly missing.");
                return;
            }
            float fFloatValue = this.e.containsKey(str) ? ((Float) this.e.get(str)).floatValue() * f.floatValue() : 1.0f;
            Rect rect2 = (Rect) dqiVarA.a.a(str).l(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            if (rect2 == null) {
                ((oug) ((oug) a.b()).G((char) 902)).o("Active array size unexpectedly missing.");
                return;
            }
            float fWidth = (rect2.width() / rect.width()) * fFloatValue;
            float fMax = Math.max(1.0f, this.i.a() / fWidth);
            this.l = fWidth;
            mad madVarD = lmrVar.d(lnxVar);
            try {
                if (madVarD == null) {
                    ((oug) ((oug) a.b()).G(901)).o("inputImage unexpectedly null");
                    return;
                }
                hardwareBufferF = madVarD.f();
                hardwareBufferF.getClass();
                EGLImage eGLImage = new EGLImage(hardwareBufferF);
                try {
                    mqg mqgVarB = mqg.b(this.h, eGLImage);
                    try {
                        mrd mrdVarK = mrd.k(this.h, eGLImage);
                        try {
                            this.g.d(mqgVarB, mrdVar);
                            mri mriVar = this.f;
                            if (mriVar.c % 3 != 0) {
                                z = false;
                            }
                            obr.aF(z);
                            mqb mqbVarA = new mpy(4, mriVar, null).a(this.n);
                            mqbVarA.c("position", 0);
                            mqbVarA.f("zoomFactor", fMax);
                            mqbVarA.e("imgTex", mrfVar);
                            mqbVarA.j(mrdVarK);
                            mwp.n(this.h);
                            mrdVarK.close();
                            mqgVarB.close();
                            eGLImage.close();
                            hardwareBufferF.close();
                            madVarD.close();
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
                        eGLImage.close();
                        throw th5;
                    } catch (Throwable th6) {
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                if (hardwareBufferF == null) {
                    throw th7;
                }
                try {
                    hardwareBufferF.close();
                    throw th7;
                } catch (Throwable th8) {
                    throw th7;
                }
            } finally {
                if (madVarD != null) {
                    try {
                        madVarD.close();
                    } catch (Throwable th9) {
                    }
                }
            }
        }
    }
}
