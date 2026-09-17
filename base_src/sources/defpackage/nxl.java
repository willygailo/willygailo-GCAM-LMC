package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: loaded from: classes2.dex */
final class nxl implements Runnable {
    final /* synthetic */ SwipeDismissBehavior a;
    private final View b;

    public nxl(SwipeDismissBehavior swipeDismissBehavior, View view) {
        this.a = swipeDismissBehavior;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        acb acbVar = this.a.a;
        if (acbVar == null || !acbVar.l()) {
            return;
        }
        gl.A(this.b, this);
    }
}
