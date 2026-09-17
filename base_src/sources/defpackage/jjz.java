package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;

/* JADX INFO: loaded from: classes2.dex */
public final class jjz extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ ShutterButton a;

    public jjz(ShutterButton shutterButton) {
        this.a = shutterButton;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        if (this.a.buttonRect.contains(motionEvent.getX(), motionEvent.getY()) && this.a.isClickEnabledAndNotBlocked() && this.a.getMode() != jkc.PHOTO_LONGPRESS_LOCKED) {
            jli jliVar = this.a.listener;
            if (this.a.isLongPressInProgress.compareAndSet(false, true)) {
                this.a.longPressStartMotionEvent = motionEvent;
                if (jliVar != null) {
                    jliVar.onShutterButtonLongPressed();
                }
            }
        }
    }
}
