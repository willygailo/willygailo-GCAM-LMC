package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuView;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.stream.Collectors;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class gtz {
    public final View a;
    public final boolean b;
    public final int c;
    private final OptionsMenuContainer d;
    private final FrameLayout e;
    private final ope f;
    private final jrz g;
    private final boolean h;
    private final boolean i;
    private final int j;
    private final View k;

    public gtz(OptionsMenuContainer optionsMenuContainer, boolean z, boolean z2, boolean z3, View view) {
        this.d = optionsMenuContainer;
        FrameLayout frameLayoutF = optionsMenuContainer.f();
        frameLayoutF.getClass();
        this.e = frameLayoutF;
        View viewD = optionsMenuContainer.d();
        viewD.getClass();
        this.a = viewD;
        OptionsMenuView optionsMenuViewN = optionsMenuContainer.n();
        optionsMenuViewN.getClass();
        RelativeLayout relativeLayoutM = optionsMenuContainer.m();
        relativeLayoutM.getClass();
        View viewC = optionsMenuContainer.c();
        viewC.getClass();
        this.f = ope.J(optionsMenuViewN, relativeLayoutM, viewC);
        this.g = optionsMenuContainer.b;
        this.b = z;
        this.h = z2;
        this.i = z3;
        this.k = view;
        this.c = true != z ? 4 : 0;
        this.j = true != z ? 0 : 4;
    }

    public final Animator a() {
        int width;
        ooh oohVar = new ooh();
        final int i = 0;
        final int i2 = 1;
        if (!this.i) {
            float f = true != this.b ? 1.0f : 0.0f;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.e, (Property<FrameLayout, Float>) View.ALPHA, 1.0f - f, f);
            objectAnimatorOfFloat.setDuration(0L);
            objectAnimatorOfFloat.setInterpolator(new adt());
            objectAnimatorOfFloat.addListener(new jsb(this.e, this.j));
            oohVar.g(objectAnimatorOfFloat);
        }
        jrz jrzVar = jrz.PORTRAIT;
        switch (this.g.ordinal()) {
            case 1:
                width = (jsa.e(this.k)[0] - jsa.e(this.a)[0]) + ((this.k.getWidth() - this.a.getWidth()) / 2);
                break;
            case 2:
                width = -((jsa.e(this.k)[0] - jsa.e(this.a)[0]) + ((this.k.getWidth() - this.a.getWidth()) / 2));
                break;
            default:
                width = (jsa.e(this.k)[1] - jsa.e(this.a)[1]) + ((this.k.getHeight() - this.a.getHeight()) / 2);
                break;
        }
        float f2 = true == this.b ? 1.0f : 0.0f;
        float f3 = 1.0f - f2;
        float f4 = width;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.a, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, f3, f2), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, f3, f2), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f3, f2), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, (1.0f - f3) * f4, f4 * f3));
        objectAnimatorOfPropertyValuesHolder.setDuration(0L);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new adt());
        objectAnimatorOfPropertyValuesHolder.addListener(new jsb(this.a, this.c));
        if (!this.h) {
            objectAnimatorOfPropertyValuesHolder.addListener(new jru(this.d));
        }
        objectAnimatorOfPropertyValuesHolder.addListener(mip.ev(new Consumer(this) { // from class: gtx
            public final /* synthetic */ gtz a;

            {
                this.a = this;
            }

            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        this.a.a.setTranslationY(0.0f);
                        break;
                    default:
                        this.a.a.sendAccessibilityEvent(8);
                        break;
                }
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                switch (i) {
                    case 0:
                        break;
                }
                return Consumer.CC.$default$andThen(this, consumer);
            }
        }));
        oohVar.g(objectAnimatorOfPropertyValuesHolder);
        if (!this.h) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether((Collection<Animator>) j$.util.Collection.EL.stream(this.f).map(new Function() { // from class: gty
                @Override // j$.util.function.Function
                public final /* synthetic */ Function andThen(Function function) {
                    return Function.CC.$default$andThen(this, function);
                }

                @Override // j$.util.function.Function
                public final Object apply(Object obj) {
                    gtz gtzVar = this.a;
                    View view = (View) obj;
                    float f5 = true != gtzVar.b ? 0.0f : 1.0f;
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f - f5, f5);
                    objectAnimatorOfFloat2.setDuration(50L);
                    objectAnimatorOfFloat2.setInterpolator(new adt());
                    objectAnimatorOfFloat2.addListener(new jsb(view, gtzVar.c));
                    return objectAnimatorOfFloat2;
                }

                @Override // j$.util.function.Function
                public final /* synthetic */ Function compose(Function function) {
                    return Function.CC.$default$compose(this, function);
                }
            }).collect(Collectors.toList()));
            oohVar.g(animatorSet);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(this.b ? oohVar.f() : obr.al(oohVar.f()));
        if (this.b) {
            animatorSet2.addListener(mip.ew(new Consumer(this) { // from class: gtx
                public final /* synthetic */ gtz a;

                {
                    this.a = this;
                }

                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    switch (i2) {
                        case 0:
                            this.a.a.setTranslationY(0.0f);
                            break;
                        default:
                            this.a.a.sendAccessibilityEvent(8);
                            break;
                    }
                }

                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    switch (i2) {
                        case 0:
                            break;
                    }
                    return Consumer.CC.$default$andThen(this, consumer);
                }
            }));
        }
        return animatorSet2;
    }
}
