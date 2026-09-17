package defpackage;

import android.util.DisplayMetrics;
import com.Helper;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import com.google.android.apps.camera.stats.timing.OneCameraTiming;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final class ghu {
    public static final ouj a = ouj.h("com/google/android/apps/camera/one/capture/CaptureOneCameraCreator");
    public final lar b;
    public final bxj c;
    public final Executor d;
    public final gqy e;
    public final hpb f;
    public final DisplayMetrics g;
    public final CameraActivityTiming h;
    public final ijn i;
    public final ojc j;
    public final jrl k;
    public final cvo l;
    public final ojc m;
    public ght n;
    public final lwf o;
    public final fbf p;
    public final nez q;
    private final lkd r;

    public ghu(lar larVar, bxj bxjVar, hpb hpbVar, Executor executor, gqy gqyVar, lwf lwfVar, DisplayMetrics displayMetrics, CameraActivityTiming cameraActivityTiming, ijn ijnVar, cvo cvoVar, lkd lkdVar, ojc ojcVar, fbf fbfVar, ojc ojcVar2, nez nezVar, jrl jrlVar, byte[] bArr) {
        this.b = larVar;
        this.c = bxjVar;
        this.d = executor;
        this.e = gqyVar;
        this.f = hpbVar;
        this.o = lwfVar;
        this.g = displayMetrics;
        this.h = cameraActivityTiming;
        this.i = ijnVar;
        this.p = fbfVar;
        this.j = ojcVar2;
        this.q = nezVar;
        this.k = jrlVar;
        this.l = cvoVar;
        this.r = lkdVar;
        this.m = ojcVar;
    }

    public final fwm a(fvx fvxVar) {
        this.o.f(fvxVar.a);
        return new fwm(fvxVar, new fwh(fvxVar.a, fvxVar.d.a));
    }

    public final pht b(fvx fvxVar, pht phtVar) {
        return c(a(fvxVar), phtVar);
    }

    public final pht c(final fwm fwmVar, final pht phtVar) {
        this.r.d(fwmVar.a.a);
        return plk.aa(new pgj() { // from class: ghn
            @Override // defpackage.pgj
            public final pht a() {
                gfv evtVar;
                gfu gfuVar;
                pht phtVar2;
                bws bwsVar;
                Future future;
                final ghu ghuVar = this.a;
                final fwm fwmVar2 = fwmVar;
                pht phtVar3 = phtVar;
                ght ghtVar = ghuVar.n;
                if (ghtVar != null && fwmVar2.b.equals(ghtVar.a)) {
                    Future future2 = ghtVar.e;
                    try {
                        if ((!future2.isDone() || ((jnj) future2.get()).a.isValid()) && !ghtVar.d.a()) {
                            ght ghtVar2 = ghuVar.n;
                            ghtVar2.getClass();
                            return ghtVar2.c;
                        }
                    } catch (InterruptedException e) {
                    } catch (ExecutionException e2) {
                    }
                }
                ghuVar.e();
                final ojc ojcVarB = ghuVar.j.b(eto.g);
                pht phtVarI = pgb.i(phtVar3, new pgk() { // from class: gho
                    @Override // defpackage.pgk
                    public final pht a(Object obj) {
                        fwm fwmVar3 = fwmVar2;
                        return ((jng) obj).f(fwmVar3.a.d, ojcVarB);
                    }
                }, ghuVar.b);
                final OneCameraTiming oneCameraTiming = (OneCameraTiming) ghuVar.i.a();
                fvx fvxVar = fwmVar2.a;
                lig ligVar = fvxVar.c;
                giu giuVar = new giu(fvxVar, phtVarI, ghuVar.g, ghuVar.f, ghuVar.q, ghuVar.k, ghuVar.e, ghuVar.l, ojcVarB, ghuVar.m, null);
                oneCameraTiming.i(ijl.ONECAMERA_CREATE);
                oneCameraTiming.a.e("OneCamera#create");
                bws bwsVar2 = new bws();
                lvs lvsVar = fvxVar.a;
                final lie lieVarB = ghuVar.c.b();
                fbf fbfVar = ghuVar.p;
                ghx ghxVarF = ghuVar.o.f(fvxVar.a);
                fbfVar.b.e("OneCameraDependencies#new");
                try {
                    gjl gjlVarB = fbfVar.a.B(new gmc(ghxVarF), giuVar, new gsg(gsf.a(ghxVarF, ligVar, Helper.sImg)));
                    fbfVar.b.f();
                    jrl jrlVar = giuVar.e;
                    if (jrlVar == jrl.PORTRAIT) {
                        evp evpVar = (evp) gjlVarB;
                        evtVar = new evu(evpVar.a, evpVar.b);
                    } else if (jrlVar == jrl.LONG_EXPOSURE) {
                        evp evpVar2 = (evp) gjlVarB;
                        evtVar = new evr(evpVar2.a, evpVar2.b);
                    } else if (jrlVar == jrl.MOTION_BLUR) {
                        evp evpVar3 = (evp) gjlVarB;
                        evtVar = new evs(evpVar3.a, evpVar3.b);
                    } else if (jrlVar == jrl.IMAGE_INTENT) {
                        evp evpVar4 = (evp) gjlVarB;
                        evtVar = new evq(evpVar4.a, evpVar4.b);
                    } else {
                        evp evpVar5 = (evp) gjlVarB;
                        evtVar = new evt(evpVar5.a, evpVar5.b);
                    }
                    final gfu gfuVarA = evtVar.a();
                    oneCameraTiming.i(ijl.ONECAMERA_CREATED);
                    oneCameraTiming.a.f();
                    gfuVarA.i().c(lieVarB);
                    gfuVarA.i().c(new dfa(phtVarI, 3));
                    if (ojcVarB.g()) {
                        gfuVarA.i().c((jwx) ojcVarB.c());
                    }
                    mip.ca(gfuVarA.h().g, new lht() { // from class: ghl
                        @Override // defpackage.lht
                        public final void a(Object obj) {
                            CameraActivityTiming cameraActivityTiming = ghuVar.h;
                            cameraActivityTiming.j(ijf.ACTIVITY_FIRST_PREVIEW_FRAME_RECEIVED, CameraActivityTiming.a);
                            cameraActivityTiming.g.a();
                            cameraActivityTiming.g = lji.b;
                        }
                    }, pgr.INSTANCE);
                    oneCameraTiming.i(ijl.ONECAMERA_START);
                    oneCameraTiming.b = oneCameraTiming.a.a("OneCamera#start");
                    pht phtVarH = pgb.h(pfj.i(gfuVarA.e(), Throwable.class, new pgk() { // from class: ghp
                        @Override // defpackage.pgk
                        public final pht a(Object obj) {
                            gfu gfuVar2 = gfuVarA;
                            lie lieVar = lieVarB;
                            Throwable th = (Throwable) obj;
                            ((oug) ((oug) ((oug) ghu.a.b()).h(th)).G((char) 2075)).o("Exception occurred while starting camera");
                            gfuVar2.close();
                            lieVar.close();
                            return plk.U(th);
                        }
                    }, pgr.INSTANCE), new oiu() { // from class: ghm
                        @Override // defpackage.oiu
                        public final Object a(Object obj) {
                            lie lieVar = lieVarB;
                            OneCameraTiming oneCameraTiming2 = oneCameraTiming;
                            gfu gfuVar2 = gfuVarA;
                            lieVar.close();
                            oneCameraTiming2.i(ijl.ONECAMERA_STARTED);
                            oneCameraTiming2.b.a();
                            oneCameraTiming2.b = lji.b;
                            oneCameraTiming2.close();
                            return gfuVar2;
                        }
                    }, ghuVar.d);
                    ghs ghsVar = new ghs();
                    ghsVar.a = fwmVar2.b;
                    if (gfuVarA == null) {
                        throw new NullPointerException("Null camera");
                    }
                    ghsVar.b = gfuVarA;
                    ghsVar.e = phtVarI;
                    ghsVar.d = bwsVar2;
                    ghsVar.c = phtVarH;
                    fwh fwhVar = ghsVar.a;
                    if (fwhVar != null && (gfuVar = ghsVar.b) != null && (phtVar2 = ghsVar.c) != null && (bwsVar = ghsVar.d) != null && (future = ghsVar.e) != null) {
                        ghuVar.n = new ght(fwhVar, gfuVar, phtVar2, bwsVar, future);
                        return ghuVar.n.c;
                    }
                    StringBuilder sb = new StringBuilder();
                    if (ghsVar.a == null) {
                        sb.append(" cameraKey");
                    }
                    if (ghsVar.b == null) {
                        sb.append(" camera");
                    }
                    if (ghsVar.c == null) {
                        sb.append(" starting");
                    }
                    if (ghsVar.d == null) {
                        sb.append(" closed");
                    }
                    if (ghsVar.e == null) {
                        sb.append(" previewSurface");
                    }
                    String strValueOf = String.valueOf(sb);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
                    sb2.append("Missing required properties:");
                    sb2.append(strValueOf);
                    throw new IllegalStateException(sb2.toString());
                } catch (gse e3) {
                    throw new IllegalStateException("Unable to access OneCamera.", e3);
                }
            }
        }, this.d);
    }

    public final void d() {
        this.d.execute(new Runnable() { // from class: ghq
            @Override // java.lang.Runnable
            public final void run() {
                this.a.e();
            }
        });
    }

    public final void e() {
        ght ghtVar = this.n;
        if (ghtVar == null) {
            return;
        }
        ghtVar.b.close();
        ghtVar.c.cancel(true);
        this.n = null;
    }
}
