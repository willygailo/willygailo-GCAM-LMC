package defpackage;

import android.graphics.SurfaceTexture;
import android.view.GestureDetector;
import android.view.SurfaceHolder;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class jij implements jio {
    @Override // defpackage.jio
    public final GestureDetector.OnGestureListener a() {
        return new GestureDetector.SimpleOnGestureListener();
    }

    @Override // defpackage.jio
    public final View.OnTouchListener b() {
        return null;
    }

    @Override // defpackage.jio
    public final void c() {
    }

    @Override // defpackage.jio
    public final boolean d() {
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }
}
