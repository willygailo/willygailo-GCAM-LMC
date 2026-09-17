package defpackage;

import android.media.MediaRecorder;

/* JADX INFO: loaded from: classes2.dex */
final class lhf implements MediaRecorder.OnInfoListener {
    final /* synthetic */ lhg a;
    private boolean b;
    private boolean c;

    public lhf(lhg lhgVar) {
        this.a = lhgVar;
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public final void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        if (i == 801) {
            if (this.c) {
                return;
            }
            this.c = true;
            this.a.a.h();
            return;
        }
        if (i == 800) {
            if (this.b) {
                return;
            }
            this.b = true;
            this.a.a.f();
            return;
        }
        if (i == 802) {
            this.a.a.g();
        } else if (i == 803) {
            this.a.a.i();
        }
    }
}
