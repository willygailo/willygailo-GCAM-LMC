package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.os.Looper;
import android.util.Range;
import android.view.PixelCopy;
import android.view.Surface;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.imax.cyclops.processing.NativePoseEstimatorImpl;
import com.google.android.apps.camera.ui.views.ViewfinderCover;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ejl extends buf implements ehk {
    private elb b;
    private final egz c;
    private final Activity d;
    private final jns e;
    private final Runnable f;
    private jii g;
    private final evl h;

    public ejl() {
    }

    public ejl(egz egzVar, evl evlVar, Activity activity, jns jnsVar) {
        this.c = egzVar;
        this.h = evlVar;
        this.d = activity;
        this.e = jnsVar;
        this.f = new dwb(activity, 3);
    }

    @Override // defpackage.ehk
    public final synchronized void a() {
        elb elbVar = this.b;
        obr.ao(elbVar);
        elbVar.b().C = false;
    }

    @Override // defpackage.buf
    public final synchronized ojc b() {
        ojc ojcVarI;
        elb elbVar = this.b;
        if (elbVar == null) {
            return oih.a;
        }
        ehl ehlVar = (ehl) ((evm) elbVar).d.get();
        if (ehlVar.getHolder().getSurface().isValid()) {
            int width = ehlVar.getWidth() / 2;
            int height = ehlVar.getHeight() / 2;
            if (width <= 0 || height <= 0) {
                ((oug) ((oug) jng.a.c()).G((char) 3447)).o("getScreenshotFrom(): the surface size is invalid");
                ojcVarI = oih.a;
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                PixelCopy.request(ehlVar, bitmapCreateBitmap, jnd.d, mip.bV(Looper.getMainLooper()));
                ojcVarI = ojc.i(jnm.b(bitmapCreateBitmap, 2));
            }
        } else {
            ((oug) ((oug) jng.a.c()).G((char) 3448)).o("getScreenshotFrom(): the surface is not valid");
            ojcVarI = oih.a;
        }
        return ojcVarI;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.buf
    public final void ge() {
        jns jnsVar = this.e;
        this.g = new jou(jnsVar.c, jnsVar.d);
    }

    @Override // defpackage.buf
    public final synchronized void gf() {
        ViewfinderCover viewfinderCover = this.e.e;
        viewfinderCover.i.E.remove(this.f);
        elb elbVar = this.b;
        if (elbVar == null) {
            return;
        }
        obr.ao(elbVar);
        ekf ekfVarC = elbVar.c();
        ekfVarC.a.unregisterListener(ekfVarC);
        elb elbVar2 = this.b;
        obr.ao(elbVar2);
        eig eigVarB = elbVar2.b();
        oxh.g(new eia(eigVarB.r));
        if (eigVarB.r.compareAndSet(1, 0)) {
            eigVarB.n.a(false);
            eigVarB.g();
        } else {
            eigVarB.q.set(true);
            eigVarB.s.block();
            eigVarB.h(false, 2);
        }
        mip mipVar = eigVarB.M;
        eigVarB.c();
        eigVarB.e.b();
        if (this.d.getRequestedOrientation() == 4) {
            this.d.setRequestedOrientation(2);
        }
    }

    @Override // defpackage.buf
    public final void k() {
        synchronized (this) {
            elb elbVar = this.b;
            if (elbVar == null) {
                return;
            }
            obr.ao(elbVar);
            ekf ekfVarC = elbVar.c();
            ekfVarC.a.registerListener(ekfVarC, ekfVarC.c, 1);
            ekfVarC.a.registerListener(ekfVarC, ekfVarC.b, 1);
            elb elbVar2 = this.b;
            obr.ao(elbVar2);
            eig eigVarB = elbVar2.b();
            File file = new File(eigVarB.a.getCacheDir(), "datasets");
            ddf ddfVar = eigVarB.d;
            ddg ddgVar = ddn.a;
            ddfVar.b();
            eigVarB.t.a(file.toString());
            int iIntValue = ((Integer) eigVarB.A.c(htu.V)).intValue();
            if (iIntValue < 2 && !eigVarB.f.k()) {
                eigVarB.d(eigVarB.a.getString(R.string.imax_vertical_hint));
                eigVarB.B.e(htu.V, Integer.valueOf(iIntValue + 1));
            }
            eigVarB.q.set(false);
            mip mipVar = eigVarB.M;
            synchronized (this) {
                elb elbVar3 = this.b;
                obr.ao(elbVar3);
                ehj ehjVarA = elbVar3.a();
                ehjVarA.b.f("Panorama frameserver received onModuleResume");
                lnc lncVar = ehjVarA.h;
                if (lncVar != null) {
                    lncVar.f();
                }
            }
            ViewfinderCover viewfinderCover = this.e.e;
            viewfinderCover.i.E.add(this.f);
        }
    }

    @Override // defpackage.buf
    public final synchronized void m() {
        if (this.b != null) {
            return;
        }
        evl evlVar = this.h;
        this.b = new evm(evlVar.a, evlVar.b, evlVar.c);
        egz egzVar = this.c;
        int i = ejn.a;
        elb elbVar = this.b;
        obr.ao(elbVar);
        float fA = (float) ((ejm) ((evm) elbVar).e.get()).a();
        if (!egzVar.a.getAndSet(true)) {
            ejn.a = i;
            ejn.b = fA;
            ekh.b(ejp.class, new ejn());
            ekh.b(ejs.class, new NativePoseEstimatorImpl());
            ekh.b(ejr.class, new ekm());
            ekh.b(eki.class, new ekj());
        }
        elb elbVar2 = this.b;
        obr.ao(elbVar2);
        final ehr ehrVar = new ehr((ehl) ((evm) elbVar2).d.get(), (ejd) ((evm) elbVar2).h.get(), (lap) ((evm) elbVar2).i.get(), (jlb) ((evm) elbVar2).c.m.get(), (eig) ((evm) elbVar2).j.get(), (BottomBarController) ((evm) elbVar2).c.i.get(), (epj) ((evm) elbVar2).b.T.get(), (ehj) ((evm) elbVar2).g.get(), (lij) ((evm) elbVar2).b.aH.get(), (ddf) ((evm) elbVar2).a.i.get());
        final jii jiiVar = this.g;
        obr.ao(jiiVar);
        if (ehrVar.g.k(ddl.aU)) {
            ehl ehlVar = ehrVar.a;
            ehlVar.setBackground(ehlVar.getResources().getDrawable(R.drawable.viewfinder_rounded_background, null));
            ehrVar.a.setClipToOutline(true);
        }
        ehrVar.a.setEGLContextClientVersion(3);
        ehrVar.a.setRenderer(ehrVar.b);
        ehl ehlVar2 = ehrVar.a;
        ehlVar2.a = this;
        ehlVar2.onResume();
        jiiVar.a(ehrVar.a);
        jiiVar.c(1920, 1080);
        final ehj ehjVar = ehrVar.f;
        final lij lijVar = ehrVar.h;
        ejd ejdVar = ehrVar.b;
        ehjVar.a.e("ImaxFrameServer-start");
        lvs lvsVarE = ehjVar.o.a.e(lwd.BACK);
        lvsVarE.getClass();
        ejx ejxVar = ehjVar.d.b;
        lig ligVar = new lig(ejxVar.a, ejxVar.b);
        lis lisVar = ehjVar.b;
        String strValueOf = String.valueOf(ligVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 17);
        sb.append("Viewfinder size: ");
        sb.append(strValueOf);
        lisVar.f(sb.toString());
        lnz lnzVarBa = mip.ba(lvsVarE, ligVar);
        ehjVar.m = new lmu() { // from class: ehd
            @Override // defpackage.lmu
            public final void a(lrr lrrVar) {
                ehj ehjVar2 = ehjVar;
                lij lijVar2 = lijVar;
                lmr lmrVarA = lrrVar.a();
                if (lmrVarA == null) {
                    return;
                }
                lmrVarA.j(new ehf(ehjVar2, lmrVarA, lijVar2));
            }
        };
        plk.af(ejdVar.g, new ehh(ehjVar, lnzVarBa), pgr.INSTANCE);
        ehjVar.n.set(false);
        lne lneVarA = lnf.a();
        lneVarA.f(lvsVarE);
        lneVarA.d(lnzVarBa);
        ejm ejmVar = ehjVar.d;
        HashSet hashSet = new HashSet();
        hashSet.add(mip.be(CaptureRequest.FLASH_MODE, 0));
        hashSet.add(mip.be(CaptureRequest.CONTROL_AE_MODE, 1));
        hashSet.add(mip.be(CaptureRequest.CONTROL_AE_LOCK, false));
        hashSet.add(mip.be(CaptureRequest.CONTROL_AWB_MODE, 1));
        hashSet.add(mip.be(CaptureRequest.CONTROL_AWB_LOCK, false));
        hashSet.add(mip.be(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0));
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
        Range[] rangeArr = (Range[]) ejmVar.a.l(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        Range range = rangeArr[rangeArr.length - 1];
        for (Range range2 : rangeArr) {
            if (((Integer) range2.getLower()).intValue() * ((Integer) range.getUpper()).intValue() >= ((Integer) range.getLower()).intValue() * ((Integer) range2.getUpper()).intValue() && Math.abs(((Integer) range2.getUpper()).intValue() - 30) < Math.abs(((Integer) range.getUpper()).intValue() - 30)) {
                range = range2;
            }
        }
        hashSet.add(mip.be(key, range));
        hashSet.add(mip.be(CaptureRequest.CONTROL_AF_MODE, 4));
        hashSet.add(mip.be(CaptureRequest.LENS_FOCUS_DISTANCE, (Float) ejmVar.a.l(CameraCharacteristics.LENS_INFO_HYPERFOCAL_DISTANCE)));
        hashSet.add(mip.be(CaptureRequest.NOISE_REDUCTION_MODE, 2));
        for (int i2 : (int[]) ((lvo) ejmVar.a).m(CameraCharacteristics.EDGE_AVAILABLE_EDGE_MODES, lvo.c)) {
            if (i2 == 2) {
                hashSet.add(mip.be(CaptureRequest.EDGE_MODE, 2));
                break;
            }
        }
        CaptureRequest.Key key2 = CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE;
        ddf ddfVar = ejmVar.c;
        ddg ddgVar = ddn.a;
        ddfVar.f();
        hashSet.add(mip.be(key2, 0));
        hashSet.addAll(fvq.v(jrl.IMAX, ejmVar.a));
        fvq.w(hashSet, lneVarA, ehjVar.o.a.a(lvsVarE));
        lnc lncVarA = ehjVar.o.a(lneVarA.a());
        lncVarA.getClass();
        ehjVar.h = lncVarA;
        lncVarA.i(hashSet);
        ehjVar.a.f();
        ehrVar.l.c(new lie() { // from class: ehn
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                jiiVar.b(ehrVar.a);
            }
        });
        ehrVar.l.c(ehrVar.c.d(ehrVar.j));
        ehrVar.d.addListener(ehrVar.i);
        ehrVar.e.a(ehrVar.k);
        final int i3 = 1;
        ehrVar.l.c(new lie() { // from class: ehm
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                switch (i3) {
                    case 0:
                        ehr ehrVar2 = ehrVar;
                        ehrVar2.e.b(ehrVar2.k);
                        break;
                    default:
                        ehr ehrVar3 = ehrVar;
                        ehrVar3.d.removeListener(ehrVar3.i);
                        break;
                }
            }
        });
        final int i4 = 0;
        ehrVar.l.c(new lie() { // from class: ehm
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                switch (i4) {
                    case 0:
                        ehr ehrVar2 = ehrVar;
                        ehrVar2.e.b(ehrVar2.k);
                        break;
                    default:
                        ehr ehrVar3 = ehrVar;
                        ehrVar3.d.removeListener(ehrVar3.i);
                        break;
                }
            }
        });
    }

    @Override // defpackage.buf
    public final synchronized void o() {
        elb elbVar = this.b;
        if (elbVar == null) {
            return;
        }
        obr.ao(elbVar);
        eig eigVarB = elbVar.b();
        oxh.g(new eia(eigVarB.r));
        eigVarB.J.b(new eib(eigVarB, 0));
        eigVarB.m.onPause();
        eigVarB.z.c();
        elb elbVar2 = this.b;
        obr.ao(elbVar2);
        ehj ehjVarA = elbVar2.a();
        ehjVarA.b.f("Received onModuleStop");
        ehjVarA.f.fB(false);
        lmv lmvVar = ehjVarA.k;
        if (lmvVar != null) {
            lmvVar.l(ehjVarA.m);
        }
        lnx lnxVar = ehjVarA.j;
        if (lnxVar != null) {
            lnxVar.d(null);
        }
        Surface surface = ehjVarA.i;
        if (surface != null) {
            surface.release();
            ehjVarA.i = null;
        }
        ehjVarA.j = null;
        lmv lmvVar2 = ehjVarA.k;
        if (lmvVar2 != null) {
            lmvVar2.close();
        }
        ehjVarA.k = null;
        ehjVarA.b.b("Panorama frameserver closing");
        lnc lncVar = ehjVarA.h;
        lncVar.getClass();
        lncVar.close();
        ehjVarA.h = null;
        ehjVarA.c.g();
        elb elbVar3 = this.b;
        obr.ao(elbVar3);
        ((ejj) ((evm) elbVar3).f.get()).g();
        elb elbVar4 = this.b;
        obr.ao(elbVar4);
        ((lap) ((evm) elbVar4).i.get()).close();
        this.b = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        if (r2 == 0) goto L6;
     */
    @Override // defpackage.buf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean q() {
        /*
            r4 = this;
            monitor-enter(r4)
            elb r0 = r4.b     // Catch: java.lang.Throwable -> L23
            r1 = 0
            if (r0 != 0) goto L8
        L6:
            monitor-exit(r4)
            return r1
        L8:
            eig r0 = r0.b()     // Catch: java.lang.Throwable -> L23
            java.util.concurrent.atomic.AtomicInteger r2 = r0.r     // Catch: java.lang.Throwable -> L23
            int r2 = r2.get()     // Catch: java.lang.Throwable -> L23
            r3 = 3
            if (r2 != r3) goto L1d
            r0.c()     // Catch: java.lang.Throwable -> L23
            r2 = 2
            r0.h(r1, r2)     // Catch: java.lang.Throwable -> L23
            goto L20
        L1d:
            if (r2 != 0) goto L20
            goto L6
        L20:
            r0 = 1
            monitor-exit(r4)
            return r0
        L23:
            r0 = move-exception
            monitor-exit(r4)
            goto L27
        L26:
            throw r0
        L27:
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejl.q():boolean");
    }

    @Override // defpackage.buf
    public final boolean t() {
        return false;
    }
}
