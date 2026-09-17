package defpackage;

import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
public final class eof implements iho {
    public final enw a;
    private final Application b;

    public eof(Application application, enw enwVar) {
        this.b = application;
        this.a = enwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.registerActivityLifecycleCallbacks(new eoe(this));
    }
}
