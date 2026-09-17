package defpackage;

import android.os.Looper;
import android.util.Log;
import com.google.geo.lightfield.processing.ProgressCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class pjg implements ProgressCallback {
    public static boolean a = false;
    public final ProgressCallback b;
    public pjf c;
    public Looper d;
    private float e = 0.0f;
    private float f = 1.0f;

    public pjg(ProgressCallback progressCallback) {
        this.b = progressCallback;
    }

    public final void a() {
        pjf pjfVar;
        if (!a || (pjfVar = this.c) == null) {
            return;
        }
        a = false;
        pjfVar.sendMessage(pjfVar.obtainMessage(2));
        try {
            this.d.getThread().join();
        } catch (InterruptedException e) {
            Log.e("ProgressInterpolator", e.getMessage());
        }
        this.c = null;
    }

    @Override // com.google.geo.lightfield.processing.ProgressCallback
    public final void setProgress(float f) {
        pjf pjfVar = this.c;
        if (pjfVar == null) {
            return;
        }
        float f2 = (f * this.f) + this.e;
        pjfVar.b = f2;
        ProgressCallback progressCallback = (ProgressCallback) pjfVar.a.get();
        if (progressCallback != null) {
            progressCallback.setProgress(pjfVar.c);
        }
        if (f2 == 1.0f) {
            a();
        }
    }

    @Override // com.google.geo.lightfield.processing.ProgressCallback
    public final void setRange(float f, float f2) {
        this.e = f;
        this.f = f2 - f;
    }

    @Override // com.google.geo.lightfield.processing.ProgressCallback
    public final boolean wasCancelled() {
        return false;
    }
}
