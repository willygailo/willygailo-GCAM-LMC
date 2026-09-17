package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class kfu extends afg {
    private final Semaphore i;
    private final Set j;

    public kfu(Context context, Set set) {
        super(context);
        this.i = new Semaphore(0);
        this.j = set;
    }

    @Override // defpackage.afg
    public final /* bridge */ /* synthetic */ Object a() {
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            throw new UnsupportedOperationException();
        }
        try {
            this.i.tryAcquire(0, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // defpackage.afh
    public final void h() {
        this.i.drainPermits();
        c();
    }
}
