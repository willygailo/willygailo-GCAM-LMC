package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
final class imi implements View.OnSystemUiVisibilityChangeListener {
    final /* synthetic */ imj a;

    public imi(imj imjVar) {
        this.a = imjVar;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        int systemUiVisibility = this.a.a.getDecorView().getSystemUiVisibility();
        imj imjVar = this.a;
        if ((systemUiVisibility ^ imjVar.c) == 0 || imjVar.b) {
            return;
        }
        imjVar.e();
    }
}
