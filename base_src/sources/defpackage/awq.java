package defpackage;

import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class awq {
    public final Object b = new Object();
    public final Runnable a = new awp(this);

    static void a(Message message) {
        if (message != null && (message.obj instanceof awq)) {
            ((awq) message.obj).a.run();
        }
    }
}
