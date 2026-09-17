package defpackage;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.libraries.camera.jni.yuv.YuvUtilNative;
import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.DirtyLensHistory;
import com.google.googlex.gcam.FloatDeque;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.YuvReadView;
import com.google.googlex.gcam.dirtylens.DirtyLens;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bsq implements bsa {
    public final bst a;
    public boolean b;
    public bsd c;
    private final bsu d;
    private final Resources e;
    private final lco f;
    private final Handler g;
    private final Runnable h;
    private final fjs i;
    private final ddf j;
    private final lda k;
    private int l;
    private final long m;
    private int n;
    private final bui o;
    private bsg p;
    private final aaq q = new bso(this);

    public bsq(aar aarVar, final bst bstVar, bsu bsuVar, aaq aaqVar, Resources resources, fjs fjsVar, ddf ddfVar, bui buiVar, lvq lvqVar, huf hufVar, byte[] bArr, byte[] bArr2) {
        aarVar.getClass();
        this.d = bsuVar;
        bstVar.getClass();
        this.a = bstVar;
        aaqVar.getClass();
        this.e = resources;
        lco lcoVarA = hufVar.a(htu.b);
        this.f = lcoVarA;
        this.i = fjsVar;
        this.j = ddfVar;
        this.o = buiVar;
        this.m = 5000L;
        this.g = mip.bV(Looper.getMainLooper());
        this.h = new Runnable() { // from class: bsn
            @Override // java.lang.Runnable
            public final void run() {
                bsq bsqVar = this.a;
                bst bstVar2 = bstVar;
                bsqVar.b = true;
                bstVar2.b.fB(true);
                bstVar2.a.fB(15);
            }
        };
        this.n = 2;
        this.k = bstVar.a;
        this.l = 0;
        buiVar.b.c(lcoVarA.a(new bsp(lvqVar, bstVar, bsuVar), pgr.INSTANCE));
    }

    private final boolean i() {
        bsd bsdVar = this.c;
        if (bsdVar != null) {
            return bsdVar.c() == 1 || this.c.c() == 2;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:56:0x018c  */
    @Override // defpackage.bsa
    public final void a(hin hinVar) {
        ojc ojcVarI;
        bsg bsgVar;
        lap lapVar;
        if (!((Boolean) ((lce) this.f).d).booleanValue()) {
            hinVar.a.close();
            return;
        }
        mad madVar = hinVar.a;
        try {
            int i = 1;
            this.l++;
            if (madVar.a() == 35) {
                int iC = madVar.c();
                int iB = madVar.b();
                int iMin = Math.min(iC / 640, iB / 480);
                if (iMin > 0) {
                    while (iMin > 1 && !aaq.f(iC, iB, iMin)) {
                        iMin--;
                    }
                } else {
                    iMin = -1;
                }
                if (iMin <= 0 && iC * iB >= 307200) {
                    iMin = 1;
                }
                if (iMin > 0) {
                    madVar.getClass();
                    ByteBuffer[] byteBufferArr = null;
                    if (madVar.a() == 35) {
                        int iC2 = madVar.c();
                        int iB2 = madVar.b();
                        if (aaq.f(iC2, iB2, iMin) && iC2 / iMin >= 640 && iB2 / iMin >= 480) {
                            List listG = madVar.g();
                            mac macVar = (mac) listG.get(0);
                            mac macVar2 = (mac) listG.get(1);
                            mac macVar3 = (mac) listG.get(2);
                            int i2 = (iC2 * iB2) / (iMin * iMin);
                            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i2);
                            ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(i2 / 2);
                            if (YuvUtilNative.downsampleYUV_420_888toNV21Native(iC2, iB2, macVar.getBuffer(), macVar.getPixelStride(), macVar.getRowStride(), macVar2.getBuffer(), macVar2.getPixelStride(), macVar2.getRowStride(), macVar3.getBuffer(), macVar3.getPixelStride(), macVar3.getRowStride(), byteBufferAllocateDirect, byteBufferAllocateDirect2, iMin)) {
                                byteBufferArr = new ByteBuffer[]{byteBufferAllocateDirect, byteBufferAllocateDirect2};
                            }
                        }
                    }
                    if (byteBufferArr != null) {
                        int i3 = iC / iMin;
                        int i4 = iB / iMin;
                        ByteBuffer byteBuffer = byteBufferArr[0];
                        byteBuffer.getClass();
                        ByteBuffer byteBuffer2 = byteBufferArr[1];
                        byteBuffer2.getClass();
                        byteBuffer.getClass();
                        byteBuffer2.getClass();
                        YuvReadView yuvReadView = new YuvReadView(GcamModuleJNI.new_YuvReadView__SWIG_2(i3, i4, i3, pjk.a(new pjk(BufferUtils.a(byteBuffer))), i3 / 2, i4 / 2, i3, pjk.a(new pjk(BufferUtils.a(byteBuffer2))), 2));
                        new DirtyLens();
                        long j = yuvReadView.a;
                        if (j == 0) {
                            ojcVarI = oih.a;
                        } else {
                            float[] fArr = new float[1];
                            ojcVarI = DirtyLens.getDirtyLensRawScore(j, fArr) ? ojc.i(Float.valueOf(fArr[0])) : oih.a;
                        }
                        bsu bsuVar = this.d;
                        if (ojcVarI.g()) {
                            float fFloatValue = ((Float) ojcVarI.c()).floatValue();
                            bss bssVar = bsuVar.c;
                            if (bssVar == null) {
                                i = 2;
                            } else {
                                DirtyLensHistory dirtyLensHistory = bsuVar.a.a;
                                boolean zDirtyLensHistory_AddRawScore = GcamModuleJNI.DirtyLensHistory_AddRawScore(dirtyLensHistory.a, dirtyLensHistory, fFloatValue);
                                bssVar.fB(bsuVar.a.a());
                                ddf ddfVar = bsuVar.b;
                                ddi ddiVar = dcs.a;
                                ddfVar.e();
                                if (!zDirtyLensHistory_AddRawScore) {
                                    i = 2;
                                }
                            }
                        } else {
                            i = 2;
                        }
                        if (this.b && i != this.n) {
                            switch (i - 1) {
                                case 0:
                                    if (((Boolean) ((lce) this.f).d).booleanValue() && !i() && (bsgVar = this.p) != null) {
                                        brj brjVarA = brk.a();
                                        brjVarA.a = this.e.getString(R.string.advice_dirty_lens);
                                        brjVarA.b = this.e.getString(R.string.advice_dirty_lens_popup_text);
                                        brjVarA.d = 7000;
                                        brjVarA.e = 3;
                                        brjVarA.f = this.q;
                                        this.c = bsgVar.a(brjVarA.a());
                                        this.i.k();
                                        bui buiVar = this.o;
                                        synchronized (buiVar.a) {
                                            lapVar = buiVar.c;
                                            break;
                                        }
                                        lapVar.c(new lie() { // from class: bsm
                                            @Override // defpackage.lie, java.lang.AutoCloseable
                                            public final void close() {
                                                this.a.c = null;
                                            }
                                        });
                                    }
                                    g();
                                    this.n = i;
                                    break;
                                default:
                                    this.n = i;
                                    break;
                            }
                        }
                        ddf ddfVar2 = this.j;
                        ddi ddiVar2 = dcs.a;
                        ddfVar2.e();
                        if (this.l > 0) {
                            g();
                        }
                        if (madVar == null) {
                            return;
                        }
                    } else if (madVar == null) {
                        return;
                    }
                } else if (madVar == null) {
                    return;
                }
            } else if (madVar == null) {
                return;
            }
            madVar.close();
        } catch (Throwable th) {
            if (madVar == null) {
                throw th;
            }
            try {
                madVar.close();
                throw th;
            } catch (Throwable th2) {
                throw th;
            }
        }
    }

    @Override // defpackage.bsb
    public final brx b() {
        return this.a;
    }

    @Override // defpackage.bsb
    public final void c() {
        if (i()) {
            g();
            bsd bsdVar = this.c;
            if (bsdVar != null) {
                bsdVar.a();
            }
        }
    }

    @Override // defpackage.bsb
    public final void d(lvs lvsVar) {
        bsu bsuVar = this.d;
        bsuVar.c = this.a.d(lvsVar);
        bsx bsxVar = bsuVar.a;
        bsy bsyVar = (bsy) bsuVar.c.fA();
        if (!(bsyVar instanceof bsy)) {
            bsy bsyVar2 = new bsy();
            for (int i = 0; i < bsyVar.b(); i++) {
                bsyVar2.c(bsyVar.a(i));
            }
            bsyVar = bsyVar2;
        }
        DirtyLensHistory dirtyLensHistory = bsxVar.a;
        FloatDeque floatDeque = bsyVar.a;
        GcamModuleJNI.DirtyLensHistory_raw_score_history__set(dirtyLensHistory.a, dirtyLensHistory, floatDeque == null ? 0L : floatDeque.a, floatDeque);
        ddf ddfVar = bsuVar.b;
        ddi ddiVar = dcs.a;
        ddfVar.e();
        this.n = 2;
        this.l = 0;
        this.k.fB(15);
        h();
    }

    @Override // defpackage.bsb
    public final void e(lvp lvpVar) {
    }

    @Override // defpackage.bsb
    public final void f(bsg bsgVar) {
        this.p = bsgVar;
    }

    public final void g() {
        this.b = false;
        this.g.removeCallbacks(this.h);
        bst bstVar = this.a;
        bstVar.b.fB(false);
        bstVar.a.fB(0);
    }

    public final void h() {
        this.g.removeCallbacks(this.h);
        this.g.postDelayed(this.h, this.m);
    }
}
