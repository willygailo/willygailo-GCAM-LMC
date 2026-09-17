package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.SurfaceHolder;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class jip implements jio {
    final /* synthetic */ fyr a;

    public jip() {
    }

    public jip(fyr fyrVar) {
        this.a = fyrVar;
    }

    @Override // defpackage.jio
    public final GestureDetector.OnGestureListener a() {
        return null;
    }

    @Override // defpackage.jio
    public final View.OnTouchListener b() {
        return this.a.M;
    }

    @Override // defpackage.jio
    public final void c() {
        this.a.G();
    }

    @Override // defpackage.jio
    public final boolean d() {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        jil jilVar;
        fyr fyrVar = this.a;
        if (fyrVar.I != null) {
            ((oug) ((oug) fyr.b.c()).G((char) 1983)).o("onCameraAvailable queued before onSurfaceTextureAvailable");
            return;
        }
        fyrVar.w = i;
        fyrVar.x = i2;
        fyrVar.w();
        this.a.s.g().b();
        bvk bvkVar = (bvk) this.a.s.g();
        SurfaceTexture surfaceTexture2 = bvkVar.s;
        if (surfaceTexture2 == null || (jilVar = bvkVar.q) == null) {
            ((oug) ((oug) bvk.a.c()).G((char) 132)).o("Could not set SurfaceTexture default buffer dimensions, not yet setup");
        } else {
            surfaceTexture2.setDefaultBufferSize(jilVar.b(), bvkVar.q.a());
        }
        this.a.s.g().h(false);
        fyr fyrVar2 = this.a;
        fyrVar2.I = new dyi(surfaceTexture, fyrVar2.H, fyrVar2);
        fyr fyrVar3 = this.a;
        if (fyrVar3.i != null) {
            fyrVar3.F();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.a.E();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        fyr fyrVar = this.a;
        fyrVar.w = i;
        fyrVar.x = i2;
        Handler handler = fyrVar.H;
        if (handler != null) {
            handler.obtainMessage(2, i, i2).sendToTarget();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        throw new IllegalStateException("Module does NOT support Surface-backed Preview.");
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        throw new IllegalStateException("Module does NOT support Surface-backed Preview.");
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        throw new IllegalStateException("Module does NOT support Surface-backed Preview.");
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        throw new IllegalStateException("Module does NOT support Surface-backed Preview.");
    }
}
