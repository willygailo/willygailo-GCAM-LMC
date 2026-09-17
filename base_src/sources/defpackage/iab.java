package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import com.google.android.apps.camera.smarts.SmartsUiGleamingView;

/* JADX INFO: loaded from: classes2.dex */
public final class iab extends Animatable2.AnimationCallback {
    final /* synthetic */ SmartsUiGleamingView a;

    public iab(SmartsUiGleamingView smartsUiGleamingView) {
        this.a = smartsUiGleamingView;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        super.onAnimationEnd(drawable);
        this.a.a();
    }
}
