package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
final class hjp extends Animatable2.AnimationCallback {
    final /* synthetic */ hjs a;

    public hjp(hjs hjsVar) {
        this.a = hjsVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        super.onAnimationEnd(drawable);
        hjs hjsVar = this.a;
        if (hjsVar.b) {
            hjsVar.c.start();
        }
    }
}
