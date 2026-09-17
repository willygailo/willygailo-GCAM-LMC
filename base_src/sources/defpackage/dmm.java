package defpackage;

import android.view.animation.Animation;

/* JADX INFO: loaded from: classes.dex */
final class dmm implements Animation.AnimationListener {
    final /* synthetic */ dmn a;
    private final /* synthetic */ int b;

    public dmm(dmn dmnVar, int i) {
        this.b = i;
        this.a = dmnVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.b) {
            case 0:
                this.a.e.e.setVisibility(8);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i = this.b;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.b) {
            case 0:
                break;
            default:
                this.a.e.e.setVisibility(0);
                break;
        }
    }
}
