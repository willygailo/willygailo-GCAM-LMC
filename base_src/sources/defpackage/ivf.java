package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final class ivf {
    public ValueAnimator a;
    public ivh b = ivh.HIDDEN;
    public ivh c = ivh.HIDDEN;
    public final Object d = new Object();

    public final void a(ivh ivhVar) {
        synchronized (this.d) {
            this.c = ivhVar;
            if (this.b.equals(ivhVar)) {
                return;
            }
            this.a.start();
        }
    }
}
