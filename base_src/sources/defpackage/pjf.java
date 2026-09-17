package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.geo.lightfield.processing.ProgressCallback;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class pjf extends Handler {
    public final WeakReference a;
    public float b;
    public float c;

    public pjf(ProgressCallback progressCallback, Looper looper) {
        super(looper);
        this.b = 0.0f;
        this.c = 0.0f;
        this.a = new WeakReference(progressCallback);
    }

    public final void a() {
        sendMessageDelayed(obtainMessage(1, 0, 0), 250L);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        float fMax;
        if (message.what == 2) {
            removeMessages(1);
            pjg.a = false;
            Looper.myLooper().quitSafely();
            return;
        }
        ProgressCallback progressCallback = (ProgressCallback) this.a.get();
        if (progressCallback == null) {
            return;
        }
        if ((Float.isNaN(this.c) || this.c == 0.0f) && this.b > 0.0f) {
            fMax = this.b;
            this.c = fMax;
        } else {
            float f = this.b;
            if (f >= 0.99f) {
                fMax = this.b;
                this.c = fMax;
            } else {
                float f2 = ((1.0f - f) * 0.75f) + (0.05f * f);
                float f3 = this.c;
                fMax = Math.max(f3, (f2 * f3) + (f * (1.0f - f2)));
                this.c = fMax;
            }
        }
        progressCallback.setProgress(fMax);
        a();
    }
}
