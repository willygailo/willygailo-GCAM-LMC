package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iba implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ Runnable b;
    private final /* synthetic */ int c;

    public /* synthetic */ iba(View view, Runnable runnable, int i) {
        this.c = i;
        this.a = view;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                View view = this.a;
                Runnable runnable = this.b;
                view.getAlpha();
                if (view.getAlpha() == 0.0f) {
                    view.setVisibility(8);
                    runnable.run();
                }
                break;
            default:
                View view2 = this.a;
                Runnable runnable2 = this.b;
                if (view2.getAlpha() == 1.0f) {
                    runnable2.run();
                }
                break;
        }
    }
}
