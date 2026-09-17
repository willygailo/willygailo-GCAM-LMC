package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class muz {
    final List a = new ArrayList();
    public volatile boolean b;

    public final synchronized void a() {
        if (!this.b) {
            this.b = true;
            synchronized (this.a) {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    try {
                        ((mva) it.next()).a();
                    } catch (RuntimeException e) {
                    }
                }
                this.a.clear();
            }
        }
    }
}
