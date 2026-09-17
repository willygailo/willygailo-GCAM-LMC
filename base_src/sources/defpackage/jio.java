package defpackage;

import android.view.GestureDetector;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public interface jio extends TextureView.SurfaceTextureListener, SurfaceHolder.Callback2 {
    GestureDetector.OnGestureListener a();

    View.OnTouchListener b();

    void c();

    boolean d();
}
