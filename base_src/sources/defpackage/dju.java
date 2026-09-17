package defpackage;

import com.google.android.apps.camera.debugui.DebugCanvasView;

/* JADX INFO: loaded from: classes.dex */
public final class dju {
    public static final ouj a = ouj.h("com/google/android/apps/camera/debugui/DebugCanvasAdapter");
    public DebugCanvasView b;
    public boolean c = false;

    final void a() {
        DebugCanvasView debugCanvasView = this.b;
        if (debugCanvasView == null) {
            ((oug) ((oug) a.c()).G((char) 793)).o("UI view not yet initialized");
        } else {
            debugCanvasView.invalidate();
        }
    }

    public final void b(DebugCanvasView debugCanvasView) {
        this.b = debugCanvasView;
        if (debugCanvasView != null) {
            debugCanvasView.setVisibility(4);
        }
    }
}
