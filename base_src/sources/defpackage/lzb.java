package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class lzb {
    public final OrientationEventListener d;
    public final Executor e;
    public final lis f;
    public int h;
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final Object c = new Object();
    public lic g = lic.CLOCKWISE_0;

    public lzb(Context context, Executor executor, lis lisVar) {
        this.e = executor;
        this.d = new lza(this, context);
        this.f = lisVar.a("DeviceOrientation");
    }

    public final lic a() {
        lic licVar;
        synchronized (this.c) {
            licVar = this.g;
        }
        return licVar;
    }

    public final synchronized void b(lyy lyyVar) {
        synchronized (this.c) {
            if (this.a.contains(lyyVar)) {
                return;
            }
            this.a.add(lyyVar);
        }
    }

    public final void c(lyy lyyVar) {
        synchronized (this.c) {
            if (!this.a.remove(lyyVar)) {
                this.f.g("Removing non-existing listener.");
            }
        }
    }
}
