package defpackage;

import android.database.Observable;

/* JADX INFO: loaded from: classes2.dex */
public final class pv extends Observable {
    public final void a() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((gd) this.mObservers.get(size)).l();
        }
    }

    public final boolean b() {
        return !this.mObservers.isEmpty();
    }

    public final void c(int i, Object obj) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((gd) this.mObservers.get(size)).m(i, obj);
        }
    }
}
