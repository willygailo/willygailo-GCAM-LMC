package defpackage;

import android.graphics.Bitmap;
import android.hardware.HardwareBuffer;
import android.util.Size;
import android.view.Surface;
import com.google.android.libraries.camera.jni.surface.SurfaceNative;
import com.google.android.libraries.oliveoil.gl.EGLImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class jwp implements jwx {
    private final Set b;
    private final jww d;
    private final ljf e;
    private Surface f;
    public final List a = new ArrayList();
    private final Map c = new HashMap();
    private boolean g = false;

    public jwp(Set set, jww jwwVar, ljf ljfVar) {
        this.b = set;
        this.d = jwwVar;
        this.e = ljfVar;
    }

    @Override // defpackage.jwx
    public final void a(lmv lmvVar, lnx lnxVar) {
        this.d.d(lmvVar, lnxVar);
    }

    public final synchronized void b() {
        jws jwsVarA;
        if (this.g) {
            return;
        }
        jww jwwVar = this.d;
        ArrayList arrayList = new ArrayList(this.b);
        Collections.sort(arrayList, cdg.n);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            jwv jwvVar = (jwv) arrayList.get(i);
            if (((Boolean) jwvVar.b.fA()).booleanValue()) {
                if (this.c.get(jwvVar) == null) {
                    jwsVarA = jwvVar.a.a(this.d);
                    this.c.put(jwvVar, jwsVarA);
                } else {
                    jwsVarA = (jws) this.c.get(jwvVar);
                }
                arrayList2.add(jwsVarA);
            }
        }
        jwwVar.g(arrayList2);
    }

    @Override // defpackage.jwr
    public final ojc c(int i, int i2) {
        HardwareBuffer hardwareBufferF;
        ojc ojcVarI;
        jww jwwVar = this.d;
        synchronized (jwwVar) {
            if (((jwm) jwwVar).k) {
                ((oug) ((oug) jwm.a.c()).G(3526)).o("cannot take screenshot after viewfinder effects pipeline is closed");
                ojcVarI = oih.a;
            } else {
                lmr lmrVar = ((jwm) jwwVar).h;
                if (lmrVar == null) {
                    ((oug) ((oug) jwm.a.c()).G(3525)).o("no frame found to save as screenshot");
                    ojcVarI = oih.a;
                } else {
                    mad madVarD = lmrVar.d(((jwm) jwwVar).g);
                    try {
                        if (madVarD == null) {
                            ((oug) ((oug) jwm.a.c()).G(3524)).o("can't save screenshot as frame has no associated YUV image");
                            ojcVarI = oih.a;
                        } else {
                            hardwareBufferF = madVarD.f();
                            if (hardwareBufferF == null) {
                                ((oug) ((oug) jwm.a.c()).G(3523)).o("can't save screenshot as YUV image has no associated HardwareBuffer");
                                ojcVarI = oih.a;
                                madVarD.close();
                            } else {
                                lwd lwdVar = ((jwm) jwwVar).f;
                                lwd lwdVar2 = lwd.FRONT;
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                                EGLImage eGLImage = new EGLImage(hardwareBufferF);
                                try {
                                    mqg mqgVarB = mqg.b(((jwm) jwwVar).c, eGLImage);
                                    try {
                                        mtp mtpVarA = mtr.a(bitmapCreateBitmap);
                                        mrd mrdVarN = mrd.n(((jwm) jwwVar).b(), ((mtq) mtpVarA).a);
                                        try {
                                            mrg mrgVarA = mrg.a(((jwm) jwwVar).b());
                                            try {
                                                float[] fArr = {0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
                                                if (lwdVar == lwdVar2) {
                                                    fArr[4] = -1.0f;
                                                    fArr[12] = 1.0f;
                                                }
                                                mrgVarA.e(mqgVarB, mrdVarN, fArr);
                                                mrdVarN.j(mtpVarA);
                                                mwp.n(((jwm) jwwVar).c);
                                                mrgVarA.close();
                                                mrdVarN.close();
                                                mqgVarB.close();
                                                eGLImage.close();
                                                ojcVarI = ojc.i(bitmapCreateBitmap);
                                                hardwareBufferF.close();
                                                madVarD.close();
                                            } catch (Throwable th) {
                                                try {
                                                    mrgVarA.close();
                                                    throw th;
                                                } catch (Throwable th2) {
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            try {
                                                mrdVarN.close();
                                                throw th3;
                                            } catch (Throwable th4) {
                                                throw th3;
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        try {
                                            mqgVarB.close();
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
                        }
                    } catch (Throwable th9) {
                        if (hardwareBufferF == null) {
                            throw th9;
                        }
                        try {
                            hardwareBufferF.close();
                            throw th9;
                        } catch (Throwable th10) {
                            throw th9;
                        }
                    } finally {
                        if (madVarD != null) {
                            try {
                                madVarD.close();
                            } catch (Throwable th11) {
                            }
                        }
                    }
                }
            }
        }
        return ojcVarI;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final synchronized void close() {
        obr.aR(!this.g, "ViewfinderFilter is closed already");
        this.g = true;
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((lie) it.next()).close();
            }
            this.d.close();
            Surface surface = this.f;
            if (surface != null) {
                surface.release();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.jwx
    public final synchronized void d(Surface surface, int i, Size size) {
        obr.aR(surface.isValid(), "Surface is invalid: ignoring set filter output");
        Surface surface2 = this.f;
        if (surface == surface2) {
            return;
        }
        this.e.e("setSurfaceGeometry");
        int surfaceGeometry = SurfaceNative.setSurfaceGeometry(surface, size.getWidth(), size.getHeight(), i);
        if (surfaceGeometry != 0) {
            ((oug) ((oug) jwq.a.b()).G(3536)).p("Failed to setSurfaceGeometry: %d", surfaceGeometry);
        }
        this.e.f();
        this.f = surface;
        this.d.f(surface, size);
        if (surface2 != null) {
            surface2.release();
        }
    }
}
