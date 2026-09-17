package defpackage;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eqo implements Runnable {
    public final /* synthetic */ pih a;
    private final /* synthetic */ int b;

    public /* synthetic */ eqo(pih pihVar, int i) {
        this.b = i;
        this.a = pihVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.a.o(true);
                break;
            case 1:
                Choreographer.getInstance().postFrameCallback(new hoq(this.a, 1));
                break;
            case 2:
                this.a.o(true);
                break;
            default:
                this.a.o(new Object());
                break;
        }
    }
}
