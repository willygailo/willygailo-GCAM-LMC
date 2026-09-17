package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
public class ksg extends Handler {
    public ksg() {
    }

    public ksg(Looper looper) {
        super(looper);
    }

    public ksg(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }

    protected void b(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        b(message);
    }
}
