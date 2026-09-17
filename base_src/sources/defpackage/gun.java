package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;

/* JADX INFO: loaded from: classes.dex */
public final class gun extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ OptionsMenuContainer a;

    public gun(OptionsMenuContainer optionsMenuContainer) {
        this.a = optionsMenuContainer;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return this.a.u;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.a.u || motionEvent2.getY() - motionEvent.getY() <= 80.0f || f2 <= 300.0f) {
            return false;
        }
        this.a.w();
        return true;
    }
}
