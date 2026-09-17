package defpackage;

import android.view.ViewGroup;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iot implements Runnable {
    public final /* synthetic */ ipf a;
    private final /* synthetic */ int b;

    public /* synthetic */ iot(ipf ipfVar, int i) {
        this.b = i;
        this.a = ipfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final int i = 0;
        final int i2 = 1;
        switch (this.b) {
            case 0:
                ipf ipfVar = this.a;
                ipfVar.C.b();
                ipfVar.w.h();
                if (ipfVar.l.g()) {
                    ((ist) ipfVar.l.c()).a();
                }
                break;
            case 1:
                ipf ipfVar2 = this.a;
                ipfVar2.t.a(ipf.class);
                ipfVar2.w.g();
                break;
            case 2:
                this.a.e(true);
                break;
            case 3:
                ipf ipfVar3 = this.a;
                ipfVar3.i.f(jrx.VIDEO);
                ipfVar3.i.h(ipfVar3.k.getResources().getString(R.string.video_accessibility_peek));
                break;
            case 4:
                this.a.e(false);
                break;
            case 5:
                ipf ipfVar4 = this.a;
                if (((inr) ipfVar4.j.d).equals(inr.STATE_PRE_RECORDING)) {
                    ((oug) ((oug) ipf.a.c()).G((char) 3078)).o("Pre-recording state, set statechart back to stop recording.");
                    ipfVar4.j.fB(inr.STATE_RECORDING_ERROR);
                    ipfVar4.C.b();
                }
                iqj iqjVar = ipfVar4.E;
                iqjVar.h.d(false);
                iqjVar.a();
                iqjVar.c(true);
                if (!iqjVar.k.k(dcu.J)) {
                    iro iroVar = iqjVar.i;
                    ViewGroup viewGroup = iqjVar.P;
                    if (viewGroup.indexOfChild(iroVar.f) != -1) {
                        iroVar.f.setVisibility(8);
                        iroVar.f.removeAllViews();
                        viewGroup.removeView(iroVar.f);
                    }
                    irz irzVar = iqjVar.v;
                    ViewGroup viewGroup2 = iqjVar.E;
                    if (irzVar.n != null) {
                        irzVar.r.removeOnLayoutChangeListener(irzVar.f);
                        irzVar.d();
                        irzVar.n.removeAllViews();
                        if (viewGroup2.indexOfChild(irzVar.n) != -1) {
                            viewGroup2.removeView(irzVar.n);
                        }
                    }
                }
                if (iqjVar.q.g()) {
                    ((ctw) iqjVar.q.c()).e(iqjVar.H);
                }
                break;
            case 6:
                ipf ipfVar5 = this.a;
                ipfVar5.y.unregisterListener(ipfVar5.x, ipfVar5.J);
                break;
            case 7:
                ipf ipfVar6 = this.a;
                if ((((inr) ipfVar6.j.d).k | inr.STATE_PREPARING_ON_PREVIEW_STARTED.k) == inr.STATE_IDLE.k) {
                    ipfVar6.j.fB(inr.STATE_IDLE);
                } else {
                    ipfVar6.j.fB(inr.STATE_PREPARING_ON_PREVIEW_STARTED);
                }
                ipfVar6.H.fB(fxl.b);
                ipfVar6.C.f();
                final ipr iprVar = ipfVar6.D;
                imt imtVar = iprVar.i;
                imv imvVarA = imw.a();
                imvVarA.a = "TimeLapseHeatEmergency";
                imvVarA.c(iprVar.f);
                imvVarA.f(ims.HEAT_EMERGENCY);
                imvVarA.e(new Runnable() { // from class: ipo
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                ipr iprVar2 = iprVar;
                                ((oug) ((oug) ipr.a.c()).G((char) 3106)).o("Device temperature is too high to do recording.");
                                iprVar2.j.a();
                                iprVar2.g.e(ims.HEAT_EMERGENCY, iprVar2.j.h());
                                ipc ipcVar = iprVar2.m;
                                ipcVar.a.e.set(true);
                                ipcVar.a.c();
                                break;
                            case 1:
                                ipr iprVar3 = iprVar;
                                iprVar3.j.b();
                                iprVar3.m.a.e.set(false);
                                break;
                            default:
                                ipr iprVar4 = iprVar;
                                ((oug) ((oug) ipr.a.c()).G((char) 3107)).o("Device temperature is too high that may impact video quality.");
                                iprVar4.g.e(ims.HEAT_CRITICAL, iprVar4.j.h());
                                break;
                        }
                    }
                });
                imvVarA.d(new Runnable() { // from class: ipo
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                ipr iprVar2 = iprVar;
                                ((oug) ((oug) ipr.a.c()).G((char) 3106)).o("Device temperature is too high to do recording.");
                                iprVar2.j.a();
                                iprVar2.g.e(ims.HEAT_EMERGENCY, iprVar2.j.h());
                                ipc ipcVar = iprVar2.m;
                                ipcVar.a.e.set(true);
                                ipcVar.a.c();
                                break;
                            case 1:
                                ipr iprVar3 = iprVar;
                                iprVar3.j.b();
                                iprVar3.m.a.e.set(false);
                                break;
                            default:
                                ipr iprVar4 = iprVar;
                                ((oug) ((oug) ipr.a.c()).G((char) 3107)).o("Device temperature is too high that may impact video quality.");
                                iprVar4.g.e(ims.HEAT_CRITICAL, iprVar4.j.h());
                                break;
                        }
                    }
                });
                lie lieVarD = imtVar.d(imvVarA.a());
                imt imtVar2 = iprVar.i;
                imv imvVarA2 = imw.a();
                imvVarA2.a = "TimeLapsePoorVideoQualityWarning";
                imvVarA2.c(iprVar.f);
                imvVarA2.f(ims.HEAT_CRITICAL);
                imvVarA2.e(bvf.o);
                final int i3 = 2;
                imvVarA2.d(new Runnable() { // from class: ipo
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                ipr iprVar2 = iprVar;
                                ((oug) ((oug) ipr.a.c()).G((char) 3106)).o("Device temperature is too high to do recording.");
                                iprVar2.j.a();
                                iprVar2.g.e(ims.HEAT_EMERGENCY, iprVar2.j.h());
                                ipc ipcVar = iprVar2.m;
                                ipcVar.a.e.set(true);
                                ipcVar.a.c();
                                break;
                            case 1:
                                ipr iprVar3 = iprVar;
                                iprVar3.j.b();
                                iprVar3.m.a.e.set(false);
                                break;
                            default:
                                ipr iprVar4 = iprVar;
                                ((oug) ((oug) ipr.a.c()).G((char) 3107)).o("Device temperature is too high that may impact video quality.");
                                iprVar4.g.e(ims.HEAT_CRITICAL, iprVar4.j.h());
                                break;
                        }
                    }
                });
                lie lieVarD2 = imtVar2.d(imvVarA2.a());
                iprVar.e.c(lieVarD);
                iprVar.e.c(lieVarD2);
                break;
            case 8:
                ipf ipfVar7 = this.a;
                ipfVar7.y.registerListener(ipfVar7.x, ipfVar7.J, 3);
                break;
            case 9:
                ipf ipfVar8 = this.a;
                ipfVar8.B.g();
                ipfVar8.j.fB(inr.STATE_UNINITIALIZED);
                break;
            default:
                this.a.A.e(true);
                break;
        }
    }
}
