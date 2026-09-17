package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
final class bh implements aaw {
    final /* synthetic */ View a;
    final /* synthetic */ ViewGroup b;
    final /* synthetic */ bi c;
    final /* synthetic */ dp d;

    public bh(View view, ViewGroup viewGroup, bi biVar, dp dpVar) {
        this.a = view;
        this.b = viewGroup;
        this.c = biVar;
        this.d = dpVar;
    }

    @Override // defpackage.aaw
    public final void a() {
        this.a.clearAnimation();
        this.b.endViewTransition(this.a);
        this.c.b();
        if (cu.Q(2)) {
            String str = "Animation from operation " + this.d + " has been cancelled.";
        }
    }
}
