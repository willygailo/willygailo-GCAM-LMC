package defpackage;

import android.animation.AnimatorSet;
import android.graphics.SurfaceTexture;
import android.hardware.display.DisplayManager;
import android.support.constraint.ConstraintLayout;
import android.view.Choreographer;
import android.view.GestureDetector;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.debugui.DebugCanvasView;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import com.google.android.apps.camera.ui.views.CaptureAnimationOverlay;
import com.google.android.apps.camera.ui.views.MainActivityLayout;
import com.google.android.apps.camera.ui.views.ViewfinderCover;
import com.google.android.apps.camera.ui.wirers.PreviewOverlay;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class bvk implements btv {
    public static final ouj a = ouj.h("com/google/android/apps/camera/app/ui/CameraAppUiImpl");
    public boolean A;
    public final enl B;
    private final boolean C;
    private final jak D;
    private final BottomBarController E;
    private final epj F;
    private final hoj G;
    private final ddf H;
    private final CaptureAnimationOverlay I;
    private final gtg J;
    private final jil K;
    private final jil L;
    private final jil M;
    private final ixx N;
    private final qkg O;
    private final bqg Q;
    public final bts b;
    public final ConstraintLayout c;
    public final jfn d;
    public final ViewfinderCover e;
    public final MainActivityLayout f;
    public final FrameLayout g;
    public final ShutterButton h;
    public final jlb i;
    public final dju j;
    public final DisplayManager.DisplayListener k;
    public int l;
    public final PreviewOverlay m;
    public jio n;
    public final ivj p;
    public jil q;
    public final jng r;
    public SurfaceTexture s;
    public int t;
    public int u;
    public final DisplayManager v;
    public final WindowManager w;
    public final fjs x;
    public final CameraActivityTiming y;
    public final pih z;
    public final View.OnLayoutChangeListener o = new bvg();
    private int R = 1;
    private pih P = pih.f();

    public bvk(final bts btsVar, MainActivityLayout mainActivityLayout, jns jnsVar, jnr jnrVar, jcf jcfVar, jng jngVar, bqg bqgVar, DisplayManager displayManager, WindowManager windowManager, ivj ivjVar, ixx ixxVar, final buc bucVar, BottomBarController bottomBarController, jlb jlbVar, epj epjVar, fjs fjsVar, CameraActivityTiming cameraActivityTiming, qkg qkgVar, jfn jfnVar, jak jakVar, gtg gtgVar, jjp jjpVar, pih pihVar, dju djuVar, ddf ddfVar, hoj hojVar, boolean z) {
        this.b = btsVar;
        this.f = mainActivityLayout;
        this.C = z;
        this.r = jngVar;
        this.O = qkgVar;
        this.Q = bqgVar;
        this.v = displayManager;
        this.w = windowManager;
        this.N = ixxVar;
        this.p = ivjVar;
        ConstraintLayout constraintLayout = jnrVar.a;
        this.c = constraintLayout;
        this.E = bottomBarController;
        this.i = jlbVar;
        this.F = epjVar;
        this.d = jfnVar;
        this.D = jakVar;
        this.J = gtgVar;
        this.j = djuVar;
        this.G = hojVar;
        this.H = ddfVar;
        this.e = (ViewfinderCover) jnrVar.c.c(R.id.viewfinder_cover);
        this.x = fjsVar;
        this.y = cameraActivityTiming;
        this.z = pihVar;
        gtgVar.aR = new gul() { // from class: bvc
            @Override // defpackage.gul
            public final void a() {
                this.a.d();
            }
        };
        gtgVar.aS = new gtf() { // from class: bvb
            @Override // defpackage.gtf
            public final void a() {
                btsVar.q();
            }
        };
        jjpVar.a.f.setOnClickListener(new View.OnClickListener() { // from class: bva
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.d();
            }
        });
        bqgVar.i().c(ivjVar.a(new ivi() { // from class: bvd
            @Override // defpackage.ivi
            public final void a() {
                buc bucVar2 = bucVar;
                ouj oujVar = bvk.a;
                bucVar2.h();
            }
        }));
        bqgVar.i().c(bucVar.a(new bvh(this)));
        this.l = fcy.d(windowManager);
        bvi bviVar = new bvi(this);
        this.k = bviVar;
        displayManager.registerDisplayListener(bviVar, null);
        this.h = (ShutterButton) jnsVar.k.c(R.id.shutter_button);
        jus jusVarA = jus.a(constraintLayout);
        this.g = (FrameLayout) jusVarA.c(R.id.module_layout);
        this.m = (PreviewOverlay) jusVarA.c(R.id.preview_overlay);
        this.I = (CaptureAnimationOverlay) jusVarA.c(R.id.capture_animation_overlay);
        this.B = new enl(null);
        djuVar.b((DebugCanvasView) jusVarA.c(R.id.debug_viz_view));
        jim jimVar = new jim(new jir((ConstraintLayout) mainActivityLayout.findViewById(R.id.activity_root_view), jcfVar, windowManager, this));
        this.M = jimVar;
        this.q = jimVar;
        jim jimVar2 = new jim(new jis(jngVar));
        this.K = jimVar2;
        this.L = jimVar2;
        jnsVar.d.setImportantForAccessibility(1);
        jnsVar.d.setAccessibilityDelegate(new bvj());
    }

    private final void t(boolean z) {
        this.E.setCameraSwitchEnabled(z);
        this.D.d(z);
    }

    private static final void u(jil jilVar) {
        jilVar.h(null);
    }

    @Override // defpackage.btv
    public final ojc a() {
        return this.q.c();
    }

    @Override // defpackage.btv
    public final void b() {
        this.q.f();
    }

    @Override // defpackage.btv
    public final void c() {
        CaptureAnimationOverlay captureAnimationOverlay = this.I;
        AnimatorSet animatorSet = captureAnimationOverlay.b;
        if (animatorSet != null && animatorSet.isRunning()) {
            captureAnimationOverlay.b.cancel();
        }
        captureAnimationOverlay.c = 1;
        captureAnimationOverlay.setVisibility(4);
    }

    @Override // defpackage.btv
    public final void d() {
        if (this.Q.f()) {
            return;
        }
        if (this.C) {
            this.b.m();
        } else {
            this.d.b();
            this.N.a();
        }
    }

    @Override // defpackage.btv
    public final void e() {
        this.E.setSideButtonsClickable(false);
    }

    @Override // defpackage.btv
    public final void f() {
        this.E.setSideButtonsClickable(true);
    }

    @Override // defpackage.fgl
    public final boolean fX() {
        if (!this.J.F()) {
            return this.b.h().q();
        }
        this.J.g();
        return true;
    }

    @Override // defpackage.btv
    public final void g() {
        this.E.setClickable(true);
        this.i.F(true);
        this.F.g(1);
    }

    @Override // defpackage.btv
    public final void h(boolean z) {
        this.A = false;
        this.e.j();
        if (this.H.k(dcy.c)) {
            this.G.a(this.b.l());
        }
        if (!z) {
            this.J.j();
        }
        Object obj = this.O.get();
        ijs ijsVar = (ijs) obj;
        if (!ijsVar.l(ijj.MODE_SWITCH_FIRST_PREVIEW)) {
            ijsVar.i(ijj.MODE_SWITCH_FIRST_PREVIEW);
            ijk ijkVar = (ijk) obj;
            ijkVar.a.a();
            ijkVar.a = lji.b;
            this.P.o(Object.class);
            this.P = pih.f();
        }
        if (this.y.l(ijf.ACTIVITY_FIRST_PREVIEW_FRAME_RENDERED)) {
            return;
        }
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: buz
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                bvk bvkVar = this.a;
                CameraActivityTiming cameraActivityTiming = bvkVar.y;
                cameraActivityTiming.j(ijf.ACTIVITY_FIRST_PREVIEW_FRAME_RENDERED, CameraActivityTiming.a);
                cameraActivityTiming.f.a();
                cameraActivityTiming.f = lji.b;
                bvkVar.z.o(bxg.e);
            }
        });
    }

    @Override // defpackage.btv
    public final void i(boolean z) {
        this.x.x(z);
    }

    @Override // defpackage.btv
    public final void j() {
        this.e.g(this.b.l());
    }

    @Override // defpackage.btv
    public final void k(boolean z) {
        this.i.H(z);
    }

    @Override // defpackage.btv
    public final void l() {
        this.I.b();
    }

    @Override // defpackage.btv
    public final void m() {
        this.I.a(true);
        t(false);
    }

    @Override // defpackage.btv
    public final void n() {
        this.I.a(false);
        t(true);
    }

    @Override // defpackage.btv
    public final void o() {
        this.E.setCameraSwitchEnabled(true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.s = surfaceTexture;
        this.t = i;
        this.u = i2;
        jio jioVar = this.n;
        if (jioVar != null) {
            jioVar.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.s = null;
        jio jioVar = this.n;
        if (jioVar == null) {
            return false;
        }
        jioVar.onSurfaceTextureDestroyed(surfaceTexture);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.s = surfaceTexture;
        this.t = i;
        this.u = i2;
        jio jioVar = this.n;
        if (jioVar != null) {
            jioVar.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.s = surfaceTexture;
    }

    @Override // defpackage.btv
    public final void p(int i, jio jioVar) {
        this.K.getClass();
        this.L.getClass();
        this.M.getClass();
        obr.aF(true);
        int i2 = this.R;
        if (i == i2) {
            this.n = jioVar;
        } else {
            this.n = null;
            if (i2 != 1) {
                if (i2 == 3) {
                    u(this.q);
                }
                jil jilVar = this.q;
                if (jilVar != null) {
                    jilVar.e();
                }
            }
            this.n = jioVar;
            jil jilVar2 = this.K;
            jilVar2.getClass();
            jil jilVar3 = this.L;
            jilVar3.getClass();
            jil jilVar4 = this.M;
            jilVar4.getClass();
            switch (i - 1) {
                case 2:
                    jilVar2 = jilVar4;
                    break;
                default:
                    if (this.q == jilVar2) {
                        jilVar2 = jilVar3;
                    }
                    break;
            }
            this.q = jilVar2;
            this.R = i;
            jilVar2.getClass();
            if (i == 3) {
                jilVar2.h(this.o);
            }
            this.q.d();
        }
        jio jioVar2 = this.n;
        if (jioVar2 != null) {
            GestureDetector.OnGestureListener onGestureListenerA = jioVar2.a();
            if (onGestureListenerA != null) {
                PreviewOverlay previewOverlay = this.m;
                previewOverlay.a = new GestureDetector(previewOverlay.getContext(), onGestureListenerA);
            }
            View.OnTouchListener onTouchListenerB = this.n.b();
            if (onTouchListenerB != null) {
                this.m.b = onTouchListenerB;
            }
        }
    }

    public final void q(jrl jrlVar) {
        this.b.p(jrlVar);
        if (this.d.s(jrlVar)) {
            this.d.l(true);
        } else if (jrlVar == jrl.VIDEO_INTENT) {
            this.d.l(false);
        } else {
            this.d.l(false);
        }
    }

    public final void r() {
        if (this.R == 1) {
            return;
        }
        u(this.q);
        try {
            this.q.e().get(2000L, TimeUnit.MILLISECONDS);
            this.R = 1;
        } catch (InterruptedException e) {
            throw new IllegalStateException("Synchronization close failed on preview switch.");
        } catch (ExecutionException e2) {
            throw new IllegalStateException("Synchronization close failed on preview switch.");
        } catch (TimeoutException e3) {
            throw new IllegalStateException("Surface Destruction Synchronization on Module Switch Timed out.");
        }
    }
}
