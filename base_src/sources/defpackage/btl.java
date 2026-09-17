package defpackage;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class btl implements lie {
    private awr a;

    public btl(Context context) {
        this.a = aws.a(context);
    }

    public final synchronized axa a() {
        awr awrVar;
        awrVar = this.a;
        awrVar.getClass();
        return awrVar.b();
    }

    public final synchronized void b(Handler handler, int i, avw avwVar) {
        awr awrVar = this.a;
        awrVar.getClass();
        try {
            awrVar.e().a(new avr(awrVar, i, handler, avwVar));
        } catch (RuntimeException e) {
            awrVar.c().c(e);
        }
    }

    public final synchronized void c(axg axgVar) {
        awr awrVar = this.a;
        awrVar.getClass();
        awrVar.f(axgVar);
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a = null;
        aws.b();
    }

    public final synchronized void d(boolean z) {
        awr awrVar = this.a;
        awrVar.getClass();
        awrVar.g(z);
    }
}
