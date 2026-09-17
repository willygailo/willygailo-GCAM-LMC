package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class lbv implements lbu {
    @Override // defpackage.lbu
    public final void a(lie lieVar) {
        lieVar.close();
    }

    @Override // defpackage.lbu
    public final void b(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ((lie) it.next()).close();
        }
    }
}
