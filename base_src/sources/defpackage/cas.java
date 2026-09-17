package defpackage;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.HardwareBuffer;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.apps.camera.bottombar.R;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import com.google.android.libraries.oliveoil.gl.EGLImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class cas implements dbg, fik, fii, fij, ias, hsb, cbl, itv, cav, lyy {
    public static final ouj a = ouj.h("com/google/android/apps/camera/brella/BeholderExampleGenerator");
    private lwd A;
    private lap B;
    private Rect C;
    private final lco L;
    private final lda M;
    private boolean N;
    private final gvb S;
    private final kij T;
    public final ddf b;
    public final hrx c;
    public final cdf d;
    public final lar e;
    public final cdp f;
    public final ExecutorService g;
    public final fhv k;
    private final ojc l;
    private final ojc m;
    private final dqx n;
    private final dqx o;
    private final dqx p;
    private final dqx q;
    private final ona r;
    private final huf s;
    private final ojc t;
    private final caw u;
    private final CameraActivityTiming v;
    private final mdf w;
    private final int x;
    private final cef y;
    private hjz z;
    public boolean h = false;
    private final Queue G = ona.c(1);
    private final List H = new ArrayList();
    public long i = 0;
    private final cdj D = new cdj();
    private long E = -1;
    private long F = -1;
    private final AtomicInteger I = new AtomicInteger(0);
    private final AtomicInteger J = new AtomicInteger(0);
    private final AtomicInteger K = new AtomicInteger(0);
    public final AtomicLong j = new AtomicLong(-1);
    private int O = 0;
    private int P = 0;
    private int Q = 90;
    private int R = lic.CLOCKWISE_0.e;

    public cas(ddf ddfVar, lar larVar, fhv fhvVar, hrx hrxVar, cdf cdfVar, kij kijVar, huf hufVar, mdf mdfVar, CameraActivityTiming cameraActivityTiming, ojc ojcVar, caw cawVar, cef cefVar, cdp cdpVar, gvb gvbVar, lco lcoVar, lda ldaVar, ojc ojcVar2, ojc ojcVar3, dqx dqxVar, dqx dqxVar2, dqx dqxVar3, dqx dqxVar4, int i, ExecutorService executorService) {
        this.b = ddfVar;
        this.c = hrxVar;
        this.d = cdfVar;
        this.e = larVar;
        this.k = fhvVar;
        this.l = ojcVar2;
        this.m = ojcVar3;
        this.T = kijVar;
        this.s = hufVar;
        this.t = ojcVar;
        this.u = cawVar;
        this.g = executorService;
        this.x = i;
        this.r = ona.c(i);
        this.w = mdfVar;
        this.v = cameraActivityTiming;
        this.L = lcoVar;
        this.M = ldaVar;
        this.f = cdpVar;
        this.n = dqxVar;
        this.o = dqxVar2;
        this.p = dqxVar3;
        this.q = dqxVar4;
        this.y = cefVar;
        this.S = gvbVar;
    }

    private static void A(poy poyVar, String str, float... fArr) {
        poy poyVarM = qyt.b.m();
        for (float f : fArr) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qyt qytVar = (qyt) poyVarM.b;
            qytVar.i();
            qytVar.a.g(f);
        }
        poy poyVarM2 = qyq.c.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        qyq qyqVar = (qyq) poyVarM2.b;
        qyt qytVar2 = (qyt) poyVarM.j();
        qytVar2.getClass();
        qyqVar.b = qytVar2;
        qyqVar.a = 2;
        poyVar.ap(str, (qyq) poyVarM2.j());
    }

    private static void B(poy poyVar, String str, long j) {
        poy poyVarM = qyq.c.m();
        poy poyVarM2 = qyu.b.m();
        poyVarM2.aq(j);
        qyu qyuVar = (qyu) poyVarM2.j();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        qyq qyqVar = (qyq) poyVarM.b;
        qyuVar.getClass();
        qyqVar.b = qyuVar;
        qyqVar.a = 3;
        poyVar.ap(str, (qyq) poyVarM.j());
    }

    private final synchronized void C(poy poyVar, int i) {
        if (this.G.isEmpty()) {
            return;
        }
        RectF rectF = (RectF) this.G.poll();
        if (rectF == null) {
            return;
        }
        PointF pointFU = mip.U(new PointF(rectF.left, rectF.top), i);
        PointF pointFU2 = mip.U(new PointF(rectF.right, rectF.bottom), i);
        A(poyVar, "tracking/left", Math.min(pointFU.x, pointFU2.x));
        A(poyVar, "tracking/top", Math.min(pointFU.y, pointFU2.y));
        A(poyVar, "tracking/right", Math.max(pointFU.x, pointFU2.x));
        A(poyVar, "tracking/bottom", Math.max(pointFU.y, pointFU2.y));
    }

    private static final void D(dqx dqxVar, String str, poy poyVar) {
        float fA;
        if (dqxVar.e()) {
            fA = Float.NaN;
        } else {
            dqxVar.d();
            fA = dqxVar.d().a();
        }
        if (Float.isNaN(fA)) {
            return;
        }
        A(poyVar, str, fA);
    }

    private final void x() {
        this.r.clear();
        y();
        this.I.set(0);
        this.J.set(0);
        this.K.set(0);
        this.i = 0L;
        this.z = null;
    }

    private final synchronized void y() {
        this.G.clear();
        this.H.clear();
    }

    private static void z(poy poyVar, String str, Iterable iterable) {
        poy poyVarM = qyq.c.m();
        poy poyVarM2 = qyt.b.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        qyt qytVar = (qyt) poyVarM2.b;
        qytVar.i();
        pnl.e(iterable, qytVar.a);
        qyt qytVar2 = (qyt) poyVarM2.j();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        qyq qyqVar = (qyq) poyVarM.b;
        qytVar2.getClass();
        qyqVar.b = qytVar2;
        qyqVar.a = 2;
        poyVar.ap(str, (qyq) poyVarM.j());
    }

    @Override // defpackage.iat
    public final void a() {
    }

    @Override // defpackage.iat
    public final void b(iay iayVar) {
    }

    @Override // defpackage.ias
    public final void c(lvp lvpVar) {
        this.A = lvpVar.k();
        this.Q = lvpVar.f();
        this.C = (Rect) lvpVar.l(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        this.r.clear();
    }

    @Override // defpackage.fij
    public final void e() {
        lap lapVar = this.B;
        if (lapVar != null) {
            lapVar.close();
            this.B = null;
        }
        if (this.t.g()) {
            ((itw) this.t.c()).g(this);
        }
        this.u.b = null;
        this.S.h(this);
        if (this.b.k(ddl.bd)) {
            this.f.close();
        }
        if (this.N) {
            poy poyVarM = qys.b.m();
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j = this.E;
            B(poyVarM, "session/id", this.j.get());
            B(poyVarM, "session/duration", jElapsedRealtimeNanos - j);
            B(poyVarM, "session/total_image_count", this.O);
            B(poyVarM, "session/total_other_mode", this.P);
            cdf cdfVar = this.d;
            long j2 = this.j.get();
            poy poyVarM2 = qyp.b.m();
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            qyp qypVar = (qyp) poyVarM2.b;
            qys qysVar = (qys) poyVarM.j();
            qysVar.getClass();
            qypVar.a = qysVar;
            plk.af(cdfVar.i(j2, ((qyp) poyVarM2.j()).g()), new cdd(1), this.g);
            this.j.set(-1L);
        }
        this.O = 0;
        this.P = 0;
    }

    @Override // defpackage.cbl
    public final void f(jrl jrlVar) {
        jrlVar.name();
        hsr hsrVar = hsr.UNKNOWN;
        switch (jrlVar.ordinal()) {
            case 3:
                this.K.set(1);
                break;
            case 6:
                this.I.set(1);
                break;
            case 12:
                this.J.set(1);
                break;
        }
    }

    @Override // defpackage.fii
    public final void fW() {
        lap lapVar = new lap();
        this.c.a(this);
        lapVar.c(new lie() { // from class: cam
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                cas casVar = this.a;
                casVar.c.i(casVar);
            }
        });
        this.B = lapVar;
        ddf ddfVar = this.b;
        ddi ddiVar = ddl.a;
        ddfVar.b();
        plk.af(mip.I(this.T.k()), new car(this, 0), pgr.INSTANCE);
        if (this.t.g()) {
            ((itw) this.t.c()).e(this);
        }
        this.u.b = this;
        this.S.g(this);
        if (this.b.k(ddl.bd)) {
            this.f.c();
        }
        boolean zK = this.b.k(ddl.be);
        this.N = zK;
        if (!zK || this.j.get() > -1) {
            return;
        }
        plk.af(this.d.c(), new car(this, 2), this.g);
    }

    @Override // defpackage.dbg
    public final void g(long j, Map map) {
        this.D.c(map);
    }

    @Override // defpackage.lyy
    public final void h(lic licVar) {
        this.R = licVar.e;
    }

    @Override // defpackage.ias
    public final void i(lzv lzvVar) {
        Rect rect = this.C;
        if (rect == null) {
            return;
        }
        hjz hjzVar = new hjz(lzvVar, 0, rect);
        this.z = hjzVar;
        this.r.add(Float.valueOf(hjzVar.c * 1.0E-6f * hjzVar.f * hjzVar.e));
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void j(hsp hspVar) {
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void k(hsp hspVar, Bitmap bitmap, int i) {
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void l(hsp hspVar) {
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void m(long j) {
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void n(Bitmap bitmap) {
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void o(hsp hspVar, lif lifVar) {
    }

    @Override // defpackage.hsb
    public final void p(hsp hspVar, hsj hsjVar, hss hssVar) {
        int i;
        fto ftoVar;
        int i2;
        Rect rect;
        Rect rect2;
        if (hssVar == hss.MARS_STORE) {
            x();
            return;
        }
        this.O++;
        jrl jrlVar = jrl.UNINITIALIZED;
        hsr hsrVar = hsr.UNKNOWN;
        switch (hsjVar.c.ordinal()) {
            case 1:
            case 2:
            case 3:
                i = 0;
                break;
            case 5:
            case 11:
                i = 1;
                break;
            case 10:
                i = 3;
                break;
            case 12:
                i = 2;
                break;
            case 16:
                i = 4;
                break;
            default:
                this.P++;
                i = -1;
                break;
        }
        if (this.h && i != -1) {
            final int iC = brg.c(this.Q, this.R, this.A == lwd.FRONT, this.b);
            final poy poyVarM = qys.b.m();
            B(poyVarM, "CAMERA/mode", i);
            B(poyVarM, "metadata/image_rotation_degrees", iC);
            B(poyVarM, "smarts/portrait", this.I.get());
            B(poyVarM, "smarts/long_exposure", this.J.get());
            B(poyVarM, "smarts/imax", this.K.get());
            ojc ojcVarB = this.D.b();
            if (ojcVarB.g()) {
                z(poyVarM, "ICA/labels", (Iterable) ojcVarB.c());
            }
            ojc ojcVarA = this.D.a();
            if (ojcVarA.g()) {
                z(poyVarM, "ICA/embeddings", (Iterable) ojcVarA.c());
                ((List) ojcVarA.c()).size();
            }
            ftm ftmVarA = !((dqx) ((ojj) this.l).a).e() ? ftm.a(((dqx) ((ojj) this.l).a).d()) : null;
            lwd lwdVar = this.A;
            if (lwdVar != null) {
                int i3 = lwdVar == lwd.FRONT ? 1 : 0;
                B(poyVarM, "CAMERA/front", i3);
                huf hufVar = this.s;
                if (hufVar != null) {
                    String str = (String) hufVar.c(htu.i);
                    if (i3 == 1) {
                        str = (String) this.s.c(htu.j);
                    }
                    B(poyVarM, "CAMERA/flash", str.equals("on") ? 1L : 0L);
                }
                if (ftmVarA != null) {
                    B(poyVarM, "CAMERA/to_ground", (ftmVarA.b <= 70.0f || this.A == lwd.FRONT) ? 0 : 1);
                }
            }
            A(poyVarM, "CAMERA/zoom", ((Float) this.L.fA()).floatValue());
            if (!((dqx) ((ojj) this.l).a).e()) {
                List listB = dtn.b((dqx) ((ojj) this.l).a, this.x);
                int size = listB.size();
                float[] fArr = new float[size];
                float[] fArr2 = new float[size];
                float[] fArr3 = new float[size];
                int i4 = size - 1;
                int i5 = 0;
                while (i5 < size) {
                    ftm ftmVarA2 = ftm.a((dqu) listB.get(i4));
                    fArr[i5] = ftmVarA2.b;
                    fArr2[i5] = ftmVarA2.c;
                    fArr3[i5] = ftmVarA2.a;
                    i5++;
                    i4--;
                }
                A(poyVarM, "imu/pitch_buffer", fArr);
                A(poyVarM, "imu/roll_buffer", fArr2);
                A(poyVarM, "imu/rotation_buffer", fArr3);
                B(poyVarM, "imu/buffer_size", size);
            }
            if (((dqx) ((ojj) this.m).a).e()) {
                ftoVar = null;
            } else {
                ((dqx) ((ojj) this.m).a).d();
                ftoVar = new fto(((dqx) ((ojj) this.m).a).d().a);
            }
            if (ftoVar != null) {
                Pair pairC = bkh.c(ftoVar);
                A(poyVarM, "imu/pitch_radius", ((Float) pairC.first).floatValue());
                A(poyVarM, "imu/yaw_radius", ((Float) pairC.second).floatValue());
            }
            D(this.n, "frame/topshot_score", poyVarM);
            D(this.o, "frame/face_quality", poyVarM);
            D(this.p, "frame/aesthetic_score", poyVarM);
            B(poyVarM, "CAMERA/timestamp", TimeUnit.HOURS.toMillis(TimeUnit.MILLISECONDS.toHours(this.w.a())));
            CameraActivityTiming cameraActivityTiming = this.v;
            if (cameraActivityTiming != null && !cameraActivityTiming.c) {
                long activityOnCreateStartNs = cameraActivityTiming.getActivityOnCreateStartNs();
                if (activityOnCreateStartNs != -1) {
                    long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    if (this.F != activityOnCreateStartNs) {
                        this.E = activityOnCreateStartNs;
                        B(poyVarM, "CAMERA/first_capture_since_session_start_timing", TimeUnit.NANOSECONDS.toMillis(jElapsedRealtimeNanos - this.E));
                    } else {
                        B(poyVarM, "CAMERA/capture_intervals", TimeUnit.NANOSECONDS.toMillis(jElapsedRealtimeNanos - this.E));
                    }
                    this.F = activityOnCreateStartNs;
                    this.E = jElapsedRealtimeNanos;
                }
            }
            C(poyVarM, iC);
            B(poyVarM, "tap/count", this.i);
            if (!this.H.isEmpty()) {
                int iMin = Math.min(this.H.size(), 10);
                int size2 = iMin < this.H.size() ? this.H.size() - iMin : 0;
                float[] fArr4 = new float[iMin];
                float[] fArr5 = new float[iMin];
                float[] fArr6 = new float[iMin];
                float[] fArr7 = new float[iMin];
                int i6 = 0;
                while (i6 < iMin) {
                    RectF rectF = (RectF) this.H.get(i6 + size2);
                    PointF pointFU = mip.U(new PointF(rectF.left, rectF.top), iC);
                    int i7 = iMin;
                    PointF pointFU2 = mip.U(new PointF(rectF.right, rectF.bottom), iC);
                    fArr4[i6] = Math.min(pointFU.x, pointFU2.x);
                    fArr5[i6] = Math.min(pointFU.y, pointFU2.y);
                    fArr6[i6] = Math.max(pointFU.x, pointFU2.x);
                    fArr7[i6] = Math.max(pointFU.y, pointFU2.y);
                    float f = rectF.left;
                    float f2 = rectF.top;
                    float f3 = rectF.right;
                    float f4 = rectF.bottom;
                    i6++;
                    iMin = i7;
                }
                A(poyVarM, "tracking/cancelled/left", fArr4);
                A(poyVarM, "tracking/cancelled/top", fArr5);
                A(poyVarM, "tracking/cancelled/right", fArr6);
                A(poyVarM, "tracking/cancelled/bottom", fArr7);
            }
            hjz hjzVar = this.z;
            if (hjzVar != null) {
                A(poyVarM, "metadata/focal_length", hjzVar.g);
                A(poyVarM, "metadata/focal_distance", hjzVar.h);
                A(poyVarM, "metadata/fnumber", hjzVar.z);
                A(poyVarM, "metadata/subject_motion", hjzVar.o);
                B(poyVarM, "metadata/auto_white_balance_mode", hjzVar.w);
                B(poyVarM, "metadata/auto_white_balance_lock", true != hjzVar.y ? 0L : 1L);
                B(poyVarM, "metadata/jpeg_quality", Long.parseLong(Byte.toString(hjzVar.A)));
                MeteringRectangle[] meteringRectangleArr = hjzVar.B;
                if (meteringRectangleArr != null && meteringRectangleArr.length > 0 && (rect2 = this.C) != null) {
                    MeteringRectangle meteringRectangle = meteringRectangleArr[0];
                    int iWidth = rect2.width();
                    int iHeight = this.C.height();
                    float f5 = iWidth;
                    float width = meteringRectangle.getWidth() / f5;
                    float f6 = iHeight;
                    float height = meteringRectangle.getHeight() / f6;
                    float x = meteringRectangle.getX() / f5;
                    float y = meteringRectangle.getY() / f6;
                    PointF pointFU3 = mip.U(new PointF(x, y), iC);
                    PointF pointFU4 = mip.U(new PointF(x + width, y + height), iC);
                    A(poyVarM, "AF/left_x", Math.min(pointFU3.x, pointFU4.x));
                    A(poyVarM, "AF/upper_y", Math.min(pointFU3.y, pointFU4.y));
                    if (iC == 0 || iC == 180) {
                        int i8 = 1;
                        char c = 0;
                        float[] fArr8 = new float[i8];
                        fArr8[c] = width;
                        A(poyVarM, "AF/width", fArr8);
                        float[] fArr9 = new float[i8];
                        fArr9[c] = height;
                        A(poyVarM, "AF/height", fArr9);
                    } else {
                        A(poyVarM, "AF/height", width);
                        A(poyVarM, "AF/width", height);
                    }
                }
                B(poyVarM, "AF/mode", hjzVar.v);
                z(poyVarM, "EXPOSURE/buffer", this.r);
                B(poyVarM, "EXPOSURE/buffer_size", this.r.size());
                lwd lwdVar2 = this.A;
                if (lwdVar2 != null) {
                    A(poyVarM, "EXPOSURE/max", ((Float) (lwdVar2 == lwd.FRONT ? this.b.g(ddq.b) : this.b.g(ddq.c)).c()).floatValue());
                }
                B(poyVarM, "AE/mode", hjzVar.u);
                B(poyVarM, "AE/lock", true != hjzVar.x ? 0L : 1L);
                hjy[] hjyVarArr = hjzVar.p;
                if (hjyVarArr == null || (rect = hjzVar.n) == null) {
                    i2 = i;
                } else {
                    int length = hjyVarArr.length;
                    B(poyVarM, "FACE/num", length);
                    Arrays.sort(hjyVarArr, cdg.b);
                    int iMin2 = Math.min(length, 10);
                    float[] fArr10 = new float[iMin2];
                    float[] fArr11 = new float[iMin2];
                    float[] fArr12 = new float[iMin2];
                    float[] fArr13 = new float[iMin2];
                    int i9 = 0;
                    while (i9 < iMin2) {
                        Rect rect3 = hjyVarArr[i9].a;
                        float fWidth = rect3.width() / rect.width();
                        hjy[] hjyVarArr2 = hjyVarArr;
                        float fHeight = rect3.height() / rect.height();
                        int i10 = i;
                        Rect rect4 = rect;
                        PointF pointFU5 = mip.U(new PointF(rect3.centerX() / rect.width(), rect3.centerY() / rect.height()), iC);
                        if (iC == 0 || iC == 180) {
                            fArr10[i9] = fWidth;
                            fArr11[i9] = fHeight;
                        } else {
                            fArr10[i9] = fHeight;
                            fArr11[i9] = fWidth;
                        }
                        fArr12[i9] = pointFU5.x;
                        fArr13[i9] = pointFU5.y;
                        i9++;
                        hjyVarArr = hjyVarArr2;
                        i = i10;
                        rect = rect4;
                    }
                    i2 = i;
                    A(poyVarM, "FACE/width", fArr10);
                    A(poyVarM, "FACE/height", fArr11);
                    A(poyVarM, "FACE/center_x", fArr12);
                    A(poyVarM, "FACE/center_y", fArr13);
                    if (((Boolean) this.M.fA()).booleanValue()) {
                        dqx dqxVar = this.q;
                        if (!dqxVar.e()) {
                            dqxVar.d();
                            int iMin3 = Math.min(iMin2, dqxVar.d().a.length);
                            float[] fArr14 = new float[iMin3];
                            int i11 = 0;
                            while (true) {
                                if (i11 >= iMin3) {
                                    A(poyVarM, "FACE/familiarity", fArr14);
                                    B(poyVarM, "FACE/familiarity/num", iMin3);
                                } else if (!Float.isNaN(dqxVar.d().b(i11))) {
                                    fArr14[i11] = dqxVar.d().b(i11);
                                    i11++;
                                }
                            }
                        }
                    }
                }
            } else {
                i2 = i;
            }
            if (this.N) {
                B(poyVarM, "session/id", this.j.get());
            }
            final int i12 = i2;
            plk.af(pgb.i(pho.q(this.d.b(String.valueOf(this.y.a(hsjVar.b).c()), this.j.get())), new pgk() { // from class: can
                @Override // defpackage.pgk
                public final pht a(Object obj) {
                    final cas casVar = this.a;
                    int i13 = i12;
                    final int i14 = iC;
                    poy poyVar = poyVarM;
                    final long jLongValue = ((Long) obj).longValue();
                    poy poyVarM2 = qyp.b.m();
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    qyp qypVar = (qyp) poyVarM2.b;
                    qys qysVar = (qys) poyVar.j();
                    qysVar.getClass();
                    qypVar.a = qysVar;
                    pho phoVarQ = pho.q(casVar.d.d(jLongValue, "metadata", oor.p("photo_mode", Integer.valueOf(i13)), ((qyp) poyVarM2.j()).g()));
                    return casVar.b.k(ddl.bd) ? pgb.i(phoVarQ, new pgk() { // from class: cap
                        @Override // defpackage.pgk
                        public final pht a(Object obj2) {
                            final cas casVar2 = casVar;
                            final long j = jLongValue;
                            final int i15 = i14;
                            final cdp cdpVar = casVar2.f;
                            return pgb.i(pho.q(plk.aa(new pgj() { // from class: cdl
                                @Override // defpackage.pgj
                                public final pht a() {
                                    Bitmap bitmap;
                                    Bitmap bitmapCreateBitmap;
                                    RuntimeException e;
                                    Throwable th;
                                    float fC;
                                    int i16;
                                    int i17;
                                    float[] fArr15;
                                    cdp cdpVar2 = cdpVar;
                                    int i18 = i15;
                                    synchronized (cdpVar2.g) {
                                        bitmap = null;
                                        while (!cdpVar2.m.isEmpty()) {
                                            cdo cdoVar = (cdo) cdpVar2.m.pollLast();
                                            if (cdoVar != null) {
                                                try {
                                                    mad madVarD = cdoVar.a.d(cdoVar.b);
                                                    if (madVarD != null) {
                                                        try {
                                                            float fB = 1.0f;
                                                            if (madVarD.c() > madVarD.b()) {
                                                                fB = madVarD.b() / madVarD.c();
                                                                fC = 1.0f;
                                                            } else {
                                                                fC = madVarD.c() / madVarD.b();
                                                            }
                                                            HardwareBuffer hardwareBufferF = madVarD.f();
                                                            if (hardwareBufferF == null) {
                                                                madVarD.close();
                                                            } else {
                                                                if (i18 == 0 || i18 == 180) {
                                                                    int i19 = (int) (fB * 512.0f);
                                                                    i16 = (int) (fC * 512.0f);
                                                                    i17 = i19;
                                                                } else {
                                                                    i16 = (int) (fB * 512.0f);
                                                                    i17 = (int) (fC * 512.0f);
                                                                }
                                                                try {
                                                                    bitmapCreateBitmap = Bitmap.createBitmap(i16, i17, Bitmap.Config.ARGB_8888);
                                                                    EGLImage eGLImage = new EGLImage(hardwareBufferF);
                                                                    try {
                                                                        mqg mqgVarB = mqg.b(cdpVar2.h, eGLImage);
                                                                        try {
                                                                            mtp mtpVarA = mtr.a(bitmapCreateBitmap);
                                                                            mrd mrdVarN = mrd.n(cdpVar2.h, ((mtq) mtpVarA).a);
                                                                            try {
                                                                                mrg mrgVar = cdpVar2.j;
                                                                                switch (i18) {
                                                                                    case 0:
                                                                                        fArr15 = cdp.a;
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                                                                                        fArr15 = cdp.b;
                                                                                        break;
                                                                                    case 180:
                                                                                        fArr15 = cdp.c;
                                                                                        break;
                                                                                    case 270:
                                                                                        fArr15 = cdp.d;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalArgumentException("Unsupported rotation.");
                                                                                }
                                                                                mrgVar.e(mqgVarB, mrdVarN, fArr15);
                                                                                mrdVarN.j(mtpVarA);
                                                                                mwp.n(cdpVar2.h);
                                                                                mrdVarN.close();
                                                                                mqgVarB.close();
                                                                                eGLImage.close();
                                                                                try {
                                                                                    hardwareBufferF.close();
                                                                                    try {
                                                                                        madVarD.close();
                                                                                        bitmap = bitmapCreateBitmap;
                                                                                    } catch (RuntimeException e2) {
                                                                                        e = e2;
                                                                                        ((oug) ((oug) ((oug) cdp.e.b()).h(e)).G(264)).o("Failed to create bitmap.");
                                                                                        bitmap = bitmapCreateBitmap;
                                                                                    }
                                                                                } catch (Throwable th2) {
                                                                                    th = th2;
                                                                                    try {
                                                                                        madVarD.close();
                                                                                    } catch (Throwable th3) {
                                                                                    }
                                                                                    try {
                                                                                        throw th;
                                                                                    } catch (RuntimeException e3) {
                                                                                        e = e3;
                                                                                        ((oug) ((oug) ((oug) cdp.e.b()).h(e)).G(264)).o("Failed to create bitmap.");
                                                                                        bitmap = bitmapCreateBitmap;
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th4) {
                                                                                try {
                                                                                    mrdVarN.close();
                                                                                } catch (Throwable th5) {
                                                                                }
                                                                                throw th4;
                                                                            }
                                                                        } catch (Throwable th6) {
                                                                            try {
                                                                                mqgVarB.close();
                                                                            } catch (Throwable th7) {
                                                                            }
                                                                            throw th6;
                                                                        }
                                                                    } catch (Throwable th8) {
                                                                        try {
                                                                            eGLImage.close();
                                                                        } catch (Throwable th9) {
                                                                        }
                                                                        throw th8;
                                                                    }
                                                                } catch (Throwable th10) {
                                                                    try {
                                                                        hardwareBufferF.close();
                                                                    } catch (Throwable th11) {
                                                                    }
                                                                    throw th10;
                                                                }
                                                            }
                                                        } catch (Throwable th12) {
                                                            bitmapCreateBitmap = bitmap;
                                                            th = th12;
                                                        }
                                                    } else {
                                                        continue;
                                                    }
                                                } catch (RuntimeException e4) {
                                                    bitmapCreateBitmap = bitmap;
                                                    e = e4;
                                                }
                                            }
                                        }
                                    }
                                    cdpVar2.a();
                                    ojc ojcVarH = ojc.h(bitmap);
                                    if (!ojcVarH.g()) {
                                        return plk.V(oih.a);
                                    }
                                    ddf ddfVar = cdpVar2.k;
                                    ddi ddiVar = ddl.a;
                                    ddfVar.e();
                                    try {
                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                        ((Bitmap) ojcVarH.c()).compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                                        byteArrayOutputStream.close();
                                        return plk.V(ojc.i(byteArrayOutputStream.toByteArray()));
                                    } catch (IOException e5) {
                                        ((oug) ((oug) ((oug) cdp.e.b()).h(e5)).G((char) 265)).o("Error: Unable to compress lossless variant!");
                                        return plk.V(oih.a);
                                    }
                                }
                            }, cdpVar.i)), new pgk() { // from class: cao
                                @Override // defpackage.pgk
                                public final pht a(Object obj3) {
                                    cas casVar3 = casVar2;
                                    return casVar3.d.d(j, "pixel_data", oor.p("on_shutter", 1), (byte[]) ((ojc) obj3).c());
                                }
                            }, casVar2.g);
                        }
                    }, casVar.g) : phoVarQ;
                }
            }, this.g), new car(this, 1), this.g);
        }
        x();
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void q(hsp hspVar) {
    }

    @Override // defpackage.itv
    public final void r() {
    }

    @Override // defpackage.itv
    public final synchronized void s() {
        if (this.G.isEmpty()) {
            return;
        }
        RectF rectF = (RectF) this.G.poll();
        if (rectF == null) {
            return;
        }
        this.H.add(rectF);
        this.G.clear();
    }

    @Override // defpackage.itv
    public final synchronized void t(RectF rectF) {
        this.G.add(rectF);
    }

    @Override // defpackage.iat
    public final void u() {
    }

    @Override // defpackage.iat
    public final void v() {
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void w(hsp hspVar) {
    }
}
