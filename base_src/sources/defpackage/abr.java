package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class abr implements Runnable {
    private final Callable a;
    private final fb b;
    private final Handler c;

    public abr(Handler handler, Callable callable, fb fbVar) {
        this.a = callable;
        this.b = fbVar;
        this.c = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        abk abkVarCall;
        try {
            abkVarCall = ((abi) this.a).call();
        } catch (Exception e) {
            abkVarCall = null;
        }
        this.c.post(new abq(this.b, abkVarCall));
    }
}
