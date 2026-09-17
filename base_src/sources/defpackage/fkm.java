package defpackage;

import android.graphics.drawable.AnimatedVectorDrawable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fkm implements Runnable {
    public final /* synthetic */ AnimatedVectorDrawable a;
    private final /* synthetic */ int b;

    public /* synthetic */ fkm(AnimatedVectorDrawable animatedVectorDrawable, int i) {
        this.b = i;
        this.a = animatedVectorDrawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.a.start();
                break;
            default:
                this.a.start();
                break;
        }
    }
}
