package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class oaq extends AnimatorListenerAdapter {
    final /* synthetic */ oas a;

    public oaq(oas oasVar) {
        this.a = oasVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
        oas oasVar = this.a;
        List list = oasVar.f;
        if (list == null || oasVar.g) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ga) it.next()).j();
        }
    }
}
