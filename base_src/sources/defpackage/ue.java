package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ue {
    public final ArrayDeque a;
    private final Runnable b;

    public ue() {
        this(null);
    }

    public ue(Runnable runnable) {
        this.a = new ArrayDeque();
        this.b = runnable;
    }

    public final void a() {
        Iterator itDescendingIterator = this.a.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            uc ucVar = (uc) itDescendingIterator.next();
            if (ucVar.a) {
                cu cuVar = ucVar.c;
                cuVar.Y(true);
                if (cuVar.e.a) {
                    cuVar.T();
                    return;
                } else {
                    cuVar.d.a();
                    return;
                }
            }
        }
        this.b.run();
    }
}
