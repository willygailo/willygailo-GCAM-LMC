package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;

/* JADX INFO: loaded from: classes.dex */
public final class ehl extends GLSurfaceView {
    public ehk a;

    public ehl(Context context) {
        super(context);
        this.a = null;
    }

    @Override // android.view.SurfaceView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        surfaceChanged(getHolder(), 3, getWidth(), getHeight());
        ehk ehkVar = this.a;
        if (ehkVar != null) {
            ehkVar.a();
        }
    }
}
