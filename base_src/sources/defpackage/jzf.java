package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageButton;
import android.widget.SeekBar;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.whitebalance.ManualWhiteBalanceKnob;
import com.google.android.apps.camera.whitebalance.ManualWhiteBalanceUi;

/* JADX INFO: loaded from: classes2.dex */
public final class jzf implements jzr, lie {
    public static final ouj a = ouj.h("com/google/android/apps/camera/whitebalance/ManualWhiteBalanceControllerImpl");
    public final ojc b;
    public ImageButton d;
    public ManualWhiteBalanceUi e;
    public jzq f;
    private final ius g;
    private final cvo h;
    private final lar i;
    private final ojc j;
    private final lda k;
    private final lda l;
    private AnimatorSet n;
    private final bqg p;
    public final lda c = new lce(false);
    private final lda m = new lce(false);
    private jrz o = jrz.PORTRAIT;

    public jzf(bqg bqgVar, ius iusVar, cvo cvoVar, lar larVar, ojc ojcVar, ojc ojcVar2, lda ldaVar, lda ldaVar2) {
        this.p = bqgVar;
        this.k = ldaVar;
        this.g = iusVar;
        this.h = cvoVar;
        this.i = larVar;
        this.j = ojcVar;
        this.b = ojcVar2;
        this.l = ldaVar2;
    }

    @Override // defpackage.jzr
    public final lco a() {
        return this.m;
    }

    @Override // defpackage.jzr
    public final lco b() {
        return this.f.i;
    }

    @Override // defpackage.jzr
    public final lco c() {
        return this.c;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.m.fB(false);
    }

    @Override // defpackage.jzr
    public final void d(boolean z, boolean z2) {
        if (((Boolean) this.l.fA()).booleanValue()) {
            this.i.c(new jzd(this, z2, z, 1));
        }
    }

    @Override // defpackage.jzr
    public final void e(View view) {
        ManualWhiteBalanceUi manualWhiteBalanceUi = (ManualWhiteBalanceUi) view;
        this.e = manualWhiteBalanceUi;
        this.d = manualWhiteBalanceUi.a();
        SeekBar seekBarB = this.e.b();
        int dimensionPixelSize = this.e.getResources().getDimensionPixelSize(R.dimen.manual_wb_slider_knob_size);
        seekBarB.setMax(200);
        seekBarB.setOnSeekBarChangeListener(new jze(this, dimensionPixelSize));
        jyy jyyVar = new jyy(this.e, this.i);
        this.f = jyyVar;
        jyyVar.f();
        this.d.setOnClickListener(new View.OnClickListener() { // from class: jza
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                jzf jzfVar = this.a;
                jzfVar.f();
                jzfVar.f.a(false);
            }
        });
        if (this.j.g()) {
            ((jzh) this.j.c()).a(this.g);
        }
        if (this.b.g()) {
            hcl hclVar = (hcl) this.b.c();
            hclVar.h(this.p);
            final int i = 2;
            this.p.i().c(hclVar.a().a(new lij(this) { // from class: jzb
                public final /* synthetic */ jzf a;

                {
                    this.a = this;
                }

                @Override // defpackage.lij
                public final void fB(Object obj) {
                    switch (i) {
                        case 0:
                            jzf jzfVar = this.a;
                            if (jzfVar.e != null) {
                                jzfVar.d(false, true);
                            } else {
                                ((oug) ((oug) jzf.a.c()).G((char) 3543)).o("UI has not inflated");
                            }
                            break;
                        case 1:
                            jzf jzfVar2 = this.a;
                            if (jzfVar2.e != null) {
                                jzfVar2.d(false, true);
                            } else {
                                ((oug) ((oug) jzf.a.c()).G((char) 3544)).o("UI haven't not inflated");
                            }
                            break;
                        default:
                            jzf jzfVar3 = this.a;
                            Boolean bool = (Boolean) obj;
                            if (jzfVar3.e == null) {
                                ((oug) ((oug) jzf.a.c()).G((char) 3542)).o("UI has not inflated");
                                break;
                            } else if (bool.booleanValue()) {
                                jzfVar3.f();
                                break;
                            }
                            break;
                    }
                }
            }, pgr.INSTANCE));
        }
        final int i2 = 0;
        this.p.i().c(this.k.a(new lij(this) { // from class: jzb
            public final /* synthetic */ jzf a;

            {
                this.a = this;
            }

            @Override // defpackage.lij
            public final void fB(Object obj) {
                switch (i2) {
                    case 0:
                        jzf jzfVar = this.a;
                        if (jzfVar.e != null) {
                            jzfVar.d(false, true);
                        } else {
                            ((oug) ((oug) jzf.a.c()).G((char) 3543)).o("UI has not inflated");
                        }
                        break;
                    case 1:
                        jzf jzfVar2 = this.a;
                        if (jzfVar2.e != null) {
                            jzfVar2.d(false, true);
                        } else {
                            ((oug) ((oug) jzf.a.c()).G((char) 3544)).o("UI haven't not inflated");
                        }
                        break;
                    default:
                        jzf jzfVar3 = this.a;
                        Boolean bool = (Boolean) obj;
                        if (jzfVar3.e == null) {
                            ((oug) ((oug) jzf.a.c()).G((char) 3542)).o("UI has not inflated");
                            break;
                        } else if (bool.booleanValue()) {
                            jzfVar3.f();
                            break;
                        }
                        break;
                }
            }
        }, pgr.INSTANCE));
        final int i3 = 1;
        this.p.i().c(this.h.a(new lij(this) { // from class: jzb
            public final /* synthetic */ jzf a;

            {
                this.a = this;
            }

            @Override // defpackage.lij
            public final void fB(Object obj) {
                switch (i3) {
                    case 0:
                        jzf jzfVar = this.a;
                        if (jzfVar.e != null) {
                            jzfVar.d(false, true);
                        } else {
                            ((oug) ((oug) jzf.a.c()).G((char) 3543)).o("UI has not inflated");
                        }
                        break;
                    case 1:
                        jzf jzfVar2 = this.a;
                        if (jzfVar2.e != null) {
                            jzfVar2.d(false, true);
                        } else {
                            ((oug) ((oug) jzf.a.c()).G((char) 3544)).o("UI haven't not inflated");
                        }
                        break;
                    default:
                        jzf jzfVar3 = this.a;
                        Boolean bool = (Boolean) obj;
                        if (jzfVar3.e == null) {
                            ((oug) ((oug) jzf.a.c()).G((char) 3542)).o("UI has not inflated");
                            break;
                        } else if (bool.booleanValue()) {
                            jzfVar3.f();
                            break;
                        }
                        break;
                }
            }
        }, pgr.INSTANCE));
        this.m.fB(true);
    }

    public final void f() {
        ((oug) ((oug) a.c()).G((char) 3545)).o("reset()");
        k(false);
        this.c.fB(false);
        if (this.b.g()) {
            ((hcl) this.b.c()).e(false);
        }
        this.e.b().setProgress(100);
        this.f.j();
    }

    @Override // defpackage.jzr
    public final void g(jrz jrzVar) {
        this.o = jrzVar;
        this.e.d(jrzVar, (jrl) this.k.fA());
    }

    @Override // defpackage.jzr
    public final void h(boolean z) {
        if (jrz.b(this.o)) {
            return;
        }
        if (this.n == null) {
            float dimensionPixelSize = this.e.getResources().getDimensionPixelSize(R.dimen.manual_wb_slider_margin_between_timer);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.e.b(), (Property<SeekBar, Float>) View.TRANSLATION_X, dimensionPixelSize);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.e.c(), (Property<ManualWhiteBalanceKnob, Float>) View.TRANSLATION_X, dimensionPixelSize);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.e.a(), (Property<ImageButton, Float>) View.TRANSLATION_X, dimensionPixelSize);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new LinearInterpolator());
            animatorSet.setDuration(300L);
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
            this.n = animatorSet;
        }
        if (z) {
            this.n.start();
        } else {
            this.n.reverse();
        }
        if (this.e.getVisibility() != 0) {
            this.n.end();
        }
    }

    @Override // defpackage.jzr
    public final void i(boolean z, boolean z2) {
        if (((Boolean) this.l.fA()).booleanValue()) {
            this.i.c(new jzd(this, z2, z, 0));
        }
    }

    @Override // defpackage.jzr
    public final void j(int i) {
        jzq jzqVar = this.f;
        if (jzqVar.g.getVisibility() != 0) {
            return;
        }
        jzqVar.k();
        jzqVar.g.postDelayed(jzqVar.j, i);
    }

    public final void k(boolean z) {
        if (z) {
            final int i = 1;
            this.d.animate().setStartDelay(0L).alpha(1.0f).withStartAction(new Runnable(this) { // from class: jzc
                public final /* synthetic */ jzf a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            this.a.d.setVisibility(8);
                            break;
                        default:
                            this.a.d.setVisibility(0);
                            break;
                    }
                }
            });
        } else {
            final int i2 = 0;
            this.d.animate().setStartDelay(0L).alpha(0.0f).withEndAction(new Runnable(this) { // from class: jzc
                public final /* synthetic */ jzf a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            this.a.d.setVisibility(8);
                            break;
                        default:
                            this.a.d.setVisibility(0);
                            break;
                    }
                }
            });
        }
    }
}
