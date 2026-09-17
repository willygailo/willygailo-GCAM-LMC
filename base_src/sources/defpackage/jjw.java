package defpackage;

import android.animation.ValueAnimator;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jjw implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ShutterButton a;
    private final /* synthetic */ int b;

    public /* synthetic */ jjw(ShutterButton shutterButton, int i) {
        this.b = i;
        this.a = shutterButton;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                this.a.m44x1bc333b8(valueAnimator);
                break;
            default:
                this.a.m42x760531c1(valueAnimator);
                break;
        }
    }
}
