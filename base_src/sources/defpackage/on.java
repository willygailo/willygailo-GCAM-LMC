package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes2.dex */
final class on implements Runnable {
    final /* synthetic */ or a;

    public on(or orVar) {
        this.a = orVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        or orVar = this.a;
        switch (orVar.q) {
            case 1:
                orVar.p.cancel();
                break;
            case 2:
                break;
            default:
                return;
        }
        orVar.q = 3;
        ValueAnimator valueAnimator = orVar.p;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        orVar.p.setDuration(250L);
        orVar.p.start();
    }
}
