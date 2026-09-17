package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.os.SystemClock;
import android.util.SizeF;
import com.google.android.apps.camera.jni.eisutil.FrameUtilNative;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class ioo extends mip {
    final /* synthetic */ lmr a;
    final /* synthetic */ ioq b;

    public ioo(ioq ioqVar, lmr lmrVar) {
        this.b = ioqVar;
        this.a = lmrVar;
    }

    @Override // defpackage.mip
    public final void fG(lzv lzvVar) {
        if (lzvVar == null) {
            return;
        }
        this.b.t.a(lzvVar);
    }

    @Override // defpackage.mip
    public final void fy() {
        long nanos;
        lzr lzrVar;
        Rect rect;
        SizeF sizeF;
        Boolean bool;
        lzr lzrVar2;
        if (!((Boolean) this.b.e.d).booleanValue() || this.a.c() == null) {
            this.a.close();
            return;
        }
        synchronized (this.b.o) {
            if (!this.a.i().c.contains(this.b.V)) {
                ((oug) ((oug) ioq.a.c()).G(3063)).o("The source of the frame is incorrect");
                this.a.close();
                return;
            }
            iqx iqxVar = null;
            if (!this.b.d.k(deg.d) && this.b.x.c()) {
                lzv lzvVarC = this.a.c();
                lzvVarC.getClass();
                ioq ioqVar = this.b;
                lvp lvpVarA = ioqVar.L;
                if (ioqVar.j.e() && lvpVarA.L()) {
                    String str = (String) lzvVarC.d(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
                    str.getClass();
                    lzr lzrVar3 = (lzr) lzvVarC.g().get(str);
                    if (lzrVar3 != null) {
                        lzrVar = lzvVarC;
                        lzrVar = lzvVarC;
                        lzrVar2 = lzvVarC;
                        lzrVar2 = lzrVar3;
                    }
                    lzrVar = lzvVarC;
                    lzrVar = lzvVarC;
                    lzrVar2 = lzvVarC;
                    lvpVarA = this.b.M.a(str);
                    lce lceVar = new lce((Float) this.b.r.fA());
                    if (this.b.M.g(str)) {
                        lceVar.fB(Float.valueOf(Math.max(1.0f, ((Float) lceVar.d).floatValue() / 1.615f)));
                    }
                    ioq ioqVar2 = this.b;
                    lco lcoVar = ioqVar2.q;
                    lhs lhsVarH = lhs.h(ioqVar2.O.c());
                    ioq ioqVar3 = this.b;
                    ioqVar2.R = new gsn(lcoVar, lceVar, lvpVarA, lhsVarH, ioqVar3.d, ioqVar3.i);
                    lzrVar = lzrVar2;
                }
                lzrVar = lzvVarC;
                lzrVar = lzvVarC;
                lzrVar = lzvVarC;
                iqw iqwVar = new iqw();
                iqwVar.a = lzrVar;
                iqwVar.e = Integer.valueOf(((Integer) this.b.d.a(ddl.o).c()).intValue());
                iqwVar.d = Boolean.valueOf(this.b.d.k(ddl.at));
                iqwVar.b = lvpVarA.h();
                iqwVar.c = (SizeF) lvpVarA.n(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
                iqwVar.f = Float.valueOf(((Float) this.b.r.fA()).floatValue());
                Rect rect2 = ((gsm) this.b.R.fA()).a;
                if (rect2 == null) {
                    throw new NullPointerException("Null cropRegion");
                }
                iqwVar.g = rect2;
                lzr lzrVar4 = iqwVar.a;
                if (lzrVar4 == null || (rect = iqwVar.b) == null || (sizeF = iqwVar.c) == null || (bool = iqwVar.d) == null || iqwVar.e == null || iqwVar.f == null || iqwVar.g == null) {
                    StringBuilder sb = new StringBuilder();
                    if (iqwVar.a == null) {
                        sb.append(" metadata");
                    }
                    if (iqwVar.b == null) {
                        sb.append(" sensorInfoActiveArraySize");
                    }
                    if (iqwVar.c == null) {
                        sb.append(" sensorInfoPhysicalSize");
                    }
                    if (iqwVar.d == null) {
                        sb.append(" supportOis");
                    }
                    if (iqwVar.e == null) {
                        sb.append(" oisApiVersion");
                    }
                    if (iqwVar.f == null) {
                        sb.append(" digitalZoomRatio");
                    }
                    if (iqwVar.g == null) {
                        sb.append(" cropRegion");
                    }
                    String strValueOf = String.valueOf(sb);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
                    sb2.append("Missing required properties:");
                    sb2.append(strValueOf);
                    throw new IllegalStateException(sb2.toString());
                }
                iqxVar = new iqx(lzrVar4, rect, sizeF, bool.booleanValue(), iqwVar.e.intValue(), iqwVar.f.floatValue(), iqwVar.g);
            }
            inx inxVar = this.b.u;
            this.a.c().getClass();
            inxVar.h.b();
            synchronized (this.b.o) {
                if (this.b.d.k(deg.d)) {
                    ioq ioqVar4 = this.b;
                    iod iodVar = ioqVar4.v;
                    lmr lmrVar = this.a;
                    lnx lnxVar = ioqVar4.V;
                    lnxVar.getClass();
                    synchronized (iodVar.s) {
                        if (iodVar.A == null) {
                            ((oug) ((oug) iod.a.b()).G(3056)).o("onImageAvailable() No ImageWriter available");
                            lmrVar.close();
                        } else if (iodVar.B == null) {
                            ((oug) ((oug) iod.a.b()).G(3055)).o("onImageAvailable() No Camcorder available");
                            lmrVar.close();
                        } else {
                            mad madVarD = lmrVar.d(lnxVar);
                            if (madVarD == null) {
                                ((oug) ((oug) iod.a.b()).G((char) 3054)).o("onImageAvailable() ImageProxy is null");
                                lmrVar.close();
                            } else {
                                iodVar.q.b();
                                long j = iodVar.k.get();
                                synchronized (iodVar.s) {
                                    iql iqlVar = iodVar.u;
                                    iqlVar.getClass();
                                    iqm iqmVarC = iodVar.y.c(iodVar.d.a());
                                    if (!iodVar.w.g()) {
                                        iqlVar.f(iqmVarC);
                                        iqlVar.d(iqmVarC);
                                    } else if (iodVar.w.c() != iqmVarC) {
                                        iqlVar.d(iqmVarC);
                                    }
                                    iodVar.w = ojc.i(iqmVarC);
                                    int i = iodVar.y.e;
                                    double dA = iodVar.d.a();
                                    double d = i;
                                    Double.isNaN(d);
                                    if ((j % ((long) ((int) (d / dA))) == 0 && !iodVar.c.get()) || iodVar.b.get()) {
                                        long j2 = iodVar.l.get();
                                        int i2 = iodVar.y.f;
                                        if (iodVar.i.get() == 0) {
                                            iodVar.i.set(TimeUnit.MILLISECONDS.toNanos(SystemClock.uptimeMillis()));
                                            nanos = iodVar.i.get();
                                        } else {
                                            nanos = iodVar.o.get() + iodVar.i.get() + (TimeUnit.SECONDS.toNanos(j2) / ((long) i2));
                                        }
                                        iodVar.q.b();
                                        try {
                                            iodVar.A.a(madVarD, nanos);
                                            iodVar.l.incrementAndGet();
                                            iqlVar.c(iqmVarC);
                                            ios iosVar = iodVar.z;
                                            if (iosVar != null) {
                                                iosVar.a(iodVar.l.get(), iodVar.y.f);
                                            }
                                        } catch (llv e) {
                                            e.printStackTrace();
                                        }
                                    }
                                    iqlVar.b(iqmVarC);
                                }
                                iodVar.k.incrementAndGet();
                                iodVar.g.incrementAndGet();
                                madVarD.close();
                                lmrVar.close();
                            }
                        }
                    }
                } else {
                    ioq ioqVar5 = this.b;
                    ink inkVar = ioqVar5.l;
                    lmr lmrVar2 = this.a;
                    lnx lnxVar2 = ioqVar5.V;
                    lnxVar2.getClass();
                    ojc ojcVarH = ojc.h(iqxVar);
                    inkVar.w.b();
                    mad madVarD2 = lmrVar2.d(lnxVar2);
                    if (madVarD2 == null) {
                        ((oug) ((oug) ink.a.c()).G((char) 3029)).o("onImageAvailable() imageProxy is null");
                        lmrVar2.close();
                    } else {
                        boolean z = inkVar.c.get();
                        if (ojcVarH.g()) {
                            iqq iqqVar = inkVar.F;
                            iqqVar.getClass();
                            boolean z2 = (((iqs) iqqVar).a.b.get() <= 0) & z;
                            iqqVar.a(inkVar.r.get(), lmrVar2, madVarD2, (iqx) ojcVarH.c(), inkVar.g(inkVar.r.get(), inkVar.K.e, inkVar.f.a(), false, oih.a) && z2, ojc.i(Boolean.valueOf(z2)));
                            z = z2;
                        } else {
                            int iC = madVarD2.c();
                            int iB = madVarD2.b();
                            int rowStride = ((mac) madVarD2.g().get(0)).getRowStride();
                            int rowStride2 = ((mac) madVarD2.g().get(2)).getRowStride();
                            enl enlVar = inkVar.O;
                            FrameUtilNative.convertNV21ToNV12(((mac) madVarD2.g().get(0)).getBuffer(), rowStride, ((mac) madVarD2.g().get(2)).getBuffer(), rowStride2, iC, iB);
                            inkVar.f(inkVar.r.get(), lmrVar2, madVarD2, oih.a, oih.a);
                        }
                        if (z) {
                            if (inkVar.e.get()) {
                                inkVar.e.set(false);
                            } else {
                                inkVar.r.incrementAndGet();
                            }
                        }
                        inkVar.p.incrementAndGet();
                    }
                }
            }
        }
    }
}
