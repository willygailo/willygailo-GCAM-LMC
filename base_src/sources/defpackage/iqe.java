package defpackage;

import android.os.SystemClock;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class iqe extends BottomBarListener {
    final /* synthetic */ iqj a;

    public iqe(iqj iqjVar) {
        this.a = iqjVar;
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onCameraSwitchButtonClicked() {
        isa isaVar = this.a.M;
        isaVar.getClass();
        ipf ipfVar = ((ipb) isaVar).b;
        ipfVar.j.fB(inr.STATE_PREPARING_ON_RESUME);
        ipfVar.g.h(new iot(ipfVar, 2));
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener, com.google.android.apps.camera.bottombar.PauseResumeButton.PauseResumeButtonListener
    public final void onPauseButtonClicked() {
        pht phtVarV;
        isa isaVar = this.a.M;
        isaVar.getClass();
        ipf ipfVar = ((ipb) isaVar).b;
        if (((inr) ipfVar.j.d).equals(inr.STATE_RECORDING)) {
            ipfVar.h.b(R.raw.video_pause);
            ipfVar.w.f();
            lar larVar = ipfVar.q;
            ipx ipxVar = ipfVar.C;
            ipxVar.getClass();
            int i = 1;
            larVar.c(new iov(ipxVar, 1));
            ioq ioqVar = ipfVar.B;
            if (ioqVar.d.k(deg.d)) {
                final iod iodVar = ioqVar.v;
                if (iodVar.m.get() > 1) {
                    iodVar.c.set(true);
                    iodVar.n.set(TimeUnit.MILLISECONDS.toNanos(SystemClock.uptimeMillis()));
                    phtVarV = plk.V(null);
                } else {
                    synchronized (iodVar.s) {
                        iodVar.x = pih.f();
                        iodVar.x.d(new Runnable() { // from class: iob
                            @Override // java.lang.Runnable
                            public final void run() {
                                iod iodVar2 = iodVar;
                                iodVar2.c.set(true);
                                iodVar2.n.set(TimeUnit.MILLISECONDS.toNanos(SystemClock.uptimeMillis()));
                            }
                        }, mip.bS());
                        phtVarV = iodVar.x;
                    }
                }
                phtVarV.d(new ioj(ioqVar, i), pgr.INSTANCE);
            } else {
                ioqVar.l.c.set(false);
                ioqVar.ad.a();
            }
            ipfVar.A.b.set(false);
        }
        this.a.c(false);
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener, com.google.android.apps.camera.bottombar.PauseResumeButton.PauseResumeButtonListener
    public final void onResumeButtonClicked() {
        isa isaVar = this.a.M;
        isaVar.getClass();
        ipf ipfVar = ((ipb) isaVar).b;
        if (((inr) ipfVar.j.d).equals(inr.STATE_RECORDING_PAUSE)) {
            ipfVar.h.b(R.raw.video_start);
            ipfVar.w.e();
            lar larVar = ipfVar.q;
            ipx ipxVar = ipfVar.C;
            ipxVar.getClass();
            larVar.c(new iov(ipxVar, 0));
            ioq ioqVar = ipfVar.B;
            ldv ldvVar = ioqVar.ad;
            synchronized (ldvVar.d) {
                obr.aU(ldvVar.e == ldu.PAUSED, "%s is expected but we get %s", ldu.PAUSED, ldvVar.e);
                ldvVar.e = ldu.STARTED;
                plk.af(ldvVar.a.h(), new ldr(ldvVar, 0), ldvVar.b);
            }
            if (ioqVar.d.k(deg.d)) {
                iod iodVar = ioqVar.v;
                iodVar.c.set(false);
                iodVar.f();
                iodVar.n.set(0L);
            } else {
                ioqVar.l.c.set(true);
            }
            ipfVar.A.b.set(true);
        }
        this.a.e();
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onSnapshotButtonClicked() {
        this.a.e();
        iqj iqjVar = this.a;
        iqjVar.c.setSnapshotButtonClickEnabled(false);
        iqjVar.y.g().l();
        isa isaVar = this.a.M;
        isaVar.getClass();
        ipf ipfVar = ((ipb) isaVar).b;
        hsq hsqVarA = hsq.a(hsp.a(), System.currentTimeMillis(), dhy.a(hsr.VIDEO_SNAPSHOT, System.currentTimeMillis()), hsr.VIDEO_SNAPSHOT);
        ipfVar.K.i(hsqVarA);
        plk.af(ipfVar.z.a(hsqVarA), new ipe(ipfVar, 0), ipfVar.q);
    }
}
