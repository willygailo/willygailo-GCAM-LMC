package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class alf extends gd {
    private final List a = new ArrayList(3);

    private static final void t(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // defpackage.gd
    public final void p(int i) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((gd) it.next()).p(i);
            }
        } catch (ConcurrentModificationException e) {
            t(e);
        }
    }

    @Override // defpackage.gd
    public final void q(int i, float f, int i2) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((gd) it.next()).q(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            t(e);
        }
    }

    @Override // defpackage.gd
    public final void r(int i) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((gd) it.next()).r(i);
            }
        } catch (ConcurrentModificationException e) {
            t(e);
        }
    }

    public final void s(gd gdVar) {
        this.a.add(gdVar);
    }
}
