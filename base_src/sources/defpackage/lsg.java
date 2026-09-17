package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
final class lsg extends ljn {
    private final lmo a;
    private long b;

    public lsg(lmo lmoVar) {
        this.a = lmoVar;
    }

    @Override // defpackage.ljn, defpackage.lkc
    public final void a() {
        this.a.b();
    }

    @Override // defpackage.ljn, defpackage.lkc
    public final void c(lju ljuVar) {
        this.a.a(ljuVar, this.b != 0 ? SystemClock.elapsedRealtimeNanos() - this.b : 0L);
    }

    @Override // defpackage.ljn, defpackage.lkc
    public final void d(lzp lzpVar) {
        this.b = SystemClock.elapsedRealtimeNanos();
    }
}
