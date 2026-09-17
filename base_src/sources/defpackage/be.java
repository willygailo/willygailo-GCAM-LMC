package defpackage;

import android.animation.Animator;

/* JADX INFO: loaded from: classes.dex */
final class be implements aaw {
    final /* synthetic */ Animator a;
    final /* synthetic */ dp b;

    public be(Animator animator, dp dpVar) {
        this.a = animator;
        this.b = dpVar;
    }

    @Override // defpackage.aaw
    public final void a() {
        this.a.end();
        if (cu.Q(2)) {
            String str = "Animator from operation " + this.b + " has been canceled.";
        }
    }
}
