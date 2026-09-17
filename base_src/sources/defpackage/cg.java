package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
final class cg implements View.OnAttachStateChangeListener {
    final /* synthetic */ da a;
    final /* synthetic */ ch b;

    public cg(ch chVar, da daVar) {
        this.b = chVar;
        this.a = daVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        da daVar = this.a;
        bu buVar = daVar.c;
        daVar.d();
        dq.b((ViewGroup) buVar.M.getParent(), this.b.a).c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
