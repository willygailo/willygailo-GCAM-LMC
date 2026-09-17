package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.views.MainActivityLayout;
import com.google.android.apps.camera.zoomui.ZoomUi;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class jqz implements jqn {
    private final kas a;
    private final qkg b;
    private final Context c;

    public jqz(kas kasVar, qkg qkgVar, Context context) {
        this.a = kasVar;
        this.b = qkgVar;
        this.c = context;
    }

    @Override // defpackage.jqn
    public final void a() {
        ZoomUi zoomUi = (ZoomUi) ((jnr) this.b.get()).c.c(R.id.zoom_ui);
        kas kasVar = this.a;
        Context context = this.c;
        final kbi kbiVar = (kbi) kasVar;
        kbiVar.H = zoomUi;
        boolean zK = kbiVar.c.k(ddl.ay);
        zoomUi.e = zK;
        zoomUi.n().h = zK;
        if (!zK) {
            Drawable drawableA = aar.a(zoomUi.getContext(), R.drawable.ic_zoom_seekbar_thumb);
            if (drawableA != null) {
                drawableA.setTint(zoomUi.getResources().getColor(R.color.zoom_knob_background_color_legacy, null));
                zoomUi.g().setThumb(drawableA);
            }
            Drawable drawableA2 = aar.a(zoomUi.getContext(), R.drawable.bg_zoom_toggle_button);
            if (drawableA2 != null) {
                drawableA2.setTint(zoomUi.getResources().getColor(R.color.zoom_toggle_button_background_color_legacy, null));
                zoomUi.f().setBackground(drawableA2);
            }
        }
        zoomUi.p(kbiVar.L, kbiVar.m);
        kbiVar.g.fB((Float) kbiVar.o.fA());
        kbiVar.B = zoomUi.c();
        kbiVar.C = zoomUi.d();
        kbiVar.F = zoomUi.n();
        kbiVar.G = zoomUi.g();
        kbiVar.E = context.getResources();
        kbiVar.I = new kad(kbiVar.n, kbiVar.g, kbiVar.f, kbiVar.e, kbiVar.b, kbiVar.m, kbiVar.c);
        kbiVar.c.f();
        kbiVar.z = new jzy(zoomUi, kbiVar.h, kbiVar.g, kbiVar.k, kbiVar.b, kbiVar.n, kbiVar.c, kbiVar.o, kbiVar.I, kbiVar.u);
        kbiVar.y = new kab(zoomUi, kbiVar.z);
        kbiVar.R();
        kbiVar.N();
        final int i = 0;
        kbiVar.O(kbiVar.B, false);
        final int i2 = 1;
        kbiVar.O(kbiVar.C, true);
        if (kbiVar.L) {
            kbiVar.N = false;
            kbiVar.M = false;
            final GestureDetector gestureDetector = new GestureDetector(kbiVar.H.g().getContext(), new kbe(kbiVar));
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            kbiVar.G.setOnTouchListener(new View.OnTouchListener() { // from class: kaz
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    final kbi kbiVar2 = kbiVar;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    GestureDetector gestureDetector2 = gestureDetector;
                    if (!kbiVar2.H.s() && !kbiVar2.M) {
                        return false;
                    }
                    if (motionEvent.getAction() == 1) {
                        if (atomicBoolean2.get()) {
                            atomicBoolean2.set(false);
                            return false;
                        }
                        if (kbiVar2.N) {
                            kbiVar2.z.b();
                            kbiVar2.F.a(false);
                            kbiVar2.N = false;
                        }
                        view.postDelayed(kbiVar2.q, 100L);
                        view.removeCallbacks(kbiVar2.r);
                        kbiVar2.p.set(true);
                        kbiVar2.Q = 0.0f;
                    }
                    gestureDetector2.onTouchEvent(motionEvent);
                    if (motionEvent.getAction() == 0) {
                        view.postDelayed(kbiVar2.r, kbiVar2.v.g() ? ((Integer) kbiVar2.v.c()).intValue() : 350L);
                        final MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction(1);
                        atomicBoolean2.set(true);
                        view.postDelayed(new Runnable() { // from class: kav
                            @Override // java.lang.Runnable
                            public final void run() {
                                kbi kbiVar3 = kbiVar2;
                                kbiVar3.G.dispatchTouchEvent(motionEventObtain);
                            }
                        }, 1L);
                        kbiVar2.p.set(false);
                        kbiVar2.J = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
                    }
                    if (motionEvent.getAction() == 2 && !kbiVar2.M && (kbiVar2.J(motionEvent) > kbiVar2.F.getWidth() / 2 || kbiVar2.J(motionEvent) < (-(kbiVar2.F.getWidth() / 2)))) {
                        view.removeCallbacks(kbiVar2.r);
                        kbiVar2.p.set(true);
                    }
                    if (motionEvent.getAction() != 2 || !kbiVar2.M) {
                        return kbiVar2.M;
                    }
                    if (Math.abs(kbiVar2.J(motionEvent)) <= 5.0f) {
                        kbiVar2.L();
                        return true;
                    }
                    motionEvent.setLocation(motionEvent.getX() - kbiVar2.Q, motionEvent.getY());
                    kbiVar2.I.h();
                    return false;
                }
            });
        }
        lij lijVar = new lij() { // from class: kbb
            @Override // defpackage.lij
            public final void fB(Object obj) {
                switch (i2) {
                    case 0:
                        kbiVar.h();
                        break;
                    default:
                        kbi kbiVar2 = kbiVar;
                        Float f = (Float) obj;
                        kbiVar2.F.c(kbiVar2.K(f.floatValue()), f.floatValue(), ((Float) ((lce) kbiVar2.f).d).floatValue(), kbiVar2.H());
                        break;
                }
            }
        };
        lij lijVar2 = new lij() { // from class: kbb
            @Override // defpackage.lij
            public final void fB(Object obj) {
                switch (i) {
                    case 0:
                        kbiVar.h();
                        break;
                    default:
                        kbi kbiVar2 = kbiVar;
                        Float f = (Float) obj;
                        kbiVar2.F.c(kbiVar2.K(f.floatValue()), f.floatValue(), ((Float) ((lce) kbiVar2.f).d).floatValue(), kbiVar2.H());
                        break;
                }
            }
        };
        kbiVar.d.c(kbiVar.g.a(lijVar, kbiVar.w));
        kbiVar.d.c(kbiVar.e.a(lijVar2, kbiVar.w));
        kbiVar.d.c(kbiVar.f.a(lijVar2, kbiVar.w));
        kbiVar.G.setOnSeekBarChangeListener(new kbf(kbiVar));
        kbiVar.G.setAccessibilityDelegate(new kbg(kbiVar));
        if (kbiVar.T.g()) {
            ((iaz) kbiVar.T.c()).c();
        }
        kbiVar.y.f();
        if (kbiVar.l) {
            kbiVar.L = false;
            kbiVar.H.p(false, kbiVar.m);
            kbiVar.z.w = false;
        }
        MainActivityLayout mainActivityLayout = (MainActivityLayout) ((jnr) this.b.get()).c.c(R.id.activity_root_view);
        mainActivityLayout.f = zoomUi;
        mainActivityLayout.t(mainActivityLayout.d().j);
    }
}
