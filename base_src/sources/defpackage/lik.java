package defpackage;

import com.SDE.LibPatcher;

/* JADX INFO: loaded from: classes2.dex */
public final class lik {
    final String a;
    private boolean b = false;

    public lik(String str) {
        this.a = str;
    }

    public final synchronized boolean a() {
        return this.b;
    }

    public final synchronized void b() {
        if (!this.b) {
            LibPatcher.loadLibX(this.a);
            this.b = true;
        }
    }
}
