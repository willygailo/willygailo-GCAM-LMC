package defpackage;

import android.graphics.Rect;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hja implements Runnable {
    protected final hil c;
    protected final Executor d;
    protected final long e;
    protected final hin f;
    protected final hsa g;
    protected final int h;

    public hja(hin hinVar, Executor executor, hil hilVar, int i, hsa hsaVar) {
        this.f = hinVar;
        this.e = hinVar.a.d();
        this.d = executor;
        this.c = hilVar;
        this.h = i;
        this.g = hsaVar;
    }

    public static final Rect h(int i, int i2, Rect rect) {
        if (rect == null) {
            return new Rect(0, 0, i, i2);
        }
        Rect rect2 = new Rect(rect);
        if (rect.top > rect.bottom || rect.left > rect.right || rect.width() <= 0 || rect.height() <= 0) {
            return new Rect(0, 0, 0, 0);
        }
        rect2.left = Math.max(rect2.left, 0);
        rect2.top = Math.max(rect2.top, 0);
        rect2.right = Math.max(Math.min(rect2.right, i), rect2.left);
        rect2.bottom = Math.max(Math.min(rect2.bottom, i2), rect2.top);
        return (rect2.width() <= 0 || rect2.height() <= 0) ? new Rect(0, 0, 0, 0) : rect2;
    }

    public static final Rect i(mad madVar, Rect rect) {
        return h(madVar.c(), madVar.b(), rect);
    }

    public final void j(long j, hix hixVar, int i) {
        ((hia) this.c).k.c(new hiy(j, hixVar, i));
    }
}
