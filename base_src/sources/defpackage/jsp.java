package defpackage;

import android.animation.Animator;

/* JADX INFO: loaded from: classes2.dex */
public final class jsp implements jsj {
    public final pht b;
    private final Animator c;

    public jsp(Animator animator, pht phtVar) {
        this.c = animator;
        this.b = phtVar;
    }

    @Override // defpackage.jsj
    public final pht a() {
        return this.b;
    }

    @Override // defpackage.jsj
    public final void b(jsi jsiVar) {
        plk.af(this.b, new jso(jsiVar), pgr.INSTANCE);
    }

    @Override // defpackage.jsj
    public final void c() {
        this.c.cancel();
    }
}
