package defpackage;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
final class ctp implements LayoutTransition.TransitionListener {
    final /* synthetic */ ctq a;

    public ctp(ctq ctqVar) {
        this.a = ctqVar;
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        cth cthVar = this.a.b.f.p;
        if (cthVar != null) {
            cthVar.a.i(jrl.VIDEO);
        }
        layoutTransition.removeTransitionListener(this);
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        cth cthVar = this.a.b.f.p;
        if (cthVar != null) {
            cthVar.a.l(jrl.VIDEO);
        }
    }
}
