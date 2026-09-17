package defpackage;

import android.graphics.SurfaceTexture;
import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes.dex */
final class awi implements Runnable {
    final /* synthetic */ SurfaceTexture a;
    final /* synthetic */ awl b;

    public awi(awl awlVar, SurfaceTexture surfaceTexture) {
        this.b = awlVar;
        this.a = surfaceTexture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c().obtainMessage(R.styleable.AppCompatTheme_switchStyle, this.a).sendToTarget();
    }
}
