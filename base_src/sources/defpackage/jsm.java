package defpackage;

import android.animation.Animator;

/* JADX INFO: loaded from: classes2.dex */
public final class jsm implements jsk {
    private final Animator b;

    public jsm(Animator animator) {
        this.b = animator;
    }

    @Override // defpackage.jsk
    public final jsj a() {
        pih pihVarF = pih.f();
        this.b.addListener(new jsl(pihVarF));
        this.b.start();
        return new jsp(this.b, pihVarF);
    }

    @Override // defpackage.jsk
    public final void b(Animator.AnimatorListener animatorListener) {
        this.b.addListener(animatorListener);
    }
}
