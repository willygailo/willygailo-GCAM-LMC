package defpackage;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
final class abb implements Runnable {
    final /* synthetic */ abn a;
    final /* synthetic */ Typeface b;

    public abb(abn abnVar, Typeface typeface) {
        this.a = abnVar;
        this.b = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        abn abnVar = this.a;
        Typeface typeface = this.b;
        eg egVar = abnVar.a;
        if (egVar != null) {
            egVar.a(typeface);
        }
    }
}
