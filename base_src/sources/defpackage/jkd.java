package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;

/* JADX INFO: loaded from: classes2.dex */
public final class jkd extends ViewOutlineProvider {
    final /* synthetic */ ShutterButton a;

    public jkd(ShutterButton shutterButton) {
        this.a = shutterButton;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Rect rect = new Rect();
        this.a.buttonRect.round(rect);
        outline.setRoundRect(rect, this.a.getCurrentSpec().v);
    }
}
