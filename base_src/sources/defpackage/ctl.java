package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.camcorder.ui.modeslider.recordspeed.RecordSpeedSlider;
import com.google.android.apps.camera.ui.modeslider.ModeSlider;
import com.google.android.apps.camera.ui.modeslider.ModeSliderUi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class ctl implements ctm, lie, fik, fig, fie {
    private static final ouj o = ouj.h("com/google/android/apps/camera/camcorder/ui/modeslider/ModeSliderControllerImpl");
    public final lda a;
    public final BottomBarController b;
    public final epj d;
    public final ctn e;
    public final jeg f;
    public final jfn g;
    public final jlb h;
    public final ojc j;
    public ModeSliderUi l;
    public ObjectAnimator m;
    public ObjectAnimator n;
    private final lda q;
    private final cvo r;
    private final Set t;
    private final lar u;
    private final fjs v;
    private final pyn w;
    private final ddf x;
    private final AtomicBoolean p = new AtomicBoolean(false);
    public final Object i = new Object();
    public jrl k = jrl.UNINITIALIZED;
    private final lap s = new lap();
    public final Set c = new HashSet();

    public ctl(final fhv fhvVar, lda ldaVar, lda ldaVar2, BottomBarController bottomBarController, epj epjVar, lar larVar, ctn ctnVar, jeg jegVar, jfn jfnVar, ojc ojcVar, jlb jlbVar, Set set, cvo cvoVar, pyn pynVar, fjs fjsVar, ddf ddfVar) {
        this.a = ldaVar;
        this.q = ldaVar2;
        this.b = bottomBarController;
        this.r = cvoVar;
        this.d = epjVar;
        this.u = larVar;
        this.e = ctnVar;
        this.f = jegVar;
        this.g = jfnVar;
        this.j = ojcVar;
        this.h = jlbVar;
        this.w = pynVar;
        this.v = fjsVar;
        this.x = ddfVar;
        this.t = new HashSet(set);
        larVar.c(new Runnable() { // from class: ctg
            @Override // java.lang.Runnable
            public final void run() {
                fhvVar.e(this.a);
            }
        });
    }

    private final void n(boolean z, boolean z2) {
        synchronized (this.i) {
            if (k(this.k) && this.p.get()) {
                j(this.r.d());
                if (!z) {
                    this.l.setAlpha(1.0f);
                    if (z2) {
                        this.f.b();
                        return;
                    } else {
                        this.f.c();
                        return;
                    }
                }
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.l, (Property<ModeSliderUi, Float>) View.ALPHA, 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(116L);
                objectAnimatorOfFloat.setStartDelay(50L);
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat.addListener(new ctj(this, z2));
                this.m = objectAnimatorOfFloat;
                objectAnimatorOfFloat.start();
                return;
            }
            ((oug) ((oug) o.c()).G(639)).z("Ignore showing video mode slider. Current mode: %s, Ready to show UI: %b", this.k, this.p.get());
        }
    }

    public final void a() {
        this.b.setClickable(true);
        this.g.l(true);
        this.h.F(true);
        this.d.g(1);
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.f.a();
        this.c.clear();
        this.t.clear();
        this.s.close();
    }

    @Override // defpackage.ctm
    public final void d(boolean z) {
        if (!z) {
            this.l.setAlpha(0.0f);
            this.f.a();
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.l, (Property<ModeSliderUi, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.addListener(new ctk(this));
        this.n = objectAnimatorOfFloat;
        objectAnimatorOfFloat.start();
    }

    @Override // defpackage.ctm
    public final void e(ViewStub viewStub) {
        if (this.l == null) {
            this.l = (ModeSliderUi) viewStub.inflate();
        }
        jeg jegVar = this.f;
        ModeSliderUi modeSliderUi = this.l;
        ModeSlider modeSliderB = modeSliderUi.b();
        RecordSpeedSlider recordSpeedSliderA = this.l.a();
        Set set = this.t;
        jegVar.f = modeSliderUi;
        jegVar.g = modeSliderB;
        jegVar.h = recordSpeedSliderA;
        jegVar.i = set;
        if (this.j.g()) {
            ((ctw) this.j.c()).j(new cth(this));
        }
        ModeSlider modeSliderB2 = this.l.b();
        GradientDrawable gradientDrawable = (GradientDrawable) ((InsetDrawable) modeSliderB2.getBackground()).getDrawable();
        if (!this.x.k(ddl.ay) && gradientDrawable != null) {
            gradientDrawable.setTintMode(PorterDuff.Mode.DST);
            gradientDrawable.setTint(modeSliderB2.getContext().getColor(R.color.mode_slider_bg_color_legacy));
        }
        modeSliderB2.i(this.e, this.x);
        modeSliderB2.a = new cti(this);
        this.f.f();
        final int i = 2;
        this.s.c(this.a.a(new lij(this) { // from class: ctf
            public final /* synthetic */ ctl a;

            {
                this.a = this;
            }

            @Override // defpackage.lij
            public final void fB(Object obj) {
                switch (i) {
                    case 0:
                        ctl ctlVar = this.a;
                        if (((fxl) obj).c && ctlVar.e.f.containsKey(ctlVar.a.fA())) {
                            ctlVar.a();
                            ctlVar.f(true);
                            if (ctlVar.j.g()) {
                                ((ctw) ctlVar.j.c()).g(true);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        ctl ctlVar2 = this.a;
                        cwi cwiVar = (cwi) obj;
                        ModeSliderUi modeSliderUi2 = ctlVar2.l;
                        if (modeSliderUi2 == null || modeSliderUi2.getVisibility() != 0) {
                            return;
                        }
                        ctlVar2.j(cwiVar.a());
                        return;
                    default:
                        ctl ctlVar3 = this.a;
                        jrl jrlVar = (jrl) obj;
                        if (ctlVar3.k(jrlVar)) {
                            if (ctlVar3.l(jrlVar)) {
                                ctlVar3.i(jrlVar);
                                return;
                            }
                            return;
                        }
                        synchronized (ctlVar3.i) {
                            ctlVar3.k = jrlVar;
                            Iterator it = ctlVar3.c.iterator();
                            while (it.hasNext()) {
                                ((fzk) it.next()).a(jrlVar);
                            }
                            break;
                        }
                        ctlVar3.d(false);
                        return;
                }
            }
        }, mip.bS()));
        final int i2 = 0;
        this.s.c(this.q.a(new lij(this) { // from class: ctf
            public final /* synthetic */ ctl a;

            {
                this.a = this;
            }

            @Override // defpackage.lij
            public final void fB(Object obj) {
                switch (i2) {
                    case 0:
                        ctl ctlVar = this.a;
                        if (((fxl) obj).c && ctlVar.e.f.containsKey(ctlVar.a.fA())) {
                            ctlVar.a();
                            ctlVar.f(true);
                            if (ctlVar.j.g()) {
                                ((ctw) ctlVar.j.c()).g(true);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        ctl ctlVar2 = this.a;
                        cwi cwiVar = (cwi) obj;
                        ModeSliderUi modeSliderUi2 = ctlVar2.l;
                        if (modeSliderUi2 == null || modeSliderUi2.getVisibility() != 0) {
                            return;
                        }
                        ctlVar2.j(cwiVar.a());
                        return;
                    default:
                        ctl ctlVar3 = this.a;
                        jrl jrlVar = (jrl) obj;
                        if (ctlVar3.k(jrlVar)) {
                            if (ctlVar3.l(jrlVar)) {
                                ctlVar3.i(jrlVar);
                                return;
                            }
                            return;
                        }
                        synchronized (ctlVar3.i) {
                            ctlVar3.k = jrlVar;
                            Iterator it = ctlVar3.c.iterator();
                            while (it.hasNext()) {
                                ((fzk) it.next()).a(jrlVar);
                            }
                            break;
                        }
                        ctlVar3.d(false);
                        return;
                }
            }
        }, this.u));
        final int i3 = 1;
        this.s.c(this.r.a(new lij(this) { // from class: ctf
            public final /* synthetic */ ctl a;

            {
                this.a = this;
            }

            @Override // defpackage.lij
            public final void fB(Object obj) {
                switch (i3) {
                    case 0:
                        ctl ctlVar = this.a;
                        if (((fxl) obj).c && ctlVar.e.f.containsKey(ctlVar.a.fA())) {
                            ctlVar.a();
                            ctlVar.f(true);
                            if (ctlVar.j.g()) {
                                ((ctw) ctlVar.j.c()).g(true);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        ctl ctlVar2 = this.a;
                        cwi cwiVar = (cwi) obj;
                        ModeSliderUi modeSliderUi2 = ctlVar2.l;
                        if (modeSliderUi2 == null || modeSliderUi2.getVisibility() != 0) {
                            return;
                        }
                        ctlVar2.j(cwiVar.a());
                        return;
                    default:
                        ctl ctlVar3 = this.a;
                        jrl jrlVar = (jrl) obj;
                        if (ctlVar3.k(jrlVar)) {
                            if (ctlVar3.l(jrlVar)) {
                                ctlVar3.i(jrlVar);
                                return;
                            }
                            return;
                        }
                        synchronized (ctlVar3.i) {
                            ctlVar3.k = jrlVar;
                            Iterator it = ctlVar3.c.iterator();
                            while (it.hasNext()) {
                                ((fzk) it.next()).a(jrlVar);
                            }
                            break;
                        }
                        ctlVar3.d(false);
                        return;
                }
            }
        }, mip.bS()));
    }

    @Override // defpackage.ctm
    public final void f(boolean z) {
        if (z) {
            this.l.b().d();
        } else {
            this.l.b().c();
        }
    }

    @Override // defpackage.fie
    public final void fU() {
        this.p.set(false);
        ObjectAnimator objectAnimator = this.m;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
    }

    @Override // defpackage.fig
    public final void fV() {
        this.p.set(true);
    }

    @Override // defpackage.ctm
    public final void g(jrz jrzVar) {
        this.l.c(jrzVar);
    }

    @Override // defpackage.ctm
    public final void h(boolean z) {
        n(z, true);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x01dc  */
    public final void i(jrl jrlVar) {
        int i;
        String string;
        int i2;
        ModeSlider modeSliderB = this.l.b();
        RecordSpeedSlider recordSpeedSliderA = this.l.a();
        if (jrlVar.equals(jrl.VIDEO)) {
            n(false, false);
        } else {
            ctn ctnVar = this.e;
            ctnVar.a(jrlVar);
            ols olsVarR = ols.r();
            boolean zEquals = jrlVar.equals(jrl.VIDEO);
            int i3 = R.string.timelapse_record_speed;
            int i4 = 1;
            if (zEquals) {
                i = 2;
            } else if (jrlVar.equals(jrl.TIME_LAPSE)) {
                orh orhVarB = orh.b(Collections.reverseOrder());
                Object[] objArrX = ohh.x(ctnVar.b.c.values().v());
                Arrays.sort(objArrX, orhVarB);
                ArrayList arrayListAh = obr.ah(Arrays.asList(objArrX));
                oom oomVarQ = oom.q(Integer.valueOf(R.string.tooltip_msg_timelapse_record_speed_1x), Integer.valueOf(R.string.tooltip_msg_timelapse_record_speed_5x), Integer.valueOf(R.string.tooltip_msg_timelapse_record_speed_10x), Integer.valueOf(R.string.tooltip_msg_timelapse_record_speed_30x), Integer.valueOf(R.string.tooltip_msg_timelapse_record_speed_120x));
                Iterator it = arrayListAh.iterator();
                int i5 = 0;
                while (it.hasNext()) {
                    double dDoubleValue = ((Double) it.next()).doubleValue();
                    Context context = ctnVar.a;
                    Object[] objArr = new Object[i4];
                    ols olsVar = olsVarR;
                    double d = ctnVar.b.f;
                    Double.isNaN(d);
                    objArr[0] = Integer.valueOf((int) (d / dDoubleValue));
                    String string2 = context.getString(i3, objArr);
                    Context context2 = ctnVar.a;
                    double d2 = ctnVar.b.f;
                    Double.isNaN(d2);
                    String string3 = context2.getString(R.string.accessibility_timelapse_record_speed_desc, Integer.valueOf((int) (d2 / dDoubleValue)));
                    Integer numValueOf = Integer.valueOf(i5);
                    olsVar.l(numValueOf, string2);
                    olsVar.l(numValueOf, string3);
                    olsVar.l(numValueOf, ctnVar.a.getResources().getString(((Integer) oomVarQ.get(i5)).intValue()));
                    i5++;
                    olsVarR = olsVar;
                    i3 = R.string.timelapse_record_speed;
                    i4 = 1;
                }
                olsVarR = ols.s(olsVarR);
                i = 2;
            } else if (jrlVar.equals(jrl.SLOW_MOTION)) {
                String string4 = ctnVar.a.getString(R.string.accessibility_hfr_record_speed_desc, 1, 8);
                olsVarR.l(0, ctnVar.e);
                olsVarR.l(0, string4);
                olsVarR.l(0, ctnVar.a.getResources().getString(R.string.tooltip_msg_hfr_record_speed_1_8x));
                i = 2;
                String string5 = ctnVar.a.getString(R.string.accessibility_hfr_record_speed_desc, 1, 4);
                olsVarR.l(1, ctnVar.d);
                olsVarR.l(1, string5);
                olsVarR.l(1, ctnVar.a.getResources().getString(R.string.tooltip_msg_hfr_record_speed_1_4x));
                olsVarR = ols.s(olsVarR);
            } else {
                i = 2;
                olsVarR = ols.s(olsVarR);
            }
            ctn ctnVar2 = this.e;
            ctnVar2.a(jrlVar);
            if (jrlVar.equals(jrl.VIDEO)) {
                string = "";
            } else if (jrlVar.equals(jrl.TIME_LAPSE)) {
                string = ctnVar2.a.getString(R.string.timelapse_record_speed, Integer.valueOf((int) ctnVar2.b.a(((Double) ctnVar2.c.fA()).doubleValue())));
            } else if (jrlVar.equals(jrl.SLOW_MOTION)) {
                string = ((ldz) ctnVar2.g.d).equals(ldz.FPS_120_HFR_4X) ? ctnVar2.d : ctnVar2.e;
            } else {
                string = "";
            }
            int i6 = 0;
            while (true) {
                if (i6 >= olsVarR.n().size()) {
                    i2 = -1;
                    break;
                } else {
                    if (olsVarR.o(Integer.valueOf(i6), string)) {
                        i2 = i6;
                        break;
                    }
                    i6++;
                }
            }
            if (i2 == -1) {
                throw new IllegalArgumentException("No default speed id found");
            }
            boolean zEquals2 = jrlVar.equals(jrl.TIME_LAPSE);
            boolean z = !zEquals2;
            int i7 = true != zEquals2 ? R.drawable.quantum_gm_ic_slow_motion_video_white_18 : R.drawable.quantum_gm_ic_fast_forward_white_18;
            if (true == zEquals2) {
                i = 1;
            }
            if (this.j.g()) {
                this.f.d();
                modeSliderB.measure(0, 0);
                ((ctw) this.j.c()).l(olsVarR, recordSpeedSliderA, i, i2, i7, z, modeSliderB.getMeasuredWidth());
            }
        }
        ((jxo) this.w.get()).b();
        ((jxo) this.w.get()).c(jrlVar.name());
    }

    public final void j(lwd lwdVar) {
        ModeSlider modeSliderB = this.l.b();
        Iterator it = this.e.h.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!((jdz) it.next()).d) {
                if (lwdVar.equals(lwd.FRONT)) {
                    modeSliderB.getChildAt(i).setVisibility(8);
                } else {
                    modeSliderB.getChildAt(i).setVisibility(0);
                }
            }
            i++;
        }
    }

    public final boolean k(jrl jrlVar) {
        return this.e.f.containsKey(jrlVar);
    }

    public final boolean l(jrl jrlVar) {
        synchronized (this.i) {
            if (this.k.equals(jrlVar)) {
                return false;
            }
            if (!k(jrlVar)) {
                String strValueOf = String.valueOf(jrlVar);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 30);
                sb.append("Unsupported application mode: ");
                sb.append(strValueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            this.k = jrlVar;
            this.v.W(jri.f(jrlVar), 2);
            f(false);
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((fzk) it.next()).a(jrlVar);
            }
            ModeSlider modeSliderB = this.l.b();
            jdz jdzVar = (jdz) this.e.f.get(jrlVar);
            jdzVar.getClass();
            modeSliderB.k(modeSliderB.b(jdzVar));
            return true;
        }
    }

    @Override // defpackage.ctm
    public final lie m(final fzk fzkVar) {
        this.c.add(fzkVar);
        return new lie() { // from class: cte
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                ctl ctlVar = this.a;
                ctlVar.c.remove(fzkVar);
            }
        };
    }
}
