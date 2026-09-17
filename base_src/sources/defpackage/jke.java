package defpackage;

import android.os.Handler;
import android.os.Message;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class jke extends Handler {
    private final WeakReference a;

    public jke(ShutterButton shutterButton) {
        this.a = new WeakReference(shutterButton);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ShutterButton shutterButton = (ShutterButton) this.a.get();
        if (shutterButton == null) {
            return;
        }
        switch (message.what) {
            case 1000:
                ShutterButton.progressState = jkf.STATE_RESUME;
                removeMessages(1001);
                shutterButton.updateAnimationProgressIndex(ShutterButton.progressState);
                return;
            case 1001:
                if (!hasMessages(1002)) {
                    ShutterButton.progressState = jkf.STATE_PAUSE;
                    shutterButton.updateAnimationProgressIndex(ShutterButton.progressState);
                    return;
                } else {
                    removeMessages(1001);
                    ShutterButton.progressState = jkf.STATE_PAUSE;
                    shutterButton.updateAnimationProgressIndex(ShutterButton.progressState);
                    return;
                }
            case 1002:
                ShutterButton.progressState = jkf.STATE_UPDATED;
                removeMessages(1001);
                shutterButton.updateAnimationProgressIndex(ShutterButton.progressState);
                return;
            default:
                int i = message.what;
                StringBuilder sb = new StringBuilder(36);
                sb.append("Not supported state msg: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
