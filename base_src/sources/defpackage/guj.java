package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;
import j$.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class guj extends AnimatorListenerAdapter {
    final /* synthetic */ OptionsMenuContainer a;

    public guj(OptionsMenuContainer optionsMenuContainer) {
        this.a = optionsMenuContainer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Collection.EL.forEach(this.a.l, gui.a);
    }
}
