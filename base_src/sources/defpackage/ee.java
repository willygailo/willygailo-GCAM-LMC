package defpackage;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
final class ee implements Runnable {
    final /* synthetic */ Typeface a;
    final /* synthetic */ eg b;

    public ee(eg egVar, Typeface typeface) {
        this.b = egVar;
        this.a = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(this.a);
    }
}
