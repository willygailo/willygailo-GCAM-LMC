package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.libraries.camera.jni.yuv.YuvUtilNative;
import com.hdrindicator.HDRProgress;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class dzr {
    public final ecg a;
    public final ely b;
    public final ely c;
    public final ely d;
    public final ely e;
    public final ely f;
    public final hoh g;
    public final ddf h;
    public final ljf i;
    public final lis j;
    public final dze k;
    public final ghx l;
    public final jry m;
    private final eay n;
    private final nvb o;

    public dzr(ecg ecgVar, ghx ghxVar, pyn pynVar, pyn pynVar2, pyn pynVar3, pyn pynVar4, pyn pynVar5, jry jryVar, hoh hohVar, ddf ddfVar, lis lisVar, ljf ljfVar, nvb nvbVar, eay eayVar, dze dzeVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = ecgVar;
        this.b = ely.a(pynVar);
        this.c = ely.a(pynVar2);
        this.l = ghxVar;
        this.d = ely.a(pynVar3);
        this.e = ely.a(pynVar4);
        this.f = ely.a(pynVar5);
        this.m = jryVar;
        this.g = hohVar;
        this.h = ddfVar;
        this.j = lisVar.a("GcaHdrShotCfgFctry");
        this.i = ljfVar;
        this.o = nvbVar;
        this.n = eayVar;
        this.k = dzeVar;
    }

    public static Bitmap a(Bitmap bitmap, int i) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public final void b(dzu dzuVar, ecq ecqVar) {
        ojc ojcVarA = this.n.a(dzuVar, ojc.i(ecqVar), false);
        if (ojcVarA.g()) {
            String strValueOf = String.valueOf(ojcVarA);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 54);
            sb.append("Postprocessing pipeline was given image but requested ");
            sb.append(strValueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void c(final gog gogVar, eck eckVar, dzu dzuVar, final int i, boolean z, boolean z2) {
        pht phtVarT;
        this.i.e("primaryOutputFormat");
        ojc ojcVarA = this.n.a(dzuVar, oih.a, z2);
        if (!ojcVarA.g()) {
            throw new IllegalStateException("processOrRequestImage was given no image but still didn't request anything");
        }
        eac eacVar = (eac) ojcVarA.c();
        lis lisVar = this.j;
        String strValueOf = String.valueOf(eacVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 25);
        sb.append("Selected primary format: ");
        sb.append(strValueOf);
        lisVar.b(sb.toString());
        this.i.g("updateProgress");
        gogVar.d.a(ebe.a, 0.0f);
        dzt dztVar = (dzt) dzuVar;
        if (dztVar.d && ((Integer) this.h.a(ddy.a).c()).intValue() != 0 && !this.d.c()) {
            gogVar.d.a(ecs.a, 0.0f);
        }
        this.i.g("getAggregator");
        ede edeVarF = this.o.f(gogVar.b.h());
        final ecp ecpVarA = ecq.a();
        ecpVarA.e(lic.b(i));
        ecpVarA.f = dzuVar;
        ecpVarA.g = eckVar;
        ecpVarA.f(gogVar);
        if (this.b.c()) {
            this.i.g("moments#onMainShotStarted");
            ((gfj) this.b.b()).o(gogVar.b.h(), new gfi(dzuVar.b(), gogVar.b.i() == hsr.PORTRAIT));
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.i.g("addProgressListener");
        ebv ebvVar = new ebv() { // from class: dzh
            @Override // defpackage.ebv
            public final void a(float f) {
                HDRProgress.updateProgress(f);
                dzr dzrVar = this.a;
                gog gogVar2 = gogVar;
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                dzrVar.i.e("ProgressCallback");
                gogVar2.d.a(ebe.a, f);
                if (atomicBoolean2.compareAndSet(false, true)) {
                    hsa hsaVar = gogVar2.b;
                    hsaVar.O(hsaVar.i() == hsr.NORMAL ? mip.ex(R.string.photo_processing, new Object[0]) : mip.ex(R.string.processing_hdr_plus, new Object[0]));
                }
                dzrVar.i.f();
            }
        };
        if (edeVarF.a == null) {
            edeVarF.a = ope.D();
        }
        edeVarF.a.d(ebvVar);
        this.i.g("addBaseFrameListener");
        edeVarF.a(new ebn() { // from class: dzg
            @Override // defpackage.ebn
            public final void a(edd eddVar, int i2, long j, lzv lzvVar) {
                dzr dzrVar = this.a;
                gog gogVar2 = gogVar;
                ecp ecpVar = ecpVarA;
                int i3 = i;
                dzrVar.i.e("ShotConfigFactory#BaseFrameCallback");
                dzrVar.k.a(j);
                if (dzrVar.c.c()) {
                    ((gez) dzrVar.c.b()).b(gogVar2.b.h(), j);
                }
                synchronized (ecpVar) {
                    ecpVar.d(lzvVar);
                    ecpVar.g(j);
                }
                if (dzrVar.h.k(ddm.am)) {
                    dzrVar.j.b("POSTVIEW disabled, defaulting to YuvThumbnailProcessor");
                    dzrVar.i.f();
                    return;
                }
                jry jryVar = dzrVar.m;
                ojc ojcVarH = !jryVar.a.g() ? oih.a : ojc.h(((fpo) jryVar.a.c()).c(j));
                if (ojcVarH.g()) {
                    dzrVar.j.b("Successfully acquired YUV baseFrameImage");
                    Bitmap bitmapA = YuvUtilNative.a((mad) ojcVarH.c());
                    ((mad) ojcVarH.c()).close();
                    int i4 = true != dzrVar.g.e(dzrVar.l.k()) ? i3 : 0;
                    hoh hohVar = dzrVar.g;
                    bitmapA.getClass();
                    Bitmap bitmapA2 = hohVar.a(bitmapA, i3, dzrVar.l.k());
                    if (i4 != 0 && bitmapA2 != null) {
                        bitmapA2 = dzr.a(bitmapA2, i4);
                    }
                    gogVar2.b.U(bitmapA2, 0);
                }
                dzrVar.i.f();
            }
        });
        if (!this.h.k(ddm.am) || !z) {
            this.i.g("addPostViewRgbListener");
            edeVarF.c(new dzi(this, i, gogVar));
        }
        if (eacVar == eac.JPEG) {
            this.i.g("addJpegListener");
            dzj dzjVar = new dzj(this, gogVar);
            if (edeVarF.w == null) {
                edeVarF.w = ope.D();
            }
            edeVarF.w.d(dzjVar);
        }
        if (eacVar == eac.YUV) {
            this.i.g("addYuvListener");
            dzk dzkVar = new dzk(this, ecpVarA, dzuVar);
            if (edeVarF.q == null) {
                edeVarF.q = ope.D();
            }
            edeVarF.q.d(dzkVar);
        }
        if (this.d.c() && (this.d.b() instanceof ecn)) {
            pih pihVarF = pih.f();
            this.i.g("addPdListener");
            dzp dzpVar = new dzp(this, pihVarF);
            if (edeVarF.o == null) {
                edeVarF.o = ope.D();
            }
            edeVarF.o.d(dzpVar);
            phtVarT = pihVarF;
        } else {
            phtVarT = plk.T();
        }
        ecpVarA.c(phtVarT);
        if ((this.d.c() && (this.d.b() instanceof ecn) && this.h.k(ddx.x)) || z2) {
            this.i.g("addRawListener");
            edeVarF.d(new dzl(this, gogVar));
        }
        if (eacVar == eac.RGB) {
            this.i.g("addRgbListener");
            dzm dzmVar = new dzm(this, ecpVarA, dzuVar);
            if (edeVarF.s == null) {
                edeVarF.s = ope.D();
            }
            edeVarF.s.d(dzmVar);
        }
        if (eacVar == eac.RGB_HW) {
            this.i.g("addHwRgbListener");
            edeVarF.b(new dzn(this, ecpVarA, dzuVar));
        }
        if (dztVar.c && this.e.c() && gogVar.a.h) {
            this.i.g("addDngListener");
            obr.aQ(this.e.c());
            dzq dzqVar = new dzq(this, gogVar);
            if (edeVarF.k == null) {
                edeVarF.k = ope.D();
            }
            edeVarF.k.d(dzqVar);
        }
        this.i.g("addShotStatusListener");
        edeVarF.e(new dzo(this, gogVar));
        this.i.f();
    }
}
