package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public class axg {
    public final axf a;
    private final Handler b;

    public axg(Handler handler) {
        this.a = new axb();
        this.b = handler;
    }

    public axg(axf axfVar, Handler handler) {
        this.b = handler;
        this.a = axfVar;
    }

    public void a(int i) {
        this.b.post(new axc(this, i));
    }

    public void b(RuntimeException runtimeException, String str, int i, int i2) {
        this.b.post(new axd(this, runtimeException, str, i, i2));
    }

    public void c(RuntimeException runtimeException) {
        this.b.post(new axe(this, runtimeException));
    }
}
